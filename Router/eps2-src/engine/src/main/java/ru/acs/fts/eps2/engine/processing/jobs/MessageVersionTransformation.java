package ru.acs.fts.eps2.engine.processing.jobs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;

import ru.acs.fts.custommarshaller.EnvelopeMarshaller;
import ru.acs.fts.custommarshaller.EnvelopeUnmarshaller;
import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.configuration.XsltStorage;
import ru.acs.fts.eps2.engine.objects.Envelope;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.Job;
import ru.acs.fts.eps2.engine.processing.JobBatchContext;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.util.xslt.XsltTransformationException;
import ru.acs.fts.eps2.engine.util.xslt.XsltTransformer;
import ru.acs.fts.eps2.utils.StringUtil;

public class MessageVersionTransformation extends Job
{
	protected final Logger log = LoggerFactory.getLogger( MessageVersionTransformation.class );
	protected final String action = "Преобразование версии сообщения";

	private XsltStorage xsltStorage;
	private Marshaller marshaller;
	private Unmarshaller unmarshaller;

	@Required
	public void setXsltStorage( XsltStorage xsltStorage ) { this.xsltStorage = xsltStorage; }
	public XsltStorage getXsltStorage( ) { return xsltStorage; }
	
	@Required
	public void setMarshaller( Marshaller marshaller ) { this.marshaller = marshaller; }
	public Marshaller getMarshaller( ) { return marshaller; }
	
	@Required
	public void setUnmarshaller( Unmarshaller unmarshaller ) { this.unmarshaller = unmarshaller; }
	public Unmarshaller getUnmarshaller( ) { return unmarshaller; }

	@Override
	public void execute( JobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		String procedureSoftVersion = "";
		
		String sv = ( String )jobBatchContext.get( ContextConstants.CURRENT_PROCESS_SOFT_VERSION );
		if ( null != sv )
			procedureSoftVersion = sv;
		
		if ( StringUtil.isNullOrEmpty( procedureSoftVersion ) )
		{
			if ( jobBatchContext.contains( ContextConstants.ANSWER_SOFT_VERSION ) )
				procedureSoftVersion = jobBatchContext.getString( ContextConstants.ANSWER_SOFT_VERSION );
		}
		
		if ( jobBatchContext.getSoftVersion( ).equals( procedureSoftVersion ) )
		{
			log.debug( "Версии совпадают" );
			return;
		}
		
		Envelope envelope = ( Envelope )jobBatchContext.get( 
			jobContext.getString( ContextConstants.ENVELOPE_NAME ) 
		);
		
		envelope.getApplicationInfo( ).setSoftVersion( procedureSoftVersion );
		
		if ( ! jobContext.contains( ContextConstants.TRANSFORMATION_TYPE ) )
		{
			log.debug( "Преобразование не требуется" );
			return;
		}
		
		String transformationType = jobContext.getString( ContextConstants.TRANSFORMATION_TYPE );
		byte[ ] xslt = xsltStorage.getXslt( transformationType, procedureSoftVersion );
		
		if ( xslt == null )
		{
			String errorMsg = String.format(
				"Сообщение не преобразовано: отсутствует xslt типа '%s' версии '%s'.",
				transformationType, procedureSoftVersion 
			);
			
			log.error( errorMsg );

			errorMsg = String.format(
				"Версия '%s' указанной процедуры '%s' не поддерживается для типа '%s'",
				procedureSoftVersion,
				jobBatchContext.getString( ContextConstants.CURRENT_PROCESS_ID ),
				transformationType 
			); 
			
			jobBatchContext.getErrors( ).throwException( 
				errorMsg, envelope.getDocument( ).getDocumentID( ), 
				ResultCodes._02_00082_01, ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
		
//		XsltTransformer transformer = new XsltTransformer( );
		try
		{
			Object obj = envelope.getDocument( ).getNakedDocument( );
			
			EnvelopeMarshaller envMarshaller = new EnvelopeMarshaller( );
			byte[ ] data = envMarshaller.marshalBaseDocOrSignature( obj, marshaller ).getByteArray( );
			
//			byte[ ] transformedData = transformer.transform( data, xslt );
			byte[ ] transformedData = XsltTransformer.transform( data, xslt );
			
			EnvelopeUnmarshaller envUnmarshaller = new EnvelopeUnmarshaller( );
			obj = envUnmarshaller.unmarshallBaseDocOrSignature( transformedData, unmarshaller );
			
			envelope.setInnerDocument( obj );
		}
		catch ( XsltTransformationException e )
		{
			String errorMsg = String.format(
				"Сообщение не преобразовано: ошибка преобразования типа '%s' версии '%s'.",
				transformationType, procedureSoftVersion 
			); 
			
			log.error( errorMsg, e );
			
			jobBatchContext.getErrors( ).throwException( 
				errorMsg, envelope.getDocument( ).getDocumentID( ), 
				ResultCodes._09_00000_59, ProcessingConstants.ERROR_TYPE_BUSINESS  
			);
		}
	}

	@Override
	public String getAction( )
	{
		return action;
	}
}
