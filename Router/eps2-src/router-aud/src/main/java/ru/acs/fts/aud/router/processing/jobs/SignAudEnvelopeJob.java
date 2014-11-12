package ru.acs.fts.aud.router.processing.jobs;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;

import ru.acs.fts.aud.router.objects.AudEnvelope;
import ru.acs.fts.aud.router.processing.ArchiveErrorQueueTypes;
import ru.acs.fts.aud.router.processing.AudJobBatchContext;
import ru.acs.fts.aud.router.processing.definitions.ErrorMessageSourceKeys;
import ru.acs.fts.aud.router.processing.helpers.ExceptionHelper;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.helpers.CryptoHelper;
import ru.acs.fts.eps2.engine.processing.jobs.SignEnvelope;

/**
 * (mrdekk)
 * Проверно
 */
public class SignAudEnvelopeJob extends AudJob
{
	protected static final Logger log = LoggerFactory.getLogger( SignEnvelope.class );
	protected static final String action = "Подписывание конверта";
	protected static final String errorQueueToSend = ArchiveErrorQueueTypes.AUD_SERVER_ERRORS;

	private Marshaller envelopeMarshaller;
	private Unmarshaller envelopeUnmarshaller;
	
	@Required
	public void setEnvelopeMarshaller( Marshaller envelopeMarshaller ) { this.envelopeMarshaller = envelopeMarshaller; }
	public Marshaller getEnvelopeMarshaller( ) { return envelopeMarshaller; }
	
	@Required
	public void setEnvelopeUnmarshaller( Unmarshaller envelopeUnmarshaller ) { this.envelopeUnmarshaller = envelopeUnmarshaller; }
	public Unmarshaller getEnvelopeUnmarshaller( ) { return envelopeUnmarshaller; }
	
	@Override
	public void audExecute( AudJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		Object object = jobBatchContext.get( jobContext.getString( ContextConstants.ENVELOPE_NAME ) );
		boolean signSubDocuments = jobContext.getBoolean( ContextConstants.SIGN_SUB_DOCUMENTS );

		if ( object instanceof List )
		{
			@SuppressWarnings( "unchecked" )
			List< Object > objects = ( List< Object > )object;
			
			for ( Object obj : objects )
			{
				processObject( obj, jobBatchContext, signSubDocuments );
			}
		}
		else
		{
			processObject( object, jobBatchContext, signSubDocuments );
		}
		
		jobBatchContext.getProcessingResult( ).addOKProcessingInfo( action );
	}
	
	private void processObject( Object obj, AudJobBatchContext jobBatchContext, boolean signSubDocuments ) 
		throws Exception
	{
		if ( ! ( obj instanceof AudEnvelope ) )
		{
			String errorMsg = String.format(
				"В списке объектов на подпись попался объект с неправильным типом %s",
				obj.getClass( ).toString( )
			);
			throw new Exception( errorMsg );
		}
		
		AudEnvelope envelope = ( AudEnvelope )obj;
		try
		{
			CryptoHelper.signEnvelope( envelope, signSubDocuments );
		}
		catch ( Exception exc )
		{
			ExceptionHelper.createWrongDsigException( 
				ErrorMessageSourceKeys.ERROR_WDSIG_1002, 
				new Object[ ] { exc.getMessage( ) } 
			);
		}
	}

	@Override
	public String getAction( )
	{
		return action;
	}
}
