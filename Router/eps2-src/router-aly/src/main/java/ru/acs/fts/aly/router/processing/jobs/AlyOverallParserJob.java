package ru.acs.fts.aly.router.processing.jobs;

import org.jibx.runtime.JiBXException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.oxm.Unmarshaller;
import org.springframework.oxm.jibx.JibxUnmarshallingFailureException;

import ru.acs.fts.custommarshaller.EnvelopeUnmarshaller;
import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.engine.error.DiscardMessageException;
import ru.acs.fts.eps2.engine.error.EmergencyBatchException;
import ru.acs.fts.eps2.engine.objects.defines.EnvelopeOrigins;
import ru.acs.fts.eps2.engine.persistence.embedded.EnvelopeManager;
import ru.acs.fts.eps2.engine.persistence.embedded.EnvelopeProcessInfo;
import ru.acs.fts.eps2.engine.processing.JobBatch;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.schemas.envelope.EnvelopeType;
import ru.acs.fts.aly.router.objects.AlyEnvelope;
import ru.acs.fts.aly.router.processing.AlyJobBatchContext;
import ru.acs.fts.aly.router.processing.definitions.BusinessSystems;
import ru.acs.fts.aly.router.processing.definitions.ErrorQueueTypes;

public class AlyOverallParserJob extends AlyJob
{
	private static final Logger log = LoggerFactory.getLogger( AlyOverallParserJob.class );
	private static final Logger logTrace = LoggerFactory.getLogger( "ru.acs.fts.eps2.trace.TRACER" );
	
	private static final String ACTION = "Задача для препроцессинга входящего конверта аналитики";
	
	private Unmarshaller _unmarshaller;
	private EnvelopeManager _envelopeManager;
	private JobBatch _unmarshallFailedJobBatch;
	
	// @formatter:off
	@Required
	public void setUnmarshaller( Unmarshaller unmarshaller ) { _unmarshaller = unmarshaller; }
	public Unmarshaller getUnmarshaller( ) { return _unmarshaller; }
	
	@Required
	public void setEnvelopeManager( EnvelopeManager envelopeManager ) { _envelopeManager = envelopeManager; }
	public EnvelopeManager getEnvelopeManager( ) { return _envelopeManager; }
	
	public void setUnmarshallFailedJobBatch( JobBatch unmarshallFailedJobBatch ) { _unmarshallFailedJobBatch = unmarshallFailedJobBatch; }
	public JobBatch getUnmarshallFailedJobBatch( ) { return _unmarshallFailedJobBatch; }
	// @formatter:on
	
	@Override
	public String getAction( )
	{
		return ACTION;
	}
	
	@Override
	public void alyExecute( AlyJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		byte[ ] message = jobBatchContext.getMessage( );
		
		log.debug( "Десериализуем сообщение и заполняем все необходимые нам поля" );
		logTrace.trace( new String( message, "UTF-8" ) );

		EnvelopeType envelope = null;
		boolean unmarshallFailed = false;

		/**
		 * В отличии от ЭПС или АЮДа мы не анмаршаллим вложенный прикладной документ, а 
		 * работаем с ним всегда как с просто XML, поэтому чтобы все-таки использовать
		 * jibx будет использовать XStringMarshallableClass
		 */
		
		try
		{
			EnvelopeUnmarshaller unmarshaller = new EnvelopeUnmarshaller( );
			envelope = unmarshaller.unmarshallWithoutBody( message, _unmarshaller );
		}
		catch ( JiBXException exc )
		{
			log.debug( "У анмашраллера не получилось :(", exc );
			unmarshallFailed = true;
		}
		catch ( JibxUnmarshallingFailureException exc )
		{
			log.debug( "У анмашраллера не получилось :(", exc );
			unmarshallFailed = true;
		}				

		if ( unmarshallFailed )
			throw new EmergencyBatchException( _unmarshallFailedJobBatch );			

		AlyEnvelope recvEnv = createReceivedEnvelope( envelope, jobBatchContext );		
		jobBatchContext.setReceivedEnvelope( recvEnv );

		checkPreviousProcessing( recvEnv, jobBatchContext );
		

		/**
		 * Немного лога для информации
		 */
		try
		{
			log.info( 
				"Получено сообщение [{} : {}]",
				recvEnv.getEDHeader( ).getMessageType( ),
				// recvEnv.getApplicationInfo( ).getMessageKind( ), 
				recvEnv.getApplicationInfo( ).getSoftVersion( ) 
			);
		}
		catch ( Exception exc )
		{
			// Ничего не логируем, т.к. это сообщение какое-то не то, возможно от админа или ЭАДа
		}
	}
	
	/**
	 * Проверяем, не обрабатывали ли уже мы это сообщение и если да, то
	 * подгружаем результаты
	 * @throws BaseProcessingException 
	 * @throws DiscardMessageException 
	 */
	private void checkPreviousProcessing( final AlyEnvelope envelope, AlyJobBatchContext jobBatchContext ) 
		throws BaseProcessingException, DiscardMessageException
	{
		/*
		try
		{
		*/
			String incomeEnvelopeId = envelope.getEnvelopeID( );

			EnvelopeProcessInfo procInfo = _envelopeManager.getProcessInfoByEnvelopeId( incomeEnvelopeId );
			
			if ( procInfo != null )
			{
				if ( procInfo.getRunningMode( ) != ProcessingConstants.ERROR_TYPE_NORMAL )
				{
					jobBatchContext.setRunningMode( procInfo.getRunningMode( ) );
					jobBatchContext.setFailScenario( procInfo.getFailScenario( ) );
					jobBatchContext.setContextException( procInfo.getPreviousException( ) );
					jobBatchContext.setInitialFailedResultCode( procInfo.getProcessingResult( ) );
				}

				procInfo.incrementProcessingCount( );
				if ( procInfo.getProcessingCount( ) > 10 )
				{
					throw new DiscardMessageException( jobBatchContext.getMessage( ), ErrorQueueTypes.ALY_ERROR_QUEUE );
				}
			}
			/*
		}
		catch ( Exception e )
		{
			log.error( 
				String.format( "Ошибка сохранения во внутренню БД. некритично %s", e.getMessage( ) ), 
				e 
			);
		}
		*/		
	}
	
	private AlyEnvelope createReceivedEnvelope( 
			final EnvelopeType envelope, AlyJobBatchContext jobBatchContext ) 
		throws BaseProcessingException, DatabaseException
	{
		String senderSystem = BusinessSystems.EPS2;
		
		AlyEnvelope recEnv = new AlyEnvelope( envelope, senderSystem );
		
		recEnv.setSaveEnvelope( true );
		recEnv.setSaveDocument( true );
		recEnv.setOrigin( EnvelopeOrigins.INCOME );
		
		return recEnv;
	}
}
