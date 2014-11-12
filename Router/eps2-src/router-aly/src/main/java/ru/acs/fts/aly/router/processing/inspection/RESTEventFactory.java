package ru.acs.fts.aly.router.processing.inspection;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.eps2.engine.processing.JobBatchContext;
import ru.acs.fts.eps2.engine.processing.inspection.EventFactory;
import ru.acs.fts.eps2.engine.restWs.event.EventRestWs;

public class RESTEventFactory implements EventFactory
{	
	// private static final String pattern = "<Envelope: %s, Document: %s, SoftVersion: %s, Category: %d, Code: %d> %s";
	
	private EventRestWs _eventRestWs;
	
	// @formatter:off
	@Required public void setEventRestWs( EventRestWs eventRestWs ) { _eventRestWs = eventRestWs; }
	public EventRestWs getEventRestWs( ) { return _eventRestWs; }
	// @formatter:on
	
	@Override
	public void log( JobBatchContext jobBatchContext, int category, String info, int code, Logger log )
	{		
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
