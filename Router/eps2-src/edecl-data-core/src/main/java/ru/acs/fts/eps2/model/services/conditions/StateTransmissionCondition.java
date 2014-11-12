package ru.acs.fts.eps2.model.services.conditions;

import java.util.HashMap;
import java.util.Map;

import ru.acs.fts.eps2.model.entities.Edecl_State_Transmissions;

// TODO: понять надо ли нам это, и если не надо удалить 
public class StateTransmissionCondition extends AbstractSelectionCondition< Edecl_State_Transmissions > { // NO_UCD (todo added) 

	private String stateCode;
	
	private String incomingMsgCode;
	
	private String eventName;
	
	public StateTransmissionCondition( String stateCode, String incomingMsgCode, String eventName )
	{
		this.stateCode = stateCode;
		this.incomingMsgCode = incomingMsgCode;
		this.eventName = eventName;
	}
	
	@Override
	public boolean check( Edecl_State_Transmissions object ) 
	{
		boolean result = false;
		if ( null != object )
		{
			String objStateCode = object.getStateCode( );
			String objIncomingMsgCode = object.getIncomingMsgCode( );
			String objEventName = object.getEventName( );
			
			result = compare( objStateCode, stateCode );
			if ( result )
				result = compare( incomingMsgCode, objIncomingMsgCode );
			if ( result )
				result = compare( eventName, objEventName );
		}
		
		return result;
	}

	@Override
	public String getQueryString( )
	{
		StringBuilder queryBuilder = new StringBuilder( );
		queryBuilder.append( "select st from Edecl_StateTransmission st " );
		queryBuilder.append( "where st.stateCode = :stateCode and " );
		queryBuilder.append( "st.incomingMsgCode = :incomingMsgCode and " );
		queryBuilder.append( "st.eventName = :eventName" );
		
		return queryBuilder.toString( );
	}

	@Override
	public Map< String, Object > getQueryArgs( )
	{
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "incomingMsgCode", incomingMsgCode );
		args.put( "stateCode", stateCode );
		args.put( "eventName", eventName );
		
		return args;
	}

}
