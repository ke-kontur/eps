package ru.acs.fts.aud.router.processing.inspection;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.aud.router.objects.AudEnvelope;
import ru.acs.fts.aud.router.processing.AudJobBatchContext;
import ru.acs.fts.aud.router.processing.definitions.EventTypes;
import ru.acs.fts.aud.router.processing.definitions.LogMessageSourceKeys;
import ru.acs.fts.aud.router.processing.helpers.ProtocolCreator;
import ru.acs.fts.eps2.engine.processing.JobBatchContext;
import ru.acs.fts.eps2.engine.processing.inspection.EventFactory;
import ru.acs.fts.eps2.engine.restWs.event.EventRestWs;

public class AudEventFactory implements EventFactory
{
	private static final String pattern = "<Envelope: %s, Document: %s, SoftVersion: %s, Category: %d, Code: %d, CommitId: %s> %s";

	private EventRestWs _eventRestWs;	
	private String _commitId;

	// @formatter:off
	@Required public void setEventRestWs( EventRestWs eventRestWs ) { _eventRestWs = eventRestWs; }
	public EventRestWs getEventRestWs( ) { return _eventRestWs; }
	
	@Required public void setCommitId( String commitId ) { _commitId = commitId; }
	public String getCommitId( ) { return _commitId; }
	// @formatter:on

	@Override
	public void log( JobBatchContext jobBatchContext, int category, String info, int code, Logger log )
	{
		AudEnvelope recvEnv = null;
		AudJobBatchContext audJobBacthContext = null;
				
		try
		{
			audJobBacthContext = ( AudJobBatchContext )jobBatchContext;
			recvEnv = audJobBacthContext.getReceivedEnvelope( );
		}
		catch ( Exception e )
		{
			return ;
		}

		try
		{
			log.info( String.format( 
				pattern, 
				recvEnv.getEnvelopeID( ), recvEnv.getDocument( ).getDocumentID( ),  
				recvEnv.getApplicationInfo( ).getSoftVersion( ),
				category, code, _commitId, info 
			) );
			
			/*
			Event event = new Event( );
			
			event.setEventCode( code );
			event.setDateTime( new DateTime( ) );
			event.setEventInfo( info );
			event.setInvokingSystemName( "EPS2J" );
			event.setSourceId( 0 );
			event.setCategoryId( category );
			event.setEnvelopeId( econtext.getEnvelopeID( ) );
			event.setDocumentId( econtext.getDocumentID( ) );
			event.setProcessId( econtext.getProcessID( ) );
			event.setVersion( econtext.getSoftVersion( ) );
	
			try
			{
				_eventRestWs.postNewEvent( event );
			}
			catch ( Exception exc )
			{
				// Не удалось записать сообщение, ну и пофигу на него
				log.error( "Не удалось вызвать Event-сервис", exc );
			}
			*/
					
			if ( null != jobBatchContext.getReceivedEnvelope( ) )
			{
				ProtocolCreator.stashProtocol( audJobBacthContext, getProtocolCode( code ), 
					EventTypes.OTHER, new Object[ ]{ "Обработано успешно" }, null );
			}		
		}
		catch ( Exception exc )
		{
			if ( null != jobBatchContext.getReceivedEnvelope( ) )
			{
				String message = String.format( "Обработано с ошибкой: %s", exc.toString( ) );
				try
				{
					ProtocolCreator.stashProtocol( audJobBacthContext, getProtocolCode( code ), 
						EventTypes.ERROR, new Object[ ]{ message }, null );
				}
				catch ( Exception exc2 )
				{
					// do nothing
				}
			}			
		}
	}
	
	private String getProtocolCode( int code )
	{
		return code == 5000 ? LogMessageSourceKeys.LOG_COMMON_1001 : LogMessageSourceKeys.LOG_COMMON_1000;
	}
}
