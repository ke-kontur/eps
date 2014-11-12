package ru.acs.fts.eps2.router.processing.auth;

import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;

public abstract class AbstractEpsInProcessAuthType extends AbstractEpsAuthType // NO_UCD (use default)
{
	@Override
	protected void specificAuth( EDEnvelope env, EDJobBatchContext jobBatchContext ) 
		throws ResultTypeException, DatabaseException
	{
		processChecking( env );
	}
	
	protected void processChecking( EDEnvelope env )  // NO_UCD (use private)
		throws ResultTypeException, DatabaseException
	{
		checkProcessEmpty( env );
		
		Edecl_Proc_Information procInfo = findProcess( env );
		
		checkProcessExists( procInfo, env );
	}
	
	abstract protected Edecl_Proc_Information findProcess( EDEnvelope env ) throws DatabaseException;
}
