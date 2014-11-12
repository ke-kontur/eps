package ru.acs.fts.eps2.engine.processing;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.error.EmergencyBatchException;
import ru.acs.fts.eps2.engine.error.ExceptionSerializer;
import ru.acs.fts.eps2.engine.processing.automata.RunningModeTransmission;
import ru.acs.fts.eps2.engine.processing.automata.RunningModeTransmissionFSM;
import ru.acs.fts.eps2.engine.processing.selectors.BaseSelector;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.utils.StringUtil;

/**
 * Класс который выполняет пакеты задач (JobBatch)
 * 
 * @author mrdekk
 * @since 5.0.11/3.0.8
 */
public class JobExecutor2
{
	private static final Logger _log = LoggerFactory.getLogger( JobExecutor2.class );
	
	/**
	 * Хранилище пакетов задач, который этот исполнитель может обрабатывать
	 */
	private BaseWarehouse< JobBatchContext, JobBatch, BaseSelector< JobBatch, JobBatchContext > > _jobBatchesWarehouse;
	
	/**
	 * Хранилище пакетов задач для обработки ошибочных ситуаций
	 */
	private BaseWarehouse< JobBatchContext, JobBatch, BaseSelector< JobBatch, JobBatchContext > > _failedJobBatchesWarehouse;
	
	/**
	 * Пакет задач для предварительной обработки сообщений
	 * ( обычно тут делается десериализация и проверка предыдущих обработок )
	 */
	private JobBatch _preProcessingJobBatch;
	
	/**
	 * Пакет задач для постобработки
	 * ( здесь можно выполнять какие-то общие для всех пакетов задачи, кроме того
	 *   можно выполнять различное логирование и мониторинг )
	 */
	private JobBatch _postProcessingJobBatch;
	
	/**
	 * Пакет задач для обработки исключительных ситуаций, которые не могут быть разрешены
	 * в рамках данного исполнителя и исключительная ситуация будет проброшена выше по 
	 * цепочке вызовов
	 * ( как правило сохраняет информацию об обработке сообщения в некоторое хранилище )
	 */
	private JobBatch _exceptionalJobBatch;

	/**
	 * Класс для логирования производимых операций, в том числе на сервис логирования
	 */
	private JobExecutionLog _executionLog;
	
	/**
	 * Автомат переходов при ошибочных ситуациях
	 */
	private RunningModeTransmissionFSM _transmissionFSM;
	
	// @formatter:off
	public void setJobBatchesWarehouse( BaseWarehouse< JobBatchContext, JobBatch, BaseSelector< JobBatch, JobBatchContext > > jobBatchesWarehouse ) { _jobBatchesWarehouse = jobBatchesWarehouse; }
	public BaseWarehouse< JobBatchContext, JobBatch, BaseSelector< JobBatch, JobBatchContext > > getJobBatchesWarehouse( ) { return _jobBatchesWarehouse; }
	
	public void setFailedJobBatchesWarehouse( BaseWarehouse< JobBatchContext, JobBatch, BaseSelector< JobBatch, JobBatchContext > > failedJobBatchesWarehouse ) { _failedJobBatchesWarehouse = failedJobBatchesWarehouse; }
	public BaseWarehouse< JobBatchContext, JobBatch, BaseSelector< JobBatch, JobBatchContext > > getFailedJobBatchesWarehouse( ) { return _failedJobBatchesWarehouse; }
	
	public void setPreProcessingJobBatch( JobBatch preProcessingJobBatch ) { _preProcessingJobBatch = preProcessingJobBatch; }
	public JobBatch getPreProcessingJobBatch( ) { return _preProcessingJobBatch; }
	
	public void setPostProcessingJobBatch( JobBatch postProcessingJobBatch ) { _postProcessingJobBatch = postProcessingJobBatch; }
	public JobBatch getPostProcessingJobBatch( ) { return _postProcessingJobBatch; }
	
	public void setExceptionalJobBatch( JobBatch exceptionalJobBatch ) { _exceptionalJobBatch = exceptionalJobBatch; }
	public JobBatch getExceptionalJobBatch( ) { return _exceptionalJobBatch; }
	
	public void setExecutionLog( JobExecutionLog executionLog ) { _executionLog = executionLog; }
	public JobExecutionLog getExecutionLog( ) { return _executionLog; }
	
	public void setTransmissionFSM( RunningModeTransmissionFSM transmissionFSM ) { _transmissionFSM = transmissionFSM; }
	public RunningModeTransmissionFSM getTransmissionFSM( ) { return _transmissionFSM; }
	// @formatter:on
	
