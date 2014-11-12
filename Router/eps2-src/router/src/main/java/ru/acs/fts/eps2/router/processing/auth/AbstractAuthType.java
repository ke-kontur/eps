package ru.acs.fts.eps2.router.processing.auth;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.model.entities.Edecl_Customs;
import ru.acs.fts.eps2.model.entities.Edecl_Participant;
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.model.entities.ExtRtuRouting;
import ru.acs.fts.eps2.model.services.CustomsService;
import ru.acs.fts.eps2.model.services.ExtRtuRoutingService;
import ru.acs.fts.eps2.model.services.ParticipantService;
import ru.acs.fts.eps2.model.services.ProcedureService;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.persistence.EDServiceHolder;
import ru.acs.fts.eps2.router.persistence.operators.CustomsOperator;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.utils.StringUtil;
import ru.acs.fts.schemas.envelope.CustomsType;

public abstract class AbstractAuthType implements IAuthType // NO_UCD (use default)
{	
	private static final Logger log = LoggerFactory.getLogger( AbstractAuthType.class );
	
	protected EDServiceHolder _serviceHolder;
	
	// @formatter:off
	@Required
	public void setServiceHolder( EDServiceHolder serviceHolder ) { _serviceHolder = serviceHolder; }
	public EDServiceHolder getServiceHolder( ) { return _serviceHolder; }
	// @formatter:on
	
	protected void throwException( String message, String documentId, String resultCode )
			throws ResultTypeException, DatabaseException
	{
		ErrorHelper.throwException( 
			message, documentId, resultCode, 
			ProcessingConstants.ERROR_TYPE_AUTH 
		);
	}
	
	protected void log( EDEnvelope env )
	{
		String logMsg = String.format(
			"Принят новый конверт для авторизации %s, envelopeID = %s, documentID = %s, processID = %s",
			this.getClass( ).getSimpleName( ),
			env.getEnvelopeID( ), env.getDocument( ).getDocumentID( ), env.getProcessID( )
		);
			
		log.info( logMsg );	
	}
	
	protected void checkSenderCustomsCode( EDEnvelope env ) 
		throws ResultTypeException, DatabaseException
	{
		CustomsType senderCustoms = env.getSenderCustoms( );
		String senderCustomsCode = senderCustoms.getCustomsCode( );
		if ( StringUtil.isNullOrEmpty( senderCustomsCode ) )
		{
			throwException( 
				"Не заполнено обязательное поле SenderCustoms.CustomsCode", 
				env.getDocument( ).getDocumentID( ), ResultCodes._01_00031_01 
			);
		}
	}
	
	protected void checkSenderCustomsExchType( EDEnvelope env ) 
		throws ResultTypeException, DatabaseException
	{
		CustomsType senderCustoms = env.getSenderCustoms( );
		String senderCustomsExchType = senderCustoms.getExchType( );
		if ( StringUtil.isNullOrEmpty( senderCustomsExchType ) )
		{
			throwException( 
				"Не заполенено обязательное поле SenderCustoms.ExchType", 
				env.getDocument( ).getDocumentID( ), ResultCodes._01_00035_01 
			);
		}
	}
	
	protected void checkReceiverCustomsCode( EDEnvelope env ) 
		throws ResultTypeException, DatabaseException
	{
		CustomsType receiverCustoms = env.getReceiverCustoms( );
		String receiverCustomsCode = receiverCustoms.getCustomsCode( );
		if ( StringUtil.isNullOrEmpty( receiverCustomsCode ) )
		{
			throwException( 
				"Не заполнено обязательное поле ReceiverCustoms.CustomsCode", 
				env.getDocument( ).getDocumentID( ), ResultCodes._01_00037_01 
			);
		}
	}
	
	protected void checkSenderCustomsExist( EDEnvelope env ) 
		throws ResultTypeException, DatabaseException
	{
		CustomsType senderCustoms = env.getSenderCustoms( );
		String senderCustomsCode = senderCustoms.getCustomsCode( );
		String senderCustomsExchType = senderCustoms.getExchType( );
		
		CustomsService customsService = _serviceHolder.getCustomsService( );
		if ( ! customsService.isCustomsExist( senderCustomsCode, senderCustomsExchType ) )
		{
			throwException( 
				"Код КАСТО отправителя не зарегистрирован в системе.", 
				env.getDocument( ).getDocumentID( ), ResultCodes._01_00032_01 
			);
		}
	}
	
