package ru.acs.fts.eps2.router.processing.auth;

import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;

public class EpsToCustomsAuthType extends AbstractEpsToCustomsAuthType 
{
	@Override
	public void authorize( EDEnvelope env, EDJobBatchContext jobBatchContext )
		throws ResultTypeException, DatabaseException 
	{
		// Выполняем все проверки вне контекста процедуры
		super.authorize( env, jobBatchContext );
		
		// Выполняем проверки в контексте процедуры
		checkCustomsProcedureCorrespondence( env );
	}
}
