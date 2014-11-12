package ru.acs.fts.eps2.router.processing.ead;

import ru.acs.fts.eps2.utils.StringUtil;

/**
 * Класс запроса документа в ЭАДе ( общий )
 * 
 * @author mrdekk
 * @since 5.0.11/3.0.8
 */
public class EadRequest
{
	private String _archId;
	private String _archDocId;
	private String _lineId;
	
	private String _docCode;
	
	private String _reqEnvId;
	private String _softVersion;
	
	public void setArchId( String archId ) { _archId = archId; }
	public String getArchId( ) { return _archId; }
	
	public void setArchDocId( String archDocId ) { _archDocId = archDocId; }
	public String getArchDocId( ) { return _archDocId; }
	
	public void setLineId( String lineId ) { _lineId = lineId; }
	public String getLineId( ) { return _lineId; }
	
	public void setDocCode( String docCode ) { _docCode = docCode; }
	public String getDocCode( ) { return _docCode; }
	
	public void setReqEnvId( String reqEnvId ) { _reqEnvId = reqEnvId; }
	public String getReqEnvId( ) { return _reqEnvId; }
	
	public void setSoftVersion( String softVersion ) { _softVersion = softVersion; }
	public String getSoftVersion( ) { return _softVersion; }

	public boolean checkArchId( ) // NO_UCD (use default)
	{
		return ! StringUtil.isNullOrEmpty( getArchId( ) );
	}	
	
	public boolean checkArchDocId( ) // NO_UCD (use default)
	{
		return ! StringUtil.isNullOrEmpty( getArchDocId( ) );
	}	
	
}
