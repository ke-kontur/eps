package ru.acs.fts.eps2.router.processing.ead.processing;

import java.util.ArrayList;
import java.util.List;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edecl_Messages;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
import ru.acs.fts.eps2.model.entities.ExtEadManifest;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.objects.EDDocument;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.ead.mappers.EadToTransportMapper;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.router.processing.helpers.Msg11044Helper;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.schemas.envelope.CustomsType;
import ru.acs.fts.schemas.envelope.EDHeaderType;
import ru.acs.fts.schemas.envelope.RoutingInfType;

public class MSG11044ManifestCompleteProcessor extends ManifestCompletedProcessor
{
	public void process( 
			List< ExtEadManifest > manifests, 
			EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws BaseProcessingException, DatabaseException 
	{
		List< EDEnvelope > envelopes = new ArrayList< EDEnvelope >( );
		String envelopeName = jobContext.getString( ContextConstants.ENVELOPE_NAME );
		jobBatchContext.put( envelopeName, envelopes );
		
		if ( 0 == manifests.size( ) )
			return ;
		
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		boolean isAllFailed = true;
		
		for ( ExtEadManifest mf : manifests )
		{
			if ( mf.getResultCode( ).equalsIgnoreCase( ResultCodes._00_00000_00 ) )
				isAllFailed = false;
		}

		if ( isAllFailed )
		{
			EDDocument res = EadToTransportMapper.createErrorDocument( 
				manifests, 
				jobBatchContext.getServiceHolder( ) 
			);
			
			EDEnvelope respEnvelope = EadToTransportMapper.makeEnvelope( 
				MessageType.CMN_00001, res, 
				BusinessSystems.CUSTOMS, jobBatchContext 
			);
				
			respEnvelope.setInitialEnvelopeID( manifests.get( 0 ).getRequestEnvelopeId( ) );
			
			CustomsType senderCustoms = null;
			CustomsType receiverCustoms = recvEnv.getReceiverCustoms( );
			
			Edecl_Messages initialMsg = jobBatchContext.getServiceHolder( ).getEnvelopeService( )
					.getEnvelope( manifests.get( 0 ).getRequestEnvelopeId( ) );
				
			if ( null != initialMsg )
			{
				if ( null != initialMsg.getSenderCustomCode( ) && null != initialMsg.getSenderExchangeType( ) )
				{
					senderCustoms = null;
					receiverCustoms = new CustomsType( );
					receiverCustoms.setCustomsCode( Integer.toString( initialMsg.getSenderCustomCode( ) ) );
					receiverCustoms.setExchType( Integer.toString( initialMsg.getSenderExchangeType( ) ) );
				}
				else if ( null != initialMsg.getRcvCustomCode( ) && null != initialMsg.getRcvExchangeType( ) )
				{
					receiverCustoms = null;
					senderCustoms = new CustomsType( );
					senderCustoms.setCustomsCode( Integer.toString( initialMsg.getRcvCustomCode( ) ) );
					senderCustoms.setExchType( Integer.toString( initialMsg.getRcvExchangeType( ) ) );
				}
			}
						
			EDHeaderType edHeader = respEnvelope.getEDHeader( );
			edHeader.setSenderCustoms( senderCustoms );
			edHeader.setReceiverCustoms( receiverCustoms );
			
			RoutingInfType rInfo = respEnvelope.getRoutingInfo( );
			rInfo.setSenderInformation( EnvelopeCreator.getSenderInformation( 
				BusinessSystems.CUSTOMS, receiverCustoms, 
				recvEnv.getParticipantID( ) 
			) );
			rInfo.setReceiverInformationList( EnvelopeCreator.getReceiverInformation( 
				BusinessSystems.CUSTOMS, receiverCustoms, 
				recvEnv.getParticipantID( ) 
			) );
				
			envelopes.add( respEnvelope );
				
			return ;			
		}
		
		String requestDocumentId = manifests.get( 0 ).getRequestDocumentId( );
		
		Edecl_Msg_Doc checkInventoryDb = jobBatchContext.getServiceHolder( )
			.getEnvelopeService( ).getDocument( requestDocumentId );
		
		try
		{
			EDEnvelope respEnvelope = Msg11044Helper.makeMsg11045( checkInventoryDb, manifests, jobBatchContext );
			envelopes.add( respEnvelope );
		}
		catch ( Exception exc )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._09_96669_99, 
				ProcessingConstants.ERROR_TYPE_BUSINESS
			);
		}
	}

}
