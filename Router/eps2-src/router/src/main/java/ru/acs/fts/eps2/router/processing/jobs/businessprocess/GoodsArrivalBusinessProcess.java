package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.List;

import ru.acs.fts.eps2.engine.objects.Document;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.processing.helpers.CryptoHelper;
import ru.acs.fts.eps2.engine.util.RemotenessHelper;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.schemas.envelope.CustomsType;

public class GoodsArrivalBusinessProcess extends BusinessProcess
{
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) throws Exception
	{
		EDEnvelope recvEnvelope = jobBatchContext.getReceivedEnvelope( );
		
		CustomsType recvCustoms = recvEnvelope.getReceiverCustoms( );
		List< EDEnvelope > envelopes = createAndPutEnvelopes( jobBatchContext, jobContext );
		if ( RemotenessHelper.isCustomsLocal( recvCustoms.getCustomsCode( ) ) )
		{
			EDEnvelope transit = EnvelopeCreator.createTranzitMessage( 
					null, recvEnvelope, BusinessSystems.CUSTOMS, recvCustoms );
			
			String messageType = recvEnvelope.getMessageType( );
			if ( messageType.equals( MessageType.MSG_12012 ) )
			{
				Document doc = transit.getDocument( ).cloneWithoutSignature( );
				transit.setDocument( doc );
			}
			else if ( messageType.equals( MessageType.MSG_12013 ) ||
					  messageType.equals( MessageType.MSG_12014 ) )
			{
				CryptoHelper.signEnvelope( transit, false );
			}
			
			envelopes.add( transit );
		}
		else
		{
			EDEnvelope transit = EnvelopeCreator.createTranzitMessage( 
					null, recvEnvelope, BusinessSystems.EPS, recvCustoms );
			
			envelopes.add( transit );
		}
	}
}
