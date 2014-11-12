package ru.acs.fts.eps2.ws.model.serviceModel.shared;

import java.util.List;

public class DocumentCheckResult
{
	private String _refDocumentId;
	private List< ResultInformation > _information;
	
	// @formatter:off
	public void setRefDocumentId( String refDocumentId ) { _refDocumentId = refDocumentId; }
	public String getRefDocumentId( ) { return _refDocumentId; }
	
	public void setInformation( List< ResultInformation > information ) { _information = information; }
	public List< ResultInformation > getInformation( ) { return _information; }
	// @formatter:on
}
