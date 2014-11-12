package ru.acs.fts.eps2.model.services;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.orm.jpa.JpaTemplate;

import ru.acs.fts.eps2.model.entities.Edarch_Archive;
import ru.acs.fts.eps2.model.entities.Edarch_Archive_Docs;
import ru.acs.fts.eps2.model.entities.Edarch_Archive_Docs_Ids;
import ru.acs.fts.eps2.model.entities.Edarch_Archive_Docs_WithContent;
import ru.acs.fts.eps2.model.entities.Edarch_Read_Access;
import ru.acs.fts.eps2.model.entities.Edarch_Read_Access_Ids;
import ru.acs.fts.eps2.model.entities.Edarch_Reqinfo;
import ru.acs.fts.eps2.model.entities.Edarch_Reqinfo_Ids;
import ru.acs.fts.eps2.model.entities.ExtEadManifest;
import ru.acs.fts.eps2.model.services.ead.ArchiveStageStatuses;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.utils.CollectionHelper;

@SuppressWarnings( "deprecation" )
public class EdarchService implements IGenericService
{
	public static final int ARCH_ID_LENGTH = 27;
	
	private BaseStorage< Edarch_Archive > _edarchArchive;
	private BaseStorage< Edarch_Archive_Docs > _archiveDocs;
	private BaseStorage< Edarch_Archive_Docs_WithContent > _archiveDocsWithContent;
	private BaseStorage< Edarch_Reqinfo > _reqInfos;
	private BaseStorage< Edarch_Read_Access > _readAccesses;
	
	private BaseStorage< ExtEadManifest > _extEadManifest;
	
	public EdarchService( )
	{
		_edarchArchive = new BaseStorage< Edarch_Archive >( Edarch_Archive.class );
		_archiveDocs = new BaseStorage< Edarch_Archive_Docs >( Edarch_Archive_Docs.class );
		_archiveDocsWithContent = new BaseStorage< Edarch_Archive_Docs_WithContent >( Edarch_Archive_Docs_WithContent.class );
		_reqInfos = new BaseStorage< Edarch_Reqinfo >( Edarch_Reqinfo.class );
		_readAccesses = new BaseStorage< Edarch_Read_Access >( Edarch_Read_Access.class );

		_extEadManifest = new BaseStorage< ExtEadManifest >( ExtEadManifest.class );
	}
	

	@Override
	public void setJpaTemplate( JpaTemplate jpaTemplate )
	{
		_archiveDocs.setJpaTemplate( jpaTemplate );
		_archiveDocsWithContent.setJpaTemplate( jpaTemplate );
		_reqInfos.setJpaTemplate( jpaTemplate );
		_readAccesses.setJpaTemplate( jpaTemplate );
		_extEadManifest.setJpaTemplate( jpaTemplate );
		_edarchArchive.setJpaTemplate( jpaTemplate );
	}

	@Override
	public JpaTemplate getJpaTemplate( )
	{
		return _archiveDocs.getJpaTemplate( );
	}
	
	public void merge( Edarch_Archive_Docs docs )
		throws DatabaseException
	{
		_archiveDocs.mergeAndFlush( docs );
	}
	
	public void merge( Edarch_Archive archive ) 
		throws DatabaseException
	{
		_edarchArchive.mergeAndFlush( archive );
	}
	
	public void merge( Edarch_Reqinfo reqInfo )
		throws DatabaseException
	{
		_reqInfos.mergeAndFlush( reqInfo );
	}
	
	public void merge( ExtEadManifest manifest )
		throws DatabaseException
	{
		_extEadManifest.mergeAndFlush( manifest );
	}
	
	public void persist( Edarch_Read_Access readAccess )
		throws DatabaseException
	{
		_readAccesses.persistAndFlush( readAccess );
	}
	
	public void persist( ExtEadManifest manifest )
		throws DatabaseException
	{
		_extEadManifest.persistAndFlush( manifest );
	}
	
