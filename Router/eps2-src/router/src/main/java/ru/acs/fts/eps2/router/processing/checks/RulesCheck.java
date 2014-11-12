package ru.acs.fts.eps2.router.processing.checks;

import ru.acs.fts.eps2.engine.objects.Envelope;
import ru.acs.fts.eps2.engine.processing.JobBatchContext;
import ru.acs.fts.eps2.engine.processing.checks.ICheck;
import ru.acs.fts.eps2.router.objects.EDEnvelope;

public class RulesCheck implements ICheck // NO_UCD (used by spring.handlers)
{
	private String _ruleName;
	
	// @formatter:off
	public void setRuleName( String ruleName ) { _ruleName = ruleName; }
	public String getRuleName( ) { return _ruleName; }
	// @formatter:on

	@Override
	public boolean check( Envelope envelope, JobBatchContext jobBatchContext )
			throws Exception
	{
		boolean satisfied = true;

		if ( _ruleName != null && 
			 "processNotFullContainer".equalsIgnoreCase( _ruleName ) )
		{
			satisfied &= checkProcessNotFullContainer( envelope, jobBatchContext );
		}

		return satisfied;
	}

	private boolean checkProcessNotFullContainer( Envelope envelope, JobBatchContext jobBatchContext )
	{
		EDEnvelope env = ( EDEnvelope )envelope;
		String messageType = env.getMessageType( );

		return jobBatchContext.getConfigurator( ).getProcessNotFullContainerListHolder( ).match( messageType );
	}
}
