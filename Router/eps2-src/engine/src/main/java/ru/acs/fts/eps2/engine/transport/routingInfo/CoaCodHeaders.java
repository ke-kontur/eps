package ru.acs.fts.eps2.engine.transport.routingInfo;

public class CoaCodHeaders implements Cloneable
{
	private String _replyToQueueManager;
	private String _replyToQueue;
	private String _correlId;
	private String _msgId;
	private boolean _coaNeed = false;
	private boolean _codNeed = false;
	private Boolean coaCodFullData = false;

	// @formatter:off
	public void setReplyToQueueManager( String replyToQueueManager ) { _replyToQueueManager = replyToQueueManager; }
	public String getReplyToQueueManager( ) { return _replyToQueueManager; }

	public void setReplyToQueue( String replyToQueue ) { _replyToQueue = replyToQueue; } 	
	public String getReplyToQueue( ) { return _replyToQueue; }

	public void setCorrelId( String correlId ) { _correlId = getMessageMQID( correlId ); }
	public String getCorrelId( ) { return _correlId; }

	public void setMsgId( String msgId ) { _msgId = getMessageMQID( msgId ); }
	public String getMsgId( ) { return _msgId; }

	public void setCoaNeed( Boolean coaNeed ) { _coaNeed = coaNeed; }
	public Boolean getCoaNeed( ) { return _coaNeed; }

	public void setCodNeed( Boolean codNeed ) { _codNeed = codNeed; }
	public Boolean getCodNeed( ) { return _codNeed; }
	
	public void setCoaCodFullData( Boolean codCodFullData ) { this.coaCodFullData = codCodFullData; }
	public Boolean getCoaCodFullData( ) { return coaCodFullData; }
	// @formatter:on
	
	private static String getMessageMQID( String guid )
	{
//		return guid.replaceAll( "-", "" ) + "0000000000000000";
		return guid;
	}
	
	public CoaCodHeaders clone( )
	{
		CoaCodHeaders res = new CoaCodHeaders( );
		
		res._replyToQueueManager = _replyToQueueManager;
		res._replyToQueue = _replyToQueue;
		res._correlId = _correlId;
		res._msgId = _msgId;
		res._coaNeed = _coaNeed;
		res._codNeed = _codNeed;
		res.coaCodFullData = coaCodFullData;
		
		return res;
	}
}
