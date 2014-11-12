package ru.acs.fts.aud.model.filtering;

public class SimpleCondition
{
	private String _paramName;
	
	private String _condition;
	
	private Object _paramValue;
	
	// @formatter:off
	public void setParamName( String paramName ) { _paramName = paramName; }
	public String getParamName( ) { return _paramName; }
	
	public void setCondition( String condition ) { _condition = condition; }
	public String getCondition( ) { return _condition; }
	
	public void setParamValue( Object paramValue ) { _paramValue = paramValue; }
	public Object getParamValue( ) { return _paramValue; }
	// @formatter:on
}
