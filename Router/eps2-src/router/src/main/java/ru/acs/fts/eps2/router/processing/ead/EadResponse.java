package ru.acs.fts.eps2.router.processing.ead;

import org.joda.time.LocalDate;

import ru.acs.fts.eps2.core.processing.ResultCodes;

public class EadResponse
{
	private String _resultCode;
	private byte[ ] _docData;
	private String _albumVersion;
	private LocalDate _docDate;
	private String _documentModeId;

	public void setResultCode( String resultCode ) { _resultCode = resultCode; }
	public String getResultCode( ) { return _resultCode; }
	
	public void setDocData( byte[ ] docData ) { _docData = docData; }
	public byte[ ] getDocData( ) { return _docData; }
	
	public void setAlbumVersion( String albumVersion ) { _albumVersion = albumVersion; }
	public String getAlbumVersion( ) { return _albumVersion; }
	
	public void setDocDate( LocalDate docDate ) { _docDate = docDate; }
	public LocalDate getDocDate( ) { return _docDate; }
	
	public void setDocumentModeId( String documentModeId ) { _documentModeId = documentModeId; }
	public String getDocumentModeId( ) { return _documentModeId; }
	
	public boolean isSucceeded( ) { return ResultCodes.isOk( _resultCode ); }
}
