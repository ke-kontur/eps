package ru.acs.fts.aud.router.processing.jobs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.aud.router.model.ServerStatisticsBundle;
import ru.acs.fts.aud.router.model.managers.ServerStatisticManager;
import ru.acs.fts.aud.router.processing.AudJobBatchContext;
import ru.acs.fts.aud.router.processing.definitions.AudContextConstants;
import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;

public class UpdateServerStatisticsJob extends AudJob
{
	private static final Logger log = LoggerFactory.getLogger( UpdateServerStatisticsJob.class );
	
	private static final String ACTION = "Сохранение текущей статистики работы сервера.";
	
	private ServerStatisticManager _serverStatisticManager;
	
	// @formatter:off
	@Required public void setServerStatisticManager( ServerStatisticManager manager ) { _serverStatisticManager = manager; }
	public ServerStatisticManager getServerStatisticManager( ) { return _serverStatisticManager; }
	// @formatter:on
	
	@Override
	public void audExecute( AudJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		if ( needIncrement( jobBatchContext, jobContext ) )
		{
			log.info( "Ошибок нет. Текущий запрос помечается как успешный." );
			jobBatchContext.getServerStatistics( ).increaseSuccessfulRequetsCount( );
		}
		
		ServerStatisticsBundle serverStatistics = jobBatchContext.getServerStatistics( );
		if ( null == serverStatistics )
			throw new Exception( "Ошибка сохранения статистики: статистика работы сервера не инициализирована!" );
		 
		_serverStatisticManager.updateServerStatistics( serverStatistics );
		 
		log.info( "Статистика успешно обновлена." );
	}

	@Override
	public String getAction( )
	{
		return ACTION;
	}
	
	private boolean needIncrement( AudJobBatchContext jobBatchContext, JobContext jobContext )
	{
		return jobContext.getBoolean( AudContextConstants.INC_SUCCESSFUL_REQ ) && 
				ProcessingConstants.ERROR_TYPE_NORMAL.equalsIgnoreCase( jobBatchContext.getRunningMode( ) );
	}
}
