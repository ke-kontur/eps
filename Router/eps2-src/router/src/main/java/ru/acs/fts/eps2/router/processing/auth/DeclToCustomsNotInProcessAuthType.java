package ru.acs.fts.eps2.router.processing.auth;

import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDEnvelope;

public class DeclToCustomsNotInProcessAuthType extends AbstractDeclToCustomsAuthType // NO_UCD (use default)
{	
	protected void checkProcessEmpty( EDEnvelope env )
		throws ResultTypeException
	{
	}
}
