package ru.acs.fts.aly.router.processing.jobs;

import java.util.List;

import ru.acs.fts.aly.model.entities.AlyEsadRepl;
import ru.acs.fts.aly.model.services.DiffService;
import ru.acs.fts.aly.router.objects.AlyEnvelope;
import ru.acs.fts.aly.router.processing.AlyJobBatchContext;
import ru.acs.fts.eps2.engine.data.kind.DocumentModeIDs;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
import ru.acs.fts.eps2.model.services.EnvelopeService;

public class EsadSaveJob extends AlyJob
{
	@Override
	public void alyExecute( AlyJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		AlyEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		EnvelopeService envSrv = jobBatchContext.getServiceHolder( ).getEnvelopeService( );
		DiffService diffSrv = jobBatchContext.getServiceHolder( ).getDiffService( );
		
		List< Edecl_Msg_Doc > cdocs = envSrv.getContainerDocuments( recvEnv.getDocument( ).getDocumentID( ) );
		for ( Edecl_Msg_Doc cdoc : cdocs )
		{
			if ( cdoc.getDocumentModeId( ).equals( DocumentModeIDs.ESAD_OUT_CU ) )
			{
				AlyEsadRepl repl = diffSrv.getRepl( cdoc.getDocumentID( ) );
				if ( null != repl )
					continue;
				
				repl = new AlyEsadRepl( );
				repl.setEsadId( cdoc.getDocumentID( ) );
				repl.setRefEsadId( " " );
				repl.setSoftVersion( recvEnv.getSoftVersion( ) );
				
				diffSrv.persist( repl );
			}
		}
	}

	@Override
	public String getAction( )
	{
		return "Задача сохранения информации о первоначальном комплекте";
	}
}
