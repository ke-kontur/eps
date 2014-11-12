package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.List;

import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.kind.DocumentStates;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
import ru.acs.fts.eps2.model.entities.Edecl_Substatus_State;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.defines.SpecialProcedureSubStates;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;

public class MessageCMN11014BusinessProcess extends BusinessProcess
{

	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );

		/*
		Object obj = envelope.getBody( ).getAnyList( ).get( 0 );
		if ( obj instanceof SignatureType )
		{
			SignatureType signature = ( SignatureType )obj;
			obj = signature.getObject( ).getAny( );
		}
		*/

		/**
		 * Для документа, идентификатор которого указан в поле &lt;RefDocumentID&gt; в
		 * сообщении CMN.11014 проверяется наличие записи со статусом «GTD_EDITING» в 
		 * таблице EDECL_SUBSTATUS_STATE. В случае, если такая запись отсутствует, то 
		 * отправителю возвращается информация об ошибке.
		 */
		String currentDocId = recvEnv.getDocument( ).getRefDocumentID( );
		List< Edecl_Substatus_State > subStates = 
			_serviceHolder.getProcedureService( ).getProcSubstatuses( currentDocId, SpecialProcedureSubStates.GTD_EDITING );
		
		if ( subStates.isEmpty( ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._03_00041_01, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}

		/** 
		 * По значению RefDocumentID вложенного в CMN.11014 документа находим
		 * документ-контейнер исходного запроса на внесение изменений (запросом
		 * может быть одно из сообщений CMN.11025, CMN.11048, CMN.11026).
		 */
		Edecl_Msg_Doc currentContainerDoc = 
			_serviceHolder.getEnvelopeService( ).getDocument( currentDocId );

		/** 
		 * В поле DOC_STATE для найденного документа-контейнера и всех вложенных
		 * в него документов значение WAITABLE заменяется на CURRENT. Иными
		 * словами – делаем комплект документов, ожидающий решения актуальным.
		 */
		currentContainerDoc.setState( DocumentStates.CURRENT );
		_serviceHolder.getEnvelopeService( ).merge( currentContainerDoc );

		List< Edecl_Msg_Doc > currentInnerDocs = _serviceHolder.getEnvelopeService( )
			.getContainerDocuments( currentDocId );
		
		for ( Edecl_Msg_Doc doc : currentInnerDocs )
		{
			doc.setState( DocumentStates.CURRENT );
			_serviceHolder.getEnvelopeService( ).merge( doc );
		}

		changePreviousContainerStates( 
			currentContainerDoc.getRefDocumentId( ), currentInnerDocs 
		);

		/** 
		 * В БД АПС «ЭПС» для данной процедуры удаляется запись-субстатус
		 * (таблица EDECL_SUBSTATUS_STATE) в которой :
		 * В поле SUBST_ST_DOCUMENTID указано значение RefDocumentID вложенного
		 * документа сообщения CMN.11014;
		 * В поле SUBST_ST_PROCESSID указано значение идентификатора процедуры;
		 * В поле SUBST_ST_STCODE указано значение «GTD_EDITING».
		 */
		List< Edecl_Substatus_State > subStatesToDelete = 
			_serviceHolder.getProcedureService( ).getProcSubstatuses(
				recvEnv.getProcessID( ), currentDocId, "GTD_EDITING" );

		if ( ! subStatesToDelete.isEmpty( ) )
		{
			// Он должен быть один
			_serviceHolder.getProcedureService( ).remove( subStatesToDelete.get( 0 ) );
		}

		// формируем транзитное сообщение
		EDEnvelope respEnvelope = EnvelopeCreator.createTranzitMessage( 
			null, recvEnv, 
			BusinessSystems.DECLARANT, recvEnv.getReceiverCustoms( )
		);

		String envelopeName = jobContext.getString( ContextConstants.ENVELOPE_NAME );
		jobBatchContext.put( envelopeName, respEnvelope );
	}

	/**
	 * По значению RefDocumentID документа-контейнера (а также каждого
	 * вложенного в контейнер документа), вложенного в сообщение
	 * CMN.11025(CMN.11048, CMN.11026) в таблице EDECL_MESSAGES находим
	 * документы, у которых стоит пометка CURENT в поле DOC_STATE. У тех
	 * документов, которые были удалены - значение CURRENT изменяется на
	 * DELETED. У тех документов, которые были изменены - значение CURRENT
	 * изменяется на CHANGED. Иными словами – делаем предыдущий комплект
	 * документов – устаревшим, измененным.
	 */
	private void changePreviousContainerStates( 
			String previousContainerId, List< Edecl_Msg_Doc > currentInnerDocs ) 
		throws DatabaseException
	{

		Edecl_Msg_Doc previousContainerDoc = _serviceHolder.getEnvelopeService( ).getDocument( previousContainerId );
		
		previousContainerDoc.setState( DocumentStates.CHANGED );
		_serviceHolder.getEnvelopeService( ).merge( previousContainerDoc );

		List< Edecl_Msg_Doc > previousInnerDocs = _serviceHolder.getEnvelopeService( )
			.getContainerDocuments( previousContainerId );
		
		for ( Edecl_Msg_Doc doc : previousInnerDocs )
		{

			boolean found = false;
			for ( Edecl_Msg_Doc prevDoc : currentInnerDocs )
			{
				if ( prevDoc.getDocumentID( ).equalsIgnoreCase( doc.getDocumentID( ) ) )
				{
					found = true;
					break;
				}
			}

			if ( found )
			{
				doc.setState( DocumentStates.CHANGED );
			}
			else
			{
				doc.setState( DocumentStates.DELETED );
			}
			
			_serviceHolder.getEnvelopeService( ).merge( doc );
		}
	}

}