	public void persist( Edarch_Archive_Docs doc ) 
		throws DatabaseException
	{
		_archiveDocs.persistAndFlush( doc );
	}
	
	public void persist( Edarch_Archive_Docs_WithContent doc ) 
		throws DatabaseException
	{
		_archiveDocsWithContent.persistAndFlush( doc );
	}
	
	public void persist( Edarch_Archive archive )
		throws DatabaseException
	{
		_edarchArchive.persistAndFlush( archive );
	}
	
	public void remove( ExtEadManifest manifest )
		throws DatabaseException
	{
		_extEadManifest.remove( manifest );
	}
	
	public void remove( Edarch_Archive_Docs archDoc )
		throws DatabaseException
	{
		_archiveDocs.remove( archDoc );
	}
	
	public void remove( Edarch_Archive_Docs_WithContent archDocWithContext )
		throws DatabaseException
	{
		_archiveDocsWithContent.remove( archDocWithContext );
	}
	
	public Edarch_Archive_Docs getDocument( String archId, String archDocId )
			throws DatabaseException
	{
		Edarch_Archive_Docs_Ids id = new Edarch_Archive_Docs_Ids( );
		id.setArdocArchIdinternal( archId );
		id.setArdocIdinternal( archDocId );
		
		return _archiveDocs.get( id ); 		
	}
	
	public Edarch_Archive_Docs_WithContent getDocumentWithContent( String archId, String archDocId )
		throws DatabaseException
	{
		Edarch_Archive_Docs_Ids id = new Edarch_Archive_Docs_Ids( );
		id.setArdocArchIdinternal( archId );
		id.setArdocIdinternal( archDocId );
		
		return _archiveDocsWithContent.get( id );		
	}
	
	public Edarch_Read_Access getReadAccess( String archId, String archDocId, String participantId )
		throws DatabaseException
	{
		Edarch_Read_Access_Ids id = new Edarch_Read_Access_Ids( );
		id.setArchIdInternal( archId );
		id.setIdInternal( archDocId );
		id.setParticipantId( participantId );
		
		return _readAccesses.get( id );
	}
		
