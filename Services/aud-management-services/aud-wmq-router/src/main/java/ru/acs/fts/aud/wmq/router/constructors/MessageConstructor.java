package ru.acs.fts.aud.wmq.router.constructors;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.xml.sax.SAXException;

import ru.acs.fts.aud.management.utils.defines.DocumentModeIDs;
import ru.acs.fts.aud.management.utils.shared.Base64Coder;
import ru.acs.fts.aud.management.utils.shared.StringUtils;
import ru.acs.fts.aud.rest.service.model.defines.AudMessageKinds;
import ru.acs.fts.aud.rest.service.model.objects.AudCommand;
import ru.acs.fts.aud.rest.service.model.objects.AudRegistryRequest;
import ru.acs.fts.aud.rest.service.model.objects.DocInfo;
import ru.acs.fts.aud.wmq.router.jndi.SettingsWrapper;
import ru.acs.fts.aud.wmq.router.restWs.crypto.CryptoRestWs;
import ru.acs.fts.custommarshaller.XStringMarshallableClass;
import ru.acs.fts.schemas.aud.aud_putdocumentrequest.AUDPutDocumentRequestType;
import ru.acs.fts.schemas.aud.aud_registryrequest.AUDRegistryRequestType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDAppliedDocumentInfoWithVersionRefType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDAppliedDocumentWithBodyType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDAppliedPacketInfoType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDDocumentBodyType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDDocumentKindVersionIdInfoOptType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDGTDIDType;
import ru.acs.fts.schemas.aud.audinf.AUDInfType;
import ru.acs.fts.schemas.envelope.ApplicationInfType;
import ru.acs.fts.schemas.envelope.BodyType;
import ru.acs.fts.schemas.envelope.EnvelopeType;
import ru.acs.fts.schemas.envelope.HeaderType;
import ru.acs.fts.schemas.envelope.RoutingInfType;

public class MessageConstructor
{
	private static final Logger log = LoggerFactory.getLogger( MessageConstructor.class );
	
	private static final String NULL_GTD_DATE_TIME = "010189";
	
	private static final String DEFAULT_APPLIED_PACKET_TYPE = "01";
	private static final String UNKNOWN_APPLIED_PACKET_TYPE = "99";
	
	private static final String DEFAULT_GTDID_STATE = "01";
	private static final String DEFAULT_APPLIED_PACKET_INFO_DESCRIPTION = "Декларация на товары.";
	private static final String AUD_SOFT_VERSION = "1.11.1/0.0.0";

	private SettingsWrapper _settingsWrapper;
	private CryptoRestWs _cryptoRestWs;
	
	// @formatter:off
	@Required public void setSettingsWrapper( SettingsWrapper settingsWrapper ) { _settingsWrapper = settingsWrapper; }
	public SettingsWrapper getSettingsWrapper( ) { return _settingsWrapper; }
	
	@Required public void setCryptoRestWs( CryptoRestWs cryptoRestWs ) { _cryptoRestWs = cryptoRestWs; }
	public CryptoRestWs getCryptoRestWs( ) { return _cryptoRestWs; }
	// @formatter:on
	
	public EnvelopeType constructEnvelope( Object signedDocument, AudCommand cmd )
	{
		EnvelopeType env = new EnvelopeType( );
		
		HeaderType header = new HeaderType( );
		env.setHeader( header );
		
		List< Object > headerAnies = new ArrayList< Object >( );
		header.setAnyList( headerAnies );
		
		RoutingInfType rInfo = new RoutingInfType( );
		headerAnies.add( rInfo );
		
		rInfo.setEnvelopeID( UUID.randomUUID( ).toString( ) );
		rInfo.setSenderInformation( _settingsWrapper.getSettings( ).getSenderInformation( ) );		
		rInfo.setReceiverInformationList( _settingsWrapper.getSettings( ).getReceiverInformationList( ) );		
		rInfo.setPreparationDateTime( new DateTime( ) );

		ApplicationInfType appInfo = new ApplicationInfType( );
		headerAnies.add( appInfo );
		
		appInfo.setMessageKind( AudMessageKinds.AUD_PUT_DOC_REQ );
		// appInfo.setSoftVersion( cmd.getSoftVersion( ) );
		appInfo.setSoftVersion( AUD_SOFT_VERSION );
		
		AUDInfType audInf = new AUDInfType( );
		headerAnies.add( audInf );
		
		audInf.setArchiveClientId( _settingsWrapper.getSettings( ).getArchiveClientId( ) );
		audInf.setCustomsCode( _settingsWrapper.getSettings( ).getCustomsCode( ).toString( ) );
		
		BodyType body = new BodyType( );
		env.setBody( body );
		
		List< Object > bodyAnies = new ArrayList< Object >( );
		body.setAnyList( bodyAnies );
		
		bodyAnies.add( signedDocument );
        
        return env;
	}

