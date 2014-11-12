package ru.acs.fts.eps2.engine.transport.gateway.in;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.jms.Message;
import javax.jms.MessageListener;

public class SampleMessageListener implements MessageListener
{
	protected final Logger log = LoggerFactory.getLogger( SampleMessageListener.class );

	private MessageDispatcher _dispatcher;
	
	// @formatter:off
	@Required public void setDispatcher( MessageDispatcher dispatcher ) { _dispatcher = dispatcher; }
	public MessageDispatcher getDispatcher( ) { return _dispatcher; }
	// @formatter:on

	@Transactional( propagation = Propagation.REQUIRED, timeout = 3000000 )
	public void onMessage( Message message )
	{
		try
		{
			log.info( String.format( "Прибыло сообщение, класс: %s. ", message.getClass( ).getSimpleName( ) ) );
			
			getDispatcher( ).dispatch( message );
			
			log.info( "Диспетчер обработал сообщение." );
		}
		catch ( Exception e )
		{
			final String errorMsg = String.format(
				"Трагедия, трагедия... Ошибка при обработке сообщения. Причина: %s",
				e.getMessage( )
			);
			
			log.error( errorMsg, e );
			throw new RuntimeException( errorMsg, e );
		}
	}
}