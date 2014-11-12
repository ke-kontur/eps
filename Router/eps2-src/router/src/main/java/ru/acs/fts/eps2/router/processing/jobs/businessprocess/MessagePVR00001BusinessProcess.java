package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.configuration.RtuCodePatternsHolder;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.data.kind.DocumentModeIDs;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edecl_Errlist;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.model.services.ErrListService;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.DtRequestHelper;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.router.processing.helpers.DtRequestHelper.FailedException;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.util.helpers.UUIDGen;
import ru.acs.fts.schemas.admin.int_dtrequest.GTDIDType;
import ru.acs.fts.schemas.admin.int_dtrequest.INTDTRequestType;
import ru.acs.fts.schemas.admin.int_dtresponce.INTDTResponseType;
import ru.acs.fts.schemas.envelope.CustomsType;

import java.util.List;

/**
 * Бизнес процесс для обработки сообщения PVR.00001
 * ( Запрос к предыдущей версии по сообщению MSG.11026 )
 */
public class MessagePVR00001BusinessProcess extends BusinessProcess
{
	private static final String IGNORE_CHANGE_STATE_FLAG = "ignoreChangeStateFlag";
	
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		List< EDEnvelope > envelopes = createAndPutEnvelopes( jobBatchContext, jobContext );
		List< EDEnvelope > envelopesVersions = createAndPutEnvelopesVersions( jobBatchContext, jobContext );

		INTDTRequestType request = recvEnv.getDocument( ).getDocumentAsClass( INTDTRequestType.class );

		String rCode = ResultCodes._00_00000_00;
		
		RtuCodePatternsHolder matcher = jobBatchContext.getConfigurator( ).getRtuPatternsHolder( );
		boolean isBorderCustomsLocal = true;
		
		try
		{
			GTDIDType dt = request.getDT( );
			
			Edecl_Proc_Information procInfo = DtRequestHelper.getRequestedGTD( 
				dt.getCustomsCode( ), dt.getGTDNumber( ), dt.getRegistrationDate( ), 
				jobBatchContext, jobContext 
			);
			
			if ( null == procInfo )
				throw new FailedException( ResultCodes._01_00041_01 );
			
			String exchSpec = procInfo.getSoftVersion( ).split( "/" )[ 1 ];
			Edecl_Msg_Doc msg11058 = DtRequestHelper.searchMsg11058( procInfo, jobBatchContext, jobContext );
			
			jobBatchContext.put( IGNORE_CHANGE_STATE_FLAG, "true" );
			jobBatchContext.put( ContextConstants.KEEPED_PROC_INFO, procInfo );
			
			if ( exchSpec.compareTo( "3.2.4" ) < 0 || null != msg11058 )
			{
				EDEnvelope msg11020 = DtRequestHelper.createMsg11020( 
					procInfo, jobBatchContext, jobContext 
				); 
	
				envelopes.add( msg11020 );
				
				jobBatchContext.put( ContextConstants.KEEPED_PROC_INFO_MSG_TYPE, MessageType.MSG_11020 );
				
				if ( matcher.match( procInfo.getBorderCustCode( ) ) )
				{
					EDEnvelope msg11031 = DtRequestHelper.createMsg11031( 
						procInfo, 
						request.getCustomsPerson( ).getPersonName( ), 
						request.getCustomsPerson( ).getLNP( ), 
						request.getDT( ).getCustomsCode( ), 
						request.getDT( ).getGTDNumber( ), 
						request.getDT( ).getRegistrationDate( ), 
						jobBatchContext, jobContext 
					); 
		
					envelopes.add( msg11031 );
				}				
			}
			else
			{
				if ( matcher.match( procInfo.getBorderCustCode( ) ) )
				{
					EDEnvelope msg11059local = DtRequestHelper.createMsg11059_Local( 
						procInfo, jobBatchContext, jobContext 
					);
	
					envelopes.add( msg11059local );
				}
				
				EDEnvelope msg11059remote = DtRequestHelper.createMsg11059_Remote( 
					procInfo, jobBatchContext, jobContext 
				);
				
				envelopes.add( msg11059remote );
				
				jobBatchContext.put( ContextConstants.KEEPED_PROC_INFO_MSG_TYPE, MessageType.MSG_11059 );
			}
			
			if ( ! matcher.match( procInfo.getBorderCustCode( ) ) )
			{
				isBorderCustomsLocal = false;
			}
		}
		catch ( FailedException exc )
		{
			rCode = exc.getResultCode( );
		}

		if ( ResultCodes._00_00000_00 != rCode ||
			 isBorderCustomsLocal )
		{
			INTDTResponseType responseDoc = createDTResponseDocument( 
				request, rCode, 
				jobBatchContext, jobContext 
			);
			
			EDEnvelope responseEnv = createDTResponse( 
				recvEnv, request, 
				responseDoc, 
				jobBatchContext, jobContext 
			);
				
			envelopesVersions.add( responseEnv );
		}
	}
	
	
	private INTDTResponseType createDTResponseDocument( 
			INTDTRequestType request, String resultCode,
			EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws DatabaseException
	{
		INTDTResponseType response = new INTDTResponseType( );
		
		response.setDocumentID( UUIDGen.getUUID( ).toString( ) );
		response.setRefDocumentID( request.getDocumentID( ) );
		response.setDocumentModeID( DocumentModeIDs.INT_DT_RESPONSE );
		
		response.setResultCode( resultCode );
		
		ErrListService errSrv = jobBatchContext.getServiceHolder( ).getErrListService( );
		Edecl_Errlist errList = errSrv.getErrList( resultCode );
		response.setResultDescription( null != errList ? errList.getPublicDescription( ) : "" );
				
		return response;
	}
	
	private EDEnvelope createDTResponse(
			EDEnvelope recvEnv,
			INTDTRequestType request, INTDTResponseType response,
			EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws BaseProcessingException, DatabaseException
	{
		CustomsType receiverCustoms = new CustomsType( );
		receiverCustoms.setCustomsCode( request.getRequestCustomsCode( ) );
		receiverCustoms.setExchType( recvEnv.getReceiverCustoms( ).getExchType( ) );
		
		EDEnvelope respEnv = EnvelopeCreator.createFluentMessage( 
			MessageType.PVR_00002, null, recvEnv.getParticipantID( ), 
			null, null, request.getSoftVersionID( ), 
			BusinessSystems.EPS, recvEnv.getReceiverCustoms( ), 
			BusinessSystems.BALANCER, receiverCustoms, 
			response 
		);
		
		respEnv.setInitialEnvelopeID( recvEnv.getInitialEnvelopeID( ) );
		
		return respEnv;
	}
}
