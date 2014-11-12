package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.kind.DocumentStates;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edecl_Messages;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
import ru.acs.fts.eps2.model.entities.Edecl_Substatus_State;
import ru.acs.fts.eps2.router.defines.SpecialProcedureSubStates;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;

/**
 * Бизнес процесс для обработки сообщения CMN.10003 ( Отказ в запрашиваемых
 * действиях Декларанта )
 */
public class MessageCMN10003BusinessProcess extends BusinessProcess
{
	@Override
	@SuppressWarnings( "unchecked" )
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		Map< String, String > businessProcessRules = new Hashtable< String, String >(
			( Map< String, String > )jobContext.get( "businessProcessRules" ) 
		);

		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );

		String containerDocId = recvEnv.getDocument( ).getRefDocumentID( );
		
		/** 
		 * определяем MessageType сообщений по RefDocumentID контейнера
		 * и в зависимости от MessageType выбираем обработку
		 */
		// 
		Edecl_Messages refEnvelope = _serviceHolder.getEnvelopeService( )
			.getEnvelopeByDocumentId( containerDocId );

		if ( null == refEnvelope )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._03_00027_02, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}

		String messageType = refEnvelope.getMessageType( );

		String businessProcessRule = null;
		for ( String key : businessProcessRules.keySet( ) )
		{
			if ( key.equalsIgnoreCase( messageType ) )
			{
				businessProcessRule = businessProcessRules.get( key );
				break;
			}
		}

		if ( null == businessProcessRule || businessProcessRule.isEmpty( ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._09_96669_99, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}

		if ( businessProcessRule.equalsIgnoreCase( SpecialProcedureSubStates.GTD_RECALLING ) )
		{
			gtdRecallingProcess( recvEnv, jobBatchContext );
		}
		else if ( businessProcessRule.equalsIgnoreCase( SpecialProcedureSubStates.GTD_EDITING ) )
		{
			gtdEditingProcess( recvEnv, containerDocId, jobBatchContext );
		}
		else
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._09_96669_99, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}

	}

	private void gtdRecallingProcess( EDEnvelope recvEnv, EDJobBatchContext jobBatchContext ) 
		throws ResultTypeException, DatabaseException
	{
		String processId = recvEnv.getProcessID( );

		List< Edecl_Substatus_State > substatuses = _serviceHolder
			.getProcedureService( ).getProcSubStatuses( processId );
		
		boolean found = false;
		for ( Edecl_Substatus_State substatus : substatuses )
		{
			if ( substatus.getStCode( ).equalsIgnoreCase( SpecialProcedureSubStates.GTD_RECALLING ) )
			{
				found = true;
				break;
			}
		}

		if ( ! found )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._03_00019_01, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}

		for ( Edecl_Substatus_State substatus : substatuses )
		{
			if ( substatus.getStCode( ).equalsIgnoreCase( SpecialProcedureSubStates.GTD_RECALLING ) && 
				 substatus.getProcessId( ).equalsIgnoreCase( recvEnv.getProcessID( ) ) && 
				 substatus.getDocumentId( ).equalsIgnoreCase( recvEnv.getDocument( ).getRefDocumentID( ) ) )
			{
				_serviceHolder.getProcedureService( ).remove( substatus );
				break;
			}
		}

	}

	private void gtdEditingProcess( EDEnvelope recvEnv, String containerDocId, EDJobBatchContext jobBatchContext ) 
		throws ResultTypeException, DatabaseException
	{
		List< Edecl_Substatus_State > subStates = _serviceHolder.getProcedureService( )
			.getProcSubstatuses( containerDocId, SpecialProcedureSubStates.GTD_EDITING );

		if ( subStates.isEmpty( ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._03_00041_01, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}

		/** 
		 * В поле DOC_STATE для документа-контейнера с идентификатором
		 * RefDocumentID и вложенных в контейнер документов значение 'WAITABLE'
		 * заменяется на 'NOTCHANGEABLE'.
		 */
		Edecl_Msg_Doc currentContainerDoc = _serviceHolder.getEnvelopeService( )
			.getDocument( containerDocId );
		
		currentContainerDoc.setState( DocumentStates.NOTCHANGEABLE );
		_serviceHolder.getEnvelopeService( ).merge( currentContainerDoc );

		List< Edecl_Msg_Doc > innerDocs = _serviceHolder.getEnvelopeService( )
			.getContainerDocuments( containerDocId );
		
		for ( Edecl_Msg_Doc doc : innerDocs )
		{
			doc.setState( DocumentStates.NOTCHANGEABLE );
			_serviceHolder.getEnvelopeService( ).merge( doc );
		}

		String procId = recvEnv.getProcessID( );
		for ( Edecl_Substatus_State subStatus : subStates )
		{
			if ( procId.equalsIgnoreCase( subStatus.getProcessId( ) ) )
			{
				_serviceHolder.getProcedureService( ).remove( subStatus );
				break;
			}
		}
	}
}
