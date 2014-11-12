package ru.acs.fts.aud.model.persistence;

import java.math.BigInteger;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.orm.jpa.JpaTemplate;

import ru.acs.fts.aud.model.entities.ArchiveRequest;
import ru.acs.fts.aud.model.entities.ArchiveResponse;
import ru.acs.fts.aud.model.entities.AttributeContent;
import ru.acs.fts.aud.model.entities.AttributeVersion;
import ru.acs.fts.aud.model.entities.Document;
import ru.acs.fts.aud.model.entities.DocumentKindVersion;
import ru.acs.fts.aud.model.entities.DocumentRepresentation;
import ru.acs.fts.aud.model.entities.Packet;
import ru.acs.fts.aud.model.entities.PacketGTD;
import ru.acs.fts.aud.model.persistence.exception.PersistenceException;
import ru.acs.fts.eps2.utils.CollectionHelper;

@SuppressWarnings( "deprecation" )
public class ArchiveService
{
	// public static final String XHTML = "XHTML";
	// public static final String PDF = "PDF";
	
	private BaseStorage< ArchiveRequest > _archiveRequestStorage;
	private BaseStorage< Document > _documentStorage;
	private BaseStorage< Packet > _packetStorage;
	private BaseStorage< PacketGTD > _packetGtdStorage;
	private BaseStorage< DocumentKindVersion > _documentKindVersionStorage;
	private BaseStorage< AttributeContent > _attributeContentStorage;
	private BaseStorage< AttributeVersion > _attributeVersionStorage;
	private BaseStorage< ArchiveResponse > _archiveResponseStorage;
	private BaseStorage< DocumentRepresentation > _documentRepresentationStorage;
	
	public ArchiveService( )
	{
		_archiveRequestStorage = new BaseStorage< ArchiveRequest >( ArchiveRequest.class );
		_documentStorage = new BaseStorage< Document >( Document.class );
		_packetStorage = new BaseStorage< Packet >( Packet.class );
		_packetGtdStorage = new BaseStorage< PacketGTD >( PacketGTD.class );
		_documentKindVersionStorage = new BaseStorage< DocumentKindVersion >( DocumentKindVersion.class );
		_attributeContentStorage = new BaseStorage< AttributeContent >( AttributeContent.class );
		_attributeVersionStorage = new BaseStorage< AttributeVersion >( AttributeVersion.class );
		_archiveResponseStorage = new BaseStorage< ArchiveResponse >( ArchiveResponse.class );
		_documentRepresentationStorage = new BaseStorage< DocumentRepresentation >( DocumentRepresentation.class );
	}
	
	// @formatter:off
	@Required public void setJpaTemplate( JpaTemplate jpaTemplate ) 
	{
		_archiveRequestStorage.setJpaTemplate( jpaTemplate );
		_documentStorage.setJpaTemplate( jpaTemplate );
		_packetStorage.setJpaTemplate( jpaTemplate );
		_packetGtdStorage.setJpaTemplate( jpaTemplate );
		_documentKindVersionStorage.setJpaTemplate( jpaTemplate );
		_attributeContentStorage.setJpaTemplate( jpaTemplate );
		_attributeVersionStorage.setJpaTemplate( jpaTemplate );
		_archiveResponseStorage.setJpaTemplate( jpaTemplate );
		_documentRepresentationStorage.setJpaTemplate( jpaTemplate );
	}
	
	public JpaTemplate getJpaTemplate( ) { return _archiveRequestStorage.getJpaTemplate( ); }
	// @formatter:on
			
	public void persistArchiveRequest( ArchiveRequest request ) 
		throws PersistenceException
	{
		_archiveRequestStorage.executePersistAndFlush( request );
	}
	
	/** (mrdekk) ok! 
	 * @throws PersistenceException */
	public Document getDocument( String documentId ) 
		throws PersistenceException
	{
		return _documentStorage.get( documentId );
	}
	
	@Deprecated
	public void mergeArchiveRequest( ArchiveRequest request )  // NO_UCD (deprecated added)
		throws PersistenceException
	{
		_archiveRequestStorage.executeMergeAndFlush( request );
	}
	
	public void merge( Packet packet ) 
		throws PersistenceException
	{
		_packetStorage.executeMergeAndFlush( packet );
	}
	
