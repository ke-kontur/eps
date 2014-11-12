package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.utils.StringUtil;

public class CommitChangeDocumentBusinessProcess extends BusinessProcess
{
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		String refDocId = recvEnv.getDocument( ).getRefDocumentID( ); 

		if ( StringUtil.isNullOrEmpty( refDocId ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._03_00027_01, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}

		Edecl_Msg_Doc refferedDocument = _serviceHolder.getEnvelopeService( ).getDocument( refDocId );

		if ( null == refferedDocument )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._02_00001_01, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
				
		String refDocModeId = refferedDocument.getDocumentModeId( );
		String incomeDocModeId = recvEnv.getDocument( ).getDocumentModeID( ); 
		
		if ( ! refDocModeId.equalsIgnoreCase( incomeDocModeId ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._03_00016_01, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
	}

}
