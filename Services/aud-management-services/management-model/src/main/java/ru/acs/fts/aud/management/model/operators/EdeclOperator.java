package ru.acs.fts.aud.management.model.operators;

import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.aud.management.model.services.EdeclService;

public class EdeclOperator
{
	// private static final Logger log = LoggerFactory.getLogger( EdeclOperator.class );
	
	private EdeclService _edeclService;
	
	// @formatter:off
	@Required public void setEdeclService( EdeclService edeclService ) { _edeclService = edeclService; }
	public EdeclService getEdeclService( ) { return _edeclService; }
	// @formatter:on
}