	protected void checkSenderCustomsEnvelopeDbCorrespondence( EDEnvelope env ) 
		throws ResultTypeException, DatabaseException
	{
		CustomsType senderCustoms = env.getSenderCustoms( );
		String senderCustomsCode = senderCustoms.getCustomsCode( );
		String senderCustomsExchType = senderCustoms.getExchType( );
		
		String envSenderInfo = env.getRoutingInfo( ).getSenderInformation( );
		
		CustomsService customsService = _serviceHolder.getCustomsService( );
		Edecl_Customs senderCust = customsService.getCustoms( senderCustomsCode, senderCustomsExchType );
		String dbSenderInfo = senderCust.getTransportAddress( );
		if ( ! StringUtil.areEqual( envSenderInfo, dbSenderInfo ) )
		{
			throwException( 
				"Поле SenderInformation не совпадает с зарегистрированным для данного кода КАСТО.",
				env.getDocument( ).getDocumentID( ), ResultCodes._01_00033_01 
			);
		}
	}
	
	protected void checkExtRtuSenderCustomsEnvelopeDbCorrespondence( EDEnvelope env ) 
		throws ResultTypeException, DatabaseException
	{
		CustomsType senderCustoms = env.getSenderCustoms( );
		String senderCustomsCode = senderCustoms.getCustomsCode( );
		String senderCustomsExchType = senderCustoms.getExchType( );
		String envSenderInfo = env.getRoutingInfo( ).getSenderInformation( );
		
		ExtRtuRoutingService extRtuRoutingService = _serviceHolder.getExtRtuRoutingService( );
		ExtRtuRouting senderCustomsRouting = 
			extRtuRoutingService.getExternalRouting( senderCustomsCode, senderCustomsExchType );
		String dbSenderInfo = senderCustomsRouting.getTransportAddress( );
		
		if ( ! StringUtil.areEqual( envSenderInfo, dbSenderInfo ) )
		{
			throwException( 
				"Поле SenderInformation не совпадает с зарегистрированным для данного удаленного кода КАСТО.",
				env.getDocument( ).getDocumentID( ), ResultCodes._01_00033_01 
			);
		}
	}
	
	protected void checkReceiverCustomsExchType( EDEnvelope env ) 
		throws ResultTypeException, DatabaseException
	{
		String receiverCustomsExchType = env.getReceiverCustoms( ).getExchType( );
		if ( StringUtil.isNullOrEmpty( receiverCustomsExchType ) )
		{
			throwException( 
				"Не заполнено обязательное поле ReceiverCustoms.ExchType", 
				env.getDocument( ).getDocumentID( ), ResultCodes._01_00039_01 
			);
		}
	}
	
	protected void checkSenderAddress( EDEnvelope env ) 
		throws ResultTypeException, DatabaseException
	{
		String envSenderInfo = env.getRoutingInfo( ).getSenderInformation( );
		if ( StringUtil.isNullOrEmpty( envSenderInfo ) )
		{
			throwException( 
				"Не заполнено обязательное поле SenderInformation.",
				env.getDocument( ).getDocumentID( ), ResultCodes._01_00033_01 
			);
		}
	}
	
	protected void checkSoftVersion( EDEnvelope env ) 
		throws ResultTypeException, DatabaseException
	{
		String softVersion = env.getSoftVersion( );
		if ( StringUtil.isNullOrEmpty( softVersion ) )
		{
			throwException( 
				"Не заполнено обязательное поле SoftVersion", 
				env.getDocument( ).getDocumentID( ), ResultCodes._01_00034_01 
			);
		}
	}
	
	protected void checkSenderCustomsByExtRtuRouting( EDEnvelope env ) 
		throws ResultTypeException, DatabaseException
	{
		CustomsOperator customsOperator = _serviceHolder.getCustomsOperator( );

		CustomsType senderCustoms = env.getSenderCustoms( );
		String senderCustomsCode = senderCustoms.getCustomsCode( );
		String senderCustomsExchType = senderCustoms.getExchType( );
		
		if ( ! customsOperator.checkRtuMask( senderCustomsCode, Integer.valueOf( senderCustomsExchType ) ) )
		{
			throwException( 
				"Код удаленного КАСТО отправителя не зарегистрирован в системе.", 
				env.getDocument( ).getDocumentID( ), ResultCodes._01_00032_01 
			);
		}
	}
	
	protected void checkReceiverCustomsByExtRtuRouting( EDEnvelope env )
		throws ResultTypeException, DatabaseException
	{
		ExtRtuRoutingService extRtuRoutingService = _serviceHolder.getExtRtuRoutingService( );
		
		CustomsType receiverCustoms = env.getReceiverCustoms( );		
		String receiverCustomsCode = receiverCustoms.getCustomsCode( );
		String receiverCustomsExchType = receiverCustoms.getExchType( );
		
		if ( null == extRtuRoutingService.getExternalRouting( receiverCustomsCode, receiverCustomsExchType ) )
		{
			throwException(
				"Код КАСТО назначения не зарегистрирован в качестве ТО другого РТУ.",
				env.getDocument( ).getDocumentID( ), ResultCodes._01_00038_01
			);			
		}
	}
	
