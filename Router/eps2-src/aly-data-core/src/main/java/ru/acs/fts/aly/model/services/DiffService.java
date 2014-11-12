package ru.acs.fts.aly.model.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.orm.jpa.JpaTemplate;

import ru.acs.fts.aly.model.entities.AlyEsadDiff;
import ru.acs.fts.aly.model.entities.AlyEsadRepl;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;

@SuppressWarnings( "deprecation" )
public class DiffService implements IGenericService
{
	private BaseStorage< AlyEsadDiff > _esadDiffsStorage;
	private BaseStorage< AlyEsadRepl > _esadReplsStorage;
	
	public DiffService( )
	{
		_esadDiffsStorage = new BaseStorage< AlyEsadDiff >( AlyEsadDiff.class );
		_esadReplsStorage = new BaseStorage< AlyEsadRepl >( AlyEsadRepl.class );
	}

	@Override
	public void setJpaTemplate( JpaTemplate jpaTemplate )
	{
		_esadDiffsStorage.setJpaTemplate( jpaTemplate );
		_esadReplsStorage.setJpaTemplate( jpaTemplate );
	}

	@Override
	public JpaTemplate getJpaTemplate( )
	{
		return _esadDiffsStorage.getJpaTemplate( );
	}
	
	// persist
	
	public void persist( AlyEsadDiff diff ) 
		throws DatabaseException
	{
		_esadDiffsStorage.persistAndFlush( diff );
	}
	
	public void persist( AlyEsadRepl repl )
		throws DatabaseException
	{
		_esadReplsStorage.persistAndFlush( repl );
	}
	
	public void persist( List< AlyEsadDiff > diffs )
		throws DatabaseException
	{
		for ( AlyEsadDiff diff : diffs )
		{
			_esadDiffsStorage.persist( diff );
		}
		
		_esadDiffsStorage.flush( );
	}
	
	// merge
	
	public void merge( AlyEsadRepl repl ) 
		throws DatabaseException
	{
		_esadReplsStorage.mergeAndFlush( repl );
	}
	
	// query
	
	public AlyEsadRepl getRepl( String esadId ) 
		throws DatabaseException
	{
		return _esadReplsStorage.get( esadId );
	}
	
	public AlyEsadRepl getReplByRef( String esadId )
		throws DatabaseException
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select aer from AlyEsadRepl aer " );
		q.append( "where aer.refEsadId = :esadId " );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "esadId", esadId );
		
		List< AlyEsadRepl > res = _esadReplsStorage.select( q.toString( ), args );
		if ( null == res || res.isEmpty( ) )
			return null;
		
		return res.get( 0 );
	}
	
	public List< AlyEsadDiff > getDiffs( String messageId ) 
		throws DatabaseException
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select aed from AlyEsadDiff aed " );
		q.append( "where aed.messageId = :messageId " );
		q.append( "order by aed.id " );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "messageId", messageId );
		
		List< AlyEsadDiff > res = _esadDiffsStorage.select( q.toString( ), args );
		if ( null == res )
			return new ArrayList< AlyEsadDiff >( );
		
		return res;
	}
	
	public List< AlyEsadRepl > getRepls( String gtdId )
		throws DatabaseException
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select aer from AlyEsadRepl aer " );
		q.append( "where aer.gtdId = :gtdId " );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "gtdId", gtdId );
		
		List< AlyEsadRepl > res = _esadReplsStorage.select( q.toString( ), args );
		if ( null == res )
			return new ArrayList< AlyEsadRepl >( );
		
		return res;
	}

	public List< AlyEsadRepl > getReplsLike( String gtdId )
		throws DatabaseException
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select aer from AlyEsadRepl aer " );
		q.append( "where aer.gtdId like :gtdId " );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "gtdId", gtdId );
		
		List< AlyEsadRepl > res = _esadReplsStorage.selectSlice( q.toString( ), args, 0, 10000 );
		if ( null == res )
			return new ArrayList< AlyEsadRepl >( );
		
		return res;
	}

	public Long getReplsLikeCount( String gtdId )
		throws DatabaseException
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select count(aer) from AlyEsadRepl aer " );
		q.append( "where aer.gtdId like :gtdId " );
			q.append( "and not aer.refEsadId = :sel " );
		q.append( "group by aer.gtdId " );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "gtdId", gtdId );
		args.put( "sel", " " );
		
		List< Object > res = _esadReplsStorage.selectObjects( q.toString( ), args );
		if ( null == res )
			return 0l;
		
		return ( long )res.size( );
	}
	
	public Long getReplsCount( )
		throws DatabaseException
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select count(aer) from AlyEsadRepl aer " );
		q.append( "where aer.gtdId is not null " );
			q.append( "and not aer.refEsadId = :sel " );
		q.append( "group by aer.gtdId " );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "sel", " " );
		
		List< Object > res = _esadReplsStorage.selectObjects( q.toString( ), args );
		if ( null == res || res.isEmpty( ) )
			return 0l;
		
		return ( long )res.size( );
	}
}
