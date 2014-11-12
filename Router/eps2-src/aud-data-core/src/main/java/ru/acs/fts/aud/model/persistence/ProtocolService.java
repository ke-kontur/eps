package ru.acs.fts.aud.model.persistence;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.orm.jpa.JpaTemplate;

import ru.acs.fts.aud.model.entities.ErrorMessage;
import ru.acs.fts.aud.model.entities.MessageKind;
import ru.acs.fts.aud.model.entities.ProtocolItem;
import ru.acs.fts.aud.model.entities.ProtocolLogLevel;
import ru.acs.fts.aud.model.entities.ProtocolSource;
import ru.acs.fts.aud.model.filtering.Page;
import ru.acs.fts.aud.model.filtering.SimpleCondition;
import ru.acs.fts.aud.model.persistence.exception.PersistenceException;
import ru.acs.fts.eps2.utils.CollectionHelper;

@SuppressWarnings( "deprecation" )
public class ProtocolService extends BaseService
{
	private BaseStorage< ProtocolItem > _protocolItemStorage;
	private BaseStorage< ProtocolLogLevel > _protocolLogLevelStorage;
	private BaseStorage< ProtocolSource > _protocolSourceStorage;
	private BaseStorage< MessageKind > _messageKindStorage;
	private BaseStorage< ErrorMessage > _errorMessageStorage;
	
	public ProtocolService( )
	{
		_protocolItemStorage = new BaseStorage< ProtocolItem >( ProtocolItem.class );
		_protocolLogLevelStorage = new BaseStorage< ProtocolLogLevel >( ProtocolLogLevel.class );
		_protocolSourceStorage = new BaseStorage< ProtocolSource >( ProtocolSource.class );
		_messageKindStorage = new BaseStorage< MessageKind >( MessageKind.class );
		_errorMessageStorage = new BaseStorage< ErrorMessage >( ErrorMessage.class );
	}
	
	// @formatter:off
	@Required public void setJpaTemplate( JpaTemplate jpaTemplate )
	{
		_protocolItemStorage.setJpaTemplate( jpaTemplate );
		_protocolLogLevelStorage.setJpaTemplate( jpaTemplate );
		_protocolSourceStorage.setJpaTemplate( jpaTemplate );
		_messageKindStorage.setJpaTemplate( jpaTemplate );
		_errorMessageStorage.setJpaTemplate( jpaTemplate );
	}
	public JpaTemplate getJpaTemplate( ) { return _protocolItemStorage.getJpaTemplate( ); }
	// @formatter:on
	
	@Deprecated
	public List< ProtocolItem > getProtocolItems( Timestamp from, Timestamp to, String eventType ) throws PersistenceException // NO_UCD (unused code)
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select pi from ProtocolItem pi " );
		q.append( "where pi.eventDate >= :from " );
			q.append( "and pi.eventDate <= :to " );
			q.append( "and pi.eventType = :eventType " );
			
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "from", from );
		args.put( "to", to );
		args.put( "eventType", eventType );
		
		List< ProtocolItem > res = _protocolItemStorage.select( q.toString( ), args );
		if ( null == res )
			return new ArrayList< ProtocolItem >( );
		
		return res;
	}
	
	public List< ProtocolItem > getProtocolItems( ) throws PersistenceException
	{
		StringBuilder query = new StringBuilder( "select pi from ProtocolItem pi" );
		
		return _protocolItemStorage.select( query.toString( ), new HashMap< String, Object >( ) );
	}
	
	public List< MessageKind > getMessageKinds( ) throws PersistenceException
	{
		StringBuilder query = new StringBuilder( "select mk from MessageKind mk" );
		
		return _messageKindStorage.select( query.toString( ), new HashMap< String, Object >( ) );
	}
	
	@Deprecated
	public ErrorMessage getErrorMessageByDocumentId( String documentId ) throws PersistenceException // NO_UCD (unused code)
	{
		StringBuilder query = new StringBuilder( "select em from ErrorMessage em" );
		query.append( " where em.documentId = :documentId" );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "documentId", documentId );
		
		return CollectionHelper.getFirst( _errorMessageStorage.select( query.toString( ), args ) );
	}
	
	public List< ErrorMessage > getAllErrorMessages( ) throws PersistenceException
	{
		StringBuilder query = new StringBuilder( "select em from ErrorMessage em" );
		
		return _errorMessageStorage.select( query.toString( ), new HashMap< String, Object >( ) );
	}
	
	@Deprecated
	public Page< ProtocolItem > getFilteredProtocolItems( List< SimpleCondition > conditions,  // NO_UCD (unused code)
			int offset, int limit ) 
		throws PersistenceException
	{
		// StringBuilder query = new StringBuilder( "select pi from ProtocolItem pi" );
		Map< String, Object > args = new HashMap< String, Object >( );
		String query = createWhereClause( conditions, args );
		
		return _protocolItemStorage.selectPage( 
				"pi", query, args, limit * offset, limit );
	}
	
	@Deprecated
	public Page< ErrorMessage > getSortedErrorMessages( List< SimpleCondition > conditions, // NO_UCD (unused code)
			String sortField, boolean asc, int offset, int limit ) 
		throws PersistenceException
	{
		Map< String, Object > args = new HashMap< String, Object >( );
		String query = createWhereClause( conditions, args );
		
		List< String > sortFields = new ArrayList< String >( );
		sortFields.add( sortField );
		
		return _errorMessageStorage.selectPage( 
				"em", query, args, limit * offset, limit, sortFields, asc );
	}
	
	public Timestamp getMaxProtocolItemEventDate( ) 
		throws PersistenceException
	{
		return ( Timestamp ) _protocolItemStorage.selectMaxFieldValue( "eventDate" );
	}
	
	public void persistProtocolItem( ProtocolItem protocolItem ) 
		throws PersistenceException
	{
		_protocolItemStorage.executePersistAndFlush( protocolItem );
	}
}
