package ru.acs.fts.aud.wmq.router.restWs.crypto;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.jibx.runtime.JiBXException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;
import org.springframework.oxm.jibx.JibxUnmarshallingFailureException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import com.fasterxml.jackson.databind.ObjectMapper;

import ru.acs.fts.aud.management.utils.httpclient.HttpRequester;
import ru.acs.fts.aud.management.utils.shared.Base64Coder;
import ru.acs.fts.aud.wmq.router.jndi.SettingsWrapper;
import ru.acs.fts.aud.wmq.router.restWs.crypto.requests.CheckSignRequest;
import ru.acs.fts.aud.wmq.router.restWs.crypto.requests.SignRequest;
import ru.acs.fts.aud.wmq.router.restWs.crypto.responses.CheckSignResponse;
import ru.acs.fts.aud.wmq.router.restWs.crypto.responses.SignResponse;
import ru.acs.fts.aud.wmq.router.restWs.crypto.serviceModel.DoSign;
import ru.acs.fts.aud.wmq.router.restWs.shared.serviceModel.DocumentCheckResult;
import ru.acs.fts.aud.wmq.router.restWs.shared.serviceModel.DocumentToCheck;
import ru.acs.fts.aud.wmq.router.restWs.shared.serviceModel.ResultInformation;
import ru.acs.fts.custommarshaller.EnvelopeMarshaller;
import ru.acs.fts.custommarshaller.EnvelopeUnmarshaller;
import ru.acs.fts.custommarshaller.XStringMarshallableClass;
import ru.acs.fts.schemas.album.archadddocrequest.ArchAddDocRequestType;
import ru.acs.fts.schemas.album.ed_container.EDContainerType;
import ru.acs.fts.schemas.envelope.SignatureType;

public class CryptoRestWs
{
	private static final Logger log = LoggerFactory.getLogger( CryptoRestWs.class );
	
	private static final String CHECK_SIGNATURE_ENDPOINT = "check-signature";
	private static final String SIGN_ENDPOINT = "sign";
	
	private SettingsWrapper _settingsWrapper;
	private Marshaller _marshaller;
	private Unmarshaller _unmarshaller;
	
	// @formatter:off
	@Required public void setSettingsWrapper( SettingsWrapper settingsWrapper ) { _settingsWrapper = settingsWrapper; }
	public SettingsWrapper getSettingsWrapper( ) { return _settingsWrapper; }
	
	@Required public void setMarshaller( Marshaller marshaller ) { _marshaller = marshaller; }
	public Marshaller getMarshaller( ) { return _marshaller; }
	
	@Required public void setUnmarshaller( Unmarshaller unmarshaller ) { _unmarshaller = unmarshaller; }
	public Unmarshaller getUnmarshaller( ) { return _unmarshaller; }
	// @formatter:on
	