	protected void checkReceiverCustoms( EDEnvelope env )
		throws ResultTypeException, DatabaseException
	{
		CustomsService customsService = _serviceHolder.getCustomsService( );
		
		CustomsType recvCustoms = env.getReceiverCustoms( );
		String receiverCustomsCode = recvCustoms.getCustomsCode( );
		String receiverCustomsExchType = recvCustoms.getExchType( );
		
		if ( null == customsService.getCustoms( receiverCustomsCode, receiverCustomsExchType ) )
		{
			throwException( 
				"Код КАСТО назначения не зарегистрирован в системе", 
				env.getDocument( ).getDocumentID( ), ResultCodes._01_00038_01 
			);
		}
	}
	
	protected void checkCustomsProcedureCorrespondence( EDEnvelope env ) 
		throws ResultTypeException, DatabaseException
	{
		String processId = env.getProcessID( );

		String senderCustomsCode = env.getSenderCustoms( ).getCustomsCode( );
		String receiverCustomsCode = env.getReceiverCustoms( ).getCustomsCode( );
		
		if ( ! StringUtil.isNullOrEmpty( processId ) && 
			 ! checkProcessCustomsRelation( processId, senderCustomsCode, receiverCustomsCode, env )  )
		{
			throwException( 
				"Код таможенного органа, указанный в заголовке конверта, не соответствует сведениям процедуры декларирования.", 
				env.getDocument( ).getDocumentID( ), ResultCodes._01_00090_01 
			);
		}
	}
	
	protected void checkParticipantValidness( EDEnvelope env )
		throws ResultTypeException, DatabaseException
	{
		String participantId = env.getParticipantID( );
		Edecl_Participant participant = _serviceHolder.getParticipantService( ).getParticipant( participantId );
		
		Date now = new Date( );
		if ( ( null != participant.getStartDate( ) && now.compareTo( participant.getStartDate( ) ) < 0 ) || 
			 ( null != participant.getEndDate( ) && now.compareTo( participant.getEndDate( ) ) > 0 ) )
		{
			throwException(
				"Срок действия учётной записи участника ВЭД истёк.",
				env.getDocument( ).getDocumentID( ), ResultCodes._01_00047_01
			);
		}
	}

	protected void checkCustomsValidness( EDEnvelope env, CustomsType customs ) // NO_UCD (use private)
		throws ResultTypeException, DatabaseException
	{
		Edecl_Customs custom = _serviceHolder.getCustomsService( ).getCustoms( customs.getCustomsCode( ), customs.getExchType( ) );
		
		Date now = new Date( );
		if ( ( null != custom.getStartDate( ) && now.compareTo( custom.getStartDate( ) ) < 0 ) ||
			 ( null != custom.getEndDate( ) && now.compareTo( custom.getEndDate( ) ) > 0 ) )
		{
			throwException(
				"Срок действия учётной записи КАСТО истёк",
				env.getDocument( ).getDocumentID( ), ResultCodes._01_00048_01
			);
		}
	}

	protected void checkParticipantEmpty( EDEnvelope env )
		throws ResultTypeException, DatabaseException
	{
		String participantId = env.getParticipantID( );
		if ( StringUtil.isNullOrEmpty( participantId ) )
		{
			throwException(
				"Не указан идентификатор участника ВЭД",
				env.getDocument( ).getDocumentID( ), ResultCodes._01_00021_01
			);
		}
	}
	
	protected void checkParticipantNotReg( EDEnvelope env )
		throws ResultTypeException, DatabaseException
	{
		ParticipantService participantService = _serviceHolder.getParticipantService( );
		Edecl_Participant participant = participantService.getParticipant( env.getParticipantID( ) );
		
		if ( null == participant )
		{
			throwException(
				"Участник ВЭД не зарегистрирован в базе данных",
				env.getDocument( ).getDocumentID( ), ResultCodes._01_00022_01
			);			
		}
	}
	
	protected void checkParticipantAddressSenderInformationCorrespondence( Edecl_Participant participant, EDEnvelope env )
		throws ResultTypeException, DatabaseException
	{
		String senderAddress = env.getRoutingInfo( ).getSenderInformation( );
		
		if ( ! participant.getTransportAddress( ).equalsIgnoreCase( senderAddress ) )
		{
			throwException(
				"Транспортный адрес участника ВЭД не соответствует зарегистрированному в базе данных",
				env.getDocument( ).getDocumentID( ), ResultCodes._01_00022_01
			);
		}
	}
	
