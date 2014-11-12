package ru.acs.fts.eps2.router.processing.jobs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.system.ErrorQueueTypes;
import ru.acs.fts.eps2.model.services.EnvelopeService;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;

@Deprecated
public class SaveErrorEnvelope extends EDJob // NO_UCD (deprecated added)
{
	protected final Logger log = LoggerFactory.getLogger( SaveErrorEnvelope.class );
	protected final String errorQueueToSend = ErrorQueueTypes.ERROR_DB_SAVE;
	protected final String action = "Сохранение ошибочного сообщения";

	private EnvelopeService envelopeService;
	
	@Required
	public void setEnvelopeService( EnvelopeService envelopeService ) { this.envelopeService = envelopeService; }
	public EnvelopeService getEnvelopeService( ) { return envelopeService; }

	@Override
	public void edExecute( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		if ( checkIncomeEnvelopeExistsConstraints( jobBatchContext ) )
		{
			EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
			
			if ( recvEnv.getInitialEnvelopeID( ) != null ) 
			{
				if ( checkRefEnvelopeExistsConstraint( jobBatchContext ) )
				{

				}
			}
		}
	}

	@Override
	public String getAction( )
	{
		return action;
	}

	private Boolean checkIncomeEnvelopeExistsConstraints( EDJobBatchContext jobBatchContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		if ( envelopeService.envelopeExists( recvEnv.getEnvelopeID( ) ) )
		{
			log.error( "Такой айдишник конверта уже существует в БД" );
			return true;
		}
		
		return false;
	}

	private Boolean checkRefEnvelopeExistsConstraint( EDJobBatchContext jobBatchContext ) 
		throws BaseProcessingException, DatabaseException
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		if ( envelopeService.envelopeExists( recvEnv.getInitialEnvelopeID( ) ) )
		{
			log.error( "Айдишника ссылочного конверта в БД нет" );
			return true;
		}
		
		return false;
	}
}
