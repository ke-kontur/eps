package ru.acs.fts.eps2.engine.processing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PreparedJob // NO_UCD (use default)
{
	protected final Logger log = LoggerFactory.getLogger( PreparedJob.class ); // NO_UCD (use private)

	private Job job;
	private JobContext jobContext;
	
	// @formatter:off
	public final Job getJob( ) { return job; }	
	public JobContext getJobContext( ) { return jobContext; }
	// @formatter:on

	public PreparedJob( Job job, JobContext jobContext ) // NO_UCD (used by spring IoC context)
	{
		log.debug( String.format( "Создаем задачу: %s", job.getAction( ) ) );
		
		this.job = job;
		this.jobContext = jobContext;
	}

	public void execute( JobBatchContext jobBatchContext ) throws Exception // NO_UCD (use default)
	{
		log.debug( String.format( "НАЧИНАЕМ выполнение задачи: %s", job.getAction( ) ) );
		
		job.execute( jobBatchContext, jobContext );
		
		log.debug( String.format( "УСПЕШНО выполнили задачу: %s", job.getAction( ) ) );
	}
}
