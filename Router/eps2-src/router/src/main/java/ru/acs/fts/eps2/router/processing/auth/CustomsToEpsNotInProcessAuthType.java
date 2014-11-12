package ru.acs.fts.eps2.router.processing.auth;

import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDEnvelope;

public class CustomsToEpsNotInProcessAuthType extends CustomsToEpsAuthType
{
	protected void checkCustomsProcedureCorrespondence( EDEnvelope envCtxt, String documentId ) 
		throws ResultTypeException
	{
		// EMPTY
	}
}