	public void execute( JobBatchContext jobBatchContext )
		throws Exception
	{
		try
		{
			_executionLog.logStartExecute( jobBatchContext );
			
			pipe( _preProcessingJobBatch, jobBatchContext );		
			_executionLog.logReceivedMessage( jobBatchContext );
			
			JobBatch jobBatch = selectJobBatch( jobBatchContext );
			if ( jobBatch instanceof JobBatchDoNothing )
				return ;
			
			pipe( jobBatch, jobBatchContext );		
			
			pipe( _postProcessingJobBatch, jobBatchContext );
			
			ProcessingResult processingResult = jobBatchContext.getProcessingResult( );
			if ( processingResult.processStateIsOk( ) )
			{
				_executionLog.log5000( jobBatchContext );
			}
			else
			{
				String errorCode = jobBatchContext.getInitialFailedResultCode( );
				String message = String.format( "Ошибка! Код результата = %s.", errorCode );
				
				_executionLog.log6000( message, jobBatchContext );
			}
		}
		catch ( EmergencyBatchException e )
		{
			try
			{
				pipe( e.getEmergencyBatch( ), jobBatchContext );
			}
			catch ( BaseProcessingException bpe )
			{
				pipeException( null, bpe, jobBatchContext );
			}
			catch ( Exception exc )
			{
				pipeExceptionRollback( exc, jobBatchContext );
			}
		}
		catch ( Exception e )
		{
			if ( e instanceof NullPointerException )
			{
				_executionLog.logException( e, jobBatchContext );
				
				pipeException( 
					null, 
					jobBatchContext.getErrors( ).convert( ( NullPointerException )e, jobBatchContext ), 
					jobBatchContext 
				);
			}
			else 
			{
				pipeExceptionRollback( e, jobBatchContext );
			}
		}
	}
	
	private void pipe( JobBatch jobBatch, JobBatchContext jobBatchContext )
		throws Exception
	{
		_executionLog.logStartJobBatch( jobBatch, jobBatchContext );
		
		check( jobBatch, jobBatchContext );
		
		List< PreparedJob > jobs = jobBatch.getPreparedJobs( );
		for ( PreparedJob pjob : jobs )
		{
			try
			{
				Job job = pjob.getJob( );
				if ( job instanceof CallSubBatchJob )
				{
					JobContext jobCtx = pjob.getJobContext( );
					JobBatch jbatch = ( JobBatch )jobCtx.get( ContextConstants.SUB_BATCH );
					
					pipeSubBatch( jbatch, jobBatchContext );
				}
				else
				{
					_executionLog.logStartJob( pjob, jobBatchContext );
					pjob.execute( jobBatchContext );
					_executionLog.logFinishJob( pjob, jobBatchContext );
				}
			}
			catch ( DatabaseException exc )
			{
				_executionLog.logException( exc, jobBatchContext );
				
				pipeException( pjob, jobBatchContext.getErrors( ).convert( exc, jobBatchContext ), jobBatchContext );
				return ;
			}
			catch ( BaseProcessingException exc )
			{
				pipeException( pjob, exc, jobBatchContext );
				return ;
			}
		}
		
		_executionLog.logFinishJobBatch( jobBatch, jobBatchContext );
	}

	private void pipeSubBatch( JobBatch jobBatch, JobBatchContext jobBatchContext )
		throws Exception
	{
		_executionLog.logStartJobBatch( jobBatch, jobBatchContext );
		
		check( jobBatch, jobBatchContext );
		
		List< PreparedJob > jobs = jobBatch.getPreparedJobs( );
		for ( PreparedJob pjob : jobs )
		{
			Job job = pjob.getJob( );
			if ( job instanceof CallSubBatchJob )
			{
				JobContext jobCtx = pjob.getJobContext( );
				JobBatch jbatch = ( JobBatch )jobCtx.get( ContextConstants.SUB_BATCH );
				
				pipe( jbatch, jobBatchContext );
			}
			else
			{
				_executionLog.logStartJob( pjob, jobBatchContext );
				pjob.execute( jobBatchContext );
				_executionLog.logFinishJob( pjob, jobBatchContext );
			}
		}
		
		_executionLog.logFinishJobBatch( jobBatch, jobBatchContext );
	}
	
