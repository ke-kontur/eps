package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.helpers.CryptoHelper;
import ru.acs.fts.eps2.engine.util.RemotenessHelper;
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.defines.ProcedureUdFlags;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.schemas.envelope.CustomsType;

public class MessageMSG11052BusinessProcess extends BusinessProcess
{
	private static final Logger log = LoggerFactory.getLogger( MessageMSG11052BusinessProcess.class );

	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		Edecl_Proc_Information procInfo = getProcessInfo( recvEnv, jobBatchContext );
		
		List< EDEnvelope > envelopes = createAndPutEnvelopes( jobBatchContext, jobContext );
		
		switch ( procInfo.getUdFlag( ) )
		{
			case ProcedureUdFlags.LOCAL_REMOTENESS: // нет удаленки
			{
				envelopes.add( createTransitToInnerCustoms( recvEnv, jobBatchContext, jobContext ) );
				envelopes.add( prepareCmn11095ToDecl( recvEnv, jobBatchContext ) );
				envelopes.add( createCmn00004( recvEnv, jobBatchContext, jobContext, BusinessSystems.CUSTOMS, true ) );
				break;
			}
				
			case ProcedureUdFlags.REMOTE_REMOTENESS:
			{	
				String recvCustomsCode = recvEnv.getReceiverCustoms( ).getCustomsCode( );
				if ( ! RemotenessHelper.isCustomsLocal( recvCustomsCode ) ) 
				{
					// внешнее РТУ
					envelopes.add( prepareMsg11052ToEps( recvEnv, jobBatchContext ) );
				}
				else 
				{
					// внутреннее РТУ
					envelopes.add( prepareCmn11095ToDecl( recvEnv, jobBatchContext ) );
					envelopes.add( createTransitToInnerCustoms( recvEnv, jobBatchContext, jobContext ) );
					envelopes.add( prepareAdm00006( recvEnv, jobBatchContext ) );
				}
				break;
			}
			
			default:
				log.info( "Для данного сообщения ожидаемые значения UD Flag у процедуры 1 или 2. Получено: {}.", procInfo.getUdFlag( ) );
				break;
		}
	}
	
	private EDEnvelope createCmn00004(
			EDEnvelope recvEnv,
			EDJobBatchContext jobBatchContext, JobContext jobContext,
			String recvSystem, boolean sign ) 
		throws Exception
	{
		EDEnvelope notif = EnvelopeCreator.createNotificationMessage( 
			MessageType.CMN_00004, recvEnv, ResultCodes._00_00000_00, 
			recvSystem, recvEnv.getSenderCustoms( ) 
		);
		
		if ( sign )
			CryptoHelper.signEnvelope( notif, false );
		
		return notif;
	}
	
	private Edecl_Proc_Information getProcessInfo( EDEnvelope recvEnv, EDJobBatchContext jobBatchContext ) 
		throws ResultTypeException, DatabaseException
	{
		Edecl_Proc_Information processInformation = _serviceHolder.getProcedureService( ).getProcedureInfo( 
			recvEnv.getProcessID( ), recvEnv.getParticipantID( ), recvEnv.getSoftVersion( ) 
		);
		
		if ( null == processInformation )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._01_00049_03, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
		
		return processInformation;
	}
	
	private EDEnvelope prepareMsg11052ToEps( 
			EDEnvelope recvEnv, EDJobBatchContext jobBatchContext ) 
		throws BaseProcessingException, DatabaseException
	{
		CustomsType recvCustoms = recvEnv.getReceiverCustoms( );
		
		EDEnvelope transit = EnvelopeCreator.createTranzitMessage( 
			null, recvEnv, 
			BusinessSystems.EPS, recvCustoms 
		);
				
		return transit;
	}
	
	private EDEnvelope prepareCmn11095ToDecl( 
			EDEnvelope recvEnv, EDJobBatchContext jobBatchContext ) 
		throws BaseProcessingException, DatabaseException
	{
		EDEnvelope transit = EnvelopeCreator.createTranzitMessage( 
			null, recvEnv, 
			BusinessSystems.DECLARANT, null 
		);

		transit.getEDHeader( ).setMessageType( MessageType.CMN_11095 );
		transit.getEDHeader( ).setSenderCustoms( recvEnv.getReceiverCustoms( ) );
		
		return transit;
	}
	
	private EDEnvelope prepareAdm00006( 
			EDEnvelope recvEnv, EDJobBatchContext jobBatchContext ) 
		throws Exception
	{
		CustomsType recvCustoms = recvEnv.getSenderCustoms( );
		
		EDEnvelope adm00006 = EnvelopeCreator.createNotificationMessage( 
			MessageType.ADM_00006, recvEnv, ResultCodes._00_00000_00, 
			BusinessSystems.EPS, recvCustoms 
		);
				
		CryptoHelper.signEnvelope( adm00006, false );
		
		return adm00006;
	}
}
