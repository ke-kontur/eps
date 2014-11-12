package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.ArrayList;
import java.util.List;

import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.data.kind.DocumentModeIDs;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edecl_State_Transmissions;
import ru.acs.fts.eps2.model.entities.Edecl_Statuslist;
import ru.acs.fts.eps2.model.services.ErrListService;
import ru.acs.fts.eps2.model.services.ProcedureService;
import ru.acs.fts.eps2.model.services.StateModelTypeService;
import ru.acs.fts.eps2.model.services.StateTransmissionService;
import ru.acs.fts.eps2.model.services.StatusListService;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.AdminCommandsHelper;
import ru.acs.fts.eps2.util.helpers.UUIDGen;
import ru.acs.fts.schemas.admin.statusupdaterequest.StateTransmissionsType;
import ru.acs.fts.schemas.admin.statusupdaterequest.StatusUpdateRequestType;
import ru.acs.fts.schemas.admin.statusupdaterequest.StatusesType;
import ru.acs.fts.schemas.admin.updatedb_result.RowResultType;
import ru.acs.fts.schemas.admin.updatedb_result.UpdateDBResultType;

public class MessageADM10005BusinessProcess extends BusinessProcess
{
	private static final String ADDED_STATUS_SUCCESS = "Статус успешно добавлен";
	private static final String ADDED_TRANSMISSION_SUCCESS = "Статусный переход успешно добавлен";
	private static final String ADDING_STATUS_NOT_REQUIRED = "Добавление статуса не требуется";
	private static final String ADDING_TRANSMISSION_NOT_REQUIRED = "Добавление статусного перехода не требуется";

	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		StatusUpdateRequestType request = recvEnv.getDocument( ).getDocumentAsClass(
				StatusUpdateRequestType.class );

		// @formatter:off
		ProcedureService procService = _serviceHolder.getProcedureService( );
		StatusListService statusListService = _serviceHolder.getStatusListService( );
		StateModelTypeService stateModelTypeService = _serviceHolder.getStateModelTypeService( );
		StateTransmissionService stateTransmissionsService = _serviceHolder.getStateTransmissionService( );
		ErrListService errorListService = _serviceHolder.getErrListService( );
		// @formatter:on

		UpdateDBResultType result = new UpdateDBResultType( );
		List< RowResultType > responseStatusList = new ArrayList< RowResultType >( );
		result.setRowResultList( responseStatusList );
		result.setDocumentID( UUIDGen.getUUID( ).toString( ) );
		result.setRefDocumentID( recvEnv.getDocument( ).getDocumentID( ) );
		result.setDocumentModeID( DocumentModeIDs.UPDATE_DB_RESULT );
		
		int rowId = 0;

		boolean isOk = true;

		for ( StatusesType statusType : request.getStatuseList( ) )
		{
			Edecl_Statuslist statusList = statusListService.getStatusList( statusType
					.getStateCode( ) );
			String description = null;
			if ( null == statusList )
			{
				statusList = new Edecl_Statuslist( );
				statusList.setCode( statusType.getStateCode( ) );
				statusList.setDescription( statusType.getStatusDescription( ) );
				procService.persist( statusList );
				description = ADDED_STATUS_SUCCESS;
			}
			else
			{
				description = ADDING_STATUS_NOT_REQUIRED;
			}
			responseStatusList.add( createRowResultType( "STATUSLIST",
					ResultCodes._00_00000_00, description, rowId++ ) );
		}
		
		String globalRc = ResultCodes._00_00000_00;

		for ( StateTransmissionsType stateTransmissionsType : request.getStateTransmissionList( ) )
		{
			String rc = ResultCodes._00_00000_00;
			String description = ADDING_TRANSMISSION_NOT_REQUIRED;

			Edecl_State_Transmissions stateTransmission =
					stateTransmissionsService.getStateTransmission(
							stateTransmissionsType.getInitialStateCode( ),
							stateTransmissionsType.getSoftVersion( ),
							stateTransmissionsType.getTargetStateCode( ),
							stateTransmissionsType.getMessageType( ),
							stateTransmissionsType.getEvent( ).name( )
					);

			if ( null == statusListService.getStatusList( stateTransmissionsType
					.getInitialStateCode( ) ) )
			{
				rc = ResultCodes._99_90001_01;
				isOk = false;
				description = errorListService.getErrorMessage( rc );
			}
			else if ( null == statusListService.getStatusList( stateTransmissionsType
					.getTargetStateCode( ) ) )
			{
				rc = ResultCodes._99_90001_02;
				isOk = false;
				description = errorListService.getErrorMessage( rc );
			}
			else if ( null == _serviceHolder.getSoftVersionService( ).getSoftVersion(
					stateTransmissionsType.getSoftVersion( ) ) )
			{
				rc = ResultCodes._99_90001_03;
				isOk = false;
				description = errorListService.getErrorMessage( rc );
			}
			else if ( null == _serviceHolder.getMsgListService( ).getMsgList(
					stateTransmissionsType.getMessageType( ) ) )
			{
				rc = ResultCodes._99_90001_04;
				isOk = false;
				description = errorListService.getErrorMessage( rc );
			}
			else if ( null == stateModelTypeService.getStateModelTypeByCode( stateTransmissionsType
					.getStateModel( ) ) )
			{
				rc = ResultCodes._99_90001_05;
				isOk = false;
				description = errorListService.getErrorMessage( rc );
			}
			else if ( null == stateTransmission )
			{
				procService.persist( createStateTransmissions( stateTransmissionsType ) );
				description = ADDED_TRANSMISSION_SUCCESS;
			}
			responseStatusList.add( createRowResultType( "STATE_TRANSMISSION", rc, description, rowId++ ) );
			
			if ( ! globalRc.equals( rc ) )
				globalRc = rc;
		}
		
		result.setResultCode( globalRc );
		
		EDEnvelope respEnvelope = AdminCommandsHelper.createEnvelopeToAdmin(
				( isOk ) ? MessageType.ADM_00004 : MessageType.ADM_00001, recvEnv, result );
		jobBatchContext.put( "adminResponse", respEnvelope );
	}

	private Edecl_State_Transmissions createStateTransmissions( StateTransmissionsType stateTransmissionsType )
	{
		Edecl_State_Transmissions stateTransmissions = new Edecl_State_Transmissions( );
		stateTransmissions.setEventName( stateTransmissionsType.getEvent( ).name( ) );
		stateTransmissions.setIncomingMsgCode( stateTransmissionsType.getMessageType( ) );
		stateTransmissions.setResultStateCode( stateTransmissionsType.getTargetStateCode( ) );
		stateTransmissions.setSoftVersionId( stateTransmissionsType.getSoftVersion( ) );
		stateTransmissions.setStateCode( stateTransmissionsType.getInitialStateCode( ) );
		stateTransmissions.setStmodeTypeCode( stateTransmissionsType.getStateModel( ) );

		return stateTransmissions;
	}

	private RowResultType createRowResultType( String infoCode, String rc, String description, int rowId )
	{
		RowResultType rrt = new RowResultType( );

		List< String > descriptionList = new ArrayList< String >( );
		descriptionList.add( description );
		
		rrt.setRowID( Integer.toString( rowId ) );
		rrt.setInfoCode( infoCode );
		rrt.setResultDescriptionList( descriptionList );
		rrt.setResultCode( rc );

		return rrt;
	}
}
