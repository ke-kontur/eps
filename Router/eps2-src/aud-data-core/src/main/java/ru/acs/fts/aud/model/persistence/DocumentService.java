package ru.acs.fts.aud.model.persistence;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.orm.jpa.JpaTemplate;
import org.springframework.transaction.annotation.Transactional;

import ru.acs.fts.aud.model.entities.Attribute;
import ru.acs.fts.aud.model.entities.AttributeContent;
import ru.acs.fts.aud.model.entities.AttributeVersion;
import ru.acs.fts.aud.model.entities.BusinessAttribute;
import ru.acs.fts.aud.model.entities.BusinessDocumentKind;
import ru.acs.fts.aud.model.entities.DestructionRegister;
import ru.acs.fts.aud.model.entities.Document;
import ru.acs.fts.aud.model.entities.DocumentKind;
import ru.acs.fts.aud.model.entities.DocumentKindVersion;
import ru.acs.fts.aud.model.entities.DocumentRepresentation;
import ru.acs.fts.aud.model.entities.ExpertRegister;
import ru.acs.fts.aud.model.entities.Packet;
import ru.acs.fts.aud.model.entities.ReindexPool;
import ru.acs.fts.aud.model.entities.Schema;
import ru.acs.fts.aud.model.entities.SchemaDependency;
import ru.acs.fts.aud.model.entities.SignatureControlRegister;
import ru.acs.fts.aud.model.entities.SignatureControlResult;
import ru.acs.fts.aud.model.persistence.exception.PersistenceException;
import ru.acs.fts.eps2.utils.CollectionHelper;

@SuppressWarnings( "deprecation" )
public class DocumentService // NO_UCD (for future use)
{
	private BaseStorage< Document > _documentStorage;
	private BaseStorage< DocumentKind > _documentKindStorage;
	private BaseStorage< DocumentKindVersion > _documentKindVersionStorage;
	private BaseStorage< Packet > _packetStorage;
	@Deprecated
	private BaseStorage< Attribute > _attributeStorage;
	@Deprecated
	private BaseStorage< AttributeVersion > _attributeVersionStorage;
	private BaseStorage< DocumentRepresentation > _documentRepresentationStorage;
	private BaseStorage< Schema > _schemaStorage;
	private BaseStorage< SchemaDependency > _schemaDependencyStorage;
	private BaseStorage< BusinessDocumentKind > _businessDocumentKindStorage;
	private BaseStorage< BusinessAttribute > _businessAttributeStorage;
	private BaseStorage< AttributeContent > _attributeContentStorage;
	private BaseStorage< ReindexPool > _reindexPoolStorage;
	
	public DocumentService( )
	{
		_documentStorage = new BaseStorage< Document >( Document.class );
		_documentKindStorage = new BaseStorage< DocumentKind >( DocumentKind.class );
		_documentKindVersionStorage = new BaseStorage< DocumentKindVersion >( DocumentKindVersion.class );
		_packetStorage = new BaseStorage< Packet >( Packet.class );
		_attributeStorage = new BaseStorage< Attribute >( Attribute.class );
		_attributeVersionStorage = new BaseStorage< AttributeVersion >( AttributeVersion.class );
		_documentRepresentationStorage = 
			new BaseStorage< DocumentRepresentation >( DocumentRepresentation.class );
		_schemaStorage = new BaseStorage< Schema >( Schema.class );
		_schemaDependencyStorage = new BaseStorage< SchemaDependency >( SchemaDependency.class );
		_businessDocumentKindStorage = new BaseStorage< BusinessDocumentKind >( BusinessDocumentKind.class );
		_businessAttributeStorage = new BaseStorage< BusinessAttribute >( BusinessAttribute.class );
		_attributeContentStorage = new BaseStorage< AttributeContent >( AttributeContent.class );
		_reindexPoolStorage = new BaseStorage< ReindexPool >( ReindexPool.class );
	}
	
