package ru.acs.fts.eps2.router.processing.helpers;

import java.util.ArrayList;
import java.util.List;

import ru.acs.fts.custommarshaller.EnvelopeUnmarshaller;
import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.model.entities.Edecl_Messages;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.objects.EDDocument;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.ead.mappers.EadToTransportMapper;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.util.helpers.UUIDGen;
import ru.acs.fts.schemas.album.reqcustprocessinginvent.ReqCustProcessingInventType;
import ru.acs.fts.schemas.album.reqcustprocessinginvent.RequestedDocType;
import ru.acs.fts.schemas.envelope.CustomsType;
import ru.acs.fts.schemas.envelope.EDHeaderType;
import ru.acs.fts.schemas.envelope.SignatureType;

public class Cmn10009Helper
{
	public static EDEnvelope makeCmn10009( 
			ReqCustProcessingInventType reqInventoryDoc,
			List< String > failedLineIds,
			EDJobBatchContext jobBatchContext ) 
		throws BaseProcessingException, IllegalStateException, DatabaseException
	{
		ReqCustProcessingInventType declDocRequest = new ReqCustProcessingInventType( );
		declDocRequest.setCustoms( reqInventoryDoc.getCustoms( ) );
		declDocRequest.setCustomsPerson( reqInventoryDoc.getCustomsPerson( ) );
		declDocRequest.setDateLimit( reqInventoryDoc.getDateLimit( ) );
		declDocRequest.setDocumentID( UUIDGen.getUUID( ).toString( ) );
		declDocRequest.setDocumentModeID( reqInventoryDoc.getDocumentModeID( ) );
		declDocRequest.setRefDocumentID( reqInventoryDoc.getRefDocumentID( ) );
		declDocRequest.setRequestDate( reqInventoryDoc.getRequestDate( ) );
		declDocRequest.setRequestTime( reqInventoryDoc.getRequestTime( ) );
		declDocRequest.setSendDate( reqInventoryDoc.getSendDate( ) );
		declDocRequest.setSendTime( reqInventoryDoc.getSendTime( ) );
		
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
			MessageType.CMN_10009, rdoc, 
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

	public static EDEnvelope makeCmn10009( 
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
		if ( ! ( doc instanceof ReqCustProcessingInventType ) )
			throw new IllegalStateException( "" );
		
		ReqCustProcessingInventType reqInventoryDoc = ( ReqCustProcessingInventType )doc;
		
		ReqCustProcessingInventType declDocRequest = new ReqCustProcessingInventType( );
		declDocRequest.setCustoms( reqInventoryDoc.getCustoms( ) );
		declDocRequest.setCustomsPerson( reqInventoryDoc.getCustomsPerson( ) );
		declDocRequest.setDateLimit( reqInventoryDoc.getDateLimit( ) );
		declDocRequest.setDocumentID( UUIDGen.getUUID( ).toString( ) );
		declDocRequest.setDocumentModeID( reqInventoryDoc.getDocumentModeID( ) );
		declDocRequest.setRefDocumentID( reqInventoryDoc.getRefDocumentID( ) );
		declDocRequest.setRequestDate( reqInventoryDoc.getRequestDate( ) );
		declDocRequest.setRequestTime( reqInventoryDoc.getRequestTime( ) );
		declDocRequest.setSendDate( reqInventoryDoc.getSendDate( ) );
		declDocRequest.setSendTime( reqInventoryDoc.getSendTime( ) );
		
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
			MessageType.CMN_10009, rdoc, 
			BusinessSystems.DECLARANT, jobBatchContext 
		);
		
		message2decl.setInitialEnvelopeID( null );
		
		CustomsType senderCustoms = new CustomsType( );
		senderCustoms.setCustomsCode( Integer.toString( reqInventoryDocDb.getSenderCustomCode( ) ) );
		senderCustoms.setExchType( Integer.toString( reqInventoryDocDb.getSenderExchangeType( ) ) );
		
		EDHeaderType edHeader = message2decl.getEDHeader( );
		edHeader.setSenderCustoms( senderCustoms );
		edHeader.setReceiverCustoms( null );
		
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		message2decl.setIncomeEnvelopeID( recvEnv.getEnvelopeID( ) );
				
		return message2decl;
	}
}
