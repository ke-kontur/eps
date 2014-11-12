package ru.acs.fts.eps2.router.processing.auth;

import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;

public class DeclOnlyAuthType extends DeclToCustomsWithoutCodeAuthType
{
	@Override
	protected void receiverCustomsChecking( EDJobBatchContext jobBatchContext )
		throws ResultTypeException, DatabaseException
	{
		// Empty
	}
}
