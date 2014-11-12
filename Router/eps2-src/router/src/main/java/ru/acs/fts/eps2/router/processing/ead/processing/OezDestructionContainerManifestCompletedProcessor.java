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
import ru.acs.fts.eps2.engine.util.RemotenessHelper;
import ru.acs.fts.eps2.model.defines.ActionEvents;
import ru.acs.fts.eps2.model.entities.Edecl_Messages;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.model.entities.ExtEadManifest;
import ru.acs.fts.eps2.model.services.ProcedureService;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDDocument;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.persistence.operators.ProcedureOperator;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.ead.mappers.EadToTransportMapper;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.schemas.envelope.CustomsType;

public class OezDestructionContainerManifestCompletedProcessor extends ManifestCompletedProcessor
{

	@Override
	public void process( 
			List< ExtEadManifest > manifests, 
			EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws DatabaseException, BaseProcessingException
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
			
			EnvelopeCreator.reRouteMessage( 
				respEnvelope, senderCustoms, 
				BusinessSystems.DECLARANT, receiverCustoms, 
				manifests.get( 0 ).getRequestEnvelopeId( ), 
				respEnvelope.getIncomeEnvelopeID( ) 
			);
			
			envelopesUnsigned.add( respEnvelope );
			
			return ;			
		}
		
		String messageType = makeEnvelopes( manifests, envelopes, envelopesUnsigned, recvEnv, jobBatchContext, jobContext );

		try
		{
			if ( recvEnv.getMessageType( ).equals( MessageType.ADM_00004 ) )
			{
				changeProcessState( messageType, jobBatchContext, jobContext );
				updateProcessState( jobBatchContext, jobContext );
			}
		}
		catch ( Exception exc )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._02_00000_01, 
				ProcessingConstants.ERROR_TYPE_DATA 
			);
		}		
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
	
	private String makeEnvelopes( 
			List< ExtEadManifest > manifests,
			List< EDEnvelope > envelopes, List< EDEnvelope > envelopesUnsigned,
			EDEnvelope recvEnv,
			EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws BaseProcessingException, DatabaseException
	{
		/**
		 * Нужное сообщение отправляем в таможенный орган
		 */
		EDEnvelope tranzit = createTranzitEnvelope( recvEnv, jobBatchContext, jobContext );		
		envelopes.add( tranzit );
		
		/**
		 * CMN.00004 декларанту
		 */
		String cmn00004Name = jobContext.getString( "cmn00004" );
		EDEnvelope cmn00004 = ( EDEnvelope )jobBatchContext.get( cmn00004Name );
		envelopes.add( cmn00004 );
				
		cmn00004.getEDHeader( ).setReceiverCustoms( null );
		cmn00004.setInitialEnvelopeID( manifests.get( 0 ).getRequestEnvelopeId( ) );
		
		cmn00004.setRecipientSystem( BusinessSystems.DECLARANT );
		
		return tranzit.getMessageType( );
	}
	
	private EDEnvelope createTranzitEnvelope( 
			EDEnvelope recvEnv,
			EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws BaseProcessingException, DatabaseException
	{
		Edecl_Messages incomeMessage = jobBatchContext.getIncomeMessage( );
		if ( null == incomeMessage )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._09_96669_99, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
		
		Edecl_Msg_Doc incomeMessageDoc = jobBatchContext.getServiceHolder( ).getEnvelopeService( )
			.getDocument( incomeMessage.getDocumentId( ) );
		if ( null == incomeMessageDoc )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._09_96669_99, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
		
		EDEnvelope tranzit = EnvelopeCreator.createTranzitMessage( 
			null, recvEnv, 
			BusinessSystems.CUSTOMS, recvEnv.getReceiverCustoms( )
		);
		
		XStringMarshallableClass document = new XStringMarshallableClass( );
		document.setByteArray( incomeMessageDoc.getBody( ) );
		document.setEncoding( Configurator.WORKING_ENCODING );
		
		tranzit.setInnerDocument( document );

		tranzit.getEDHeader( ).setMessageType( incomeMessage.getMessageType( ) );
		tranzit.getEDHeader( ).setSenderCustoms( null );
		tranzit.setInitialEnvelopeID( null );
		
		tranzit.getDocument( ).setNotUniqRecursive( );
		
		return tranzit;
	}
	
	public static void changeProcessState(
			String messageType,
			EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws ResultTypeException, DatabaseException
	{
		ProcedureService procedureService = jobBatchContext.getServiceHolder( ).getProcedureService( );
		ProcedureOperator procedureOperator = jobBatchContext.getServiceHolder( ).getProcedureOperator( );
		
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		String processId = recvEnv.getProcessID( );
				
		Edecl_Proc_Information procInfo =  procedureService.getProcedureInformation( processId );
			
		String envelopeId = recvEnv.getEnvelopeID( );
			
		String event = ActionEvents.NO_EVENT;		
		if ( RemotenessHelper.areCustomsOnDifferentEps( procInfo.getCustCode( ), procInfo.getBorderCustCode( ) ) )
		{
			event = ActionEvents.DIFF_RTU_EVENT;
		}

		try
		{
			procedureOperator.setProcedureNewState( 
				jobBatchContext, envelopeId, processId, messageType, event
			);
		}
		catch ( Exception exc )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._01_00049_03, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
	}
	
	public static void updateProcessState( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		ProcedureService procServ = jobBatchContext.getServiceHolder( ).getProcedureService( );
		Edecl_Proc_Information procInfo = procServ.getProcInformation( recvEnv.getProcessID( ) );
			
		boolean commitFlag = true;

		jobBatchContext.getServiceHolder( ).getProcedureOperator( ).updateProcedureData( 
			procInfo,
			jobBatchContext.getProcedureChangeInformation( ),
			recvEnv.getProcedureCreateState( ),
			commitFlag 
		);
	}	
}
