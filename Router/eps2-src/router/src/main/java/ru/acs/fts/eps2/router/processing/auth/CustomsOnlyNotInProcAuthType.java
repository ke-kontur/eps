package ru.acs.fts.eps2.router.processing.auth;

import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;

public class CustomsOnlyNotInProcAuthType extends AbstractAuthType
{
	@Override
	public void authorize( EDEnvelope env, EDJobBatchContext jobBatchContext )
		throws ResultTypeException, DatabaseException 		
	{
		log( env );
		
		checkSenderCustomsCode( env );
		
		checkSenderCustomsExchType( env );
		
		// checkReceiverCustomsCode( env );
		
		// checkProcessCustoms( env );
		
		checkSenderCustomsExist( env );
		
		checkSenderCustomsEnvelopeDbCorrespondence( env );
		
		// checkReceiverCustomsExchType( env );
		
		checkSenderAddress( env );
		
		checkSoftVersion( env );
	}
}
