package ru.acs.fts.eps2.router.processing.jobs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.jobs.businessprocess.BusinessProcess;
import ru.acs.fts.eps2.router.processing.jobs.businessprocess.BusinessProcessWarehouse;
import ru.acs.fts.eps2.engine.processing.system.ErrorQueueTypes;

public class BusinessProcessing extends EDJob
{
	protected final Logger log = LoggerFactory.getLogger( BusinessProcessing.class );
	
	protected final String action = "Бизнес-обработка полученных данных";
	protected final String errorQueueToSend = ErrorQueueTypes.ERROR_FATAL;
	protected BusinessProcessWarehouse businessProcessWarehouse;

	public BusinessProcessing( )
	{
		super( );
		super.errorQueueToSend = errorQueueToSend;
	}

	@Required
	public void setBusinessProcessWarehouse( BusinessProcessWarehouse businessProcessWarehouse ) { this.businessProcessWarehouse = businessProcessWarehouse; }
	public BusinessProcessWarehouse getBusinessProcessWarehouse( ) { return businessProcessWarehouse; }

	@Override
	public void edExecute( EDJobBatchContext jobBatchContext, JobContext jobContext )
		throws Exception
	{
		BusinessProcess process = businessProcessWarehouse.getSelected( jobBatchContext );
		if ( null == process )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._09_96669_99, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
			
		process.executeProcess( jobBatchContext, jobContext );
		jobBatchContext.getProcessingResult( ).addOKProcessingInfo( action );
	}

	@Override
	public String getAction( )
	{
		return action;
	}
}