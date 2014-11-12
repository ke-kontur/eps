package ru.acs.fts.aud.management.model.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.orm.jpa.JpaTemplate;

import ru.acs.fts.aud.management.model.entities.EdarchArchive;
import ru.acs.fts.aud.management.model.entities.EdarchDocument;

@SuppressWarnings( "deprecation" )
public class EdarchService
{
	private BaseStorage< EdarchArchive > _edarchArchives;
	private BaseStorage< EdarchDocument > _edarchDocument;
	
	// @formatter:off
	@Required
	public void setJpaTemplate( JpaTemplate jpaTemplate )
	{
		_edarchArchives.setJpaTemplate( jpaTemplate );
		_edarchDocument.setJpaTemplate( jpaTemplate );
	}
	
	public JpaTemplate getJpaTemplate( ) { return _edarchArchives.getJpaTemplate( ); }
	// @formatter:on
	
	public EdarchService( )
	{
		_edarchArchives = new BaseStorage< EdarchArchive >( EdarchArchive.class );
		_edarchDocument = new BaseStorage< EdarchDocument >( EdarchDocument.class );
	}
	
	public List< EdarchDocument > getDocuments( String archId, String archDocId )
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select ea from EdarchDocument ea " );
		q.append( "where ea.idInternal = :archDocId " );
			q.append( " and ea.archive.idInternal = :archId " );
			
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "archId", archId );
		args.put( "archDocId", archDocId );
		
		List< EdarchDocument > docs = _edarchDocument.select( q.toString( ), args );
		if ( null == docs )
			return new ArrayList< EdarchDocument >( );
		
		return docs;
	}
}
