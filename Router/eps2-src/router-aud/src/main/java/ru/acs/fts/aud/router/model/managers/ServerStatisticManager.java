package ru.acs.fts.aud.router.model.managers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ru.acs.fts.aud.model.entities.ServerStatistic;
import ru.acs.fts.aud.model.persistence.ServerStatisticsService;
import ru.acs.fts.aud.model.persistence.exception.PersistenceException;
import ru.acs.fts.aud.router.model.ServerStatisticsBundle;
import ru.acs.fts.aud.router.model.ServerStatisticsHolder;

public class ServerStatisticManager extends BaseManager
{
	public static final String REQ_CNT = "RequestsCount"; // NO_UCD (use private)
	public static final String SUCCESSFUL_REQ_CNT = "SuccessfulRequestsCount"; // NO_UCD (use private)
	public static final String STORED_DOCS_CNT = "StoredDocumentsCount"; // NO_UCD (use private)
	public static final String ERRS_CNT = "ErrorsCount"; // NO_UCD (use private)
	public static final String START_TIME = "StartTime"; // NO_UCD (use private)
	
	private int requestsCount;
	private int successfulRequestsCount;
	private int storedDocumentsCount;
	private int errorsCount;
	private Date startTime;
	
	private ServerStatisticsService _serverStatisticsService;
	private ServerStatisticsHolder _serverStatisticsHolder;
	
	// @formatter:off
	@Required
	public void setServerStatisticsService( ServerStatisticsService service ) { _serverStatisticsService = service; }
	public ServerStatisticsService getServerStatisticService( ) { return _serverStatisticsService; }
	
	public int getRequestsCount( ) { return requestsCount; }
	public int getSuccessfulRequestsCount( ) { return successfulRequestsCount; }
	public int getStoredDocumentsCount( ) { return storedDocumentsCount; }
	public int getErrorsCount( ) { return errorsCount; }
	public Date getStartTime( ) { return startTime; }
	// @formatter:on
	
	@Transactional( propagation = Propagation.REQUIRES_NEW )
	public void init( ) 
		throws Exception
	{
		_serverStatisticsHolder = new ServerStatisticsHolder( );
		// _serverStatisticsService = _serviceHolder.getServerStatisticsService( );
		
		startTime = new Date( );
		_serverStatisticsHolder.setStartTime( readAndCheckStatistic( START_TIME ) );
		saveStartTime( );
		
		requestsCount = 0;
		_serverStatisticsHolder.setRequestsCount( readAndCheckStatistic( REQ_CNT ) );
		saveRequestsCount( );
		
		successfulRequestsCount = 0;
		_serverStatisticsHolder.setSuccessfulRequestsCount( readAndCheckStatistic( SUCCESSFUL_REQ_CNT ) );
		saveSuccessfulRequestsCount( );
		
		storedDocumentsCount = 0;
		_serverStatisticsHolder.setStoredDocumentsCount( readAndCheckStatistic( STORED_DOCS_CNT ) );
		saveStoredDocumentsCount( );
		
		errorsCount = 0;
		_serverStatisticsHolder.setErrorsCount( readAndCheckStatistic( ERRS_CNT ) );
		saveErrorsCount( );
	}
	
	public void updateServerStatistics( ServerStatisticsBundle serverStatisticsBundle ) 
		throws PersistenceException
	{
		if ( serverStatisticsBundle.getErrorsCount( ) > 0 )
		{
			errorsCount += serverStatisticsBundle.getErrorsCount( );
			saveErrorsCount( );
		}
		
		if ( serverStatisticsBundle.getRequestsCount( ) > 0 )
		{
			requestsCount += serverStatisticsBundle.getRequestsCount( );
			saveRequestsCount( );
		}
		
		if ( serverStatisticsBundle.getStoredDocumnetsCount( ) > 0 )
		{
			storedDocumentsCount += serverStatisticsBundle.getStoredDocumnetsCount( );
			saveStoredDocumentsCount( );
		}
		
		if ( serverStatisticsBundle.getSuccessfulRequestsCount( ) > 0 )
		{
			successfulRequestsCount += serverStatisticsBundle.getSuccessfulRequestsCount( );
			saveSuccessfulRequestsCount( );
		}
	}
	
	private void saveRequestsCount( ) 
		throws PersistenceException
	{
		ServerStatistic reqCnt = _serverStatisticsHolder.getRequestsCount( );
		reqCnt.setValue( String.valueOf( requestsCount ) );
		_serverStatisticsService.mergeStatistic( reqCnt );
	}
	
	private void saveSuccessfulRequestsCount( ) 
		throws PersistenceException
	{
		ServerStatistic sucReqCnt = _serverStatisticsHolder.getSuccessfulRequestsCount( );
		sucReqCnt.setValue( String.valueOf( successfulRequestsCount ) );
		_serverStatisticsService.mergeStatistic( sucReqCnt );
	}
	
	private void saveStoredDocumentsCount( ) 
		throws PersistenceException
	{
		ServerStatistic storedDocReq = _serverStatisticsHolder.getStoredDocumentsCount( );
		storedDocReq.setValue( String.valueOf( storedDocumentsCount ) );
		_serverStatisticsService.mergeStatistic( storedDocReq );
	}
	
	private void saveErrorsCount( ) 
		throws PersistenceException
	{
		ServerStatistic errCnt = _serverStatisticsHolder.getErrorsCount( );
		errCnt.setValue( String.valueOf( errorsCount ) );
		_serverStatisticsService.mergeStatistic( errCnt );
	}
	
	private void saveStartTime( )
	{
		ServerStatistic start = _serverStatisticsHolder.getStartTime( );
		DateFormat format = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" );
		start.setValue( String.valueOf( format.format( startTime ) ) );
	}
	
	private ServerStatistic readServerStatistic( String statName ) throws PersistenceException
	{
		return _serverStatisticsService.getStatisticByName( statName );
	}
	
	private ServerStatistic readAndCheckStatistic( String statName ) 
		throws Exception
	{
		ServerStatistic stat = readServerStatistic( statName );
		if ( null == stat )
			throw new Exception( String.format( "В базе нет параметра статистики '%s'.", statName ) );
		
		return stat;
	}
}
