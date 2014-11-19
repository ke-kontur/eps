package ru.acs.fts.eps2.ws.data.model.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.orm.jpa.JpaTemplate;
import org.springframework.transaction.annotation.Transactional;

import ru.acs.fts.eps2.ws.data.model.entities.Document;

@SuppressWarnings( "deprecation" ) 
public class DocumentService
{
	private BaseStorage< Document > _documentsStorage;
	
	// @formatter:off
	@Required
	public void setJpaTemplate( JpaTemplate jpaTemplate )
	{
		_documentsStorage.setJpaTemplate( jpaTemplate );
	}
	public JpaTemplate getJpaTemplate( ) { return _documentsStorage.getJpaTemplate( ); }
	// @formatter:on
	
	public DocumentService( )
	{
		_documentsStorage = new BaseStorage< Document >( Document.class );		
	}

	@Transactional
	public Document findById( String documentId )
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select d from Document d " );
		q.append( "where d.documentId = :documentId " );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "documentId", documentId );
		
		List< Document > res = _documentsStorage.select( q.toString( ), args );
		if ( null == res || 0 == res.size( ) )
			return null;
		
		return res.get( 0 );
	}
}
