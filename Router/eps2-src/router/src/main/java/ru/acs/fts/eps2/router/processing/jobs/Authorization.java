package ru.acs.fts.eps2.router.processing.jobs;

import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.auth.AuthorizationWarehouse;
import ru.acs.fts.eps2.router.processing.auth.IAuthType;

/**
 * @author SAA
 * <p>
 * <b>authType</b> - тип авторизации
 */
public class Authorization extends EDJob
{
	private static final String action = "Новая задача авторизации";
	
	private AuthorizationWarehouse _authorizationWarehouse;
	
	@Required
	public void setAuthorizationWarehouse( AuthorizationWarehouse warehouse ) { _authorizationWarehouse = warehouse; }
	public AuthorizationWarehouse getAuthorizationWarehouse( ) { return _authorizationWarehouse; }
	
	@Override
	public void edExecute( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		String authType = jobContext.getString( ContextConstants.AUTH_TYPE );
		
		IAuthType authorizer;
		if ( null == authType )
			authorizer = _authorizationWarehouse.getAuthorization( jobBatchContext );
		else
			authorizer = _authorizationWarehouse.getAuthorizer( authType );
		
		if ( null == recvEnv || null == authorizer )
			throw new NullPointerException( "Не найден подходящий авторизатор." );
		
		authorizer.authorize( recvEnv, jobBatchContext );
	}
	
	@Override
	public String getAction( )
	{
		return action;
	}
}
