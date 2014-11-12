package engine;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;
import org.junit.Ignore;
import org.junit.Test;

import ru.acs.fts.eps2.engine.restWs.event.EventRestWs;
import ru.acs.fts.eps2.engine.restWs.event.serviceModel.Event;

@Ignore
public class EventRestWsTest
{
	public static final String EVENT_REST_URL = "http://eps1:9000/event-service/";

	@Test
	public void testEventException( )
		throws Exception
	{
		EventRestWs erws = new EventRestWs( );
		erws.setRestEventSrvUrl( EVENT_REST_URL );
		
		erws.postException( new Exception( "Test Exception" ), "EnvelopeID" );
	}

	@Test
	public void testPostEvents( )
		throws Exception
	{
		EventRestWs erws = new EventRestWs( );
		erws.setRestEventSrvUrl( EVENT_REST_URL );
		
		Event ev = new Event( );
		
		ev.setEventCode( 1 );
		ev.setDateTime( new DateTime( ) );
		ev.setEventInfo( "Тестовое событие" );
		ev.setInvokingSystemName( "engine:junit:test" );
		ev.setSourceId( 0 );
		ev.setCategoryId( 4 );
		ev.setEnvelopeId( "EnvelopeID" );
		ev.setDocumentId( "DocumentID" );
		ev.setProcessId( "ProcessID" );
		ev.setMessageId( "MessageID" );
		ev.setVersion( "1" );
		
		List< Event > events = new ArrayList< Event >( );
		events.add( ev );
		events.add( ev );
		
		erws.postNewEvents( events );
	}

	@Test
	public void testPostEvent( )
		throws Exception
	{
		EventRestWs erws = new EventRestWs( );
		erws.setRestEventSrvUrl( EVENT_REST_URL );
		
		Event ev = new Event( );
		
		ev.setEventCode( 2 );
		ev.setDateTime( new DateTime( ) );
		ev.setEventInfo( "Тестовое событие" );
		ev.setInvokingSystemName( "engine:junit:test" );
		ev.setSourceId( 0 );
		ev.setCategoryId( 4 );
		ev.setEnvelopeId( "EnvelopeID" );
		ev.setDocumentId( "DocumentID" );
		ev.setProcessId( "ProcessID" );
		ev.setMessageId( "MessageID" );
		ev.setVersion( "1" );
		
		erws.postNewEvent( ev );
	}
}
