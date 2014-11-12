package ru.acs.fts.aud.router.model;

public class ServerStatisticsBundle
{
	private int _requestsCount;
	private int _successfulRequestsCount;
	private int _storedDocumentsCount;
	private int _errorsCount;
//	private Date _startTime;
	
	public ServerStatisticsBundle( )
	{
		_requestsCount = 0;
		_successfulRequestsCount = 0;
		_storedDocumentsCount = 0;
		_errorsCount = 0;
	}
	
	public void increaseRequestsCount( )
	{
		_requestsCount++;
	}
	
	public void increaseSuccessfulRequetsCount( )
	{
		_successfulRequestsCount++;
	}
	
	@Deprecated
	public void increaseStoredDocumentsCount( ) // NO_UCD (unused code)
	{
		_storedDocumentsCount++;
	}
	
	public void increaseErrorsCount( )
	{
		_errorsCount++;
	}
	
	public void addStoredDocumentsCount( int count )
	{
		_storedDocumentsCount += count;
	}
	
	// @formatter:off
	// public void setRequestsCount( int requestsCount ) { _requestsCount = requestsCount; }
	public int getRequestsCount( ) { return _requestsCount; }
	
	// public void setSuccessfulRequestsCount( int successfulRequestsCount ) { _successfulRequestsCount = successfulRequestsCount; }
	public int getSuccessfulRequestsCount( ) { return _successfulRequestsCount; }
	
	// public void setStoredDocumentsCount( int storedDocumentsCount ) { _storedDocumentsCount = storedDocumentsCount; }
	public int getStoredDocumnetsCount( ) { return _storedDocumentsCount; }
	
	// public void setErrorsCount( int errorsCount ) { _errorsCount = errorsCount; }
	public int getErrorsCount( ) { return _errorsCount; }
	
	/*
	public void setStartTime( Date startTime ) { _startTime = startTime; }
	public Date getStartTime( ) { return _startTime; }
	*/
	// @formatter:on
}
