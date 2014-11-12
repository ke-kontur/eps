package ru.acs.fts.aly.router.processing;

import java.util.List;

import ru.acs.fts.eps2.engine.processing.selectors.BaseSelectorCondition;

public class JobBatchSelectorCondition extends BaseSelectorCondition< AlyJobBatchContext > // NO_UCD (use default)
{
	private String _messageType = null;
	private List< String > _messageTypes = null;
	private String failScenario = null;
	private boolean _default = false;
	
	// @formatter:off
	public void setMessageType( String messageType ) { _messageType = messageType; }
	public String getMessageType( ) { return _messageType; }
	
	public void setMessageTypes( List< String > messageTypes ) { _messageTypes = messageTypes; }
	public List< String > getMessageTypes( ) { return _messageTypes; }
	
	public void setFailScenario( String failScenario ) { this.failScenario = failScenario; }
	public String getFailScenario( ) { return failScenario; }
	
	public void setDefault( boolean default_ ) { _default = default_; }
	public boolean getDefault( ) { return _default; }
	// @formatter:on
	
	@Override
	public boolean check( AlyJobBatchContext jobBatchContext ) // NO_UCD (use default)
	{
		if ( ! checkFailedScenario( jobBatchContext, failScenario ) )
			return false;
		
		String msgType = jobBatchContext.getReceivedEnvelope( ).getEDHeader( ).getMessageType( );
		if ( checkOnSpecificStringValues( _messageTypes, _messageType, msgType ) )
			return true;
		
		if ( _default )
			return true;
				
		return false;
	}
}
