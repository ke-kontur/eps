package ru.acs.fts.eps2.engine.processing.jobs;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.acs.fts.eps2.engine.objects.Envelope;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.Job;
import ru.acs.fts.eps2.engine.processing.JobBatchContext;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.helpers.CryptoHelper;

/**
 * Класс подписи конвертов на основе jibx сериализации
 */
public class SignEnvelope extends Job
{
	protected static final Logger log = LoggerFactory.getLogger( SignEnvelope.class ); // NO_UCD (use private)
	protected static final String action = "Подписывание конверта"; // NO_UCD (use private)
	
	@Override
	public void execute( JobBatchContext jobBatchContext, JobContext jobContext ) 
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
	
	private void processObject( Object obj, JobBatchContext jobBatchContext, boolean signSubDocuments )
		throws Exception
	{
		if ( ! ( obj instanceof Envelope ) )
		{
			String errorMsg = String.format(
				"В списке объектов на подпись попался объект с неправильным типом %s",
				obj.getClass( ).toString( )
			);
			throw new Exception( errorMsg );
		}
		
		Envelope envelope = ( Envelope )obj;
		CryptoHelper.signEnvelope( envelope, signSubDocuments );
	}

	@Override
	public String getAction( )
	{
		return action;
	}

}
