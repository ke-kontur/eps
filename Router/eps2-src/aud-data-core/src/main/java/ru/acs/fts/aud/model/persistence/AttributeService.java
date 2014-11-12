package ru.acs.fts.aud.model.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.orm.jpa.JpaTemplate;
import org.springframework.transaction.annotation.Transactional;

import ru.acs.fts.aud.model.entities.Attribute;
import ru.acs.fts.aud.model.entities.AttributeVersion;
import ru.acs.fts.aud.model.persistence.exception.PersistenceException;

@SuppressWarnings( "deprecation" )
public class AttributeService // NO_UCD (unused code)
{
	private BaseStorage< Attribute > _attributeStorage;
	private BaseStorage< AttributeVersion > _attributeVersionStorage;
	
	public AttributeService( )
	{
		_attributeStorage = new BaseStorage< Attribute >( Attribute.class );
		_attributeVersionStorage = new BaseStorage< AttributeVersion >( AttributeVersion.class );
	}
	
	// @formatter:off
	public void setJpaTemplate( JpaTemplate jpaTemplate )
	{
		_attributeStorage.setJpaTemplate( jpaTemplate );
		_attributeVersionStorage.setJpaTemplate( jpaTemplate );
	}
	
	public JpaTemplate getJpaTemplate( ) { return _attributeStorage.getJpaTemplate( ); }
	// @formatter:on
	
	@Transactional
	public void persistAttribute( Attribute attribute ) 
		throws PersistenceException
	{
		_attributeStorage.executePersistAndFlush( attribute );
	}
	
	public Attribute getAttribute( String attributeId ) 
		throws PersistenceException
	{
		return _attributeStorage.get( attributeId );
	}
	
	@Transactional
	public void mergeAttribute( Attribute attribute ) 
		throws PersistenceException
	{
		_attributeStorage.executeMergeAndFlush( attribute );
	}
	
	@Transactional
	public void removeAttribute( String attributeId ) 
		throws PersistenceException
	{
		_attributeStorage.removeById( attributeId );
	}
		
	@Transactional
	public void persistAttributeVersion( AttributeVersion attributeVersion ) 
		throws PersistenceException
	{
		_attributeVersionStorage.executePersistAndFlush( attributeVersion );
	}
	
	@Transactional
	public void removeAttributeVersion( String attributeVersionId ) 
		throws PersistenceException
	{
		_attributeVersionStorage.removeById( attributeVersionId );
	}
	
	public List< AttributeVersion > getExistingAttributeVersions(
			String documentKindId, String attributeId ) 
		throws PersistenceException
	{
		StringBuilder query = new StringBuilder( "select av from AttributeVersion av" );
		query.append( " where av.documentKindVersion.documentKind.id = :documentKindId" );
		query.append( " and av.attribute.id = :attributeId" );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "documentKindId", documentKindId );
		args.put( "attributeId", attributeId );
		
		return _attributeVersionStorage.select( query.toString( ), args );
	}
	
	public List< AttributeVersion > getSelectedPossibleAttributeVersions( 
			String documentKindId, List< String > excludedDcvIds,
			List< String > excludedSchemaVersions ) 
		throws PersistenceException
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
	
	public AttributeVersion getAttributeVersion( String attributeVersionId ) 
		throws PersistenceException
	{
		return _attributeVersionStorage.get( attributeVersionId );
	}
	
	@Transactional
	public void mergeAttributeVersion( AttributeVersion attributeVersion ) 
		throws PersistenceException
	{
		_attributeVersionStorage.executeMergeAndFlush( attributeVersion );
	}
}
