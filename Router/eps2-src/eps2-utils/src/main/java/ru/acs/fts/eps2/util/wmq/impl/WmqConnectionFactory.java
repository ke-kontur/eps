package ru.acs.fts.eps2.util.wmq.impl;

import ru.acs.fts.eps2.util.wmq.interfaces.IWmqConnection;
import ru.acs.fts.eps2.util.wmq.interfaces.IWmqConnectionFactory;

public class WmqConnectionFactory implements IWmqConnectionFactory // NO_UCD (for reference)
{
	private static final String BINDING_CONNECTION = "bind";
	private static final String CLIENT_CONNECTION = "client";
	
	private String _queueManager;
	private String _connectionType;
	private String _hostname;
	private String _port;
	private String _channel;
	
	// @formatter:off
	public void setQueueManager( String queueManager ) { _queueManager = queueManager; }
	public String getQueueManager( ) { return _queueManager; }
	
	public void setConnectionType( String connectionType ) { _connectionType = connectionType; }
	public String getConnectionType( ) { return _connectionType; }
	
	public void setHostname( String hostname ) { _hostname = hostname; }
	public String getHostname( ) { return _hostname; }
	
	public void setPort( String port ) { _port = port; }
	public String getPort( ) { return _port; }
	
	public void setChannel( String channel ) { _channel = channel; }
	public String getChannel( ) { return _channel; }
	// @formatter:on
	
	@Override
	public IWmqConnection createConnection( )
	{
		if ( _connectionType.equalsIgnoreCase( BINDING_CONNECTION ) )
			return createBindingConnection( _queueManager );
		else if ( _connectionType.equalsIgnoreCase( CLIENT_CONNECTION ) )
			return createClientConnection( _queueManager, _hostname, _port, _channel );
		
		return null;
	}
	
	@Override
	public IWmqConnection createBindingConnection( String queueManagerName )
	{
		WmqConnection wmqConnection = new WmqConnection( queueManagerName );
		if ( ! wmqConnection.initiate( ) )
		{
			wmqConnection.shutdown( );
			return null;
		}
		
		return wmqConnection;
	}

	@Override
	public IWmqConnection createClientConnection( String queueManagerName, String hostname, String port, String channel )
	{
		WmqConnection wmqConnection = new WmqConnection( queueManagerName, hostname, port, channel );
		if ( ! wmqConnection.initiate( ) )
		{
			wmqConnection.shutdown( );
			return null;
		}
		
		return wmqConnection;
	}

}
