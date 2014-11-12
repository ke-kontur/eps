package ru.acs.fts.aly.router.processing.helpers;

import ru.acs.fts.aly.router.processing.exceptions.AlyException;

public class ErrorHelper
{
	public static void throwBasicException( String message )
		throws AlyException
	{
		throw new AlyException( message );
	}
}
