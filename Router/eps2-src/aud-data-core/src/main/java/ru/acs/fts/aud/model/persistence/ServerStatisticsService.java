package ru.acs.fts.aud.model.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.orm.jpa.JpaTemplate;
import org.springframework.transaction.annotation.Transactional;

import ru.acs.fts.aud.model.entities.ServerStatistic;
import ru.acs.fts.aud.model.persistence.exception.PersistenceException;

@SuppressWarnings( "deprecation" )
public class ServerStatisticsService
{
	private BaseStorage< ServerStatistic > _serverStatisticStorage;
	
	public ServerStatisticsService( )
	{
		_serverStatisticStorage = new BaseStorage< ServerStatistic >( ServerStatistic.class );
	}
	
	// @formatter:off
	@Required public void setJpaTemplate( JpaTemplate jpaTemplate ) 
	{
		_serverStatisticStorage.setJpaTemplate( jpaTemplate );
	}
	public JpaTemplate getJpaTemplate( ) { return _serverStatisticStorage.getJpaTemplate( ); }
	// @formatter:on
	
	public ServerStatistic getStatisticByName( String statisticName ) throws PersistenceException
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select ss from ServerStatistic ss " );
		q.append( "where ss.name = :name " );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "name", statisticName );
		
		List< ServerStatistic > res = _serverStatisticStorage.select( q.toString( ), args );
		if ( null == res || 0 == res.size( ) )
			return null;
		
		return res.get( 0 );
	}
	
	@Transactional
	@Deprecated
	public void persistStatistic( ServerStatistic statistic )  // NO_UCD (unused code)
		throws PersistenceException
	{
		_serverStatisticStorage.executePersistAndFlush( statistic );
	}
	
	@Transactional
	public void mergeStatistic( ServerStatistic statistic ) 
		throws PersistenceException
	{
		_serverStatisticStorage.executeMergeAndFlush( statistic );
	}
}