	public void checkSignature( Object document )
		throws Exception
	{
		DocumentToCheck doc2check = new DocumentToCheck( );
		
		doc2check.setEnvelopeId( "<EnvelopeID>:NO" );
		doc2check.setDocumentId( "<DocumentID>:NO" );
		doc2check.setProcessId( "<ProcessID>:NO" );
		
		List< String > xPath = new ArrayList< String >( );
		
		if ( document instanceof EDContainerType )
		{
			doc2check.setIsContainer( true );
			xPath.add( "//*[local-name()='ED_Container']/*[local-name()='ContainerDoc']/*[local-name()='DocBody']" );
		}
		else if ( document instanceof ArchAddDocRequestType )
		{
			doc2check.setIsContainer( true );
			xPath.add( "//*[local-name()='ArchAddDocRequest']/*[local-name()='ArchDoc']" );
		}
		else if ( document instanceof XStringMarshallableClass )
		{
			/**
			 * Мы точно не знаем что внутри, поэтому безопаснее всего проверять как контейнер
			 * по всем возможным ( известным нам ) xPath'ам
			 */
			doc2check.setIsContainer( true );
			xPath.add( "//*[local-name()='ED_Container']/*[local-name()='ContainerDoc']/*[local-name()='DocBody']" );			
			xPath.add( "//*[local-name()='ArchAddDocRequest']/*[local-name()='ArchDoc']" );
		}
		else
		{
			doc2check.setIsContainer( false );
		}
		
		doc2check.setXPath( xPath );
		
		byte[ ] bytes = null;
		
		if ( document instanceof XStringMarshallableClass )
		{
			XStringMarshallableClass xstr = ( XStringMarshallableClass )document;
			bytes = xstr.getByteArray( );
		}
		else
		{
			EnvelopeMarshaller envMarshaller = new EnvelopeMarshaller( );
			
			try
			{
				bytes = envMarshaller.marshalBaseDocOrSignature( document, _marshaller ).getByteArray( );
			}
			catch ( Exception exc )
			{
				log.info( "Ошибка анмаршаллинга: Class='{}', Message='{}'", exc.getClass( ), exc.getMessage( ) );
				log.error( "", exc );
				
				throw exc;
			}
		}

		try
		{
			String base64 = Base64Coder.encodeAsString( bytes, "UTF-8" );
			doc2check.setDocument( base64 );
		}
		catch ( Exception exc )
		{
			log.error( "Ошибка кодирования запроса в base64", exc );
			
			throw exc;
		}
		
		CheckSignRequest request = new CheckSignRequest( );
		request.setDocument( doc2check );
				
		ObjectMapper mapper = new ObjectMapper( );
		String data = null;
		
		try
		{
			data = mapper.writeValueAsString( request );
		}
		catch ( Exception exc )
		{
			log.error( "Не удалось преобразовать запрос в json при вызове REST Web-сервиса ЭЦП.", exc );
			
			throw exc;
		}
		
		Map< String, String > headers = new HashMap< String, String >( );
		headers.put( "Content-Type", "application/json; charset=utf-8" );
	
		String requestUrl = String.format( "%s%s", _settingsWrapper.getSettings( ).getRestCryptoSrvUrl( ), CHECK_SIGNATURE_ENDPOINT );
		
		String response = null;
		
		try
		{
			response = HttpRequester.POST( requestUrl, data, headers );
		}
		catch ( Exception exc )
		{
			log.error( "Не удалось вызвать REST Web-сервис ЭЦП.", exc ); 
		}
		
		CheckSignResponse resp = null;
		
		try
		{
			resp = mapper.readValue( response, CheckSignResponse.class );
		}
		catch ( Exception exc )
		{
			log.error( "Не удалось разобрать ответ от REST Web-сервиса ЭЦП.", exc );
			throw exc;
		}
		
		if ( ! resp.getStatus( ).equalsIgnoreCase( "ok" ) )
		{
			log.error( "Ошибка вызова REST Web-сервиса ЭЦП. status != 'ok'" );
			throw new Exception( "Ошибка вызова REST Web-сервиса ЭЦП. status != 'ok'" );
		}
		
		for ( DocumentCheckResult res : resp.getResults( ) )
		{
			for ( ResultInformation info : res.getInformation( ) )
			{
				if ( ! info.getCode( ).equalsIgnoreCase( "00.00000.00" ) )
					throw new Exception( info.getCode( ) );
			}
		}
	}
	
	public boolean isSigned( byte[ ] bytes )
	{
		try
		{
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance( );
			dbf.setNamespaceAware( true );
			
			DocumentBuilder db = dbf.newDocumentBuilder( );
			Document doc = db.parse( new ByteArrayInputStream( bytes ) );
			
			XPathFactory xpf = XPathFactory.newInstance( );
			XPath xp = xpf.newXPath( );
			XPathExpression xpe = xp.compile( "//*[local-name()='Signature']" );
			
			Node objectValue = ( Node )xpe.evaluate( doc, XPathConstants.NODE );
			if ( null != objectValue )
			{
				return true;
			}
		}
		catch ( Throwable t )
		{
		}
		
		return false;
	}

