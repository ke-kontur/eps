package ru.acs.fts.eps2.engine.persistence.embedded;

import org.springframework.beans.factory.annotation.Required;

public class EnvelopeManagerSettings
{
	/* Timer settings */
	private long _delay;
	private long _period;
	
	/* Cleaning settings */
	private long _expiration;
	
	// @formatter:off
	@Required public void setDelay( long delay ) { _delay = delay; }
	public long getDelay( ) { return _delay; }
	
	@Required public void setPeriod( long period ) { _period = period; }
	public long getPeriod( ) { return _period; }
	
	@Required public void setExpiration( long expiration ) { _expiration = expiration; }
	public long getExpiration( ) { return _expiration; }
	// @formatter:on
}
