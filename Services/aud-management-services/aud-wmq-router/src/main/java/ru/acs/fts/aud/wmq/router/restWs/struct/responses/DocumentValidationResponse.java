package ru.acs.fts.aud.wmq.router.restWs.struct.responses;

import java.util.List;

import ru.acs.fts.aud.wmq.router.restWs.shared.serviceModel.DocumentCheckResult;

public class DocumentValidationResponse extends Response
{
	private List< DocumentCheckResult > _results;
	
	// @formatter:off
	public void setResults( List< DocumentCheckResult > results ) { _results = results; }
	public List< DocumentCheckResult > getResults( ) { return _results; }
	// @formatter:on
}