	public Object sign( Object document, List< byte[ ] > resBytes )
		throws Exception
	{
		DoSign doSign = new DoSign( );
		
		byte[ ] bytes = null;
		
		if ( document instanceof XStringMarshallableClass )
		{
			XStringMarshallableClass xstr = ( XStringMarshallableClass )document;
			bytes = xstr.getByteArray( );
		}
		else
		{
			EnvelopeMarshaller envMarshaller = new EnvelopeMarshaller( );
			
			try
			{
				bytes = envMarshaller.marshalBaseDocOrSignature( document, _marshaller ).getByteArray( );
			}
			catch ( Exception exc )
			{
				log.info( "Ошибка маршаллинга при подписи: Class='{}', Message='{}'", exc.getClass( ), exc.getMessage( ) );
				log.error( "", exc );
				
				throw exc;
			}
		}

		try
		{
			String base64 = Base64Coder.encodeAsString( bytes, "UTF-8" );
			doSign.setBytes( base64 );
		}
		catch ( Exception exc )
		{
			log.error( "Не удалось провести Base64 кодирование документа при вызове REST Web-сервиса ЭЦП.", exc );
			throw exc;
		}
		
		SignRequest request = new SignRequest( );
		request.setDoSign( doSign );
				
		ObjectMapper mapper = new ObjectMapper( );
		String data = null;
		
		try
		{
			data = mapper.writeValueAsString( request );
		}
		catch ( Exception exc )
		{
			log.error( "Не удалось преобразовать запрос в json при вызове REST Web-сервиса ЭЦП.", exc );
			throw exc;
		}
		
		Map< String, String > headers = new HashMap< String, String >( );
		headers.put( "Content-Type", "application/json; charset=utf-8" );
	
		String requestUrl = String.format( "%s%s", _settingsWrapper.getSettings( ).getRestCryptoSrvUrl( ), SIGN_ENDPOINT );
		
		String response = null;
		
		try
		{
			response = HttpRequester.POST( requestUrl, data, headers );
		}
		catch ( Exception exc )
		{
			log.error( "Не удалось вызвать REST Web-сервис ЭЦП.", exc );
			throw exc;
		}
		
		SignResponse resp = null;
		
		try
		{
			resp = mapper.readValue( response, SignResponse.class );
		}
		catch ( Exception exc )
		{
			log.info( "Ошибка при подписи конверта(ответ от сервиса): Class='{}', Message='{}'", exc.getClass( ), exc.getMessage( ) );
			log.info( "Response='{}'", response );
			
			log.error( "Не удалось разобрать ответ от REST Web-сервиса ЭЦП.", exc );
			throw exc;
		}
		
		if ( ! resp.getStatus( ).equalsIgnoreCase( "ok" ) )
		{
			log.error( "Ошибка вызова REST Web-сервиса ЭЦП" );
			throw new Exception( "Ошибка вызова REST Web-сервиса ЭЦП" );
		}
		
		bytes = Base64Coder.decodeAsBytes( resp.getDidSign( ).getBytes( ), "UTF-8" );
		
		if ( null != resBytes )
		{
			resBytes.add( bytes );
		}
		
		boolean unmarshallFailed = false;
		EnvelopeUnmarshaller envUnmarshaller = new EnvelopeUnmarshaller( );
		Object res = null;
		
		try
		{
			res = envUnmarshaller.unmarshallBaseDocOrSignature( bytes, _unmarshaller );
		}
		catch ( JiBXException e )
		{
			unmarshallFailed = true;
		}
		catch ( JibxUnmarshallingFailureException e )
		{
			unmarshallFailed = true;
		}

		if ( unmarshallFailed )
		{
			XStringMarshallableClass xstr = new XStringMarshallableClass( );
			xstr.setByteArray( bytes );
			xstr.setEncoding( "UTF-8" );
			res = xstr;
		}
		
		return res;
	}
}
