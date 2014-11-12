package ru.acs.fts.eps2.router.processing.jobs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.configuration.Configurator;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.data.kind.CompressType;
import ru.acs.fts.eps2.engine.data.kind.ProcedureCreateStates;
import ru.acs.fts.eps2.engine.processing.*;
import ru.acs.fts.eps2.engine.processing.selectors.RemotenessTypes;
import ru.acs.fts.eps2.engine.processing.system.ErrorQueueTypes;
import ru.acs.fts.eps2.model.defines.SpecialProcedureStates;
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.model.entities.Edecl_Procstate;
import ru.acs.fts.eps2.model.entities.Edecl_Softversion;
import ru.acs.fts.eps2.model.entities.Edecl_Udcustlist;
import ru.acs.fts.eps2.model.entities.MessageLineage;
import ru.acs.fts.eps2.model.services.ProcedureService;
import ru.acs.fts.eps2.model.services.SoftVersionService;
import ru.acs.fts.eps2.model.services.UdCustListService;
import ru.acs.fts.eps2.model.services.conditions.ISelectionCondition;
import ru.acs.fts.eps2.model.services.conditions.UdCustListSelectionConditionHolder;
import ru.acs.fts.eps2.router.defines.ProcedureUdFlags;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDConfigurator;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.util.helpers.UUIDGen;
import ru.acs.fts.schemas.envelope.CustomsType;

import java.util.Date;
import java.util.GregorianCalendar;

public class OpenNewProcedure extends EDJob
{
	protected final Logger log = LoggerFactory.getLogger( OpenNewProcedure.class );
	
	protected final String action = "Открытие новой процедуры декларирования";
	protected final String errorQueueToSend = ErrorQueueTypes.ERROR_FATAL;

	private ProcedureService procedureService;
	private UdCustListService udCustListService;

	@Required
	public void setProcedureService( ProcedureService procedureService ) { this.procedureService = procedureService; }
	public ProcedureService getProcedureService( ) { return procedureService; }

	@Required
	public void setUdCustListService( UdCustListService service ) { udCustListService = service; }
	public UdCustListService getUdCustListService( ) { return udCustListService; }
	
	@Override
	public void edExecute( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );

		checkSoftVersionIsActual( jobBatchContext );
			
		String newProcedureState = SpecialProcedureStates.PROC_OPEN_STATE;
			
		boolean isRemote = jobContext.getBoolean( ContextConstants.IS_REMOTE );
			
		if ( isRemote )
		{
			newProcedureState = SpecialProcedureStates.PROC_UD_OPEN_STATE;

			String remoteCustomsCode = recvEnv.getApplicationInfo( ).getMessageKind( );
			String localCustomsCode = recvEnv.getReceiverCustoms( ).getCustomsCode( );
				
			/** 
			 * Ищем пару "локальный ТО - удаленный ТО" с актуальной датой окончания (endDate)
			 * в EDECL_UDCUSTLIST
			 */
			if ( null == remoteCustomsCode || null == localCustomsCode || 
				! checkLocalRemoteCustoms( localCustomsCode, remoteCustomsCode ) )
			{
				ErrorHelper.throwException( 
					jobBatchContext, ResultCodes._01_00038_04, 
					ProcessingConstants.ERROR_TYPE_CHECK 
				);
			}
		}
			
		String messageType = recvEnv.getMessageType( );
			
		if ( messageType.equalsIgnoreCase( MessageType.ED_10001 ) )
			newProcedureState = SpecialProcedureStates.PROC_PP_OPEN_STATE;

		Edecl_Proc_Information procInformation = createProcedureObject(
			newProcedureState,
			jobBatchContext, jobContext 
		);
			
		ProcedureChangeInformation procedureChangeInformation = new ProcedureChangeInformation(
			newProcedureState,
			createProcStateToSave( newProcedureState, jobBatchContext, procInformation ) 
		);
			
		boolean updateModeFlag = jobContext.getBoolean( ContextConstants.NEED_FLUSH );

		jobBatchContext.getServiceHolder( ).getProcedureOperator( ).updateProcedureData( 
			procInformation, 
			procedureChangeInformation, 
			ProcedureCreateStates.RE_CREATE_EXIST, 
			updateModeFlag 
		);
		
		jobBatchContext.put( ContextConstants.PROCESS_ID, procInformation.getProcessId( ) );
		jobBatchContext.setProcedureChangeInformation( procedureChangeInformation );
		
