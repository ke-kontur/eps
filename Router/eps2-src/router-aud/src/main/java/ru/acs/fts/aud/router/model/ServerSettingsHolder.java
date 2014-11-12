package ru.acs.fts.aud.router.model;

import ru.acs.fts.aud.model.entities.ServerSetting;

public class ServerSettingsHolder
{
	private ServerSetting _maxMessageCount;
	private ServerSetting _maxDocumentCount;
	private ServerSetting _accessNonVerifiedDocuments;
	private ServerSetting _isGnivc;
	
	// @formatter:off
	public void setMaxMessageCount( ServerSetting maxMessageCount ) { _maxMessageCount = maxMessageCount; }
	public ServerSetting getMaxMessageCount( ) { return _maxMessageCount; }
	
	public void setMaxDocumentCount( ServerSetting maxDocumentCount ) { _maxDocumentCount = maxDocumentCount; }
	public ServerSetting getMaxDocumentCount( ) { return _maxDocumentCount; }
	
	public void setAccessNonVerifiedDocuments( ServerSetting accessNonVerifiedDocuments ) { _accessNonVerifiedDocuments = accessNonVerifiedDocuments; }
	public ServerSetting getAccessNonVerifiedDocuments( ) { return _accessNonVerifiedDocuments; }
	
	public void setIsGnivc( ServerSetting isGnivc ) { _isGnivc = isGnivc; }
	public ServerSetting getIsGnivc( ) { return _isGnivc; }
	// @formatter:on
}
