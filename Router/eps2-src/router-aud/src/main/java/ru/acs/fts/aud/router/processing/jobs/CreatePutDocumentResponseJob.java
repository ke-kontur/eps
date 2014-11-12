package ru.acs.fts.aud.router.processing.jobs;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.acs.fts.aud.model.entities.Document;
import ru.acs.fts.aud.model.entities.Packet;
import ru.acs.fts.aud.router.objects.AudEnvelope;
import ru.acs.fts.aud.router.processing.AudJobBatchContext;
import ru.acs.fts.aud.router.processing.definitions.AudContextConstants;
import ru.acs.fts.aud.router.processing.definitions.MessageKinds;
import ru.acs.fts.aud.router.processing.helpers.DocumentCreator;
import ru.acs.fts.aud.router.processing.helpers.MessageCreator;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.schemas.aud.aud_putdocumentrequest.AUDPutDocumentRequestType;
import ru.acs.fts.schemas.aud.aud_putdocumentresponse.AUDPutDocumentResponseType;

/**
 * (mrdekk)
 * Проверено. Недостатки исправлены.
 */
/**
 * JobContext:<br/>
 * <b>envelopeName</b> - имя созданного конверта <br/>
 * <b>responseName</b> - имя респонса (в JobBatchContext'е)
 */
public class CreatePutDocumentResponseJob extends AudJob
{
	private static final Logger log = LoggerFactory.getLogger( CreatePutDocumentResponseJob.class );
	private static final String ACTION = "Отправка ответного сообшения";
	
	@Override
	@SuppressWarnings( "unchecked" )
	public void audExecute( AudJobBatchContext jobBatchContext, JobContext jobContext )
		throws Exception
	{
		AudEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		AUDPutDocumentRequestType request = 
			recvEnv.getDocument( ).getDocumentAsClass( AUDPutDocumentRequestType.class );  
		
		Packet packet = ( Packet ) jobBatchContext.get( AudContextConstants.SAVED_PACKET );
		List< Document > documents = ( List< Document > ) jobBatchContext.get( AudContextConstants.SAVED_DOCUMENTS ); 
		
		log.info( "[CreatePutDocumentResponse - {}] : Saved Documents:", request.getDocumentID( ) );
		for ( Document doc : documents )
		{
			log.info( 
				"[CreatePutDocumentResponse - {}] : DocumentId = {}, AppliedDocumentId = {}]", 
				new Object[ ]{ request.getDocumentID( ), 
				doc.getId( ), doc.getAppliedId( ) } 
			);
		}
		
		AUDPutDocumentResponseType response = DocumentCreator.createAudPutDocumentResponse( request, packet, documents );
		
		// Сохранение ответов вынесено в отдельную задачу (джоб) - SaveResponseJob
//		_archiveManager.saveArchiveResponse( request.getDocumentID( ), MessageKinds.AUD_PUT_DOC_REQ, response );
		
		String responseName = jobContext.getString( AudContextConstants.RESPONSE_NAME );
		if ( null == responseName )
			responseName = AudContextConstants.RESPONSE_OBJECT;
		jobBatchContext.put( responseName, response );
		
		AudEnvelope envelope = MessageCreator.createResponseEnvelope( 
			MessageKinds.AUD_PUT_DOC_RES, jobBatchContext.getReceivedEnvelope( ), 
			response, jobBatchContext.getConfigurator( ) 
		);
		
		String envelopeName = jobContext.getString( AudContextConstants.ENVELOPE_NAME );
		jobBatchContext.put( envelopeName, envelope );
	}

	@Override
	public String getAction( )
	{
		return ACTION;
	}
}
