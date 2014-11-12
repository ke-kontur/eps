package ru.acs.fts.eps2.model.services.conditions;

import java.util.HashMap;
import java.util.Map;

import ru.acs.fts.eps2.model.defines.ActionEvents;
import ru.acs.fts.eps2.model.defines.SpecialProcedureStates;
import ru.acs.fts.eps2.model.entities.Edecl_State_Transmissions;

public class StateTransmissionSelectionConditionHolder
{
	private StateTransmissionSelectionConditionHolder() { }
	
	public static StateTransmissionWithoutResultSelectionCondition getStateTransmissionWithoutResultSelectorCondition(
			String stateCode, String softVersion, 
			String incomingMessageCode, String eventName	)
	{
		return new StateTransmissionWithoutResultSelectionCondition( 
				stateCode, softVersion, incomingMessageCode, eventName );
	}
	
	public static StateTransmissionSelectionCondition getStateTransmissionSelectorCondition(
			String stateCode, String softVersion, 
			String resultStateCode, String incomingMessageCode, String eventName )
	{
		return new StateTransmissionSelectionCondition( stateCode, softVersion, 
				resultStateCode, incomingMessageCode, eventName );
	}
	
	public static MessageAndStmodeTypeSelectionCondition getMessageAndStmodeTypeSelectorCondition(
			String messageCode, String stmodeType )
	{
		return new MessageAndStmodeTypeSelectionCondition( messageCode, stmodeType );
	}
	
	public static MessageSoftCondition getMessageSoftCondition(
			String msgType, String softVersion )
	{
		return new MessageSoftCondition( msgType, softVersion );
	}
	
	private static class StateTransmissionWithoutResultSelectionCondition 
		extends AbstractSelectionCondition< Edecl_State_Transmissions >
	{
		private String stateCode;
		private String softVersion;
		private String incomingMessageCode;
		private String eventName;
		
		public StateTransmissionWithoutResultSelectionCondition( String stateCode, String softVersion, 
				String incomingMessageCode, String eventName )
		{
			this.stateCode = stateCode;
			this.softVersion = softVersion;
			this.incomingMessageCode = incomingMessageCode;
			this.eventName = eventName;
		}
		
		@Override
		public boolean check( Edecl_State_Transmissions object )
		{
			boolean result = true;
			if ( null != object )
			{
				String stCode = object.getStateCode( );
				result = compare( stCode, stateCode );
				
				if ( result )
				{
					String version = object.getSoftVersionId( );
					result = compare( version, softVersion );
				}
				
				if ( result )
				{
					String incMsgCode = object.getIncomingMsgCode( );
					result = compare( incMsgCode, incomingMessageCode );
				}
				
				if ( result )
				{
					String event = object.getEventName( );
					result = compare( event, eventName );
				}
			}
			else
				result = false;
			
			return result;
		}
		
		@Override
		public String getQueryString( )
		{
			StringBuilder query = new StringBuilder( );
			query = query.append( "select sttr from Edecl_State_Transmissions sttr " );
			query = query.append( "where ( sttr.stateCode = :stateCode ) " );
			query = query.append( "and ( sttr.softVersionId = :softVersionId ) " );
			query = query.append( "and ( sttr.incomingMsgCode = :incomingMsgCode ) " );
			query = query.append( "and ( sttr.eventName = :eventName )" );
			
			return query.toString( );
		}
	
		@Override
		public Map< String, Object > getQueryArgs( )
		{
			Map< String, Object > params = new HashMap< String, Object >( );
			params.put( "stateCode", stateCode );
			params.put( "softVersionId", softVersion );
			params.put( "incomingMsgCode", incomingMessageCode );
			params.put( "eventName", eventName );
			
			return params;
		}
	}
	
