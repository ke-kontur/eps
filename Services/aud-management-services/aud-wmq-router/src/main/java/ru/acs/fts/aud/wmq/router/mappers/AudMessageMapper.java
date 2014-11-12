package ru.acs.fts.aud.wmq.router.mappers;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.joda.time.DateTime;

import ru.acs.fts.aud.management.utils.shared.Base64Coder;
import ru.acs.fts.aud.rest.service.model.objects.AudEmbeddedDocumentArchiveInfo;
import ru.acs.fts.aud.rest.service.model.objects.AudEmbeddedDocumentResultInfo;
import ru.acs.fts.aud.rest.service.model.objects.AudError;
import ru.acs.fts.aud.rest.service.model.objects.AudMessage;
import ru.acs.fts.aud.rest.service.model.objects.AudPutDocumentResponse;
import ru.acs.fts.aud.rest.service.model.objects.AudRegistry;
import ru.acs.fts.aud.rest.service.model.objects.AudRegistryDoc;
import ru.acs.fts.aud.rest.service.model.objects.AudRegistryResult;
import ru.acs.fts.aud.rest.service.model.objects.AudResponseMetadata;
import ru.acs.fts.aud.rest.service.model.objects.AudResultInfo;
import ru.acs.fts.schemas.aud.aud_error.AUDErrorType;
import ru.acs.fts.schemas.aud.aud_error.EmbeddedDocumentResultInfoType;
import ru.acs.fts.schemas.aud.aud_putdocumentresponse.AUDPutDocumentResponseType;
import ru.acs.fts.schemas.aud.aud_registryresponse.AUDRegistryResponseType;
import ru.acs.fts.schemas.aud.aud_registryresponse.RegistryPacketInfoType;
import ru.acs.fts.schemas.aud.aud_registryresponse.RegistryRowType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDBaseEnvelopeType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDEmbeddedDocumentArchiveInfoType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDResultInfoType;
import ru.acs.fts.schemas.aud.audinf.AUDInfType;
import ru.acs.fts.schemas.envelope.ApplicationInfType;
import ru.acs.fts.schemas.envelope.EnvelopeType;
import ru.acs.fts.schemas.envelope.RoutingInfType;

public class AudMessageMapper
{
	private static final int DEFAULT_AUD_CUSTOMS_CODE = 0;
	
	public static AudMessage mapSentAudMessage( AUDBaseEnvelopeType audEnvelope, byte[ ] document, EnvelopeType envelope ) 
		throws UnsupportedEncodingException
	{
		AudMessage msg = new AudMessage( );
		
		msg.setDocumentId( audEnvelope.getDocumentID( ) );
		msg.setSendDate( new DateTime( ) );
		msg.setRecvDate( null );

		mapAudInf( msg, envelope );
		mapRoutingInf( msg, envelope );
		mapApplicationInf( msg, envelope );

		msg.setDocument( Base64Coder.encodeAsString( document, "UTF-8" ) );
		
		return msg;
	}
	
	public static AudMessage mapRecvAudMessage( AUDBaseEnvelopeType audEnvelope, byte[ ] document, EnvelopeType envelope ) 
		throws UnsupportedEncodingException
	{
		AudMessage msg = new AudMessage( );
		
		msg.setDocumentId( audEnvelope.getDocumentID( ) );
		msg.setSendDate( null );
		msg.setRecvDate( new DateTime( ) );
		
		mapAudInf( msg, envelope );
		mapRoutingInf( msg, envelope );
		mapApplicationInf( msg, envelope );
		
		msg.setDocument( Base64Coder.encodeAsString( document, "UTF-8" ) );
		
		return msg;
	}
	
	public static AudResponseMetadata mapMetadata( AUDBaseEnvelopeType audEnvelope, byte[ ] document, EnvelopeType envelope )
	{
		AudResponseMetadata metadata = new AudResponseMetadata( );
		
		metadata.setDocumentType( audEnvelope.getClass( ).getSimpleName( ) );
		
		Map< String, String > context = new HashMap< String, String >( );
		metadata.setContext( context );
		
		if ( audEnvelope instanceof AUDRegistryResponseType )
			metadata.setAudRegistry( mapAudRegistry( ( AUDRegistryResponseType )audEnvelope ) );
		else
			metadata.setAudRegistry( null );
		
		if ( audEnvelope instanceof AUDPutDocumentResponseType )
			metadata.setAudPutDocumentResponse( mapAudPutDocumentResponse( ( AUDPutDocumentResponseType )audEnvelope ) );
		else
			metadata.setAudPutDocumentResponse( null );
		
		if ( audEnvelope instanceof AUDErrorType )
			metadata.setAudError( mapAudError( ( AUDErrorType )audEnvelope ) );
		else
			metadata.setAudError( null );
		
		return metadata;
	}
	
