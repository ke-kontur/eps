package ru.acs.fts.eps2.ws.data.model.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.orm.jpa.JpaTemplate;
import org.springframework.transaction.annotation.Transactional;

import ru.acs.fts.eps2.ws.data.model.entities.AudCommand;
import ru.acs.fts.eps2.ws.data.model.entities.AudDocInfo;
import ru.acs.fts.eps2.ws.data.model.entities.AudIntCommand;
import ru.acs.fts.eps2.ws.data.model.entities.AudMessage;
import ru.acs.fts.eps2.ws.data.model.entities.AudProcInfo;

@SuppressWarnings( "deprecation" ) 
public class AudService
{
	private BaseStorage< AudIntCommand > _audIntCommands;
	private BaseStorage< AudCommand > _audCommands;
	private BaseStorage< AudProcInfo > _audProcInfos;
	private BaseStorage< AudMessage > _audMessages;
	private BaseStorage< AudDocInfo > _audDocInfos;
	
	// @formatter:off
	@Required
	public void setJpaTemplate( JpaTemplate jpaTemplate )
	{
		_audIntCommands.setJpaTemplate( jpaTemplate );
		_audCommands.setJpaTemplate( jpaTemplate );
		_audProcInfos.setJpaTemplate( jpaTemplate );
		_audMessages.setJpaTemplate( jpaTemplate );
		_audDocInfos.setJpaTemplate( jpaTemplate );
	}
	public JpaTemplate getJpaTemplate( ) { return _audIntCommands.getJpaTemplate( ); }
	// @formatter:on
	
	public AudService( )
	{
		_audIntCommands = new BaseStorage< AudIntCommand >( AudIntCommand.class );
		_audCommands = new BaseStorage< AudCommand >( AudCommand.class );
		_audProcInfos = new BaseStorage< AudProcInfo >( AudProcInfo.class );
		_audMessages = new BaseStorage< AudMessage >( AudMessage.class );
		_audDocInfos = new BaseStorage< AudDocInfo >( AudDocInfo.class );
	}
	
	@Transactional
	public void merge( AudIntCommand intCmd ) 
		throws Exception
	{
		_audIntCommands.executeMergeAndFlush( intCmd );
	}
	
	@Transactional
	public void merge( AudCommand cmd )
		throws Exception
	{
		_audCommands.executeMergeAndFlush( cmd );
	}

	public List< AudProcInfo > findAllProcInfos( int offset, int limit )
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select api from AudProcInfo api " );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		
		List< AudProcInfo > res = _audProcInfos.selectSlice( q.toString( ), args, offset, limit );
		if ( null == res )
			return new ArrayList< AudProcInfo >( );
		