	private void pipeException( 
			PreparedJob pjob, BaseProcessingException problem, 
			JobBatchContext jobBatchContext )
		throws Exception
	{
		_executionLog.logInterruptedJob( pjob, problem, jobBatchContext );				
		jobBatchContext.getProcessingResult( ).setProcessingState( ProcessingState.FAILED );
		
		processProblem( problem, jobBatchContext );
		
		try
		{
			pipe( _exceptionalJobBatch, jobBatchContext );
		}
		catch ( BaseProcessingException exc )
		{
			_log.debug( String.format(
				"В процессе обработки ошибки произошла ошибка %s",
				exc.getMessage( )
			) );
		}
		
		if ( problem.getNeedRollBack( ) )
			throw problem;
		
		if ( null == jobBatchContext.getErrorQueueToSend( ) && 
			 pjob != null && pjob.getJob( ) != null && 
			 pjob.getJob( ).getQueueToSendError( ) != null )
		{
			jobBatchContext.setErrorQueueToSend( pjob.getJob( ).getQueueToSendError( ) );
		}
		
		String failScenario = jobBatchContext.getFailScenario( );
		if ( ! StringUtil.isNullOrEmpty( failScenario ) &&
			 ! failScenario.equalsIgnoreCase( ProcessingConstants.FAIL_SCENARIO_KILL ) )
		{
			JobBatch jobBatch = _failedJobBatchesWarehouse.getSelected( jobBatchContext );
			
			_executionLog.logFailScenarioJobBatch( jobBatch, jobBatchContext );

			jobBatchContext.getProcessingResult( ).setProcessingState( ProcessingState.RUNNING );
			
			pipe( jobBatch, jobBatchContext );
		}
		else
		{
			_log.error( "Обработка ошибочной ситуации завершится отправкой сообщения в очередь ошибочных" );
		}		
	}
	
	private void pipeExceptionRollback( Exception problem, JobBatchContext jobBatchContext )
		throws Exception
	{
		_executionLog.logInterruptedJob( null, problem, jobBatchContext );				
		jobBatchContext.getProcessingResult( ).setProcessingState( ProcessingState.FAILED );
		
		processGenericProblem( problem, jobBatchContext );
		
		try
		{
			pipe( _exceptionalJobBatch, jobBatchContext );
		}
		catch ( BaseProcessingException exc )
		{
			_log.debug( String.format(
				"В процессе обработки ошибки произошла ошибка %s",
				exc.getMessage( )
			) );
		}
		
		throw problem;
	}
	
	private JobBatch selectJobBatch( JobBatchContext jobBatchContext ) 
		throws BaseProcessingException, DatabaseException
	{
		String failScenario = jobBatchContext.getFailScenario( );
		
		if ( ! StringUtil.isNullOrEmpty( failScenario ) )
		{			
			/** если у нас уже FAIL_SCENARIO_KILL, то нет смысла все это продолжать */
			if ( failScenario.equalsIgnoreCase( ProcessingConstants.FAIL_SCENARIO_KILL ) )
			{
				_executionLog.log6000( "FailScenario.Kill", jobBatchContext );
				return new JobBatchDoNothing( );
			}
			
			return _failedJobBatchesWarehouse.getSelected( jobBatchContext );
		}
		else
		{
			return _jobBatchesWarehouse.getSelected( jobBatchContext );
		}		
	}
	
	private void check( JobBatch jobBatch, JobBatchContext jobBatchContext )
		throws Exception
	{
		if ( null == jobBatch || 0 == jobBatch.size( ) )
		{
			String message = "Не определен пакет заданий";
			
			_executionLog.log6000( message, jobBatchContext );
			throw new Exception( message );
		}
	}
	
	private void processProblem( BaseProcessingException problem, JobBatchContext jobBatchContext )
	{
		jobBatchContext.setContextException( problem );
		
		RunningModeTransmission transmission = _transmissionFSM.select( 
			jobBatchContext.getRunningMode( ), 
			null != problem.getErrorType( ) 
				? problem.getErrorType( ) 
				: ProcessingConstants.ERROR_TYPE_UNKNOWN 
		);
		
		transmission.process( jobBatchContext );
		
		if ( null == jobBatchContext.getInitialFailedResultCode( ) || 
			 ResultCodes.isOk( jobBatchContext.getInitialFailedResultCode( ) ) )
		{
			jobBatchContext.setInitialFailedResultCode( problem.getResultCode( ) );
		}
		
		_executionLog.logError( jobBatchContext );
	}	
	
	private void processGenericProblem( Exception problem, JobBatchContext jobBatchContext )
	{
		RunningModeTransmission transmission = _transmissionFSM.select( 
			jobBatchContext.getRunningMode( ), ProcessingConstants.ERROR_TYPE_UNKNOWN 
		);
		
		transmission.process( jobBatchContext );
		
		if ( null == jobBatchContext.getInitialFailedResultCode( ) || 
			 ResultCodes.isOk( jobBatchContext.getInitialFailedResultCode( ) ) )
		{
			jobBatchContext.setInitialFailedResultCode( ResultCodes._09_96669_99 );
		}
		
		_executionLog.logError( jobBatchContext );
	}
}
