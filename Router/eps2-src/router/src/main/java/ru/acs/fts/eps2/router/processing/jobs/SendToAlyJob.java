package ru.acs.fts.eps2.router.processing.jobs;

import java.util.GregorianCalendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.system.ErrorQueueTypes;
import ru.acs.fts.eps2.model.entities.AlyInternalCommand;
import ru.acs.fts.eps2.model.entities.AlyMessageType;
import ru.acs.fts.eps2.model.services.AlyService;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;

public class SendToAlyJob extends EDJob
{
	protected final Logger log = LoggerFactory.getLogger( SendToAlyJob.class );

	protected final String action = "Передача документов в аналитический сервис";
	protected final String WAITABLE = "Waitable";
	protected final String errorQueueToSend = ErrorQueueTypes.ERROR_FATAL;

	@Override
	protected void edExecute( EDJobBatchContext jobBatchContext, JobContext jobContext ) throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );

		AlyService alyService = jobBatchContext.getServiceHolder( ).getAlyService( );

		AlyMessageType alyMsgType = alyService.getMessageType( recvEnv.getMessageType( ) );
		if ( null == alyMsgType )
		{
			log.info( "Сообщение не требует сохранения себя в аналитический сервис" );
			return;
		}

		log.info( "Сохраняем сообщение в аналитический сервис" );

		AlyInternalCommand cmd = new AlyInternalCommand( );
		cmd.setDocumentId( recvEnv.getDocument( ).getDocumentID( ) );
		cmd.setMessageCode( alyMsgType.getMessageType( ) );
		cmd.setDateTime( new GregorianCalendar( ) );
		cmd.setState( WAITABLE );
		cmd.setProcessId( recvEnv.getProcessID( ) );
		cmd.setEnvelopeId( recvEnv.getEnvelopeID( ) );

		alyService.persistInternalCommand( cmd );

		log.info( "Сообщение в аналитическом сервисе успешно сохранено" );
	}

	@Override
	public String getAction( )
	{
		return action;
	}

}
