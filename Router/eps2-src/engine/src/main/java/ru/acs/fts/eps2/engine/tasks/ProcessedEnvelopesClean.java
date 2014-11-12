package ru.acs.fts.eps2.engine.tasks;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.eps2.engine.persistence.embedded.EnvelopeProcessingDatabase;
import ru.acs.fts.eps2.engine.persistence.embedded.EnvelopeManager;
import ru.acs.fts.eps2.engine.persistence.embedded.EnvelopeManagerSettings;
import ru.acs.fts.eps2.engine.persistence.embedded.EnvelopeProcessInfo;

public class ProcessedEnvelopesClean
{
	private static final Logger log = LoggerFactory.getLogger( ProcessedEnvelopesClean.class );
	
	private EnvelopeManager _envelopeManager;
	
	// @formatter:off
	@Required public void setEnvelopeManager( EnvelopeManager envelopeManager ) { _envelopeManager = envelopeManager; }
	public EnvelopeManager getEnvelopeManager( ) { return _envelopeManager; }
	// @formatter:on
	
	public void clean( )
	{
		log.info( "TASK: Начали выполнение чистки" );
		
		EnvelopeProcessingDatabase database = _envelopeManager.getDatabase( ); 
		EnvelopeManagerSettings settings = _envelopeManager.getSettings( );
		
		long date = System.currentTimeMillis( );
		Date bound = new Date( date - settings.getExpiration( ) );
		
		for ( EnvelopeProcessInfo envelopeProcessInfo : database.getDatabase( ).values( ) )
		{
			if ( envelopeProcessInfo.getProcessDateTime( ).after( bound ) )
				continue;
			
			log.info( String.format( 
				"Начали чистить EnvelopeProcessInfo %s",
				envelopeProcessInfo.getEnvelopeId( ) 
			) );
			
			database.getDatabase( ).remove( envelopeProcessInfo.getEnvelopeId( ) );
		}
		
	}
}