	private static void mapAudInf( AudMessage msg, EnvelopeType envelope )
	{
		for ( Object obj : envelope.getHeader( ).getAnyList( ) )
		{
			if ( ! ( obj instanceof AUDInfType ) )
				continue;
			
			AUDInfType audInf = ( AUDInfType )obj;
			
			if ( null != audInf.getCustomsCode( ) )
				msg.setCustomsCode( Integer.parseInt( audInf.getCustomsCode( ) ) );
			else
				msg.setCustomsCode( DEFAULT_AUD_CUSTOMS_CODE );
			
			msg.setArchiveClientId( audInf.getArchiveClientId( ) );
		}		
	}
		
	private static void mapRoutingInf( AudMessage msg, EnvelopeType envelope )
	{
		for ( Object obj : envelope.getHeader( ).getAnyList( ) )
		{
			if ( ! ( obj instanceof RoutingInfType ) )
				continue;
			
			RoutingInfType rInfo = ( RoutingInfType )obj;
			
			if ( null != rInfo.getReceiverInformationList( ) && 0 != rInfo.getReceiverInformationList( ).size( ) )
				msg.setReceiverInformation( rInfo.getReceiverInformationList( ).get( 0 ) );
			else
				msg.setReceiverInformation( null );
			
			msg.setSenderInformation( rInfo.getSenderInformation( ) );
			msg.setEnvelopeId( rInfo.getEnvelopeID( ) );
			msg.setInitialEnvelopeId( rInfo.getInitialEnvelopeID( ) );
			msg.setIncomeEnvelopeId( null );
			msg.setPreparationDateTime( rInfo.getPreparationDateTime( ) );
		}
	}
	
	private static void mapApplicationInf( AudMessage msg, EnvelopeType envelope )
	{
		for ( Object obj : envelope.getHeader( ).getAnyList( ) )
		{
			if ( ! ( obj instanceof ApplicationInfType ) )
				continue;
			
			ApplicationInfType appInfo = ( ApplicationInfType )obj;
			
			msg.setSoftKind( appInfo.getSoftKind( ) );
			msg.setSoftVersion( appInfo.getSoftVersion( ) );
			msg.setMessageKind( appInfo.getMessageKind( ) );
		}
	}
	
	private static AudRegistry mapAudRegistry( AUDRegistryResponseType audEnvelope )
	{
		AudRegistry registry = new AudRegistry( );

		registry.setNullFlag( audEnvelope.isNullFlag( ) ? 1 : 0 );
		
		List< AudRegistryResult > results = new ArrayList< AudRegistryResult >( );
		registry.setResults( results );
		
		if ( null != audEnvelope.getAUDPacketRegistryRowList( ) )
		{
			for ( RegistryPacketInfoType rpit : audEnvelope.getAUDPacketRegistryRowList( ) )
			{
				AudRegistryResult arr = new AudRegistryResult( );
				results.add( arr );
				
				arr.setAppPacketDescription( rpit.getAppliedPacketInfo( ).getDescription( ) );
				arr.setAppPacketId( rpit.getAppliedPacketInfo( ).getAppliedPacketId( ) );
				arr.setArchPacketId( rpit.getArchivePacketId( ) );
				arr.setPacketType( rpit.getAppliedPacketInfo( ).getAppliedPacketType( ) );
				arr.setPacketPutDateTime( rpit.getPutDateTime( ) );
				
				if ( rpit.getAppliedPacketInfo( ).getAUDGTDIDList( ).size( ) > 0 )
				{
					arr.setGtdIdCustomsCode( rpit.getAppliedPacketInfo( ).getAUDGTDIDList( ).get( 0 ).getCustomsCode( ) );
					arr.setGtdIdRegNumber( rpit.getAppliedPacketInfo( ).getAUDGTDIDList( ).get( 0 ).getGTDNumber( ) );
					arr.setGtdIdRegDate( rpit.getAppliedPacketInfo( ).getAUDGTDIDList( ).get( 0 ).getRegistrationDate( ) );
				}
				
				List< AudRegistryDoc > docs = new ArrayList< AudRegistryDoc >( );
				arr.setDocs( docs );

				if ( null != rpit.getRegistryRowList( ) )
				{
					for ( RegistryRowType rrt : rpit.getRegistryRowList( ) )
					{
						AudRegistryDoc ard = new AudRegistryDoc( );
						docs.add( ard );
						
						ard.setActualFlag( rrt.isIsActualDocumentIndicator( ) ? 1 : 0 );
						ard.setAppDocDescr( rrt.getAppliedDocInfo( ).getDescription( ) );
						ard.setAppDocumentId( rrt.getAppliedDocInfo( ).getAppliedDocumentId( ) );
						ard.setAppDocumentModeId( rrt.getAppliedDocInfo( ).getDocumentKindVersionIdInfoOpt( ).getAppliedDocumentKindId( ) );
						ard.setArchPacketId( rpit.getArchivePacketId( ) );
						ard.setArchRefMainDoc( rrt.getArchiveContainerDocumentId( ) );
						ard.setArchDocumentId( rrt.getArchiveDocInfo( ).getArchiveDocumentId( ) );
						ard.setArchVersion( rrt.getArchiveDocInfo( ).getDocumentVersionNumber( ).intValue( ) );
					}
				}
			}
		}
		
		return registry;
	}
	
