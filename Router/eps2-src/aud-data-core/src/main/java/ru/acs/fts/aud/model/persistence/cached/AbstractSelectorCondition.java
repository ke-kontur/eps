package ru.acs.fts.aud.model.persistence.cached;

public abstract class AbstractSelectorCondition< T > implements ISelectorCondition< T > // NO_UCD (use default)
{
	protected boolean compare( String val1, String val2 )
	{
		if ( null == val1 )
			return null == val2;
		else 
			return val1.equals( val2 );
	}
}
