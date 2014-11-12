package ru.acs.fts.eps2.router.tasks;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.configuration.Configurator;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.data.kind.CompressType;
import ru.acs.fts.eps2.engine.data.kind.DocumentModeIDs;
import ru.acs.fts.eps2.engine.objects.defines.EnvelopeOrigins;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.helpers.CryptoHelper;
import ru.acs.fts.eps2.engine.processing.helpers.SendMessageHelper;
import ru.acs.fts.eps2.engine.transport.AddressFactory;
import ru.acs.fts.eps2.engine.transport.gateway.out.MessagingGateway;
import ru.acs.fts.eps2.engine.util.RemotenessHelper;
import ru.acs.fts.eps2.model.defines.ActionEvents;
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.model.services.ProcedureService;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.persistence.EDServiceHolder;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.EDJobBatchContextFactory;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.router.processing.helpers.ResultEnvelopeHelper;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.utils.StringUtil;
import ru.acs.fts.schemas.album.notifgoodstimeout.NotifGoodsTimeOutType;
import ru.acs.fts.schemas.envelope.ApplicationInfType;
import ru.acs.fts.schemas.envelope.BodyType;
import ru.acs.fts.schemas.envelope.CustomsType;
import ru.acs.fts.schemas.envelope.EDHeaderType;
import ru.acs.fts.schemas.envelope.EnvelopeType;
import ru.acs.fts.schemas.envelope.HeaderType;
import ru.acs.fts.schemas.envelope.RoutingInfType;

public class AdminCmdTask
{
	private static final Logger log = LoggerFactory.getLogger( AdminCmdTask.class );
	
	private EDServiceHolder _serviceHolder;
	private Configurator _configurator;
	private MessagingGateway _messagingGateway;
	private AddressFactory _addressFactory;
	private EDJobBatchContextFactory _jobBatchContextFactory;
	
	/*
	 * Таймауты указываются в днях
	 */
	private int _timeout;
	private int _aeoTimeout;
	
	// @formatter:off
	@Required
	public void setServiceHolder( EDServiceHolder serviceHolder ) { _serviceHolder = serviceHolder; }
	public EDServiceHolder getServiceHolder( ) { return _serviceHolder; }
	
	@Required
	public void setConfigurator( Configurator configurator ) { _configurator = configurator; }
	public Configurator getConfigurator( ) { return _configurator; }
	
	@Required
	public void setMessagingGateway( MessagingGateway messagingGateway ) { _messagingGateway = messagingGateway; }
	public MessagingGateway getMessagingGateway( ) { return _messagingGateway; }
	
	@Required
	public void setAddressFactory( AddressFactory addressFactory ) { _addressFactory = addressFactory; }
	public AddressFactory getAddressFactory( ) { return _addressFactory; }
	
	@Required
	public void setJobBatchContextFactory( EDJobBatchContextFactory jobBatchContextFactory ) { _jobBatchContextFactory = jobBatchContextFactory; }
	public EDJobBatchContextFactory getJobBatchContextFactory( ) { return _jobBatchContextFactory; }
	
	@Required
	public void setTimeout( int timeout ) { _timeout = timeout; }
	public int getTimeout( ) { return _timeout; }
	
	@Required
	public void setAeoTimeout( int aeoTimeout ) { _aeoTimeout = aeoTimeout; }
	public int getAeoTimeout( ) { return _aeoTimeout; }
	// @formatter:on
	
	@Transactional( propagation = Propagation.REQUIRED, timeout = 3000000 ) // timeout = 300
	public void executeAEO( ) 
		throws Exception
	{
		List< ProcedureProperty > properties = new ArrayList< AdminCmdTask.ProcedureProperty >( );
		sendEnvelopes( createEnvelopesCmn11086( properties ), properties, MessageType.CMN_11086 );
		log.info( "Task has been executed!" );
	}
	