	// @formatter:off
	@Required public void setJpaTemplate( JpaTemplate jpaTemplate ) 
	{ 
		_documentStorage.setJpaTemplate( jpaTemplate );
		_documentKindStorage.setJpaTemplate( jpaTemplate );
		_documentKindVersionStorage.setJpaTemplate( jpaTemplate );
		_packetStorage.setJpaTemplate( jpaTemplate );
		_attributeStorage.setJpaTemplate( jpaTemplate );
		_attributeVersionStorage.setJpaTemplate( jpaTemplate );
		_documentRepresentationStorage.setJpaTemplate( jpaTemplate );
		_schemaStorage.setJpaTemplate( getJpaTemplate( ) );
		_schemaDependencyStorage.setJpaTemplate( getJpaTemplate( ) );
		_businessDocumentKindStorage.setJpaTemplate( jpaTemplate );
		_businessAttributeStorage.setJpaTemplate( jpaTemplate );
		_attributeContentStorage.setJpaTemplate( jpaTemplate );
		_reindexPoolStorage.setJpaTemplate( jpaTemplate );
	}
	public JpaTemplate getJpaTemplate( ) { return _documentStorage.getJpaTemplate( ); }
	// @formatter:on	
	
	@Transactional
	public void mergeDocument( Document doc ) 
		throws PersistenceException
	{
		_documentStorage.executeMergeAndFlush( doc );
	}

	public long getNotDeletedDocumentsCount( ) throws PersistenceException
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select count(d) from Document d " );
		q.append( "where d.deleted = 0 " );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		
		List< Long > res = _documentStorage.selectCount( q.toString( ), args );
		if ( null == res || 0 == res.size( ) )
			return 0;
		
