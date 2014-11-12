package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.ArrayList;
import java.util.List;

import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.data.kind.DocumentModeIDs;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.helpers.CryptoHelper;
import ru.acs.fts.eps2.model.entities.Edecl_Messages;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.objects.defines.DocumentSaveTypes;
import ru.acs.fts.eps2.router.objects.defines.DocumentUniquenesses;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.router.processing.helpers.ResultEnvelopeHelper;
import ru.acs.fts.eps2.util.helpers.UUIDGen;

public class GatewayNotificationBusinessProcess extends BusinessProcess
{
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		ru.acs.fts.schemas.admin.gate_result2.ResultType indoc = recvEnv.getDocument( )
			.getDocumentAsClass( 
				ru.acs.fts.schemas.admin.gate_result2.ResultType.class 
			);
		
		ru.acs.fts.schemas.album.result.ResultType outdoc = convert( indoc );
				
		EDEnvelope transit = EnvelopeCreator.createTranzitMessage( 
			null, recvEnv, 
			BusinessSystems.CUSTOMS, recvEnv.getReceiverCustoms( ) 
		);
		
		transit.setInnerDocument( outdoc );
		
		transit.getDocument( ).setSaveType( DocumentSaveTypes.INSERT );
		transit.getDocument( ).setUniqueness( DocumentUniquenesses.UNIQ );
		
		Edecl_Messages incomeMsg = jobBatchContext.getIncomeMessage( );
		if ( null == incomeMsg )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._09_96669_99, 
				ProcessingConstants.ERROR_TYPE_TRANSPORT 
			);
		}
		
		String initialEnvelopeId = incomeMsg.getEnvelopeId( );
		
		if ( incomeMsg.getMessageType( ).equals( MessageType.MSG_11027 ) )
		{
			List< Edecl_Messages > msgs = jobBatchContext.getServiceHolder( ).getEnvelopeService( )
				.getForwardedMessages( incomeMsg.getEnvelopeId( ), incomeMsg.getProcessId( ) );
			for ( Edecl_Messages msg : msgs )
			{
				if ( msg.getMessageType( ).equals( MessageType.MSG_11027 ) )
				{
					initialEnvelopeId = msg.getEnvelopeId( );
					break;
				}
			}
		}
		else if ( incomeMsg.getMessageType( ).startsWith( "ADM." ) )
		{
			initialEnvelopeId = jobBatchContext.getServiceHolder( ).getEnvelopeService( )
				.getIncomeEnvelopeIdByInitialEnvelopeId( incomeMsg.getInitialEnvelopeId( ) );
		}
			
		transit.setInitialEnvelopeID( initialEnvelopeId );
		transit.setSaveEnvelope( true );
		transit.setSaveDocument( true );
		transit.getEDHeader( ).setSenderCustoms( null );
		
		/*
		CustomsType receiverCustoms = new CustomsType( );
		receiverCustoms.setCustomsCode( incomeMsg.getSenderCustomCode( ).toString( ) );
		receiverCustoms.setExchType( incomeMsg.getSenderExchangeType( ).toString( ) );
		*/
		transit.getEDHeader( ).setReceiverCustoms( recvEnv.getReceiverCustoms( ) );
		
		CryptoHelper.signEnvelope( transit, false );
		
		List< EDEnvelope > envelopes = createAndPutEnvelopes( jobBatchContext, jobContext );
		envelopes.add( transit );
	}
	
	public ru.acs.fts.schemas.album.result.ResultType convert( ru.acs.fts.schemas.admin.gate_result2.ResultType in )
	{
		ru.acs.fts.schemas.album.result.ResultType out = new ru.acs.fts.schemas.album.result.ResultType( );
		
		out.setDocumentID( UUIDGen.getUUID( ).toString( ) );
		out.setRefDocumentID( null );
		out.setDocumentModeID( DocumentModeIDs.RESULT );
		
		List< ru.acs.fts.schemas.album.result.ResponseType > responseList =
			new ArrayList< ru.acs.fts.schemas.album.result.ResponseType >( );
		out.setResponseList( responseList );
		
		ru.acs.fts.schemas.album.result.ResponseType response = 
			new ru.acs.fts.schemas.album.result.ResponseType( );
		responseList.add( response );
		
		response.setCreateDate( in.getCreateDate( ) );
		response.setCreateTime( in.getCreateTime( ).toString( ) );
		response.setRefDocumentID( null );
		
		List< ru.acs.fts.schemas.album.result.ResultInformationType > resInfoList = 
			new ArrayList< ru.acs.fts.schemas.album.result.ResultInformationType >( );
		response.setResultInformationList( resInfoList );
		
		ru.acs.fts.schemas.album.result.ResultInformationType resInfo =
			new ru.acs.fts.schemas.album.result.ResultInformationType( );
		resInfoList.add( resInfo );
		
		resInfo.setEADInfoList( null );
		resInfo.setItemInfo( null );
		resInfo.setProcInformation( null );
		resInfo.setRefLineID( null );
		resInfo.setResultCategory( null );
		resInfo.setResultCode( in.getResultInformationResultCode( ) );
		resInfo.setResultDescriptionList( ResultEnvelopeHelper.splitDescription( in.getResultInformationResultDescription( ) ) );
		resInfo.setResultSource( null );
		
		return out;
	}
}
