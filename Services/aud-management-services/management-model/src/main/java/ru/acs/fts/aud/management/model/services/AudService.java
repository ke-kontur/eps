package ru.acs.fts.aud.management.model.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.orm.jpa.JpaTemplate;

import ru.acs.fts.aud.management.model.entities.EdeclAudCommand;
import ru.acs.fts.aud.management.model.entities.EdeclAudDocInfo;
import ru.acs.fts.aud.management.model.entities.EdeclAudIntCommand;
import ru.acs.fts.aud.management.model.entities.EdeclAudMessage;
import ru.acs.fts.aud.management.model.entities.EdeclAudMsgType;
import ru.acs.fts.aud.management.model.entities.EdeclAudProcInfo;
import ru.acs.fts.aud.management.model.entities.EdeclAudRegistry;
import ru.acs.fts.aud.management.model.entities.EdeclAudRegistryDoc;
import ru.acs.fts.aud.management.model.entities.EdeclAudRegistryResult;
import ru.acs.fts.aud.management.model.entities.EdeclAudSettings;

@SuppressWarnings( "deprecation" )
public class AudService
{
	private BaseStorage< EdeclAudCommand > _edeclAudCommands;
	private BaseStorage< EdeclAudDocInfo > _edeclAudDocInfos;
	private BaseStorage< EdeclAudIntCommand > _edeclAudIntCommands;
	private BaseStorage< EdeclAudMessage > _edeclAudMessages;
	private BaseStorage< EdeclAudMsgType > _edeclAudMsgTypes;
	private BaseStorage< EdeclAudProcInfo > _edeclAudProcInfos;
	private BaseStorage< EdeclAudRegistry > _edeclAudRegistries;
	private BaseStorage< EdeclAudRegistryDoc > _edeclAudRegistryDocs;
	private BaseStorage< EdeclAudRegistryResult > _edeclAudRegistryResults;
	private BaseStorage< EdeclAudSettings > _edeclAudSettings;

	// @formatter:off
	@Required
	public void setJpaTemplate( JpaTemplate jpaTemplate )
	{
		_edeclAudCommands.setJpaTemplate( jpaTemplate );
		_edeclAudDocInfos.setJpaTemplate( jpaTemplate );
		_edeclAudIntCommands.setJpaTemplate( jpaTemplate );
		_edeclAudMessages.setJpaTemplate( jpaTemplate );
		_edeclAudMsgTypes.setJpaTemplate( jpaTemplate );
		_edeclAudProcInfos.setJpaTemplate( jpaTemplate );
		_edeclAudRegistries.setJpaTemplate( jpaTemplate );
		_edeclAudRegistryDocs.setJpaTemplate( jpaTemplate );
		_edeclAudRegistryResults.setJpaTemplate( jpaTemplate );
		_edeclAudSettings.setJpaTemplate( jpaTemplate );
	}
	
	public JpaTemplate getJpaTemplate( ) { return _edeclAudCommands.getJpaTemplate( ); }
	// @formatter:on
	
	public AudService( )
	{
		_edeclAudCommands = new BaseStorage< EdeclAudCommand >( EdeclAudCommand.class );
		_edeclAudDocInfos = new BaseStorage< EdeclAudDocInfo >( EdeclAudDocInfo.class );
		_edeclAudIntCommands = new BaseStorage< EdeclAudIntCommand >( EdeclAudIntCommand.class );
		_edeclAudMessages = new BaseStorage< EdeclAudMessage >( EdeclAudMessage.class );
		_edeclAudMsgTypes = new BaseStorage< EdeclAudMsgType >( EdeclAudMsgType.class );
		_edeclAudProcInfos = new BaseStorage< EdeclAudProcInfo >( EdeclAudProcInfo.class );
		_edeclAudRegistries = new BaseStorage< EdeclAudRegistry >( EdeclAudRegistry.class );
		_edeclAudRegistryDocs = new BaseStorage< EdeclAudRegistryDoc >( EdeclAudRegistryDoc.class );
		_edeclAudRegistryResults = new BaseStorage< EdeclAudRegistryResult >( EdeclAudRegistryResult.class );
		_edeclAudSettings = new BaseStorage< EdeclAudSettings >( EdeclAudSettings.class );
	}
	
	// selects
	
	public EdeclAudProcInfo getAudProcInfo( String processId )
	{
		return _edeclAudProcInfos.get( processId );
	}
	
	public EdeclAudMsgType getAudMsgType( String msgType )
	{
		return _edeclAudMsgTypes.get( msgType );
	}
	
	public List< EdeclAudMsgType > getAllAudMsgTypes( )
	{
		List< EdeclAudMsgType > res = _edeclAudMsgTypes.select( "select eamt from EdeclAudMsgType eamt ", new HashMap< String, Object >( ) );
		if ( null == res )
			return new ArrayList< EdeclAudMsgType >( );
		
		return res;
	}
	
