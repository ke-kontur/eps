package ru.acs.fts.eps2.model.services;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.orm.jpa.JpaTemplate;

import ru.acs.fts.eps2.model.entities.ExtRtuRouting;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;

@SuppressWarnings( "deprecation" )
public class ExtRtuRoutingService implements IGenericService
{
	private BaseStorage< ExtRtuRouting > _extRtuRouting;
	
	private Date _lastUpdate;
	private int _updateTimeout;
	private List< ExtRtuRouting > _cache;
	
	public ExtRtuRoutingService( )
	{
		_extRtuRouting = new BaseStorage< ExtRtuRouting >( ExtRtuRouting.class );
	}
	
	// @formatter:off
	@Override public void setJpaTemplate( JpaTemplate jpaTemplate ) { _extRtuRouting.setJpaTemplate( jpaTemplate ); }
	@Override public JpaTemplate getJpaTemplate( ) { return _extRtuRouting.getJpaTemplate( ); }
	
	public void setUpdateTimeout( int updateTimeout ) { _updateTimeout = updateTimeout; }
	public int getUpdateTimeout( ) { return _updateTimeout; }
	// @formatter:on
	
	private synchronized void init( )
	{
		try
		{
			_cache = _extRtuRouting.select( "select err from ExtRtuRouting err", new HashMap< String, Object >( ) );
		}
		catch ( DatabaseException exc )
		{
			throw new RuntimeException( "Cache loading failed", exc );
		}
		
		_lastUpdate = new Date( );
	}
	
	public ExtRtuRouting getExternalRouting( String customCode, int exchType )
	{
		Date now = new Date( );
		if ( ( null == _cache ) ||
			 ( now.getTime( ) - _lastUpdate.getTime( ) > ( _updateTimeout * 24 * 60 * 60 * 1000 ) ) )
			init( );

		for ( ExtRtuRouting err : _cache )
		{
			if ( customCode.matches( err.getCustomCode( ) + ".*" ) && 
				 exchType == err.getExchType( ) )
				return err;
		}
		
		return null;
	}
	
	public ExtRtuRouting getExternalRouting( String customCode, String exchType )
	{
		return getExternalRouting( customCode, Integer.valueOf( exchType ) );
	}
	
	public boolean isExtRtuRoutingWithCustomsCodeExist( String custCode, int exchType )
	{
		return null != getExternalRouting( custCode, exchType );
	}
	
	public boolean checkRtuMask( String customsCode, int exchType )
	{
		return isExtRtuRoutingWithCustomsCodeExist( customsCode, exchType );
		/*
		String rtuCode = customsCode.substring( 0, 4 );
		boolean result = isExtRtuRoutingWithCustomsCodeExist( rtuCode , exchType );
		if ( ! result )
		{
			rtuCode = customsCode.substring( 0, 3 );
			result = isExtRtuRoutingWithCustomsCodeExist( rtuCode, exchType ); 
		}
		
		return result;
		*/
	}
}
