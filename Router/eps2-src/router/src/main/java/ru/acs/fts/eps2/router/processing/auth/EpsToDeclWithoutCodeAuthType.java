package ru.acs.fts.eps2.router.processing.auth;

import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;

public class EpsToDeclWithoutCodeAuthType extends AbstractEpsWithoutCodeAuthType
{
	@Override
	protected void specificAuth( EDEnvelope env, EDJobBatchContext jobBatchContext ) 
		throws ResultTypeException, DatabaseException
	{
		super.specificAuth( env, jobBatchContext );
		
		checkExtRtuSenderCustomsEnvelopeDbCorrespondence( env );
		
		checkParticipantEmpty( env );
		
		checkSoftVersion( env );
		
		checkParticipantNotReg( env );
	}
}
