package ru.acs.fts.eps2.router.processing.helpers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.oxm.Unmarshaller;

import ru.acs.fts.custommarshaller.EnvelopeUnmarshaller;
import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.data.kind.DocumentModeIDs;
import ru.acs.fts.eps2.model.entities.Edecl_Errlist;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
import ru.acs.fts.eps2.model.entities.ExtEadManifest;
import ru.acs.fts.eps2.model.services.ErrListService;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.objects.EDDocument;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.ead.EadRequest;
import ru.acs.fts.eps2.router.processing.ead.EadRequest2Results;
import ru.acs.fts.eps2.router.processing.ead.EadResponse;
import ru.acs.fts.eps2.router.processing.ead.mappers.EadToTransportMapper;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.util.helpers.UUIDGen;
import ru.acs.fts.schemas.album.checkinventory.CheckInventoryType;
import ru.acs.fts.schemas.album.checkinventory.InventDocumentType;
import ru.acs.fts.schemas.album.checkinventory.InventoryInstanceType;
import ru.acs.fts.schemas.album.responsecheckinventory.InvCheckResultType;
import ru.acs.fts.schemas.album.responsecheckinventory.ResponseCheckInventoryType;
import ru.acs.fts.schemas.envelope.EDHeaderType;
import ru.acs.fts.schemas.envelope.RoutingInfType;

public class Msg11044Helper
{
	public static EDEnvelope makeMsg11045(
			CheckInventoryType checkInventory,
			EadRequest2Results results,
			EDJobBatchContext jobBatchContext ) 
		throws BaseProcessingException, DatabaseException 
	{
		ResponseCheckInventoryType rsit = new ResponseCheckInventoryType( );
		
		rsit.setDocumentID( UUIDGen.getUUID( ).toString( ) );
		rsit.setRefDocumentID( checkInventory.getDocumentID( ) );
		rsit.setDocumentModeID( DocumentModeIDs.RESPONSE_CHECK_INVENTORY );		
		
		rsit.setInventoryID( checkInventory.getInventoryID( ) );
		
		Map< EadRequest, EadResponse > mappings = results.getMappings( );
		
		List< InvCheckResultType > invCheckResults = new ArrayList< InvCheckResultType >( );
		rsit.setCheckResultList( invCheckResults );
		
		ErrListService errSrv = jobBatchContext.getServiceHolder( ).getErrListService( );
		
		for ( EadRequest request : mappings.keySet( ) )
		{
			InventDocumentType idoc = getInventoryDoc( checkInventory, request.getLineId( ) );
			if ( null == idoc )
				continue;

			EadResponse response = mappings.get( request );
			
			InvCheckResultType icr = new InvCheckResultType( );
			icr.setInvDocCode( idoc.getInvDocCode( ) );
			icr.setInvDocName( idoc.getInvDocName( ) );
			icr.setInvDocNumber( idoc.getInvDocNumber( ) );
			icr.setInvDocDate( idoc.getInvDocDate( ) );
			
			// icr.setRecordNumber( idoc.getRecordNumber( ) );
			
			icr.setArchID( idoc.getArchID( ) );
			icr.setArchDocID( idoc.getArchDocID( ) );
			icr.setInventDocumentID( idoc.getInventDocumentID( ) );
			icr.setInventLineID( idoc.getInventLineID( ) );
			
			icr.setCheckResultCode( response.getResultCode( ) );
			
			Edecl_Errlist errList = errSrv.getErrList( icr.getCheckResultCode( ) );
			icr.setCheckResultDesc( null != errList ? errList.getPublicDescription( ) : "" );
			
			invCheckResults.add( icr );
		}

		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		EDDocument rdoc = new EDDocument( rsit );
		
		EDEnvelope message2customs = EadToTransportMapper.makeEnvelope( 
			MessageType.MSG_11045, rdoc, 
			BusinessSystems.CUSTOMS, jobBatchContext 
		);
						
		message2customs.setInitialEnvelopeID( recvEnv.getEnvelopeID( ) );
		
		EDHeaderType edHeader = message2customs.getEDHeader( );
		edHeader.setSenderCustoms( null );
		edHeader.setReceiverCustoms( recvEnv.getSenderCustoms( ) );
						
		return message2customs;		
	}
	
