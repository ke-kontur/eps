package ru.acs.fts.eps2.router.processing.jobs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.restWs.event.EventRestWs;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;

public class SendEventsJob extends EDJob
{
	private static final Logger log = LoggerFactory.getLogger( SendEventsJob.class );
	private EventRestWs eventRestWs;
	
	// @formatter:off
	public void setEventRestWs( EventRestWs eventRestWs ) { this.eventRestWs = eventRestWs; }
	public EventRestWs getEventRestWs( ) { return eventRestWs; }
	// @formatter:on
	
	@Override
	protected void edExecute( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		if ( jobBatchContext.getConfigurator( ).getUseEventService( ) )
		{
			log.info( "Начинаю отправку событий..." );
			
			try
			{
				eventRestWs.postNewEvents( jobBatchContext.getStashedEvents( ) );
				if ( null != jobBatchContext.getContextException( ) )
				{
					eventRestWs.postException( jobBatchContext.getContextException( ), jobBatchContext.getReceivedEnvelope( ).getEnvelopeID( ) );
				}
				
				log.info( "События успешно отправлены." );
			}
			catch ( Exception ex )
			{
				log.info( "При попытке отправить запрос на сохранение событий произошла ошибка: {}", ex.getMessage( ) );
				// throw ex;
			}						
		}
	}
	
	@Override
	public String getAction( )
	{
		return "Отправляем подготовленные события в веб-сервис событий.";
	}
}
