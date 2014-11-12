package ru.acs.fts.aud.router.processing.helpers;

import org.joda.time.DateTime;

import ru.acs.fts.aud.router.objects.AudEnvelope;
import ru.acs.fts.aud.router.processing.AudConfigurator;
import ru.acs.fts.aud.router.processing.definitions.BusinessSystems;
import ru.acs.fts.aud.router.utils.StringUtil;
import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.schemas.aud.audinf.AUDInfType;
import ru.acs.fts.schemas.envelope.ApplicationInfType;
import ru.acs.fts.schemas.envelope.BodyType;
import ru.acs.fts.schemas.envelope.EnvelopeType;
import ru.acs.fts.schemas.envelope.HeaderType;
import ru.acs.fts.schemas.envelope.RoutingInfType;

public class MessageCreator
{
	public static AudEnvelope createNotificationEnvelope( 
			String messageKind,
			AudEnvelope recvEnv, Object document,
			AudConfigurator configurator ) 
		throws BaseProcessingException, DatabaseException
	{
		EnvelopeType envelope = new EnvelopeType( );
		
		envelope.setHeader( createNotificationHeader( messageKind, recvEnv.getEnvelope( ).getHeader( ), configurator ) );
		envelope.setBody( createBody( document ) );
		
		AudEnvelope env = new AudEnvelope( envelope, BusinessSystems.SERVER );
		
		return env;
	}
	
	public static AudEnvelope createResponseEnvelope(
			String messageKind,
			AudEnvelope recvEnv, Object document,
			AudConfigurator configurator ) 
		throws BaseProcessingException, DatabaseException
	{
		EnvelopeType envelope = new EnvelopeType( );
		
		envelope.setHeader( createResponseHeader( messageKind, recvEnv.getEnvelope( ).getHeader( ), configurator ) );
		envelope.setBody( createBody( document ) );
		
		AudEnvelope env = new AudEnvelope( envelope, BusinessSystems.SERVER );
		
		return env;
	}
	
	private static HeaderType createNotificationHeader(
			String messageKind, HeaderType receivedHeader,
			AudConfigurator configurator )
	{
		// ApplicationInfType recvAppInfo = getApplicationInf( receivedHeader );
		RoutingInfType recvRInfo = getRoutingInf( receivedHeader );
		AUDInfType audInfo = getAudInf( receivedHeader );
		
		ApplicationInfType appInfo = createApplicationInf( messageKind, configurator.getAudServerName( ), configurator.getSoftVersion( ) );
		RoutingInfType rInfo = createRoutingInf( recvRInfo.getSenderInformation( ), recvRInfo.getEnvelopeID( ), configurator.getTransportServerAddress( ) );
		
		return createHeader( rInfo, appInfo, audInfo );		
	}
	
	private static HeaderType createResponseHeader(
			String messageKind, HeaderType receivedHeader,
			AudConfigurator configurator )
	{
		RoutingInfType recvRInfo = getRoutingInf( receivedHeader );
		AUDInfType audInfo = getAudInf( receivedHeader );
		
		ApplicationInfType appInfo = createApplicationInf( messageKind, configurator.getAudServerName( ), configurator.getSoftVersion( ) );
		RoutingInfType rInfo = createRoutingInf( recvRInfo.getSenderInformation( ), recvRInfo.getEnvelopeID( ), configurator.getTransportServerAddress( ) );
		
		return createHeader( rInfo, appInfo, audInfo );
	}
	
	
	/**
	 * Общие методы 
	 */
		
	private static HeaderType createHeader( RoutingInfType routingInf, ApplicationInfType applicationInf, AUDInfType audInf )
	{
		HeaderType header = new HeaderType( );
		header.getAnyList( ).add( applicationInf );
		header.getAnyList( ).add( routingInf );
		header.getAnyList( ).add( audInf );
	
		return header;
	}
	
	/*
	 * mrdekk: До лучших времен :)
	private static ApplicationInfType getApplicationInf( HeaderType header )
	{
		for ( Object obj : header.getAnyList( ) )
		{
			if ( obj instanceof ApplicationInfType )
				return ( ApplicationInfType )obj;
		}
		
		return null;
	}
	*/
	
	private static ApplicationInfType createApplicationInf( String messageKind, String softKind, String softVersion )
	{
		ApplicationInfType applicationInf = new ApplicationInfType( );
		applicationInf.setMessageKind( messageKind );
		applicationInf.setSoftKind( softKind );
		applicationInf.setSoftVersion( softVersion );
		
		return applicationInf;
	}
	
	private static RoutingInfType getRoutingInf( HeaderType header )
	{
		for ( Object obj : header.getAnyList( ) )
		{
			if ( obj instanceof RoutingInfType )
				return ( RoutingInfType )obj;
		}
		
		return null;
	}
		
	private static RoutingInfType createRoutingInf( 
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
	
	private static AUDInfType getAudInf( HeaderType header )
	{
		for ( Object obj : header.getAnyList( ) )
		{
			if ( obj instanceof AUDInfType )
				return ( AUDInfType )obj;
		}
		
		return null;
	}
	
	public static BodyType createBody( Object doc ) // NO_UCD (use private)
	{
		BodyType body = new BodyType( );
		body.getAnyList( ).add( doc );
		
		return body;
	}
}
