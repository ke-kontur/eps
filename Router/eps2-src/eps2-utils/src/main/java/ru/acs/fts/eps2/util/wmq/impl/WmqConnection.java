package ru.acs.fts.eps2.util.wmq.impl;

import java.util.Hashtable;

import ru.acs.fts.eps2.util.wmq.interfaces.IWmqConnection;
import ru.acs.fts.eps2.util.wmq.interfaces.IWmqQueueConnection;

import com.ibm.mq.MQQueue;
import com.ibm.mq.MQQueueManager;
import com.ibm.mq.constants.CMQC;

public class WmqConnection implements IWmqConnection // NO_UCD (use default)
{
	public static enum ConnectionTypes // NO_UCD (use private)
	{
		BINDING, CLIENT
	}
	
	private String _queueManagerName;
	private String _hostname;
	private String _port;
	private String _channel;
	private ConnectionTypes _connectionType;
	
	private MQQueueManager _queueManager;
	
	public WmqConnection( String queueManagerName )  // NO_UCD (use default)
	{
		_queueManagerName = queueManagerName;
		_connectionType = ConnectionTypes.BINDING;
	}
	
	public WmqConnection( String queueManagerName, String hostname, String port, String channel ) // NO_UCD (use default)
	{
		_queueManagerName = queueManagerName;
		_hostname = hostname;
		_port = port;
		_channel = channel;
		_connectionType = ConnectionTypes.CLIENT;
	}
	
	@Override
	public boolean initiate( )
	{
		if ( null != _queueManager )
			return true;
		
		try
		{
			Hashtable< Object, Object > props = new Hashtable< Object, Object >( );
			
			switch ( _connectionType )
			{
				case BINDING:
				{
					props.put( CMQC.TRANSPORT_PROPERTY, CMQC.TRANSPORT_MQSERIES_BINDINGS );
					break;
				}
				
				case CLIENT:
				{
					props.put( CMQC.TRANSPORT_PROPERTY, CMQC.TRANSPORT_MQSERIES_CLIENT );
					props.put( CMQC.HOST_NAME_PROPERTY, _hostname );
					props.put( CMQC.PORT_PROPERTY, _port );
					props.put( CMQC.CHANNEL_PROPERTY, _channel );
					break;
				}
			}
			
			_queueManager = new MQQueueManager( _queueManagerName, props );
			
			return true;
		}
		catch ( Exception exc )
		{
			return false;
		}
	}
	
	@Override
	public boolean shutdown( )
	{
		try
		{
			if ( null != _queueManager )
			{
				_queueManager.close( );
				_queueManager = null;
			}
			
			return true;
		}
		catch ( Exception exc )
		{
			return false;
		}
	}

	@Override
	public IWmqQueueConnection openQueue2Get( String queueName )
	{
		if ( null == _queueManager )
			return null;
		
		try
		{
			MQQueue queue = _queueManager.accessQueue( queueName, CMQC.MQOO_INPUT_SHARED | CMQC.MQOO_INQUIRE | CMQC.MQOO_BROWSE );
			
			WmqQueueConnection queueConnection = new WmqQueueConnection( queueName, WmqQueueConnection.OpenTypes.GET, this, queue );
			return queueConnection;
		}
		catch ( Exception exc )
		{
			return null;
		}
	}

	@Override
	public IWmqQueueConnection openQueue2Put( String queueName )
	{
		if ( null == _queueManager )
			return null;
		
		try
		{
			MQQueue queue = _queueManager.accessQueue( queueName, CMQC.MQOO_OUTPUT | CMQC.MQOO_INQUIRE | CMQC.MQOO_SET_IDENTITY_CONTEXT | CMQC.MQOO_BROWSE );
			
			WmqQueueConnection queueConnection = new WmqQueueConnection( queueName, WmqQueueConnection.OpenTypes.PUT, this, queue );
			return queueConnection;
		}
		catch ( Exception exc )
		{
			return null;
		}
	}
}
