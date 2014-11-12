package ru.acs.fts.aud.router.processing;

import java.util.List;

import ru.acs.fts.eps2.engine.processing.selectors.BaseSelectorCondition;

public class JobBatchSelectorCondition extends BaseSelectorCondition< AudJobBatchContext > // NO_UCD (use default)
{
	private String _messageKind = null;
	private List< String > _messageKinds;
	private String failScenario = null;
	
	// @formatter:off
	public void setMessageKind( String messageKind ) { _messageKind = messageKind; }
	public String getMessageKind( ) { return _messageKind; }
	
	public void setMessageKinds( List< String > messageKinds ) { _messageKinds = messageKinds; }
	public List< String > getMessageKinds( ) { return _messageKinds; }
	
	public void setFailScenario( String failScenario ) { this.failScenario = failScenario; }
	public String getFailScenario( ) { return failScenario; }
	// @formatter:on
	
	@Override
	public boolean check( AudJobBatchContext jobBatchContext ) // NO_UCD (use default)
	{
		if ( ! checkFailedScenario( jobBatchContext, failScenario ) )
			return false;
		
		String msgKind = jobBatchContext.getReceivedEnvelope( ).getMessageKind( );
		if ( checkOnSpecificStringValues( _messageKinds, _messageKind, msgKind ) )
			return true;
		
		return false;
	}
}
