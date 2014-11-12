package ru.acs.fts.aud.command.dispatcher.shared;

public class EadIds
{
	private String _archId;
	private String _archDocId;
	
	// @formatter:off
	public void setArchId( String archId ) { _archId = archId; }
	public String getArchId( ) { return _archId; }
	
	public void setArchDocId( String archDocId ) { _archDocId = archDocId; }
	public String getArchDocId( ) { return _archDocId; }
	// @formatter:on
}
