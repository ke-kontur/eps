package ru.acs.fts.eps2.router.processing.auth;

import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.persistence.operators.ProcedureOperator;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;

public class CustomsToDeclAuthType extends AbstractCustomsToDeclInProcessAuthType
{
	@Override
	protected Edecl_Proc_Information findProcess( EDEnvelope env ) 
		throws DatabaseException
	{
		ProcedureOperator procedureOperator = _serviceHolder.getProcedureOperator( );
		return procedureOperator.getProcedureInformationWithSenderCode( env );
	}
}
