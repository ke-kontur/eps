package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.io.ByteArrayInputStream;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.joda.time.LocalDate;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.data.kind.DocumentModeIDs;
import ru.acs.fts.eps2.engine.processing.JobBatchContext;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.helpers.CryptoHelper;
import ru.acs.fts.eps2.model.entities.Edecl_Errlist;
import ru.acs.fts.eps2.model.entities.Edecl_Messages;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.model.services.ErrListService;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDDocument;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.objects.defines.DocumentSaveTypes;
import ru.acs.fts.eps2.router.objects.defines.DocumentUniquenesses;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.DtRequestHelper;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.util.helpers.UUIDGen;
import ru.acs.fts.eps2.utils.StringUtil;
import ru.acs.fts.schemas.admin.int_dtresponce.INTDTResponseType;
import ru.acs.fts.schemas.envelope.CustomsType;

public class MessageADM00008BusinessProcess extends BusinessProcess
{
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
				
		List< EDEnvelope > envelopes = createAndPutEnvelopes( jobBatchContext, jobContext );
		List< EDEnvelope > envelopesVersions = createAndPutEnvelopesVersions( jobBatchContext, jobContext );

		Edecl_Messages incomeMsg = jobBatchContext.getIncomeMessage( );
		Edecl_Msg_Doc incomeDoc = ( null != incomeMsg ) ? jobBatchContext.getIncomeMessageDocument( ) : null;
		if ( null == incomeMsg || null == incomeDoc )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._02_00001_01, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
		
		Edecl_Proc_Information procInfo = jobBatchContext.getServiceHolder( )
			.getProcedureService( ).getProcedureInformation( recvEnv.getProcessID( ) );
		
		if ( null == procInfo )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._01_00049_03, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
		
		String exchSpec = procInfo.getSoftVersion( ).split( "/" )[ 1 ];
		Edecl_Msg_Doc msg11058 = DtRequestHelper.searchMsg11058( procInfo, jobBatchContext, jobContext );		
		
		if ( exchSpec.compareTo( "3.2.4" ) < 0 || null != msg11058 )
		{
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance( );
			DocumentBuilder db = dbf.newDocumentBuilder( );
			Document doc = db.parse( new ByteArrayInputStream( incomeDoc.getBody( ) ) );
			
			XPathFactory xpf = XPathFactory.newInstance( );
			XPath xp = xpf.newXPath( );
			
			XPathExpression customsPersonNameXp = xp.compile( "//*[local-name()='ReqESADInfo']/*[local-name()='CustomsPerson']/*[local-name()='PersonName']/text()" );
			XPathExpression customsPersonLNPXp = xp.compile( "//*[local-name()='ReqESADInfo']/*[local-name()='CustomsPerson']/*[local-name()='LNP']/text()" );
			XPathExpression gtdidCustomsCodeXp = xp.compile( "//*[local-name()='ReqESADInfo']/*[local-name()='GTDID']/*[local-name()='CustomsCode']/text()" );
			XPathExpression gtdidGTDNumberXp = xp.compile( "//*[local-name()='ReqESADInfo']/*[local-name()='GTDID']/*[local-name()='GTDNumber']/text()" );
			XPathExpression gtdidRegistrationDateXp = xp.compile( "//*[local-name()='ReqESADInfo']/*[local-name()='GTDID']/*[local-name()='RegistrationDate']/text()" );
			
			Node customsPersonNameN = ( Node )customsPersonNameXp.evaluate( doc, XPathConstants.NODE );
			Node customsPersonLNPN = ( Node )customsPersonLNPXp.evaluate( doc, XPathConstants.NODE );
			Node gtdidCustomsCodeN = ( Node )gtdidCustomsCodeXp.evaluate( doc, XPathConstants.NODE );
			Node gtdidGTDNumberN = ( Node )gtdidGTDNumberXp.evaluate( doc, XPathConstants.NODE );
			Node gtdidRegistrationDateN = ( Node )gtdidRegistrationDateXp.evaluate( doc, XPathConstants.NODE );
			
			EDEnvelope msg11031 = DtRequestHelper.createMsg11031( 
				procInfo, 
				customsPersonNameN.getNodeValue( ),
				customsPersonLNPN.getNodeValue( ),
				gtdidCustomsCodeN.getNodeValue( ),
				gtdidGTDNumberN.getNodeValue( ),
				new LocalDate( gtdidRegistrationDateN.getNodeValue( ) ),
				jobBatchContext, jobContext 
			);
				
			envelopes.add( msg11031 );
		}
		else
		{
			EDEnvelope msg11059local = DtRequestHelper.createMsg11059_Local( 
				procInfo, jobBatchContext, jobContext 
			);

			envelopes.add( msg11059local );			
		}
		
