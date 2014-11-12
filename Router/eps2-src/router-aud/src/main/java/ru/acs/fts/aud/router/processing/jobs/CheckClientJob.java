package ru.acs.fts.aud.router.processing.jobs;

import ru.acs.fts.aud.model.entities.Client;
import ru.acs.fts.aud.model.persistence.ClientService;
import ru.acs.fts.aud.router.objects.AudEnvelope;
import ru.acs.fts.aud.router.processing.AudJobBatchContext;
import ru.acs.fts.aud.router.processing.definitions.ErrorMessageSourceKeys;
import ru.acs.fts.aud.router.processing.helpers.ExceptionHelper;
import ru.acs.fts.aud.router.utils.XShort;
import ru.acs.fts.eps2.engine.processing.JobContext;

/**
 * (mrdekk)
 * Задача проверена. Нареканий нет. 
 */
public class CheckClientJob extends AudJob
{
	private static final String ACTION = "Проверка регистрации клиента";
	
	@Override
	public void audExecute( AudJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		AudEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		String appliedClientId = recvEnv.getAudInfo( ).getArchiveClientId( );
		ClientService clientService = _serviceHolder.getClientService( );
		Client client = clientService.getClientByAppliedId( appliedClientId );
		
		if ( null == client )
			ExceptionHelper.throwDataException( ErrorMessageSourceKeys.ERROR_ACCESS_1001, appliedClientId );
		
		if ( XShort.isFalse( client.getAccessEnabled( ) ) )
			ExceptionHelper.throwAccessException( ErrorMessageSourceKeys.ERROR_ACCESS_1005 );
	}

	@Override
	public String getAction( )
	{
		return ACTION;
	}
}