	protected void checkParticipantAddressDenied( Edecl_Participant participant, EDEnvelope env )
		throws ResultTypeException, DatabaseException
	{
		String accessMode = participant.getAccessMode( );
		if ( ! accessMode.equals( "1" ) )
		{
			throwException(
				"Доступ для данного участника ВЭД запрещен",
				env.getDocument( ).getDocumentID( ), ResultCodes._01_00024_01
			);
		}
	}
	
	protected void checkProcessEmpty( EDEnvelope env )
		throws ResultTypeException, DatabaseException
	{
		String processId = env.getProcessID( );
		
		if ( StringUtil.isNullOrEmpty( processId ) )
		{
			throwException(
				"Поле идентификатора процедуры декларирования (ProccessID) не заполнено.",
				env.getDocument( ).getDocumentID( ), ResultCodes._01_00049_01
			);
		}
	}
	
	protected void checkParticipantAddressNotReg( EDEnvelope env )
		throws ResultTypeException, DatabaseException
	{
		String senderAddress = env.getRoutingInfo( ).getSenderInformation( );
		if ( StringUtil.isNullOrEmpty( senderAddress ) )
		{
			throwException(
				"Не указан адрес отправителя (SenderInformation)",
				env.getDocument( ).getDocumentID( ), ResultCodes._01_00023_01
			);
		}
	}
		
	/**
	 * @throws DatabaseException 
	 * @deprecated ранее предполагалось, что можно будет выставлять "жизненный" статус у процедуры
	 * (работает, удалена, остановлена). От этой идеи отказались.
	 */
	@Deprecated
	protected void checkProcessLiveMode( Edecl_Proc_Information process, EDEnvelope env ) // NO_UCD (use private)
		throws ResultTypeException, DatabaseException
	{
		int liveMode = process.getLiveMode( );
		switch ( liveMode )
		{
			case 1:
				break;
				
			case 2:
			{
				throwException( "Процедура остановлена", env.getDocument( ).getDocumentID( ), ResultCodes._01_00043_01 );
				break;
			}
			
			case 3:
			{
				throwException( "Процедура удалена", env.getDocument( ).getDocumentID( ), ResultCodes._01_00042_01 );
				break;
			}
			
			default:
			{
				throwException(
					"Прикладная авторизация. liveMode не из множества 1,2,3",
					env.getDocument( ).getDocumentID( ), ResultCodes._01_00020_03
				);
				break;
			}
		}
	}
	
	/**
	 * @deprecated ранее предполагалось, что можно будет выставляться "жизненный" статус у процедуры
	 * (работает, удалена и тд). От этой идеи отказались.
	 */
	@Deprecated
	protected void checkProcessLiveMode( EDEnvelope env ) // NO_UCD (unused code)
		throws ResultTypeException, DatabaseException
	{
		ProcedureService procedureService = _serviceHolder.getProcedureService( );
		
		Edecl_Proc_Information procInfo = procedureService.getProcedureInfo( 
			env.getProcessID( ), 
			env.getSenderCustoms( ).getCustomsCode( ), 
			env.getParticipantID( ), 
			env.getSoftVersion( ) 
		);
		
		checkProcessLiveMode( procInfo, env );
	}
	
	private boolean checkProcessCustomsRelation( String processId, String cust1, String cust2, EDEnvelope env ) 
		throws ResultTypeException, DatabaseException
	{
		ProcedureService procedureService = _serviceHolder.getProcedureService( );
		Edecl_Proc_Information procInfo = procedureService.getProcInformation( processId );
		if ( null == procInfo )
		{
			throwException( 
				"Процедура декларирования не найдена в базе данных", 
				env.getDocument( ).getDocumentID( ), ResultCodes._01_00041_01
			);
		}
		
		String custCode = procInfo.getCustCode( );
		String borderCustCode = procInfo.getBorderCustCode( );
		if ( StringUtil.isNullOrEmpty( custCode ) ||
			 StringUtil.isNullOrEmpty( borderCustCode ) )
		{
			throwException(
				"Процедура декларирования имеет неверный формат",
				env.getDocument( ).getDocumentID( ), ResultCodes._01_00049_03
			);
		}
		
		return 
			( custCode.equalsIgnoreCase( cust1 ) || custCode.equalsIgnoreCase( cust2 ) ) && 
			( borderCustCode.equalsIgnoreCase( cust1 ) || borderCustCode.equalsIgnoreCase( cust2 ) );
	}
	
	protected void checkSenderCustomsValidness( EDEnvelope env )
		throws ResultTypeException, DatabaseException
	{
		CustomsType senderCustoms = env.getSenderCustoms( );		
		checkCustomsValidness( env, senderCustoms );
	}
	
	protected void checkReceiverCustomsValidness( EDEnvelope env )
		throws ResultTypeException, DatabaseException
	{
		CustomsType receiverCustoms = env.getReceiverCustoms( );		
		checkCustomsValidness( env, receiverCustoms );
	}
}
