package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import ru.acs.fts.eps2.engine.data.kind.DocumentModeIDs;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.router.objects.EDDocument;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.util.helpers.UUIDGen;
import ru.acs.fts.schemas.album.permitopenproc.PermitOpenProcType;

/**
 * Бизнес процесс для обработки сообщения ED.11001
 * ( открытие процедуры декларирования )
 */
public class MessageED11001BusinessProcess extends BusinessProcess
{
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		String processId = jobBatchContext.getString( ContextConstants.PROCESS_ID );
		
		PermitOpenProcType permitOpenProc = new PermitOpenProcType( );
		permitOpenProc.setDocumentID( UUIDGen.getUUID( ).toString( ) );
		permitOpenProc.setRefDocumentID( recvEnv.getDocument( ).getDocumentID( ) );
		permitOpenProc.setDocumentModeID( DocumentModeIDs.PERMIT_OPEN_PROC );

		permitOpenProc.setProcedureID( processId );
		

		EDDocument doc = new EDDocument( permitOpenProc );

		jobBatchContext.put( jobContext.getString( ContextConstants.DOCUMENT_NAME ), doc );
	}
}
