package ru.acs.fts.eps2.engine.processing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Задача для вызова вспомогательного батча
 * 
 * Параметры контекста
 * <p><strong>subBatch</strong> - ссылка на вспомогательный батч для выполнения</p>
 * 
 * @author mrdekk
 * @since 5.0.11/3.0.8
 */
public class CallSubBatchJob extends Job // NO_UCD (use default)
{
	private static final Logger log = LoggerFactory.getLogger( CallSubBatchJob.class );
	private static final String action = "Вызов вспомогательного батча";
	
	@Override
	public void execute( JobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		log.info( String.format( "Начали выполнять задачу: %s", action ) );

		/**
		 * Здесь в этом джобы мы не делаем ничего
		 * т.к. вся работа будет сделана JobExecutor'ом
		 * Этот класс нужен лишь для того, чтобы в JobExecutor'е
		 * сделать instanceof
		 */

		log.info( String.format( "Закончили выполнять задачу: %s", action ) );
	}

	@Override
	public String getAction( )
	{
		return action;
	}

}
