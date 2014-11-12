package ru.acs.fts.aud.router.model.managers;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.aud.model.entities.Client;
import ru.acs.fts.aud.model.entities.ProtocolItem;
import ru.acs.fts.aud.model.entities.ProtocolLogLevel;
import ru.acs.fts.aud.model.entities.ProtocolSource;
import ru.acs.fts.aud.model.persistence.ProtocolService;
import ru.acs.fts.aud.model.persistence.cached.ProtocolLogLevelService;
import ru.acs.fts.aud.model.persistence.cached.ProtocolSourceService;
import ru.acs.fts.aud.model.persistence.exception.PersistenceException;
import ru.acs.fts.aud.router.processing.AudMessageSource;
import ru.acs.fts.aud.router.processing.helpers.MessageResolver;
import ru.acs.fts.eps2.util.time.TimeUtil;
import ru.acs.fts.eps2.util.helpers.UUIDGen;

public class ProtocolManager extends BaseManager
{
	private AudMessageSource _logMessageSource;
	
	// @formatter:off
	@Required
	public void setLogMessageSource( AudMessageSource logMessageSource ) { _logMessageSource = logMessageSource; }
	public AudMessageSource getLogMessageSource( ) { return _logMessageSource; }
	// @formatter:on
	
	public ProtocolItem createProtocolItem( String envelopeId, String messageKind, Client client,
			String appliedClientId, String documentId, String eventType, ProtocolLogLevel logLevel, 
			ProtocolSource protocolSource, Throwable exc )
	{
		ProtocolItem protocolItem = new ProtocolItem( );
		
		if ( null != envelopeId )
			protocolItem.setEnvelopeId( envelopeId );
		protocolItem.setClient( client );
		protocolItem.setAppliedClientId( appliedClientId );
		if ( null != documentId )
			protocolItem.setDocumentId( documentId );
		protocolItem.setEventDate( TimeUtil.newTimestamp( ) );
		protocolItem.setMessageKind( messageKind );
		protocolItem.setEventType( eventType );
		protocolItem.setLogLevel( logLevel );
		protocolItem.setCodeType( protocolSource );
		protocolItem.setId( UUIDGen.getUUID( ).toString( ) );
		
		if ( null != exc )
			protocolItem.setStackTrace( extractStackTrace( exc ) );
		
		return protocolItem;
	}
	
	public ProtocolItem createProtocolItem( String envelopeId, String messageKind, Client client,
			String appliedClientId, String documentId, String eventType, ProtocolLogLevel logLevel, 
			ProtocolSource protocolSource, Throwable exc, Timestamp creationDate )
	{
		ProtocolItem protocolItem = createProtocolItem( envelopeId, messageKind, client, 
				appliedClientId, documentId, eventType, logLevel, protocolSource, exc );
		protocolItem.setEventDate( creationDate );
		
		return protocolItem;
	}
	
	public void saveProtocol( ProtocolItem protocolItem, String protocolCode, Object[ ] params ) 
		throws PersistenceException
	{
		String message = MessageResolver.resolveLogMessage( protocolCode, params );
		protocolItem.setDescription( message );
		
		ProtocolService protocolService = getProtocolService( );
		Timestamp maxEventDate = protocolService.getMaxProtocolItemEventDate( );
		Timestamp protocolEventDate = protocolItem.getEventDate( );
		if ( null != maxEventDate && null != protocolEventDate && 
				maxEventDate.getTime( ) > protocolEventDate.getTime( ) )
		{
			protocolItem.setEventDate( TimeUtil.addMillis( maxEventDate, 1 ) );
		}
		
		protocolService.persistProtocolItem( protocolItem );
	}
	
	public ProtocolLogLevel getProtocolLogLevel( String shortDescription ) throws PersistenceException
	{
		return getProtocolLogLevelService( ).getByShortDescription( shortDescription );
	}
	
	public ProtocolSource getProtocolSource( String shortDescription ) throws PersistenceException
	{
		return getProtocolSourceService( ).getByShortDescription( shortDescription );
	}
	
	private String extractStackTrace( Throwable exc )
	{
		if ( null == exc )
			return null;
		
		StringWriter writer = new StringWriter( );
		PrintWriter printWriter = new PrintWriter( writer );
		exc.printStackTrace( printWriter );
		
		return writer.toString( );
	}
	
	private ProtocolService getProtocolService( )
	{
		return _serviceHolder.getProtocolService( );
	}
	
	private ProtocolLogLevelService getProtocolLogLevelService( )
	{
		return _serviceHolder.getProtocolLogLevelService( );
	}
	
	private ProtocolSourceService getProtocolSourceService( )
	{
		return _serviceHolder.getProtocolSourceService( );
	}
}
