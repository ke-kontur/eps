package ru.acs.fts.aud.router.processing.jobs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.acs.fts.aud.router.processing.AudJobBatchContext;
import ru.acs.fts.aud.router.processing.definitions.AudContextConstants;
import ru.acs.fts.aud.router.processing.definitions.MessageKinds;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.schemas.aud.aud_putdocumentrequest.AUDPutDocumentRequestType;
import ru.acs.fts.schemas.aud.aud_putdocumentresponse.AUDPutDocumentResponseType;

/**
 * JobContext:<br/>
 * <b>responseName</b> - имя респонса (в JobBatchContext'е)
 * 
 * TODO Пока Работает только для ответов AUDPutDocumentResponseType
 */
public class SaveResponseJob extends AudJob
{
	private static final Logger log = LoggerFactory.getLogger( SaveResponseJob.class );
	
	@Override
	public void audExecute( AudJobBatchContext jobBatchContext, JobContext jobContext ) throws Exception
	{
		String responseName = jobContext.getString( AudContextConstants.RESPONSE_NAME );
		if ( null == responseName )
			responseName = AudContextConstants.RESPONSE_OBJECT;
		
		AUDPutDocumentResponseType response = ( AUDPutDocumentResponseType )jobBatchContext.get( responseName );
		if ( null != response )
		{
			_archiveManager.saveArchiveResponse( 
					jobBatchContext.getReceivedEnvelope( ).getDocument( ).getDocumentAsClass( AUDPutDocumentRequestType.class ).getDocumentID( ), 
					MessageKinds.AUD_PUT_DOC_REQ, response );
			
			log.info( "Ответ успешно сохранен!" );
		}
		else
		{
			log.info( "Ответ не найден в контексте обработки. Он не будет сохранен." );
		}
	}

	@Override
	public String getAction( )
	{
		return "Сохранение респонса";
	}
}
