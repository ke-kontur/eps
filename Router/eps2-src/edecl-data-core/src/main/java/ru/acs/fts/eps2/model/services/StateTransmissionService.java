package ru.acs.fts.eps2.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.eps2.model.defines.ActionEvents;
import ru.acs.fts.eps2.model.defines.SpecialProcedureStates;
import ru.acs.fts.eps2.model.entities.Edecl_State_Transmissions;
import ru.acs.fts.eps2.model.services.conditions.ISelectionCondition;
import ru.acs.fts.eps2.model.services.conditions.StateTransmissionSelectionConditionHolder;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.utils.StringUtil;

public class StateTransmissionService extends AbstractCachedService< Edecl_State_Transmissions >
{
	private String _softVersion;
	
	@Required
	public void setSoftVersion( String softVersion ) { _softVersion = softVersion; }
	public String getSoftVersion( ) { return _softVersion; }
	
	@Override
	public Class< Edecl_State_Transmissions > getEntityClass( )
	{
		return Edecl_State_Transmissions.class;
	}
	
	public List< Edecl_State_Transmissions > getStateTransmissions( 
			String currentState, String softVersion, String incMsgType, String eventName )
		throws DatabaseException
	{
		ISelectionCondition< Edecl_State_Transmissions > condition = 
			StateTransmissionSelectionConditionHolder
				.getStateTransmissionWithoutResultSelectorCondition( 
					currentState, 
					softVersion, 
					incMsgType, 
					eventName );
		
		return find( condition );
	}

	public Edecl_State_Transmissions getStateTransmission( String stateCode, String softVersion, String resultStateCode, String incomingMessageCode, String eventName ) throws DatabaseException
	{
		ISelectionCondition< Edecl_State_Transmissions > condition = StateTransmissionSelectionConditionHolder
				.getStateTransmissionSelectorCondition( stateCode, softVersion, resultStateCode,
						incomingMessageCode, eventName );
		List< Edecl_State_Transmissions > results = find( condition );
		Edecl_State_Transmissions result = null;
		if ( null != results && !results.isEmpty( ) )
			result = results.get( 0 );

		return result;
	}

	/**
	 * Возвратить новое состояние процедуры обмена. ActionEvent = NO_EVENT (
	 * Используется версия обмена, указанная в конфигурационном файле )
	 * 
	 * @param currentState Текущее состояние процедуры обмена
	 * @param messageType Тип сообщения
	 * @param udFlag Удаленность процедуры
	 * @param processId Идентификатор процедуры
	 * @return Следующее состояние процедуры обмена.
	 */
	public String getNextState( String currentState, String messageType, boolean udFlag, String processId )
			throws DatabaseException
	{
		Edecl_State_Transmissions transmission = null;
		if ( udFlag && currentState.equals( SpecialProcedureStates.PROC_NOT_OPEN_STATE ) )
		{
			if ( StringUtil.isNullOrEmpty( processId ) )
				transmission = getFirstTransmission( 
						SpecialProcedureStates.IMP_UD, messageType, ActionEvents.NO_EVENT );
			else
				transmission = getFirstTransmission( 
						SpecialProcedureStates.IMP_UD_EXT, messageType, ActionEvents.NO_EVENT );
		}
		else
			transmission = getFirstTransmission( currentState, messageType, ActionEvents.NO_EVENT );
		
		return null == transmission ? null : transmission.getResultStateCode( );
	}

	/**
	 * Возвратить новое состояние процедуры обмена. ( Используется версия
	 * обмена, указанная в конфигурационном файле )
	 * 
	 * @param currentState Текущее состояние процедуры обмена
	 * @param messageType Тип сообщения
	 * @param eventName Тип события обмена
	 * @return Следующее состояние процедуры обмена.
	 */
	public String getNextState( String currentState, String messageType, String eventName ) throws DatabaseException
	{
		Edecl_State_Transmissions transmission = 
			getFirstTransmission( currentState, messageType, eventName );
		
		return ( transmission != null ) ? transmission.getResultStateCode( ) : null;
	}
	
	private Edecl_State_Transmissions getFirstTransmission( String state, String messageType, String event )
		throws DatabaseException
	{
		Edecl_State_Transmissions transmission = null;
		List< Edecl_State_Transmissions > trans = getStateTransmissions( 
			state, _softVersion, messageType, event
		);

		if ( null != trans && ! trans.isEmpty( ) )
			transmission = trans.get( 0 );
		
		return transmission;
	}
}