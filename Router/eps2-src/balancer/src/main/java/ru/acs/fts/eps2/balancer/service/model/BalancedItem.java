package ru.acs.fts.eps2.balancer.service.model;

public class BalancedItem
{
	private boolean _first;
	private int _rowspan;
	private String _version;
	private String _destination;
	private long _load;
	private String _codes;
	private String _style;
	
	// @formatter:off
	public void setFirst( boolean first ) { _first = first; }
	public boolean getFirst( ) { return _first; }
	
	public void setRowspan( int rowspan ) { _rowspan = rowspan; }
	public int getRowspan( ) { return _rowspan; }
	
	public void setVersion( String version ) { _version = version; }
	public String getVersion( ) { return _version; }
	
	public void setDestination( String destination ) { _destination = destination; }
	public String getDestination( ) { return _destination; }
	
	public void setLoad( long load ) { _load = load; }
	public long getLoad( ) { return _load; }
	
	public void setCodes( String codes ) { _codes = codes; }
	public String getCodes( ) { return _codes; }
	
	public void setStyle( String style ) { _style = style; }
	public String getStyle( ) { return _style; }
	// @formatter:on
}
