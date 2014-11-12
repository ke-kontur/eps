package ru.acs.fts.eps2.router.processing.jobs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.ProcessingResult;
import ru.acs.fts.eps2.engine.processing.system.ErrorQueueTypes;
import ru.acs.fts.eps2.model.services.DocModeMessageService;
import ru.acs.fts.eps2.model.services.EnvelopeService;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeChecker;

/**
 * Проверка содержимого сообщения
 * 1. Проверка InitialEnvelopeID ( в т.ч. по базе )
 * 2. Проверка RefDocumentID ( в т.ч. по базе )
 * 3. Проверка допустимости документа в конкретном сообщении
 * 
 * Если задано "needInitialEnvelopeId" = true требовать наличии InitialEnvelopeID
 * Если задано "needCheckContainerCompleteness" = true проверять комплектность контейнера, а для
 *  этого нужно поле containerCompletenessCheckSentence которое является map'ом messageType -> checkSentence
 */
public class CheckMessageContent extends EDJob
{
	protected final Logger log = LoggerFactory.getLogger( CheckMessageContent.class );
	
	protected final String action = "Проверка допустимости содержимого тела сообщения";
	protected final String errorQueueToSend = ErrorQueueTypes.ERROR_AUTH;
	
	private EnvelopeService envelopeService;
	private DocModeMessageService _docModeMessageService;
	
	@Required
	public void setEnvelopeService( EnvelopeService envelopeService ) { this.envelopeService = envelopeService; }
	public EnvelopeService getEnvelopeService( ) { return envelopeService; }
	
	@Required
	public void setDocModeMessageService( DocModeMessageService service ) { _docModeMessageService = service; }
	public DocModeMessageService getDocModeMessageService( ) { return _docModeMessageService; }

	@Override
	public void edExecute( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		ProcessingResult processingResult = jobBatchContext.getProcessingResult( );
		
		boolean requireInitialEnvelopeID = 
			jobContext.getBoolean( ContextConstants.NEED_INITIAL_ENVELOPE_ID );
			
		EnvelopeChecker.checkInitialEnvelopeID( jobBatchContext, requireInitialEnvelopeID );
		EnvelopeChecker.checkRefDocumentID( jobBatchContext );
		EnvelopeChecker.isDocumentAllowedForMessage( jobBatchContext );
			
		if ( EnvelopeChecker.isCompletenessChecked( jobBatchContext.getReceivedEnvelope( ).getMessageType( ) ) )
			EnvelopeChecker.checkContainerCompleteness( jobBatchContext );
		
		processingResult.addOKProcessingInfo( action );
	}
	
	@Override
	public String getAction( )
	{
		return action;
	}	
}