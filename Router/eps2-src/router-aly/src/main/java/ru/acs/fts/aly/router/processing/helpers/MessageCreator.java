package ru.acs.fts.aly.router.processing.helpers;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;

import ru.acs.fts.aly.router.objects.AlyEnvelope;
import ru.acs.fts.aly.router.processing.AlyConfigurator;
import ru.acs.fts.aly.router.processing.definitions.BusinessSystems;
import ru.acs.fts.aly.router.processing.exceptions.AlyException;
import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.objects.defines.EnvelopeOrigins;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.utils.StringUtil;
import ru.acs.fts.schemas.envelope.ApplicationInfType;
import ru.acs.fts.schemas.envelope.BodyType;
import ru.acs.fts.schemas.envelope.CustomsType;
import ru.acs.fts.schemas.envelope.EDHeaderType;
import ru.acs.fts.schemas.envelope.EnvelopeType;
import ru.acs.fts.schemas.envelope.HeaderType;
import ru.acs.fts.schemas.envelope.RoutingInfType;

public class MessageCreator
{		
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
	 * Создаем заголовок конверта
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

	public static AlyEnvelope createNotificationMessage(
			String messageType, AlyEnvelope receivedEnvelope,
			String resultCode,	AlyConfigurator configurator)
		throws BaseProcessingException, DatabaseException
	{
		EnvelopeType responseEnvelope = new EnvelopeType( );
		
		HeaderType responseHeader = createNotificationHeader(
			messageType, receivedEnvelope, configurator
		);
		
		responseEnvelope.setHeader( responseHeader );

		BodyType responseBody = createNotificationBody(
			messageType, receivedEnvelope,
			resultCode
		);

		responseEnvelope.setBody( responseBody );

		AlyEnvelope resp = new AlyEnvelope( responseEnvelope, receivedEnvelope.getSenderSystem( ) );

		resp.setRecipientSystem( BusinessSystems.EPS2 );
		resp.setInitialEnvelopeID( receivedEnvelope.getEnvelopeID( ) );
		resp.setSaveEnvelope( true );
		resp.setSaveDocument( true );
		resp.setOrigin( EnvelopeOrigins.GENERATED );
		
		return resp;
	}
	
	private static HeaderType createNotificationHeader(
			String messageType, AlyEnvelope receivedEnvelope,
			AlyConfigurator configurator ) 
		throws AlyException
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
			configurator.getTransportServerAddress( ),
			receivedRoutingInfo.getEnvelopeID( ),
			receivedRoutingInfo.getSenderInformation( )
		);

		headerAnys.add( responseRoutingInfo );
		
		EDHeaderType receivedEdHeader = getEdHeader( receivedHeader );
		if ( null == receivedEdHeader )
			throwException( receivedEnvelope );
		
		EDHeaderType responseEdHeader = createEdHeader(
			messageType,
			receivedEdHeader.getProccessID( ),
			receivedEdHeader.getParticipantID( ),
			receivedEdHeader.getReceiverCustoms( ),
			receivedEdHeader.getSenderCustoms( )
		);
		headerAnys.add( responseEdHeader );

		return responseHeader;
	}
	
	private static RoutingInfType createRoutingInfo( 
			String receiverInformation, 
			String initialEnvelopeId, 
			String transportServerAddress )
	{
		RoutingInfType routingInf = new RoutingInfType( );
		routingInf.setPreparationDateTime( new DateTime( ) );
		routingInf.setEnvelopeID( StringUtil.generateUuid( ) );
		routingInf.setInitialEnvelopeID( initialEnvelopeId );
		routingInf.setSenderInformation( transportServerAddress );
		routingInf.getReceiverInformationList( ).add( receiverInformation );
		
		return routingInf;
	}
	
	private static BodyType createNotificationBody(
			String messageType, AlyEnvelope receivedEnvelope,
			String resultCode ) 
		throws DatabaseException, AlyException
	{
		BodyType responseBody = new BodyType( );
		
		List< Object > bodyAnys = new ArrayList< Object >( );
		responseBody.setAnyList( bodyAnys );
		
		Object document = null;
		
		if ( messageType.equalsIgnoreCase( MessageType.CMN_00001 ) )
		{
			document = createCMN00001Document( receivedEnvelope, resultCode );
		}
		else if ( messageType.equalsIgnoreCase( MessageType.CMN_00002 ) )
		{
			document = createCMN00002Document( receivedEnvelope );
		}
		else if ( messageType.equalsIgnoreCase( MessageType.CMN_00004 ) )
		{
			document = createCMN00004Document( receivedEnvelope );
		}
		
		if ( null == document )
			throwException( receivedEnvelope );

		bodyAnys.add( document );
		
		return responseBody;
	}
	
	/**
	 * Кусок класса ответственный за создание документов
	 */
	
	private static final String CMN_00002_MESSAGE = "Система АПС ЭПС приняла сообщение.";
	private static final String CMN_00004_MESSAGE = "Система АПС ЭПС успешно обработала сообщение.";
	
	public static Object createCMN00001Document( AlyEnvelope receivedEnvelope, String resultCode ) 
		throws DatabaseException
	{
		String refDocumentId = receivedEnvelope.getDocument( ).getDocumentID( );
		return DocumentCreator.createResultDocument( refDocumentId, resultCode );
	}
	
	public static Object createCMN00002Document( AlyEnvelope receivedEnvelope )
	{
		String refDocumentId = receivedEnvelope.getDocument( ).getDocumentID( );
		return DocumentCreator.createSuccessResultDocument( refDocumentId, CMN_00002_MESSAGE );
	}
	
	public static Object createCMN00004Document( AlyEnvelope receivedEnvelope )
	{
		String refDocumentId = receivedEnvelope.getDocument( ).getDocumentID( );
		return DocumentCreator.createSuccessResultDocument( refDocumentId, CMN_00004_MESSAGE );
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
	 * @throws AlyException 
	 */
	private static void throwException( AlyEnvelope envelope ) 
		throws AlyException
	{
		ErrorHelper.throwBasicException( ResultCodes._09_96669_99 );
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
}
