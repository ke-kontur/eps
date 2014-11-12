package ru.acs.fts.eps2.router.processing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.engine.processing.JobBatchContext;
import ru.acs.fts.eps2.engine.processing.JobBatchContextFactory;

public class EDJobBatchContextFactory extends JobBatchContextFactory
{
	protected static final Logger log = LoggerFactory.getLogger( EDJobBatchContextFactory.class );
	
	protected String _senderSystem;

	// @formatter:off
	/* @Required */
	public void setSenderSystem( String senderSystem ) { _senderSystem = senderSystem; }
	public String getSenderSystem( ) { return _senderSystem; }
	
	public void setConfigurator( EDConfigurator configurator ) { super.setConfigurator( configurator ); }
	// @formatter:on

	/**
	 * Мы получили сообщение, теперь нам надо по этому сообщению сформировать
	 * JobBatchContext для последующей обработки. Результаты нашего труда в этой
	 * функции будут использоваться в дальнейшем для выбора соответствующего
	 * JobBatch'а
	 */
	@Override
	public JobBatchContext create( byte[ ] message ) 
		throws BaseProcessingException
	{
		EDJobBatchContext jobBatchContext = new EDJobBatchContext( getConfigurator( ), getServiceHolder( ) );
		jobBatchContext.setMessage( message );
		jobBatchContext.setSenderSystem( _senderSystem );

		return jobBatchContext;
	}
		
	@Override
	public EDConfigurator getConfigurator( )
	{
		return ( EDConfigurator ) super.getConfigurator( );
	}
}
