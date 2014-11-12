package ru.acs.fts.eps2.router.processing.helpers;

import java.util.ArrayList;
import java.util.List;

import ru.acs.fts.custommarshaller.EnvelopeUnmarshaller;
import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.model.entities.Edecl_G44_Docmodid;
import ru.acs.fts.eps2.model.entities.Edecl_Messages;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.objects.EDDocument;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.ead.mappers.EadToTransportMapper;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.util.helpers.UUIDGen;
import ru.acs.fts.schemas.album.reqinventorydoc.ReqInventoryDocType;
import ru.acs.fts.schemas.album.reqinventorydoc.RequestedDocType;
import ru.acs.fts.schemas.envelope.CustomsType;
import ru.acs.fts.schemas.envelope.EDHeaderType;
import ru.acs.fts.schemas.envelope.SignatureType;

public class Msg11003Helper
{
	public static EDEnvelope makeEd11003( 
			ReqInventoryDocType reqInventoryDoc,
			List< String > failedLineIds,
			EDJobBatchContext jobBatchContext ) 
		throws BaseProcessingException, IllegalStateException, DatabaseException
	{
		ReqInventoryDocType declDocRequest = new ReqInventoryDocType( );
		declDocRequest.setCommunicationList( reqInventoryDoc.getCommunicationList( ) );
		declDocRequest.setCustoms( reqInventoryDoc.getCustoms( ) );
		declDocRequest.setCustomsPerson( reqInventoryDoc.getCustomsPerson( ) );
		declDocRequest.setDateLimit( reqInventoryDoc.getDateLimit( ) );
		declDocRequest.setDocumentID( UUIDGen.getUUID( ).toString( ) );
		declDocRequest.setDocumentModeID( reqInventoryDoc.getDocumentModeID( ) );
		declDocRequest.setGTDNumber( reqInventoryDoc.getGTDNumber( ) );
		declDocRequest.setOEZRegistrationNumber( reqInventoryDoc.getOEZRegistrationNumber( ) );
		declDocRequest.setRefDocumentID( reqInventoryDoc.getRefDocumentID( ) );
		declDocRequest.setRequestDate( reqInventoryDoc.getRequestDate( ) );
		declDocRequest.setRequestNumber( reqInventoryDoc.getRequestNumber( ) );
		declDocRequest.setRequestTime( reqInventoryDoc.getRequestTime( ) );
		declDocRequest.setSendDate( reqInventoryDoc.getSendDate( ) );
		declDocRequest.setSendTime( reqInventoryDoc.getSendTime( ) );
		declDocRequest.setDocSign( reqInventoryDoc.getDocSign( ) );

		List< RequestedDocType > docs = new ArrayList< RequestedDocType >( );
		for ( RequestedDocType rdoc : reqInventoryDoc.getRequestedDocList( ) )
		{
			if ( failedLineIds.contains( rdoc.getRequestPositionID( ) ) )
			{
				docs.add( rdoc );
			}
		}
		declDocRequest.setRequestedDocList( docs );
		
		EDDocument rdoc = new EDDocument( declDocRequest );

		EDEnvelope message2decl = EadToTransportMapper.makeEnvelope( 
			MessageType.ED_11003, rdoc, 
			BusinessSystems.DECLARANT, jobBatchContext 
		);
		
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );

		message2decl.setInitialEnvelopeID( null );
		message2decl.setIncomeEnvelopeID( recvEnv.getEnvelopeID( ) );		
		
		EDHeaderType edHeader = message2decl.getEDHeader( );
		edHeader.setSenderCustoms( recvEnv.getSenderCustoms( ) );
		edHeader.setReceiverCustoms( null );
						
