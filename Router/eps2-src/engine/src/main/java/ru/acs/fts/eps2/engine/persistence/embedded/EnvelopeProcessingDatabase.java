package ru.acs.fts.eps2.engine.persistence.embedded;

import java.util.concurrent.ConcurrentHashMap;

public class EnvelopeProcessingDatabase
{
	private ConcurrentHashMap< String, EnvelopeProcessInfo > _database = new ConcurrentHashMap< String, EnvelopeProcessInfo >( );

	// @formatter:off
	public ConcurrentHashMap< String, EnvelopeProcessInfo > getDatabase( ) { return _database; }
	// @formatter:on

	public EnvelopeProcessInfo getProcessInfo( String key ) // NO_UCD (use default)
	{
		return _database.get( key );
	}

	public void saveProcessInfo( EnvelopeProcessInfo envelope ) // NO_UCD (use default)
	{
		String envelopeId = envelope.getEnvelopeId( );
		
		if ( ! _database.containsKey( envelopeId ) )
		{
			_database.put( envelopeId, envelope );
		}
		else
		{
			_database.get( envelopeId ).set( envelope );
		}
	}
}
