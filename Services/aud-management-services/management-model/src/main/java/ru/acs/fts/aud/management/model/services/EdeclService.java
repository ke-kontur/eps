package ru.acs.fts.aud.management.model.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.orm.jpa.JpaTemplate;

import ru.acs.fts.aud.management.model.entities.EdeclAlbumDocList;
import ru.acs.fts.aud.management.model.entities.EdeclDocument;
import ru.acs.fts.aud.management.model.entities.EdeclEnvelope;
import ru.acs.fts.aud.management.model.entities.EdeclNotUniqDocument;
import ru.acs.fts.aud.management.model.entities.EdeclProcInformation;
import ru.acs.fts.aud.management.model.entities.EdeclProcState;
import ru.acs.fts.aud.management.model.entities.EdeclResultInfo;

@SuppressWarnings( "deprecation" )
public class EdeclService
{
	private BaseStorage< EdeclAlbumDocList > _edeclAlbumDocLists;
	private BaseStorage< EdeclDocument > _edeclDocuments;
	private BaseStorage< EdeclEnvelope > _edeclEnvelopes;
	private BaseStorage< EdeclNotUniqDocument > _edeclNotUniqDocuments;
	private BaseStorage< EdeclProcInformation > _edeclProcInformations;
	private BaseStorage< EdeclProcState > _edeclProcStates;
	private BaseStorage< EdeclResultInfo > _edeclResultInfo;

	// @formatter:off
	@Required
	public void setJpaTemplate( JpaTemplate jpaTemplate )
	{
		_edeclAlbumDocLists.setJpaTemplate( jpaTemplate );
		_edeclDocuments.setJpaTemplate( jpaTemplate );
		_edeclEnvelopes.setJpaTemplate( jpaTemplate );
		_edeclNotUniqDocuments.setJpaTemplate( jpaTemplate );
		_edeclProcInformations.setJpaTemplate( jpaTemplate );
		_edeclProcStates.setJpaTemplate( jpaTemplate );
		_edeclResultInfo.setJpaTemplate( jpaTemplate );
	}
	
	public JpaTemplate getJpaTemplate( ) { return _edeclAlbumDocLists.getJpaTemplate( ); }
	// @formatter:on
	
	public EdeclService( )
	{
		_edeclAlbumDocLists = new BaseStorage< EdeclAlbumDocList >( EdeclAlbumDocList.class );
		_edeclDocuments = new BaseStorage< EdeclDocument >( EdeclDocument.class );
		_edeclEnvelopes = new BaseStorage< EdeclEnvelope >( EdeclEnvelope.class );
		_edeclNotUniqDocuments = new BaseStorage< EdeclNotUniqDocument >( EdeclNotUniqDocument.class );
		_edeclProcInformations = new BaseStorage< EdeclProcInformation >( EdeclProcInformation.class );
		_edeclProcStates = new BaseStorage< EdeclProcState >( EdeclProcState.class );
		_edeclResultInfo = new BaseStorage< EdeclResultInfo >( EdeclResultInfo.class );
	}
	
	// select
	
	public EdeclProcInformation getProcInformation( String processId )
	{
		return _edeclProcInformations.get( processId );
	}
	
	public EdeclDocument getDocument( String documentId )
	{
		return _edeclDocuments.get( documentId );
	}
	
	public List< EdeclDocument > getDocuments( String documentId )
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select doc from EdeclDocument doc " );
		q.append( "where doc.mainDocument.documentId = :refMainDoc " );
			
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "refMainDoc", documentId );

		List< EdeclDocument > res = _edeclDocuments.select( q.toString( ), args );
		if ( null == res )
			res = new ArrayList< EdeclDocument >( );

		EdeclDocument mdoc = _edeclDocuments.get( documentId );
		if ( null != mdoc )
			res.add( mdoc );
		
		return res;
	}
	
	public EdeclAlbumDocList getAlbumDocListRecord( String documentModeId )
	{
		return _edeclAlbumDocLists.get( documentModeId );
	}
	
	@SuppressWarnings( "unchecked" )
	public List< String > getNotUniqDocumentsIdsByRefDocumentId( String refDocumentId )
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select nud.document.documentId from EdeclNotUniqDocument nud " );
		q.append( "where nud.mainDocument.documentId = :refDocumentId " );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "refDocumentId", refDocumentId );
		
		List< String > res = ( List< String > )_edeclNotUniqDocuments.selectSpecial( q.toString( ), args );
		if ( null == res )
			return new ArrayList< String >( );
		
		return res;
	}
	
	public List< EdeclEnvelope > getEnvelopesByMessageTypeAndProcessId( String messageType, String processId )
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select e from EdeclEnvelope e " );
		q.append( "where e.messageType = :messageType " );
			q.append( " and e.process.processId = :processId " );
			
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "messageType", messageType );
		args.put( "processId", processId );
		
		List< EdeclEnvelope > envelopes = _edeclEnvelopes.select( q.toString( ), args );
		if ( null == envelopes )
			return new ArrayList< EdeclEnvelope >( );
		
		return envelopes;
	}
}
