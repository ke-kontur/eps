package ru.acs.fts.aud.wmq.router.restWs.crypto.responses;

import java.util.List;

import ru.acs.fts.aud.wmq.router.restWs.shared.serviceModel.DocumentCheckResult;

public class CheckSignResponse extends Response
{
	private List< DocumentCheckResult > _results;
	
	// @formatter:off
	public void setResults( List< DocumentCheckResult > results ) { _results = results; }
	public List< DocumentCheckResult > getResults( ) { return _results; }
	// @formatter:on
}