		if ( procInfo.getSoftVersion( ).equalsIgnoreCase( incomeMsg.getSoftVersion( ) ) )
		{
			/**
			 * Исходное сообщение было в той же версии
			 */			
			EDEnvelope cmn00004 = EnvelopeCreator.createNotificationMessage( 
				MessageType.CMN_00004, recvEnv, ResultCodes._00_00000_00, 
				BusinessSystems.EPS, recvEnv.getSenderCustoms( ) 
			);
			
			cmn00004.setInitialEnvelopeID( recoverMsg11026Inital( recvEnv, jobBatchContext ) );
			
			CryptoHelper.signEnvelope( cmn00004, false );
			
			envelopes.add( cmn00004 );
		}
		else
		{
			/**
			 * Исходное сообщение было в другой версии
			 * надо бы послать PVR.00002
			 */
			
			EDDocument responseDoc = createDTResponseDocument( 
				incomeDoc.getDocumentID( ), ResultCodes._00_00000_00, 
				jobBatchContext, jobContext 
			);
				
			EDEnvelope responseEnv = createDTResponse( 
				incomeMsg, recvEnv,
				incomeMsg.getRcvCustomCode( ).toString( ), incomeMsg.getSoftVersion( ),
				responseDoc, 
				jobBatchContext, jobContext 
			);
					
			envelopesVersions.add( responseEnv );			
		}
	}
	
	private EDDocument createDTResponseDocument( 
			String documentId, String resultCode,
			EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws BaseProcessingException, DatabaseException
	{
		INTDTResponseType response = new INTDTResponseType( );
		
		response.setDocumentID( UUIDGen.getUUID( ).toString( ) );
		response.setRefDocumentID( documentId );
		response.setDocumentModeID( DocumentModeIDs.INT_DT_RESPONSE );
		
		response.setResultCode( resultCode );
		
		ErrListService errSrv = jobBatchContext.getServiceHolder( ).getErrListService( );
		Edecl_Errlist errList = errSrv.getErrList( resultCode );
		response.setResultDescription( null != errList ? errList.getPublicDescription( ) : "" );
		
		EDDocument xdoc = new EDDocument( response );
		xdoc.setUniqueness( DocumentUniquenesses.UNIQ );
		xdoc.setSaveBody( true );
		xdoc.setSaveType( DocumentSaveTypes.INSERT );
		
		return xdoc;
	}
	
	private EDEnvelope createDTResponse(
			Edecl_Messages pvr00001, EDEnvelope recvEnv, 
			String requestCustomsCode, String requestSoftVersion, 
			EDDocument response,
			JobBatchContext jobBatchContext, JobContext jobContext ) 
		throws BaseProcessingException, DatabaseException
	{
		CustomsType receiverCustoms = new CustomsType( );
		receiverCustoms.setCustomsCode( requestCustomsCode );
		receiverCustoms.setExchType( recvEnv.getReceiverCustoms( ).getExchType( ) );
		
		EDEnvelope respEnvelope = EnvelopeCreator.createFluentMessage( 
			MessageType.PVR_00002, null, recvEnv.getParticipantID( ), 
			null, null, requestSoftVersion, 
			BusinessSystems.EPS, recvEnv.getReceiverCustoms( ), 
			BusinessSystems.EPS, receiverCustoms, 
			response.getRawDocument( ) 
		);
		
		respEnvelope.setDocument( response );
		
		// respEnvelope.setInitialEnvelopeID( pvr00001.getInitialEnvelopeId( ) );
		respEnvelope.setInitialEnvelopeID( recvEnv.getEnvelopeID( ) );
		respEnvelope.setRecipientSystem( BusinessSystems.BALANCER );
		
		return respEnvelope;
	}

	private String recoverMsg11026Inital( EDEnvelope recvEnv, EDJobBatchContext jobBatchContext ) 
		throws ResultTypeException, DatabaseException
	{
		String initialEnvelopeId = recvEnv.getInitialEnvelopeID( );
		if ( StringUtil.isNullOrEmpty( initialEnvelopeId ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._03_00028_01, 
				ProcessingConstants.ERROR_TYPE_CHECK 
			);
		}
		
		String incomeEnvelopeId = _serviceHolder.getEnvelopeService( )
			.getIncomeEnvelopeIdByInitialEnvelopeId( initialEnvelopeId );
		if ( StringUtil.isNullOrEmpty( incomeEnvelopeId ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._03_00028_01, 
				ProcessingConstants.ERROR_TYPE_CHECK 
			);
		}
		
		return incomeEnvelopeId;
	}
}
