package ru.acs.fts.eps2.router.processing.helpers;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.springframework.oxm.Unmarshaller;

import ru.acs.fts.custommarshaller.EnvelopeUnmarshaller;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.configuration.RtuCodePatternsHolder;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.data.kind.DocumentModeIDs;
import ru.acs.fts.eps2.engine.data.kind.DocumentStates;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.helpers.CryptoHelper;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.model.entities.Edecl_Result;
import ru.acs.fts.eps2.model.services.EnvelopeService;
import ru.acs.fts.eps2.model.services.ProcedureService;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.defines.ProcedureUdFlags;
import ru.acs.fts.eps2.router.objects.EDDocument;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.objects.defines.DocumentSaveTypes;
import ru.acs.fts.eps2.router.objects.defines.DocumentUniquenesses;
import ru.acs.fts.eps2.router.persistence.operators.EnvelopeOperator;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.util.helpers.UUIDGen;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.ed_container.ContainerDocType;
import ru.acs.fts.schemas.album.ed_container.DocBodyType;
import ru.acs.fts.schemas.album.ed_container.EDContainerType;
import ru.acs.fts.schemas.album.esadout_cu.ESADoutCUType;
import ru.acs.fts.schemas.album.inventory.InventoryType;
import ru.acs.fts.schemas.album.ktsout_cu.KTSoutCUType;
import ru.acs.fts.schemas.album.notifgtdregistration.NotifGTDRegistrationType;
import ru.acs.fts.schemas.album.notifmeasures.NotifMeasuresType;
import ru.acs.fts.schemas.album.reqesadinfo.ReqESADInfoType;
import ru.acs.fts.schemas.envelope.ApplicationInfType;
import ru.acs.fts.schemas.envelope.BodyType;
import ru.acs.fts.schemas.envelope.CustomsType;
import ru.acs.fts.schemas.envelope.EDHeaderType;
import ru.acs.fts.schemas.envelope.EnvelopeType;
import ru.acs.fts.schemas.envelope.HeaderType;
import ru.acs.fts.schemas.envelope.RoutingInfType;

