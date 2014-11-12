package ru.acs.fts.eps2.router.processing.auth;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.selectors.AuthorizationSelector;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;

public class AuthorizationWarehouse
{
	private List< AuthorizationSelector > authorizationSelectors;
	
	private Map< String, IAuthType > authorizers;
	
	@Required
	public void setAuthorizationSelectors( List< AuthorizationSelector > selectors ) { authorizationSelectors = selectors; }
	public List< AuthorizationSelector > getAuthorizationSelectors( ) { return authorizationSelectors; }
	
	@Required
	public void setAuthorizers( Map< String, IAuthType > authorizers ) { this.authorizers = authorizers; }
	public Map< String, IAuthType > getAuthorizers( ) { return authorizers; }
	
	public IAuthType getAuthorization( EDJobBatchContext jobBatchContext ) 
		throws BaseProcessingException, DatabaseException
	{
		for ( AuthorizationSelector selector : authorizationSelectors )
		{
			String authorization = selector.select( jobBatchContext );
			IAuthType authType = getAuthorizer( authorization );
			if ( null != authType )
				return authType;
		}
		
		return null;
	}
	
	public IAuthType getAuthorizer( String authType )
	{
		return authorizers.get( authType );
	}
}
