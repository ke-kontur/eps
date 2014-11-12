package ru.acs.fts.aud.rest.service.model.objects;

import org.joda.time.DateTime;

public class AudRegistryRequest
{
	private DateTime _docDateTime;
	private boolean _testIndicator;
	private DateTime _dateBegin;
	private DateTime _dateStop;
	private int _dateIndicator;
	
	// @formatter:off
	public void setDocDateTime( DateTime docDateTime ) { _docDateTime = docDateTime; }
	public DateTime getDocDateTime( ) { return _docDateTime; }
	
	public void setTestIndicator( boolean testIndicator ) { _testIndicator = testIndicator; }
	public boolean getTestIndicator( ) { return _testIndicator; }
	
	public void setDateBegin( DateTime dateBegin ) { _dateBegin = dateBegin; }
	public DateTime getDateBegin( ) { return _dateBegin; }
	
	public void setDateStop( DateTime dateStop ) { _dateStop = dateStop; }
	public DateTime getDateStop( ) { return _dateStop; }
	
	public void setDateIndicator( int dateIndicator ) { _dateIndicator = dateIndicator; }
	public int getDateIndicator( ) { return _dateIndicator; }
	// @formatter:on
}
