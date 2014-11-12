package ru.acs.fts.eps2.router.processing.auth;

import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDEnvelope;

public class CustomsToDeclNotInProcessAuthType extends AbstractCustomsToDeclAuthType
{
	@Override
	protected void processChecking( EDEnvelope env )
		throws ResultTypeException
	{
		// Не делать ничего.
	}
}
