package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.data.kind.DocumentModeIDs;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.helpers.CryptoHelper;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.util.helpers.UUIDGen;
import ru.acs.fts.schemas.album.notifcloseproc.NotifCloseProcType;
import ru.acs.fts.schemas.album.reqcloseproc.ReqCloseProcType;

import java.util.List;

import org.joda.time.DateTime;

/**
 * Бизнес процесс для обработки сообщения ED.10003
 * ( закрытие процедуры декларирования )
 */
public class MessageED10003BusinessProcess extends BusinessProcess
{
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		ReqCloseProcType doc = recvEnv.getDocument( ).getDocumentAsClass( ReqCloseProcType.class );

		NotifCloseProcType notifCloseProc = new NotifCloseProcType( );
		notifCloseProc.setDocumentID( UUIDGen.getUUID( ).toString( ) );
		notifCloseProc.setRefDocumentID( doc.getDocumentID( ) );
		notifCloseProc.setDocumentModeID( DocumentModeIDs.NOTIF_CLOSE_PROC );

		notifCloseProc.setCloseProcedureID( recvEnv.getProcessID( ) );
		notifCloseProc.setCloseDateTime( new DateTime( ).toString( ) );
		
						
		EDEnvelope respEnvelope = EnvelopeCreator.createResponseMessage( 
			MessageType.ED_10004, recvEnv, notifCloseProc, 
			recvEnv.getSenderSystem( ), recvEnv.getSenderCustoms( )
		);
		
		CryptoHelper.signEnvelope( respEnvelope, false );
		
		List< EDEnvelope > envelopes = createAndPutEnvelopes( jobBatchContext, jobContext );
		envelopes.add( respEnvelope );
	}
}