	@Transactional( propagation = Propagation.REQUIRED, timeout = 3000000 ) // timeout = 300
	public void execute( ) 
		throws Exception
	{
		List< ProcedureProperty > properties = new ArrayList< AdminCmdTask.ProcedureProperty >( );
		sendEnvelopes( createEnvelopesCmn11047( properties ), properties, MessageType.CMN_11047 );
		log.info( "Task has been executed!" );
	}
	
	private void sendEnvelopes( List< EDEnvelope > envelopes, List< ProcedureProperty > properties, String messageType ) 
		throws Exception 
	{
		EDJobBatchContext jobBatchContext = ( EDJobBatchContext )_jobBatchContextFactory.create( new byte[ 0 ] );
		
		JobContext jobContext = new JobContext( new HashMap< String, Object >( ) );
		recoverEnvelope( jobBatchContext );
		
		int idx = 0;
		for ( EDEnvelope env : envelopes )
		{
			ProcedureProperty property = properties.get( idx++ );
			// recoverEnvelope( jobBatchContext, properties.get( idx++ ) );
			setupInfoFromProperties( jobBatchContext, property );
			
			env.setSaveEnvelope( true );
			env.setSaveDocument( true );
			
			SendMessageHelper.sendEnvelope( jobBatchContext, jobContext, env );
			
			_serviceHolder.getEnvelopeOperator( ).persistEnvelope( env );
			
			changeState( property, jobBatchContext, env.getEnvelopeID( ), messageType );
		}
	}
	
