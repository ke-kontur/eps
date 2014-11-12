package ru.acs.fts.eps2.router.persistence.operators;

import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.data.kind.ProcedureCreateStates;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.ProcedureChangeInformation;
import ru.acs.fts.eps2.model.defines.ActionEvents;
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.model.entities.Edecl_Procstate;
import ru.acs.fts.eps2.model.services.ProcedureService;
import ru.acs.fts.eps2.model.services.StateTransmissionService;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.utils.StringUtil;
import ru.acs.fts.schemas.envelope.CustomsType;

public class ProcedureOperator implements IOperator
{
	private static final Logger log = LoggerFactory.getLogger( ProcedureOperator.class );
	
	private ProcedureService _procedureService;	
	private StateTransmissionService _stateTransmissionService;
	
	// @formatter:off
	@Required
	public void setProcedureService( ProcedureService service ) { _procedureService = service; }
	public ProcedureService getProcedureService( ) { return _procedureService; }
	
	@Required
	public void setStateTransmissionService( StateTransmissionService service ) { _stateTransmissionService = service; }
	public StateTransmissionService getStateTransmissionService( ) { return _stateTransmissionService; }
	// @formatter:on
	
	/**
	 * Получить результирующее состояние процедуры обмена. Примечание: от
	 * Edecl_Proc_Information требуется наличие полей: CurrentState, UDFlag,
	 * ProcessID
	 */
	public String getNewState( Edecl_Proc_Information stateInformation, String messageType, String documentId )
		throws ResultTypeException, DatabaseException
	{
		String newState = _stateTransmissionService.getNextState(
			stateInformation.getCurrentState( ), messageType,
			( stateInformation.getUdFlag( ) == 1 ),
			stateInformation.getProcessId( ) 
		);

		if ( StringUtil.isNullOrEmpty( newState ) )
		{
			String errorMsg = String.format( 
				"Переход невозможен для %s и %s", 
				stateInformation.getCurrentState( ), messageType 
			);
			
			log.error( errorMsg );

			ErrorHelper.throwException( 
				errorMsg, documentId, 
				ResultCodes._02_00081_01, 
				ProcessingConstants.ERROR_TYPE_BUSINESS
			);
		}

		return newState;
	}
	
	public String getNewState( Edecl_Proc_Information procInfo, String messageType, String event, String documentId ) // NO_UCD (use private) 
		throws ResultTypeException, DatabaseException  
	{
		String newState = _stateTransmissionService.getNextState( 
			procInfo.getCurrentState( ), messageType, event 
		);
		
		if ( StringUtil.isNullOrEmpty( newState ) )
		{
			newState = _stateTransmissionService.getNextState( 
				procInfo.getCurrentState( ), messageType, ActionEvents.NO_EVENT 
			);
			
			if ( StringUtil.isNullOrEmpty( newState ) )
			{
				String errorMsg = String.format( 
					"Переход невозможен для %s и %s с условием %s",
					procInfo.getCurrentState( ), messageType, event 
				); 
				
				log.error( errorMsg );

				ErrorHelper.throwException( 
					errorMsg, documentId, 
					ResultCodes._02_00081_01, 
					ProcessingConstants.ERROR_TYPE_BUSINESS
				);
			}
		}
		
		return newState;
	}
	
	public void setProcedureNewState( 
			EDJobBatchContext jobBatchContext, 
			String envelopeId, String processID, 
			String messageType, String event ) 
		throws ResultTypeException, DatabaseException 
	{
		if ( ! StringUtil.isNullOrEmpty( processID ) && 
			 ( ! messageType.equals( MessageType.CMN_00001 ) ) && 
			 ( ! messageType.equals( MessageType.CMN_00002 ) ) && 
			 ( ! messageType.equals( MessageType.CMN_00004 ) ) )
		{
			String debugMsg = String.format(
				"Начали проверку возможности статусного перехода %s %s %sс условием",
				envelopeId, processID, messageType
			);
			
			log.debug( debugMsg );
			
			getNewProcStateProcess( jobBatchContext, processID, envelopeId, messageType, event );
		}
	}
	
	public void setProcedureNewState( 
			EDJobBatchContext jobBatchContext, 
			String envelopeId, String processID, 
			String messageType ) 
		throws ResultTypeException, DatabaseException 
	{
		if ( ! StringUtil.isNullOrEmpty( processID ) && 
			 ( ! messageType.equals( MessageType.CMN_00001 ) ) && 
			 ( ! messageType.equals( MessageType.CMN_00002 ) ) && 
			 ( ! messageType.equals( MessageType.CMN_00004 ) ) )
		{
			String debugMsg = String.format(
				"Начали проверку возможности статусного перехода %s %s %s",
				envelopeId, processID, messageType
			);
			
			log.debug( debugMsg );
			
			getNewProcStateProcess( jobBatchContext, processID, envelopeId, messageType );
		}
	}
	
