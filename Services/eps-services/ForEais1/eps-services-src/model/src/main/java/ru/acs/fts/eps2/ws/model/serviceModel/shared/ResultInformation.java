package ru.acs.fts.eps2.ws.model.serviceModel.shared;

import java.util.List;

public class ResultInformation
{
	public static int CATEGORY_FATAL = 1;
	public static int CATEGORY_ERROR = 2;
	public static int CATEGORY_WARNING = 3;
	public static int CATEGORY_INFO = 4;
	
	private int _source;
	private String _code;
	private List< String > _description;
	private int _category;
	
	// @formatter:off
	public void setSource( int source ) { _source = source; }
	public int getSource( ) { return _source; }
	
	public void setCode( String code ) { _code = code; }
	public String getCode( ) { return _code; }
	
	public void setDescription( List< String > description ) { _description = description; }
	public List< String > getDescription( ) { return _description; }
	
	public void setCategory( int category ) { _category = category; }
	public int getCategory( ) { return _category; }
	// @formatter:on
}
