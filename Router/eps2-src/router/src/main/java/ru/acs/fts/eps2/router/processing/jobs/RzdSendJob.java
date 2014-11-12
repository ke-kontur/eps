package ru.acs.fts.eps2.router.processing.jobs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.checks.ChecksSentence;
import ru.acs.fts.eps2.model.entities.RzdSendCommands;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.objects.EDDocument;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.schemas.album.esadout_cu.ESADoutCUType;

public class RzdSendJob extends EDJob
{
	private static final Logger log = LoggerFactory.getLogger( RzdSendJob.class );
	private static final String action = "Отправка декларации в РЖД если это необходимо";
		
	@Override
	public void edExecute( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		Object objChecksSentence = jobContext.get( ContextConstants.CHECK_SENTENCE );
		if ( null == objChecksSentence || ! ( objChecksSentence instanceof ChecksSentence ) )
			throw new Exception( "В контексте задачи не найдено проверочное выражение" );

		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		ChecksSentence sentence = ( ChecksSentence )objChecksSentence;
		
		if ( ! sentence.check( recvEnv, jobBatchContext ) )
		{
			/**
			 * Входящий конверт не удовлетворяет условиям отсылки в РЖД
			 * поэтому просто игнорируем его
			 */
			log.info( "Декларация не соответствует условиям отсылки в РЖД, ну и ладно..." );
			return ;
		}
		
		sendToRzd( jobContext, jobBatchContext );
		
		log.info( "Закончили задачу отправки декларации в РЖД при необходимости" );	}

	@Override
	public String getAction( )
	{
		return action;
	}

	private void sendToRzd( JobContext jobContext, EDJobBatchContext jobBatchContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );

		ESADoutCUType esad = null;
		
		for ( String cDocId : recvEnv.getDocument( ).getContainerDocuments( ).keySet( ) )
		{
			EDDocument cdoc = recvEnv.getDocument( ).getDocumentInContainer( cDocId );
			
			if ( cdoc.isDocumentOfClass( ESADoutCUType.class ) )
				esad = cdoc.getDocumentAsClass( ESADoutCUType.class );
		}
		
		if ( null == esad )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._09_96669_99, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
		
		RzdSendCommands cmd = new RzdSendCommands( );
		cmd.setEnvelopeId( recvEnv.getEnvelopeID( ) );
		cmd.setDocumentId( recvEnv.getDocument( ).getDocumentID( ) );
		cmd.setProcessId( recvEnv.getProcessID( ) );
		cmd.setParticipantId( recvEnv.getParticipantID( ) );
		cmd.setCustomsCode( recvEnv.getSenderCustoms( ).getCustomsCode( ) );
		cmd.setSoftVersion( recvEnv.getSoftVersion( ) );
		cmd.setEsadId( esad.getDocumentID( ) );
		cmd.setStatus( "Waitable" );
		
		jobBatchContext.getServiceHolder( ).getRzdService( ).persist( cmd );
	}
}
