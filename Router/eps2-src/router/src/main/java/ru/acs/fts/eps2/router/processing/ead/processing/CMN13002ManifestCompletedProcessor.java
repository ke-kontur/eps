package ru.acs.fts.eps2.router.processing.ead.processing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.acs.fts.custommarshaller.EnvelopeUnmarshaller;
import ru.acs.fts.custommarshaller.XStringMarshallableClass;
import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.configuration.Configurator;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.helpers.CryptoHelper;
import ru.acs.fts.eps2.model.entities.Edarch_Reqinfo;
import ru.acs.fts.eps2.model.entities.Edarch_Reqinfo_Ids;
import ru.acs.fts.eps2.model.entities.Edecl_Messages;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
import ru.acs.fts.eps2.model.entities.Edecl_Participant;
import ru.acs.fts.eps2.model.entities.ExtEadManifest;
import ru.acs.fts.eps2.model.services.EdarchService;
import ru.acs.fts.eps2.model.services.EnvelopeService;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
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
import ru.acs.fts.eps2.utils.StringUtil;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.confirmwhdocreg.ConfirmWHDocRegType;
import ru.acs.fts.schemas.envelope.CustomsType;

public class CMN13002ManifestCompletedProcessor extends ManifestCompletedProcessor
{
	private static final Logger log = LoggerFactory.getLogger( CMN13002ManifestCompletedProcessor.class );

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
				BusinessSystems.CUSTOMS, jobBatchContext 
			);
			
			EnvelopeCreator.reRouteMessage( 
				respEnvelope, null, 
				BusinessSystems.CUSTOMS, recvEnv.getReceiverCustoms( ), 
				manifests.get( 0 ).getRequestEnvelopeId( ), 
				recvEnv.getEnvelopeID( )
			);
			
			envelopesUnsigned.add( respEnvelope );
			
			return ;			
		}
		
		List< String > cmn13001Initial = new ArrayList< String >( );
		List< byte[ ] > cmn13002Document = new ArrayList< byte[ ] >( );
		
		ConfirmWHDocRegType cmn13002doc = setRequiredStatuses( manifests, recvEnv, cmn13001Initial, cmn13002Document, jobBatchContext );
		makeEnvelopes( cmn13002doc, cmn13001Initial, cmn13002Document, manifests, envelopes, envelopesUnsigned, recvEnv, jobBatchContext, jobContext );
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
	
	private ConfirmWHDocRegType setRequiredStatuses( 
			List< ExtEadManifest > manifests, 
			EDEnvelope recvEnv,
			List< String > cmn13001Initials,
			List< byte[ ] > cmn13002Document,
			EDJobBatchContext jobBatchContext ) 
		throws ResultTypeException, DatabaseException 
	{
		try
		{
			EdarchService edarchService = jobBatchContext.getServiceHolder( ).getEdarchService( );
			EnvelopeService envSrv = jobBatchContext.getServiceHolder( ).getEnvelopeService( );
	
			String incomeEnvelopeId = null;
			if ( recvEnv.getMessageType( ).equals( MessageType.ADM_00004 ) ||
				 recvEnv.getMessageType( ).equals( MessageType.ADM_00001 ) )
			{
				String initialEnvelopeId = recvEnv.getInitialEnvelopeID( );
				incomeEnvelopeId = envSrv.getIncomeEnvelopeIdByInitialEnvelopeId( initialEnvelopeId );
			}
			else
			{
				incomeEnvelopeId = recvEnv.getEnvelopeID( );
			}
			
			Edecl_Messages initialMsg = envSrv.getEnvelope( incomeEnvelopeId );
			Edecl_Msg_Doc initialDoc = envSrv.getDocument( initialMsg.getDocumentId( ) );
			
			cmn13002Document.add( initialDoc.getBody( ) );
			
			EnvelopeUnmarshaller envUnm = new EnvelopeUnmarshaller( );
			Object doc = envUnm.unmarshallBaseDocOrSignature( 
				initialDoc.getBody( ), 
				jobBatchContext.getServiceHolder( ).getUnmarshaller( ) 
			);
			EDDocument xdoc = new EDDocument( doc );
			
			ConfirmWHDocRegType document = xdoc.getDocumentAsClass( ConfirmWHDocRegType.class );
			GTDIDType gtd = document.getRegNumberDoc( ); 
			
			String cmn13001Initial = initialMsg.getInitialEnvelopeId( );
			String cmn13001Income = envSrv.getIncomeEnvelopeIdByInitialEnvelopeId( cmn13001Initial );
			cmn13001Initials.add( cmn13001Income );
			
			for ( ExtEadManifest mf : manifests )
			{
				if ( ! isLocalEAD( mf, jobBatchContext.getConfigurator( ) ) || 
					   StringUtil.isNullOrEmpty( mf.getRequestArchId( ) ) || 
					   StringUtil.isNullOrEmpty( mf.getRequestArchDocId( ) ) )
					continue;
				
				Edarch_Reqinfo_Ids ids = new Edarch_Reqinfo_Ids( );
				ids.setReqEnvId( cmn13001Income );
				ids.setIdInternal( mf.getRequestArchId( ) );
				ids.setArdocIdInternal( mf.getRequestArchDocId( ) );
				
				Edarch_Reqinfo reqInfo = edarchService.getReqInfo( ids );
				
				reqInfo.setSvhRegNumberCustCode( gtd.getCustomsCode( ) );
				reqInfo.setSvhRegNumberNumber( gtd.getGTDNumber( ) );
				if ( null != gtd.getRegistrationDate( ) )
					reqInfo.setSvhRegNumberDate( gtd.getRegistrationDate( ).toDate( ) );
				
				edarchService.merge( reqInfo );
			}
			
			return document;
		}
		catch ( Exception exc )
		{
			log.info( "CMN:13002:", exc );
			
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._09_96669_99, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
		
		return null;
	}
	
	private void makeEnvelopes( 
			ConfirmWHDocRegType cmn13002doc,
			List< String > cmn13001Initials,
			List< byte[ ] > cmn13002Document,
			List< ExtEadManifest > manifests,
			List< EDEnvelope > envelopes, List< EDEnvelope > envelopesUnsigned,
			EDEnvelope recvEnv,
			EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws BaseProcessingException, DatabaseException
	{
		CustomsType ourCustoms = null;
		if ( recvEnv.getMessageType( ).equals( MessageType.ADM_00004 ) ||
			 recvEnv.getMessageType( ).equals( MessageType.ADM_00001 ) )
		{
			ourCustoms = recvEnv.getReceiverCustoms( );
		}
		else
		{
			ourCustoms = recvEnv.getSenderCustoms( );
		}
		
		/**
		 * CMN.13002 декларанту
		 */
		EDEnvelope cmn13002 = createCMN13002Envelope( cmn13001Initials.get( 0 ), recvEnv, jobBatchContext, jobContext );		
		envelopes.add( cmn13002 );
		
		cmn13002.getEDHeader( ).setSenderCustoms( ourCustoms );
				
		/**
		 * CMN.00004 в таможенный орган
		 */
		Edecl_Messages incomeCmn13002 = jobBatchContext.getIncomeMessage( );
		
		EDEnvelope cmn00004 = EnvelopeCreator.createNotificationMessage( 
			MessageType.CMN_00004, recvEnv, ResultCodes._00_00000_00, 
			BusinessSystems.CUSTOMS, ourCustoms 
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

		cmn00004.getEDHeader( ).setSenderCustoms( null );

		if ( null != incomeCmn13002 )
			cmn00004.setInitialEnvelopeID( incomeCmn13002.getEnvelopeId( ) );
		
		envelopes.add( cmn00004 );
		

		/**
		 * ADM.00015 на удаленные ЭПСы
		 */
		for ( ExtEadManifest mf : manifests )
		{
			if ( isLocalEAD( mf, jobBatchContext.getConfigurator( ) ) )
				continue;
			
			EDEnvelope adm00015 = EadToTransportMapper.makeAdm00015Envelope( cmn13002doc, mf, jobBatchContext );
						
			adm00015.getEDHeader( ).setSenderCustoms( ourCustoms );
			adm00015.setInitialEnvelopeID( cmn13001Initials.get( 0 ) );
			
			envelopesUnsigned.add( adm00015 );
		}
		
		if ( cmn13002doc.getWarehouseLicense( ) != null && 
			 cmn13002doc.getWarehouseLicense( ).getCertificateNumber( ) != null )
		{
			String certNumber = cmn13002doc.getWarehouseLicense( ).getCertificateNumber( );
			
			Edecl_Participant svhParticipant = jobBatchContext.getServiceHolder( ).getParticipantService( )
				.getParticipantBySvhLicNum( certNumber );

			if ( null != svhParticipant )
			{
				Map< String, String > messageTypeSubstituion = new HashMap< String, String >( );
				messageTypeSubstituion.put( MessageType.ADM_00004, MessageType.CMN_13002 );
				
				// формируем сообщение в СВХ
				EDEnvelope transit13002ToSvh = EnvelopeCreator.createTranzitMessage( 
					messageTypeSubstituion, recvEnv,
					BusinessSystems.DECLARANT, null
				);
				
				transit13002ToSvh.getEDHeader( ).setSenderCustoms( ourCustoms );
				
				EnvelopeCreator.changeParticipant( transit13002ToSvh, svhParticipant.getParticipantId( ) );
				
				XStringMarshallableClass xstr = new XStringMarshallableClass( );
				xstr.setByteArray( cmn13002Document.get( 0 ) );
				xstr.setEncoding( Configurator.WORKING_ENCODING );
				
				transit13002ToSvh.setInnerDocument( xstr );

				transit13002ToSvh.getDocument( ).setSaveBody( true );
				transit13002ToSvh.getDocument( ).setSaveType( DocumentSaveTypes.INSERT );
				transit13002ToSvh.getDocument( ).setUniqueness( DocumentUniquenesses.NOT_UNIQ );
				
				envelopes.add( transit13002ToSvh );
			}
		}				

	}
	
	private boolean isLocalEAD( ExtEadManifest mf, EDConfigurator configurator )
	{
		return EadRequester.isLocalEAD( mf.getRequestArchId( ), mf.getRequestArchDocId( ), configurator );
	}	
	
	private EDEnvelope createCMN13002Envelope( 
			String cmn13001Initial,
			EDEnvelope recvEnv,
			EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws BaseProcessingException, DatabaseException
	{
		Edecl_Messages incomeCmn13002 = jobBatchContext.getIncomeMessage( );
		if ( null == incomeCmn13002 )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._09_96669_99, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
		
		Edecl_Msg_Doc incomeCmn13002Doc = jobBatchContext.getServiceHolder( ).getEnvelopeService( )
			.getDocument( incomeCmn13002.getDocumentId( ) );
		if ( null == incomeCmn13002Doc )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._09_96669_99, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
		
		EDEnvelope cmn13002 = EnvelopeCreator.createTranzitMessage( 
			null, recvEnv, 
			BusinessSystems.DECLARANT, null
		);
		
		XStringMarshallableClass document = new XStringMarshallableClass( );
		document.setByteArray( incomeCmn13002Doc.getBody( ) );
		document.setEncoding( Configurator.WORKING_ENCODING );
		
		cmn13002.setInnerDocument( document );
		cmn13002.getDocument( ).setSaveBody( true );
		cmn13002.getDocument( ).setSaveType( DocumentSaveTypes.INSERT );
		cmn13002.getDocument( ).setUniqueness( DocumentUniquenesses.NOT_UNIQ );
		
		cmn13002.getEDHeader( ).setMessageType( MessageType.CMN_13002 );
		cmn13002.getEDHeader( ).setSenderCustoms( recvEnv.getReceiverCustoms( ) );
		cmn13002.getRoutingInfo( ).setInitialEnvelopeID( cmn13001Initial );
		cmn13002.setIncomeEnvelopeID( incomeCmn13002.getEnvelopeId( ) );
		
		return cmn13002;
	}
}
