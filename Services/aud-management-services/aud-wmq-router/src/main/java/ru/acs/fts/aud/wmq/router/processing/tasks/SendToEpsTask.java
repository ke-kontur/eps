package ru.acs.fts.aud.wmq.router.processing.tasks;

import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.aud.rest.service.model.objects.AudMessage;
import ru.acs.fts.aud.rest.service.model.objects.AudResponseMetadata;
import ru.acs.fts.aud.wmq.router.restWs.resultDispatcher.AudResultDispatcherRestWs;

public class SendToEpsTask
{
	public AudResultDispatcherRestWs _audResultDispatcherRestWs;
	
	// @formatter:off
	@Required public void setAudResultDispatcherRestWs( AudResultDispatcherRestWs audResultDispatcherRestWs ) { _audResultDispatcherRestWs = audResultDispatcherRestWs; }
	public AudResultDispatcherRestWs getAudResultDispatcherRestWs( ) { return _audResultDispatcherRestWs; }
	// @formatter:on
	
	public void sendToEps( AudMessage msg, AudResponseMetadata metadata ) 
		throws Exception
	{
		_audResultDispatcherRestWs.sendMessage( msg, metadata );
	}
}
