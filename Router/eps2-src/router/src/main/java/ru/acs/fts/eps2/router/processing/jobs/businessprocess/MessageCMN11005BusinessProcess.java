package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.configuration.RtuCodePatternsHolder;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.helpers.CryptoHelper;
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.model.services.ProcedureService;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.defines.ProcedureUdFlags;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.utils.StringUtil;
import ru.acs.fts.schemas.envelope.CustomsType;

public class MessageCMN11005BusinessProcess extends BusinessProcess
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
			 * Случай когда CMN.11005 объявляется на внешнем РТУ
			 * Такой случай должен возникать только тогда udFlag=4
			 */
				
			if ( ProcedureUdFlags.isRrwTransit( procInfo.getUdFlag( ) ) )
			{
				Map< String, String > messageTypeSubstituion = new HashMap< String, String >( );
				messageTypeSubstituion.put( MessageType.CMN_11005, MessageType.ADM_15005 );
					
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
		
		EDEnvelope cmn11005 = EnvelopeCreator.createTranzitMessage( 
			null, recvEnv, 
			BusinessSystems.DECLARANT, null 
		);
			
		envelopes.add( cmn11005 );
			
		// CMN.00004
			
		EDEnvelope cmn00004 = EnvelopeCreator.createNotificationMessage( 
			MessageType.CMN_00004, recvEnv, ResultCodes._00_00000_00, 
			recvEnv.getSenderSystem( ), recvEnv.getSenderCustoms( ) 
		);
			
		CryptoHelper.signEnvelope( cmn00004, false );
			
		envelopes.add( cmn00004 );
			
		// РЖД Транзит
		
		/*
		if ( ProcedureUdFlags.isRrwTransit( procInfo.getUdFlag( ) ) )
		{
			CustomsType receiverCustoms = new CustomsType( );
			receiverCustoms.setCustomsCode( jobBatchContext.getConfigurator( ).getAsktt2CustomsCode( ) );
			receiverCustoms.setExchType( Integer.toString( procInfo.getExchType( ) ) );
				
			EDEnvelope cmn11005_asktt2 = EnvelopeCreator.createTranzitMessage( 
				null, recvEnv, 
				BusinessSystems.ASKTT2, receiverCustoms 
			);
				
			envelopes.add( cmn11005_asktt2 );
		}
		*/
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
