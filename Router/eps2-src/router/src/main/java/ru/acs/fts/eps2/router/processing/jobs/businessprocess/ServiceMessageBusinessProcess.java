package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import ru.acs.fts.custommarshaller.EnvelopeUnmarshaller;
import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.data.kind.DocumentModeIDs;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.EdeclAlbumDocList;
import ru.acs.fts.eps2.model.entities.EdeclMsgList;
import ru.acs.fts.eps2.model.entities.Edecl_Messages;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.model.entities.Edecl_Procstate;
import ru.acs.fts.eps2.model.entities.Edecl_Result;
import ru.acs.fts.eps2.model.entities.Edecl_Statuslist;
import ru.acs.fts.eps2.model.services.AlbumDocListService;
import ru.acs.fts.eps2.model.services.EnvelopeService;
import ru.acs.fts.eps2.model.services.MsgListService;
import ru.acs.fts.eps2.model.services.ProcedureService;
import ru.acs.fts.eps2.model.services.StatusListService;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.objects.EDDocument;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.ResultEnvelopeHelper;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.util.helpers.UUIDGen;
import ru.acs.fts.eps2.utils.StringUtil;
import ru.acs.fts.schemas.album.eps_envresponse.EPSEnvResponseType;
import ru.acs.fts.schemas.album.eps_envresponse.EnvelopeDataType;
import ru.acs.fts.schemas.album.eps_inforequest.EPSInfoRequestType;
import ru.acs.fts.schemas.album.result.DocumentResultType;
import ru.acs.fts.schemas.album.result.EventListType;
import ru.acs.fts.schemas.album.result.ProcInformationType;
import ru.acs.fts.schemas.album.result.ResultInformationType;
import ru.acs.fts.schemas.album.result.ResultType;
import ru.acs.fts.schemas.envelope.ApplicationInfType;
import ru.acs.fts.schemas.envelope.BodyType;
import ru.acs.fts.schemas.envelope.CustomsType;
import ru.acs.fts.schemas.envelope.EDHeaderType;
import ru.acs.fts.schemas.envelope.EnvelopeType;
import ru.acs.fts.schemas.envelope.HeaderType;
import ru.acs.fts.schemas.envelope.RoutingInfType;

import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;

