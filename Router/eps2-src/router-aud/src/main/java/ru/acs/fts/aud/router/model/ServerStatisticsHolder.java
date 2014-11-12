package ru.acs.fts.aud.router.model;

import ru.acs.fts.aud.model.entities.ServerStatistic;

/**
 * @author saa
 * 
 * 
 */
public class ServerStatisticsHolder
{
	private ServerStatistic _requestsCount;
	private ServerStatistic _successfulRequestsCount;
	private ServerStatistic _storedDocumentsCount;
	private ServerStatistic _errorsCount;
	private ServerStatistic _startTime;
	
	// @formatter:off
	public void setRequestsCount( ServerStatistic requestsCount ) { _requestsCount = requestsCount; }
	public ServerStatistic getRequestsCount( ) { return _requestsCount; }
	
	public void setSuccessfulRequestsCount( ServerStatistic successfulRequestsCount ) { _successfulRequestsCount = successfulRequestsCount; }
	public ServerStatistic getSuccessfulRequestsCount( ) { return _successfulRequestsCount; }
	
	public void setStoredDocumentsCount( ServerStatistic storedDocumentsCount ) { _storedDocumentsCount = storedDocumentsCount; }
	public ServerStatistic getStoredDocumentsCount( ) { return _storedDocumentsCount; }
	
	public void setErrorsCount( ServerStatistic errorsCount ) { _errorsCount = errorsCount; }
	public ServerStatistic getErrorsCount( ) { return _errorsCount; }
	
	public void setStartTime( ServerStatistic startTime ) { _startTime = startTime; }
	public ServerStatistic getStartTime( ) { return _startTime; }
	// @formatter:on
}
