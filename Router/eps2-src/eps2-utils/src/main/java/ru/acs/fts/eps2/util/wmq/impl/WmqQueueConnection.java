package ru.acs.fts.eps2.util.wmq.impl;

import com.ibm.mq.MQGetMessageOptions;
import com.ibm.mq.MQMessage;
import com.ibm.mq.MQPutMessageOptions;
import com.ibm.mq.MQQueue;
import com.ibm.mq.constants.CMQC;

import ru.acs.fts.eps2.util.wmq.interfaces.IWmqConnection;
import ru.acs.fts.eps2.util.wmq.interfaces.IWmqQueueConnection;

public class WmqQueueConnection implements IWmqQueueConnection // NO_UCD (use default)
{
	private static final int CHARACTER_SET = 1208;
	private static final int PUT_OPTIONS = CMQC.MQPMO_LOGICAL_ORDER | CMQC.MQPMO_SET_IDENTITY_CONTEXT /* | CMQC.MQPMO_SYNCPOINT */;
	private static final int GET_OPTIONS = CMQC.MQGMO_WAIT | CMQC.MQGMO_FAIL_IF_QUIESCING | CMQC.MQGMO_LOGICAL_ORDER | CMQC.MQGMO_COMPLETE_MSG | CMQC.MQGMO_ALL_SEGMENTS_AVAILABLE;
	private static final int GET_MATCH_OPTIONS = CMQC.MQMO_MATCH_GROUP_ID | CMQC.MQMO_MATCH_MSG_SEQ_NUMBER;
	
	public static enum OpenTypes // NO_UCD (use default)
	{
		GET, PUT
	}
	
	@SuppressWarnings( "unused" ) private String _queueName;
	private OpenTypes _openType;
	@SuppressWarnings( "unused" ) private IWmqConnection _connection;
	private MQQueue _queue;
	
	public WmqQueueConnection( String queueName, OpenTypes openType, IWmqConnection connection, MQQueue queue ) // NO_UCD (use default)
	{
		_queueName = queueName;
		_openType = openType;
		_connection = connection;
		_queue = queue;
	}
	
	@Override
	public boolean shutdown( )
	{
		try
		{
			if ( null != _queue )
			{
				_queue.close( );
				_queue = null;
			}
			
			return true;
		}
		catch ( Exception exc )
		{
			return false;
		}
	}
	
	@Override
	public boolean putMessage( byte[ ] message )
	{
		if ( _openType != OpenTypes.PUT )
			return false;

		try
		{
			MQMessage msg = new MQMessage( );
			msg.characterSet = CHARACTER_SET;
			
			MQPutMessageOptions pmo = new MQPutMessageOptions( );
			pmo.options = PUT_OPTIONS;
			
			msg.clearMessage( );
			msg.correlationId = CMQC.MQCI_NONE;
			msg.messageId = CMQC.MQMI_NONE;
			msg.format = CMQC.MQFMT_NONE;
			msg.messageFlags = CMQC.MQMF_SEGMENTATION_ALLOWED;
			msg.write( message );
			
			_queue.put( msg, pmo );
			
			return true;
		}
		catch ( Exception exc )
		{
			return false;
		}
	}

	@Override
	public byte[ ] getMessage( )
	{
		if ( _openType != OpenTypes.GET )
			return null;
		
		try
		{
			MQGetMessageOptions gmo = new MQGetMessageOptions( );
			gmo.options = GET_OPTIONS;
			gmo.matchOptions = GET_MATCH_OPTIONS;
			
			MQMessage msg = new MQMessage( );
			_queue.get( msg, gmo );
			
			byte[ ] bytes = new byte[ msg.getMessageLength( ) ];
			msg.readFully( bytes );
			
			return bytes;
		}
		catch ( Exception exc )
		{
			return null;
		}
	}
	
	@Override
	public int getDepth( )
	{
		if ( null == _queue )
			return -1;
		
		try
		{
			return _queue.getCurrentDepth( );
		}
		catch ( Exception exc )
		{
			return -1;
		}
	}
}