	private void setupInfoFromProperties( EDJobBatchContext jobBatchContext, ProcedureProperty procedureProperty )
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );

		EDHeaderType edHeader = recvEnv.getEDHeader( );
		edHeader.setParticipantID( procedureProperty.getParticipantId( ) );
		edHeader.setProccessID( procedureProperty.getProcessId( ) );
		
		CustomsType senderCustoms = edHeader.getSenderCustoms( );
		senderCustoms.setCustomsCode( procedureProperty.getCustomsCode( ) );
		senderCustoms.setExchType( procedureProperty.getExchType( ) );
	}
	
	private List< EDEnvelope > createEnvelopesCmn11086( List< ProcedureProperty > properties ) 
		throws Exception 
	{
		List< EDEnvelope > cmn11086List = new ArrayList< EDEnvelope >( );
		List< ProcedureProperty > timeOutProcedures = getTimeOutProcedures( );
		
		if ( null != timeOutProcedures && ! timeOutProcedures.isEmpty( ) )
		{
			for ( ProcedureProperty procedure : timeOutProcedures )
			{
				NotifGoodsTimeOutType notifGoodsTimeOut = createNotifGoodsTimeOut( procedure );
				
				CustomsType recvCustoms = new CustomsType( );
				recvCustoms.setCustomsCode( procedure.getCustomsCode( ) );
				recvCustoms.setExchType( procedure.getExchType( ) );
				
				EDEnvelope cmn11086 = EnvelopeCreator.createFluentMessage( 
					MessageType.CMN_11086, procedure.getProcessId( ), procedure.getParticipantId( ), 
					null, null, _configurator.getSoftVersion( ), 
					BusinessSystems.EPS, null, 
					BusinessSystems.CUSTOMS, recvCustoms, 
					notifGoodsTimeOut 
				);
				
				CryptoHelper.signEnvelope( cmn11086, false );
				
				cmn11086List.add( cmn11086 );
				properties.add( procedure );
			}
		}
		
		return cmn11086List;
	}
	
	private List< EDEnvelope > createEnvelopesCmn11047( List< ProcedureProperty > properties ) 
		throws Exception 
	{
		List< EDEnvelope > cmn11047List = new ArrayList< EDEnvelope >( );
		List< ProcedureProperty > timeOutProcedures = getTimeOutProcessesForCmn11047( );
		
		if ( null != timeOutProcedures && ! timeOutProcedures.isEmpty( ) )
		{
			for ( ProcedureProperty procedure : timeOutProcedures )
			{
				NotifGoodsTimeOutType notifGoodsTimeOut = createNotifGoodsTimeOut( procedure );
				
				CustomsType recvCustoms = new CustomsType( );
				recvCustoms.setCustomsCode( procedure.getCustomsCode( ) );
				recvCustoms.setExchType( procedure.getExchType( ) );
				
				EDEnvelope cmn11047 = EnvelopeCreator.createFluentMessage( 
					MessageType.CMN_11047, procedure.getProcessId( ), procedure.getParticipantId( ), 
					null, null, _configurator.getSoftVersion( ), 
					BusinessSystems.EPS, null, 
					BusinessSystems.CUSTOMS, recvCustoms, 
					notifGoodsTimeOut 
				);
				
				CryptoHelper.signEnvelope( cmn11047, false );
				
				cmn11047List.add( cmn11047 );
				properties.add( procedure );
			}
		}
		
		return cmn11047List;
	}
	
	private NotifGoodsTimeOutType createNotifGoodsTimeOut( ProcedureProperty procedureProperty )
	{
		NotifGoodsTimeOutType notifGoodsTimeOut = new NotifGoodsTimeOutType( );
		notifGoodsTimeOut.setDocumentID( StringUtil.generateUuid( ) );
		notifGoodsTimeOut.setProcessID( procedureProperty.getProcessId( ) );
		notifGoodsTimeOut.setPrevProcState( procedureProperty.getPrevStateCode( ) );
		notifGoodsTimeOut.setPrevStateDescription( procedureProperty.getPrevStateDescription( ) );

		Calendar stateChangeTime = procedureProperty.getDateTimeStatusChange( );
		/*
		notifGoodsTimeOut.setStateChDate( null == stateChangeTime ? null : new LocalDate( stateChangeTime.getTime( ) ) );
		notifGoodsTimeOut.setStateChTime( null == stateChangeTime ? null : new LocalTime( stateChangeTime.getTime( ) ) );
		*/
		notifGoodsTimeOut.setStateChDate( getLocalDate( stateChangeTime ) );
		notifGoodsTimeOut.setStateChTime( getLocalTime( stateChangeTime ).toString( ) );
		
		notifGoodsTimeOut.setStateDescription( procedureProperty.getCurrentStateDescription( ) );
		notifGoodsTimeOut.setProcState( procedureProperty.getCurrentStateCode( ) );
		notifGoodsTimeOut.setDocumentModeID( DocumentModeIDs.NOTIF_GOODS_TIMEOUT );
		
		return notifGoodsTimeOut;
	}
	
	private LocalDate getLocalDate( Calendar calendar )
	{
		return null == calendar ? null : LocalDate.fromCalendarFields( calendar );
	}
	
	private LocalTime getLocalTime( Calendar calendar )
	{
		return null == calendar ? null : LocalTime.fromCalendarFields( calendar );
	}
	
	private List< ProcedureProperty > getTimeOutProcedures_Inner( List< Object > fetched, ProcedureService procedureService ) 
		throws DatabaseException
	{
		List< ProcedureProperty > properties = new ArrayList< ProcedureProperty >( );
		
		for ( Object procProp : fetched )
		{
			ProcedureProperty procedureProperty = new ProcedureProperty( ( Object[ ] ) procProp );
			
			List< Object > prevStateInfos = procedureService.selectPreviousStateInfo( procedureProperty.getId( ), procedureProperty.getProcessId( ) );
			if ( null != prevStateInfos && ! prevStateInfos.isEmpty( ) )
			{
				procedureProperty.setupPrevStateInfo( ( Object[ ] ) prevStateInfos.get( 0 ) );
				properties.add( procedureProperty );
			}
		}
		
		return properties;		
	}
	
	private List< ProcedureProperty > getTimeOutProcedures( ) throws DatabaseException
	{
		ProcedureService procedureService = _serviceHolder.getProcedureService( );
		return getTimeOutProcedures_Inner( procedureService.selectTimeOutProcesses( _aeoTimeout ), procedureService );
	}
	
	private List< ProcedureProperty > getTimeOutProcessesForCmn11047( ) throws DatabaseException
	{
		ProcedureService procedureService = _serviceHolder.getProcedureService( );
		return getTimeOutProcedures_Inner( procedureService.selectTimeOutProcessesForCmn11047( _timeout ), procedureService );
	}
	
	private void recoverEnvelope( EDJobBatchContext jobBatchContext ) 
		throws BaseProcessingException, DatabaseException
	{
		EnvelopeType env = new EnvelopeType( );
		
		/** Восстанавливаем тело, сильно не паримся, просто байтовый массив загоняем */
		
		BodyType body = new BodyType( );
		env.setBody( body );
		
		List< Object > bodyAnies = new ArrayList< Object >( );
		body.setAnyList( bodyAnies );
		
		/** Восстанавливаем заголовок, а вот тут надо потрудиться */
		
		HeaderType header = new HeaderType( );
		env.setHeader( header );
		
		List< Object > headerAnies = new ArrayList< Object >( );
		header.setAnyList( headerAnies );
		
		ApplicationInfType appInfo = new ApplicationInfType( );
		headerAnies.add( appInfo );
		
		appInfo.setSoftVersion( _configurator.getSoftVersion( ) );
		
		RoutingInfType rInfo = new RoutingInfType( );
		headerAnies.add( rInfo );
		
		rInfo.setEnvelopeID( StringUtil.generateUuid( ) );
		rInfo.setPreparationDateTime( new DateTime( ) );
		
		List< String > receiverInformations = new ArrayList< String >( );
		rInfo.setReceiverInformationList( receiverInformations );
		
		EDHeaderType edHeader = new EDHeaderType( );
		headerAnies.add( edHeader );
		
		edHeader.setMessageType( MessageType.ADM_00001 );
		// edHeader.setParticipantID( procedureProperties.getParticipantId( ) );
		// edHeader.setProccessID( procedureProperties.getProcessId( ) );
	
		CustomsType senderCustoms = new CustomsType( );
		// senderCustoms.setCustomsCode( procedureProperties.getCustomsCode( ) );
		// senderCustoms.setExchType( procedureProperties.getExchType( ) );
		edHeader.setSenderCustoms( senderCustoms );
		
		env.setBody( createFakeBody( ) );
		
		jobBatchContext.setSenderSystem( BusinessSystems.CUSTOMS );		

		EDEnvelope envelope = new EDEnvelope( env, BusinessSystems.CUSTOMS );

		envelope.setSaveDocument( true );
		envelope.setCompressType( CompressType.NotCompressed );
		envelope.setOrigin( EnvelopeOrigins.INCOME );
		envelope.setWasCompressed( false );
		
		jobBatchContext.setReceivedEnvelope( envelope );
		jobBatchContext.doNotUseThis_setIncomeMessage( null );
	}
	
	private BodyType createFakeBody( ) throws DatabaseException
	{
		BodyType bodyType = new BodyType( );
		
		List< Object > bodyAnies = new ArrayList< Object >( );
		bodyAnies.add( ResultEnvelopeHelper.getResultDocument( "", ResultCodes._00_00000_00, _serviceHolder.getErrListService( ) ) );
		
		bodyType.setAnyList( bodyAnies );
		
		return bodyType;
	}
	
	private void changeState( ProcedureProperty procedureProperty, EDJobBatchContext jobBatchContext, String envelopeId, String messageType ) 
		throws Exception
	{
		String processId = procedureProperty.getProcessId( );
		String customsCode = procedureProperty.getCustomsCode( );
		String borderCustomsCode = procedureProperty.getBorderCustomsCode( );
		
		String event = ActionEvents.NO_EVENT;
		if ( RemotenessHelper.areCustomsOnDifferentEps( customsCode, borderCustomsCode ) )
			event = ActionEvents.DIFF_RTU_EVENT;
		
		_serviceHolder.getProcedureOperator( ).setProcedureNewState( jobBatchContext, envelopeId, processId, messageType, event );
		
		Edecl_Proc_Information procInfo = _serviceHolder.getProcedureService( )
			.getProcInformation( processId );
		
		_serviceHolder.getProcedureOperator( ).updateProcedureData( 
			procInfo,
			jobBatchContext.getProcedureChangeInformation( ),
			jobBatchContext.getReceivedEnvelope( ).getProcedureCreateState( ),
			true 
		);
	}
	
	/*
	private boolean checkChangeTime( ProcedureProperty procedureProperty, long timeout )
	{
		Calendar nextDayAfterChange = procedureProperty.getDateTimeStatusChange( );
		nextDayAfterChange.add( Calendar.DATE, 1 );
		nextDayAfterChange.set( Calendar.HOUR_OF_DAY, 0 );
		nextDayAfterChange.set( Calendar.MINUTE, 0 );
		nextDayAfterChange.set( Calendar.SECOND, 0 );
		nextDayAfterChange.set( Calendar.MILLISECOND, 0 );
		
		Calendar now = new GregorianCalendar( nextDayAfterChange.getTimeZone( ) );
		
		return now.getTimeInMillis( ) - nextDayAfterChange.getTimeInMillis( ) >= timeout;
	}
	*/
	
	private static class ProcedureProperty 
	{
		private String _processId;
		private Integer _id;
//		private Date _dateTimeStatusChange;
		private GregorianCalendar _dateTimeStatusChange;
		private String _currentStateCode;
		private String _currentStateDescription;
		private String _customsCode;
		private String _exchType;
		private String _participantId;
		private String _prevStateCode = null;
		private String _prevStateDescription = null;
		private String _borderCustomsCode;
		
		public ProcedureProperty( Object[ ] props )
		{
			_processId = ( String )props[ 0 ];
			_id = ( Integer ) props[ 1 ];
			
			/*
			GregorianCalendar calendar = ( ( GregorianCalendar ) props[ 2 ] );
			_dateTimeStatusChange = ( null == calendar ? null : calendar.getTime( ) );
			*/
			_dateTimeStatusChange = ( ( GregorianCalendar ) props[ 2 ] );
			
			_currentStateCode = ( String ) props[ 3 ];
			_currentStateDescription = ( String ) props[ 4 ];
			_customsCode = ( String ) props[ 5 ];
			
			Object exType = props[ 6 ];
			_exchType = null == exType ? null : String.valueOf( exType );
			
			_participantId = ( String ) props[ 7 ];
			_borderCustomsCode = ( String ) props[ 8 ];
		}
		
		public void setupPrevStateInfo( Object[ ] prevStateInfo )
		{
			_prevStateCode = ( String ) prevStateInfo[ 1 ];
			_prevStateDescription = ( String ) prevStateInfo[ 2 ];
		}
		
		// @formatter:off
		public String getProcessId( ) { return _processId; }
		public Integer getId( ) { return _id; }
		public GregorianCalendar getDateTimeStatusChange( ) { return _dateTimeStatusChange; }
		public String getCurrentStateCode( ) { return _currentStateCode; }
		public String getCurrentStateDescription( ) { return _currentStateDescription; }
		public String getCustomsCode( ) { return _customsCode; }
		public String getExchType( ) { return _exchType; }
		public String getParticipantId( ) { return _participantId; }
		public String getPrevStateCode( ) { return _prevStateCode; }
		public String getPrevStateDescription( ) { return _prevStateDescription; }
		public String getBorderCustomsCode( ) { return _borderCustomsCode; }
		// @formatter:on
	}
}
