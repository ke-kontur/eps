package ru.acs.fts.eps2.router.processing.jobs;

import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edecl_Messages;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.utils.StringUtil;

public class CheckInitialEnvelopeAndRefDocumentJob extends EDJob
{
	private final static String action = "Проверка валидных InitialEnvelopeID и RefDocumentID в рамках текущей ProccessID";

	@Override
	public void edExecute( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		boolean noRequiredProcessId = jobContext.getBoolean( ContextConstants.NO_REQUIRED_PROCESS_ID );
		
		String processId = ( ! noRequiredProcessId ) ? checkProcessId( jobBatchContext ) : null;
		String refDocumentId = checkRefDocumentId( jobBatchContext );
		
		Edecl_Messages msg = null;
		boolean noRequiredInitialEnvelopeId = jobContext.getBoolean( ContextConstants.NO_REQUIRED_INITIAL_ENVELOPE_ID );
		
		if ( ! noRequiredInitialEnvelopeId )
		{
			String initialEnvelopeId = checkInitialEnvelopeId( jobBatchContext );
	
			if ( ! noRequiredProcessId )
				msg = jobBatchContext.getServiceHolder( ).getEnvelopeService( )
					.getEnvelope( initialEnvelopeId, processId, refDocumentId );
			else
				msg = jobBatchContext.getServiceHolder( ).getEnvelopeService( )
					.getEnvelope_InitialEnvelopeID_RefDocumentID( initialEnvelopeId, refDocumentId );
		}
		else
		{
			if ( ! noRequiredProcessId )
				msg = jobBatchContext.getServiceHolder( ).getEnvelopeService( )
					.getEnvelope( processId, refDocumentId );
			else
				msg = jobBatchContext.getServiceHolder( ).getEnvelopeService( )
					.getEnvelope_RefDocumentId( refDocumentId );
		}
			
		if ( null == msg )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._03_00027_07, 
				ProcessingConstants.ERROR_TYPE_CHECK 
			);
		}	
	}

	@Override
	public String getAction( )
	{
		return action;
	}

	private String checkInitialEnvelopeId( EDJobBatchContext jobBatchContext )
		throws ResultTypeException, DatabaseException
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		String initialEnvelopeId = recvEnv.getInitialEnvelopeID( );
		
		if ( StringUtil.isNullOrEmpty( initialEnvelopeId ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._03_00028_01, 
				ProcessingConstants.ERROR_TYPE_CHECK 
			);
		}
		
		return initialEnvelopeId;
	}
	
	private String checkRefDocumentId( EDJobBatchContext jobBatchContext )
		throws ResultTypeException, DatabaseException
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		String refDocumentId = recvEnv.getDocument( ).getRefDocumentID( );
		
		if ( StringUtil.isNullOrEmpty( refDocumentId ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._03_00027_01, 
				ProcessingConstants.ERROR_TYPE_CHECK 
			);
		}
		
		return refDocumentId;
	}
	
	private String checkProcessId( EDJobBatchContext jobBatchContext )
		throws ResultTypeException, DatabaseException
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		String processId = recvEnv.getProcessID( );
		
		if ( StringUtil.isNullOrEmpty( processId ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._01_00049_01, 
				ProcessingConstants.ERROR_TYPE_CHECK 
			);
		}
		
		return processId;
	}
}
