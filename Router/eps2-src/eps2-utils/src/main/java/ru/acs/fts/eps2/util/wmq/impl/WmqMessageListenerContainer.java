package ru.acs.fts.eps2.util.wmq.impl;

import java.util.ArrayList;
import java.util.List;

import ru.acs.fts.eps2.util.wmq.interfaces.IWmqConnection;
import ru.acs.fts.eps2.util.wmq.interfaces.IWmqConnectionFactory;
import ru.acs.fts.eps2.util.wmq.interfaces.IWmqMessageListener;
import ru.acs.fts.eps2.util.wmq.interfaces.IWmqQueueConnection;

public class WmqMessageListenerContainer // NO_UCD (for reference)
{
	private int _consumersCount;
	private String _queueName;
	
	private IWmqConnectionFactory _connectionFactory;
	private IWmqMessageListener _messageListener;
	
	// @formatter:off
	public void setConsumersCount( int consumersCount ) { _consumersCount = consumersCount; }
	public int getConsumersCount( ) { return _consumersCount; }
	
	public void setQueueName( String queueName ) { _queueName = queueName; }
	public String getQueueName( ) { return _queueName; }
	
	public void setConnectionFactory( IWmqConnectionFactory connectionFactory ) { _connectionFactory = connectionFactory; }
	public IWmqConnectionFactory getConnectionFactory( ) { return _connectionFactory; } 
	
	public void setMessageListener( IWmqMessageListener messageListener ) { _messageListener = messageListener; }
	public IWmqMessageListener getMessageListener( ) { return _messageListener; }
	// @formatter:on
	
	private List< Consumer > _consumers = new ArrayList< Consumer >( );

	public void initiate( )
	{
		for ( int i = 0; i < _consumersCount; ++i )
		{
			Consumer consumer = new Consumer( );
			_consumers.add( consumer );
		}
	}
	
	public void shutdown( )
	{
		for ( Consumer consumer : _consumers )
		{
			consumer.setIsWorking( false );
			
			try
			{
				consumer.getThread( ).join( );
			}
			catch ( InterruptedException e )
			{
			}
		}
	}
	
	private class Consumer implements Runnable
	{
		private boolean _isWorking = false;
		private Thread _thread;
		
		// @formatter:off
		public void setIsWorking( boolean isWorking ) { _isWorking = isWorking; }
		
		public Thread getThread( ) { return _thread; }
		// @formatter:on
		
		public Consumer( )
		{
			_isWorking = true;
			
			_thread = new Thread( this );
			_thread.start( );
		}
		
		@Override
		public void run( )
		{
			while ( _isWorking )
			{
				IWmqConnection connection = null;
				IWmqQueueConnection queueConnection = null;
				try
				{
					connection = _connectionFactory.createConnection( );
					if ( null == connection )
						continue;

					queueConnection = connection.openQueue2Get( _queueName );
					if ( null == queueConnection )
						continue;
					
					while ( _isWorking )
					{
						byte[ ] msg = queueConnection.getMessage( );
						if ( null != msg && null != _messageListener )
							_messageListener.onMessage( msg );;
					}
				}
				catch ( Exception exc )
				{
					
				}
				finally
				{
					if ( null != queueConnection )
					{
						queueConnection.shutdown( );
						queueConnection = null;
					}
					if ( null != connection )
					{
						connection.shutdown( );
						connection = null;
					}
				}
			}
		}
	}
}
