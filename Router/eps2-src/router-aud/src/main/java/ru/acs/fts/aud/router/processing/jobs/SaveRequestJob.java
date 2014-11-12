package ru.acs.fts.aud.router.processing.jobs;

import java.io.IOException;

import ru.acs.fts.aud.model.entities.ArchiveRequest;
import ru.acs.fts.aud.router.objects.AudEnvelope;
import ru.acs.fts.aud.router.processing.AudJobBatchContext;
import ru.acs.fts.custommarshaller.EnvelopeMarshaller;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.helpers.MarshallingHelper;
import ru.acs.fts.eps2.util.helpers.UUIDGen;
import ru.acs.fts.eps2.util.time.TimeUtil;

/**
 * (mrdekk)
 * Задача проверена. 
 */
public class SaveRequestJob extends AudJob
{
	private static final String DESCRIPTION = "Входящее сообщение";
	private static final String ACTION = "Сохранение запроса в БД.";
	
	@Override
	public void audExecute( AudJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		AudEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );

		String messageKind = recvEnv.getMessageKind( );
		String envelopeId = recvEnv.getEnvelopeID( );
		String documentId = recvEnv.getDocument( ).getDocumentID( );
		
		// Вынесено в отдельный джоб
//		checkMessageContent( messageKind, documentId, envelopeId, recvEnv, archiveService );
		
		ArchiveRequest request = new ArchiveRequest( );
		request.setId( UUIDGen.getUUID( ).toString( ) );
		request.setContent( getRequestDocumentData( recvEnv ) );
		request.setDescription( DESCRIPTION );
		request.setMessageKind( messageKind );
		request.setReceivingDate( TimeUtil.newTimestamp( ) );
		request.setEnvelopeId( envelopeId );
		request.setDocumentId( documentId );
		
		_serviceHolder.getArchiveService( ).persistArchiveRequest( request );
	}

	@Override
	public String getAction( )
	{
		return ACTION;
	}
	
	private byte[ ] getRequestDocumentData( AudEnvelope envelope ) 
		throws IOException 
	{
		Object obj = envelope.getDocument( ).getNakedDocument( );
		
		EnvelopeMarshaller envMarshaller = new EnvelopeMarshaller( );		
		return envMarshaller.marshalBaseDocOrSignature( obj, MarshallingHelper.getSharedMarshaller( ) ).getByteArray( );
	}
}
