package ru.acs.fts.aud.router.processing.inspection;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.aud.router.objects.AudEnvelope;
import ru.acs.fts.aud.router.processing.AudJobBatchContext;
import ru.acs.fts.eps2.engine.processing.JobBatchContext;
import ru.acs.fts.eps2.engine.processing.inspection.EventFactory;
import ru.acs.fts.eps2.engine.restWs.event.EventRestWs;

public class RESTEventFactory implements EventFactory
{	
	private static final String pattern = "<Envelope: %s, Document: %s, SoftVersion: %s, Category: %d, Code: %d, CommitId: %s> %s";
	
	private EventRestWs _eventRestWs;
	private String _commitId;
	
	// @formatter:off
	@Required public void setEventRestWs( EventRestWs eventRestWs ) { _eventRestWs = eventRestWs; }
	public EventRestWs getEventRestWs( ) { return _eventRestWs; }
	
	@Required public void setCommitId( String commitId ) { _commitId = commitId; }
	public String getCommitId( ) { return _commitId; }
	// @formatter:on
	
	@Override
	public void log( JobBatchContext jobBatchContext, int category, String info, int code, Logger log )
	{
		AudEnvelope recvEnv = null;
		
		try
		{
			AudJobBatchContext ajbc = ( AudJobBatchContext )jobBatchContext;
			recvEnv = ajbc.getReceivedEnvelope( );
		}
		catch ( Exception e )
		{
			return ;
		}
		
		try
		{
			log.info( String.format( 
					pattern, 
					recvEnv.getEnvelopeID( ), recvEnv.getDocument( ).getDocumentID( ),  
					recvEnv.getApplicationInfo( ).getSoftVersion( ),
					category, code, _commitId, info 
				) );
		}
		catch ( Exception ex )
		{
			return ;
		}
		
		/*
		Event event = new Event( );
		
		event.setEventCode( code );
		event.setDateTime( new DateTime( ) );
		event.setEventInfo( info );
		event.setInvokingSystemName( "EPS2J" );
		event.setSourceId( 0 );
		event.setCategoryId( category );
		event.setEnvelopeId( econtext.getEnvelopeID( ) );
		event.setDocumentId( econtext.getDocumentID( ) );
		event.setProcessId( econtext.getProcessID( ) );
		event.setVersion( econtext.getSoftVersion( ) );

		try
		{
			_eventRestWs.postNewEvent( event );
		}
		catch ( Exception exc )
		{
			// Не удалось записать сообщение, ну и пофигу на него
			log.error( "Не удалось вызвать Event-сервис", exc );
		}
		*/
	}
}
