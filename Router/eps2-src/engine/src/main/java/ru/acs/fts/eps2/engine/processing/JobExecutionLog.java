package ru.acs.fts.eps2.engine.processing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.acs.fts.eps2.core.processing.WarningLevels;
import ru.acs.fts.eps2.engine.processing.inspection.EventFactory;

/**
 * Класс для всяческого логирования 
 * ( дабы вынести это из JobExecutor'а и собрать все в одном месте )
 * 
 * @author mrdekk
 * @since 5.0.12/3.0.9
 */
public class JobExecutionLog // NO_UCD (use default)
{
	private static final Logger _log = LoggerFactory.getLogger( JobExecutionLog.class );
	
	private EventFactory _restEventFactory;
	
	// @formatter:off
	public void setRestEventFactory( EventFactory restEventFactory ) { _restEventFactory = restEventFactory; }
	public EventFactory getRestEventFactory( ) { return _restEventFactory; }
	// @formatter:on
	
	public void log( int warningLevel, String info, int processingStep, JobBatchContext jobBatchContext ) // NO_UCD (use private)
	{
		_restEventFactory.log( jobBatchContext, warningLevel, info, processingStep, _log );
	}
	
	public void logStartExecute( JobBatchContext jobBatchContext ) // NO_UCD (use default)
	{
		String msg = String.format( "Начали обработку сообщения" );
		
		log( WarningLevels.INFO, msg, jobBatchContext.getNextStage( ), jobBatchContext );
	}
	
	public void logReceivedMessage( JobBatchContext jobBatchContext ) // NO_UCD (use default)
	{
		String msg = "Получено и десериализовано новое сообщение";
		
		log( WarningLevels.INFO, msg, jobBatchContext.getNextStage( ), jobBatchContext );
	}	
	
	public void logStartJobBatch( JobBatch jobBatch, JobBatchContext jobBatchContext ) // NO_UCD (use default)
	{
		String msg = String.format(
			"Начали выполнять сценарий: %s",
			( ( jobBatch != null ) ? jobBatch.getDescription( ) : "<имя неизвестно>" )
		);
		
		log( WarningLevels.INFO, msg, jobBatchContext.getNextStage( ), jobBatchContext );
	}
	
	public void logFinishJobBatch( JobBatch jobBatch, JobBatchContext jobBatchContext ) // NO_UCD (use default)
	{
		String msg = String.format(
			"Пакет заданий выполнен. Результат: %s",
			( jobBatchContext.getProcessingResult( ).processStateIsOk( ) ? "Успех" : "Ошибка" ) 			
		);
		
		log( WarningLevels.INFO, msg, jobBatchContext.getNextStage( ), jobBatchContext );
	}
	
	public void logStartJob( PreparedJob job, JobBatchContext jobBatchContext ) // NO_UCD (use default)
	{
		String message = String.format(
			"Начали выполнять задачу: %s",
			job.getJob( ).getAction( )
		);
		
		log( WarningLevels.INFO, message, jobBatchContext.getNextStage( ), jobBatchContext );
	}
	
	public void logFinishJob( PreparedJob job, JobBatchContext jobBatchContext ) // NO_UCD (use default)
	{
		String message = String.format(
			"Закончили выполнять задачу: %s",
			job.getJob( ).getAction( )
		);
		
		log( WarningLevels.INFO, message, jobBatchContext.getNextStage( ), jobBatchContext );
	}
	
	public void logInterruptedJob(  // NO_UCD (use default)
			PreparedJob job, Exception problem, 
			JobBatchContext jobBatchContext )
	{
		String message = String.format(
			"Выполнение задачи ( %s ) было прервано ввиду проблемы: %s",
			( null != job ) ? job.getJob( ).getAction( ) : "<не известно>",
			problem.getLocalizedMessage( )
		);
		
		Throwable exc = problem;
		while ( null != exc && exc.getCause( ) != exc )
		{
			_log.info( "Информация об исключительной ситуация (EXCEPTION-INFORMATION): ", exc );
			exc = exc.getCause( );
		}
		
		log( WarningLevels.ERROR, message, jobBatchContext.getNextStage( ), jobBatchContext );
	}

	public void logException(  // NO_UCD (use default)
			Throwable t,
			JobBatchContext jobBatchContext )
	{
		Throwable exc = t;
		while ( null != exc && exc.getCause( ) != exc )
		{
			_log.info( "Информация об исключительной ситуация (EXCEPTION-INFORMATION): ", exc );
			exc = exc.getCause( );
		}
		
		// log( WarningLevels.ERROR, message, jobBatchContext.getNextStage( ), jobBatchContext );
	}
	
	public void log5000( JobBatchContext jobBatchContext ) // NO_UCD (use default)
	{
		String message = "Сообщение успешно обработано";
		
		log( WarningLevels.INFO, message, 5000, jobBatchContext );
	}	

	public void log6000( String message, JobBatchContext jobBatchContext )  // NO_UCD (use default)
	{
		log( WarningLevels.INFO, message, 6000, jobBatchContext );
	}

	public void logError( JobBatchContext jobBatchContext ) // NO_UCD (use default)
	{
		String message = String.format(
			"Установили режим обработки %s, ошибочный сценарий %s",
			jobBatchContext.getRunningMode( ),
			jobBatchContext.getFailScenario( )
		);
		
		log( WarningLevels.INFO, message, jobBatchContext.getNextStage( ), jobBatchContext );
	}

	public void logFailScenarioJobBatch( JobBatch jobBatch, JobBatchContext jobBatchContext ) // NO_UCD (use default)
	{
		String msg = String.format(
			"Начали выполнять fail-сценарий: %s",
			( ( jobBatch != null ) ? jobBatch.getDescription( ) : "<имя неопределено>" )
		);

		log( WarningLevels.INFO, msg, jobBatchContext.getNextStage( ), jobBatchContext );
	}

}
