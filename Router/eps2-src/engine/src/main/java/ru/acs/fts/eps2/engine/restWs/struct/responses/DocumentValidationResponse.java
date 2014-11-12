package ru.acs.fts.eps2.engine.restWs.struct.responses;

import java.util.List;

import ru.acs.fts.eps2.engine.restWs.shared.serviceModel.DocumentCheckResult;

public class DocumentValidationResponse extends Response
{
	private List< DocumentCheckResult > _results;
	
	// @formatter:off
	public void setResults( List< DocumentCheckResult > results ) { _results = results; }
	public List< DocumentCheckResult > getResults( ) { return _results; }
	// @formatter:on
}
