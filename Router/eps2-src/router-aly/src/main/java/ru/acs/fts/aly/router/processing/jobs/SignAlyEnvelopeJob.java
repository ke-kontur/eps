package ru.acs.fts.aly.router.processing.jobs;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;

import ru.acs.fts.aly.router.objects.AlyEnvelope;
import ru.acs.fts.aly.router.processing.AlyJobBatchContext;
import ru.acs.fts.aly.router.processing.helpers.ErrorHelper;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.helpers.CryptoHelper;
import ru.acs.fts.eps2.engine.processing.jobs.SignEnvelope;

public class SignAlyEnvelopeJob extends AlyJob
{
	protected static final Logger log = LoggerFactory.getLogger( SignEnvelope.class );
	protected static final String action = "Подписывание конверта";

	private Marshaller envelopeMarshaller;
	private Unmarshaller envelopeUnmarshaller;
	
	@Required
	public void setEnvelopeMarshaller( Marshaller envelopeMarshaller ) { this.envelopeMarshaller = envelopeMarshaller; }
	public Marshaller getEnvelopeMarshaller( ) { return envelopeMarshaller; }
	
	@Required
	public void setEnvelopeUnmarshaller( Unmarshaller envelopeUnmarshaller ) { this.envelopeUnmarshaller = envelopeUnmarshaller; }
	public Unmarshaller getEnvelopeUnmarshaller( ) { return envelopeUnmarshaller; }
	
	@Override
	public void alyExecute( AlyJobBatchContext jobBatchContext, JobContext jobContext ) 
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
	
	private void processObject( Object obj, AlyJobBatchContext jobBatchContext, boolean signSubDocuments ) 
		throws Exception
	{
		if ( ! ( obj instanceof AlyEnvelope ) )
		{
			String errorMsg = String.format(
				"В списке объектов на подпись попался объект с неправильным типом %s",
				obj.getClass( ).toString( )
			);
			throw new Exception( errorMsg );
		}
		
		AlyEnvelope envelope = ( AlyEnvelope )obj;
		try
		{
			CryptoHelper.signEnvelope( envelope, signSubDocuments );
		}
		catch ( Exception exc )
		{
			ErrorHelper.throwBasicException( "Ошибка подписи конверта" );
		}
	}

	@Override
	public String getAction( )
	{
		return action;
	}
}