	public EnvelopeType constructEnvelope( Object signedDocument )
	{
		EnvelopeType env = new EnvelopeType( );
		
		HeaderType header = new HeaderType( );
		env.setHeader( header );
		
		List< Object > headerAnies = new ArrayList< Object >( );
		header.setAnyList( headerAnies );
		
		RoutingInfType rInfo = new RoutingInfType( );
		headerAnies.add( rInfo );
		
		rInfo.setEnvelopeID( UUID.randomUUID( ).toString( ) );
		rInfo.setSenderInformation( _settingsWrapper.getSettings( ).getSenderInformation( ) );		
		rInfo.setReceiverInformationList( _settingsWrapper.getSettings( ).getReceiverInformationList( ) );		
		rInfo.setPreparationDateTime( new DateTime( ) );

		ApplicationInfType appInfo = new ApplicationInfType( );
		headerAnies.add( appInfo );
		
		appInfo.setMessageKind( AudMessageKinds.AUD_REGISTRY_REQ );
		// appInfo.setSoftVersion( cmd.getSoftVersion( ) );
		appInfo.setSoftVersion( AUD_SOFT_VERSION );
		
		AUDInfType audInf = new AUDInfType( );
		headerAnies.add( audInf );
		
		audInf.setArchiveClientId( _settingsWrapper.getSettings( ).getArchiveClientId( ) );
		audInf.setCustomsCode( _settingsWrapper.getSettings( ).getCustomsCode( ).toString( ) );
		
		BodyType body = new BodyType( );
		env.setBody( body );
		
		List< Object > bodyAnies = new ArrayList< Object >( );
		body.setAnyList( bodyAnies );
		
		bodyAnies.add( signedDocument );
        
        return env;
	}
	
	public AUDPutDocumentRequestType constructRequestDocument( AudCommand command ) 
		throws Exception
	{
		AUDPutDocumentRequestType documentRequest = new AUDPutDocumentRequestType( );
		List< DocInfo > docInfos = command.getDocInfos( );
		
		fillMainDocument( documentRequest, command, docInfos );

		if ( docInfos.size( ) > 1 )
		{
			List< DocInfo > embeddedDocs = getEmbeddedDocs( docInfos );
			
			List< AUDAppliedDocumentInfoWithVersionRefType > emdocs = new ArrayList< AUDAppliedDocumentInfoWithVersionRefType >( );
			for ( DocInfo ed : embeddedDocs )
			{
				AUDAppliedDocumentInfoWithVersionRefType adi = new AUDAppliedDocumentInfoWithVersionRefType( );
				
				adi.setPrevVersionArchiveDocumentId( ed.getPrevVersion( ) );
				adi.setAppliedDocumentId( ed.getDocumentId( ) );
				adi.setDescription( ed.getDescription( ) );
				
				AUDDocumentKindVersionIdInfoOptType dkviio = new AUDDocumentKindVersionIdInfoOptType( );
				adi.setDocumentKindVersionIdInfoOpt( dkviio );
				
				dkviio.setAppliedDocumentKindId( ed.getDocumentModeId( ) );
				
				emdocs.add( adi );
			}
			
			documentRequest.setEmbeddedDocumentAppliedInfoList( emdocs );
		}
		else if ( 1 == docInfos.size( ) )
		{
			DocInfo di = docInfos.get( 0 );
			if ( null != command.getEadFlag( ) && 1 == command.getEadFlag( ) )
			{
				fillEadPutDocData( documentRequest, di );
			}
		}

		return documentRequest;
	}
	
