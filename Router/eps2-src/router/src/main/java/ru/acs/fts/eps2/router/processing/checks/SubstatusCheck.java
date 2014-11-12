package ru.acs.fts.eps2.router.processing.checks;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.eps2.engine.objects.Envelope;
import ru.acs.fts.eps2.engine.processing.JobBatchContext;
import ru.acs.fts.eps2.engine.processing.checks.ICheck;

public class SubstatusCheck implements ICheck // NO_UCD (used by spring.handlers)
{
	private List< String > _subStatuses;

	@Required
	public void setSubStatuses( List< String > subStatuses ) { _subStatuses = subStatuses; }
	public List< String > getSubStatuses( ) { return _subStatuses; }

	@Override
	public boolean check( Envelope envelope, JobBatchContext jobBatchContext ) 
		throws Exception
	{
		// EnvelopeContext econtext = EnvelopeContext.getEnvelopeContext( envelope );
		
		// String refDocumentId = econtext.getRefDocumentID( );
		// String processId = econtext.getProcessID( );

		// TODO: доделать когда будет доступен ServiceHolder
		
		return false;
	}

}
