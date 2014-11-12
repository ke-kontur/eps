package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.configuration.RtuCodePatternsHolder;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.data.kind.DocumentModeIDs;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.helpers.CryptoHelper;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.model.services.ProcedureService;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDConfigurator;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.DtRequestHelper;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.util.helpers.UUIDGen;
import ru.acs.fts.schemas.admin.int_dtrequest.INTDTRequestType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.reqesadinfo.ReqESADInfoType;
import ru.acs.fts.schemas.envelope.ApplicationInfType;
import ru.acs.fts.schemas.envelope.BodyType;
import ru.acs.fts.schemas.envelope.EDHeaderType;
import ru.acs.fts.schemas.envelope.EnvelopeType;
import ru.acs.fts.schemas.envelope.HeaderType;
import ru.acs.fts.schemas.envelope.RoutingInfType;

/**
 * Бизнес процесс для обработки сообщения MSG.11026
 * ( Запрос электронной ДТ )
 */
public class MessageMSG11026BusinessProcess extends BusinessProcess
{
	private static final Logger log = LoggerFactory
			.getLogger( MessageMSG11026BusinessProcess.class );
	
	private static final String IGNORE_CHANGE_STATE_FLAG = "ignoreChangeStateFlag";
	
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );

		EDConfigurator cfg = jobBatchContext.getConfigurator( );
		
		List< EDEnvelope > envelopes = createAndPutEnvelopes( jobBatchContext, jobContext );
		List< EDEnvelope > envelopesVersions = createAndPutEnvelopesVersions( jobBatchContext, jobContext );
		
		String receiverCustomsCode = recvEnv.getReceiverCustoms( ).getCustomsCode( );
		RtuCodePatternsHolder matcher = cfg.getRtuPatternsHolder( );
		
		// Ставим флаг, чтобы потом джоб ChangeProcessState не переводил состояние процедуры стандартным способом
		jobBatchContext.put( IGNORE_CHANGE_STATE_FLAG, "true" );
		log.info( "Выставлено значение {} : {}", IGNORE_CHANGE_STATE_FLAG, jobBatchContext.getBoolean( IGNORE_CHANGE_STATE_FLAG ) );
		
		if ( ! matcher.match( receiverCustomsCode ) )
		{
			/**
			 * Запрос к удаленному таможенному органу
			 * Нам тут до лампочки в какой версии процедура, поэтому
			 * просто формируем транзитное сообщение и умываем руки
			 */
			
			EDEnvelope transit = EnvelopeCreator.createTranzitMessage( 
				null, recvEnv, 
				BusinessSystems.EPS, recvEnv.getReceiverCustoms( )
			);
			
			envelopes.add( transit );
		}
		else
		{
			ReqESADInfoType doc = recvEnv.getDocument( ).getDocumentAsClass( ReqESADInfoType.class );
			
			Edecl_Proc_Information procInfo = getRequestedGTD( 
				doc, recvEnv, jobBatchContext, jobContext 
			);
			
			String exchSpec = procInfo.getSoftVersion( ).split( "/" )[ 1 ];
			
			if ( ! procInfo.getBorderCustCode( ).equalsIgnoreCase( recvEnv.getSenderCustoms( ).getCustomsCode( ) ) )
			{
				ErrorHelper.throwException( 
					jobBatchContext, ResultCodes._03_00105_01, 
					ProcessingConstants.ERROR_TYPE_BUSINESS 
				);
			}
			
			if ( procInfo.getSoftVersion( ).equalsIgnoreCase( cfg.getSoftVersion( ) ) )
			{
				jobBatchContext.put( ContextConstants.KEEPED_PROC_INFO, procInfo );
				
				/**
				 * Запрос в версии текущей электрички
				 */
				
				Edecl_Msg_Doc msg11058 = DtRequestHelper.searchMsg11058( procInfo, jobBatchContext, jobContext );

				if ( exchSpec.compareTo( "3.2.4" ) < 0 || null != msg11058 )
				{
					jobBatchContext.put( ContextConstants.KEEPED_PROC_INFO_MSG_TYPE, MessageType.MSG_11020 );
					
					EDEnvelope msg11020 = DtRequestHelper.createMsg11020( 
						procInfo, jobBatchContext, jobContext 
					);
					
					envelopes.add( msg11020 );
										
					if ( matcher.match( procInfo.getBorderCustCode( ) ) )
					{
						GTDIDType dt = doc.getGTDID( );
						
						EDEnvelope msg11031 = DtRequestHelper.createMsg11031( 
							procInfo, 
							doc.getCustomsPerson( ).getPersonName( ), 
							doc.getCustomsPerson( ).getLNP( ), 
							dt.getCustomsCode( ), 
							dt.getGTDNumber( ), 
							dt.getRegistrationDate( ), 
							jobBatchContext, jobContext 
						);
						
						envelopes.add( msg11031 );
					}					
				}
				else
				{
					jobBatchContext.put( ContextConstants.KEEPED_PROC_INFO_MSG_TYPE, MessageType.MSG_11059 );
					
					EDEnvelope msg11059remote = DtRequestHelper.createMsg11059_Remote( 
						procInfo, jobBatchContext, jobContext 
					);
					
					envelopes.add( msg11059remote );
					
					if ( matcher.match( procInfo.getBorderCustCode( ) ) )
					{
						EDEnvelope msg11059local = DtRequestHelper.createMsg11059_Local(
							procInfo, jobBatchContext, jobContext
						);
						
						envelopes.add( msg11059local );
					}
				}
				
				
				if ( matcher.match( procInfo.getBorderCustCode( ) ) )
				{
					EDEnvelope cmn00004 = EnvelopeCreator.createNotificationMessage(
							MessageType.CMN_00004, recvEnv, ResultCodes._00_00000_00,
							BusinessSystems.CUSTOMS, recvEnv.getSenderCustoms( ) );

					CryptoHelper.signEnvelope( cmn00004, false );

					envelopes.add( cmn00004 );
				}
				
			}
			else
			{
				/**
				 * Запрос в версии другой электрички
				 */
				EDEnvelope rq = createPvrRequest( 
					doc, recvEnv, procInfo, jobBatchContext, jobContext 
				);
				
				envelopesVersions.add( rq );
			}
		}
	}

	private Edecl_Proc_Information getRequestedGTD( 
			ReqESADInfoType request, EDEnvelope recvEnv,
			EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws InvocationTargetException, IllegalAccessException, ResultTypeException, DatabaseException
	{
		ProcedureService procSrv = jobBatchContext.getServiceHolder( ).getProcedureService( );		
		GTDIDType dt = request.getGTDID( );
		
		Edecl_Proc_Information procInfo = procSrv.getProcessIdByGtdNumber( 
			dt.getGTDNumber( ), 
			dt.getCustomsCode( ), 
			dt.getRegistrationDate( ).toDate( ) 
		);
		
		boolean sameCustoms = ( null != procInfo ) ? procInfo.getBorderCustCode( )
			.equalsIgnoreCase( recvEnv.getSenderCustoms( ).getCustomsCode( ) ) : false; 
		
		if ( null == procInfo || ! sameCustoms )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._03_00105_01, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
		
		return procInfo;
	}

	private EDEnvelope createPvrRequest( 
			ReqESADInfoType request, EDEnvelope recvEnv,
			Edecl_Proc_Information procInfo,
			EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		INTDTRequestType rq = new INTDTRequestType( );
		
		rq.setDocumentID( UUIDGen.getUUID( ).toString( ) );
		rq.setDocumentModeID( DocumentModeIDs.INT_DT_REQUEST );

		rq.setRequestCustomsCode( recvEnv.getSenderCustoms( ).getCustomsCode( ) );
		rq.setSoftVersionID( recvEnv.getApplicationInfo( ).getSoftVersion( ) );
		
		GTDIDType srcDt = request.getGTDID( );
		
		ru.acs.fts.schemas.admin.int_dtrequest.GTDIDType dt =
			new ru.acs.fts.schemas.admin.int_dtrequest.GTDIDType( );
		dt.setCustomsCode( srcDt.getCustomsCode( ) );
		dt.setGTDNumber( srcDt.getGTDNumber( ) );
		dt.setRegistrationDate( srcDt.getRegistrationDate( ) );
		rq.setDT( dt );
		
		CustomsPersonType srcCp = request.getCustomsPerson( );
		
		ru.acs.fts.schemas.admin.int_dtrequest.CustomsPersonType cp =
			new ru.acs.fts.schemas.admin.int_dtrequest.CustomsPersonType( );
		cp.setLNP( srcCp.getLNP( ) );
		cp.setPersonName( srcCp.getPersonName( ) );
		rq.setCustomsPerson( cp );
		
		/**
		 * Формируем конверт
		 */
		ApplicationInfType appInfo = new ApplicationInfType( );
		appInfo.setSoftKind( recvEnv.getApplicationInfo( ).getSoftKind( ) );
		appInfo.setSoftVersion( procInfo.getSoftVersion( ) );
		
		RoutingInfType rInfo = new RoutingInfType( );
		rInfo.setEnvelopeID( UUIDGen.getUUID( ).toString( ) );
		rInfo.setPreparationDateTime( new DateTime( ) );
		rInfo.setSenderInformation( EnvelopeCreator.getSenderInformation( 
			BusinessSystems.EPS, recvEnv.getReceiverCustoms( ), 
			recvEnv.getParticipantID( ) 
		) );
		rInfo.setReceiverInformationList( EnvelopeCreator.getReceiverInformation( 
			BusinessSystems.EPS, recvEnv.getReceiverCustoms( ), 
			recvEnv.getParticipantID( ) 
		) );
		
		EDHeaderType edHeader = new EDHeaderType( );
		edHeader.setMessageType( MessageType.PVR_00001 );
		edHeader.setParticipantID( procInfo.getParticipantId( ) );
		edHeader.setProccessID( recvEnv.getProcessID( ) );
		edHeader.setReceiverCustoms( recvEnv.getReceiverCustoms( ) );
		edHeader.setSenderCustoms( recvEnv.getSenderCustoms( ) );
		
		HeaderType header = new HeaderType( );
		
		List< Object > headerAnys = new ArrayList< Object >( );
		header.setAnyList( headerAnys );
		
		headerAnys.add( appInfo );
		headerAnys.add( rInfo );
		headerAnys.add( edHeader );
		
		BodyType body = new BodyType( );
		
		List< Object > bodyAnys = new ArrayList< Object >( );
		body.setAnyList( bodyAnys );
		
		bodyAnys.add( rq );
		
		EnvelopeType rqe = new EnvelopeType( );
		rqe.setHeader( header );
		rqe.setBody( body );
		
		EDEnvelope reqEnvelope = new EDEnvelope( rqe, BusinessSystems.EPS );
		
		reqEnvelope.setSaveEnvelope( true );
		reqEnvelope.setSaveDocument( true );
		reqEnvelope.setRecipientSystem( BusinessSystems.BALANCER );		
		reqEnvelope.setInitialEnvelopeID( recvEnv.getEnvelopeID( ) );
		
		/**
		 * Ну и подпишем его
		 */
		CryptoHelper.signEnvelope( reqEnvelope, false );
		
		return reqEnvelope;
	}
}