	private void fillMainDocument( 
			AUDPutDocumentRequestType documentRequest,
			AudCommand command, List< DocInfo > docInfos ) 
		throws Exception
	{
		try
		{
			documentRequest.setDocumentID( UUID.randomUUID( ).toString( ) );
			documentRequest.setDocumentModeID( DocumentModeIDs.AUD_PUT_DOCUMENT_REQUEST );
			documentRequest.setDocumentDateTime( new DateTime( ) );
			documentRequest.setTestDocumentIndicator( false );
			
			DocInfo mainDoc = getMainDoc( docInfos );
			if ( null == mainDoc && null != docInfos && 0 != docInfos.size( ) )
			{
				mainDoc = docInfos.get( 0 );
			}
			
			log.info( String.format(
				"Главный документ %s для команды %s",
				( null != mainDoc ) ? "существует" : "не существует", command.getGuid( )
			) );
			
			documentRequest.setPrevVersionArchiveDocumentId( mainDoc.getPrevVersion( ) );
			documentRequest.setRefArchivePacketId( command.getProcInfo( ).getPacketId( ) );
			
			// AUDAppliedDocumentWithBodyType
			{
				AUDAppliedDocumentWithBodyType appliedDocumentWithBody = new AUDAppliedDocumentWithBodyType( );
				documentRequest.setAppliedDocumentWithBody( appliedDocumentWithBody );
			
				appliedDocumentWithBody.setAppliedDocumentId( mainDoc.getDocumentId( ) );
				appliedDocumentWithBody.setDescription( mainDoc.getDescription( ) );
			
					AUDDocumentBodyType docBody = new AUDDocumentBodyType( );
					appliedDocumentWithBody.setDocumentBody( docBody );
				
						XStringMarshallableClass xstr = new XStringMarshallableClass( );
						docBody.setAny( xstr );
						
						xstr.setByteArray( Base64Coder.decodeAsBytes( mainDoc.getDocumentBody( ), "UTF-8" ) );
						xstr.setEncoding( "UTF-8" );
						
						if ( ! _cryptoRestWs.isSigned( xstr.getByteArray( ) ) )
						{
							List< byte[ ] > resBytes = new ArrayList< byte[ ] >( );
							_cryptoRestWs.sign( xstr, resBytes );
							if ( ! resBytes.isEmpty( ) )
								xstr.setByteArray( resBytes.get( 0 ) );
						}
			
				AUDDocumentKindVersionIdInfoOptType dkviio = new AUDDocumentKindVersionIdInfoOptType( );
				appliedDocumentWithBody.setDocumentKindVersionIdInfoOpt( dkviio );
			
				dkviio.setAppliedDocumentKindId( mainDoc.getDocumentModeId( ) );
			}
			
			// AUDAppliedPacketInfoType
			{
				AUDAppliedPacketInfoType appliedPacketInfo = new AUDAppliedPacketInfoType( );
				documentRequest.setAppliedPacketInfo( appliedPacketInfo );
				
				appliedPacketInfo.setAppliedProcessId( command.getProcInfo( ).getProcessId( ) );
				if ( ! StringUtils.isNullOrEmpty( command.getProcInfo( ).getPacketId( ) ) )
					appliedPacketInfo.setAppliedProcessId( command.getProcInfo( ).getPacketId( ) );

				if ( ! StringUtils.isNullOrEmpty( command.getProcInfo( ).getGtdCustomsCode( ) ) &&
					 ! StringUtils.isNullOrEmpty( command.getProcInfo( ).getGtdNumber( ) ) &&
					 null != command.getProcInfo( ).getGtdRegistrationDate( ) )
				{
					appliedPacketInfo.setAppliedPacketId( String.format(
						"%s/%s/%s",
						command.getProcInfo( ).getGtdCustomsCode( ),
						( null != command.getProcInfo( ).getGtdRegistrationDate( ) )
							? command.getProcInfo( ).getGtdRegistrationDate( ).toString( "ddMMyy" )
							: NULL_GTD_DATE_TIME,
						command.getProcInfo( ).getGtdNumber( )
					) );
					appliedPacketInfo.setAppliedPacketType( DEFAULT_APPLIED_PACKET_TYPE );
					
					List< AUDGTDIDType > gtdids = new ArrayList< AUDGTDIDType >( );
					appliedPacketInfo.setAUDGTDIDList( gtdids );
					
					AUDGTDIDType gtdid = new AUDGTDIDType( );
					gtdids.add( gtdid );
					
					gtdid.setGTDNumber( command.getProcInfo( ).getGtdNumber( ) );
					gtdid.setCustomsCode( command.getProcInfo( ).getGtdCustomsCode( ) );
					gtdid.setGTDIDState( DEFAULT_GTDID_STATE );
					gtdid.setRegistrationDate(
						( null != command.getProcInfo( ).getGtdRegistrationDate( ) )
							? command.getProcInfo( ).getGtdRegistrationDate( ).toLocalDate( )
							: null
					);
				}
				else
				{
					appliedPacketInfo.setAppliedPacketType( UNKNOWN_APPLIED_PACKET_TYPE );
				}
				
				appliedPacketInfo.setDescription( DEFAULT_APPLIED_PACKET_INFO_DESCRIPTION );
			}
		}
		catch( Exception ee )
		{
			log.error( "", ee );
			throw ee;
		}
	}
	
