package ru.acs.fts.aud.router.processing.helpers;

import ru.acs.fts.aud.model.entities.ProtocolItem;

public class ProtocolInfo
{
	private ProtocolItem _protocolItem;
	private String _protocolCode;
	private Object[ ] _params;
	
	public ProtocolInfo( ProtocolItem protocolItem, String protocolCode, Object[ ] params ) // NO_UCD (use default)
	{
		_protocolCode = protocolCode;
		_protocolItem = protocolItem;
		_params = params;
	}
	
	// @formatter:off
	public ProtocolItem getProtocolItem( ) { return _protocolItem; }
	
	public String getProtocolCode( ) { return _protocolCode; }
	
	public Object[ ] getParams( ) { return _params; }
	// @formatter:on
}
