package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.List;
import java.util.Map;

import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.helpers.CryptoHelper;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;

/**
 * Простой транзит в рамках процедуры с учетом удаленки
 * 
 * <h1>Параметры JobContext:</h1>
 * <ul>
 * <li><strong>mapping</strong>: Преобразование MessageType для сообщения на ТО</li>
 * </ul>
 */
public class TranzitInProcRemotenesRemoteBusinessProcess extends BusinessProcess
{
	private static final String MAPPING = "mapping";
	
	@Override
	@SuppressWarnings( "unchecked" )
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) throws Exception
	{
		Map< String, String > mapping = ( Map< String, String > )jobContext.get( MAPPING );
		
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		List< EDEnvelope > envelopes = createAndPutEnvelopes( jobBatchContext, jobContext );
		
		EDEnvelope transit = EnvelopeCreator.createTranzitMessage( 
			mapping, recvEnv, 
			BusinessSystems.CUSTOMS, recvEnv.getReceiverCustoms( )
		);
		
		envelopes.add( transit );
		
		EDEnvelope adm00006 = EnvelopeCreator.createNotificationMessage( 
			MessageType.ADM_00006, recvEnv, ResultCodes._00_00000_00, 
			BusinessSystems.EPS, recvEnv.getSenderCustoms( )
		);
		
		CryptoHelper.signEnvelope( adm00006, false );
		
		envelopes.add( adm00006 );
	}
}
