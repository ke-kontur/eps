package ru.acs.fts.eps2.ws.model.responses.crypto;

import java.util.List;

import ru.acs.fts.eps2.ws.model.responses.Response;
import ru.acs.fts.eps2.ws.model.serviceModel.shared.DocumentCheckResult;

public class CheckSignResponse extends Response
{
	private List< DocumentCheckResult > _results;
	
	// @formatter:off
	public void setResults( List< DocumentCheckResult > results ) { _results = results; }
	public List< DocumentCheckResult > getResults( ) { return _results; }
	// @formatter:on
}
