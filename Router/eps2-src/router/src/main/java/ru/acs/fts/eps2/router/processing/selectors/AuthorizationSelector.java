package ru.acs.fts.eps2.router.processing.selectors;

import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.selectors.BaseSelector;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;

public class AuthorizationSelector extends BaseSelector< String, EDJobBatchContext >
{
	private String authorization;
	
	private EDSelectorCondition condition;
	
	@Required
	public void setAuthorization( String authorization ) { this.authorization = authorization; }
	public String getAuthorization( ) { return authorization; }
	
	@Required
	public void setCondition( EDSelectorCondition condition ) { this.condition = condition; }
	public EDSelectorCondition getCondition( ) { return condition; }
	
	public String select( EDJobBatchContext jobBatchContext ) 
		throws BaseProcessingException, DatabaseException
	{
		if ( null != condition && condition.check( jobBatchContext ) )
		{
			jobBatchContext.put( ContextConstants.SELECTED_AUTHORIZATION, authorization );
			
			return authorization;
		}
		
		return null;
	}
}
