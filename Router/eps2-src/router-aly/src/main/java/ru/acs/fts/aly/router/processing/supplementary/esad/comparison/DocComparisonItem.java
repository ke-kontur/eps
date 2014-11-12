package ru.acs.fts.aly.router.processing.supplementary.esad.comparison;

import org.w3c.dom.Element;

public class DocComparisonItem
{
	public static enum Ops
	{
		ADD, DEL, CH
	}
	
	private String _path;
	private String _oldValue;
	private String _newValue;
	private Ops _op;
	
	private Element _cur;
	// private XmlTree _old;
	private Element _old;
	
	// @formatter:off
	public void setPath( String path ) { _path = path; }
	public String getPath( ) { return _path; }
	
	public void setOldValue( String oldValue ) { _oldValue = oldValue; }
	public String getOldValue( ) { return _oldValue; }
	
	public void setNewValue( String newValue ) { _newValue = newValue; }
	public String getNewValue( ) { return _newValue; }
	
	public void setOp( Ops op ) { _op = op; }
	public Ops getOp( ) { return _op; }
	
	public void setCur( Element cur ) { _cur = cur; }
	public Element getCur( ) { return _cur; }
	
	/*
	public void setOld( XmlTree old ) { _old = old; }
	public XmlTree getOld( ) { return _old; }
	*/
	public void setOld( Element old ) { _old = old; }
	public Element getOld( ) { return _old; }
	// @formatter:on
}
