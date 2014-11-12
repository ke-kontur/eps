package ru.acs.fts.eps2.router.processing.auth;

import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;

public abstract class AbstractEpsToCustomsAuthType extends AbstractAuthType // NO_UCD (use default)
{
	@Override
	public void authorize( EDEnvelope env, EDJobBatchContext jobBatchContext ) 
		throws ResultTypeException, DatabaseException
	{
		log( env );
		
		performSenderCheck( env );
		
		checkReceiverCustomsCode( env );
		
		checkReceiverCustomsExchType( env );
		
		checkReceiverCustoms( env );
		
		checkSoftVersion( env );
	}
	
	protected void performSenderCheck( EDEnvelope env ) 
		throws ResultTypeException, DatabaseException
	{
		checkSenderCustomsCode( env );
		
		checkSenderCustomsExchType( env );
		
		checkSenderAddress( env );
		
		checkSenderCustomsByExtRtuRouting( env );
		
		checkExtRtuSenderCustomsEnvelopeDbCorrespondence( env );
	}
}
