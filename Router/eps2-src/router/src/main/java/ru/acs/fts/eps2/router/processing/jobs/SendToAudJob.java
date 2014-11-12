package ru.acs.fts.eps2.router.processing.jobs;

import java.util.GregorianCalendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.system.ErrorQueueTypes;
import ru.acs.fts.eps2.model.entities.AudInternalCommand;
import ru.acs.fts.eps2.model.entities.AudMessageType;
import ru.acs.fts.eps2.model.entities.Edecl_Messages;
import ru.acs.fts.eps2.model.services.AudService;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;

public class SendToAudJob extends EDJob
{
	protected final Logger log = LoggerFactory.getLogger( SendToAudJob.class );
	
	protected final String action = "Передача документов в АЮД";
	protected final String WAITABLE = "Waitable";	
	protected final String errorQueueToSend = ErrorQueueTypes.ERROR_FATAL;
	
	@Override
	public void edExecute( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		AudService audService = jobBatchContext.getServiceHolder( ).getAudService( );
		
		AudMessageType audMsgType= audService.getMessageType( recvEnv.getMessageType( ) );
		if ( null == audMsgType )
		{
			log.info( "Сообщение не требует сохранения себя в АЮД" );
			return ;
		}
		
		if ( null != jobBatchContext.getContextException( ) )
		{
			log.info( "Сообщение обработалось с ошибкой, а поэтому в АЮД мы его отправлять не будем!" );
			return ;
		}
		
		log.info( "Сообщение требуется сохранить в АЮД, поэтому сделаем это" );

		Edecl_Messages msg = jobBatchContext.getServiceHolder( )
			.getEnvelopeService( ).getEnvelope( recvEnv.getEnvelopeID( ) );
		
		AudInternalCommand cmd = new AudInternalCommand( );
		cmd.setDocumentId( ( null != msg ) ? msg.getDocumentId( ) : recvEnv.getDocument( ).getDocumentID( ) );
		cmd.setMessageCode( audMsgType.getMessageType( ) );
		cmd.setDateTime( new GregorianCalendar( ) );
		cmd.setState( WAITABLE );
		cmd.setProcessId( recvEnv.getProcessID( ) );
		cmd.setEnvelopeId( recvEnv.getEnvelopeID( ) );
		
		audService.persistInternalCommand( cmd );
		
		log.info( "Ура! Сообщение в АЮД мы успешно сохранили" );
	}

	@Override
	public String getAction( )
	{
		return action;
	}
}
