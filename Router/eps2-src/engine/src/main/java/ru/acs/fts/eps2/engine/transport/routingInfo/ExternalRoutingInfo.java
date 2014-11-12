package ru.acs.fts.eps2.engine.transport.routingInfo;

import com.ibm.mq.jms.JMSC;
import com.ibm.mq.jms.MQQueue;
import com.ibm.mq.jms.MQXAQueueConnectionFactory;

import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;

public class ExternalRoutingInfo
{
	private String _hostName;
	private String _queueManager;
	private String _queue;
	private String _channel;
	private int _port = 0;
	private String _destinationQueueManager;
	private String _destinationQueue;
	
	// @formatter:off
	public void setHostName( String hostName ) { _hostName = hostName; }
	public String getHostName( ) { return _hostName; }

	public void setQueueManager( String queueManager ) { _queueManager = queueManager; }
	public String getQueueManager( ) { return _queueManager; }

	public void setQueue( String queue ) { _queue = queue; }
	public String getQueue( ) { return _queue; }

	public void setChannel( String channel ) { _channel = channel; } 
	public String getChannel( ) { return _channel; }

	public void setPort( int port ) { _port = port; }
	public int getPort( ) { return _port; }
	
	public void setDestinationQueueManager( String destinationQueueManager ) { _destinationQueueManager = destinationQueueManager; }
	public String getDestinationQueueManager( ) { return _destinationQueue; }
	
	public void setDestinationQueue( String destinationQueue ) { _destinationQueue = destinationQueue; }
	public String getDestinationQueue( ) { return _destinationQueue; }
	// @formatter:on

	public ExternalRoutingInfo( )
	{
	}

	public ExternalRoutingInfo( 
			String hostName, 
			String queueManager, String queue, 
			String channel, int port,
			String destinationQueueManager, String destinationQueue )
	{
		_hostName = hostName;
		_queueManager = queueManager;
		_queue = queue;
		_channel = channel;
		_port = port;
		_destinationQueueManager = destinationQueueManager;
		_destinationQueue = destinationQueue;
	}

	public Destination getDestination( ) throws JMSException
	{
		MQQueue mq = new MQQueue( );
		
		mq.setBaseQueueName( _destinationQueue );
		mq.setPersistence( JMSC.MQJMS_PER_PER ); // 1
		mq.setBaseQueueManagerName( _destinationQueueManager );
		mq.setTargetClient( JMSC.MQJMS_CLIENT_NONJMS_MQ );
		
		return mq;
	}

	public ConnectionFactory getConnectionFactory( ) 
		throws JMSException
	{
		MQXAQueueConnectionFactory fact = new MQXAQueueConnectionFactory( );
		
		fact.setCCSID( 1208 );
		fact.setHostName( _hostName );
		fact.setChannel( _channel );
		fact.setQueueManager( _queueManager );
		fact.setPort( _port );
		fact.setTransportType( 1 );
		
		return fact;
	}
}
