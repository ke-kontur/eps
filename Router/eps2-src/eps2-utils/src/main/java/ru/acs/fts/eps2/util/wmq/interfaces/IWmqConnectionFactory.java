package ru.acs.fts.eps2.util.wmq.interfaces;

public interface IWmqConnectionFactory
{
	public IWmqConnection createConnection( );
	public IWmqConnection createBindingConnection( String queueManagerName );
	public IWmqConnection createClientConnection( String queueManagerName, String hostname, String port, String channel );
}
