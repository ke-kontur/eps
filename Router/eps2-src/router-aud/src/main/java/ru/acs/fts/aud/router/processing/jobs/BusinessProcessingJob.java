package ru.acs.fts.aud.router.processing.jobs;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.aud.router.objects.AudEnvelope;
import ru.acs.fts.aud.router.processing.AudJobBatchContext;
import ru.acs.fts.aud.router.processing.jobs.bps.BusinessProcess;
import ru.acs.fts.eps2.engine.processing.JobContext;

public class BusinessProcessingJob extends AudJob
{
	private static final Logger log = LoggerFactory.getLogger( BusinessProcessingJob.class );
	
	private static final String ACTION = "Выполнение бизнес-обработки.";
	private Map< String, BusinessProcess > _businessProcesses;
	
	// @formatter:off
	@Required
	public void setBusinessProcesses( Map< String, BusinessProcess > businessProcesses ) { _businessProcesses = businessProcesses; }
	public Map< String, BusinessProcess > getBusinessProcesses( ) { return _businessProcesses; }
	// @formatter:on
	
	@Override
	public void audExecute( AudJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		AudEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		String messageKind = recvEnv.getMessageKind( );
		
		BusinessProcess businessProcess = getBusinessProcess( messageKind );
		
		if ( null == businessProcess )
		{
			String message = String.format( "Для MessageKind = '%s' не найден обработчик бизнес-процесса!", messageKind );
			log.info( "Ошибка бизнес-обработки: {}", message );
			throw new Exception( message );
		}
		
		businessProcess.process( jobBatchContext, jobContext );
		
		jobBatchContext.getProcessingResult( ).addOKProcessingInfo( ACTION );
	}

	@Override
	public String getAction( )
	{
		return ACTION;
	}
	
	private BusinessProcess getBusinessProcess( String messageKind )
	{
		return _businessProcesses.get( messageKind );
	}
}
