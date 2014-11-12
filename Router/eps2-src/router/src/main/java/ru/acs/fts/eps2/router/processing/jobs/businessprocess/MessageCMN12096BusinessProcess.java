package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.schemas.album.tdtscustomsmark.TDTSCustomsMarkType;
import ru.acs.fts.schemas.album.tdtscustomsmark.TDTSType;

public class MessageCMN12096BusinessProcess extends BusinessProcess
{	
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		TDTSCustomsMarkType doc = recvEnv.getDocument( ).getDocumentAsClass( TDTSCustomsMarkType.class );
		
		Edecl_Proc_Information procInfo = _serviceHolder.getProcedureService( )
			.getProcInformation( recvEnv.getProcessID( ) );
		
		if ( null == procInfo )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._01_00049_03, 
				ProcessingConstants.ERROR_TYPE_AUTH 
			);
		}
		
		TDTSType tdts = doc.getTDTSRegNumber( );
		if ( null == tdts )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._09_96669_99, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
		
		procInfo.setGtdIdCustCode( tdts.getCustomsCode( ) );
		procInfo.setGtdIdDate( tdts.getRegistrationDate( ).toDate( ) );
		procInfo.setGtdIdRegNum( tdts.getGTDNumber( ) );
		
		_serviceHolder.getProcedureService( ).merge( procInfo );
	}
}
