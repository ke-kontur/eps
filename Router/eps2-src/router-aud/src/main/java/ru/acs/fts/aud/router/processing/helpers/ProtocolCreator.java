package ru.acs.fts.aud.router.processing.helpers;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.aud.model.entities.Client;
import ru.acs.fts.aud.model.entities.Document;
import ru.acs.fts.aud.model.entities.ProtocolItem;
import ru.acs.fts.aud.model.persistence.exception.PersistenceException;
import ru.acs.fts.aud.router.model.managers.ProtocolManager;
import ru.acs.fts.aud.router.objects.AudEnvelope;
import ru.acs.fts.aud.router.processing.AudJobBatchContext;
import ru.acs.fts.aud.router.processing.definitions.EventTypes;
import ru.acs.fts.aud.router.processing.definitions.ProtocolLogLevels;
import ru.acs.fts.aud.router.processing.definitions.ProtocolSources;
import ru.acs.fts.eps2.util.helpers.UUIDGen;

public class ProtocolCreator
{
	private static ProtocolManager _protocolManager;
	
	// @formatter:off
	@Required
	public void setProtocolManager( ProtocolManager protocolManager ) { _protocolManager = protocolManager; }
	public ProtocolManager getProtocolManager( ) { return _protocolManager; }
	// @formatter:on
	
	public static void stashProtocol( 
			AudJobBatchContext jobBatchContext, String protocolCode,
			String eventType, Object[ ] params, Throwable exc ) throws PersistenceException
	{
		AudEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		ProtocolItem protocolItem = createProtocol( recvEnv, eventType, exc );
		jobBatchContext.stashProtocol( new ProtocolInfo( protocolItem, protocolCode, params ) );
	}
	
	public static void stashProtocol( AudJobBatchContext jobBatchContext, String protocolCode, Object[ ] params ) throws PersistenceException
	{
		stashProtocol( jobBatchContext, protocolCode, EventTypes.OTHER, params, null );
	}
	
	public static void stashProtocol( AudJobBatchContext jobBatchContext, String eventType, Document appliedDocument, String protocolCode, Object[ ] params ) // NO_UCD (use default)
	{
		ProtocolItem protocol = new ProtocolItem( );
		protocol.setId( UUIDGen.getUUID( ).toString( ) );
		protocol.setAppliedDocument( appliedDocument );
		protocol.setEventType( eventType );
		
		stashProtocol( protocol, jobBatchContext, protocolCode, params );
	}
	
	@Deprecated
	public static void stashProtocol( AudJobBatchContext jobBatchContext, String envelopeId, String messageKind, Client client, // NO_UCD (unused code)
			String appliedClientId, String documentId, String eventType, String protocolLogLevel, String protocolSource, Throwable exc,
			Timestamp eventDate, String protocolCode, Object[ ] params ) throws PersistenceException
	{
		ProtocolItem protocolItem = createProtocol( envelopeId, messageKind, client, 
					appliedClientId, documentId, eventType, protocolLogLevel, 
					protocolSource, exc, eventDate );
		
		jobBatchContext.stashProtocol( new ProtocolInfo( protocolItem, protocolCode, params ) );
	}
	
	public static void stashProtocol( ProtocolItem protocolItem, AudJobBatchContext jobBatchContext, String protocolCode, Object[ ] params )
	{
		jobBatchContext.stashProtocol( new ProtocolInfo( protocolItem, protocolCode, params ) );
	}
	
	public static ProtocolItem createProtocol( AudEnvelope env, String eventType, Throwable exc ) throws PersistenceException // NO_UCD (use private)
	{
		String messageKind = env.getMessageKind( );
		String envelopeId = env.getEnvelopeID( );
		String documentId = env.getDocument( ).getDocumentID( );
		String appliedClientId = env.getAudInfo( ).getArchiveClientId( );
		
		return createProtocol( messageKind, envelopeId, documentId, 
				appliedClientId, eventType, exc );
	}
	
	public static ProtocolItem createProtocol( String messageKind, String envelopeId, // NO_UCD (use private)
			String documentId, String appliedClientId, String eventType, Throwable exc ) throws PersistenceException
	{
		return _protocolManager.createProtocolItem( 
			envelopeId, messageKind, null, appliedClientId, 
			documentId, eventType, 
			_protocolManager.getProtocolLogLevel( ProtocolLogLevels.INFO ), 
			_protocolManager.getProtocolSource( ProtocolSources.DOC ), 
			exc 
		);
	}
	
	public static ProtocolItem createProtocol( String envelopeId, String messageKind, Client client, String appliedClientId, // NO_UCD (use private)
			String documentId, String eventType, String protocolLogLevel, String protocolSource, Throwable exc, Timestamp eventDate ) throws PersistenceException
	{
		return _protocolManager.createProtocolItem( 
			envelopeId, messageKind, 
			client, appliedClientId, documentId, eventType,
			_protocolManager.getProtocolLogLevel( protocolLogLevel ), 
			_protocolManager.getProtocolSource( protocolSource ),
			exc, eventDate 
		);
	}
}