	private DocInfo getMainDoc( List< DocInfo > docInfos )
	{
		if ( null == docInfos )
			return null;
		
		for ( DocInfo docInfo : docInfos )
		{
			if ( docInfo.getRefMainDoc( ).equalsIgnoreCase( docInfo.getDocumentId( ) ) )
				return docInfo;
		}
		
		return null;
	}
	
	private List< DocInfo > getEmbeddedDocs( List< DocInfo > docInfos )
	{
		List< DocInfo > res = new ArrayList< DocInfo >( );
		
		for ( DocInfo di : docInfos )
		{
			if ( ! di.getRefMainDoc( ).equalsIgnoreCase( di.getDocumentId( ) ) )
				res.add( di );
		}
		
		return res;
	}
	
	private void fillEadPutDocData( AUDPutDocumentRequestType documentRequest, DocInfo docInfo ) 
		throws XPathExpressionException, ParserConfigurationException, SAXException, IOException
	{
		if ( ! StringUtils.isNullOrEmpty( docInfo.getEadArchiveId( ) ) &&
			 ! StringUtils.isNullOrEmpty( docInfo.getEadDocumentId( ) ) &&
			 ! StringUtils.isNullOrEmpty( docInfo.getAudExtDocId( ) ) &&
			 ! StringUtils.isNullOrEmpty( docInfo.getAudExtPacketId( ) ) )
		{
			documentRequest.setRefExtArchiveDocumentId( docInfo.getAudExtDocId( ) );
			documentRequest.setRefExtArchivePacketId( docInfo.getAudExtPacketId( ) );
		}
	}
	
	public AUDRegistryRequestType constructRegistryRequest( AudRegistryRequest request ) 
	{
		AUDRegistryRequestType req = new AUDRegistryRequestType( );
		
		req.setDocumentID( UUID.randomUUID( ).toString( ) );
		req.setDocumentModeID( DocumentModeIDs.AUD_REGISTRY_REQUEST );
		
		req.setDocumentDateTime( request.getDocDateTime( ) );
		req.setTestDocumentIndicator( request.getTestIndicator( ) );
		req.setDateBegin( request.getDateBegin( ).toLocalDate( ) );
		req.setDateStop( request.getDateStop( ).toLocalDate( ) );
		req.setDateIndicatior( Integer.toString( request.getDateIndicator( ) ) );
		
		return req;
	}
}
