package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.configuration.Configurator;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.data.kind.CompressType;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.helpers.CryptoHelper;
import ru.acs.fts.eps2.engine.util.RemotenessHelper;
import ru.acs.fts.eps2.model.defines.SpecialProcedureStates;
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.model.entities.MessageLineage;
import ru.acs.fts.eps2.model.services.ProcedureService;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.defines.ProcedureUdFlags;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.schemas.envelope.CustomsType;

public class GoodsArrangementBusinessProcess extends BusinessProcess
{
	private static final Logger log = LoggerFactory
			.getLogger( GoodsArrangementBusinessProcess.class );
	
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) throws Exception
	{
		EDEnvelope recvEnvelope = jobBatchContext.getReceivedEnvelope( );
		String senderSystem = recvEnvelope.getSenderSystem( );
		
		CustomsType recvCustoms = recvEnvelope.getReceiverCustoms( );
		String recvCustomsCode = recvCustoms.getCustomsCode( );
		
		List< EDEnvelope > envelopes = createAndPutEnvelopes( jobBatchContext, jobContext );
		
		if ( BusinessSystems.CUSTOMS.equals( senderSystem ) )
		{
			if ( RemotenessHelper.isCustomsLocal( recvCustomsCode ) )
			{
				EDEnvelope transit = EnvelopeCreator.createTranzitMessage( 
						/*messageTypeSubstituion*/ null, recvEnvelope, 
						BusinessSystems.CUSTOMS, recvCustoms );
				
				envelopes.add( transit );
				envelopes.add( createCmn00004( recvEnvelope, recvEnvelope.getSenderCustoms( ), jobBatchContext.getConfigurator( ) ) );
			}
			else
			{
				EDEnvelope transit = EnvelopeCreator.createTranzitMessage( 
						/*messageTypeSubstituion*/ null, recvEnvelope, 
						BusinessSystems.EPS, recvCustoms );
				
				envelopes.add( transit );
			}
		}
		else if ( BusinessSystems.EPS.equals( senderSystem ) )
		{
			EDEnvelope transit = EnvelopeCreator.createTranzitMessage( 
					/*messageTypeSubstituion*/ null, recvEnvelope, 
					BusinessSystems.CUSTOMS, recvCustoms );
			
			envelopes.add( transit );
		}
		else
		{
			log.info( "Неожиданная система-отправитель: {}. Ожидались системы: CUSTOMS или EPS.", senderSystem );
			
			ErrorHelper.throwException( 
					jobBatchContext, 
					ResultCodes._09_96669_99, 
					ProcessingConstants.ERROR_TYPE_UNKNOWN 
				);
		}
		
		if ( BusinessSystems.isSuchSystem( recvEnvelope.getSenderSystem( ), BusinessSystems.EPS ) )
		{
			if ( recvEnvelope.getMessageType( ).equalsIgnoreCase( MessageType.MSG_11055 ) ||
				 recvEnvelope.getMessageType( ).equalsIgnoreCase( MessageType.MSG_11067 ) )
			{
				ensureProcedure( recvEnvelope, jobBatchContext );
			}
		}
	}
	
	private EDEnvelope createCmn00004( EDEnvelope recvEnvelope, CustomsType recvCustoms, Configurator configurator ) 
		throws Exception
	{
		EDEnvelope cmn00004 = EnvelopeCreator.createNotificationMessage( 
				MessageType.CMN_00004, recvEnvelope, ResultCodes._00_00000_00, 
				BusinessSystems.CUSTOMS, recvCustoms );
		
		CryptoHelper.signEnvelope( cmn00004, false );
		
		return cmn00004;
	}
	
	
	private void ensureProcedure( EDEnvelope recvEnv, EDJobBatchContext jobBatchContext ) 
		throws DatabaseException
	{
		String processId = recvEnv.getProcessID( );

		ProcedureService procedureService = _serviceHolder.getProcedureService( );
		Edecl_Proc_Information procInfo = procedureService.getProcInformation( processId );

		if ( null == procInfo )
		{
			procInfo = new Edecl_Proc_Information( );

			procInfo.setProcessId( processId );
			procInfo.setSoftVersion( recvEnv.getSoftVersion( ) );
			procInfo.setCurrentState( SpecialProcedureStates.getDefaultState( ) );
			procInfo.setExchType( Integer.valueOf( recvEnv.getSenderCustoms( ).getExchType( ) ) );
			procInfo.setParticipantId( recvEnv.getParticipantID( ) );
			procInfo.setCustCode( recvEnv.getSenderCustoms( ).getCustomsCode( ) );

			procInfo.setBorderCustCode( recvEnv.getReceiverCustoms( ).getCustomsCode( ) );
			procInfo.setUdFlag( ProcedureUdFlags.REMOTE_REMOTENESS );
			procInfo.setCompressType( CompressType.XML.toString( ) );

			procedureService.persist( procInfo );
			
			MessageLineage ml = new MessageLineage( );
			ml.setEnvelopeId( procInfo.getProcessId( ) );
			ml.setLineageId( recvEnv.getLineageId( ) );
			jobBatchContext.getServiceHolder( ).getEnvelopeService( ).persist( ml );			
		}		
	}	
}
