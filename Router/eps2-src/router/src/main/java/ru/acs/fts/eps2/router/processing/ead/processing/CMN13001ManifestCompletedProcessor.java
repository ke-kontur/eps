package ru.acs.fts.eps2.router.processing.ead.processing;

import java.util.ArrayList;
import java.util.List;

import ru.acs.fts.custommarshaller.XStringMarshallableClass;
import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.configuration.Configurator;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.data.kind.ArchiveDocumentStatuses;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.helpers.CryptoHelper;
import ru.acs.fts.eps2.model.entities.Edarch_Archive_Docs;
import ru.acs.fts.eps2.model.entities.Edarch_Reqinfo;
import ru.acs.fts.eps2.model.entities.Edecl_Messages;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
import ru.acs.fts.eps2.model.entities.ExtEadManifest;
import ru.acs.fts.eps2.model.services.EdarchService;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.objects.EDDocument;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.objects.defines.DocumentSaveTypes;
import ru.acs.fts.eps2.router.objects.defines.DocumentUniquenesses;
import ru.acs.fts.eps2.router.processing.EDConfigurator;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.ead.EadRequester;
import ru.acs.fts.eps2.router.processing.ead.mappers.EadToTransportMapper;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.schemas.envelope.CustomsType;

public class CMN13001ManifestCompletedProcessor extends ManifestCompletedProcessor
{

	@Override
	public void process( 
			List< ExtEadManifest > manifests, 
			EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws BaseProcessingException, DatabaseException 
	{
		String envelopesName = jobContext.getString( ContextConstants.ENVELOPES );
		List< EDEnvelope > envelopes = new ArrayList< EDEnvelope >( );
		jobBatchContext.put( envelopesName, envelopes );
		
		String envelopesUnsignedName = jobContext.getString( ContextConstants.ENVELOPES_UNSIGNED );
		List< EDEnvelope > envelopesUnsigned = new ArrayList< EDEnvelope >( );
		jobBatchContext.put( envelopesUnsignedName, envelopesUnsigned );
		
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
			respEnvelope.getRoutingInfo( ).setInitialEnvelopeID( manifests.get( 0 ).getRequestEnvelopeId( ) );
			
			respEnvelope.getRoutingInfo( ).setSenderInformation( EnvelopeCreator.getSenderInformation( 
				BusinessSystems.DECLARANT, receiverCustoms, 
				recvEnv.getParticipantID( ) 
			) );
			respEnvelope.getRoutingInfo( ).setReceiverInformationList( EnvelopeCreator.getReceiverInformation( 
				BusinessSystems.DECLARANT, receiverCustoms, 
				recvEnv.getParticipantID( ) 
			) );
			
			envelopesUnsigned.add( respEnvelope );
			
			return ;			
		}
		
		setRequiredStatuses( manifests, recvEnv, jobBatchContext );
		makeEnvelopes( manifests, envelopes, envelopesUnsigned, recvEnv, jobBatchContext, jobContext );
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
	
	private void setRequiredStatuses( 
			List< ExtEadManifest > manifests, 
			EDEnvelope recvEnv, EDJobBatchContext jobBatchContext ) 
		throws DatabaseException
	{
		EdarchService edarchService = jobBatchContext.getServiceHolder( ).getEdarchService( );
		
		for ( ExtEadManifest mf : manifests )
		{
			if ( ! isLocalEAD( mf, jobBatchContext.getConfigurator( ) ) )
				continue;
			
			Edarch_Archive_Docs docInformation = edarchService
				.getDocument( mf.getRequestArchId( ), mf.getRequestArchDocId( ) ); 

			docInformation.setArdocStageStatus( ArchiveDocumentStatuses.DOC_NEW_ACTUAL );
			edarchService.merge( docInformation );

			Edarch_Reqinfo reqinfo = new Edarch_Reqinfo( );
			// reqinfo.setReqEnvId( recvEnv.getEnvelopeID( ) );
			reqinfo.setReqEnvId( mf.getRequestEnvelopeId( ) );
			reqinfo.setReqDocId( recvEnv.getDocument( ).getDocumentID( ) );
			reqinfo.setIdInternal( docInformation.getArdocArchIdinternal( ) );
			reqinfo.setArdocIdInternal( docInformation.getArdocIdinternal( ) );
			edarchService.merge( reqinfo );
		}		
	}
	
	private void makeEnvelopes( 
			List< ExtEadManifest > manifests,
			List< EDEnvelope > envelopes, List< EDEnvelope > envelopesUnsigned,
			EDEnvelope recvEnv,
			EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws BaseProcessingException, DatabaseException
	{
		/**
		 * CMN.13001 в таможенный орган
		 */
		EDEnvelope cmn13001 = createCMN13001Envelope( recvEnv, jobBatchContext, jobContext );		
		envelopes.add( cmn13001 );
		
		/**
		 * CMN.00004 декларанту
		 */
		Edecl_Messages incomeCmn13001 = jobBatchContext.getIncomeMessage( );
		
		EDEnvelope cmn00004 = EnvelopeCreator.createNotificationMessage( 
			MessageType.CMN_00004, recvEnv, ResultCodes._00_00000_00, 
			BusinessSystems.DECLARANT, null 
		);
			
		try
		{
			CryptoHelper.signEnvelope( cmn00004, false );
		}
		catch ( Exception exc )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._01_00050_03, 
				ProcessingConstants.ERROR_TYPE_WS 
			);
		}

		cmn00004.getEDHeader( ).setReceiverCustoms( null );

		if ( null != incomeCmn13001 )
			cmn00004.setInitialEnvelopeID( incomeCmn13001.getEnvelopeId( ) );
		
		envelopes.add( cmn00004 );
		

		/**
		 * ADM.00012 на удаленные ЭПСы
		 */
		for ( ExtEadManifest mf : manifests )
		{
			if ( isLocalEAD( mf, jobBatchContext.getConfigurator( ) ) )
				continue;
			
			EDEnvelope adm00012 = EadToTransportMapper.makeAdm00012Envelope( mf, jobBatchContext );
						
			adm00012.getEDHeader( ).setSenderCustoms( cmn13001.getReceiverCustoms( ) );
			adm00012.setInitialEnvelopeID( incomeCmn13001.getEnvelopeId( ) );
			
			envelopesUnsigned.add( adm00012 );
		}
	}
	
