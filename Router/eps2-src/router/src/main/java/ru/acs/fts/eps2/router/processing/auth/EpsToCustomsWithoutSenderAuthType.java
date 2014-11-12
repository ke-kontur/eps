package ru.acs.fts.eps2.router.processing.auth;

import ru.acs.fts.eps2.router.objects.EDEnvelope;

public class EpsToCustomsWithoutSenderAuthType extends AbstractEpsToCustomsAuthType
{
	@Override
	protected void performSenderCheck( EDEnvelope env ) 
	{
		// EMPTY
	}
}
