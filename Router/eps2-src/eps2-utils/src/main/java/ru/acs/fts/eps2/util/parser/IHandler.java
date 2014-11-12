package ru.acs.fts.eps2.util.parser;

public interface IHandler // NO_UCD (use default)
{
	public void startTag( String namespace, String name );
	public void endTag( String namespace, String name );
	public void characters( String chars );
}
