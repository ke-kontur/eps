package ru.acs.fts.eps2.router.processing.auth;

import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;

public abstract class AbstractCustomsToDeclInProcessAuthType extends // NO_UCD (use default)
		AbstractCustomsToDeclAuthType
{
	abstract protected Edecl_Proc_Information findProcess( EDEnvelope env ) throws DatabaseException;
	
	@Override
	protected void processChecking( EDEnvelope env ) 
		throws ResultTypeException, DatabaseException
	{
		checkProcessEmpty( env );
		
		Edecl_Proc_Information procInfo = findProcess( env );
		
		checkProcessExists( procInfo, env );
	}
}