		return res.get( 0 ).longValue( );
	}
	
	public List< Document > getPeriodDocuments( Timestamp from, Timestamp to, boolean isRetented ) throws PersistenceException
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select d from Document d " );
		q.append( "where d.creationDate >= :dateFrom " );
			q.append( " and d.creationDate <= :dateTo " );
			
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "dateFrom", from );
		args.put( "dateTo", to );
		
		List< Document > documents = _documentStorage.select( q.toString( ), args );
		if ( null == documents )
			return new ArrayList< Document >( );
		
		List< Document > result = new ArrayList< Document >( );
		Calendar now = new GregorianCalendar( );
		
		for ( Document doc : documents )
		{
			boolean needToAdd = true;
			if ( isRetented )
			{
				DocumentKindVersion dkv = doc.getDocumentKindVersion( );
				if ( null == dkv )
					needToAdd = false;
				else
				{
					Calendar creationDate = ( Calendar )doc.getCreationDate( ).clone( );
					creationDate.add( Calendar.YEAR, dkv.getDocumentKind( ).getRetentionPeriod( ) );
					
					needToAdd = ( creationDate.compareTo( now ) < 0 );
				}
			}
			if ( needToAdd )
				result.add( doc );
		}
		 
		return result;
	}
	
	public void removeDocumentAndRelated( String documentId ) 
		throws PersistenceException
	{
		Document containerDocument = _documentStorage.get( documentId );
		
		/**
		 * Если документа нет, или в нем есть другие документы - ничего не делаем
		 */
		if ( null == containerDocument || ! containerDocument.isAllInsideDocumentsDeleted( ) )
			return ;
		
		for ( Document doc : containerDocument.getDocumentsInside( ) )
		{
			doc.setDeleted( Document.YES );
			_documentStorage.executeMergeAndFlush( doc );
		}
		
		containerDocument.setDeleted( Document.YES );
		_documentStorage.executeMergeAndFlush( containerDocument );
		
		Packet packet = containerDocument.getPacket( );
		if ( packet.isAllInsideDocumentsDeleted( ) )
		{
			packet.setDeleted( Packet.YES );
			_packetStorage.executeMergeAndFlush( packet );
		}
	}
	
	public List< Document > getCheckingDocumentList( SignatureControlRegister register ) throws PersistenceException
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select d from Document d " );
		q.append( "where d.deleted = 0 " );
			q.append( " and d.creationDate >= :fromDate " );
			q.append( " and d.creationDate <= :toDate " );
			
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "fromDate", register.getServiceDocument( ).getCreationDateStart( ) );
		args.put( "toDate", register.getServiceDocument( ).getCreationDateEnd( ) );
		
		List< Document > docs = _documentStorage.select( q.toString( ), args );
		if ( null == docs || 0 == docs.size( ) )
			return new ArrayList< Document >( );
		
		List< Document > res = new ArrayList< Document >( );
		
		for ( Document doc : docs )
		{
			boolean isOk = true;
			for ( SignatureControlResult rs : doc.getSignatureResults( ) )
			{
				if ( rs.getRegister( ).getId( ).equalsIgnoreCase( register.getId( ) ) )
				{
					isOk = false;
					break;
				}
			}
			
			if ( isOk )
				res.add( doc );
		}
		
		return res;
	}
	
	public List< Document > getDocumentForDeletionList( DestructionRegister register ) throws PersistenceException
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select d from Document d " );
		q.append( "where d.deleted = 0 " );
			q.append( " and d.creationDate >= :fromDate " );
			q.append( " and d.creationDate <= :toDate " );
			
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "fromDate", register.getServiceDocument( ).getCreationDateStart( ) );
		args.put( "toDate", register.getServiceDocument( ).getCreationDateEnd( ) );
		
		List< Document > docs = _documentStorage.select( q.toString( ), args );
		if ( null == docs || 0 == docs.size( ) )
			return new ArrayList< Document >( );
		
		List< Document > res = new ArrayList< Document >( );
		
		for ( Document doc : docs )
		{
			boolean isOk = true;
			for ( SignatureControlResult rs : doc.getSignatureResults( ) )
			{
				if ( rs.getRegister( ).getId( ).equalsIgnoreCase( register.getId( ) ) )
				{
					isOk = false;
					break;
				}
			}
			
			if ( isOk )
				res.add( doc );
		}
		
		return res;
	}

	public List< Document > getDocumentsForRelevanceExpertise( ExpertRegister register ) throws PersistenceException
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select d from Document d " );
		q.append( "where d.deleted = 0 " );
			q.append( " and d.creationDate >= :fromDate " );
			q.append( " and d.creationDate <= :toDate " );
			
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "fromDate", register.getServiceDocument( ).getCreationDateStart( ) );
		args.put( "toDate", register.getServiceDocument( ).getCreationDateEnd( ) );
		
		List< Document > docs = _documentStorage.select( q.toString( ), args );
		if ( null == docs || 0 == docs.size( ) )
			return new ArrayList< Document >( );
		
		List< Document > res = new ArrayList< Document >( );
		
		for ( Document doc : docs )
		{
			boolean isOk = true;
			for ( SignatureControlResult rs : doc.getSignatureResults( ) )
			{
				if ( rs.getRegister( ).getId( ).equalsIgnoreCase( register.getId( ) ) )
				{
					isOk = false;
					break;
				}
			}
			
			if ( isOk )
				res.add( doc );
		}
		
		return res;
	}

	public Document getDocumentByApplieId( String appliedId ) throws PersistenceException
	{
		StringBuilder q = new StringBuilder( );

		q.append( "select d from Document d " );
		q.append( "where d.appliedId = :appliedId" );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "appliedId", appliedId );
		
		List< Document > res = _documentStorage.select( q.toString( ), args );
		if ( null == res || 0 == res.size( ) )
			return null;
		
		return res.get( 0 );
	}
	
	@Transactional
	public void persistDocumentKind( DocumentKind documentKind ) 
		throws PersistenceException
	{
		_documentKindStorage.executePersistAndFlush( documentKind );
	}
	
	public DocumentKind getDocumentKind( String documentKindId ) throws PersistenceException
	{
		return _documentKindStorage.get( documentKindId );
	}
	
	@Transactional
	@Deprecated
	public void persistAttribute( Attribute attribute ) 
		throws PersistenceException
	{
		_attributeStorage.executePersistAndFlush( attribute );
	}
	
	@Deprecated
	public List< Attribute > getAttributes( String documentKindId ) throws PersistenceException
	{
		StringBuilder query = new StringBuilder( "select att from Attribute att" );
		query.append( " where att.documentKind.id = :documentKindId" );
		
		Map< String, Object > arguments = new HashMap< String, Object >( );
		arguments.put( "documentKindId", documentKindId );
		
		return _attributeStorage.select( query.toString( ), arguments );
	}
	
	@Deprecated
	public Attribute getAttribute( String attributeId ) throws PersistenceException
	{
		return _attributeStorage.get( attributeId );
	}
	
	@Deprecated
	@Transactional
	public void mergeAttribute( Attribute attribute ) 
		throws PersistenceException
	{
		_attributeStorage.executeMergeAndFlush( attribute );
	}
	
	@Deprecated
	@Transactional
	public void removeAttribute( String attributeId ) throws PersistenceException
	{
		_attributeStorage.removeById( attributeId );
	}
	
	@Deprecated
	@Transactional
	public void persistAttributeVersion( AttributeVersion attributeVersion ) 
		throws PersistenceException
	{
		_attributeVersionStorage.executePersistAndFlush( attributeVersion );
	}
	
	public DocumentKindVersion getDocumentKindVersion( String documentKindVersionId ) throws PersistenceException
	{
		return _documentKindVersionStorage.get( documentKindVersionId );
	}
	
	@Deprecated
	@Transactional
	public void removeAttributeVersion( String attributeVersionId ) throws PersistenceException
	{
		_attributeVersionStorage.removeById( attributeVersionId );
	}
	
	public List< DocumentKind > getRegisteredDocumentKinds( ) throws PersistenceException
	{
		StringBuilder query = new StringBuilder( "select dk from DocumentKind dk" );
		query.append( " where dk.registered = 1" );
		
		return _documentKindStorage.select( query.toString( ), new HashMap< String, Object >( ) );
	}
	
	@Transactional
	public void mergeDocumentKind( DocumentKind documentKind ) 
		throws PersistenceException
	{
		_documentKindStorage.executeMergeAndFlush( documentKind );
	}
	
	@Transactional
	public void removeDocumentKind( String documentKindId ) throws PersistenceException
	{
		_documentKindStorage.removeById( documentKindId );
	}
	
	public List< DocumentRepresentation > getDocumentRepresentations( String documentKindId ) throws PersistenceException
	{
		StringBuilder query = new StringBuilder( "select dr from DocumentRepresentation dr" );
		query.append( " where dr.documentKindVersion.documentKind.id = :docKindId" );
		
		Map< String, Object > arguments = new HashMap< String, Object >( );
		arguments.put( "docKindId", documentKindId );
		
		return _documentRepresentationStorage.select( query.toString( ), arguments );
	}
	
	public List< DocumentKindVersion > getDocumentKindVersions( String documentKindId ) throws PersistenceException
	{
		StringBuilder query = new StringBuilder( "select dkv from DocumentKindVersion dkv" );
		query.append( " where dkv.documentKind.id = :docKindId" );
		
		Map< String, Object > arguments = new HashMap< String, Object >( );
		arguments.put( "docKindId", documentKindId );
		
		return _documentKindVersionStorage.select( query.toString( ), arguments );
	}
	
	public DocumentRepresentation getDocumentRepresentation( String docRepId ) throws PersistenceException
	{
		return _documentRepresentationStorage.get( docRepId );
	}
	
	@Transactional
	public void removeDocumentRepresentation( String documentRepresentationId ) throws PersistenceException
	{
		_documentRepresentationStorage.removeById( documentRepresentationId );
	}
	
	@Transactional
	public void mergeDocumentRepresentation( DocumentRepresentation documentRepresentation ) 
		throws PersistenceException
	{
		_documentRepresentationStorage.executeMergeAndFlush( documentRepresentation );
	}
	
	@Transactional
	public void persistDocumentRepresentation( DocumentRepresentation documentRepresentation ) 
		throws PersistenceException
	{
		_documentRepresentationStorage.executeMergeAndFlush( documentRepresentation );
	}
	
	public List< DocumentKind > getUnregisteredDocumentKinds( ) throws PersistenceException
	{
		StringBuilder query = new StringBuilder( "select dk from DocumentKind dk" );
		query.append( " where dk.registered = 0 order by dk.documentModeId" );
		
		return _documentKindStorage.select( query.toString( ), new HashMap< String, Object >( ) );
	}
	
	public Schema getSchema( String schemaId ) throws PersistenceException
	{
		return _schemaStorage.get( schemaId );
	}
	
	public List< Schema > getImportedSchemas( String schemaId, List< String > excluded ) throws PersistenceException
	{
		Map< String, Object > args = new HashMap< String, Object >( );
		StringBuilder query1 = new StringBuilder( "select sd.importSchemaId from SchemaDependency sd" );
		query1.append( " where sd.schemaId = :schemaId" );
		
		if ( null != excluded && ! excluded.isEmpty( ) )
		{
			query1.append( " and sd.importSchemaId not IN :excludedList" );
			args.put( "excludedList", excluded );
		}
		
		StringBuilder query2 = new StringBuilder( "select s from Schema s" );
		query2.append( " where s.id IN ( " );
		query2.append( query1.toString( ) );
		query2.append( " )" );
		
		args.put( "schemaId", schemaId );
		
		return _schemaStorage.select( query2.toString( ), args );
	}
	
	@Deprecated
	public List< AttributeVersion > getExistingAttributeVersions(
			String documentKindId, String attributeId ) throws PersistenceException
	{
		StringBuilder query = new StringBuilder( "select av from AttributeVersion av" );
		query.append( " where av.documentKindVersion.documentKind.id = :documentKindId" );
		query.append( " and av.attribute.id = :attributeId" );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "documentKindId", documentKindId );
		args.put( "attributeId", attributeId );
		
		return _attributeVersionStorage.select( query.toString( ), args );
	}
	
	public AttributeVersion getAttributeVersionByDocumentKindVerionAndAttribute( 
			String attributeId, String documentKindVersionId ) throws PersistenceException
	{
		StringBuilder query = new StringBuilder( "select av from AttributeVersion av" );
		query.append( " where av.attribute.id = :attributeId" );
		query.append( " and av.documentKindVersion.id = :documentKindVersionId" );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "attributeId", attributeId );
		args.put( "documentKindVersionId", documentKindVersionId );
		
		return CollectionHelper.getFirst( _attributeVersionStorage.select( query.toString( ), args ) );
	}
	
	@Deprecated
	public List< AttributeVersion > getSelectedPossibleAttributeVersions( 
			String documentKindId, List< String > excludedDcvIds,
			List< String > excludedSchemaVersions ) throws PersistenceException
	{
		Map< String, Object > args = new HashMap< String, Object >( );
		StringBuilder query = new StringBuilder( "select av from AttributeVersion av" );
		query.append( " where av.documentKindVersion.documentKind.id = :documentKindId" );
		
		if ( null != excludedDcvIds && ! excludedDcvIds.isEmpty( ) )
		{
			query.append( " and av.documentKindVersion.id not in :excludedIds" );
			args.put( "excludedIds", excludedDcvIds );
		}
		
		if ( null != excludedSchemaVersions && ! excludedSchemaVersions.isEmpty( ) )
		{
			query.append( " and av.documentKindVersion.schema.version not in :excludedVersion" );
			args.put( "excludedVersion", excludedSchemaVersions );
		}
		
		args.put( "documentKindId", documentKindId );
		
		return _attributeVersionStorage.select( query.toString( ), args );
	}
	
	@Deprecated
	public AttributeVersion getAttributeVersion( String attributeVersionId ) throws PersistenceException
	{
		return _attributeVersionStorage.get( attributeVersionId );
	}
	
	public List< DocumentKindVersion > getAllDocumentKindVersions( ) throws PersistenceException
	{
		StringBuilder query = new StringBuilder( "select dkv from DocumentKindVersion dkv" );
		
		return _documentKindVersionStorage.select( query.toString( ), new HashMap< String, Object >( ) );
	}
	
	public List< DocumentKind > getAllDocumentKinds( ) throws PersistenceException
	{
		StringBuilder query = new StringBuilder( "select dk from DocumentKind dk" );
		
		return _documentKindStorage.select( query.toString( ), new HashMap< String, Object >( ) );
	}
	
	public List< BusinessDocumentKind > getAllBusinessDocumentKinds( ) throws PersistenceException
	{
		StringBuilder query = new StringBuilder( "select bdk from BusinessDocumentKind bdk" );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		
		return _businessDocumentKindStorage.select( query.toString( ), args );
	}
	
	@Transactional
	public void persistBusinessDocumentKind( BusinessDocumentKind businessDocumentKind ) 
		throws PersistenceException
	{
		_businessDocumentKindStorage.executePersistAndFlush( businessDocumentKind );
	}
	
	public BusinessDocumentKind getBusinessDocumentKind( String id ) throws PersistenceException
	{
		return _businessDocumentKindStorage.get( id );
	}
	
	@Transactional
	public void removeBusinesDocumentKind( String id ) throws PersistenceException
	{
		_businessDocumentKindStorage.removeById( id );
	}
	
	public BusinessAttribute getBusinessAttribute( String businessAttributeId ) throws PersistenceException
	{
		return _businessAttributeStorage.get( businessAttributeId );
	}
	
	@Transactional
	public void persistBusinessAttribute( BusinessAttribute businessAttribute ) 
		throws PersistenceException
	{
		_businessAttributeStorage.executePersistAndFlush( businessAttribute );
	}
	
	@Transactional
	public void mergeBusinessAttribute( BusinessAttribute businessAttribute ) 
		throws PersistenceException
	{
		_businessAttributeStorage.executeMergeAndFlush( businessAttribute );
	}
	
	@Transactional
	public void removeBusinessAttribute( String businessAttributeId ) throws PersistenceException
	{
		_businessAttributeStorage.removeById( businessAttributeId );
	}
	
	public Schema getSchemaByNamespace( String namespace ) 
		throws PersistenceException
	{
		StringBuilder query = new StringBuilder( "select s from Schema s" );
		query.append( " where s.namespace = :namespace" );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "namespace", namespace );
		
		return CollectionHelper.getFirst( _schemaStorage.select( query.toString( ), args ) );
	}
	
	@Transactional
	public void mergeSchema( Schema schema ) 
		throws PersistenceException
	{
		_schemaStorage.executeMergeAndFlush( schema );
	}
	
	@Transactional
	public void persistSchema( Schema schema )
		throws PersistenceException
	{
		_schemaStorage.executePersistAndFlush( schema );
	}
	
	public DocumentKind getDocumentKindByDocModeId( String docModeId ) throws PersistenceException
	{
		StringBuilder query = new StringBuilder( "select dk from DocumentKind dk" );
		query.append( " where dk.documentModeId = :docModeId" );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "docModeId", docModeId );
		
		return CollectionHelper.getFirst( _documentKindStorage.select( query.toString( ), args ) );
	}
	
	@Transactional
	public void mergeDocumentKindVersion( DocumentKindVersion documentKindVersion ) 
		throws PersistenceException
	{
		_documentKindVersionStorage.executeMergeAndFlush( documentKindVersion );
	}
	
	public List< Schema > getImportedSchemas( String schemaId ) throws PersistenceException
	{
		StringBuilder query1 = new StringBuilder( "select sd.importSchemaId from SchemaDependency sd" );
		query1.append( " where sd.schemaId = :schemaId" );
		
		StringBuilder query2 = new StringBuilder( "select s from Schema s" );
		query2.append( " where s.schemaId in ( " );
		query2.append( query1 );
		query2.append( " )" );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "schemaId", schemaId );
		
		return _schemaStorage.select( query2.toString( ), args );
	}
	
	@Transactional
	public void persistSchemaDependency( SchemaDependency schemaDependency ) 
		throws PersistenceException
	{
		_schemaDependencyStorage.executePersistAndFlush( schemaDependency );
	}
	
	public DocumentKindVersion getDocumentKindVersion( String documentModeId, List< String > namespaces ) 
		throws PersistenceException
	{
		StringBuilder query = new StringBuilder( "select dkv from DocumentKindVersion dkv" );
		query.append( " where dkv.documentKind.documentModeId = :docModeId" );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		
		if ( ! CollectionHelper.isNullOrEmpty( namespaces ) )
		{
			query.append( " and dkv.schema.namespace in :namespaces" );
			args.put( "namespaces",  namespaces);
		}
		
		args.put( "docModeId", documentModeId );
		
		return CollectionHelper.getFirst( _documentKindVersionStorage.select( query.toString( ), args ) );
	}
	
	public DocumentRepresentation getDocumentRepresentation( String documentKindVersionId, String type ) 
		throws PersistenceException
	{
		StringBuilder query = new StringBuilder( "select dr from DocumentRepresentation dr" );
		query.append( " where dr.documentKindVersion.id = :dkvId" );
		query.append( " and dr.type = :type" );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "dkvId", documentKindVersionId );
		args.put( "type", type );
		
		return CollectionHelper.getFirst( 
				_documentRepresentationStorage.select( query.toString( ), args ) );
	}
	
	@Transactional
	public Integer updateNeedReindex( ) throws PersistenceException
	{
		StringBuilder updateQuery = new StringBuilder( "update Document d set d.needReindex = 1" );
		updateQuery.append( " where d.needReindex != 2" );
		updateQuery.append( " and d.documentKindVersion.id in ( " );
		updateQuery.append( "select distinct av.documentKindVersion.id from AttributeVersion av" );
		updateQuery.append( " where av.hasChanged = 1 )" );
		
		return _documentStorage.updateWithCount( updateQuery.toString( ), new HashMap< String, Object >( ) );
	}
	
	/*
	@Transactional
	public void clearAttributeContent( )
	{
		StringBuilder deleteQuery = new StringBuilder( "delete ML_Attribute_Content ac" );
		deleteQuery.append( " where ac.attribute_version_id in (" );
		deleteQuery.append( "SELECT av.id from ML_Attribute_Version av WHERE av.has_changed = 1 )" );
	}
	*/
	
	@Transactional
	public void clearAttributeContent( ) 
		throws PersistenceException
	{
		StringBuilder deleteQuery = new StringBuilder( "delete from AttributeContent ac" );
		deleteQuery.append( " where ac.attributeVersion.id in ( " );
		deleteQuery.append( "select av.id from AttributeVersion av where av.hasChanged = 1 )" );
		
		_attributeContentStorage.update( deleteQuery.toString( ), 
				new HashMap< String, Object >( ) );
	}
	
	public List< AttributeVersion > getAttributeVersions( ) throws PersistenceException
	{
		StringBuilder query = new StringBuilder( "select av from AttributeVersion av" );
		query.append( " where av.hasChanged = 1 and not exists ( " );
		query.append( " select rp from ReindexPool rp where rp.attributeVersionId = av.id" );
		query.append( " and rp.documentKindVersionId = av.documentKindVersion.id )" );
		
		return _attributeVersionStorage.select( query.toString( ), new HashMap< String, Object >( ) );
	}
	
	@Transactional
	public void persistReindexPool( ReindexPool reindexPool ) 
		throws PersistenceException
	{
		_reindexPoolStorage.executePersistAndFlush( reindexPool );
	}
	
	@Transactional
	public void updateHasChanged( ) 
		throws PersistenceException
	{
		StringBuilder updateQuery = new StringBuilder( "update AttributeVersion av" );
		updateQuery.append( " set av.hasChanged = 0 where av.hasChanged = 1" );
		
		_attributeVersionStorage.update( updateQuery.toString( ), new HashMap< String, Object >( ) );
	}
	
	public List< DocumentKindVersion > getDocumentKindVersionsFromReindexPool( ) 
		throws PersistenceException
	{
		StringBuilder query = new StringBuilder( "select dkv from DocumentKindVersion dkv" );
		query.append( " where dkv.id in" );
		query.append( " ( select rp.documentKindVersionId from ReindexPool rp )" );
		
		return _documentKindVersionStorage.select( query.toString( ), new HashMap< String, Object >( ) );
	}
	
	public List< AttributeVersion > getAttributeVersionsFromReindexPool( ) 
		throws PersistenceException
	{
		StringBuilder query = new StringBuilder( "select av from AttributeVersion av" );
		query.append( " where av.id in ( select rp.attributeVersionId from ReindexPool rp )" );
		
		return _attributeVersionStorage.select( 
				query.toString( ), new HashMap< String, Object >( ) );
	}
	
	public List< Document > getDocumentsByDocumentKindVersion( String documentKindVersionId ) 
		throws PersistenceException
	{
		StringBuilder query = new StringBuilder( "select d from Document d" );
		query.append( " where d.documentKindVersion.id = :dkvId and d.needReindex = 1" );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "dkvId", documentKindVersionId );
		
		return _documentStorage.select( query.toString( ), args );
	}
	
	@Transactional
	public void persistAttributeContent( AttributeContent attributeContent ) 
		throws PersistenceException
	{
		_attributeContentStorage.executePersistAndFlush( attributeContent );
	}
	
	@Transactional
	public void clearRendexPool( ) 
		throws PersistenceException
	{
		StringBuilder query = new StringBuilder( "delete from ReindexPool rp" );
		
		_reindexPoolStorage.update( query.toString( ), new HashMap< String, Object >( ) );
	}
	
	@Deprecated
	@Transactional
	public void mergeAttributeVersion( AttributeVersion attributeVersion ) 
		throws PersistenceException
	{
		_attributeVersionStorage.executeMergeAndFlush( attributeVersion );
	}
	
	@Transactional
	public void mergeBusinessDocumentKind( BusinessDocumentKind businessDocumentKind ) 
		throws PersistenceException
	{
		_businessDocumentKindStorage.executeMergeAndFlush( businessDocumentKind );
	}
	
	public BusinessDocumentKind getBusinessDocumentKindByDocModeId( String documentModeId ) 
		throws PersistenceException
	{
		StringBuilder query = new StringBuilder( "select bdk from BusinessDocumentKind bdk" );
		query.append( " where bdk.documentModeId = :docModeId" );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "docModeId", documentModeId );
		
		return CollectionHelper.getFirst( _businessDocumentKindStorage.select( query.toString( ), args ) );
	}
	
	public BusinessAttribute getBusinessAttribute( String businessAttributeId, String attributeId ) 
		throws PersistenceException
	{
		StringBuilder query = new StringBuilder( "select ba from BusinessAttribute ba" );
		query.append( " where ba.id = :businessAttributeId and " );		
		query.append( "( select a from Attribute a where a.id = :attributeId )" );
		query.append( " in ba.attributes" );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "businessAttributeId", businessAttributeId );
		args.put( "attributeId", attributeId );
		
		return CollectionHelper.getFirst( _businessAttributeStorage.select( query.toString( ), args ) );
	}
	
	public List< AttributeVersion > getFederalAttributeVersions( ) 
		throws PersistenceException
	{
		StringBuilder query = new StringBuilder( "select av from AttributeVersion av" );
		query.append( " where av.attribute.isFederal = 1" );
		
		return _attributeVersionStorage.select( query.toString( ), new HashMap< String, Object >( ) );
	}
	
	public List< BusinessDocumentKind > getFederalBusinessDocumentKinds( ) 
		throws PersistenceException
	{
		StringBuilder query = new StringBuilder( "select bdk from BusinessDocumentKind bdk" );
		query.append( " where bdk.isFederal = 1" );
		
		return _businessDocumentKindStorage.select( query.toString( ), new HashMap< String, Object >( ) );
	}
}
