package ru.acs.fts.eps2.ws.event.services;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import com.sun.jna.platform.win32.WinNT;

import ru.acs.fts.eps2.ws.model.serviceModel.event.Event;

public class EventService
{
	private ru.acs.fts.eps2.ws.event.database.services.EventService _dbEventService;
	private WindowsEventLog _winEventLog;
	
	// @formatter:off
	@Required public void setDbEventService( ru.acs.fts.eps2.ws.event.database.services.EventService dbEventService ) { _dbEventService = dbEventService; }
	public ru.acs.fts.eps2.ws.event.database.services.EventService getDbEventService( ) { return _dbEventService; }
	
	@Required public void setWindowsEventLog( WindowsEventLog winEventLog ) { _winEventLog = winEventLog; }
	public WindowsEventLog getWindowsEventLog( ) { return _winEventLog; }
	// @formatter:on
	
	public void putToWindowsEventLog( Event event ) 
		throws IOException
	{
		short type = 0;
		switch ( event.getCategoryId( ) )
		{
			case 1: case 2: type = WinNT.EVENTLOG_ERROR_TYPE; break; 
			case 3: type = WinNT.EVENTLOG_WARNING_TYPE; break; 
			case 4: type = WinNT.EVENTLOG_INFORMATION_TYPE; break; 
		}
		
		short category = ( short )event.getCategoryId( );
		
		List< String > strings = new ArrayList< String >( );
		strings.add( String.format( "EventDateTime=%s", event.dateToString( ) ) );
		strings.add( String.format( "EventCode=%d", event.getEventCode( ) ) );
		strings.add( String.format( "EnvelopeID=%s", event.getEnvelopeId( ) ) );
		strings.add( String.format( "DocumentID=%s", event.getDocumentId( ) ) );
		strings.add( String.format( "SourceID=%d", event.getSourceId( ) ) );
		strings.add( String.format( "CategoryID=%d", event.getCategoryId( ) ) );
		strings.add( String.format( "ProccessID=%s", event.getProcessId( ) ) );
		strings.add( event.getEventInfo( ) );
		
		StringBuilder b = new StringBuilder( );
		for ( String s : strings )
		{
			b.append(  String.format( "%s\n", s ) );
		}
		
		_winEventLog.openEventLog( event.getInvokingSystemName( ), "Application" );
		_winEventLog.reportEvent( type, category, event.getEventCode( ), new String[ ] { b.toString( ) } );
		
		/*
		List< String > cmd = new ArrayList< String >( );
		cmd.add( "eventcreate" );
		cmd.add( "/L" ); cmd.add( "APPLICATION" );
		cmd.add( "/SO" ); cmd.add( String.format( "\"%s\"", event.getInvokingSystemName( ) ) );
		cmd.add( "/T" );

			switch ( event.getCategoryId( ) )
			{
				case 1: case 2: cmd.add( "ERROR" ); break;
				case 3: cmd.add( "WARNING" ); break;
				case 4: cmd.add( "INFORMATION" ); break;
			}
			
		cmd.add( "/ID" ); cmd.add( Integer.toString( event.getEventCode( ) ) );
		cmd.add( "/D" );
		
			StringBuilder d = new StringBuilder( );
			d.append( "\"" );
			
				d.append( "EventDateTime=" ); d.append( event.dateToString( ) ); d.append( "\n" );
				d.append( "EventCode=" ); d.append( event.getEventCode( ) ); d.append( "\n" );
				d.append( "EnvelopeID=" ); d.append( event.getEnvelopeId( ) ); d.append( "\n" );
				d.append( "DocumentID=" ); d.append( event.getDocumentId( ) ); d.append( "\n" );
				d.append( "SourceID=" ); d.append( event.getSourceId( ) ); d.append( "\n" );
				d.append( "CategoryID=" ); d.append( event.getCategoryId( ) ); d.append( "\n" );
				d.append( "ProccessID=" ); d.append( event.getProcessId( ) ); d.append( "\n" );
				d.append( event.getEventInfo( ) ); d.append( "\n" );
				
			d.append( "\"" );
			
		cmd.add( d.toString( ) );
		
		Runtime.getRuntime( ).exec( cmd.toArray( new String[ 0 ] ) );
		*/
	}
	
	public void putToDatabase( Event event ) 
		throws Exception
	{
		ru.acs.fts.eps2.ws.event.database.model.Event dbEvent = new ru.acs.fts.eps2.ws.event.database.model.Event( );
		
		dbEvent.setEventDateTime( event.getDateTime( ).toDate( ) );
		dbEvent.setLogDateTime( new Date( ) );
		dbEvent.setEventCode( new BigDecimal( event.getEventCode( ) ) );
		dbEvent.setDescription( event.getEventInfo( ) );
		dbEvent.setEnvelopeId( event.getEnvelopeId( ) );
		dbEvent.setDocumentId( event.getDocumentId( ) );
		dbEvent.setSourceId( new BigDecimal( event.getSourceId( ) ) );
		dbEvent.setCategoryId( new BigDecimal( event.getCategoryId( ) ) );
		dbEvent.setProcessId( event.getProcessId( ) );
		
		_dbEventService.persist( dbEvent );
	}
}
