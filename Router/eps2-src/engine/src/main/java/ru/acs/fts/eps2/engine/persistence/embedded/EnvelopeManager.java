package ru.acs.fts.eps2.engine.persistence.embedded;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;

public class EnvelopeManager
{
	private final Logger log = LoggerFactory.getLogger( EnvelopeManager.class );

	private EnvelopeProcessingDatabase _database;
	private EnvelopeManagerSettings _settings;

	// @formatter:off
	@Required public void setDatabase( EnvelopeProcessingDatabase database ) { _database = database; }
	public EnvelopeProcessingDatabase getDatabase( ) { return _database; }
	
	@Required public void setSettings( EnvelopeManagerSettings settings ) { _settings = settings; }
	public EnvelopeManagerSettings getSettings( ) { return _settings; }
	// @formatter:on

	public EnvelopeManager( )
	{

	}

	public void saveEnvelopeInfo( EnvelopeProcessInfo envelope )
	{
		try
		{
			_database.saveProcessInfo( envelope );
		}
		catch ( Exception e )
		{
			log.error( String.format(
				"Ошибка при сохранении во внутреннюю БД: %s", 
				e.getMessage( ) ), e 
			);
		}
	}

	public EnvelopeProcessInfo getProcessInfoByEnvelopeId( String incomeEnvelopeId )
	{
		try
		{
			return _database.getProcessInfo( incomeEnvelopeId );

		}
		catch ( Exception e )
		{
			log.error( String.format(
				"Ошибка при выборке из внутренней БД: %s", 
				e.getMessage( ) ), e 
			);
			return null;
		}
	}

	protected void finalize( ) throws Throwable
	{
		try
		{
			log.debug( "finalizing envelopeMaanger" );
		}
		finally
		{
			super.finalize( );
		}
	}
}
