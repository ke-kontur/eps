package ru.acs.fts.aud.wmq.router.processing;

import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.aud.rest.service.model.objects.AudMessage;
import ru.acs.fts.aud.rest.service.model.objects.AudResponseMetadata;
import ru.acs.fts.aud.wmq.router.mappers.AudMessageMapper;
import ru.acs.fts.aud.wmq.router.processing.tasks.AcquireAudDocumentTask;
import ru.acs.fts.aud.wmq.router.processing.tasks.SendToEpsTask;
import ru.acs.fts.aud.wmq.router.processing.tasks.UnmarshallingTask;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDBaseEnvelopeType;
import ru.acs.fts.schemas.envelope.EnvelopeType;

public class AudMessageDispatcher
{
	private UnmarshallingTask _unmarshallingTask;
	private AcquireAudDocumentTask _acquireAudDocumentTask;
	private SendToEpsTask _sendToEpsTask;
	
	// @formatter:off
	@Required public void setUnmarshallingTask( UnmarshallingTask unmarshallingTask ) { _unmarshallingTask = unmarshallingTask; }
	public UnmarshallingTask getUnmarshallingTask( ) { return _unmarshallingTask; }
	
	@Required public void setAcquireAudDocumentTask( AcquireAudDocumentTask acquireAudDocumentTask ) { _acquireAudDocumentTask = acquireAudDocumentTask; }
	public AcquireAudDocumentTask getAcquireAudDocumentTask( ) { return _acquireAudDocumentTask; }
	
	@Required public void setSendToEpsTask( SendToEpsTask sendToEpsTask ) { _sendToEpsTask = sendToEpsTask; }
	public SendToEpsTask getSendToEpsTask( ) { return _sendToEpsTask; }
	// @formatter:on
	
	public void dispatch( byte[ ] message ) 
		throws Exception
	{
		EnvelopeType recvEnv = _unmarshallingTask.unmarshall( message );
		
		_acquireAudDocumentTask.acquire( recvEnv );
		
		byte[ ] data = _acquireAudDocumentTask.getData( );
		AUDBaseEnvelopeType audMessage = _acquireAudDocumentTask.getAudMessage( );
		
		AudMessage msg = AudMessageMapper.mapRecvAudMessage( audMessage, data, recvEnv );
		AudResponseMetadata metadata = AudMessageMapper.mapMetadata( audMessage, data, recvEnv );
		
		_sendToEpsTask.sendToEps( msg, metadata );
	}
}
