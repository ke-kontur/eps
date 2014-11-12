package ru.acs.fts.aud.router.processing.jobs;

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
import ru.acs.fts.aud.router.objects.AudEnvelope;
import ru.acs.fts.aud.router.processing.ArchiveErrorQueueTypes;
import ru.acs.fts.aud.router.processing.AudJobBatchContext;
import ru.acs.fts.aud.router.processing.definitions.BusinessSystems;
import ru.acs.fts.aud.router.processing.marshalling.ConditionalUnmarshaller;

public class AudOverallParserJob extends AudJob
{
	private static final Logger log = LoggerFactory.getLogger( AudOverallParserJob.class );
	private static final Logger logTrace = LoggerFactory.getLogger( "ru.acs.fts.eps2.trace.TRACER" );
	
	private static final String ACTION = "Задача для препроцессинга входящего конверта АЮДа";
	
	private Unmarshaller _unmarshaller;
	private EnvelopeManager _envelopeManager;
	private JobBatch _unmarshallFailedJobBatch;
	private ConditionalUnmarshaller _conditionalUnmarshaller;
	
	// @formatter:off
	@Required
	public void setUnmarshaller( Unmarshaller unmarshaller ) { _unmarshaller = unmarshaller; }
	public Unmarshaller getUnmarshaller( ) { return _unmarshaller; }
	
	@Required
	public void setEnvelopeManager( EnvelopeManager envelopeManager ) { _envelopeManager = envelopeManager; }
	public EnvelopeManager getEnvelopeManager( ) { return _envelopeManager; }
	
	public void setUnmarshallFailedJobBatch( JobBatch unmarshallFailedJobBatch ) { _unmarshallFailedJobBatch = unmarshallFailedJobBatch; }
	public JobBatch getUnmarshallFailedJobBatch( ) { return _unmarshallFailedJobBatch; }
	
	@Required
	public void setConditionalUnmarshaller( ConditionalUnmarshaller conditionalUnmarshaller ) { _conditionalUnmarshaller = conditionalUnmarshaller; }
	public ConditionalUnmarshaller getConditionalUnmarshaller( ) { return _conditionalUnmarshaller; }
	// @formatter:on
	
	@Override
	public String getAction( )
	{
		return ACTION;
	}
	
	@Override
	public void audExecute( AudJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		byte[ ] message = jobBatchContext.getMessage( );
		
		log.debug( "Десериализуем сообщение и заполняем все необходимые нам поля" );
		logTrace.trace( new String( message, "UTF-8" ) );

		EnvelopeType envelope = null;
		boolean unmarshallFailed = false;

		try
		{
			/**
			 * conditional unmarshalling - предполагаем, что мы не располагаем схемами электрички
			 * а значит у нас завалится анмаршаллинг почти 100% (есть конверты которые не содержат
			 * прикладного документа электрички). Кроме того, иметь 100500 схем электрички в jibx
			 * нам не позволительно (очень большой jar-ник получается). Поэтому делаем следующее:
			 * 
			 * Мы понимаем, что этот конверт содержит прикладной документ электрички (используем DocumentModeID), 
			 * далее мы выпиливаем этот документ и сохраняем его в XStringMarshallableClass,
			 * после этого анмаршаллим сообщение и получаем объектную модель АЮДа, куда и вкладываем
			 * прикладной документ в виде XStringMarshallableClass. Да согласен, работы больше, однако
			 * это позволит нам избежать многих проблем в будущем.
			 */

			envelope = _conditionalUnmarshaller.unmarshall( message );
		}
		catch ( JiBXException exc )
		{
			log.debug( "У анмашраллера не получилось :(", exc );
			envelope = unmarshallWithoutBody( message );
			unmarshallFailed = true;
		}
		catch ( JibxUnmarshallingFailureException exc )
		{
			log.debug( "У анмашраллера не получилось :(", exc );
			envelope = unmarshallWithoutBody( message );
			unmarshallFailed = true;
		}				
				
		AudEnvelope recvEnv = createReceivedEnvelope( envelope, jobBatchContext );		
		jobBatchContext.setReceivedEnvelope( recvEnv );

		checkPreviousProcessing( recvEnv, jobBatchContext );
		
		if ( unmarshallFailed )
			throw new EmergencyBatchException( _unmarshallFailedJobBatch );

		/**
		 * Немного лога для информации
		 */
		try
		{
			log.info( 
				"Получено сообщение [{} : {}]", 
				recvEnv.getApplicationInfo( ).getMessageKind( ), 
				recvEnv.getApplicationInfo( ).getSoftVersion( ) 
			);
			
			jobBatchContext.getServerStatistics( ).increaseRequestsCount( );
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
	private void checkPreviousProcessing( final AudEnvelope envelope, AudJobBatchContext jobBatchContext ) 
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
					throw new DiscardMessageException( jobBatchContext.getMessage( ), ArchiveErrorQueueTypes.AUD_SERVER_ERRORS );
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
	
	private EnvelopeType unmarshallWithoutBody( byte[ ] message ) 
		throws Exception
	{
		try
		{
			EnvelopeUnmarshaller unmarshaller = new EnvelopeUnmarshaller( );
			
			EnvelopeType envelope = unmarshaller.unmarshallWithoutBody( message, _unmarshaller );
			
			return envelope;
		}
		catch ( Exception exc )
		{
			throw new DiscardMessageException( message, ArchiveErrorQueueTypes.AUD_SERVER_ERRORS );
		}
	}
	
	private AudEnvelope createReceivedEnvelope( 
			final EnvelopeType envelope, AudJobBatchContext jobBatchContext ) 
		throws BaseProcessingException, DatabaseException
	{
		String senderSystem = BusinessSystems.WMQ_ROUTER;
		
		AudEnvelope recEnv = new AudEnvelope( envelope, senderSystem );
		
		recEnv.setSaveEnvelope( true );
		recEnv.setSaveDocument( true );
		recEnv.setOrigin( EnvelopeOrigins.INCOME );
		
		return recEnv;
	}
}