	private static class StateTransmissionSelectionCondition 
		extends AbstractSelectionCondition< Edecl_State_Transmissions > 
	{
		private String stateCode;
		private String softVersion;
		private String resultStateCode;
		private String incomingMessageCode;
		private String eventName;
		
		public StateTransmissionSelectionCondition( String stateCode, String softVersion, 
				String resultStateCode, String incomingMessageCode, String eventName )
		{
			this.stateCode = stateCode;
			this.softVersion = softVersion;
			this.resultStateCode = resultStateCode;
			this.incomingMessageCode = incomingMessageCode;
			this.eventName = eventName;
		}
	
		@Override
		public boolean check( Edecl_State_Transmissions object )
		{
			boolean result = true;
			if ( null != object )
			{
				String stCode = object.getStateCode( );
				result = compare( stCode, stateCode );
				
				if ( result )
				{
					String version = object.getSoftVersionId( );
					result = compare( version, softVersion );
				}
				
				if ( result )
				{
					String resultStCode = object.getResultStateCode( );
					result = compare( resultStCode, resultStateCode );
				}
				
				if ( result )
				{
					String incMsgCode = object.getIncomingMsgCode( );
					result = compare( incMsgCode, incomingMessageCode );
				}
				
				if ( result )
				{
					String event = object.getEventName( );
					result = compare( event, eventName );
				}
			}
			else
				result = false;
			
			return result;
		}
	
		@Override
		public String getQueryString( )
		{
			StringBuilder query = new StringBuilder( );
			query = query.append( "select sttr from Edecl_State_Transmissions sttr " );
			query = query.append( "where sttr.stateCode = :stateCode " );
			query = query.append( "and sttr.softVersionId = :softVersionId " );
			query = query.append( "and sttr.resultStateCode = :resultStateCode " );
			query = query.append( "and sttr.incomingMsgCode = :incomingMsgCode " );
			query = query.append( "and sttr.eventName = :eventName" );
			
			return query.toString( );
		}
	
		@Override
		public Map< String, Object > getQueryArgs( )
		{
			Map< String, Object > params = new HashMap< String, Object >( );
			params.put( "stateCode", stateCode );
			params.put( "softVersionId", softVersion );
			params.put( "resultStateCode", resultStateCode );
			params.put( "incomingMsgCode", incomingMessageCode );
			params.put( "eventName", eventName );
			
			return params;
		}
		
	}
	
	private static class MessageAndStmodeTypeSelectionCondition 
		extends AbstractSelectionCondition< Edecl_State_Transmissions >
	{
		private String _messageCode;
		
		private String _stmodeType;
		
		private static final String EVENT_NAME = ActionEvents.NO_EVENT;
		
		private static final String CURRENT_STATE = 
			SpecialProcedureStates.PROC_NOT_OPEN_STATE;
		
		public MessageAndStmodeTypeSelectionCondition( String messageCode, String stmodeType )
		{
			_messageCode = messageCode;
			_stmodeType = stmodeType;
		}
		
		@Override
		public boolean check( Edecl_State_Transmissions object )
		{
			boolean result = false;
			if ( null != object )
			{
				result = compare( _messageCode, object.getIncomingMsgCode( ) )
							&& compare( _stmodeType, object.getStmodeTypeCode( ) )
							&& compare( EVENT_NAME, object.getEventName( ) )
							&& compare( CURRENT_STATE, object.getStateCode( ) );
			}
			
			return result;
		}
	
		@Override
		public String getQueryString( )
		{
			StringBuilder query = 
				new StringBuilder( "select sttr from Edecl_State_Transmissions sttr" );
			query.append( " where sttr.incomingMsgCode = :msgCode" );
			query.append( " and sttr.stmodeTypeCode = :stmodeType" );
			query.append( " and sttr.eventName = " );
			query.append( EVENT_NAME );
			query.append( " and sttr.stateCode = " );
			query.append( CURRENT_STATE );
			
			return query.toString( );
		}
	
		@Override
		public Map< String, Object > getQueryArgs( )
		{
			Map< String, Object > args = new HashMap< String, Object >( );
			args.put( "msgCode", _messageCode );
			args.put( "stmodeType", _stmodeType );
			
			return args;
		}
	}
	
	public static class MessageSoftCondition // NO_UCD (use private)
		extends AbstractSelectionCondition< Edecl_State_Transmissions >
	{
		private String _messageType;
		private String _softVersion;
		
		public MessageSoftCondition( String msgType, String softVersion ) // NO_UCD (use private)
		{
			_messageType = msgType;
			_softVersion = softVersion;
		}
		
		@Override
		public boolean check( Edecl_State_Transmissions object )
		{
			boolean result = false;
			if ( null != object )
			{
				result = compare( object.getIncomingMsgCode( ), _messageType )
						&& compare( object.getSoftVersionId( ), _softVersion );
			}
			
			return result;
		}

		@Override
		public String getQueryString( )
		{
			StringBuilder query = 
				new StringBuilder( "select sttr from Edecl_State_Transmissions sttr" );
			query.append( " where sttr.incomingMsgCode = :msgType" );
			query.append( " and sttr.softVersionId = :softVersion" );
			
			return query.toString( );
		}

		@Override
		public Map< String, Object > getQueryArgs( )
		{
			Map< String, Object > args = new HashMap< String, Object >( );
			args.put( "msgType", _messageType );
			args.put( "softVersion", _softVersion );
			
			return args;
		}
		
	}
}
