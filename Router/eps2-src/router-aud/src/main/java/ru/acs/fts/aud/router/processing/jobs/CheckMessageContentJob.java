package ru.acs.fts.aud.router.processing.jobs;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.aud.model.persistence.ArchiveService;
import ru.acs.fts.aud.router.objects.AudEnvelope;
import ru.acs.fts.aud.router.processing.AudJobBatchContext;
import ru.acs.fts.aud.router.processing.definitions.ErrorMessageSourceKeys;
import ru.acs.fts.aud.router.processing.helpers.ExceptionHelper;
import ru.acs.fts.eps2.engine.processing.JobContext;

public class CheckMessageContentJob extends AudJob
{
	private static final Logger log = LoggerFactory.getLogger( CheckMessageContentJob.class );
	
	private Map< String, String > _messageKindDocumentCorrespondence;
	
	// @formatter:off
	@Required
	public void setMessageKindDocumentCorrespondence( Map< String, String > correspondence ) { _messageKindDocumentCorrespondence = correspondence; }
	public Map< String, String > getMessageKindDocumentCorrespondence( ) { return _messageKindDocumentCorrespondence; }
	// @formatter:on
	
	@Override
	public void audExecute( AudJobBatchContext jobBatchContext, JobContext jobContext ) throws Exception
	{
		AudEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );

		String messageKind = recvEnv.getMessageKind( );
		String envelopeId = recvEnv.getEnvelopeID( );
		String documentId = recvEnv.getDocument( ).getDocumentID( );
		ArchiveService archiveService = jobBatchContext.getServiceHolder( ).getArchiveService( );
		
		if ( ! checkCorrespondence( messageKind, recvEnv ) )
			ExceptionHelper.throwValidationException( ErrorMessageSourceKeys.ERROR_FORMAT_1005 );
		
		if ( archiveService.existsRequestWithEnvelopeId( envelopeId ) )
			ExceptionHelper.throwDataException( ErrorMessageSourceKeys.ERROR_ARCHIVE_1300, envelopeId );
		
		if ( archiveService.existsRequestWithDocumentId( documentId ) )
			ExceptionHelper.throwDataDocException( documentId, ErrorMessageSourceKeys.ERROR_ARCHIVE_1301 );
	}
	
	private boolean checkCorrespondence( String messageKind, AudEnvelope envelope )
	{
		Object document = envelope.getDocument( ).getNakedDocument( );
		if ( null == document )
			log.info( "Нет документа в сообщении!" );
		
		/**
		 * (mrdekk)
		 * 
		 * TODO: Заменить на DocumentModeID 
		 * Conditional Unmarshalling нам тут не помешает, т.к. в document
		 * АЮДовский документ, а не ЭПСовский. Однако, следует заменить проверку
		 * на через DocumentModeID как более правильную. Т.к. классы могут меняться. 
		 * 
		 */
		String docClass = document.getClass( ).getName( );
		boolean result = _messageKindDocumentCorrespondence.get( messageKind ).equals( docClass );
		
		log.info( 
			"Проверяю соответствие вида сообщения {} виду документа {}. Результат - {}",
			new Object[]{ messageKind, docClass, result } 
		);
		
		return result;
	}

	@Override
	public String getAction( )
	{
		return "Проверка содержимого сообщения.";
	}
}
