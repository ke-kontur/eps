package ru.acs.fts.eps2.failedMessages.supplementary;

import org.springframework.beans.factory.annotation.Required;

public class Configurator
{
	private Boolean _isReceiptServiceOn = false;
	private Boolean _isFailedMessagesOn = false;
	private String fullDataReportsQueue;
	private String fullDataReportsQueueManager;
	
	// @formatter:off
	@Required
	public void setIsReceiptServiceOn( Boolean isReceiptServiceOn ) { _isReceiptServiceOn = isReceiptServiceOn; }
	public Boolean getIsReceiptServiceOn( ) { return _isReceiptServiceOn; }
	
	@Required
	public void setIsFailedMessagesOn( Boolean isFailedMessagesOn ) { _isFailedMessagesOn = isFailedMessagesOn; }
	public Boolean getIsFailedMessagesOn( ) { return _isFailedMessagesOn; }
	
	@Required
	public void setFullDataReportsQueue( String fullDataReportsQueue ) { this.fullDataReportsQueue = fullDataReportsQueue; }
	public String getFullDataReportsQueue( ) { return fullDataReportsQueue; }
	
	@Required
	public void setFullDataReportsQueueManager( String fullDataReportsQueueManager ) { this.fullDataReportsQueueManager = fullDataReportsQueueManager; }
	public String getFullDataReportsQueueManager( ) { return fullDataReportsQueueManager; }
	// @formatter:on
}
