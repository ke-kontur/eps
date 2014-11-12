package ru.acs.fts.eps2.ws.data.model.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.orm.jpa.JpaTemplate;
import org.springframework.transaction.annotation.Transactional;

import ru.acs.fts.eps2.ws.data.model.entities.ProcedureInformation;
import ru.acs.fts.eps2.ws.data.model.entities.ProcedureState;

@SuppressWarnings( "deprecation" ) 
public class ProcedureService
{
	private BaseStorage< ProcedureInformation > _procedureInformationsStorage;
	private BaseStorage< ProcedureState > _procedureStatesStorage;
	
	// @formatter:off
	@Required
	public void setJpaTemplate( JpaTemplate jpaTemplate )
	{
		_procedureInformationsStorage.setJpaTemplate( jpaTemplate );
		_procedureStatesStorage.setJpaTemplate( jpaTemplate );
	}
	public JpaTemplate getJpaTemplate( ) { return _procedureInformationsStorage.getJpaTemplate( ); }
	// @formatter:on
	
	public ProcedureService( )
	{
		_procedureInformationsStorage = new BaseStorage< ProcedureInformation >( ProcedureInformation.class );	
		_procedureStatesStorage = new BaseStorage< ProcedureState >( ProcedureState.class );
	}

	@Transactional
	public ProcedureInformation findById( String processId )
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select pi from ProcedureInformation pi " );
		q.append( "where pi.processId = :processId " );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "processId", processId );
		
		List< ProcedureInformation > res = _procedureInformationsStorage.select( q.toString( ), args );
		if ( null == res || 0 == res.size( ) )
			return null;
		
		return res.get( 0 );
	}
	
	@Transactional
	public List< ProcedureInformation > findMatchById( String processId )
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select pi from ProcedureInformation pi " );
		q.append( "where UPPER( pi.processId ) like :processId " );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "processId", String.format( "%s%%", processId.toUpperCase( ) ) );
		
		List< ProcedureInformation > res = _procedureInformationsStorage.select( q.toString( ), args );
		if ( null == res || 0 == res.size( ) )
			return null;
		
		return res;
	}
	
	@Transactional
	public ProcedureState getState( String envelopeId, String processId )
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select ps from ProcedureState ps " );
		q.append( "where ps.envelopeId = :envelopeId " );
			q.append( " and ps.processId = :processId " );
			
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "envelopeId", envelopeId );
		args.put( "processId", processId );
		
		List< ProcedureState > res = _procedureStatesStorage.select( q.toString( ), args );
		if ( null == res || 0 == res.size( ) )
			return null;
		
		return res.get( 0 );
	}
}