	private boolean isLocalEAD( ExtEadManifest mf, EDConfigurator configurator )
	{
		return EadRequester.isLocalEAD( mf.getRequestArchId( ), mf.getRequestArchDocId( ), configurator );
	}	
	
	private EDEnvelope createCMN13001Envelope( 
			EDEnvelope recvEnv,
			EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws BaseProcessingException, DatabaseException
	{
		Edecl_Messages incomeCmn13001 = jobBatchContext.getIncomeMessage( );
		if ( null == incomeCmn13001 )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._09_96669_99, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
		
		Edecl_Msg_Doc incomeCmn13001Doc = jobBatchContext.getServiceHolder( ).getEnvelopeService( )
			.getDocument( incomeCmn13001.getDocumentId( ) );
		if ( null == incomeCmn13001Doc )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._09_96669_99, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
		
		EDEnvelope cmn13001 = EnvelopeCreator.createTranzitMessage( 
			null, recvEnv, 
			BusinessSystems.CUSTOMS, recvEnv.getReceiverCustoms( )
		);
		
		XStringMarshallableClass document = new XStringMarshallableClass( );
		document.setByteArray( incomeCmn13001Doc.getBody( ) );
		document.setEncoding( Configurator.WORKING_ENCODING );
		
		cmn13001.setInnerDocument( document );
		cmn13001.getDocument( ).setSaveBody( true );
		cmn13001.getDocument( ).setSaveType( DocumentSaveTypes.INSERT );
		cmn13001.getDocument( ).setUniqueness( DocumentUniquenesses.NOT_UNIQ );
		
		cmn13001.getEDHeader( ).setMessageType( MessageType.CMN_13001 );
		cmn13001.getEDHeader( ).setSenderCustoms( null );
		cmn13001.getRoutingInfo( ).setInitialEnvelopeID( null );
		cmn13001.setIncomeEnvelopeID( incomeCmn13001.getEnvelopeId( ) );
		
		return cmn13001;
	}
}
