package ru.acs.fts.aud.rest.service.model.objects;

public class AudRegistryDoc
{
	private String _archDocumentId;
	private String _archPacketId;
	private int _archVersion;
	private Integer _actualFlag;
	private String _archRefMainDoc;
	private String _appDocumentId;
	private String _appDocumentModeId;
	private String _appDocDescr;
	
	// @formatter:off
	public void setArchDocumentId( String archDocumentId ) { _archDocumentId = archDocumentId; }
	public String getArchDocumentId( ) { return _archDocumentId; }
	
	public void setArchPacketId( String archPacketId ) { _archPacketId = archPacketId; }
	public String getArchPacketId( ) { return _archPacketId; }
	
	public void setArchVersion( int archVersion ) { _archVersion = archVersion; }
	public int getArchVersion( ) { return _archVersion; }
	
	public void setActualFlag( Integer actualFlag ) { _actualFlag = actualFlag; }
	public Integer getActualFlag( ) { return _actualFlag; }
	
	public void setArchRefMainDoc( String archRefMainDoc ) { _archRefMainDoc = archRefMainDoc; }
	public String getArchRefMainDoc( ) { return _archRefMainDoc; }
	
	public void setAppDocumentId( String appDocumentId ) { _appDocumentId = appDocumentId; }
	public String getAppDocumentId( ) { return _appDocumentId; }
	
	public void setAppDocumentModeId( String appDocumentModeId ) { _appDocumentModeId = appDocumentModeId; }
	public String getAppDocumentModeId( ) { return _appDocumentModeId; }
	
	public void setAppDocDescr( String appDocDescr ) { _appDocDescr = appDocDescr; }
	public String getAppDocDescr( ) { return _appDocDescr; }
	// @formatter:on
}
