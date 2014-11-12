package ru.acs.fts.eps2.router.processing.helpers;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.joda.time.DateTime;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.configuration.RtuCodePatternsHolder;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.objects.defines.EnvelopeOrigins;
import ru.acs.fts.eps2.model.entities.Edecl_Customs;
import ru.acs.fts.eps2.model.entities.Edecl_Participant;
import ru.acs.fts.eps2.model.entities.ExtRtuRouting;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.persistence.EDServiceHolder;
import ru.acs.fts.eps2.router.processing.EDConfigurator;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.util.helpers.UUIDGen;
import ru.acs.fts.eps2.utils.StringUtil;
import ru.acs.fts.schemas.envelope.ApplicationInfType;
import ru.acs.fts.schemas.envelope.BodyType;
import ru.acs.fts.schemas.envelope.ConfirmationRequestType;
import ru.acs.fts.schemas.envelope.CustomsType;
import ru.acs.fts.schemas.envelope.EDHeaderType;
import ru.acs.fts.schemas.envelope.EnvelopeType;
import ru.acs.fts.schemas.envelope.HeaderType;
import ru.acs.fts.schemas.envelope.RoutingInfType;

public class EnvelopeCreator
{
	private static EDConfigurator _configurator;
	private static EDServiceHolder _serviceHolder;
	
	// @formatter:off
	public void setConfigurator( EDConfigurator configurator ) { _configurator = configurator; }
	public EDConfigurator getConfigurator( ) { return _configurator; }
	
	public void setServiceHolder( EDServiceHolder serviceHolder ) { _serviceHolder = serviceHolder; }
	public EDServiceHolder getServiceHolder( ) { return _serviceHolder; }
	// @formatter:on
	
	/**
	 * Эта функция создает исключительно транзитные конверты
	 * 
	 * @param messageTypeSubstituion если требуется изменить тип сообщения, то здесь надо задать соответствие
	 * @param receivedEnvelope входящий конверт, из него возьмутся разные параметры и документ (т.к. сообщение транзитное)
	 * @param receivingSystem система в которую будет отправлен полученный конверт
	 * @param receivingCustoms таможня получатель, если таковая имеется
	 * @param processor если требуется пост-обработка полученного конверта, то здесь нужно передать обработчик
	 * @param configurator конфигуратор, содержит параметры настройки всей системы
	 * @param serviceHolder содержит сервисы для доступа к БД
	 * @return сформированный транзитный конверт
	 * @throws DatabaseException 
	 * @throws ResultTypeException 
	 */
	public static EDEnvelope createTranzitMessage(
			Map< String, String > messageTypeSubstituion,
			EDEnvelope receivedEnvelope, 
			String recipientSystem, CustomsType receivingCustoms ) 
		throws BaseProcessingException, DatabaseException
	{
		EnvelopeType responseEnvelope = new EnvelopeType( );
		
		HeaderType responseHeader = createTranzitHeader( 
			messageTypeSubstituion, receivedEnvelope, 
			recipientSystem, receivingCustoms
		);
		
		responseEnvelope.setHeader( responseHeader );
		
		BodyType receivedBody = receivedEnvelope.getEnvelope( ).getBody( );
		BodyType responseBody = createTranzitBody( receivedBody );
		
		responseEnvelope.setBody( responseBody );
		
		EDEnvelope resp = new EDEnvelope( responseEnvelope, receivedEnvelope.getSenderSystem( ) );
		
		resp.setRecipientSystem( recipientSystem );
		resp.setIncomeEnvelopeID( receivedEnvelope.getEnvelopeID( ) );
		resp.setOrigin( EnvelopeOrigins.GENERATED );
		resp.setSaveEnvelope( true );
		resp.setSaveDocument( false );
		
		resp.setDocument( receivedEnvelope.getDocument( ) );
		
		return resp;
	}
	
	/**
	 * Эта функция создает разнообразные сообщения - уведомления CMN.00001, CMN.00002, CMN.00004, ADM.00001, ADM.00006, ADM.00007
	 * 
	 * @param messageType - тип сообщения уведомления
	 * @param receivedEnvelope - полученный конверт
	 * @param receivingSystem - получающая система
	 * @param receivingCustoms - получающая таможня, если применимо
	 * @param processor - дополнительный постпроцессор конверта
	 * @param configurator - хранитель конфигураций
	 * @param serviceHolder - хранитель сервисов
	 * @return
	 * @throws DatabaseException 
	 * @throws ResultTypeException
	 */
	public static EDEnvelope createNotificationMessage(
			String messageType, EDEnvelope receivedEnvelope,
			String resultCode,
			String recipientSystem, CustomsType receivingCustoms )
		throws BaseProcessingException, DatabaseException
	{
		EnvelopeType responseEnvelope = new EnvelopeType( );
		
		HeaderType responseHeader = createNotificationHeader(
			messageType, receivedEnvelope,
			recipientSystem, receivingCustoms
		);
		
		responseEnvelope.setHeader( responseHeader );

		BodyType responseBody = createNotificationBody(
			messageType, receivedEnvelope,
			resultCode
		);
		
		responseEnvelope.setBody( responseBody );

		EDEnvelope resp = new EDEnvelope( responseEnvelope, receivedEnvelope.getSenderSystem( ) );
		
		resp.setRecipientSystem( recipientSystem );
		resp.setIncomeEnvelopeID( null );
		resp.setSaveEnvelope( true );
		resp.setSaveDocument( true );
		resp.setOrigin( EnvelopeOrigins.GENERATED );
		
		return resp;
	}
	
