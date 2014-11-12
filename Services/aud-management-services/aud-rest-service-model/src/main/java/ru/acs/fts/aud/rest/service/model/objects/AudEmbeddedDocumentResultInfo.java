package ru.acs.fts.aud.rest.service.model.objects;

import java.util.List;

public class AudEmbeddedDocumentResultInfo
{
	private String _appliedDocumentId;
	private List< AudResultInfo > _resultInfos;
	
	// @formatter:off
	public void setAppliedDocumentId( String appliedDocumentId ) { _appliedDocumentId = appliedDocumentId; }
	public String getAppliedDocumentId( ) { return _appliedDocumentId; }
	
	public void setResultInfos( List< AudResultInfo > resultInfos ) { _resultInfos = resultInfos; }
	public List< AudResultInfo > getResultInfos( ) { return _resultInfos; }
	// @formatter:on
}
