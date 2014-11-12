package ru.acs.fts.eps2.model.services.conditions;

import java.util.HashMap;
import java.util.Map;

import ru.acs.fts.eps2.model.entities.EdeclMsgList;

public class MsgListCondition extends AbstractSelectionCondition< EdeclMsgList > 
{
	private String _messageType;
	
	public MsgListCondition( String messageType )
	{
		_messageType = messageType;
	}
	
	@Override
	public boolean check( EdeclMsgList object )
	{
		boolean result = false;
		if ( null != object )
		{
			String objMessageType = object.getMessageType( );
			result = compare( objMessageType, _messageType );
		}
				
		return result;
	}

	@Override
	public String getQueryString( ) 
	{
		StringBuilder queryBuilder = new StringBuilder( );
		queryBuilder.append( "select ml from EdeclMsgList ml " );
		queryBuilder.append( "where ml.messageType = :msgType" );
		
		return queryBuilder.toString( );
	}

	@Override
	public Map< String, Object > getQueryArgs( )
	{
		Map< String,Object > args = new HashMap< String, Object >( );
		args.put( "msgType", _messageType );
		
		return args;
	}

}
