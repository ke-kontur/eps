package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.joda.time.LocalDate;

import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.configuration.RtuCodePatternsHolder;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.data.kind.DocumentModeIDs;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.helpers.CryptoHelper;
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.model.services.ProcedureService;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.defines.ProcedureUdFlags;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDDocument;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.util.helpers.UUIDGen;
import ru.acs.fts.eps2.utils.StringUtil;
import ru.acs.fts.schemas.album.actinspection.ActInspectionType;
import ru.acs.fts.schemas.album.regnumberactinspection.RegNumberActInspectionType;
import ru.acs.fts.schemas.envelope.CustomsType;

public class MessageCMN11007BusinessProcess extends BusinessProcess
{

	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		List< EDEnvelope > envelopes = createAndPutEnvelopes( jobBatchContext, jobContext );
		
		Edecl_Proc_Information procInfo = getProcInfo( recvEnv, jobBatchContext );
		RtuCodePatternsHolder matcher = jobBatchContext.getConfigurator( ).getRtuPatternsHolder( );
		
		if ( null != recvEnv.getReceiverCustoms( ) &&
			 ! matcher.match( recvEnv.getReceiverCustoms( ).getCustomsCode( ) ) )
		{
			/**
			 * Случай когда CMN.11007 объявляется на внешнем РТУ
			 * Такой случай должен возникать только тогда udFlag=4
			 */
			
			if ( ProcedureUdFlags.isRrwTransit( procInfo.getUdFlag( ) ) )
			{
				Map< String, String > messageTypeSubstituion = new HashMap< String, String >( );
				messageTypeSubstituion.put( MessageType.CMN_11007, MessageType.ADM_15007 );
				
				EDEnvelope transit = EnvelopeCreator.createTranzitMessage( 
					messageTypeSubstituion, recvEnv, 
					BusinessSystems.EPS, recvEnv.getReceiverCustoms( ) 
				);
				
				envelopes.add( transit );
			}
			else
			{
				jobBatchContext.put( "udFlagNotOk", true );
			}
			
			return ;
		}
		
		// Сообщение декларанту
		
		EDEnvelope cmn11007 = EnvelopeCreator.createTranzitMessage( 
			null, recvEnv, 
			BusinessSystems.DECLARANT, null 
		);
		
		envelopes.add( cmn11007 );
		
		// CMN.00004
		
		EDEnvelope cmn00004 = EnvelopeCreator.createNotificationMessage( 
			MessageType.CMN_00004, recvEnv, ResultCodes._00_00000_00, 
			recvEnv.getSenderSystem( ), recvEnv.getSenderCustoms( ) 
		);
		
		CryptoHelper.signEnvelope( cmn00004, false );
		
		envelopes.add( cmn00004 );
		
		// РЖД Транзит
		
		if ( ProcedureUdFlags.isRrwTransit( procInfo.getUdFlag( ) ) )
		{
			CustomsType receiverCustoms = new CustomsType( );
			receiverCustoms.setCustomsCode( jobBatchContext.getConfigurator( ).getAsktt2CustomsCode( ) );
			receiverCustoms.setExchType( Integer.toString( procInfo.getExchType( ) ) );
			
			EDEnvelope cmn11007_asktt2 = EnvelopeCreator.createTranzitMessage( 
				null, recvEnv, 
				BusinessSystems.ASKTT2, receiverCustoms 
			);
			
			envelopes.add( cmn11007_asktt2 );
		}
		
		// Экономический оператор
		
		if ( ProcedureUdFlags.isEconomicOperator( procInfo.getUdFlag( ) ) )
		{
			RegNumberActInspectionType regNumberActInspection = new RegNumberActInspectionType( );

			regNumberActInspection.setDocumentID( UUIDGen.getUUID( ).toString( ) );
			regNumberActInspection.setRefDocumentID( recvEnv.getDocument( ).getDocumentID( ) );
			regNumberActInspection.setDocumentModeID( DocumentModeIDs.REG_NUMBER_ACT_INSPECTION_DOC_MODE_ID );

			List< String > actNumbers = new ArrayList< String >( );
			regNumberActInspection.setActNumberList( actNumbers );		

			for ( String cDocId : recvEnv.getDocument( ).getContainerDocuments( ).keySet( ) )
			{
				EDDocument cdoc = recvEnv.getDocument( ).getDocumentInContainer( cDocId );
				if ( ! cdoc.isDocumentOfClass( ActInspectionType.class ) )
					continue;
				
				ActInspectionType actInsp = cdoc.getDocumentAsClass( ActInspectionType.class );
				actNumbers.add( actInsp.getActNumber( ) );
			}

			regNumberActInspection.setInspectionDate( LocalDate.now( ) );
			
			CustomsType receiverCustoms = new CustomsType( );
			receiverCustoms.setCustomsCode( jobBatchContext.getConfigurator( ).getAsktt2CustomsCode( ) );
			receiverCustoms.setExchType( recvEnv.getSenderCustoms( ).getExchType( ) );
			
			EDEnvelope msg11038 = EnvelopeCreator.createFluentMessage( 
				MessageType.MSG_11038, recvEnv.getProcessID( ), recvEnv.getParticipantID( ), 
				recvEnv.getApplicationInfo( ).getMessageKind( ), 
				recvEnv.getApplicationInfo( ).getSoftKind( ),
				recvEnv.getApplicationInfo( ).getSoftVersion( ), 
				BusinessSystems.EPS, recvEnv.getSenderCustoms( ), 
				BusinessSystems.ASKTT2, receiverCustoms, 
				regNumberActInspection
			);
			
			CryptoHelper.signEnvelope( msg11038, false );
			
			envelopes.add( msg11038 );
		}
	}

	private Edecl_Proc_Information getProcInfo( EDEnvelope recvEnv, EDJobBatchContext jobBatchContext ) 
		throws ResultTypeException, DatabaseException
	{
		String processId = recvEnv.getProcessID( );
		if ( StringUtil.isNullOrEmpty( processId ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._01_00049_03, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
		
		ProcedureService procServ = jobBatchContext.getServiceHolder( ).getProcedureService( );
		Edecl_Proc_Information procInfo = procServ.getProcInformation( processId );
		if ( null == procInfo )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._01_00049_03, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);			
		}
		
		return procInfo;
	}
}
