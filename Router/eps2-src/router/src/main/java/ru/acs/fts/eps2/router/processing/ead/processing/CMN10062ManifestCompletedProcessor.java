package ru.acs.fts.eps2.router.processing.ead.processing;

import java.util.ArrayList;
import java.util.List;

import org.springframework.oxm.Unmarshaller;

import ru.acs.fts.custommarshaller.EnvelopeUnmarshaller;
import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.helpers.CryptoHelper;
import ru.acs.fts.eps2.model.entities.Edecl_Messages;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
import ru.acs.fts.eps2.model.entities.ExtEadManifest;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.objects.EDDocument;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.objects.defines.DocumentSaveTypes;
import ru.acs.fts.eps2.router.objects.defines.DocumentUniquenesses;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.ead.mappers.EadToTransportMapper;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.schemas.envelope.CustomsType;

public class CMN10062ManifestCompletedProcessor extends ManifestCompletedProcessor
{

	@Override
	public void process( 
			List< ExtEadManifest > manifests, 
			EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws BaseProcessingException, DatabaseException 
	{
		List< EDEnvelope > envelopes = new ArrayList< EDEnvelope >( );
		String envelopeName = jobContext.getString( ContextConstants.ENVELOPE_NAME );
		jobBatchContext.put( envelopeName, envelopes );
		
		if ( null == manifests || 0 == manifests.size( ) )
			return ;
		
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		if ( ! isAllDocumentsFound( manifests ) )
		{
			EDDocument resDocument = EadToTransportMapper.createErrorDocument( 
				manifests, 
				jobBatchContext.getServiceHolder( ) 
			);
			 
			EDEnvelope respEnvelope = EadToTransportMapper.makeEnvelope( 
				MessageType.CMN_00001, resDocument, 
				BusinessSystems.DECLARANT, jobBatchContext 
			);
			
			Edecl_Messages initialMsg = jobBatchContext.getServiceHolder( ).getEnvelopeService( )
					.getEnvelope( manifests.get( 0 ).getRequestEnvelopeId( ) );
			
			CustomsType receiverCustoms = null;
			CustomsType senderCustoms = null;
				
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
			
			respEnvelope.getEDHeader( ).setReceiverCustoms( receiverCustoms );
			respEnvelope.getEDHeader( ).setSenderCustoms( senderCustoms );
			
			respEnvelope.getRoutingInfo( ).setSenderInformation( EnvelopeCreator.getSenderInformation( 
				BusinessSystems.DECLARANT, receiverCustoms, 
				recvEnv.getParticipantID( ) 
			) );
			respEnvelope.getRoutingInfo( ).setReceiverInformationList( EnvelopeCreator.getReceiverInformation( 
				BusinessSystems.DECLARANT, receiverCustoms, 
				recvEnv.getParticipantID( ) 
			) );
			
			respEnvelope.setInitialEnvelopeID( manifests.get( 0 ).getRequestEnvelopeId( ) );
			
			try
			{
				CryptoHelper.signEnvelope( respEnvelope, false );
			}
			catch ( Exception exc )
			{
				ErrorHelper.throwException( 
					jobBatchContext, 
					ResultCodes._09_96669_99, 
					ProcessingConstants.ERROR_TYPE_BUSINESS 
				);
			}
			
			envelopes.add( respEnvelope );
			
			return ;			
		}
		
		makeEnvelopes( manifests, envelopes, recvEnv, jobBatchContext, jobContext );
	}

	private boolean isAllDocumentsFound( List< ExtEadManifest > manifests )
	{
		int mfSize = manifests.size( );
		int mfSucceeded = 0;
		
		for ( ExtEadManifest mf : manifests )
		{
			if ( mf.getResultCode( ).equalsIgnoreCase( ResultCodes._00_00000_00 ) )
				mfSucceeded++;
		}
		
		return ( mfSucceeded == mfSize );
	}
		
	private void makeEnvelopes( 
			List< ExtEadManifest > manifests,
			List< EDEnvelope > envelopes, 
			EDEnvelope recvEnv,
			EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws BaseProcessingException, DatabaseException
	{
		/**
		 * CMN.13001 в таможенный орган
		 */
		EDEnvelope cmn10062 = createCMN10062Envelope( recvEnv, jobBatchContext, jobContext );		
		envelopes.add( cmn10062 );
		
		/**
		 * CMN.00004 декларанту
		 */
		
		EDEnvelope cmn00004 = EnvelopeCreator.createNotificationMessage( 
			MessageType.CMN_00004, recvEnv, ResultCodes._00_00000_00, 
			BusinessSystems.DECLARANT, null 
		);
		
		cmn00004.setInitialEnvelopeID( manifests.get( 0 ).getRequestEnvelopeId( ) );
				
		envelopes.add( cmn00004 );
	}
	
	private EDEnvelope createCMN10062Envelope( 
			EDEnvelope recvEnv,
			EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws BaseProcessingException, DatabaseException
	{
		Edecl_Messages incomeCmn10062 = jobBatchContext.getIncomeMessage( );
		if ( null == incomeCmn10062 )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._09_96669_99, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
		
		Edecl_Msg_Doc incomeCmn10062Doc = jobBatchContext.getServiceHolder( ).getEnvelopeService( )
			.getDocument( incomeCmn10062.getDocumentId( ) );
		if ( null == incomeCmn10062Doc )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._09_96669_99, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}

		Object doc = null;
		
		try
		{
			EnvelopeUnmarshaller envUnmarshaller = new EnvelopeUnmarshaller( );
			Unmarshaller unmarshaller = jobBatchContext.getServiceHolder( ).getUnmarshaller( );
			Object sigDoc = envUnmarshaller.unmarshallBaseDocOrSignature( incomeCmn10062Doc.getBody( ), unmarshaller );
			
			EDDocument xdoc = new EDDocument( sigDoc );
			doc = xdoc.getNakedDocument( );
		}
		catch ( Exception exc )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._09_96669_99, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);			
		}
		
		EDEnvelope cmn10062 = EnvelopeCreator.createTranzitMessage( 
			null, recvEnv, 
			BusinessSystems.CUSTOMS, recvEnv.getReceiverCustoms( )
		);
		
		cmn10062.setInnerDocument( doc );
		
		cmn10062.getDocument( ).setSaveType( DocumentSaveTypes.INSERT );
		cmn10062.getDocument( ).setUniqueness( DocumentUniquenesses.NOT_UNIQ );
		cmn10062.getEDHeader( ).setMessageType( MessageType.CMN_10062 );
		cmn10062.getEDHeader( ).setSenderCustoms( null );
		cmn10062.setInitialEnvelopeID( null );
		
		return cmn10062;
	}
}
