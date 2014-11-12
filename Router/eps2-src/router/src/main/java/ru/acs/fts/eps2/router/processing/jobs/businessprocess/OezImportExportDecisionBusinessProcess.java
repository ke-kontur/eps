package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.data.kind.DocumentModeIDs;
import ru.acs.fts.eps2.engine.data.kind.DocumentStates;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edecl_Messages;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.utils.StringUtil;

/**
 * Бизнес процесс для обработки сообщения CMN.10065, CMN.10069
 */
public class OezImportExportDecisionBusinessProcess extends BusinessProcess
{
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		Edecl_Messages initialEnvelope = checkInitialEnvelopeId( recvEnv, jobBatchContext );
		String messageType = initialEnvelope.getMessageType( );
		
		boolean isForContainer = false;
		if ( recvEnv.getMessageType( ).equals( MessageType.CMN_10065 ) )
		{
			/*
			isForContainer = messageType.equals( MessageType.CMN_10063 ) ||
					 		 messageType.equals( MessageType.CMN_10064 );
			*/
			isForContainer = true;
		}
		else if ( recvEnv.getMessageType( ).equals( MessageType.CMN_10069 ) )
		{
			/*
			isForContainer = messageType.equals( MessageType.CMN_10067 ) ||
							 messageType.equals( MessageType.CMN_10068 );
			*/
			isForContainer = true;
		}
		
		if ( isForContainer )
		{
			String refDocumentId = recvEnv.getDocument( ).getRefDocumentID( );
			if ( StringUtil.isNullOrEmpty( refDocumentId ) )
			{
				ErrorHelper.throwException( 
					jobBatchContext, 
					ResultCodes._03_00027_02, 
					ProcessingConstants.ERROR_TYPE_CHECK 
				);
			}
			
			Edecl_Msg_Doc refDoc = _serviceHolder.getEnvelopeService( ).getDocument( refDocumentId );
			if ( null == refDoc )
			{
				ErrorHelper.throwException( 
					jobBatchContext, 
					ResultCodes._03_00027_02, 
					ProcessingConstants.ERROR_TYPE_CHECK 
				);
			}
			
			if ( ! refDoc.getDocumentModeId( ).equalsIgnoreCase( DocumentModeIDs.ED_CONTAINER ) ||
				 ! refDoc.getState( ).equalsIgnoreCase( DocumentStates.CURRENT ) )
			{
				ErrorHelper.throwException( 
					jobBatchContext, 
					ResultCodes._03_00027_02, 
					ProcessingConstants.ERROR_TYPE_CHECK 
				);			
			}
		}
		else if ( messageType.equalsIgnoreCase( MessageType.CMN_10066 ) )
		{
			String refDocumentId = recvEnv.getDocument( ).getRefDocumentID( );
			if ( StringUtil.isNullOrEmpty( refDocumentId ) )
			{
				ErrorHelper.throwException( 
					jobBatchContext, 
					ResultCodes._03_00027_02, 
					ProcessingConstants.ERROR_TYPE_CHECK 
				);
			}
			
			Edecl_Msg_Doc refDoc = _serviceHolder.getEnvelopeService( ).getDocument( refDocumentId );
			if ( null == refDoc )
			{
				ErrorHelper.throwException( 
					jobBatchContext, 
					ResultCodes._03_00027_02, 
					ProcessingConstants.ERROR_TYPE_CHECK 
				);
			}
			
			if ( ! refDoc.getDocumentModeId( ).equalsIgnoreCase( DocumentModeIDs.OEZ_PERMIT_APPLICATION ) )
			{
				ErrorHelper.throwException( 
					jobBatchContext, 
					ResultCodes._03_00027_02, 
					ProcessingConstants.ERROR_TYPE_CHECK 
				);			
			}			
		}
		else
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._03_00028_01, 
				ProcessingConstants.ERROR_TYPE_CHECK 
			);			
		}
	}
	
	private Edecl_Messages checkInitialEnvelopeId( EDEnvelope recvEnv, EDJobBatchContext jobBatchContext ) 
		throws ResultTypeException, DatabaseException
	{
		String initialEnvelopeId = recvEnv.getInitialEnvelopeID( );
		if ( StringUtil.isNullOrEmpty( initialEnvelopeId ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._03_00028_01, 
				ProcessingConstants.ERROR_TYPE_CHECK 
			);
		}
		
		Edecl_Messages initialEnvelope = _serviceHolder.getEnvelopeService( )
			.getEnvelope( initialEnvelopeId );
		if ( null == initialEnvelope )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._03_00028_01, 
				ProcessingConstants.ERROR_TYPE_CHECK 
			);			
		}
		
		return initialEnvelope;
	}
}
