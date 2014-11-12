package ru.acs.fts.aud.router.model.managers;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ru.acs.fts.aud.model.entities.ServerSetting;
import ru.acs.fts.aud.model.persistence.ServerSettingsService;
import ru.acs.fts.aud.router.model.ServerSettingsHolder;
import ru.acs.fts.aud.router.utils.StringUtil;

public class ServerSettingManager
{
	public static final String MAX_MESSAGES_COUNT = "MaxMessageCount"; // NO_UCD (use private)
	public static final String MAX_DOCUMENT_COUNT = "MaxGetDocumentCount"; // NO_UCD (use private)
	public static final String ACCESS_NON_VERIFIED_DOCUMENTS = "AccessNonVerifiedDocuments"; // NO_UCD (use private)
	public static final String IS_GNIVC = "IS_GNIVC"; // NO_UCD (use private)
	
	private Integer _maxMessageCount;
	private Integer _maxDocumentCount;
	private Boolean _accessNonVerifiedDocuments;
	private Boolean _isGnivc;
	
	private ServerSettingsHolder _holder;
	
	private ServerSettingsService _serverSettingsService;
	
	// @formatter:off
	@Required
	public void setServerSettingService( ServerSettingsService service ) { _serverSettingsService = service; }
	public ServerSettingsService getServerSettingService( ) { return _serverSettingsService; }
	
	public int getMaxMessageCount( ) { return getValue( _maxMessageCount, Integer.MAX_VALUE ); }
	public int getMaxDocumentCount( ) { return getValue( _maxDocumentCount, Integer.MAX_VALUE ); }
	public boolean getAccessNonVerifiedDocuments( ) { return getValue( _accessNonVerifiedDocuments, Boolean.TRUE ); };
	public boolean getIsGnivc( ) { return getValue( _isGnivc, Boolean.TRUE ); }
	// @formatter:on
	
	@Transactional( propagation = Propagation.REQUIRES_NEW )
	public void init( ) 
		throws Exception
	{
		_holder = new ServerSettingsHolder( );
		
		ServerSetting setting;
		
		setting = lookupSetting( MAX_MESSAGES_COUNT );
		_holder.setMaxMessageCount( setting );
		_maxMessageCount = getIntValue( setting );
		
		setting = lookupSetting( MAX_DOCUMENT_COUNT );
		_holder.setMaxDocumentCount( setting );
		_maxDocumentCount = getIntValue( setting );
		
		setting = lookupSetting( ACCESS_NON_VERIFIED_DOCUMENTS );
		_holder.setAccessNonVerifiedDocuments( setting );
//		_accessNonVerifiedDocuments = getAccessNonVerifiedDocuments( );
		_accessNonVerifiedDocuments = getBooleanValue( setting );
		
		setting = lookupSetting( IS_GNIVC );
		_holder.setIsGnivc( setting );
		_isGnivc = getBooleanValue( setting );
	}
	
	private ServerSetting lookupSetting( String serverSettingName ) 
		throws Exception
	{
		ServerSetting serverSetting = _serverSettingsService.getSettingByName( serverSettingName );
		if ( null == serverSetting )
			throw new Exception( String.format( "В базе данных не обнаружена настройка с именем '%s'", serverSettingName ) );
		
		return serverSetting;
	}
	
	private int getIntValue( ServerSetting setting )
	{
		return Integer.valueOf( getStringValue( setting ) );
	}
	
	private String getStringValue( ServerSetting setting )
	{
		return StringUtil.convertToString( setting.getValue( ) );
	}
	
	public boolean getBooleanValue( ServerSetting setting ) // NO_UCD (use private)
	{
		return Boolean.parseBoolean( getStringValue( setting ) );
	}
	
	private < T > T getValue( T value, T defValue )
	{
		return null == value ? defValue : value;
	}
}
