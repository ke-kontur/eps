package ru.acs.fts.eps2.failedMessages.transport.in;

import javax.jms.Message;
import javax.jms.MessageListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StopWatch;

import ru.acs.fts.eps2.failedMessages.dispatch.IMessageDispatcher;

public class DispatchableMessageListener implements MessageListener
{
	private static final Logger log = LoggerFactory.getLogger( DispatchableMessageListener.class );
	
	protected IMessageDispatcher _dispatcher;
	
	// @formatter:off
	@Required public void setDispatcher( IMessageDispatcher dispatcher ) { _dispatcher = dispatcher; }
	public IMessageDispatcher getDispatcher( ) { return _dispatcher; }
	// @formatter:on
	
	@Transactional( propagation = Propagation.REQUIRED, timeout = 300 )
	public void onMessage( Message message )
	{
		try
		{
			log.info( "Обработчик ошибочных сообщений получил новое сообщение. MessageID = {}.", message.getJMSMessageID( ) );
			
			String swname = String.format( "dispatch.%s", Thread.currentThread( ).getName( ) ); 
			
			StopWatch sw = new StopWatch( );
			sw.start( swname );
			
			_dispatcher.dispatch( message );
			
			sw.stop( );

			long millis = sw.getLastTaskTimeMillis( ) / 1000;
			
			String elapsed = String.format( 
				"%d:%d.%d", 
				millis / 60, millis % 60, 
				sw.getLastTaskTimeMillis( ) % 1000 
			); 			
			
			log.info( String.format(
				"Ошибочное сообщение успешно обработано обработчиком ошибочных сообщений. Это заняло: %s (MessageID = {})", elapsed, message.getJMSMessageID( )
			) );
		}
		catch ( Exception exc )
		{
			String errorMsg = String.format(
				"Упс :(. Случилась исключительная ситуация, которую мы обработать не смогли," +
					"поэтому сообщение съели. Вот исключительная ситуация: %s, а вот сообщение: %s",
				exc.getMessage( ), message.toString( )
			);
			log.error( errorMsg, exc );
			log.info( errorMsg );
			
			// throw new RuntimeException( errorMsg, exc );
		}
	}
}