	private static AudPutDocumentResponse mapAudPutDocumentResponse( AUDPutDocumentResponseType doc )
	{
		AudPutDocumentResponse res = new AudPutDocumentResponse( );
		
		res.setArchiveDocumentId( doc.getArchiveDocumentInfo( ).getArchiveDocumentIdWithVersion( ).getArchiveDocumentId( ) );
		res.setDocumentVersion( doc.getArchiveDocumentInfo( ).getArchiveDocumentIdWithVersion( ).getDocumentVersionNumber( ).intValue( ) );
		res.setArchiveDocumentPutDateTime( doc.getArchiveDocumentInfo( ).getPutDateTime( ) );
		
		res.setArchivePacketId( doc.getArchivePacketInfo( ).getArchivePacketId( ) );
		res.setArchivePacketPutDateTime( doc.getArchivePacketInfo( ).getPutDateTime( ) );

		res.setDocumentId( doc.getDocumentID( ) );
		res.setRefDocumentId( doc.getRefDocumentID( ) );
		res.setDocumentModeId( doc.getDocumentModeID( ) );
		res.setDocumentDateTime( doc.getDocumentDateTime( ) );
		
		List< AudEmbeddedDocumentArchiveInfo > embeddedDocInfos = new ArrayList< AudEmbeddedDocumentArchiveInfo >( );
		res.setEmbeddedDocumentInfos( embeddedDocInfos );

		if ( null != doc.getEmbeddedDocumentArchiveInfoList( ) && 0 != doc.getEmbeddedDocumentArchiveInfoList( ).size( ) )
		{
			for ( AUDEmbeddedDocumentArchiveInfoType edait : doc.getEmbeddedDocumentArchiveInfoList( ) )
			{
				AudEmbeddedDocumentArchiveInfo edai = new AudEmbeddedDocumentArchiveInfo( );
				embeddedDocInfos.add( edai );
				
				edai.setAppliedDocumentId( edait.getAppliedDocumentId( ) );
				edai.setArchiveDocumentId( edait.getArchiveDocumentIdWithVersion( ).getArchiveDocumentId( ) );
				edai.setDocumentVersion( edait.getArchiveDocumentIdWithVersion( ).getDocumentVersionNumber( ).intValue( ) );
			}
		}
		
		return res;
	}
	
	private static AudError mapAudError( AUDErrorType doc )
	{
		AudError res = new AudError( );
		
		res.setDocumentId( doc.getDocumentID( ) );
		res.setRefDocumentId( doc.getRefDocumentID( ) );
		res.setDocumentDateTime( doc.getDocumentDateTime( ) );
		res.setDocumentModeId( doc.getDocumentModeID( ) );
		
		List< AudResultInfo > resultInfos = new ArrayList< AudResultInfo >( );
		res.setResultInfos( resultInfos );

		if ( null != doc.getResultInfoList( ) && 0 != doc.getResultInfoList( ).size( ) )
		{
			for ( AUDResultInfoType rit : doc.getResultInfoList( ) )
			{
				AudResultInfo ri = new AudResultInfo( );
				resultInfos.add( ri );
				
				ri.setResultCode( rit.getResultCode( ) );
				ri.setDescription( rit.getDescription( ) );
			}
		}
		
		List< AudEmbeddedDocumentResultInfo > embeddedDocsResultInfos = new ArrayList< AudEmbeddedDocumentResultInfo >( );
		res.setEmbeddedDocsResultInfos( embeddedDocsResultInfos );

		if ( null != doc.getEmbeddedDocumentResultInfoList( ) && 0 != doc.getEmbeddedDocumentResultInfoList( ).size( ) )
		{
			for ( EmbeddedDocumentResultInfoType edrit : doc.getEmbeddedDocumentResultInfoList( ) )
			{
				AudEmbeddedDocumentResultInfo edri = new AudEmbeddedDocumentResultInfo( );
				embeddedDocsResultInfos.add( edri );
				
				edri.setAppliedDocumentId( edrit.getAppliedDocumentId( ) );
				
				List< AudResultInfo > edResultInfos = new ArrayList< AudResultInfo >( );
				edri.setResultInfos( edResultInfos );

				if ( null == edrit.getResultInfoList( ) && 0 != edrit.getResultInfoList( ).size( ) )
				{
					for ( AUDResultInfoType rit : edrit.getResultInfoList( ) )
					{
						AudResultInfo ri = new AudResultInfo( );
						edResultInfos.add( ri );
						
						ri.setResultCode( rit.getResultCode( ) );
						ri.setDescription( rit.getDescription( ) );
					}
				}
			}
		}
		
		return res;
	}
}