	private void getNewProcStateProcess( 
			EDJobBatchContext jobBatchContext, 
			String processId, String envelopeId, 
			String messageType, String event ) 
		throws ResultTypeException, DatabaseException 
	{
		Edecl_Proc_Information currentProcInfo = null;
		if ( processId != null )
		{
			currentProcInfo = _procedureService.getProcInformation( processId ); 
			if ( currentProcInfo == null )
			{
				log.error( String.format( "такой процедуры (%s) нет в БД ", processId ) );
				
				ErrorHelper.throwException( 
					jobBatchContext, ResultCodes._01_00041_01, 
					ProcessingConstants.ERROR_TYPE_AUTH 
				);
			}
			
			String documentId = jobBatchContext.getReceivedEnvelope( ).getDocument( ).getDocumentID( );
			
			String newStateTransmittion = ( null == event ) 
				? getNewState( currentProcInfo, messageType, documentId ) 
				: getNewState( currentProcInfo, messageType, event, documentId );
				
			jobBatchContext.setProcedureChangeInformation( 
				new ProcedureChangeInformation(
					newStateTransmittion, 
					createNewProcState(
						currentProcInfo, newStateTransmittion, envelopeId 
					) 
				) 
			);
			jobBatchContext.getProcedureChangeInformation( ).setNewFlags( currentProcInfo.getFlags( ) );
		}

		// TODO: проверить использует кто или нет, если нет удалить нафиг
		jobBatchContext.put( ContextConstants.CURRENT_PROCESS_SOFT_VERSION, null == currentProcInfo ? null : currentProcInfo.getSoftVersion( ) );
		jobBatchContext.put( ContextConstants.CURRENT_PROCESS_ID,  null == currentProcInfo ? null : currentProcInfo.getProcessId( ) );
	}
	
	/**
	 * создание нового статусного состояния
	 */
	private Edecl_Procstate createNewProcState( 
			Edecl_Proc_Information procinfo, 
			String newStateTransmittion, String envelopeId )
	{
		Edecl_Procstate procStateToSave = new Edecl_Procstate( );
		procStateToSave.setCode( newStateTransmittion );
		procStateToSave.setEnvelopeId( envelopeId );
		procStateToSave.setNeedSave( true );
		procStateToSave.setProcessId( procinfo.getProcessId( ) );
		procStateToSave.setSetStatusTime( new GregorianCalendar( ) );
		return procStateToSave;
	}
	
	private void getNewProcStateProcess( 
			EDJobBatchContext jobBatchContext, 
			String processId, String envelopeId, 
			String messageType ) 
		throws ResultTypeException, DatabaseException 
	{
		getNewProcStateProcess( jobBatchContext, processId, envelopeId, messageType, null );
	}
	
	
	public Edecl_Proc_Information getProcedureInformation( EDEnvelope env ) 
		throws DatabaseException
	{
		String processId = env.getProcessID( );
		String softVersion = env.getSoftVersion( );
		String participantId = env.getParticipantID( );
		
		return _procedureService.getProcedureInfo( processId, participantId, softVersion );
	}
	
	public Edecl_Proc_Information getProcedureInformationWithSenderCode( EDEnvelope env ) 
		throws DatabaseException
	{
		String processId = env.getProcessID( );
		String participantId = env.getParticipantID( );
		String senderCode = env.getSenderCustoms( ).getCustomsCode( );
		String softVersion = env.getSoftVersion( );
		
		return _procedureService.getProcedureInfo( processId, senderCode, participantId, softVersion );
	}
	
	public Edecl_Proc_Information getProcedureInformationWithReceiverCode( EDEnvelope env ) 
		throws DatabaseException
	{
		String processId = env.getProcessID( );
		String participantId = env.getParticipantID( );
		String recvCode = env.getReceiverCustoms( ).getCustomsCode( );
		String softVersion = env.getSoftVersion( );
		
		return _procedureService.getProcedureInfo( processId, recvCode, participantId, softVersion );
	}

	public boolean isExistProcessByCustomsCode( CustomsType customsInfo, String processID ) 
		throws DatabaseException
	{
		StringBuilder bld = new StringBuilder( );
		
		bld.append( "select pi from Edecl_Proc_Information pi " );
		bld.append( "where pi.processId = :processId " );
			bld.append( " and ( ( pi.custCode = :customsCode and pi.exchType = :exchType ) " );
				bld.append( " or ( pi.borderCustCode = :customsCode and pi.exchType = :exchType ) )" );
				
		Map< String, Object > arguments = new HashMap< String, Object >( );
		arguments.put( "processId", processID );
		arguments.put( "customsCode", customsInfo .getCustomsCode( ) );
		arguments.put( "exchType", Integer.parseInt( customsInfo.getExchType( ) ) );
		
		List< Edecl_Proc_Information > infos = _procedureService.selectProcedures( bld.toString( ), arguments );
		return ( infos.size( ) > 0 );
	}

	public void updateProcedureData( 
			Edecl_Proc_Information procInformation, 
			ProcedureChangeInformation procedureChangeInformation, 
			String procedureCreateState, boolean commit ) 
		throws DatabaseException
	{
		if ( ProcedureCreateStates.isSame( procedureCreateState, ProcedureCreateStates.RE_CREATE_EXIST ) )
			log.debug( "Открытие процедуры" );
		else
		{
			log.debug( "Обновляем информацию о процедуре" );
			procInformation.setCurrentState( procedureChangeInformation.getNewProcedureState( ) );
		}
		
		procInformation.setFlags( procedureChangeInformation.getNewFlags( ) );
		
		_procedureService.persist( procInformation, commit );
		
		List< Edecl_Procstate > procStates = procedureChangeInformation.getProcStates( );
		if ( null != procStates )
		{
			for ( final Edecl_Procstate procState : procStates )
			{
				log.debug( "Сохраняем объект состояния процедуры" );
				_procedureService.persist( procState, commit );
			}
		}
	}	

}