	public List< ArchiveRequest > getAllRequests( ) 
		throws PersistenceException
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select areq from ArchiveRequest areq " );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		
		List< ArchiveRequest > reqs = _archiveRequestStorage.select( q.toString( ), args );
		if ( null == reqs )
			return new ArrayList< ArchiveRequest >( );
		
		return reqs;
	}

	public long getRequestsCount( ) 
		throws PersistenceException
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select count(areq) from ArchiveRequest areq " );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		
		List< Long > res = _archiveRequestStorage.selectCount( q.toString( ), args );
		if ( null == res || 0 == res.size( ) )
			return 0;
		
		return res.get( 0 ).longValue( );
	}
	
	public BigInteger getDocMaxVersion( String appliedId ) throws PersistenceException
	{
		String query = "select max(doc.versionNumber) from Document doc where doc.appliedId = :appliedId";
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "appliedId", appliedId );
		
		Integer num = ( Integer ) _documentStorage.selectSingleResult( query, args );

		return BigInteger.valueOf( num );
	}

	/** (mrdekk) ok! 
	 * @throws PersistenceException */
	public ArchiveRequest getRequestByEnvelopeId( String envelopeId ) 
		throws PersistenceException
	{
		String query = "select ar from ArchiveRequest ar where ar.envelopeId = :envelopeId";
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "envelopeId", envelopeId );
		
		return CollectionHelper.getFirst( _archiveRequestStorage.select( query, args ) );
	}
	
	/** (mrdekk) ok! 
	 * @throws PersistenceException */
	public boolean existsRequestWithEnvelopeId( String envelopeId ) 
		throws PersistenceException
	{
		return ( null != getRequestByEnvelopeId( envelopeId ) );
	}
	
	public ArchiveRequest getRequestByDocumentId( String documentId ) 
		throws PersistenceException
	{
		String query = "select ar from ArchiveRequest ar where ar.documentId = :documentId";
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "documentId", documentId );
		
		return CollectionHelper.getFirst( _archiveRequestStorage.select( query, args ) );
	}
	
	public boolean existsRequestWithDocumentId( String documentId ) 
		throws PersistenceException
	{
		return null != getRequestByDocumentId( documentId );
	}

	/** (mrdekk) ok! 
	 * @throws PersistenceException */
	public Packet getPacket( String packetId ) 
		throws PersistenceException
	{
		return _packetStorage.get( packetId );
	}
	
	/** (mrdekk) ok! 
	 * @throws PersistenceException */
	public PacketGTD getPacketGTD( String customsCode, String gtdNumber, Date registrationDate ) 
		throws PersistenceException
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select pgtd from PacketGTD pgtd " );
		q.append( "where pgtd.custCode = :custCode " );
			q.append( "and pgtd.date = :date " );
			q.append( "and pgtd.regnum = :regnum " );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "custCode", customsCode );
		args.put( "date", registrationDate );
		args.put( "regnum", gtdNumber );
		
		return CollectionHelper.getFirst( _packetGtdStorage.select( q.toString( ), args ) );
	}
	
	public List<PacketGTD> getPacketsGTDByPacket( Packet packet ) throws PersistenceException
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select pgtd from PacketGTD pgtd " );
		q.append( "where pgtd.archPacket = :archPacket " );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "archPacket", packet );
		return _packetGtdStorage.select( q.toString( ), args );
	}
	
	public DocumentKindVersion getDocumentKindVersion( String documentModeId, String schemaNamespace ) 
		throws PersistenceException
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select dkv from DocumentKindVersion dkv " );
		q.append( "where dkv.documentKind.documentModeId = :documentModeId " );
		q.append( "and dkv.schema.namespace = :schemaNamespace " );
		
		Map< String, Object > args = new HashMap< String, Object > ( );
		args.put( "documentModeId", documentModeId );
		args.put( "schemaNamespace", schemaNamespace );
		
		return CollectionHelper.getFirst( _documentKindVersionStorage.select( q.toString( ), args ) );
	}
	
	/** (mrdekk) ok! 
	 * @throws PersistenceException */
	public boolean isPacketExist( String packetId ) 
		throws PersistenceException
	{
		return _packetStorage.exists( packetId );
	}

	/** (mrdekk) ok! 
	 * @throws PersistenceException */
	public boolean isDocumentExist( String documentId ) 
		throws PersistenceException
	{
		return _documentStorage.exists( documentId );
	}
	
	public void persistPacket( Packet packet ) 
		throws PersistenceException
	{
		_packetStorage.executePersistAndFlush( packet );
	}
	
	public void persistPacketGTD( PacketGTD packetGtd ) 
		throws PersistenceException
	{
		_packetGtdStorage.executePersistAndFlush( packetGtd );
	}
	
	/** (mrdekk) ok! 
	 * @throws PersistenceException */
	public Packet getPacket( String packetId, boolean isDeleted ) 
		throws PersistenceException
	{
		short deleted = ( short ) ( isDeleted ? 1 : 0 );
		
		String query = "select p from Packet p where p.id = :packetId and p.deleted = :deleted";
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "packetId", packetId );
		args.put( "deleted", deleted );
		
		return CollectionHelper.getFirst( _packetStorage.select( query, args ) );
	}
	
	public Document getDocument( String versionChain, int versionNumber, boolean deleted ) 
		throws PersistenceException
	{
		short dltd = ( short ) ( deleted ? 1 : 0 );
		
		StringBuilder query = new StringBuilder( "select d from Document d" );
		query.append( " where d.versionChain = :versionChain and d.deleted = :deleted" );
		query.append( " and d.versionNumber = :versionNumber" );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "versionChain", versionChain );
		args.put( "deleted", dltd );
		args.put( "versionNumber", versionNumber );
		
		return CollectionHelper.getFirst( _documentStorage.select( query.toString( ), args ) );
	}
	
	public int getNextVersionNumber( String versionChain, boolean deleted )
		throws PersistenceException
	{
		short dltd = ( short )( deleted ? 1 : 0 );
		
		StringBuilder q = new StringBuilder( );
		
		q.append( "select d from Document d " );
		q.append( "where d.versionChain = :versionChain and d.deleted = :deleted" );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "versionChain", versionChain );
		args.put( "deleted", dltd );
		
		List< Document > res = _documentStorage.select( q.toString( ), args );
		if ( null == res || 0 == res.size( ) )
			return 1;
		
		int max = -1;
		for ( Document d : res )
		{
			if ( d.getVersionNumber( ) > max )
				max = d.getVersionNumber( );
		}
		
		if ( -1 == max )
			max = 0;
		
		return ( max + 1 );
	}
	
	public void persistDocument( Document document ) 
		throws PersistenceException
	{
		_documentStorage.executePersistAndFlush( document );
	}
	
	public void mergeDocument( Document document ) 
		throws PersistenceException
	{
		_documentStorage.executeMergeAndFlush( document );
	}
	
	public void persistAttributeContent( AttributeContent attributeContent ) 
		throws PersistenceException
	{
		_attributeContentStorage.executePersistAndFlush( attributeContent );
	}
		
	
	public List< Packet > getPacketsByAppliedId( String appliedId, boolean deleted ) 
		throws PersistenceException
	{
		short dltd = ( short ) ( deleted ? 1 : 0 );
		
		String query = "select p from Packet p where p.appliedId = :appliedId and p.deleted = :deleted";
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "appliedId", appliedId );
		args.put( "deleted", dltd );
		
		return _packetStorage.select( query, args );
	}
	
	public List< Packet > getPackets( String customCode, Date regDate, String gtdNumber ) 
		throws PersistenceException
	{
		String conditionString = "pgtd.custCode = :custCode and pgtd.regnum = :gtdNumber and pgtd.date = :regDate";
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "custCode", customCode );
		args.put( "gtdNumber", gtdNumber );
		args.put( "regDate", regDate );
		
		return _packetGtdStorage.selectFields( "archPacket", "pgtd", conditionString, args, true );
	}
	
	public List< Document > getAllVersionsDocuments( String versionChain, boolean deleted ) 
		throws PersistenceException
	{
		short dltd = ( short ) ( deleted ? 1 : 0 );
		
		StringBuilder query = new StringBuilder( "select d from Document d where d.versionChain = :versionChain" );
		query.append( " and d.deleted = :deleted" );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "versionChain", versionChain );
		args.put( "deleted", dltd );
		
		return _documentStorage.select( query.toString( ), args );
	}

	public Document getActualDocument( String versionChain, boolean deleted, boolean actual ) 
		throws PersistenceException
	{
		String query = "select d from Document d where d.versionChain = :versionChain and d.deleted = :deleted and d.actual = :actual";
		
		Map< String, Object > args = new HashMap< String, Object > ( );
		args.put( "deleted", deleted ? 1 : 0 );
		args.put( "actual", actual ? 1 : 0 );
		args.put( "versionChain", versionChain );
		
		return CollectionHelper.getFirst( _documentStorage.select( query, args ) );
	}
	
	public Document getActualDocument( String versionChain ) 
		throws PersistenceException
	{
		return getActualDocument( versionChain, false, true );
	}
	
	@Deprecated
	public AttributeVersion getAttributeVersion( DocumentKindVersion documentKindVersion, String attributeName ) 
		throws PersistenceException
	{
		StringBuilder query = new StringBuilder( "select av from AttributeVersion av where av.attribute.name = :attributeName" );
		query.append( " and av.documentKindVersion = :documentKindVersion" );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "attributeName", attributeName );
		args.put( "documentKindVersion", documentKindVersion );
		
		return CollectionHelper.getFirst( _attributeVersionStorage.select( query.toString( ), args ) );
	}
	
	/*
	 * XXX Данная функция нигде не используется, но может пригодиться
	 */
	public ArchiveResponse getArchiveResponseByRefDocumentId( String refDocumentId ) 
		throws PersistenceException
	{
		String query = "select aresp from ArchiveResponse aresp where aresp.refDocumentId = :refDocumentId";
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "refDocumentId", refDocumentId );
		
		return _archiveResponseStorage.selectUnique( query, args );
	}
	
	public List< Document > getDocumentsByContainer( Document container, boolean isDeleted ) 
		throws PersistenceException
	{
		short deleted = ( short )( isDeleted ? 1 : 0 );
		
		String query = "select d from Document d where d.documentContainer = :container and d.deleted = :deleted";
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "container", container );
		args.put( "deleted", deleted );
		
		return _documentStorage.select( query, args );
	}
	
	public List< Document > getDocumentsByAppliedId( String appliedId, boolean isDeleted ) 
			throws PersistenceException
		{
			short deleted = ( short )( isDeleted ? 1 : 0 );
			
			String query = "select d from Document d where d.appliedId = :appliedId and d.deleted = :deleted";
			
			Map< String, Object > args = new HashMap< String, Object >( );
			args.put( "appliedId", appliedId );
			args.put( "deleted", deleted );
			
			return _documentStorage.select( query, args );
		}
	
	public DocumentRepresentation getDocumentRepresentation( DocumentKindVersion documentKindVersion, String documentRepresentationType ) 
		throws PersistenceException
	{
		StringBuilder query = new StringBuilder( "select dr from DocumentRepresentation dr" );
		query.append( " where dp.documentKindVersion = :documentKindVersion and dr.type = :type" );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "documentKindVersion", documentKindVersion );
		args.put( "type", documentRepresentationType );
		
		return _documentRepresentationStorage.selectUnique( query.toString( ), args );
	}

	public List< Document > getDocumentReportLoadStatistics( Timestamp dateBegin, Timestamp dateEnd, String dateIndicator ) 
		throws PersistenceException
	{
		StringBuilder query = new StringBuilder( "select d from Document d" );
		
		if ( dateIndicator.equals( "1" ) )
		{
			query.append( " where d.deleted = :deleted and d.packet.creationDate >= :dateBegin" );
			query.append( " and d.packet.creationDate <= :dateEnd" );
		}
		else
		{
			query.append( ", PacketGTD gtd where d.deleted = :deleted and d.packet = gtd.archPacket" );
			query.append( " and gtd.date >= :dateBegin and gtd.date <= :dateEnd" );
		}
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "deleted", ( short )0 );
		args.put( "dateBegin", dateBegin );
		args.put( "dateEnd", dateEnd );
		
		return _documentStorage.select( query.toString( ), args );
	}

	public void persistArchiveResponse( ArchiveResponse archiveResponse ) 
		throws PersistenceException
	{
		_archiveResponseStorage.executePersistAndFlush( archiveResponse );
	}
}
