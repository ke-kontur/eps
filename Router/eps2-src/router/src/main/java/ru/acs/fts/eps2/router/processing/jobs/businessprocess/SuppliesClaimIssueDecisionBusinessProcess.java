package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.schemas.album.applicationstore.ApplicationStoreType;

public class SuppliesClaimIssueDecisionBusinessProcess extends BusinessProcess
{
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
			throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		ApplicationStoreType esadout = 
			recvEnv.getDocument( ).getDocumentInContainer( ApplicationStoreType.class )
			.getDocumentAsClass( ApplicationStoreType.class );
		
		String documentId = esadout.getDocumentID( );
		
		Edecl_Msg_Doc esadDoc = getServiceHolder( ).getEnvelopeService( ).getDocument( documentId );
		checkState( esadDoc, jobBatchContext );
	}
}