	public List< ExtEadManifest > getExternalEadManifests( String reqEnvelopeId )
		throws DatabaseException
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select mf from ExtEadManifest mf " );
		q.append( "where mf.requestEnvelopeId = :requestEnvelopeId " );
				
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "requestEnvelopeId", reqEnvelopeId );
		
		return _extEadManifest.select( q.toString( ), args );
	}

	public List< ExtEadManifest > getExternalEadManifests( Calendar deadline, String softVersion )
		throws DatabaseException
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select mf from ExtEadManifest mf " );
		q.append( "where mf.requestDate < :deadline " );
			q.append( " and mf.softVersion = :softVersion " );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "deadline", deadline );
		args.put( "softVersion", softVersion );
		
		return _extEadManifest.select( q.toString( ), args );
	}
		
	public List< Edarch_Reqinfo > getReqInfosByDocumentId( String documentId )
		throws DatabaseException
	{
		StringBuilder bld = new StringBuilder( );
		
		bld.append( "select ri from Edarch_Reqinfo ri " );
		bld.append( "where ri.reqDocId = :refDocumentId " );
		
		Map< String, Object > arguments = new HashMap< String, Object >( );
		arguments.put( "refDocumentId", documentId );
		
		return _reqInfos.select( bld.toString( ), arguments );		
	}
	
	public Edarch_Reqinfo getReqInfo( Edarch_Reqinfo_Ids ids )
		throws DatabaseException
	{
		return _reqInfos.get( ids );
	}
	
	public List< Edarch_Reqinfo > getReqInfosByArchIdAndDocId( String archId, String archDocId )
		throws DatabaseException
	{
		StringBuilder bld = new StringBuilder( );
		
		bld.append( "select ri from Edarch_Reqinfo ri " );
		bld.append( "where ri.idInternal = :archId " );
			bld.append( " and ri.ardocIdInternal = :archDocId " );
			
		Map< String, Object > arguments = new HashMap< String, Object >( );
		arguments.put( "archId", archId );
		arguments.put( "archDocId", archDocId );
		
		return _reqInfos.select( bld.toString( ), arguments );
	}

	public Edarch_Archive getArchive( String archId )
		throws DatabaseException
	{
		
		StringBuilder sb = new StringBuilder( );

		sb.append( "select arch from Edarch_Archive arch " );
		sb.append( "where arch.idInternal = :archId " );

		Map< String, Object > arguments = new HashMap< String, Object >( );
		arguments.put( "archId", archId );

		List< Edarch_Archive > archives = _edarchArchive.select( sb.toString( ), arguments );

		if ( null == archives || archives.isEmpty( ) )
			return null;

		return archives.get( 0 );
	}
	
	public Edarch_Archive_Docs getArchDocument( String archDocId )
		throws DatabaseException
	{
		StringBuilder query = new StringBuilder( );
		
		query.append( "select doc from Edarch_Archive_Docs doc " );
		query.append( "where doc.ardocIdinternal = :documentId " );
		query.append( "order by doc.ardocCreateDate desc" );
		
		Map< String, Object > arguments = new HashMap< String, Object >( );
		arguments.put( "documentId", archDocId );
		
		List< Edarch_Archive_Docs > docs = 
			_archiveDocs.select( query.toString( ), arguments );
		
		return CollectionHelper.getFirst( docs );		
	}
	
	public Edarch_Archive_Docs getArchDocument_ED( String documentId )
		throws DatabaseException
	{
		StringBuilder query = new StringBuilder( );
		
		query.append( "select doc from Edarch_Archive_Docs doc " );
		query.append( "where doc.ardocDocumentid = :documentId " );
		query.append( "order by doc.ardocCreateDate desc" );
		
		Map< String, Object > arguments = new HashMap< String, Object >( );
		arguments.put( "documentId", documentId );
		
		List< Edarch_Archive_Docs > docs = 
			_archiveDocs.select( query.toString( ), arguments );
		
		return CollectionHelper.getFirst( docs );
	}	
			
	public Edarch_Archive_Docs getInitDocument( String documentId )
		throws DatabaseException
	{
		StringBuilder query = new StringBuilder( );
		
		query.append( "select doc from Edarch_Archive_Docs doc " );
		query.append( "where doc.ardocIdinternal = :documentId " );
			query.append( "and doc.ardocRefdocumentid IS NULL " );
		query.append( "order by doc.ardocCreateDate desc" );
		
		Map< String, Object > arguments = new HashMap< String, Object >( );
		arguments.put( "documentId", documentId );
		
		List< Edarch_Archive_Docs > docs = 
			_archiveDocs.select( query.toString( ), arguments );
		
		return CollectionHelper.getFirst( docs );
	}

	public Edarch_Archive_Docs getInitDocument_ED( String documentId )
		throws DatabaseException
	{
		StringBuilder query = new StringBuilder( );
		
		query.append( "select doc from Edarch_Archive_Docs doc " );
		query.append( "where doc.ardocDocumentid = :documentId " );
			query.append( "and doc.ardocRefdocumentid IS NULL " );
		query.append( "order by doc.ardocCreateDate desc" );
		
		Map< String, Object > arguments = new HashMap< String, Object >( );
		arguments.put( "documentId", documentId );
		
		List< Edarch_Archive_Docs > docs = 
			_archiveDocs.select( query.toString( ), arguments );
		
		return CollectionHelper.getFirst( docs );
	}
	
	public List< Edarch_Archive_Docs > getDocumentsByDocumentId( String documentId )
		throws DatabaseException
	{
		StringBuilder query = new StringBuilder( );
		
		query.append( "select doc from Edarch_Archive_Docs doc " );
		query.append( "where doc.ardocDocumentid = :documentId " );
		query.append( "order by doc.ardocCreateDate desc " );
		
		Map< String, Object > arguments = new HashMap< String, Object >( );
		arguments.put( "documentId", documentId );
		
		return _archiveDocs.select( query.toString( ), arguments ); 
	}
	
	public boolean isAbleToReadDocument( Edarch_Archive_Docs archDoc, String archDeclId )
		throws DatabaseException
	{
		boolean result = false;
		if ( null != archDoc )
		{
			String idInternal = archDoc.getArdocIdinternal( );
			String archId = archDoc.getArdocArchIdinternal( );
			Edarch_Read_Access readAccess = getReadAccess( archId, idInternal, archDeclId );
			
			if ( null != readAccess )
				result = true;
		}
		
		return result;
	}
	
	public List< Edarch_Archive > getArchivesByDecl( String archDeclId )
		throws DatabaseException
	{
		StringBuilder query = new StringBuilder( );
		
		query.append( "select ar from Edarch_Archive ar " );
		query.append( "where ar.decl = :declId " );
		
		Map< String, Object > arguments = new HashMap< String, Object >( );
		arguments.put( "declId", archDeclId );
		
		return _edarchArchive.select( query.toString( ), arguments );
	}
	
	public List< Edarch_Archive_Docs > getDocsWithoutRefByArchive( String archiveId )
		throws DatabaseException
	{
		StringBuilder query = new StringBuilder( );
		
		query.append( "select doc from Edarch_Archive_Docs doc " );
		query.append( "where doc.ardocArchIdinternal = :archiveId " );
			query.append( "and doc.ardocRefdocumentid IS NULL " );
		
		Map< String, Object > arguments = new HashMap< String, Object >( );
		arguments.put( "archiveId", archiveId );
		
		return _archiveDocs.select( query.toString( ), arguments );
	}
	
	public List< Edarch_Archive_Docs > getDocuments( String archiveId )
		throws DatabaseException
	{
		StringBuilder query = new StringBuilder( );
		
		query.append( "select doc from Edarch_Archive_Docs doc " );
		query.append( "where doc.ardocArchIdinternal = :archiveId " );
		
		Map< String, Object > arguments = new HashMap< String, Object >( );
		arguments.put( "archiveId", archiveId );
		
		return _archiveDocs.select( query.toString( ), arguments );
	}
	
	public Edarch_Archive_Docs getArchDocument( String archDocId, String archId )
		throws DatabaseException
	{
		StringBuilder query = new StringBuilder( );
		
		query.append( "select doc from Edarch_Archive_Docs doc " );
		query.append( "where doc.ardocIdinternal = :archDocId " );
			query.append( "and doc.ardocArchIdinternal = :archId " );
		
		Map< String, Object > arguments = new HashMap< String, Object >( );
		arguments.put( "archDocId", archDocId );
		arguments.put( "archId", archId );
		
		List< Edarch_Archive_Docs > docs = _archiveDocs.select( query.toString( ), arguments );
		
		return CollectionHelper.getFirst( docs );
	}
	
	public Edarch_Archive_Docs getArchDocument_ED( String edDocumentId, String archId )
		throws DatabaseException
	{
		StringBuilder query = new StringBuilder( );
		
		query.append( "select doc from Edarch_Archive_Docs doc " );
		query.append( "where doc.ardocDocumentid = :edDocumentId " );
			query.append( " and doc.ardocArchIdinternal = :archId " );
		
		Map< String, Object > arguments = new HashMap< String, Object >( );
		arguments.put( "edDocumentId", edDocumentId );
		arguments.put( "archId", archId );
		
		List< Edarch_Archive_Docs > docs = _archiveDocs.select( query.toString( ), arguments );
		
		return CollectionHelper.getFirst( docs );
	}

}