	public static EDEnvelope makeMsg11045(
			Edecl_Msg_Doc checkInventoryDb,
			List< ExtEadManifest > results, 
			EDJobBatchContext jobBatchContext ) 
		throws Exception
	{
		EnvelopeUnmarshaller envUnmarshaller = new EnvelopeUnmarshaller( );
		Unmarshaller unmarshaller = jobBatchContext.getServiceHolder( ).getUnmarshaller( );

		Object doc = null;
		
		try
		{
			doc = envUnmarshaller.unmarshallBaseDocOrSignature( 
				checkInventoryDb.getBody( ), 
				unmarshaller 
			);
		}
		catch ( Exception exc )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._09_96669_99, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
		
		EDDocument xdoc = new EDDocument( doc );
		
		CheckInventoryType checkInventory = xdoc.getDocumentAsClass( CheckInventoryType.class ); 
		
		ResponseCheckInventoryType rsit = new ResponseCheckInventoryType( );
		
		rsit.setDocumentID( UUIDGen.getUUID( ).toString( ) );
		rsit.setRefDocumentID( checkInventory.getDocumentID( ) );
		rsit.setDocumentModeID( DocumentModeIDs.RESPONSE_CHECK_INVENTORY );		
		
		rsit.setInventoryID( checkInventory.getInventoryID( ) );
				
		List< InvCheckResultType > invCheckResults = new ArrayList< InvCheckResultType >( );
		rsit.setCheckResultList( invCheckResults );
		
		ErrListService errSrv = jobBatchContext.getServiceHolder( ).getErrListService( );
		
		for ( ExtEadManifest mf : results )
		{
			InventDocumentType idoc = getInventoryDoc( checkInventory, mf.getRequestLineId( ) ); 
			if ( null == idoc )
				continue;

			InvCheckResultType icr = new InvCheckResultType( );
			icr.setInvDocCode( idoc.getInvDocCode( ) );
			icr.setInvDocName( idoc.getInvDocName( ) );
			icr.setInvDocNumber( idoc.getInvDocNumber( ) );
			icr.setInvDocDate( idoc.getInvDocDate( ) );
			
			// icr.setRecordNumber( idoc.getRecordNumber( ) );
			
			icr.setArchID( idoc.getArchID( ) );
			icr.setArchDocID( idoc.getArchDocID( ) );
			icr.setInventDocumentID( idoc.getInventDocumentID( ) );
			icr.setInventLineID( idoc.getInventLineID( ) );
			
			icr.setCheckResultCode( mf.getResultCode( ) ); 
			
			Edecl_Errlist errList = errSrv.getErrList( icr.getCheckResultCode( ) );
			icr.setCheckResultDesc( null != errList ? errList.getPublicDescription( ) : "" );
			
			invCheckResults.add( icr );
		}
		
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		EDDocument rdoc = new EDDocument( rsit );

		EDEnvelope message2customs = EadToTransportMapper.makeEnvelope( 
			MessageType.MSG_11045, rdoc, 
			BusinessSystems.CUSTOMS, jobBatchContext 
		);
		
		message2customs.setInitialEnvelopeID( results.get( 0 ).getRequestEnvelopeId( ) );
		
		EDHeaderType edHeader = message2customs.getEDHeader( );
		edHeader.setSenderCustoms( null );
		edHeader.setReceiverCustoms( recvEnv.getReceiverCustoms( ) );
		
		RoutingInfType rInfo = message2customs.getRoutingInfo( );
		rInfo.setSenderInformation( EnvelopeCreator.getSenderInformation( 
			BusinessSystems.CUSTOMS, recvEnv.getReceiverCustoms( ), 
			recvEnv.getParticipantID( ) 
		) );
		rInfo.setReceiverInformationList( EnvelopeCreator.getReceiverInformation( 
			BusinessSystems.CUSTOMS, recvEnv.getReceiverCustoms( ), 
			recvEnv.getParticipantID( ) 
		) );
						
		return message2customs;
		
	}	
	
	private static InventDocumentType getInventoryDoc( 
			CheckInventoryType checkInventory, String lineId )
	{
		InventoryInstanceType invInstance = checkInventory.getInventoryInstance( );
		for ( InventDocumentType idoc : invInstance.getInventDocumentList( ) )
		{
			if ( idoc.getInventLineID( ).equalsIgnoreCase( lineId ) )
				return idoc;
		}
		
		return null;
	}
	
}
