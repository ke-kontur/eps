package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.List;

import ru.acs.fts.eps2.engine.data.kind.DocumentStates;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.model.services.EnvelopeService;
import ru.acs.fts.eps2.model.services.ProcedureService;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.schemas.album.esadout_cu.ESADoutCUType;

public class SuppliesDtBusiinessProcess extends BusinessProcess
{
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		String processId = recvEnv.getProcessID( );
		setUpProcess( processId, recvEnv );
		
		String documentId = recvEnv.getDocument( ).getDocumentID( );
		setUpDocuments( documentId );
	}
	
	private void setUpProcess( String processId, EDEnvelope recvEnv ) 
		throws Exception 
	{
		ProcedureService procedureService = getServiceHolder( ).getProcedureService( );
		Edecl_Proc_Information process = procedureService.getProcedureInformation( processId );
		
		ESADoutCUType esadOutCu = recvEnv.getDocument( )
			.getDocumentInContainer( ESADoutCUType.class )
			.getDocumentAsClass( ESADoutCUType.class );

		process.setTransferType( esadOutCu.getCustomsProcedure( ) );
		process.setCustProcedureCode( esadOutCu.getCustomsModeCode( ) );
		
		procedureService.merge( process );
	}
	
	private void setUpDocuments( String documentId ) 
		throws DatabaseException
	{
		EnvelopeService envelopeService = getServiceHolder( ).getEnvelopeService( );
		Edecl_Msg_Doc container = envelopeService.getDocument( documentId );
		container.setState( DocumentStates.CURRENT );
		envelopeService.merge( container );
		
		List< Edecl_Msg_Doc > containerDocs = envelopeService.getContainerDocuments( documentId );
		for ( Edecl_Msg_Doc doc : containerDocs )
		{
			doc.setState( DocumentStates.CURRENT );
			envelopeService.merge( doc );
		}
	}
}