	public static EDEnvelope createResponseMessage(
			String messageType, EDEnvelope receivedEnvelope,
			Object document,
			String recipientSystem, CustomsType receivingCustoms )
		throws BaseProcessingException, DatabaseException
	{
		EnvelopeType responseEnvelope = new EnvelopeType( );
		
		HeaderType responseHeader = createResponseHeader(
			messageType, receivedEnvelope,
			recipientSystem, receivingCustoms
		);
		
		responseEnvelope.setHeader( responseHeader );
		
		BodyType responseBody = createResponseBody( document );
		
		responseEnvelope.setBody( responseBody );

		EDEnvelope resp = new EDEnvelope( responseEnvelope, receivedEnvelope.getSenderSystem( ) );
		
		resp.setRecipientSystem( recipientSystem );
		resp.setIncomeEnvelopeID( null );
		resp.setSaveEnvelope( true );
		resp.setSaveDocument( true );
		resp.setOrigin( EnvelopeOrigins.GENERATED );
		
		return resp;
	}
	
	public static EDEnvelope createFluentMessage(
			String messageType, String processId, String participantId,
			String messageKind, String softKind, String softVersion,
			String senderSystem, CustomsType sendingCustoms,
			String recipientSystem, CustomsType receivingCustoms,
			Object document ) 
		throws BaseProcessingException, DatabaseException
	{
		EnvelopeType responseEnvelope = new EnvelopeType( );
		
		HeaderType responseHeader = createFluentHeader( 
			messageType, processId, participantId, 
			messageKind, softKind, softVersion, 
			senderSystem, sendingCustoms, 
			recipientSystem, receivingCustoms
		);
		
		responseEnvelope.setHeader( responseHeader );
		
		BodyType responseBody = createFluentBody( document );
		
		responseEnvelope.setBody( responseBody );
		
		EDEnvelope resp = new EDEnvelope( responseEnvelope, senderSystem );
		
		resp.setRecipientSystem( recipientSystem );
		resp.setIncomeEnvelopeID( null );
		resp.setSaveEnvelope( true );
		resp.setSaveDocument( true );
		resp.setOrigin( EnvelopeOrigins.GENERATED );

		return resp;
	}	
	
