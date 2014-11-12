package ru.acs.fts.eps2.router.processing.auth;

import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;

public class CustomsToCustomsAuthType extends AbstractAuthType  // NO_UCD (use default)
{
	@Override
	public void authorize( EDEnvelope env, EDJobBatchContext jobBatchContext )
		throws ResultTypeException, DatabaseException 		
	{
		log( env );
		
		checkSenderCustomsCode( env );
		
		checkSenderCustomsExchType( env );
		
		checkReceiverCustomsCode( env );
		
		checkCustomsProcedureCorrespondence( env );
		
		checkSenderCustomsExist( env );
		
		checkSenderCustomsEnvelopeDbCorrespondence( env );
		
		checkReceiverCustomsExchType( env );
		
		checkReceiverCustoms( env );
		
		checkSenderAddress( env );
		
		checkSoftVersion( env );
	}
	
	@Override
	protected void checkReceiverCustoms( EDEnvelope env )
		throws ResultTypeException, DatabaseException
	{
		/*
		 * дабы не мудрить с наследованием авторизации KASTO->EPS 
		 * ( если не переопределить - тесты пова )
		 */
	}

}
