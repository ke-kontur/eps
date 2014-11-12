package ru.acs.fts.eps2.model.services.conditions;

public abstract class AbstractSelectionCondition< T > implements ISelectionCondition< T >
{
	protected boolean compare( String val1, String val2 )
	{
		if ( null == val1 )
			return null == val2;
		else 
			return val1.equals( val2 );
	}
}
