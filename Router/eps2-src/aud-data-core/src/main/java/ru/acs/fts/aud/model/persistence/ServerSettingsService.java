package ru.acs.fts.aud.model.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.orm.jpa.JpaTemplate;
import org.springframework.transaction.annotation.Transactional;

import ru.acs.fts.aud.model.entities.ServerSetting;
import ru.acs.fts.aud.model.persistence.exception.PersistenceException;

@SuppressWarnings( "deprecation" )
public class ServerSettingsService
{
	private BaseStorage< ServerSetting > _serverSettingStorage;
	
	public ServerSettingsService( )
	{
		_serverSettingStorage = new BaseStorage< ServerSetting >( ServerSetting.class );
	}
	
	// @formatter:off
	@Required public void setJpaTemplate( JpaTemplate jpaTemplate ) 
	{
		_serverSettingStorage.setJpaTemplate( jpaTemplate );
	}
	public JpaTemplate getJpaTemplate( ) { return _serverSettingStorage.getJpaTemplate( ); }
	// @formatter:on
	
	public ServerSetting getSettingByName( String settingName ) throws PersistenceException
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select ss from ServerSetting ss " );
		q.append( "where ss.name = :name " );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "name", settingName );
		
		List< ServerSetting > res = _serverSettingStorage.select( q.toString( ), args );
		if ( null == res || 0 == res.size( ) )
			return null;
		
		return res.get( 0 );
	}
	
	@Transactional
	@Deprecated
	public void persistSetting( ServerSetting setting )  // NO_UCD (unused code)
		throws PersistenceException
	{
		_serverSettingStorage.executePersistAndFlush( setting );
	}
	
	@Transactional
	@Deprecated
	public void mergeSetting( ServerSetting setting )  // NO_UCD (unused code)
		throws PersistenceException
	{
		_serverSettingStorage.executeMergeAndFlush( setting );
	}
}