		return res;
	}
	
	public List< AudProcInfo > findFailedProcInfos( int offset, int limit )
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select ac.procInfo from AudCommand ac " );
		q.append( "where ac.state = 'Error' " );
			q.append( " or ac.state = 'Error_Response' " );
			q.append( " or ac.intCmd.state = 'Error' " );

		Map< String, Object > args = new HashMap< String, Object >( );
		
		List< AudProcInfo > res = _audProcInfos.selectSlice( q.toString( ), args, offset, limit );
		if ( null == res )
			return new ArrayList< AudProcInfo >( );
		
		return res;
	}
	
	public long countAllProcInfos( )
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select count(api) from AudProcInfo api " );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		
		List< Long > res = _audProcInfos.selectCount( q.toString( ), args );
		if ( null == res || 0 == res.size( ) )
			return 0;
		
		return res.get( 0 );
	}
	
	public long countFailedProcInfos( )
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select count(ac.procInfo) from AudCommand ac " );
		q.append( "where ac.state = 'Error' " );
			q.append( " or ac.state = 'Error_Response' " );
			q.append( " or ac.intCmd.state = 'Error' " );
			
		Map< String, Object > args = new HashMap< String, Object >( );
		
		List< Long > res = _audProcInfos.selectCount( q.toString( ), args );
		if ( null == res || 0 == res.size( ) )
			return 0;
		
		return res.get( 0 );
	}
	
	public long countDateRangedProcInfosByCreateDate( DateTime start, DateTime end )
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select count(api) from AudProcInfo api " );
		q.append( "where api.pkCreateDateTime >= :start " );
		q.append( "and api.pkCreateDateTime <= :end " );
					
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "start", start.toGregorianCalendar( ) );
		args.put( "end", end.toGregorianCalendar( ) );
		
		List< Long > res = _audProcInfos.selectCount( q.toString( ), args );
		if ( null == res || 0 == res.size( ) )
			return 0;
		
		return res.get( 0 );
	}
	
	public long countDateRangedProcInfosByChangeDate( DateTime start, DateTime end )
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select count(api) from AudProcInfo api " );
		q.append( "where api.pkChangeDateTime >= :start " );
		q.append( "and api.pkChangeDateTime <= :end " );
					
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "start", start.toGregorianCalendar( ) );
		args.put( "end", end.toGregorianCalendar( ) );
		
		List< Long > res = _audProcInfos.selectCount( q.toString( ), args );
		if ( null == res || 0 == res.size( ) )
			return 0;
		
		return res.get( 0 );
	}
	
	public List< AudProcInfo > findProcInfo( String processId )
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select api from AudProcInfo api " );
		q.append( "where api.processId = :processId " );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "processId", processId );
		
		List< AudProcInfo > res = _audProcInfos.select( q.toString( ), args );
		if ( null == res )
			return new ArrayList< AudProcInfo >( );
		
		return res;
	}
	
	@Transactional
	public List< AudIntCommand > findAllIntCommands( int offset, int limit )
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select aic from AudIntCommand aic " );
		
		Map< String, Object > args = new HashMap< String, Object >( );
	
		List< AudIntCommand > res = _audIntCommands.selectSlice( q.toString( ), args, offset, limit );
		if ( null == res )
			return new ArrayList< AudIntCommand >( );
		
		return res;
	}
	
	@Transactional
	public AudIntCommand getIntCommand( int recId )
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select aic from AudIntCommand aic " );
		q.append( "where aic.recId = :recId " );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "recId", recId );
		
		List< AudIntCommand > res = _audIntCommands.select( q.toString( ), args );
		if ( null == res || 0 == res.size( ) )
			return null;
		
		return res.get( 0 );
	}
	
	@Transactional
	public AudCommand getCommand( int recId )
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select ac from AudCommand ac " );
		q.append( "where ac.recId = :recId " );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "recId", recId );
		
		List< AudCommand > res = _audCommands.select( q.toString( ), args );
		if ( null == res || 0 == res.size( ) )
			return null;
		
		return res.get( 0 );
	}
	
	@Transactional
	public List< AudDocInfo > getDocInfos( String cmdRefGuid )
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select adi from AudDocInfo adi " );
		q.append( "where adi.cmdRefGuid = :cmdRefGuid " );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "cmdRefGuid", cmdRefGuid );
		
		List< AudDocInfo > res = _audDocInfos.select( q.toString( ), args );
		if ( null == res )
			return new ArrayList< AudDocInfo >( );
		
		return res;
	}
	
	@Transactional
	public List< AudProcInfo > getProcInfosByCreateDate( int offset, int limit, DateTime start, DateTime end )
	{
		StringBuilder query = new StringBuilder( "select api from AudProcInfo api" );
		query.append( " where api.pkCreateDateTime >= :start and api.pkCreateDateTime <= :end" );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "start", start.toGregorianCalendar( ) );
		args.put( "end", end.toGregorianCalendar( ) );
		
		List< AudProcInfo > res = _audProcInfos.selectSlice( query.toString( ), args, offset, limit );
		if ( null == res )
			return new ArrayList< AudProcInfo >( );
		return res;
	}
	
	@Transactional
	public List< AudProcInfo > getProcInfosByChangeDate( int offset, int limit, DateTime start, DateTime end )
	{
		StringBuilder query = new StringBuilder( "select api from AudProcInfo api" );
		query.append( " where api.pkChangeDateTime >= :start and api.pkChangeDateTime <= :end" );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "start", start.toGregorianCalendar( ) );
		args.put( "end", end.toGregorianCalendar( ) );
		
		List< AudProcInfo > res = _audProcInfos.selectSlice( query.toString( ), args, offset, limit );
		if ( null == res )
			return new ArrayList< AudProcInfo >( );
		return res;
	}
}
