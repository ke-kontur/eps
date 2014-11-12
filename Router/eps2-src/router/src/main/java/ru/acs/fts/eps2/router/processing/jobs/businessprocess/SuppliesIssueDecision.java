package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.schemas.album.esadout_cu.ESADoutCUType;

public class SuppliesIssueDecision extends BusinessProcess
{
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		ESADoutCUType esadOutCu = recvEnv.getDocument( )
			.getDocumentInContainer( ESADoutCUType.class )
			.getDocumentAsClass( ESADoutCUType.class );
		
		String documentId = esadOutCu.getDocumentID( );
		
		Edecl_Msg_Doc esadDoc = getServiceHolder( ).getEnvelopeService( ).getDocument( documentId );
		checkState( esadDoc, jobBatchContext );
	}
}
