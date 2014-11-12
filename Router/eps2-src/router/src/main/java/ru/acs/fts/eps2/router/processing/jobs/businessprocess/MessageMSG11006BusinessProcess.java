package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.data.kind.DocumentStates;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
import ru.acs.fts.eps2.model.entities.Edecl_Substatus_State;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.defines.SpecialProcedureSubStates;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.utils.StringUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Перечень ошибок, выявленных в процессе проведения логического 
 * контроля сведений, заявленных в электронной форме документа
 */
public class MessageMSG11006BusinessProcess extends BusinessProcess
{	
	
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		List< EDEnvelope > envelopes = createAndPutEnvelopes( jobBatchContext, jobContext );
		
		checkSubStatuses( recvEnv, jobBatchContext );
		checkRefDocsStatuses( recvEnv, jobBatchContext );
		
		Map< String, String > messageTypeSubstituion = new HashMap< String, String >( );
		messageTypeSubstituion.put( MessageType.MSG_11006, MessageType.ED_11005 );
		
		EDEnvelope ed11005 = EnvelopeCreator.createTranzitMessage( 
			messageTypeSubstituion, recvEnv, 
			BusinessSystems.DECLARANT, null 
		);
		
		envelopes.add( ed11005 );
	}
	
	private void checkSubStatuses( EDEnvelope recvEnv, EDJobBatchContext jobBatchContext ) 
		throws ResultTypeException, DatabaseException
	{
		String processId = recvEnv.getProcessID( );
		
		List< Edecl_Substatus_State > substatuses = 
			_serviceHolder.getProcedureService( ).getProcSubStatuses( processId );
		
		if ( substatuses.size( ) > 1 )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._03_00042_01, 
				ProcessingConstants.ERROR_TYPE_CHECK 
			);
		}
		
		if ( substatuses.size( ) == 1 )
		{
			Edecl_Substatus_State substatus = substatuses.get( 0 );
			if ( SpecialProcedureSubStates.GTD_EDITING.equals( substatus.getStCode( ) ) )
			{
				_serviceHolder.getProcedureService( ).remove( substatus );
			}
		}
	}
	
	private void checkRefDocsStatuses( EDEnvelope recvEnv, EDJobBatchContext jobBatchContext ) 
		throws DatabaseException, ResultTypeException
	{
		String refDocumentId = recvEnv.getDocument( ).getRefDocumentID( );

		/**
		 * Не проверяем, т.к. проверили уже в джобе до
		 * Но страхуемся от NullPointerException  
		 */
		if ( StringUtil.isNullOrEmpty( refDocumentId ) )
			return ;
		
		Edecl_Msg_Doc refContainer = 
			_serviceHolder.getEnvelopeService( ).getDocument( refDocumentId );
		
		/**
		 * Не проверяем, т.к. проверили уже в джобе до
		 * Но страхуемся от NullPointerException
		 */
		if ( null == refContainer )
			return ;
		
		if ( refContainer.getState( ).equalsIgnoreCase( DocumentStates.WAITABLE ) )
		{
			refContainer.setState( DocumentStates.NOTCHANGEABLE );
			_serviceHolder.getEnvelopeService( ).merge( refContainer );
			
			List< Edecl_Msg_Doc > cntDocs = _serviceHolder.getEnvelopeService( )
				.getContainerDocuments( refDocumentId );
			
			for ( Edecl_Msg_Doc cntDoc : cntDocs )
			{
				cntDoc.setState( DocumentStates.NOTCHANGEABLE );
				_serviceHolder.getEnvelopeService( ).merge( cntDoc );
			}
		}
		else if ( refContainer.getState( ).equalsIgnoreCase( DocumentStates.CURRENT ) )
		{
			// не делаем ничего - все хорошо
		}
		else
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._03_00027_11, 
				ProcessingConstants.ERROR_TYPE_CHECK 
			);
		}
	}
}
