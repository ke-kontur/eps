package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.objects.EDDocument;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.schemas.album.calculationamountpayment.CalculationAmountPaymentType;
import ru.acs.fts.schemas.album.notifaddcontrol.NotifAddControlType;

public class TransitKastoToDeclNoRefBusinessProcess extends BusinessProcess
{

	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		if ( ! checkContainer( recvEnv ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._03_00014_01, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
	}
	
	private boolean checkContainer( EDEnvelope recvEnv )
	{
		boolean result = true;
		int notifAddControlCnt = 0;
		int calculationAmountPaymentCnt = 0;
		
		int size = recvEnv.getDocument( ).getContainerDocuments( ).size( );
		
		if ( size == 1 || size == 2 )
		{
			for ( String cDocId : recvEnv.getDocument( ).getContainerDocuments( ).keySet( ) )
			{
				EDDocument cdoc = recvEnv.getDocument( ).getDocumentInContainer( cDocId );
				
				if ( cdoc.isDocumentOfClass( NotifAddControlType.class ) )
					notifAddControlCnt++;
				else if ( cdoc.isDocumentOfClass( CalculationAmountPaymentType.class ) )
					calculationAmountPaymentCnt++;
				else
				{
					result = false;
					break;
				}
			}
			
			if ( result && notifAddControlCnt != 1  && calculationAmountPaymentCnt > 1 
					&& ( calculationAmountPaymentCnt + notifAddControlCnt != size ) )
				result = false;
		}
		else
			result = false;
		
		return result;
	}

}
