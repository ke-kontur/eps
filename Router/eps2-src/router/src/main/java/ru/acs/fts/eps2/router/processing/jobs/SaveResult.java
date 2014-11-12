package ru.acs.fts.eps2.router.processing.jobs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edecl_Result;
import ru.acs.fts.eps2.model.services.EnvelopeService;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;

public class SaveResult extends EDJob
{
	protected static final Logger log = LoggerFactory.getLogger( SaveResult.class );
	
	protected final static String action = "Сохранение результата обработки в БД";

	private EnvelopeService envelopeService;
	
	@Required
	public void setEnvelopeService( EnvelopeService envelopeService ) { this.envelopeService = envelopeService; }
	public EnvelopeService getEnvelopeService( ) { return envelopeService; }
	
	@Override
	public void edExecute( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		try
		{
			log.debug( "Начали сохранение резалта в БД" );

			Edecl_Result result = new Edecl_Result( );

			EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
			
			String documentId = recvEnv.getDocument( ).getDocumentID( );

			result.setDocumentId( documentId );

			result.setEnvelopeId( recvEnv.getEnvelopeID( ) ); 
			result.setResultCode( jobBatchContext.getInitialFailedResultCode( ) );

			log.debug( result.getResultCode( ) );

			envelopeService.persist( result );
		}
		catch ( Exception e )
		{
			String errorMsg = String.format(
				"Ошибка сохранения резалта в БД. некритично. %s",
				e.getMessage( )
			);
			
			log.error( errorMsg, e );
		}
	}

	@Override
	public String getAction( )
	{
		return action;
	}
}