public class DtRequestHelper
{
	public static Edecl_Proc_Information getRequestedGTD( 
			String dtCustomsCode, String dtGTDNumber, LocalDate dtRegDate,
			EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws DatabaseException
	{
		ProcedureService procSrv = jobBatchContext.getServiceHolder( ).getProcedureService( );				
		return procSrv.getProcessIdByGtdNumber( dtGTDNumber, dtCustomsCode, dtRegDate.toDate( ) );
	}	
	
	public static Edecl_Msg_Doc searchMsg11058( 
			Edecl_Proc_Information procInfo,
			EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws DatabaseException
	{
		EnvelopeOperator envOp = jobBatchContext.getServiceHolder( ).getEnvelopeOperator( );
		return envOp.getProcessDocuments_Msg11058( procInfo.getProcessId( ) );
	}
	
	public static EDEnvelope createMsg11020( 
			Edecl_Proc_Information procInfo,
			EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws FailedException
	{
		try
		{
			CurrentDocuments cdocs = getCurrentDocuments(
				procInfo, jobBatchContext, jobContext 
			);
			
			if ( null == cdocs || null == cdocs.container || null == cdocs.gtdRegistration )
				throw new FailedException( ResultCodes._02_00001_01 );
			
			List< EDDocument > innerDocs = new ArrayList< EDDocument >( );
			for ( String cDocId : cdocs.container.getContainerDocuments( ).keySet( ) )
			{
				EDDocument cdoc = cdocs.container.getDocumentInContainer( cDocId );
				
				if ( cdoc.isDocumentOfClass( ESADoutCUType.class ) ||
					 cdoc.isDocumentOfClass( InventoryType.class ) ||
					 cdoc.isDocumentOfClass( KTSoutCUType.class ) )
				{
					cdoc.setUniqueness( DocumentUniquenesses.NOT_UNIQ );
					cdoc.setSaveType( DocumentSaveTypes.INSERT );
					
					innerDocs.add( cdoc );
				}
			}
			
			cdocs.gtdRegistration.setUniqueness( DocumentUniquenesses.NOT_UNIQ );
			cdocs.gtdRegistration.setSaveType( DocumentSaveTypes.INSERT );
			
			innerDocs.add( cdocs.gtdRegistration );
			
			EDContainerType msg11020Cnt = createContainer( innerDocs );
						
			/**
			 * Собираем конверт
			 */
			EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
			
			String recipientSys = BusinessSystems.CUSTOMS;
			String messageType = MessageType.MSG_11020;
			String initialEnvelopeId = null;
			String incomeEnvelopeId = null;
			
			RtuCodePatternsHolder matcher = 
				jobBatchContext.getConfigurator( ).getRtuPatternsHolder( );
			if ( ! matcher.match( procInfo.getBorderCustCode( ) ) )
			{
				recipientSys = BusinessSystems.EPS;
				messageType = MessageType.ADM_11020;
				
				initialEnvelopeId = recvEnv.getEnvelopeID( );
				incomeEnvelopeId = recvEnv.getEnvelopeID( );
				if ( jobBatchContext.getReceivedEnvelope( ).getMessageType( ).equalsIgnoreCase( MessageType.PVR_00001 ) )
				{
					initialEnvelopeId = recvEnv.getInitialEnvelopeID( );
					incomeEnvelopeId = recvEnv.getInitialEnvelopeID( );
				}
			}
			else
			{
				initialEnvelopeId = recvEnv.getEnvelopeID( );
				if ( jobBatchContext.getReceivedEnvelope( ).getMessageType( ).equalsIgnoreCase( MessageType.PVR_00001 ) )
				{
					initialEnvelopeId = recvEnv.getInitialEnvelopeID( );
				}
			}
			
			CustomsType senderCustoms = new CustomsType( );
			senderCustoms.setCustomsCode( procInfo.getCustCode( ) );
			senderCustoms.setExchType( Integer.toString( procInfo.getExchType( ) ) );
			
			CustomsType receiverCustoms = new CustomsType( );
			receiverCustoms.setCustomsCode( procInfo.getBorderCustCode( ) );
			receiverCustoms.setExchType( Integer.toString( procInfo.getExchType( ) ) );
				
			ApplicationInfType appInfo = new ApplicationInfType( );
			appInfo.setSoftKind( recvEnv.getApplicationInfo( ).getSoftKind( ) );
			appInfo.setSoftVersion( recvEnv.getApplicationInfo( ).getSoftVersion( ) );
			
			RoutingInfType rInfo = new RoutingInfType( );
			rInfo.setEnvelopeID( UUIDGen.getUUID( ).toString( ) );
			rInfo.setInitialEnvelopeID( initialEnvelopeId );
			rInfo.setPreparationDateTime( new DateTime( ) );
			rInfo.setSenderInformation( EnvelopeCreator.getSenderInformation( 
				recipientSys, receiverCustoms, 
				recvEnv.getParticipantID( ) 
			) );
			rInfo.setReceiverInformationList( EnvelopeCreator.getReceiverInformation( 
				recipientSys, receiverCustoms, 
				recvEnv.getParticipantID( ) 
			) );
			
			EDHeaderType edHeader = new EDHeaderType( );
			edHeader.setMessageType( messageType );
			edHeader.setParticipantID( procInfo.getParticipantId( ) ); 
			edHeader.setProccessID( procInfo.getProcessId( ) );
			edHeader.setReceiverCustoms( receiverCustoms );
			edHeader.setSenderCustoms( senderCustoms );
			
			List< Object > headerAnys = new ArrayList< Object >( );
			headerAnys.add( appInfo );
			headerAnys.add( rInfo );
			headerAnys.add( edHeader );
			
			HeaderType header = new HeaderType( );
			header.setAnyList( headerAnys );
			
			List< Object > bodyAnys = new ArrayList< Object >( );
			bodyAnys.add( msg11020Cnt );
			
			BodyType body = new BodyType( );
			body.setAnyList( bodyAnys );
			
			EnvelopeType msg11020Env = new EnvelopeType( );
			msg11020Env.setHeader( header );
			msg11020Env.setBody( body );
			
			EDEnvelope msg11020 = new EDEnvelope( msg11020Env, BusinessSystems.EPS );
			msg11020.setSaveEnvelope( true );
			msg11020.setSaveDocument( true );
			msg11020.setIncomeEnvelopeID( incomeEnvelopeId );
			msg11020.setRecipientSystem( recipientSys );
						
			/**
			 * Ну и подпишем его
			 */
			CryptoHelper.signEnvelope( msg11020, false );
						
			for ( String cDocId : msg11020.getDocument( ).getContainerDocuments( ).keySet( ) )
			{
				EDDocument cdoc = msg11020.getDocument( ).getDocumentInContainer( cDocId );
				cdoc.setUniqueness( DocumentUniquenesses.NOT_UNIQ );
			}
			
			return msg11020;
		}
		catch ( Exception exc )
		{
			throw new FailedException( exc );
		}
	}
	
	public static EDEnvelope createMsg11031( 
			Edecl_Proc_Information procInfo,
			String customsPersonName, String customsPersonLNP,
			String dtCustomsCode, String dtGTDNumber, LocalDate dtRegDate,
			EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws FailedException
	{
		try
		{
			ReqESADInfoType reqESAD = new ReqESADInfoType( );
			
			reqESAD.setDocumentModeID( DocumentModeIDs.REQ_ESAD_INFO );
			reqESAD.setDocumentID( UUIDGen.getUUID( ).toString( ) );
			
			CustomsPersonType cperson = new CustomsPersonType( );
			cperson.setPersonName( customsPersonName );
			cperson.setLNP( customsPersonLNP );
			reqESAD.setCustomsPerson( cperson );
			
			ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType gtdid = 
				new ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType( );
			
			gtdid.setCustomsCode( dtCustomsCode );
			gtdid.setGTDNumber( dtGTDNumber );
			gtdid.setRegistrationDate( dtRegDate );
			reqESAD.setGTDID( gtdid );
			
			/**
			 * Собираем конверт
			 */
			
			EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
			
			CustomsType receiverCustoms = new CustomsType( );
			receiverCustoms.setCustomsCode( procInfo.getCustCode( ) );
			receiverCustoms.setExchType( Integer.toString( procInfo.getExchType( ) ) ); // HERE
	
			ApplicationInfType appInfo = new ApplicationInfType( );
			appInfo.setSoftKind( recvEnv.getApplicationInfo( ).getSoftKind( ) );
			appInfo.setSoftVersion( recvEnv.getApplicationInfo( ).getSoftVersion( ) );
			
			RoutingInfType rInfo = new RoutingInfType( );
			rInfo.setEnvelopeID( UUIDGen.getUUID( ).toString( ) );
			rInfo.setPreparationDateTime( new DateTime( ) );
			rInfo.setSenderInformation( EnvelopeCreator.getSenderInformation( 
				BusinessSystems.CUSTOMS, receiverCustoms, 
				recvEnv.getParticipantID( ) 
			) );
			rInfo.setReceiverInformationList( EnvelopeCreator.getReceiverInformation( 
				BusinessSystems.CUSTOMS, receiverCustoms, 
				recvEnv.getParticipantID( ) 
			) );
			
			EDHeaderType edHeader = new EDHeaderType( );
			edHeader.setMessageType( MessageType.MSG_11031 ); // HERE
			edHeader.setParticipantID( procInfo.getParticipantId( ) );
			edHeader.setProccessID( procInfo.getProcessId( ) );
			edHeader.setReceiverCustoms( receiverCustoms );
			
			List< Object > headerAnys = new ArrayList< Object >( );
			headerAnys.add( appInfo );
			headerAnys.add( rInfo );
			headerAnys.add( edHeader );
			
			HeaderType header = new HeaderType( );
			header.setAnyList( headerAnys );
			
			List< Object > bodyAnys = new ArrayList< Object >( );
			bodyAnys.add( reqESAD );
			
			BodyType body = new BodyType( );
			body.setAnyList( bodyAnys );
			
			EnvelopeType msg11031Env = new EnvelopeType( );
			msg11031Env.setHeader( header );
			msg11031Env.setBody( body );
			
			EDEnvelope msg11031 = new EDEnvelope( msg11031Env, BusinessSystems.EPS );
			
			msg11031.setRecipientSystem( BusinessSystems.CUSTOMS );			
			msg11031.setSaveEnvelope( true );
			msg11031.setSaveDocument( true );
			
			/**
			 * Ну и подпишем его
			 */
			CryptoHelper.signEnvelope( msg11031, false );
			
			return msg11031;			
		}
		catch ( Exception exc )
		{
			throw new FailedException( exc );
		}
	}		

	private static NotifMeasuresType createNotifMeasures( Edecl_Proc_Information procInfo )
	{
		NotifMeasuresType xdoc = new NotifMeasuresType( );
		xdoc.setDocumentID( UUIDGen.getUUID( ).toString( ) );
		xdoc.setDocSign( "3" );
		
		xdoc.setDocumentModeID( DocumentModeIDs.NOTIF_MEASURES );
		
		SimpleDateFormat fmt = new SimpleDateFormat( "ddMMyy" );
		
		String comment = String.format( 
			"ДТ № %s/%s/%s. Сверка товаров не требуется.",
			procInfo.getGtdIdCustCode( ),
			fmt.format( procInfo.getGtdIdDate( ) ),
			procInfo.getGtdIdRegNum( )
		);
		List< String > comments = new ArrayList< String >( );
		comments.add( comment );
		xdoc.setCommentList( comments );
		
		ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType gtdid = 
				new ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType( );
			
		gtdid.setCustomsCode( procInfo.getGtdIdCustCode( ) );
		gtdid.setGTDNumber( procInfo.getGtdIdRegNum( ) );
		gtdid.setRegistrationDate( new LocalDate ( procInfo.getGtdIdDate( ) ) );
		xdoc.setRegNumberDT( gtdid );
		
		return xdoc;
	}
	
	public static EDEnvelope createMsg11059_Local( 
			Edecl_Proc_Information procInfo,
			EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws FailedException
	{
		try
		{
			EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
			
			CustomsType senderCustoms = new CustomsType( );
			senderCustoms.setCustomsCode( procInfo.getBorderCustCode( ) );
			senderCustoms.setExchType( Integer.toString( procInfo.getExchType( ) ) );
			
			CustomsType receiverCustoms = new CustomsType( );
			receiverCustoms.setCustomsCode( procInfo.getCustCode( ) );
			receiverCustoms.setExchType( Integer.toString( procInfo.getExchType( ) ) );
			
			String recipientSystem = BusinessSystems.CUSTOMS;			
			String messageType = MessageType.MSG_11059;
			
			EDEnvelope msg11059 = EnvelopeCreator.createFluentMessage( 
				messageType, procInfo.getProcessId( ), procInfo.getParticipantId( ), 
				recvEnv.getApplicationInfo( ).getMessageKind( ), 
				recvEnv.getApplicationInfo( ).getSoftKind( ),
				recvEnv.getApplicationInfo( ).getSoftVersion( ), 
				BusinessSystems.EPS, senderCustoms, 
				recipientSystem, receiverCustoms, 
				createNotifMeasures( procInfo )
			);
			
			if ( ProcedureUdFlags.isRemoteRemoteness( procInfo.getUdFlag( ) ) )
			{
				if ( recvEnv.getMessageType( ).equals( MessageType.PVR_00001 ) )
				{
					msg11059.setIncomeEnvelopeID( recvEnv.getInitialEnvelopeID( ) );
					// msg11059.setInitialEnvelopeID( recvEnv.getInitialEnvelopeID( ) );
				}
				else
				{
					msg11059.setIncomeEnvelopeID( recvEnv.getEnvelopeID( ) );
					// msg11059.setInitialEnvelopeID( recvEnv.getEnvelopeID( ) );
				}
			}
			
			/**
			 * Ну и подпишем его
			 */
			CryptoHelper.signEnvelope( msg11059, false );
			
			return msg11059;
		}
		catch ( Exception exc )
		{
			throw new FailedException( exc );
		}
	}	
	
	public static EDEnvelope createMsg11059_Remote( 
			Edecl_Proc_Information procInfo,
			EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws FailedException
	{
		try
		{
			EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
			
			CustomsType senderCustoms = new CustomsType( );
			senderCustoms.setCustomsCode( procInfo.getCustCode( ) );
			senderCustoms.setExchType( Integer.toString( procInfo.getExchType( ) ) );
			
			CustomsType receiverCustoms = new CustomsType( );
			receiverCustoms.setCustomsCode( procInfo.getBorderCustCode( ) );
			receiverCustoms.setExchType( Integer.toString( procInfo.getExchType( ) ) );
			
			String recipientSystem = ProcedureUdFlags.isRemoteRemoteness( procInfo.getUdFlag( ) )
				? BusinessSystems.EPS
				: BusinessSystems.CUSTOMS;
			
			String messageType = ProcedureUdFlags.isRemoteRemoteness( procInfo.getUdFlag( ) )
				? MessageType.ADM_11059
				: MessageType.MSG_11059;
			
			EDEnvelope msg11059 = EnvelopeCreator.createFluentMessage( 
				messageType, procInfo.getProcessId( ), procInfo.getParticipantId( ), 
				recvEnv.getApplicationInfo( ).getMessageKind( ), 
				recvEnv.getApplicationInfo( ).getSoftKind( ),
				recvEnv.getApplicationInfo( ).getSoftVersion( ), 
				BusinessSystems.EPS, senderCustoms, 
				recipientSystem, receiverCustoms, 
				createNotifMeasures( procInfo )
			);
			
			//if ( ProcedureUdFlags.isRemoteRemoteness( procInfo.getUdFlag( ) ) )
			{
				if ( recvEnv.getMessageType( ).equals( MessageType.PVR_00001 ) )
				{
					msg11059.setIncomeEnvelopeID( recvEnv.getInitialEnvelopeID( ) );
					msg11059.setInitialEnvelopeID( recvEnv.getInitialEnvelopeID( ) );
				}
				else
				{
					msg11059.setIncomeEnvelopeID( recvEnv.getEnvelopeID( ) );
					msg11059.setInitialEnvelopeID( recvEnv.getEnvelopeID( ) );
				}
			}
			
			/**
			 * Ну и подпишем его
			 */
			CryptoHelper.signEnvelope( msg11059, false );
			
			return msg11059;
		}
		catch ( Exception exc )
		{
			throw new FailedException( exc );
		}
	}
	
	
	public static EDContainerType createContainer( List< EDDocument > innerDocs ) // NO_UCD (use private)
	{
		EDContainerType container = new EDContainerType( );
		
		container.setDocumentModeID( DocumentModeIDs.ED_CONTAINER );
		container.setDocumentID( UUIDGen.getUUID( ).toString( ) );
	
		List< ContainerDocType > cdocs = new ArrayList< ContainerDocType >( );
		container.setContainerDocList( cdocs );
		
		for ( EDDocument idoc : innerDocs )
		{
			DocBodyType dbody = new DocBodyType( );
			dbody.setAny( idoc.getRawDocument( ) );
			
			ContainerDocType cdoc = new ContainerDocType( );
			cdoc.setDocBody( dbody );
			
			cdocs.add( cdoc );
		}
		
		return container;
	}	
	
	public static CurrentDocuments getCurrentDocuments(  // NO_UCD (use private)
			Edecl_Proc_Information procInfo,
			EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws DatabaseException
	{
		EnvelopeService envSrv = jobBatchContext.getServiceHolder( ).getEnvelopeService( );
		EnvelopeOperator envOp = jobBatchContext.getServiceHolder( ).getEnvelopeOperator( );
		
		CurrentDocuments cdocs = new CurrentDocuments( );
		
		// List< Edecl_Msg_Doc > procDocs = envSrv.getProcessDocument( procInfo.getProcessId( ) );
		List< Edecl_Msg_Doc > procDocs = envOp.getProcessDocuments_Msg11026( procInfo.getProcessId( ) );
		for ( Edecl_Msg_Doc pdoc : procDocs )
		{
			if ( pdoc.getDocumentModeId( ).equalsIgnoreCase( DocumentModeIDs.ED_CONTAINER ) ||
				 pdoc.getDocumentModeId( ).equalsIgnoreCase( DocumentModeIDs.NOTIF_GTD_REGISTRATION ) )
			{
				try
				{
					EnvelopeUnmarshaller envUnmarshaller = new EnvelopeUnmarshaller( );
					Unmarshaller unmarshaller = jobBatchContext.getServiceHolder( ).getUnmarshaller( );
					
					Object rdoc = envUnmarshaller.unmarshallBaseDocOrSignature( 
						pdoc.getBody( ), unmarshaller 
					);
										
					EDDocument xdoc = new EDDocument( rdoc );
					
					if ( xdoc.isDocumentOfClass( EDContainerType.class ) &&
						 pdoc.getState( ).equalsIgnoreCase( DocumentStates.CURRENT ) )
					{
						cdocs.container = xdoc;
					}
					else if ( xdoc.isDocumentOfClass( NotifGTDRegistrationType.class ) )
					{
						// NotifGTDRegistrationType gtdReg = ( NotifGTDRegistrationType )odoc;
						Edecl_Result res = envSrv.getResultInfoByDocument( xdoc.getDocumentID( ) );
						
						if ( ResultCodes.areCodesEquals( ResultCodes._00_00000_00, res.getResultCode( ) ) )
						{
							xdoc.setUniqueness( DocumentUniquenesses.NOT_UNIQ );
							xdoc.setSaveType( DocumentSaveTypes.INSERT );
							
							cdocs.gtdRegistration = xdoc;
						}
					}
				}
				catch ( Exception exc )
				{
				}
			}				
		}
		
		return cdocs;
	}	
	
	public static class FailedException extends Exception
	{
		private static final long serialVersionUID = 414528636082617415L;
		
		private final String _resultCode;
		
		public FailedException( Throwable th ) // NO_UCD (use private)
		{
			super( th );
			
			_resultCode = ResultCodes._09_96669_99;
		}
		
		public FailedException( String resultCode )
		{
			_resultCode = resultCode;
		}
		
		public FailedException( String resultCode, Throwable th ) // NO_UCD (unused code)
		{
			super( th );
			
			_resultCode = resultCode;
		}
		
		// @formatter:off
		public String getResultCode( ) { return _resultCode; }
		// @formatter:on
	}
	
	public static class CurrentDocuments  // NO_UCD (use private)
	{
		public EDDocument container = null;
		public EDDocument gtdRegistration = null;
	}
}