import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServiceMessageBusinessProcess extends BusinessProcess
{
	private static final Logger log = LoggerFactory.getLogger( ServiceMessageBusinessProcess.class );
	
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		EPSInfoRequestType epsInfoRequest = recvEnv.getDocument( ).getDocumentAsClass( EPSInfoRequestType.class ); 
		
		Object document = null;
		
		String msgType = recvEnv.getMessageType( ); 
		String answerSoftVersion = recvEnv.getSoftVersion( ); 

		if ( msgType.equals( MessageType.CMN_00101 ) || 
			 msgType.equals( MessageType.CMN_00103 ) )
		{
			String processId = epsInfoRequest.getProcessRequest( ).getProcessID( );

			Edecl_Proc_Information procInfo = _serviceHolder.getProcedureService( ).getProcInformation( processId );
			
			if ( null == procInfo )
			{
				ErrorHelper.throwException( 
					jobBatchContext, 
					ResultCodes._01_00049_03, 
					ProcessingConstants.ERROR_TYPE_BUSINESS 
				);
			}
			
			getAccessForParticipantOrCustom( recvEnv, epsInfoRequest, jobBatchContext );

			answerSoftVersion = procInfo.getSoftVersion( );

			ResultType resDocument = ResultEnvelopeHelper.getOkResultDocument( 
				epsInfoRequest.getDocumentID( ), 
				( msgType.equals( MessageType.CMN_00101 )  
					? "Информация о текущем статусном состоянии."
					: "Информация об истории процесса." 
				) 
			);
			
			document = resDocument;
			
			ResultInformationType resultDocumentPart = 
				resDocument.getResponseList( ).get( 0 ).getResultInformationList( ).get( 0 ); 

			ProcInformationType procInformationType = null;
			if ( msgType.equals( MessageType.CMN_00101 ) )
				procInformationType = fillCurrentProcessState( processId );
			else
			{
				procInformationType = getProcedureHistory(
					_serviceHolder.getProcedureService( ),
					_serviceHolder.getEnvelopeService( ),
					_serviceHolder.getMsgListService( ),
					_serviceHolder.getAlbumDocListService( ),
					processId,
					recvEnv.getRoutingInfo( ).getSenderInformation( ),
					recvEnv.getSenderSystem( )
				);
			}

			procInformationType.setProcessID( processId );
			resultDocumentPart.setProcInformation( procInformationType );
		}
		else if ( msgType.equals( MessageType.CMN_00105 ) )
		{
			EPSEnvResponseType resDocument = new EPSEnvResponseType( );
			
			document = resDocument;
			
			resDocument.setDocumentID( UUIDGen.getUUID( ).toString( ) );
			resDocument.setRefDocumentID( recvEnv.getDocument( ).getDocumentID( ) ); 
			resDocument.setDocumentModeID( DocumentModeIDs.EPS_ENV_RESPONSE );
			
			EnvelopeType requestedEnvelope = getMessage( 
				epsInfoRequest.getEnvRequest( ).getEnvelopeID( ),
				jobBatchContext
			);
			
			EnvelopeDataType envData = new EnvelopeDataType( );
			envData.setAny( requestedEnvelope );
						
			resDocument.setEnvData( envData );
		}

		jobBatchContext.put( ContextConstants.ANSWER_SOFT_VERSION, answerSoftVersion );

		if ( document != null )
		{
			EDDocument edoc = new EDDocument( document );			
			jobBatchContext.put( jobContext.getString( ContextConstants.DOCUMENT_NAME ), edoc );
		}
	}

	private ProcInformationType fillCurrentProcessState( String processId ) 
		throws Exception
	{
		Edecl_Proc_Information procInfo = _serviceHolder.getProcedureService( ).getProcInformation( processId );
		String currentStatus = procInfo.getCurrentState( ); 

		ProcInformationType procInformationType = new ProcInformationType( );
		procInformationType.setProcState( currentStatus );

//		String statusDescription = transmissionDictionaryReader.getStateDescription( currentStatus );
		StatusListService statusListService = getServiceHolder( ).getStatusListService( );
		Edecl_Statuslist statusList = statusListService.getStatusList( currentStatus );
		String statusDescription = null;
		if ( null != statusList )
			statusDescription = statusList.getDescription( );

		if ( ! StringUtil.isNullOrEmpty( statusDescription ) )
			procInformationType.setStateDescription( statusDescription );
		else
			procInformationType.setStateDescription( "Описания нет." );

		return procInformationType;
	}

	private void getAccessForParticipantOrCustom( 
			EDEnvelope recvEnv, EPSInfoRequestType epsInfoRequest,
			EDJobBatchContext jobBatchContext ) 
		throws Exception
	{
		boolean accessPermit = true;

		String processId = epsInfoRequest.getProcessRequest( ).getProcessID( );
		
		if ( BusinessSystems.isSuchSystem( recvEnv.getSenderSystem( ), BusinessSystems.DECLARANT ) )
		{
			accessPermit = _serviceHolder.getProcedureService( ).isExistProcessByParticipantID(
				recvEnv.getParticipantID( ), processId 
			); 
		}
		else
		{
			accessPermit = _serviceHolder.getProcedureOperator( ).isExistProcessByCustomsCode(
				recvEnv.getSenderCustoms( ), processId 
			); 
		}

		if ( ! accessPermit )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._02_00082_01, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
	}

	/**
	 * Восстановить из БД уже обрабатываемый конверт по его идентификатору.
	 * @throws IOException 
	 */
	private EnvelopeType getMessage( String envelopeID, EDJobBatchContext jobBatchContext ) 
		throws BaseProcessingException, Exception
	{
		EnvelopeType loadingEnvelope = new EnvelopeType( );

		Edecl_Messages message = _serviceHolder.getEnvelopeService( ).getEnvelope( envelopeID ); 
		if ( message == null )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._02_00001_01, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}

		HeaderType header = new HeaderType( );
		loadingEnvelope.setHeader( header );

		List< Object > headerAny = new ArrayList< Object >( );
		header.setAnyList( headerAny );
		
		RoutingInfType routingInfo = new RoutingInfType( );
		headerAny.add( routingInfo );
		
		routingInfo.setEnvelopeID( message.getEnvelopeId( ) );
		routingInfo.setInitialEnvelopeID( message.getInitialEnvelopeId( ) );
		routingInfo.setSenderInformation( message.getSenderInformation( ) );
		
		if ( null != message.getPreparationDatetime( ) )
			routingInfo.setPreparationDateTime( new DateTime( message.getPreparationDatetime( ) ) );
		
		List< String > receiverInformations = new ArrayList< String >( );
		receiverInformations.add( message.getReceiverInformation( ) );
		routingInfo.setReceiverInformationList( receiverInformations );
		
		if ( null != message.getPriority( ) )
			routingInfo.setPriority( BigInteger.valueOf( message.getPriority( ) ) );
		
		routingInfo.setExpiration( message.getExpiration( ) );

		ApplicationInfType applicationInfo = new ApplicationInfType( );
		headerAny.add( applicationInfo );
		
		applicationInfo.setMessageKind( message.getMessageKind( ) );
		applicationInfo.setSoftKind( message.getSoftKind( ) );
		applicationInfo.setSoftVersion( message.getSoftVersion( ) );

		EDHeaderType edHeader = new EDHeaderType( );
		headerAny.add( edHeader );
		
		edHeader.setMessageType( message.getMessageType( ) );
		edHeader.setParticipantID( message.getParticipantId( ) );
		edHeader.setProccessID( message.getProcessId( ) );

		if ( message.getSenderCustomCode( ) != null )
		{
			CustomsType senderCustoms = new CustomsType( );
			edHeader.setSenderCustoms( senderCustoms );
			
			senderCustoms.setCustomsCode( message.getSenderCustomCode( ).toString( ) );
			senderCustoms.setExchType( message.getSenderExchangeType( ).toString( ) );
		}

		if ( message.getRcvCustomCode( ) != null )
		{
			CustomsType receiverCustoms = new CustomsType( );
			edHeader.setReceiverCustoms( receiverCustoms );
			
			receiverCustoms.setCustomsCode( message.getRcvCustomCode( ).toString( ) );
			receiverCustoms.setExchType( message.getRcvExchangeType( ).toString( ) );
		}
		
		Edecl_Msg_Doc document = _serviceHolder.getEnvelopeService( ).getDocument( message.getDocumentId( ) ); 
		if ( document == null )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._02_00001_01, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
		
		BodyType body = new BodyType( );
		loadingEnvelope.setBody( body );
		
		EnvelopeUnmarshaller envUnmarshaller = new EnvelopeUnmarshaller( );
		Object any = envUnmarshaller.unmarshallBaseDocOrSignature( document.getBody( ), _serviceHolder.getUnmarshaller( ) );
		
		List< Object > anyList = new ArrayList< Object >( );
		anyList.add( any );
		body.setAnyList( anyList );
		
		return loadingEnvelope;
	}
	
	private ProcInformationType getProcedureHistory(
			ProcedureService procedureService, EnvelopeService envelopeService,
			MsgListService msgListService, AlbumDocListService albumDocListService,
			String processId, String senderInformation, String senderSystem ) 
		throws DatatypeConfigurationException, DatabaseException
	{
		List< Edecl_Messages > messages = envelopeService.getEnvelopesByProcessId( processId );
		
		List< Edecl_Messages > additional = envelopeService.findByInitialOrIncomeEnvelopes( messages );
		if ( null != additional && 0 != additional.size( ) )
			messages.addAll( additional );
		
		Collections.sort( messages, new Comparator< Edecl_Messages >( )
		{
			@Override
			public int compare( Edecl_Messages m1, Edecl_Messages m2 )
			{
				Calendar cal1 = m1.getSendDate( );
				if ( null == cal1 )
					cal1 = m1.getReceiveDate( );
				
				Calendar cal2 = m2.getSendDate( );
				if ( null == cal2 )
					cal2 = m2.getReceiveDate( );
				
				return cal1.compareTo( cal2 );
			}	
		} );
		
		List< Edecl_Procstate > procStates = procedureService.getProcStates( processId );		
				
		ProcInformationType procInformationType = new ProcInformationType( );
		procInformationType.setProcessID( processId );
		
		List< EventListType > eventList = new ArrayList< EventListType >( );		
		procInformationType.setEventList( eventList );
		
		for ( Edecl_Messages msg : messages )
		{
			if ( ! msg.getSenderInformation( ).equalsIgnoreCase( senderInformation ) &&
				 ! msg.getReceiverInformation( ).equalsIgnoreCase( senderInformation ) )
				continue;
			
			if ( msg.getMessageType( ).equals( MessageType.MSG_00004 ) &&
				 BusinessSystems.isSuchSystem( senderSystem, BusinessSystems.DECLARANT ) )
					continue;
							
			EventListType event = new EventListType( );
			eventList.add( event );
			
			event.setMessageID( msg.getEnvelopeId( ) );
			event.setMessageCode( msg.getMessageType( ) );
			event.setMsgInitialEnvelopeID( msg.getInitialEnvelopeId( ) );
			event.setMsgDocumentID( msg.getDocumentId( ) );
			
			EdeclMsgList msgList = msgListService.getMsgList( msg.getMessageType( ) );
			event.setMessageDescription( ( null != msgList ) ? msgList.getDescription( ) : "не определено" );

			if ( null != msg.getReceiveDate( ) )
				event.setRecvDateTime( new DateTime( msg.getReceiveDate( ) ).toString( ) );
			if ( null != msg.getSendDate( ) )
				event.setSendDateTime( new DateTime( msg.getSendDate( ) ).toString( ) );
			if ( null != msg.getPreparationDatetime( ) )
				event.setMsgPreparationDateTime( new DateTime( msg.getPreparationDatetime( ) ).toString( ) );
			
			Edecl_Msg_Doc doc = envelopeService.getDocument( msg.getDocumentId( ) );
			if ( null != doc )
			{
				event.setDocumentCode( doc.getDocumentModeId( ) );
				event.setMsgRefDocumentID( doc.getRefDocumentId( ) );
			
				EdeclAlbumDocList docList = albumDocListService.getAlbumDocList( doc.getDocumentModeId( ) );
				event.setDocumentDescription( ( null != docList ) ? docList.getDescription( ) : "не определено" );				
			}
			else
			{
				event.setDocumentCode( "0000000E" );
				event.setDocumentDescription( "Неизвестный документ" );
				event.setMsgRefDocumentID( null );
			}
			
			Edecl_Procstate procState = null;
			for ( Edecl_Procstate ps : procStates )
			{
				if ( ps.getEnvelopeId( ).equalsIgnoreCase( msg.getEnvelopeId( ) ) )
				{
					procState = ps;
					break;
				}
			}
			
			if ( null != procState )
			{
				event.setProcState( procState.getCode( ) );
			}
			else
			{
				event.setProcState( null );
			}
			
			List< Edecl_Result > docResults = envelopeService.getResultDocumentInformation( processId, msg.getEnvelopeId( ) );
			if ( null == docResults )
			{
				String errorMsg = String.format(
					"Не удалось получить историю обработки для документа с processId=%s, envelopeId=%s",
					processId, event.getMessageID( ) 
				); 
				
				log.info( errorMsg );
				continue;
			}
			
			List< DocumentResultType > docResultList = new ArrayList< DocumentResultType >( );
			event.setDocumentResultList( docResultList );
			
			for ( Edecl_Result res : docResults )
			{
				DocumentResultType dr = new DocumentResultType( );
				docResultList.add( dr );
				
				dr.setResultCode( res.getResultCode( ) );
				dr.setDocumentID( res.getDocumentId( ) );
			}
		}
				
		log.info(
			"Получена история обработки для processId=%s. Количество записей = %d",
			processId, procInformationType.getEventList( ).size( ) 
		);
		
		return procInformationType;
	}	
}
