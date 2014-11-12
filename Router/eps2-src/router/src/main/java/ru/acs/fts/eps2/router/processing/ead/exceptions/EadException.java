package ru.acs.fts.eps2.router.processing.ead.exceptions;

import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.schemas.album.result.ResultType;

public class EadException extends ResultTypeException
{
	private static final long serialVersionUID = 1L;

	public EadException( String message, ResultType res )
	{
		super( message, ResultCodes._09_00053_99, res, ProcessingConstants.ERROR_TYPE_BUSINESS );
	}	
}
