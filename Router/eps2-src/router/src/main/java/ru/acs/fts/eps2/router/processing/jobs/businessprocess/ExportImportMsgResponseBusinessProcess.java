package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.Date;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.data.kind.CompressType;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.defines.SpecialProcedureStates;
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.model.entities.MessageLineage;
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
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.ed_container.ContainerDocType;
import ru.acs.fts.schemas.album.ed_container.EDContainerType;
import ru.acs.fts.schemas.album.esadout_cu.ESADoutCUType;
import ru.acs.fts.schemas.album.gtdoutcustomsmark.GTDOutCustomsMarkType;
import ru.acs.fts.schemas.envelope.CustomsType;
import ru.acs.fts.schemas.envelope.EDHeaderType;
import ru.acs.fts.schemas.envelope.SignatureType;

/**
 * @author SAA
 * <p>
 * JobBatchContext:<p>
 * Ожидается, что в контексте по ключу "transit" располагается транзитное MSG.11023
 */
public class ExportImportMsgResponseBusinessProcess extends BusinessProcess
{
	private final static String transitName = "transit";
	
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		if ( ! checkProcess( recvEnv ) )
		{
			if ( isMsg11024( recvEnv ) )
			{
				ErrorHelper.throwException( 
					jobBatchContext, 
					ResultCodes._01_00041_01, 
					ProcessingConstants.ERROR_TYPE_BUSINESS 
				);
			}
			else
			{
				_serviceHolder.getProcedureService( ).persist( 
					createProcess( recvEnv, jobBatchContext ) 
				);
			}
		}
		
		prepareTransit( recvEnv, jobBatchContext );
	}
	
	private Edecl_Proc_Information createProcess( EDEnvelope recvEnv, EDJobBatchContext jobBatchContext ) 
		throws Exception
	{
		Edecl_Proc_Information process = new Edecl_Proc_Information( );
		process.setProcessId( recvEnv.getProcessID( ) );
		process.setSoftVersion( recvEnv.getSoftVersion( ) );
		process.setCurrentState( SpecialProcedureStates.getDefaultState( ) );
		
		EDHeaderType header = recvEnv.getEDHeader( );
		CustomsType recvCustoms = header.getReceiverCustoms( );
		CustomsType senderCustoms = header.getSenderCustoms( );
		
		int exchType = Integer.valueOf( recvCustoms.getExchType( ) );
		process.setExchType( exchType );
		process.setParticipantId( recvEnv.getParticipantID( ) );
		process.setCustCode( senderCustoms.getCustomsCode( ) );
		process.setBorderCustCode( recvCustoms.getCustomsCode( ) );
		process.setUdFlag( ProcedureUdFlags.REMOTE_REMOTENESS );
		process.setCompressType( CompressType.XML.toString( ) );
		
		setupInfo( recvEnv, process, jobBatchContext );
		
		EDDocument esadOutDoc = recvEnv.getDocument( ).getDocumentInContainer( ESADoutCUType.class );
		if ( null == esadOutDoc )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._03_00011_01, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
		
		ESADoutCUType esadOut = esadOutDoc.getDocumentAsClass( ESADoutCUType.class ); 

		if ( esadOut != null )
		{
			process.setTransferType( esadOut.getCustomsProcedure( ) );
			process.setCustProcedureCode( esadOut.getCustomsModeCode( ) );
		}
		
		EDDocument gtdOutCustomsMarkDoc = recvEnv.getDocument( ).getDocumentInContainer( GTDOutCustomsMarkType.class );
		if ( null == gtdOutCustomsMarkDoc )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._03_00011_01, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);			
		}

		GTDOutCustomsMarkType gtdOutCustomsMark = gtdOutCustomsMarkDoc.getDocumentAsClass( GTDOutCustomsMarkType.class ); 
		
		if ( gtdOutCustomsMark != null )
		{
			process.setGtdIdCustCode( gtdOutCustomsMark.getGTDID( ).getCustomsCode( ) );
			process.setGtdIdDate( gtdOutCustomsMark.getGTDID( ).getRegistrationDate( ).toDate( ) );
			process.setGtdIdRegNum( gtdOutCustomsMark.getGTDID( ).getGTDNumber( ) );
		}
		
		
		MessageLineage ml = new MessageLineage( );
		ml.setEnvelopeId( process.getProcessId( ) );
		ml.setLineageId( recvEnv.getLineageId( ) );
		jobBatchContext.getServiceHolder( ).getEnvelopeService( ).persist( ml );		

		return process;
	}
	
	private Edecl_Proc_Information findProcess( String processId ) 
		throws DatabaseException
	{
		ProcedureService procedureService = _serviceHolder.getProcedureService( );
		Edecl_Proc_Information process = procedureService.getProcInformation( processId );
		
		return process;
	}
	
	private boolean checkProcess( EDEnvelope recvEnv ) 
		throws DatabaseException
	{
		String processId = recvEnv.getProcessID( );		
		return null != findProcess( processId );
	}
	
	private void prepareTransit( EDEnvelope recvEnv, EDJobBatchContext jobBatchContext ) 
		throws ResultTypeException, DatabaseException
	{
		EDEnvelope transit = ( EDEnvelope ) jobBatchContext.get( transitName );
		
		EnvelopeCreator.reRouteMessage( 
			transit, transit.getSenderCustoms( ), 
			BusinessSystems.CUSTOMS, transit.getReceiverCustoms( ), 
			transit.getInitialEnvelopeID( ), 
			transit.getIncomeEnvelopeID( ) 
		);		
	}
		
	private void setUpInfoFromContainer( EDContainerType container, Edecl_Proc_Information process )
	{
		boolean isEsadOutCuSet = false;
		boolean isGtdOutCuSet = false;
		for ( ContainerDocType cdoc : container.getContainerDocList( ) )
		{
			Object cobj = cdoc.getDocBody( ).getAny( );
			if ( cobj instanceof SignatureType )
			{
				SignatureType sig = ( SignatureType )cobj;
				cobj = sig.getObject( ).getAny( );
			}
			
			if ( cobj instanceof ESADoutCUType )
			{
				ESADoutCUType esadOut = ( ESADoutCUType ) cobj;
				process.setTransferType( esadOut.getCustomsProcedure( ) );
				process.setCustProcedureCode( esadOut.getCustomsModeCode( ) );
				isEsadOutCuSet = true;
			}
			else if ( cobj instanceof GTDOutCustomsMarkType )
			{
				GTDIDType gtdid = ( ( GTDOutCustomsMarkType ) cobj ).getGTDID( );
				process.setGtdIdCustCode( gtdid.getCustomsCode( ) );
				Date gtdIdDate = gtdid.getRegistrationDate( ).toDateMidnight( ).toDate( );
				process.setGtdIdDate( gtdIdDate );
				process.setGtdIdRegNum( gtdid.getGTDNumber( ) );
				isGtdOutCuSet = true;
			}
			
			if ( isEsadOutCuSet && isGtdOutCuSet )
				break;
		}
	}
	
	private void setupInfo( 
			EDEnvelope recvEnv, 
			Edecl_Proc_Information process, EDJobBatchContext jobBatchContext ) 
		throws BaseProcessingException, DatabaseException
	{
		Object obj = recvEnv.getDocument( ).getNakedDocument( );
		
		if ( ! ( obj instanceof EDContainerType ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._01_00072_01, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
		
		setUpInfoFromContainer( ( EDContainerType ) obj, process );
	}
	
	private boolean isMsg11024( EDEnvelope recvEnv )
	{
		return MessageType.MSG_11024.equals( recvEnv.getMessageType( ) );
	}
}
