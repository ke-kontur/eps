package ru.acs.fts.aly.router.tasks;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.util.StopWatch;

import ru.acs.fts.aly.model.entities.AlyRzdReports;
import ru.acs.fts.aly.model.entities.AlyRzdReportsMaking;

public class RzdReportsTask
{
	private static final Logger log = LoggerFactory.getLogger( RzdReportsTask.class );
	
	private RzdReportsExecutor _rzdReportsExecutor;
	
	// @formatter:off
	@Required public void setRzdReportsExecutor( RzdReportsExecutor rzdReportsExecutor ) { _rzdReportsExecutor = rzdReportsExecutor; }
	public RzdReportsExecutor getRzdReportsExecutor( ) { return _rzdReportsExecutor; }
	// @formatter:on
	
	public void execute( )
	{
		try
		{
			List< AlyRzdReportsMaking > requested = _rzdReportsExecutor.getRequestedReportsMaking( );
			for ( AlyRzdReportsMaking making : requested )
			{
				StopWatch sw = new StopWatch( );
				try
				{
					sw.start( );
					
					_rzdReportsExecutor.beginMakingProcessing( making );
					Map< Integer, AlyRzdReports > days = _rzdReportsExecutor.makeReport( making );
					_rzdReportsExecutor.persistReport( days );
					_rzdReportsExecutor.completeMakingProcessing( making );
					
					sw.stop( );
					
					long millis = sw.getLastTaskTimeMillis( ) / 1000;
					log.info( String.format( 
						"[:] Построение %d заняло %d:%d.%d",
						making.getDstamp( ).intValue( ),
						millis / 60, millis % 60, 
						sw.getLastTaskTimeMillis( ) % 1000 
					) );
				}
				catch ( Throwable t2 )
				{
					if ( sw.isRunning( ) )
						sw.stop( );
					
					log.info( ":(", t2 );
				}
			}
		}
		catch ( Throwable t )
		{
			log.info( ":'(", t );
		}
	}
}
