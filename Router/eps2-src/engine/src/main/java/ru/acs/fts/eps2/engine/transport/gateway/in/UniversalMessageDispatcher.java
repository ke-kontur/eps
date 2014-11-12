package ru.acs.fts.eps2.engine.transport.gateway.in;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.engine.error.DiscardMessageException;
import ru.acs.fts.eps2.engine.error.JMSMessageConverterException;
import ru.acs.fts.eps2.engine.processing.JobBatchContext;
import ru.acs.fts.eps2.engine.processing.JobBatchContextFactory;
import ru.acs.fts.eps2.engine.processing.JobExecutor2;
import ru.acs.fts.eps2.engine.transport.gateway.out.MessagingGateway;
import ru.acs.fts.eps2.engine.transport.utils.JMSMessageConverter;

import javax.jms.Message;

public class UniversalMessageDispatcher implements MessageDispatcher
{
	protected static final Logger log = LoggerFactory.getLogger( UniversalMessageDispatcher.class );

	protected JobExecutor2 _jobExecutor;
	protected String _errorRecvQueue;
	protected MessagingGateway _messagingGateway;
	protected JobBatchContextFactory _jobBatchContextFactory;
	protected String _fatalErrorQueue;
    private int _maxRetryCount=5;

	// @formatter:off
	@Required
	public void setJobExecutor( JobExecutor2 jobExecutor ) { _jobExecutor = jobExecutor; }
	public JobExecutor2 getJobExecutor( ) { return _jobExecutor; }

	@Required
	public void setErrorRecvQueue( String errorRecvQueue ) { _errorRecvQueue = errorRecvQueue; }
	public String getErrorRecvQueue( ) { return _errorRecvQueue; }

	@Required
	public void setMessagingGateway( MessagingGateway messagingGateway ) { _messagingGateway = messagingGateway; }
	public MessagingGateway getMessagingGateway( ) { return _messagingGateway; }

	@Required
	public void setJobBatchContextFactory( JobBatchContextFactory jobBatchContextFactory ) { _jobBatchContextFactory = jobBatchContextFactory; }
	public JobBatchContextFactory getJobBatchContextFactory( ) { return _jobBatchContextFactory; }
	
	@Required
	public void setFatalErrorQueue( String fatalErrorQueue ) { _fatalErrorQueue = fatalErrorQueue; }
	public String getFatalErrorQueue( ) { return _fatalErrorQueue; }
	// @formatter:on

	@Override
	public void dispatch( Message message ) throws Exception
	{
		log.info( String.format( "Диспетчер начал обработку сообщения: %s", message.getClass( ).getSimpleName( ) ) );
        boolean shouldDispatch = true;

        if ( message.propertyExists( "JMSXDeliveryCount" ) )
        {
            int deliveryCount = message.getIntProperty( "JMSXDeliveryCount" );
            log.info( String.format( "Попытка обработки №%d", deliveryCount ) );

            if ( deliveryCount > _maxRetryCount )
            {
                log.info( "Превышен лимит повторов обработки сообщения. Сообщение будет перенаправлено в очередь ошибочных" );

                shouldDispatch = false;
                if(deliveryCount > _maxRetryCount+2){
                    return;
                }
            }
        }

		byte[ ] messageData = null;
		
		try
		{
			messageData = JMSMessageConverter.toBytes( message );

		}
		catch ( JMSMessageConverterException exc )
		{
			log.info( String.format(
				"Не удалось преобразовать транспортное сообщение в необходимый формат. Произошла ошибка: %s\nОтбрасываем сообщение в очередь ошибочных.",
				exc.getMessage( ) ), exc 
			);
				
			discard( messageData, _errorRecvQueue );			
		}

		
		if ( null == messageData || messageData.length < 20 || !shouldDispatch)
		{
			log.error( "Ошибка при получении сообщения (неверное сообщение). Не удалось прочитать тело сообщения" );
			if ( messageData != null )
				discard( messageData, _errorRecvQueue );
			
			return;			
		}
		
		try
		{
			dispatch( messageData );
		}
		catch ( DiscardMessageException e )
		{
			try
			{
				discard( e.getReceivedMessage( ), e.getQueueToDiscard( ) );
			}
			catch ( Exception exc )
			{
				log.info( "Сообщение съедено :( %s", exc.getMessage( ) );
			}
		}
		catch ( BaseProcessingException e )
		{
			log.info( String.format( 
				"Произошла ошибка обработки сообщения: %s (%s)\nОткатим транзакцию с целью обработки ошибочного сценария.",
				e.getMessage( ), e.getClass( ).getSimpleName( ) 
			) );
			
			throw e;
		}
		catch ( Exception e )
		{
			log.info( String.format(
				"В ходе обработки сообщения произошла необрабатываемая ошибка: %s (%s)\nОтбрасываем сообщение в очередь ошибочных.",
				e.getMessage( ), e.getClass( ).getSimpleName( ) ), e 
			);
			
			discard( messageData, _fatalErrorQueue );
		}
	}

	public void discard( byte[ ] message, String queueToSend )
	{
		try
		{
			log.info( String.format( "Отбрасываем сообщение в очередь ошибок %s.", queueToSend ) );			
			_messagingGateway.sendMessage( message, queueToSend );
		}
		catch ( Exception e )
		{
			log.error( String.format( "Ошибка отправки сообщения в очередь ошибок: %s", queueToSend ), e );
		}
	}

	public void dispatch( byte[ ] message ) throws Exception
	{
		JobBatchContext jobBatchContext = null;
		try
		{
			jobBatchContext = _jobBatchContextFactory.create( message );
		}
		catch ( BaseProcessingException e )
		{
			try
			{
				log.error( "Откидываем сообщение, которое не смогли распознаять в очередь ошибочных" );
				discard( message, _fatalErrorQueue );
			}
			catch ( Exception exc )
			{
				log.info( "Сообщение съедено :( %s", exc.getMessage( ) );
			}
			return;
		}

		try
		{
			_jobExecutor.execute( jobBatchContext );
			
			if ( jobBatchContext.getErrorQueueToSend( ) != null )
			{
				log.debug( "откидывваем сообщение в очередь ошибочных " );
				discard( message, jobBatchContext.getErrorQueueToSend( ) );
			}
		}
		finally
		{
			if ( jobBatchContext != null )
			{
				jobBatchContext.setContextException( null );
				jobBatchContext.setProcessingResult( null );
				jobBatchContext = null;
			}
		}
	}
}