	public static void reRouteMessage(
			EDEnvelope envelope, 
			CustomsType senderCustoms,
			String recipientSystem, CustomsType receiverCustoms,
			String initialEnvelopeId, String incomeEnvelopeId ) 
		throws ResultTypeException, DatabaseException
	{
		EDHeaderType edHeader = envelope.getEDHeader( );
		
		edHeader.setSenderCustoms( senderCustoms );
		edHeader.setReceiverCustoms( receiverCustoms );
		
		RoutingInfType rInfo = envelope.getRoutingInfo( );
		
		rInfo.setSenderInformation( getSenderInformation( 
			recipientSystem, receiverCustoms, 
			envelope.getParticipantID( )
		) );
		rInfo.setReceiverInformationList( getReceiverInformation( 
			recipientSystem, receiverCustoms, 
			envelope.getParticipantID( )
		) );
		
		envelope.setInitialEnvelopeID( initialEnvelopeId );
		envelope.setIncomeEnvelopeID( incomeEnvelopeId );
		
		envelope.setRecipientSystem( recipientSystem );
		
		if ( BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.ASKTT2 ) )
		{
			envelope.getApplicationInfo( ).setMessageKind( edHeader.getMessageType( ) );
		}
	}
	
	public static void changeParticipant(
			EDEnvelope envelope, String participantId ) 
		throws DatabaseException
	{
		EDHeaderType edHeader = envelope.getEDHeader( );
		
		edHeader.setParticipantID( participantId );
		
		RoutingInfType rInfo = envelope.getRoutingInfo( );
		
		rInfo.setSenderInformation( getSenderInformation(
			envelope.getRecipientSystem( ), edHeader.getReceiverCustoms( ),
			participantId
		) );
		rInfo.setReceiverInformationList( getReceiverInformation(
			envelope.getRecipientSystem( ), edHeader.getReceiverCustoms( ),
			participantId
		) );
	}
			
	private static HeaderType createTranzitHeader(
			Map< String, String > messageTypeSubstituion,
			EDEnvelope receivedEnvelope,
			String recipientSystem, CustomsType receivingCustoms ) 
		throws ResultTypeException, DatabaseException
	{
		HeaderType receivedHeader = receivedEnvelope.getEnvelope( ).getHeader( );
		HeaderType responseHeader = new HeaderType( );
		
		List< Object > headerAnys = new ArrayList< Object >( );
		responseHeader.setAnyList( headerAnys );
		
		ApplicationInfType receivedAppInfo = getApplicationInfo( receivedHeader );
		if ( null == receivedAppInfo )
			throwException( receivedEnvelope );
		
		ApplicationInfType responseAppInfo = createApplicationInfo( 
			receivedAppInfo.getMessageKind( ), 
			receivedAppInfo.getSoftKind( ), 
			receivedAppInfo.getSoftVersion( ) 
		);
		headerAnys.add( responseAppInfo );
		
		RoutingInfType receivedRoutingInfo = getRoutingInfo( receivedHeader );
		if ( null == receivedRoutingInfo )
			throwException( receivedEnvelope );
		
		RoutingInfType responseRoutingInfo = createRoutingInfo(
			UUIDGen.getUUID( ).toString( ), // envelopeId
			null, // initialEnvelopeID мы сбрасываем, если его нужно сохранить - надо объявить это в external processor'е
			null, // senderInformation мы сделаем попозже
			null, // receiverInformationList мы сделаем попозже
			new DateTime( ),
			receivedRoutingInfo.getPriority( ),
			receivedRoutingInfo.getExpiration( ),
			receivedRoutingInfo.getConfirmationRequest( )
		);
		checkPassthroughTransit( responseRoutingInfo, receivedRoutingInfo );
		headerAnys.add( responseRoutingInfo );
		
		EDHeaderType receivedEdHeader = getEdHeader( receivedHeader );
		if ( null == receivedEdHeader )
			throwException( receivedEnvelope );
		
		EDHeaderType responseEdHeader = createEdHeader(
			null, // messageType сделаем попозже
			receivedEdHeader.getProccessID( ),
			receivedEdHeader.getParticipantID( ),
			receivedEdHeader.getSenderCustoms( ), // отправителя оставляем того, который есть
			null // receiverCustoms сделаем попозже
		);
		headerAnys.add( responseEdHeader );
		
		/**
		 * А теперь проведем пост процессинг заголовков согласно тому, что нам
		 * надо сделать транзитный конверт и согласно получателю, которого
		 * нам передачи
		 */

		responseRoutingInfo.setSenderInformation( 
			getSenderInformation(
				recipientSystem, receivingCustoms,
				receivedEdHeader.getParticipantID( )
			) 
		);
		
		responseRoutingInfo.setReceiverInformationList( 
			getReceiverInformation( 
				recipientSystem, receivingCustoms, 
				receivedEdHeader.getParticipantID( )
			) 
		);
		
		responseEdHeader.setMessageType( 
			mapMessageType( 
				receivedEdHeader.getMessageType( ), 
				messageTypeSubstituion 
			) 
		);
		
		if ( BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.CUSTOMS ) ||
			 BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.EPS ) )
		{
			responseEdHeader.setReceiverCustoms( receivingCustoms );
		}
		else if ( BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.MALAKHIT ) ||
                BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.ORDER ) ||
                BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.PAYMENT1 ) ||
                BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.PAYMENT2 ))
		{
			responseEdHeader.setReceiverCustoms( receivingCustoms );
			
			CustomsType epsCustoms = new CustomsType( );
			epsCustoms.setCustomsCode( _configurator.getEpsCustomsCode( ) );
			epsCustoms.setExchType( receivingCustoms.getExchType( ) );
			responseEdHeader.setSenderCustoms( epsCustoms );			
		}
		else if ( BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.ASKTT2 ) )
		{
			responseEdHeader.setReceiverCustoms( receivingCustoms );
			responseAppInfo.setMessageKind( responseEdHeader.getMessageType( ) );
		}

		return responseHeader;
	}
	
	private static HeaderType createNotificationHeader(
			String messageType, EDEnvelope receivedEnvelope,
			String recipientSystem, CustomsType receivingCustoms ) 
		throws ResultTypeException, DatabaseException
	{
		HeaderType receivedHeader = receivedEnvelope.getEnvelope( ).getHeader( );
		HeaderType responseHeader = new HeaderType( );
		
		List< Object > headerAnys = new ArrayList< Object >( );
		responseHeader.setAnyList( headerAnys );
		
		ApplicationInfType receivedAppInfo = getApplicationInfo( receivedHeader );
		if ( null == receivedAppInfo )
			throwException( receivedEnvelope );
		
		ApplicationInfType responseAppInfo = createApplicationInfo( 
			null, // MessageKind для нотификаций обрываем
			receivedAppInfo.getSoftKind( ), 
			receivedAppInfo.getSoftVersion( ) 
		);
		headerAnys.add( responseAppInfo );
		
		RoutingInfType receivedRoutingInfo = getRoutingInfo( receivedHeader );
		if ( null == receivedRoutingInfo )
			throwException( receivedEnvelope );
		
		RoutingInfType responseRoutingInfo = createRoutingInfo(
			UUIDGen.getUUID( ).toString( ), // envelopeId
			receivedRoutingInfo.getEnvelopeID( ), // initialEnvelopeId, т.к. это сообщение-уведомление, мы заполняем это поле всегда входящим конвертом
			null, // senderInformation мы сделаем попозже
			null, // receiverInformationList мы сделаем попозже
			new DateTime( ),
			null, // Priority
			null, // Expiration - хз что такое
			null // ConfirmationRequest - хз что такое
		);
		headerAnys.add( responseRoutingInfo );
		
		EDHeaderType receivedEdHeader = getEdHeader( receivedHeader );
		if ( null == receivedEdHeader )
			throwException( receivedEnvelope );
		
		CustomsType recvCustoms = receivedEdHeader.getReceiverCustoms( );
		if ( BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.MALAKHIT ) ||
                BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.ORDER ) ||
                BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.PAYMENT1 ) ||
                BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.PAYMENT2 ))
		{
			String epsCustomsCode = _configurator.getEpsCustomsCode( );
			String epsExchType = ( null != recvCustoms ? recvCustoms.getExchType( ) : receivingCustoms.getExchType( ) );
			
			recvCustoms = new CustomsType( );
			recvCustoms.setCustomsCode( epsCustomsCode );
			recvCustoms.setExchType( epsExchType );
		}
		
		EDHeaderType responseEdHeader = createEdHeader(
			messageType, // messageType сделаем попозже
			receivedEdHeader.getProccessID( ),
			receivedEdHeader.getParticipantID( ),
			recvCustoms, // SenderCustoms - либо таможня получатель, либо null если от декларанта
			receivingCustoms // receivedEdHeader.getSenderCustoms( ) // ReceiverCustoms - либо таможня отправитель, либо null если от декларанта
		);
		headerAnys.add( responseEdHeader );
		
		/**
		 * А теперь проведем пост процессинг заголовков согласно тому, что нам
		 * надо сделать конверт уведомление и согласно получателю, которого
		 * нам передали
		 */

		responseRoutingInfo.setSenderInformation( 
			getSenderInformation(
				recipientSystem, receivingCustoms,
				receivedEdHeader.getParticipantID( )
			) 
		);
		
		responseRoutingInfo.setReceiverInformationList( 
			getReceiverInformation( 
				recipientSystem, receivingCustoms, 
				receivedEdHeader.getParticipantID( )
			) 
		);
		
		if ( BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.ASKTT2 ) )
		{
			responseAppInfo.setMessageKind( responseEdHeader.getMessageType( ) );
		}

		return responseHeader;
	}	
	
	private static HeaderType createResponseHeader(
			String messageType, EDEnvelope receivedEnvelope,
			String recipientSystem, CustomsType receivingCustoms ) 
		throws ResultTypeException, DatabaseException
	{
		HeaderType receivedHeader = receivedEnvelope.getEnvelope( ).getHeader( );
		HeaderType responseHeader = new HeaderType( );
		
		List< Object > headerAnys = new ArrayList< Object >( );
		responseHeader.setAnyList( headerAnys );
		
		ApplicationInfType receivedAppInfo = getApplicationInfo( receivedHeader );
		if ( null == receivedAppInfo )
			throwException( receivedEnvelope );
		
		ApplicationInfType responseAppInfo = createApplicationInfo( 
			null, // MessageKind 
			receivedAppInfo.getSoftKind( ), 
			receivedAppInfo.getSoftVersion( ) 
		);
		headerAnys.add( responseAppInfo );
		
		RoutingInfType receivedRoutingInfo = getRoutingInfo( receivedHeader );
		if ( null == receivedRoutingInfo )
			throwException( receivedEnvelope );
		
		RoutingInfType responseRoutingInfo = createRoutingInfo(
			UUIDGen.getUUID( ).toString( ), // envelopeId
			receivedRoutingInfo.getEnvelopeID( ), // InitialEnvelopeID - сообщение ответное !
			null, // senderInformation мы сделаем попозже
			null, // receiverInformationList мы сделаем попозже
			new DateTime( ),
			receivedRoutingInfo.getPriority( ),
			null, // Expiration
			null // ConfirmationRequest
		);
		headerAnys.add( responseRoutingInfo );
		
		EDHeaderType receivedEdHeader = getEdHeader( receivedHeader );
		if ( null == receivedEdHeader )
			throwException( receivedEnvelope );
		
		EDHeaderType responseEdHeader = createEdHeader(
			messageType, // messageType сделаем попозже
			receivedEdHeader.getProccessID( ),
			receivedEdHeader.getParticipantID( ),
			receivedEdHeader.getReceiverCustoms( ), // SenderCustoms - либо таможня получатель, либо null если от декларанта
			receivedEdHeader.getSenderCustoms( ) // ReceiverCustoms - либо таможня отправитель, либо null если от декларанта
		);
		headerAnys.add( responseEdHeader );
		
		/**
		 * А теперь проведем пост процессинг заголовков согласно тому, что нам
		 * надо сделать транзитный конверт и согласно получателю, которого
		 * нам передачи
		 */

		responseRoutingInfo.setSenderInformation( 
			getSenderInformation(
				recipientSystem, receivingCustoms,
				receivedEdHeader.getParticipantID( )
			) 
		);
		
		responseRoutingInfo.setReceiverInformationList( 
			getReceiverInformation( 
				recipientSystem, receivingCustoms, 
				receivedEdHeader.getParticipantID( )
			) 
		);
		
		if ( BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.ASKTT2 ) )
		{
			responseAppInfo.setMessageKind( responseEdHeader.getMessageType( ) );
		}
		
		return responseHeader;
	}	
	
	private static HeaderType createFluentHeader(
			String messageType, String processId, String participantId,
			String messageKind, String softKind, String softVersion, 
			String senderSystem, CustomsType sendingCustoms,
			String recipientSystem, CustomsType receivingCustoms ) 
		throws ResultTypeException, DatabaseException
	{
		HeaderType responseHeader = new HeaderType( );
		
		List< Object > headerAnys = new ArrayList< Object >( );
		responseHeader.setAnyList( headerAnys );
				
		ApplicationInfType responseAppInfo = createApplicationInfo( 
			messageKind, softKind, softVersion 
		);
		headerAnys.add( responseAppInfo );
				
		RoutingInfType responseRoutingInfo = createRoutingInfo(
			UUIDGen.getUUID( ).toString( ), // envelopeId
			null, // initialEnvelopeID мы сбрасываем, если его нужно сохранить - надо объявить это в external processor'е
			null, // senderInformation мы сделаем попозже
			null, // receiverInformationList мы сделаем попозже
			new DateTime( ),
			null, null, null
		);
		headerAnys.add( responseRoutingInfo );
				
		EDHeaderType responseEdHeader = createEdHeader(
			messageType, // messageType сделаем попозже
			processId,
			participantId,
			null, // senderCustoms сделаем попозже
			null // receiverCustoms сделаем попозже
		);
		headerAnys.add( responseEdHeader );
		
		/**
		 * А теперь проведем пост процессинг заголовков согласно тому, что нам
		 * надо сделать транзитный конверт и согласно получателю, которого
		 * нам передачи
		 */

		responseRoutingInfo.setSenderInformation( 
			getSenderInformation(
				recipientSystem, receivingCustoms,
				participantId
			) 
		);
		
		responseRoutingInfo.setReceiverInformationList( 
			getReceiverInformation( 
				recipientSystem, receivingCustoms, 
				participantId 
			) 
		);
		
		if ( BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.CUSTOMS ) ||
			 BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.EPS ) ||
			 BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.ASKTT2 ) ||
			 BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.ADMIN ) ||
			 BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.BALANCER ) )
		{
			responseEdHeader.setReceiverCustoms( receivingCustoms );
		}
		else if ( BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.MALAKHIT ) ||
                BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.ORDER ) ||
                BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.PAYMENT1 ) ||
                BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.PAYMENT2 ))
		{
			responseEdHeader.setReceiverCustoms( receivingCustoms );
			
			CustomsType epsCustoms = new CustomsType( );
			epsCustoms.setCustomsCode( _configurator.getEpsCustomsCode( ) );
			epsCustoms.setExchType( receivingCustoms.getExchType( ) );
			responseEdHeader.setSenderCustoms( epsCustoms );			
		}
		
		if ( BusinessSystems.isSuchSystem( senderSystem, BusinessSystems.CUSTOMS ) ||
			 BusinessSystems.isSuchSystem( senderSystem, BusinessSystems.EPS ) ||
			 BusinessSystems.isSuchSystem( senderSystem, BusinessSystems.ASKTT2 ) ||
			 BusinessSystems.isSuchSystem( senderSystem, BusinessSystems.MALAKHIT ) ||
			 BusinessSystems.isSuchSystem( senderSystem, BusinessSystems.ADMIN ) ||
			 BusinessSystems.isSuchSystem( senderSystem, BusinessSystems.BALANCER ) ||
                BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.ORDER ) ||
                BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.PAYMENT1 ) ||
                BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.PAYMENT2 ))
		{
			responseEdHeader.setSenderCustoms( sendingCustoms );
		}
		
		if ( BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.ASKTT2 ) )
		{
			responseAppInfo.setMessageKind( responseEdHeader.getMessageType( ) );
		}

		return responseHeader;
	}	
	
	/**
	 * Создаем тело транзитного сообщения
	 * В целях экономии использует уже существующие объекты из входящего сообщения
	 * 
	 * @param receivedBody тело полученного сообщения
	 * @param configurator конфигуратор содержит настройки системы
	 * @param serviceHolder хранилище сервисов доступа к БД
	 * @return
	 */
	private static BodyType createTranzitBody( BodyType receivedBody )
	{
		BodyType responseBody = new BodyType( );
		
		List< Object > bodyAnys = new ArrayList< Object >( );
		responseBody.setAnyList( bodyAnys );
		
		for ( Object any : receivedBody.getAnyList( ) )
		{
			bodyAnys.add( any );
		}
		
		return responseBody;
	}
	
	private static BodyType createNotificationBody(
			String messageType, EDEnvelope receivedEnvelope,
			String resultCode ) 
		throws ResultTypeException, DatabaseException
	{
		BodyType responseBody = new BodyType( );
		
		List< Object > bodyAnys = new ArrayList< Object >( );
		responseBody.setAnyList( bodyAnys );
		
		Object document = null;
		
		if ( messageType.equalsIgnoreCase( MessageType.CMN_00001 ) ||
			 messageType.equalsIgnoreCase( MessageType.CMN_09999 ) ||
			 messageType.equalsIgnoreCase( MessageType.ADM_00001 ) ||
			 messageType.equalsIgnoreCase( MessageType.ADM_00007 ) )
		{
			document = createCMN00001Document( receivedEnvelope, resultCode );
		}
		else if ( messageType.equalsIgnoreCase( MessageType.CMN_00002 ) )
		{
			document = createCMN00002Document( receivedEnvelope );
		}
		else if ( messageType.equalsIgnoreCase( MessageType.CMN_00004 ) ||
				  messageType.equalsIgnoreCase( MessageType.ADM_00004 ) ||
				  messageType.equalsIgnoreCase( MessageType.ADM_00006 ) )
		{
			document = createCMN00004Document( receivedEnvelope );
		}
		else if ( messageType.equalsIgnoreCase( MessageType.PVR_00002 ) )
		{
			document = createPVR0002Document( receivedEnvelope, resultCode );
		}
		
		if ( null == document )
			throwException( receivedEnvelope );

		bodyAnys.add( document );
		
		return responseBody;
	}
	
	private static BodyType createResponseBody( Object document )
		throws ResultTypeException
	{
		BodyType responseBody = new BodyType( );
		
		List< Object > bodyAnys = new ArrayList< Object >( );
		responseBody.setAnyList( bodyAnys );
		
		bodyAnys.add( document );
		
		return responseBody;
	}
	
	private static BodyType createFluentBody( Object document )
	{
		BodyType responseBody = new BodyType( );
		
		List< Object > bodyAnys = new ArrayList< Object >( );
		responseBody.setAnyList( bodyAnys );
		
		bodyAnys.add( document );
		
		return responseBody;
	}	

	private static ApplicationInfType getApplicationInfo( HeaderType header )
	{
		for ( Object obj : header.getAnyList( ) )
		{
			if ( obj instanceof ApplicationInfType )
				return ( ApplicationInfType )obj;
		}

		return null;
	}
	
	private static RoutingInfType getRoutingInfo( HeaderType header )
	{
		for ( Object obj : header.getAnyList( ) )
		{
			if ( obj instanceof RoutingInfType )
				return ( RoutingInfType )obj;
		}
		
		return null;
	}
	
	private static EDHeaderType getEdHeader( HeaderType header )
	{
		for ( Object obj : header.getAnyList( ) )
		{
			if ( obj instanceof EDHeaderType )
				return ( EDHeaderType )obj;
		}
		
		return null;
	}
	
	/**
	 * Создаем заголовок информации о ПО
	 * 
	 * @param messageKind
	 * @param softKind
	 * @param softVersion
	 * @return
	 */
	private static ApplicationInfType createApplicationInfo( 
			String messageKind,
			String softKind,
			String softVersion )
	{
		ApplicationInfType applicationInfo = new ApplicationInfType( );
		
		applicationInfo.setMessageKind( messageKind );
		applicationInfo.setSoftKind( softKind );
		applicationInfo.setSoftVersion( softVersion );

		return applicationInfo;
	}
	
	/**
	 * Создаем заголовок информации о роутинге 
	 * 
	 * @param envelopeID
	 * @param initialEnvelopeID
	 * @param senderInformation
	 * @param receiverInformation
	 * @param preparationDateTime
	 * @param priority
	 * @param expiration
	 * @param confirmationRequest
	 * @return
	 */
	private static RoutingInfType createRoutingInfo( 
			String envelopeID, String initialEnvelopeID,
			String senderInformation, List< String > receiverInformation,
			DateTime preparationDateTime, BigInteger priority,
			Integer expiration, ConfirmationRequestType confirmationRequest )
	{
		RoutingInfType routingInfo = new RoutingInfType( );
		
		routingInfo.setEnvelopeID( envelopeID );
		routingInfo.setInitialEnvelopeID( initialEnvelopeID );
		routingInfo.setSenderInformation( senderInformation );
		routingInfo.setReceiverInformationList( receiverInformation );
		routingInfo.setPreparationDateTime( preparationDateTime );
		routingInfo.setPriority( priority );
		routingInfo.setExpiration( expiration );
		routingInfo.setConfirmationRequest( confirmationRequest );
		
		return routingInfo;
	}
	
	/**
	 * Создаем заголовок электрички
	 * 
	 * @param messageType
	 * @param proccessID
	 * @param participantID
	 * @param senderCustoms
	 * @param receiverCustoms
	 * @return
	 */
	private static EDHeaderType createEdHeader(
			String messageType, String proccessID, String participantID,
			CustomsType senderCustoms, CustomsType receiverCustoms )
	{
		EDHeaderType edHeader = new EDHeaderType( );
		
		edHeader.setMessageType( messageType );
		edHeader.setProccessID( proccessID );
		edHeader.setParticipantID( participantID );
		
		edHeader.setSenderCustoms( senderCustoms );
		edHeader.setReceiverCustoms( receiverCustoms );
		
		return edHeader;
	}
	
	/**
	 * Вспомогательные функции
	 */

	/**
	 * 
	 * @param envelope
	 * @param serviceHolder
	 * @throws ResultTypeException
	 * @throws DatabaseException 
	 */
	private static void throwException( EDEnvelope envelope ) 
		throws ResultTypeException, DatabaseException
	{
		ErrorHelper.throwException( 
			"", 
			envelope.getDocument( ).getDocumentID( ),
			ResultCodes._09_96669_99, 
			ProcessingConstants.ERROR_TYPE_BUSINESS
		);
	}
		
	/**
	 * 
	 * @param envelope
	 * @return
	 * @throws DatabaseException 
	 */
	
	public static List< String > getReceiverInformation( 
			String recipientSystem, 
			CustomsType receivingCustoms, String participantId ) 
		throws DatabaseException
	{
		if ( BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.DECLARANT ) )
		{
			return getDeclarantReceiverInformation( participantId );
		}
		else if ( BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.CUSTOMS ) ||
				  BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.ADMIN ) )
		{
			return getCustomsReceiverInformation( receivingCustoms );
		}
		else if ( BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.EPS ) )
		{
			return getEpsReceiverInformation( receivingCustoms );
		}
		else if ( BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.ASKTT2 ) )
		{
			CustomsType customs = new CustomsType( );
			customs.setCustomsCode( _configurator.getAsktt2CustomsCode( ) ); 
			customs.setExchType( _configurator.getAsktt2ExchType( ) );
			return getCustomsReceiverInformation( customs );			
		}
		else if ( BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.MALAKHIT ) )
		{
			CustomsType customs = new CustomsType( );
			customs.setCustomsCode( _configurator.getMalakhitCustomsCode( ) );
			customs.setExchType( _configurator.getMalakhitExchType( ) );
			return getCustomsReceiverInformation( customs );			
		}
		else if ( BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.RZD ) )
		{
			return getRzdPollingReceiverInformation( );
		}
		else if ( BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.BALANCER ) )
		{
			return getBalancerReceiverInformation( );
		}
        else if(BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.ORDER )){
            CustomsType customs = new CustomsType( );
            customs.setCustomsCode( _configurator.getOrderCustomsCode( ) );
            customs.setExchType( _configurator.getOrderExchType( ) );
            return getCustomsReceiverInformation( customs );
        }
        else if(BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.PAYMENT1 )){
            CustomsType customs = new CustomsType( );
            customs.setCustomsCode( _configurator.getPayment1CustomsCode( ) );
            customs.setExchType( _configurator.getPayment1ExchType( ) );
            return getCustomsReceiverInformation( customs );
        }
        else if( BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.PAYMENT2 )){
            CustomsType customs = new CustomsType( );
            customs.setCustomsCode( _configurator.getPayment2CustomsCode( ) );
            customs.setExchType( _configurator.getPayment2ExchType() );
            return getCustomsReceiverInformation( customs );
        }
		
		return null;
	}
	
	public static String getSenderInformation(
			String recipientSystem,
			CustomsType receivingCustoms, String participantId ) 
		throws DatabaseException
	{
		if ( BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.DECLARANT ) )
		{
			return getDeclarantSenderInformation( participantId );
		}
		else if ( BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.CUSTOMS ) ||
				  BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.ASKTT2 ) ||
				  BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.MALAKHIT ) ||
                BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.ORDER ) ||
                BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.PAYMENT1 ) ||
                BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.PAYMENT2 ))
		{
			return getCustomsSenderInformation( );
		}
		else if ( BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.EPS ) )
		{
			return getEpsSenderInformation( );
		}
		else if ( BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.RZD ) )
		{
			return getRzdPollingSenderInformation( );
		}
		else if ( BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.BALANCER ) )
		{
			return getBalancerSenderInformation( );
		}
		else if ( BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.ADMIN ) )
		{
			return getAdminSenderInformation( );
		}
		
		return null;
	}
	
	private static void checkPassthroughTransit( 
			RoutingInfType responseRoutingInfo, RoutingInfType receivedRoutingInfo ) 
		throws DatabaseException
	{
		/**
		 * Если отправитель конверта не указывает ссылочную связанность, то и нам
		 * подменять InitialEnvelopeID нет смысла
		 */
		if ( StringUtil.isNullOrEmpty( receivedRoutingInfo.getInitialEnvelopeID( ) ) )
			return ;

		String initialEnvelopeId = receivedRoutingInfo.getInitialEnvelopeID( );
		String incomeEnvelopeId = _serviceHolder.getEnvelopeService( )
			.getIncomeEnvelopeIdByInitialEnvelopeId( initialEnvelopeId );
		
		/**
		 * Очень странно, но связки income -> initial у нас в базе нет
		 * вообще это может быть ошибка, но конкретно здесь не место для 
		 * определения этого, поэтому просто пропускаем
		 */
		if ( StringUtil.isNullOrEmpty( incomeEnvelopeId ) )
			return ;

		responseRoutingInfo.setInitialEnvelopeID( incomeEnvelopeId );
	}
	
	private static List< String > getDeclarantReceiverInformation( String participantId ) 
		throws DatabaseException
	{
		if ( StringUtil.isNullOrEmpty( participantId ) )
			return new ArrayList< String >( );		

		Edecl_Participant participant = _serviceHolder.getParticipantService( ).getParticipant( participantId );
		if ( null == participant )
			return new ArrayList< String >( );
		
		List< String > receiverInformation = new ArrayList< String >( );
		receiverInformation.add( participant.getTransportAddress( ) );
		
		return receiverInformation;
	}
	
	private static String getDeclarantSenderInformation( String participantId ) 
		throws DatabaseException
	{
		Edecl_Participant participant = _serviceHolder.getParticipantService( ).getParticipant( participantId );
		String address = _configurator.getExtGateSmtpAddress( );
		if ( null != participant && null != participant.getTransportAddress( ) 
				&& participant.getTransportAddress( ).toLowerCase( ).startsWith( "wmq" ) )
		{
			address = _configurator.getExtGateWmqAddress( );
		}
		
		return address;
	}
	
	private static List< String > getCustomsReceiverInformation( CustomsType customs ) 
		throws DatabaseException
	{
		if ( null == customs || 
			 StringUtil.isNullOrEmpty( customs.getCustomsCode( ) ) ||
			 StringUtil.isNullOrEmpty( customs.getExchType( ) ) )
			return new ArrayList< String >( );
		
		Edecl_Customs dbCustoms = _serviceHolder.getCustomsService( )
			.getCustoms( customs.getCustomsCode( ), customs.getExchType( ) );
		if ( null == dbCustoms )
			return new ArrayList< String >( );
		
		List< String > receiverInformation = new ArrayList< String >( );
		receiverInformation.add( dbCustoms.getTransportAddress( ) );
		
		return receiverInformation;
	}
	
	private static String getCustomsSenderInformation( )
	{
		return _configurator.getKastoReceiveAddress( );
	}
	
	private static List< String > getEpsReceiverInformation( CustomsType customs )
	{
		if ( null == customs || 
			 StringUtil.isNullOrEmpty( customs.getCustomsCode( ) ) ||
			 StringUtil.isNullOrEmpty( customs.getExchType( ) ) )
			return new ArrayList< String >( );
		
		/**
		 * Проверяем, не себе ли хотим отправлять?
		 * Если себе - то это вообще-то это глупо
		 * Однако иногда. нам надо отправить себе же, но в предыдущую версию
		 * поэтому учтем и этот случай
		 */
		RtuCodePatternsHolder rtuCodes = _configurator.getRtuPatternsHolder( );
		if ( rtuCodes.match( customs.getCustomsCode( ) ) )
		{
			List< String > res = new ArrayList< String >( );
			res.add( _configurator.getEpsReceiveAddress( ) );
			return res;
		}
		
		ExtRtuRouting routing = _serviceHolder.getCustomsOperator( ).getExternalRouting( 
				customs.getCustomsCode( ), 
				Integer.parseInt( customs.getExchType( ) ) 
		);
		
		if ( null == routing )
			return new ArrayList< String >( );
		
		List< String > receiverInformation = new ArrayList< String >( );
		receiverInformation.add( routing.getTransportAddress( ) );
		
		return receiverInformation;
	}
	
	private static String getEpsSenderInformation( )
	{
		return _configurator.getEpsReceiveAddress( );
	}
	
	private static String getRzdPollingSenderInformation( )
	{
		return _configurator.getRzdPollingSenderTransportAddress( );
	}
	
	private static List< String > getRzdPollingReceiverInformation( )
	{
		String recvInfo =  _configurator.getRzdPollingReceiverTransportAddress( );
		List< String > infos = new ArrayList< String >( );
		if ( ! StringUtil.isNullOrEmpty( recvInfo ) )
			infos.add( recvInfo );
			
		return infos;
	}

	private static String getBalancerSenderInformation( )
	{
		return _configurator.getEpsReceiveAddress( );
	}
	
	private static String getAdminSenderInformation( )
	{
		return _configurator.getEpsReceiveAdminAddress( );
	}
	
	private static List< String > getBalancerReceiverInformation( )
	{
		String recvInfo = String.format(
			"wmq://%s/%s", 
			_configurator.getBalancerQueueManager( ),
			_configurator.getBalancerEpsQueue( )
		);  
		List< String > infos = new ArrayList< String >( );
		if ( ! StringUtil.isNullOrEmpty( recvInfo ) )
			infos.add( recvInfo );
			
		return infos;
	}
	
	private static String mapMessageType( String messageType, Map< String, String > mappings )
	{
		if ( null == mappings )
			return messageType;
		
		if ( mappings.containsKey( messageType ) )
			return mappings.get( messageType );
		
		return messageType;
	}
	
	/**
	 * Кусок класса ответственный за создание документов
	 */
	
	private static final String CMN_00002_MESSAGE = "Система АПС ЭПС приняла сообщение.";
	private static final String CMN_00004_MESSAGE = "Система АПС ЭПС успешно обработала сообщение.";
	
	public static Object createCMN00001Document( EDEnvelope receivedEnvelope, String resultCode ) 
		throws DatabaseException
	{
		String refDocumentId = receivedEnvelope.getDocument( ).getDocumentID( );
		return DocumentCreator.createResultDocument( refDocumentId, resultCode, _serviceHolder.getErrListService( ) );
	}
	
	public static Object createPVR0002Document( EDEnvelope receivedEnvelope, String resultCode ) 
		throws DatabaseException
	{
		String refDocumentId = receivedEnvelope.getDocument( ).getDocumentID( );
		return DocumentCreator.createGatewayResult( refDocumentId, resultCode, _serviceHolder.getErrListService( ) );
	}
	
	public static Object createCMN00002Document( EDEnvelope receivedEnvelope ) // NO_UCD (use private)
	{
		String refDocumentId = receivedEnvelope.getDocument( ).getDocumentID( );
		return DocumentCreator.createSuccessResultDocument( refDocumentId, CMN_00002_MESSAGE );
	}
	
	public static Object createCMN00004Document( EDEnvelope receivedEnvelope ) // NO_UCD (use private)
	{
		String refDocumentId = receivedEnvelope.getDocument( ).getDocumentID( );
		return DocumentCreator.createSuccessResultDocument( refDocumentId, CMN_00004_MESSAGE );
	}
}
