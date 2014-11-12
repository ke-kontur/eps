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
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDDocument;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.schemas.album.ed_container.EDContainerType;

/**
 * TODO: Странное наследование
 */
public class MessageCMN11090BusinessProcess extends MessageCMN11076BusinessProcess
{

	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{

		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );

		checkGtdObligation( jobBatchContext, recvEnv );

		EDContainerType incomingContainer = recvEnv.getDocument( ).getDocumentAsClass( EDContainerType.class ); 

		// проверка самого контейнера
		checkContainerDocument( incomingContainer, recvEnv, jobBatchContext );

		// проверка вложенных документов
		checkInnerDocuments( incomingContainer, recvEnv, jobBatchContext );

		// формируем ответное сообщение
		EDEnvelope respEnvelope = EnvelopeCreator.createTranzitMessage( 
			null, recvEnv, 
			BusinessSystems.CUSTOMS, recvEnv.getReceiverCustoms( ) 
		);

		String envelopeName = jobContext.getString( ContextConstants.ENVELOPE_NAME );
		jobBatchContext.put( envelopeName, respEnvelope );

		/*
		 * Сохраняем новые статусы контейнера и документов
		 */
		List< Edecl_Msg_Doc > savedIncomingContainerDocs = _serviceHolder
			.getEnvelopeService( ).getContainerDocuments( incomingContainer.getDocumentID( ) );

		Edecl_Msg_Doc containerDoc = _serviceHolder.getEnvelopeService( )
			.getDocument( incomingContainer.getDocumentID( ) );
		
		containerDoc.setState( DocumentStates.WAITABLE );
		_serviceHolder.getEnvelopeService( ).merge( containerDoc );

		for ( Edecl_Msg_Doc doc : savedIncomingContainerDocs )
		{
			doc.setRefMainDoc( incomingContainer.getDocumentID( ) );
			doc.setState( DocumentStates.WAITABLE );
			_serviceHolder.getEnvelopeService( ).merge( doc );
		}

		Edecl_Substatus_State substatusState = new Edecl_Substatus_State( );
		substatusState.setDocumentId( recvEnv.getDocument( ).getDocumentID( ) );
		substatusState.setProcessId( recvEnv.getProcessID( ) );
		substatusState.setStCode( "GTD_EDITING" );
		_serviceHolder.getProcedureService( ).persist( substatusState );

	}

	/**
	 * проверка документа-контейнера
	 * @throws DatabaseException 
	 */
	private void checkContainerDocument( 
			EDContainerType incomingContainer, 
			EDEnvelope recvEnv, EDJobBatchContext jobBatchContext ) 
		throws ResultTypeException, DatabaseException
	{

		String containerRefDocId = incomingContainer.getRefDocumentID( );

		if ( null == containerRefDocId || containerRefDocId.isEmpty( ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._03_00027_01, 
				ProcessingConstants.ERROR_TYPE_CHECK 
			);
		}

		Edecl_Msg_Doc refContainer = _serviceHolder.getEnvelopeService( )
			.getDocument( containerRefDocId );

		if ( ! refContainer.getState( ).equalsIgnoreCase( DocumentStates.CURRENT ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._03_00027_08, 
				ProcessingConstants.ERROR_TYPE_CHECK 
			);
		}

		if ( !incomingContainer.getDocumentModeID( ).equalsIgnoreCase(
				refContainer.getDocumentModeId( ) ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._03_00106_01, 
				ProcessingConstants.ERROR_TYPE_CHECK 
			);
		}
	}

	/**
	 * проверка вложенных документов
	 * @throws DatabaseException 
	 */
	private void checkInnerDocuments( 
			EDContainerType incomingContainer, 
			EDEnvelope recvEnv, EDJobBatchContext jobBatchContext ) 
		throws ResultTypeException, DatabaseException
	{
		for ( String cDocId : recvEnv.getDocument( ).getContainerDocuments( ).keySet( ) )
		{
			EDDocument cdoc = recvEnv.getDocument( ).getDocumentInContainer( cDocId );

			String refDocId = cdoc.getRefDocumentID( );
			
			if ( null == refDocId || refDocId.isEmpty( ) )
			{
				ErrorHelper.throwException( 
					jobBatchContext, 
					ResultCodes._03_00027_01, 
					ProcessingConstants.ERROR_TYPE_CHECK 
				);
			}

			Edecl_Msg_Doc refDoc = _serviceHolder.getEnvelopeService( ).getDocument( refDocId );
			if ( ! refDoc.getState( ).equalsIgnoreCase( DocumentStates.CURRENT ) )
			{
				ErrorHelper.throwException( 
					jobBatchContext, 
					ResultCodes._03_00027_08, 
					ProcessingConstants.ERROR_TYPE_CHECK 
				);
			}

			String docModeId = cdoc.getDocumentModeID( );

			if ( ! docModeId.equalsIgnoreCase( refDoc.getDocumentModeId( ) ) )
			{
				ErrorHelper.throwException( 
					jobBatchContext, 
					ResultCodes._03_00016_01, 
					ProcessingConstants.ERROR_TYPE_CHECK
				);
			}
		}
	}
}
