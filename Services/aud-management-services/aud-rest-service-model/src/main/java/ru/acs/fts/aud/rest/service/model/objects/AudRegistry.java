package ru.acs.fts.aud.rest.service.model.objects;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.joda.time.DateTime;

public class AudRegistry
{
	private String _id;
	private DateTime _dateTime;
	private String _name;
	private DateTime _startDate;
	private DateTime _stopDate;
	private String _dateFlag;
	private String _currStatus;
	private DateTime _setStatusDate;
	private String _envelopeId;
	private int _nullFlag;
	private List< AudRegistryResult > _results;
	
	// @formatter:off
	public void setId( String id ) { _id = id; }
	public String getId( ) { return _id; }
	
	public void setDateTime( DateTime dateTime ) { _dateTime = dateTime; }
	public DateTime getDateTime( ) { return _dateTime; }
	
	public void setName( String name ) { _name = name; }
	public String getName( ) { return _name; }
	
	public void setStartDate( DateTime startDate ) { _startDate = startDate; }
	public DateTime getStartDate( ) { return _startDate; }
	
	public void setStopDate( DateTime stopDate ) { _stopDate = stopDate; }
	public DateTime getStopDate( ) { return _stopDate; }
	
	public void setDateFlag( String dateFlag ) { _dateFlag = dateFlag; }
	public String getDateFlag( ) { return _dateFlag; }
	
	public void setCurrStatus( String currStatus ) { _currStatus = currStatus; }
	public String getCurrStatus( ) { return _currStatus; }
	
	public void setSetStatusDate( DateTime setStatusDate ) { _setStatusDate = setStatusDate; }
	public DateTime getSetStatusDate( ) { return _setStatusDate; }
	
	public void setEnvelopeId( String envelopeId ) { _envelopeId = envelopeId; }
	public String getEnvelopeId( ) { return _envelopeId; }
	
	public void setNullFlag( int nullFlag ) { _nullFlag = nullFlag; }
	public int getNullFlag( ) { return _nullFlag; }
	
	public void setResults( List< AudRegistryResult > results ) { _results = results; }
	public List< AudRegistryResult > getResults( ) { return _results; }
	// @formatter:on
}