		return message2decl;
	}

	public static EDEnvelope makeEd11003( 
			Edecl_Messages reqInventoryDocDb,
			List< String > failedLineIds,
			EDJobBatchContext jobBatchContext ) 
		throws BaseProcessingException, IllegalStateException, DatabaseException
	{
		String documentId = reqInventoryDocDb.getDocumentId( );
		
		Edecl_Msg_Doc dbDoc = jobBatchContext.getServiceHolder( )
			.getEnvelopeService( ).getDocument( documentId );
		if ( null == dbDoc )
			throw new IllegalStateException( "" );
		
		EnvelopeUnmarshaller envUnmarshaller = new EnvelopeUnmarshaller( );
		Object doc = null;
		try
		{
			doc = envUnmarshaller.unmarshallBaseDocOrSignature( 
				dbDoc.getBody( ), 
				jobBatchContext.getServiceHolder( ).getUnmarshaller( ) 
			);
		}
		catch ( Exception e )
		{
			throw new IllegalStateException( "", e );
		}
		
		if ( doc instanceof SignatureType )
		{
			SignatureType sig = ( SignatureType )doc;
			doc = sig.getObject( ).getAny( );
		}
		if ( ! ( doc instanceof ReqInventoryDocType ) )
			throw new IllegalStateException( "" );
		
		ReqInventoryDocType reqInventoryDoc = ( ReqInventoryDocType )doc;
		
		ReqInventoryDocType declDocRequest = new ReqInventoryDocType( );
		declDocRequest.setCommunicationList( reqInventoryDoc.getCommunicationList( ) );
		declDocRequest.setCustoms( reqInventoryDoc.getCustoms( ) );
		declDocRequest.setCustomsPerson( reqInventoryDoc.getCustomsPerson( ) );
		declDocRequest.setDateLimit( reqInventoryDoc.getDateLimit( ) );
		declDocRequest.setDocumentID( UUIDGen.getUUID( ).toString( ) );
		declDocRequest.setDocumentModeID( reqInventoryDoc.getDocumentModeID( ) );
		declDocRequest.setGTDNumber( reqInventoryDoc.getGTDNumber( ) );
		declDocRequest.setOEZRegistrationNumber( reqInventoryDoc.getOEZRegistrationNumber( ) );
		declDocRequest.setRefDocumentID( reqInventoryDoc.getRefDocumentID( ) );
		declDocRequest.setRequestDate( reqInventoryDoc.getRequestDate( ) );
		declDocRequest.setRequestNumber( reqInventoryDoc.getRequestNumber( ) );
		declDocRequest.setRequestTime( reqInventoryDoc.getRequestTime( ) );
		declDocRequest.setSendDate( reqInventoryDoc.getSendDate( ) );
		declDocRequest.setSendTime( reqInventoryDoc.getSendTime( ) );
		declDocRequest.setDocSign( reqInventoryDoc.getDocSign( ) );

		List< RequestedDocType > docs = new ArrayList< RequestedDocType >( );
		for ( RequestedDocType rdoc : reqInventoryDoc.getRequestedDocList( ) )
		{
			if ( failedLineIds.contains( rdoc.getRequestPositionID( ) ) )
			{
				docs.add( rdoc );
			}
		}
		declDocRequest.setRequestedDocList( docs );
		
		EDDocument rdoc = new EDDocument( declDocRequest );

		EDEnvelope message2decl = EadToTransportMapper.makeEnvelope( 
			MessageType.ED_11003, rdoc, 
			BusinessSystems.DECLARANT, jobBatchContext 
		);

		message2decl.setInitialEnvelopeID( null );
		message2decl.setIncomeEnvelopeID( reqInventoryDocDb.getEnvelopeId( ) );
		
		CustomsType senderCustoms = new CustomsType( );
		senderCustoms.setCustomsCode( Integer.toString( reqInventoryDocDb.getSenderCustomCode( ) ) );
		senderCustoms.setExchType( Integer.toString( reqInventoryDocDb.getSenderExchangeType( ) ) );
		
		EDHeaderType edHeader = message2decl.getEDHeader( );
		edHeader.setSenderCustoms( senderCustoms );
		edHeader.setReceiverCustoms( null );
				
		return message2decl;
	}
	
	public static boolean g44Check( 
			String docCode, String documentModeId, 
			EDJobBatchContext jobBatchContext ) 
		throws DatabaseException
	{
		Edecl_G44_Docmodid g44rel = jobBatchContext.getServiceHolder( ).getG44Service( ).getG44Relation( docCode, documentModeId );
		return ( null != g44rel );
	}	
}
