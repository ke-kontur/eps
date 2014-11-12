package ru.acs.fts.aly.model.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.orm.jpa.JpaTemplate;

import ru.acs.fts.aly.model.entities.AlyRzdReports;
import ru.acs.fts.aly.model.entities.AlyRzdReportsMaking;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;

@SuppressWarnings( "deprecation" )
public class RzdReportsService implements IGenericService
{
	private BaseStorage< AlyRzdReports > _rzdReportsStorage;
	private BaseStorage< AlyRzdReportsMaking > _rzdReportsMakingStorage;
	
	public RzdReportsService( )
	{
		_rzdReportsStorage = new BaseStorage< AlyRzdReports >( AlyRzdReports.class );
		_rzdReportsMakingStorage = new BaseStorage< AlyRzdReportsMaking >( AlyRzdReportsMaking.class );
	}

	@Override
	public void setJpaTemplate( JpaTemplate jpaTemplate )
	{
		_rzdReportsStorage.setJpaTemplate( jpaTemplate );
		_rzdReportsMakingStorage.setJpaTemplate( jpaTemplate );
	}

	@Override
	public JpaTemplate getJpaTemplate( )
	{
		return _rzdReportsStorage.getJpaTemplate( );
	}
	
	// persist
	
	public void persist( AlyRzdReports report ) 
		throws DatabaseException
	{
		_rzdReportsStorage.persistAndFlush( report );
	}
	
	public void persist( AlyRzdReportsMaking making )
		throws DatabaseException
	{
		_rzdReportsMakingStorage.persistAndFlush( making );
	}
	
	public void persists( Collection< AlyRzdReports > reports )
		throws DatabaseException
	{
		for ( AlyRzdReports report : reports )
		{
			_rzdReportsStorage.persist( report );
		}

		_rzdReportsStorage.flush( );
	}	
	
	// merge
	
	public void merge( AlyRzdReportsMaking making )
		throws DatabaseException
	{
		_rzdReportsMakingStorage.mergeAndFlush( making );
	}
	
	// remove
	
	public void removeReports( int from, int to )
		throws DatabaseException
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "delete from AlyRzdReports rr " );
		q.append( "where rr.dstamp >= :from " );
			q.append( "and rr.dstamp <= :to " );
			
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "from", from );
		args.put( "to", to );
		
		_rzdReportsStorage.removeq( q.toString( ), args );
	}
		
	// query
	
	public AlyRzdReportsMaking getMaking( Integer dStamp ) 
		throws DatabaseException
	{
		return _rzdReportsMakingStorage.get( dStamp );
	}	

	public List< AlyRzdReportsMaking > getRequestedMakings( )
		throws DatabaseException
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select rrm from AlyRzdReportsMaking rrm " );
		q.append( "where rrm.isBeingMade = :val " );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "val", ( short )1 );
		
		List< AlyRzdReportsMaking > res = _rzdReportsMakingStorage.select( q.toString( ), args );
		if ( null == res )
			return new ArrayList< AlyRzdReportsMaking >( );
		
		return res;
	}
	
	public List< AlyRzdReports > getReport( int from, int to )
		throws DatabaseException
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select rr from AlyRzdReports rr " );
		q.append( "where rr.dstamp >= :from " );
			q.append( "and rr.dstamp <= :to " );
			
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "from", from );
		args.put( "to", to );
		
		List< AlyRzdReports > res = _rzdReportsStorage.select( q.toString( ), args );
		if ( null == res )
			return new ArrayList< AlyRzdReports >( );
		
		return res;
	}
	
	public Long getReportsCount( )
		throws DatabaseException
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select count(arm) from AlyRzdReportsMaking arm " );
		q.append( "where arm.isMade = :isMade " );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "isMade", ( short )1 );
		
		List< Object > res = _rzdReportsMakingStorage.selectObjects( q.toString( ), args );
		if ( null == res || res.isEmpty( ) )
			return 0l;
		
		Object f = res.get( 0 );
		if ( null == f )
			return 0l;
		
		return Long.parseLong( f.toString( ) );
	}
	
}