		MessageLineage ml = new MessageLineage( );
		ml.setEnvelopeId( procInformation.getProcessId( ) );
		ml.setLineageId( recvEnv.getLineageId( ) );
		jobBatchContext.getServiceHolder( ).getEnvelopeService( ).persist( ml );
	}

	@Override
	public String getAction( )
	{
		return action;
	}

	private Edecl_Proc_Information createProcedureObject( 
			String newProcedureState,
			EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws BaseProcessingException
	{
		Configurator cfg = jobBatchContext.getConfigurator( ); 
		
		Edecl_Proc_Information procInformation = new Edecl_Proc_Information( );
		
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		recvEnv.setProcedureCreateState( ProcedureCreateStates.RE_CREATE_EXIST );
		
		procInformation.setProcessId( UUIDGen.getUUID( ).toString( ) );
		procInformation.setCurrentState( newProcedureState );
			fillCompressType( jobBatchContext, jobContext, procInformation );
		procInformation.setSoftVersion( cfg.getSoftVersion( ) );
			fillProcessFromIncomeEnvelope( jobBatchContext, procInformation );
		procInformation.setLiveMode( 1 );
		
		boolean isRemote = jobContext.getBoolean( ContextConstants.IS_REMOTE );

		EDConfigurator configurator = jobBatchContext.getConfigurator( );
		
		String selectedAuth = jobBatchContext.getString( ContextConstants.SELECTED_AUTHORIZATION );
		CustomsType receiverCustoms = recvEnv.getReceiverCustoms( );
		
		if ( isRemote )
		{
			fillRemoteInformationFromContext( procInformation, jobBatchContext );
		}
		else if ( null != selectedAuth && selectedAuth.equals( "RZD_OPEN_PROC" ) &&
				  null != receiverCustoms && receiverCustoms.getExchType( ).equalsIgnoreCase( configurator.getAsktt2ExchType( ) ) )
		{
			procInformation.setUdFlag( ProcedureUdFlags.RRW_TRANSIT );			
		}
		else
		{
			procInformation.setUdFlag( 0 );
		}
				
		return procInformation;
	}

	private Edecl_Procstate createProcStateToSave(
			String newProcedureState,
			EDJobBatchContext jobBatchContext, Edecl_Proc_Information procInformation )
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		Edecl_Procstate procstate = new Edecl_Procstate( );
		procstate.setEnvelopeId( recvEnv.getEnvelopeID( ) ); 
		procstate.setCode( newProcedureState );
		procstate.setProcessId( procInformation.getProcessId( ) );
		procstate.setSetStatusTime( new GregorianCalendar( ) );
		
		return procstate;
	}

	private void fillProcessFromIncomeEnvelope( 
		EDJobBatchContext jobBatchContext, Edecl_Proc_Information procInformation )
	{
		setTestFields( jobBatchContext, procInformation );
		
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		CustomsType receiverCustoms = recvEnv.getReceiverCustoms( );
		procInformation.setCustCode( receiverCustoms.getCustomsCode( ) ); 
		procInformation.setExchType( Integer.parseInt( receiverCustoms.getExchType( ) ) ); 

		procInformation.setParticipantId( recvEnv.getParticipantID( ) ); 
	}

	private void setTestFields( EDJobBatchContext jobBatchContext, Edecl_Proc_Information procInformation )
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		String messageKind = recvEnv.getApplicationInfo( ).getMessageKind( ); 
		if ( messageKind != null && ! messageKind.isEmpty( ) && 
			 messageKind.toLowerCase( ).startsWith( "sh:" ) )
		{
			procInformation.setIsTest( "1" );
			procInformation.setTstScrNum( messageKind );
		}
		else
		{
			procInformation.setIsTest( "0" );
			procInformation.setTstScrNum( "" );
		}
	}
	
	/**
	 * @param localCustomsCode код локального ТО
	 * @param prefixedRemoteCustomsCode код ТО <b>с префиксом "UD:"</b>
	 * @return есть ли соответствующая пара в базе в таблице 
	 * EDECL_UDCUSTLIST ({@link Edecl_Udcustlist}) c неистекшим "сроком годности"
	 * @throws DatabaseException 
	 */
	private boolean checkLocalRemoteCustoms( 
			String localCustomsCode, 
			String prefixedRemoteCustomsCode ) throws DatabaseException
	{
		String remoteCode = null;
		// Берем код ТО без префикса "UD:"
		if ( null != prefixedRemoteCustomsCode )
			remoteCode = prefixedRemoteCustomsCode.split( ":" )[ 1 ];
		
		ISelectionCondition< Edecl_Udcustlist > condition = 
			UdCustListSelectionConditionHolder.getUdCustListSelectorCondition( 
					localCustomsCode, remoteCode );
		
		return udCustListService.exists( condition );
	}
	
	private void fillRemoteInformationFromContext( Edecl_Proc_Information procedure, EDJobBatchContext jobBatchContext ) 
		throws BaseProcessingException
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		String customsCode = recvEnv.getApplicationInfo( ).getMessageKind( ).split( ":" )[ 1 ];
		procedure.setBorderCustCode( customsCode );
		
		String remotenessType = ( String )jobBatchContext.get( ContextConstants.REMOTENESS_TYPE );
		
		if ( RemotenessTypes.LOCAL_EPS.equals( remotenessType ) )
			procedure.setUdFlag( 1 );
		else if ( RemotenessTypes.REMOTE_EPS.equals( remotenessType ) )
			procedure.setUdFlag( 2 );
		/**
		 * Для случаев УЭО и РЖД пока ничего нет
		 */
	}
	
	private void fillCompressType( EDJobBatchContext jobBatchContext, JobContext jobContext, Edecl_Proc_Information procedure )
	{
		boolean isRemote = jobContext.getBoolean( ContextConstants.IS_REMOTE );
		
		if ( isRemote )
		{
			EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
			procedure.setCompressType( 
				recvEnv.getCompressType( ).getCompressTypeText( ) 
			);
		}
		else
			procedure.setCompressType( CompressType.NotCompressed.getCompressTypeText( ) );
	}
	
	private void checkSoftVersionIsActual( EDJobBatchContext jobBatchContext )
		throws ResultTypeException, DatabaseException
	{
		SoftVersionService softVersionService = 
			jobBatchContext.getServiceHolder( ).getSoftVersionService( );
		
		Edecl_Softversion softVersion = softVersionService.getCurrentSoftversion( );
		
		if ( null == softVersion )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._09_96669_99, 
				ProcessingConstants.ERROR_TYPE_CHECK 
			);
		}
		
		Date currentDate = new Date( );
		
		if ( currentDate.before( softVersion.getBeginDate( ) ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._03_00101_01, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
		
		if ( currentDate.after( softVersion.getEndDate( ) ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._03_00102_01, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
	}
}