	@SuppressWarnings( "unchecked" )
	public List< Integer > getUnprocessedIntCommandIds( )
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select min( ic.recId ) from EdeclAudIntCommand ic " );
		q.append( "where NOT EXISTS( " );
			q.append( "select icx from EdeclAudIntCommand icx " );
			q.append( "where icx.processId = ic.processId " );
				q.append( " AND ( icx.state = 'Error' or icx.state = 'Processing' or icx.state = 'Error_Response' ) " );
			q.append( " )" );
			q.append( "AND NOT ic.state = 'Processed' " );
		q.append( "group by ic.processId " );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		
		List< Integer > res = ( List< Integer > )_edeclAudIntCommands.selectSpecial( q.toString( ), args );
		if ( null == res )
			return new ArrayList< Integer >( );
		
		return res;
	}

	@SuppressWarnings( "unchecked" )
	public List< Integer > getUnprocessedCommandIds( )
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select min( ic.recId ) from EdeclAudCommand ic " );
		q.append( "where NOT EXISTS( " );
			q.append( "select icx from EdeclAudCommand icx " );
			q.append( "where icx.procInfo.processId = ic.procInfo.processId " );
				q.append( " AND ( icx.state = 'Error' or icx.state = 'Processing' or icx.state = 'Sended' or icx.state = 'Error_Response' ) " );
			q.append( " )" );
			q.append( "AND NOT ic.state = 'Processed' " );
			q.append( "AND ic.procInfo IS NOT NULL " );
		q.append( "group by ic.procInfo.processId " );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		
		List< Integer > res = ( List< Integer > )_edeclAudCommands.selectSpecial( q.toString( ), args );
		if ( null == res )
			return new ArrayList< Integer >( );
		
		return res;
	}
	
	public EdeclAudIntCommand getAudIntCommand( Integer recId )
	{
		return _edeclAudIntCommands.get( recId );
	}
	
	public EdeclAudCommand getAudCommand( Integer recId )
	{
		return _edeclAudCommands.get( recId );
	}
	
	public EdeclAudRegistry getAudRegistry( String regId )
	{
		return _edeclAudRegistries.get( regId );
	}
	
	public List< EdeclAudDocInfo > getDocInfosByDocumentId( String documentId )
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select di from EdeclAudDocInfo di " );
		q.append( "where di.documentId = :documentId " );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "documentId", documentId );
		
		List< EdeclAudDocInfo > docInfos = _edeclAudDocInfos.select( q.toString( ), args );
		if ( null == docInfos )
			return new ArrayList< EdeclAudDocInfo >( );
		
		return docInfos;
	}
	
	public List< EdeclAudDocInfo > getDocInfosByAudCommand( String cmdGuid )
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select di from EdeclAudDocInfo di " );
		q.append( "where di.cmdRefGuid = :cmdGuid " );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "cmdGuid", cmdGuid );
		
		List< EdeclAudDocInfo > docInfos = _edeclAudDocInfos.select( q.toString( ), args );
		if ( null == docInfos )
			return new ArrayList< EdeclAudDocInfo >( );
		
		return docInfos;
	}

	public EdeclAudDocInfo getLastPutDocumentByDocumentId( String documentId )
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select di from EdeclAudDocInfo di " );
		q.append( "where di.documentId = :documentId " );
		q.append( "order by di.putDateTime desc " );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "documentId", documentId );
		
		List< EdeclAudDocInfo > docInfos = _edeclAudDocInfos.select( q.toString( ), args );
		if ( null == docInfos || 0 == docInfos.size( ) )
			return null;
		
		return docInfos.get( 0 );
	}
	
	public String getArchDocIdByDocAndNotByRefMainDoc(
			String documentId, String refMainDoc, String documentModeId )
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select di from EdeclAudDocInfo di " );
		q.append( "where di.documentId = :documentId " );
			q.append( " and NOT di.refMainDoc = :refMainDoc " );
			q.append( " and di.documentModeId = :documentModeId " );
			q.append( " and di.state = 'Processed' " );
		q.append( "order by di.putDateTime DESC " );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "documentId", documentId );
		args.put( "refMainDoc", refMainDoc );
		args.put( "documentModeId", documentModeId );
		
		List< EdeclAudDocInfo > docInfos = _edeclAudDocInfos.select( q.toString( ), args );
		if ( null == docInfos || 0 == docInfos.size( ) )
			return null;
		
		EdeclAudDocInfo di = docInfos.get( 0 );
		return di.getArchDocId( );
    }	
	
	public String getArchDocIdByRefDocumentId(
			String refDocumentId, String documentModeId )
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select di from EdeclAudDocInfo di " );
		q.append( "where di.documentId = :refDocumentId " );
			q.append( " and di.documentModeId = :documentModeId " );
		q.append( "order by di.putDateTime DESC " );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "refDocumentId", refDocumentId );
		args.put( "documentModeId", documentModeId );
		
		List< EdeclAudDocInfo > docInfos = _edeclAudDocInfos.select( q.toString( ), args );
		if ( null == docInfos || 0 == docInfos.size( ) )
			return null;
		
		EdeclAudDocInfo di = docInfos.get( 0 );
		return di.getArchDocId( );
	}	
	
	public EdeclAudCommand getAudCommandByOutEnvelopeId( String outEnvelopeId )
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select c from EdeclAudCommand c " );
		q.append( "where c.outEnvelope IS NOT NULL " );
			q.append( " and c.outEnvelope.envelopeId = :outEnvelopeId " );
			
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "outEnvelopeId", outEnvelopeId );
		
		List< EdeclAudCommand > res = _edeclAudCommands.select( q.toString( ), args );
		if ( null == res || 0 == res.size( ) )
			return null;
		
		return res.get( 0 );
	}
	
	public EdeclAudProcInfo getProcInfoByGTD( String customsCode, String regNumber, Date regDate )
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select api from EdeclAudProcInfo api " );
		q.append( "where api.gtdCustomsCode = :customsCode " );
			q.append( "and api.gtdNumber = :regNumber " );
			q.append( "and api.gtdRegistrationDate = :regDate " );
			
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "customsCode", customsCode );
		args.put( "regNumber", regNumber );
		args.put( "regDate", regDate );
		
		List< EdeclAudProcInfo > res = _edeclAudProcInfos.select( q.toString( ), args );
		if ( null == res || 0 == res.size( ) )
			return null;
		
		return res.get( 0 );
	}
	
	public EdeclAudSettings getAudSettings( String name )
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select eas from EdeclAudSettings eas " );
		q.append( "where eas.name = :name " );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "name", name );
		
		List< EdeclAudSettings > res = _edeclAudSettings.select( q.toString( ), args );
		if ( null == res || 0 == res.size( ) )
		{
			EdeclAudSettings set = new EdeclAudSettings( );
			set.setId( UUID.randomUUID( ).toString( ) );
			set.setName( name );
			set.setValue( null );
			
			return set;
		}
		
		return res.get( 0 );
	}
	
	public EdeclAudMessage getAudMessage( String envelopeId )
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select am from EdeclAudMessage am " );
		q.append( "where am.envelopeId = :envelopeId " );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "envelopeId", envelopeId );
		
		List< EdeclAudMessage > res = _edeclAudMessages.select( q.toString( ), args );
		if ( null == res || 0 == res.size( ) )
			return null;
		
		return res.get( 0 );
	}
	
	// inserts
	
	public void persist( EdeclAudProcInfo procInfo ) 
	{
		_edeclAudProcInfos.executePersistAndFlush( procInfo );
	}
	
	public void persist( EdeclAudIntCommand intCommand )
	{
		_edeclAudIntCommands.executePersistAndFlush( intCommand );
	}
	
	public void persist( EdeclAudCommand command )
	{
		_edeclAudCommands.executePersistAndFlush( command );
	}
	
	public void persist( EdeclAudDocInfo docInfo )
	{
		_edeclAudDocInfos.executePersistAndFlush( docInfo );
	}
	
	public void persist( EdeclAudMessage audMsg )
	{
		_edeclAudMessages.executePersistAndFlush( audMsg );
	}
	
	public void persist( EdeclAudRegistryResult audRegistryResult )
	{
		_edeclAudRegistryResults.executePersistAndFlush( audRegistryResult );
	}
	
	public void persist( EdeclAudRegistryDoc audRegistryDoc )
	{
		_edeclAudRegistryDocs.executePersistAndFlush( audRegistryDoc );
	}
	
	public void persist( EdeclAudSettings settings )
	{
		_edeclAudSettings.executePersistAndFlush( settings );
	}
	
	// updates
	
	public void merge( EdeclAudProcInfo procInfo )
	{
		_edeclAudProcInfos.executeMergeAndFlush( procInfo );
	}
	
	public void merge( EdeclAudIntCommand intCommand )
	{
		_edeclAudIntCommands.executeMergeAndFlush( intCommand );
	}
	
	public void merge( EdeclAudCommand command )
	{
		_edeclAudCommands.executeMergeAndFlush( command );
	}
	
	public void merge( EdeclAudDocInfo docInfo )
	{
		_edeclAudDocInfos.executeMergeAndFlush( docInfo );
	}
	
	public void merge( EdeclAudRegistry audRegistry )
	{
		_edeclAudRegistries.executeMergeAndFlush( audRegistry );
	}
	
	public void merge( EdeclAudMessage message )
	{
		_edeclAudMessages.executeMergeAndFlush( message );
	}
	
	public void merge( EdeclAudSettings settings )
	{
		_edeclAudSettings.executeMergeAndFlush( settings );
	}
	
	// deletes
	
	public void delete( EdeclAudCommand command )
	{
		_edeclAudCommands.remove( command );
	}
	
	public void delete( EdeclAudDocInfo docInfo )
	{
		_edeclAudDocInfos.remove( docInfo );
	}
	
}
