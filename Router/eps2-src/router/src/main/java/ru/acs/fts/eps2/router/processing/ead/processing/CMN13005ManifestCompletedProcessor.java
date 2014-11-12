package ru.acs.fts.eps2.router.processing.ead.processing;

import java.util.ArrayList;
import java.util.List;

import ru.acs.fts.custommarshaller.XStringMarshallableClass;
import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.configuration.Configurator;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.helpers.CryptoHelper;
import ru.acs.fts.eps2.model.entities.Edarch_Read_Access;
import ru.acs.fts.eps2.model.entities.Edecl_Messages;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
import ru.acs.fts.eps2.model.entities.ExtEadManifest;
import ru.acs.fts.eps2.model.services.EdarchService;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.objects.EDDocument;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.objects.defines.DocumentUniquenesses;
import ru.acs.fts.eps2.router.processing.EDConfigurator;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.ead.EadRequester;
import ru.acs.fts.eps2.router.processing.ead.mappers.EadToTransportMapper;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.schemas.envelope.CustomsType;

public class CMN13005ManifestCompletedProcessor extends ManifestCompletedProcessor
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
			 
			EDEnvelope cmn00001 = EadToTransportMapper.makeEnvelope( 
				MessageType.CMN_00001, resDocument, 
				BusinessSystems.CUSTOMS, jobBatchContext 
			);

			Edecl_Messages initialMsg = jobBatchContext.getServiceHolder( ).getEnvelopeService( )
				.getEnvelope( manifests.get( 0 ).getRequestEnvelopeId( ) );
			
			boolean isOk = false;
			if ( null != initialMsg )
			{
				if ( null != initialMsg.getSenderCustomCode( ) && null != initialMsg.getSenderExchangeType( ) )
				{
					CustomsType receiverCustoms = new CustomsType( );
					receiverCustoms.setCustomsCode( Integer.toString( initialMsg.getSenderCustomCode( ) ) );
					receiverCustoms.setExchType( Integer.toString( initialMsg.getSenderExchangeType( ) ) );
					cmn00001.getEDHeader( ).setReceiverCustoms( receiverCustoms );
					cmn00001.getEDHeader( ).setSenderCustoms( null );
					isOk = true;
				}
				else if ( null != initialMsg.getRcvCustomCode( ) && null != initialMsg.getRcvExchangeType( ) )
				{
					CustomsType senderCustoms = new CustomsType( );
					senderCustoms.setCustomsCode( Integer.toString( initialMsg.getRcvCustomCode( ) ) );
					senderCustoms.setExchType( Integer.toString( initialMsg.getRcvExchangeType( ) ) );
					cmn00001.getEDHeader( ).setReceiverCustoms( null );
					cmn00001.getEDHeader( ).setSenderCustoms( senderCustoms );
					isOk = true;
				}
			}
			
			if ( ! isOk )
			{
				cmn00001.getEDHeader( ).setReceiverCustoms( recvEnv.getReceiverCustoms( ) );
				cmn00001.getEDHeader( ).setSenderCustoms( recvEnv.getReceiverCustoms( ) );
			}
			
			envelopesUnsigned.add( cmn00001 );
			
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
		String participantId = recvEnv.getParticipantID( );
		
		for ( ExtEadManifest mf : manifests )
		{
			if ( ! isLocalEAD( mf, jobBatchContext.getConfigurator( ) ) )
				continue;
			
			Edarch_Read_Access readAccess = edarchService.getReadAccess( 
				mf.getRequestArchId( ),
				mf.getRequestArchDocId( ),
				participantId 
			);
			
			if ( null == readAccess )
			{
				readAccess = new Edarch_Read_Access( );
				readAccess.setParticipantId( participantId );
				readAccess.setIdInternal( mf.getRequestArchDocId( ) );
				readAccess.setArchIdInternal( mf.getRequestArchId( ) );
				
				edarchService.persist( readAccess );
			}
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
		EDEnvelope cmn13005 = createCMN13005Envelope( recvEnv, jobBatchContext, jobContext );		
		envelopes.add( cmn13005 );
		
		/**
		 * CMN.00004 в таможню
		 */
		// String cmn00004Name = jobContext.getString( "cmn00004" );
		// EDEnvelope cmn00004 = ( EDEnvelope )jobBatchContext.get( cmn00004Name );
		
		CustomsType recvCustoms = recvEnv.getReceiverCustoms( );
		if ( null == recvCustoms )
			recvCustoms = recvEnv.getSenderCustoms( );
				
		EDEnvelope cmn00004 = EnvelopeCreator.createNotificationMessage( 
			MessageType.CMN_00004, recvEnv, ResultCodes._00_00000_00, 
			BusinessSystems.CUSTOMS, recvCustoms 
		);
		
		CryptoHelper.signEnvelope( cmn00004, false );
		
		envelopes.add( cmn00004 );
		
		// cmn00004.getEDHeader( ).setReceiverCustoms( recvEnv.getReceiverCustoms( ) );
		cmn00004.getEDHeader( ).setSenderCustoms( null );
		
		cmn00004.setRecipientSystem( BusinessSystems.CUSTOMS );
		
		String initialEnvelopeId = recvEnv.getEnvelopeID( );
		if ( recvEnv.getMessageType( ).equals( MessageType.ADM_00004 ) )
		{
			initialEnvelopeId = jobBatchContext.getServiceHolder( ).getEnvelopeService( ).getIncomeEnvelopeIdByInitialEnvelopeId( recvEnv.getInitialEnvelopeID( ) );
		}
		cmn00004.setInitialEnvelopeID( initialEnvelopeId );

		/**
		 * ADM.00013 на удаленные ЭПСы
		 */
		for ( ExtEadManifest mf : manifests )
		{
			if ( isLocalEAD( mf, jobBatchContext.getConfigurator( ) ) )
				continue;
			
			EDEnvelope adm00012 = EadToTransportMapper.makeAdm00013Envelope( mf, jobBatchContext );						
			envelopesUnsigned.add( adm00012 );
		}
	}
	
	private boolean isLocalEAD( ExtEadManifest mf, EDConfigurator configurator )
	{
		return EadRequester.isLocalEAD( mf.getRequestArchId( ), mf.getRequestArchDocId( ), configurator );
	}	
	
	private EDEnvelope createCMN13005Envelope( 
			EDEnvelope recvEnv,
			EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws BaseProcessingException, DatabaseException
	{
		Edecl_Messages incomeCmn13005 = jobBatchContext.getIncomeMessage( );
		if ( null == incomeCmn13005 )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._09_96669_99, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
		
		Edecl_Msg_Doc incomeCmn13005Doc = jobBatchContext.getServiceHolder( ).getEnvelopeService( )
			.getDocument( incomeCmn13005.getDocumentId( ) );
		if ( null == incomeCmn13005Doc )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._09_96669_99, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
		
		EDEnvelope cmn13005 = EnvelopeCreator.createTranzitMessage( 
			null, jobBatchContext.getReceivedEnvelope( ), 
			BusinessSystems.DECLARANT, null 
		);
		
		XStringMarshallableClass document = new XStringMarshallableClass( );
		document.setByteArray( incomeCmn13005Doc.getBody( ) );
		document.setEncoding( Configurator.WORKING_ENCODING );
		
		cmn13005.setInnerDocument( document );
		cmn13005.getDocument( ).setUniqueness( DocumentUniquenesses.NOT_UNIQ );

		cmn13005.getEDHeader( ).setMessageType( MessageType.CMN_13005 );
		cmn13005.getEDHeader( ).setReceiverCustoms( null );

		String initial = null;
		if ( jobBatchContext.getReceivedEnvelope( ).getMessageType( ).equals( MessageType.CMN_13005 ) )
		{
			initial = recvEnv.getInitialEnvelopeID( ); 
		}
		else if ( jobBatchContext.getReceivedEnvelope( ).getMessageType( ).equals( MessageType.ADM_00004 ) )
		{
			initial = incomeCmn13005.getInitialEnvelopeId( );
		}

		if ( null != initial )
		{
			String income = jobBatchContext.getServiceHolder( ).getEnvelopeService( ).getIncomeEnvelopeIdByInitialEnvelopeId( initial );
			if ( null != income )
				cmn13005.setInitialEnvelopeID( income );
		}
		
		return cmn13005;
	}
}
