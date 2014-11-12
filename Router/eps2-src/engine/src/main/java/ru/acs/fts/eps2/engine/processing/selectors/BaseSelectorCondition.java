package ru.acs.fts.eps2.engine.processing.selectors;

import java.util.List;

import ru.acs.fts.eps2.engine.processing.JobBatchContext;
import ru.acs.fts.eps2.utils.CollectionHelper;
import ru.acs.fts.eps2.utils.StringUtil;

public abstract class BaseSelectorCondition< T extends JobBatchContext >
{
	abstract public boolean check( T jobBatchContext ) throws Exception;
	
	protected boolean checkFailedScenario( T jobBatchContext, String failScenario )
	{
		return checkOnSpecificStringValue( failScenario, jobBatchContext.getFailScenario( ) );
	}
	
	protected boolean checkOnSpecificStringValue( String specificStringValue, String checkedValue )
	{
		if ( null != specificStringValue )
		{
			return specificStringValue.equals( checkedValue );
		}
		else
			return true;
	}
	
	protected boolean checkOnSpecificStringValues( List< String > specificStringValues, String checkedValue )
	{
		if ( ! StringUtil.isNullOrEmpty( checkedValue ) )
		{
			if ( specificStringValues.contains( checkedValue ) )
			{
				return true;
			}
		}
		return false;
	}
	
	protected boolean checkOnSpecificStringValues( List< String > specificStringValues, String specificStringValue, String checkedValue )
	{
		if ( null != specificStringValue )
		{
			return checkOnSpecificStringValue( specificStringValue, checkedValue );
		}
		else if ( ! CollectionHelper.isNullOrEmpty( specificStringValues ) )
		{
			return checkOnSpecificStringValues( specificStringValues, checkedValue );
		}
		
		return true;
	}
}
