package ru.acs.fts.eps2.balancer.transport.in;

import javax.jms.Message;
import javax.jms.MessageListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StopWatch;

import ru.acs.fts.eps2.balancer.dispatch.IMessageDispatcher;
import ru.acs.fts.eps2.balancer.exceptions.BalancerException;
import ru.acs.fts.eps2.balancer.exceptions.MessageDispatchException;

public class DispatchableMessageListener implements MessageListener
{
	private static final Logger log = LoggerFactory.getLogger( DispatchableMessageListener.class );
	
	private IMessageDispatcher _dispatcher;
	private int _maxRetryCount;
	
	// @formatter:off
	@Required public void setDispatcher( IMessageDispatcher dispatcher ) { _dispatcher = dispatcher; }
	public IMessageDispatcher getDispatcher( ) { return _dispatcher; }
	
	@Required public void setMaxRetryCount( int maxRetryCount ) { _maxRetryCount = maxRetryCount; }
	public int getMaxRetryCount( ) { return _maxRetryCount; }
	// @formatter:on
	
	@Transactional( propagation = Propagation.REQUIRED, timeout = 300 )
	public void onMessage( Message message )
	{
		try
		{
			log.info( "Контроллер-Балансир получил новое сообщение." );
			
			String swname = String.format( "dispatch.%s", Thread.currentThread( ).getName( ) ); 
			
			StopWatch sw = new StopWatch( );
			sw.start( swname );
			
			boolean shouldDispatch = true;
			
			if ( message.propertyExists( "JMSXDeliveryCount" ) )
			{
				int deliveryCount = message.getIntProperty( "JMSXDeliveryCount" );
				log.info( String.format( "Попытка обработки №%d", deliveryCount ) );
				
				if ( deliveryCount > _maxRetryCount )
				{
					log.info( "Превышен лимит повторов обработки сообщения. Сообщение будет перенаправлено в очередь ошибочных" );
					
                    _dispatcher.discard( message );
                    shouldDispatch = false;
                }
            }			
			
			if ( shouldDispatch )
				_dispatcher.dispatch( message );
			
			sw.stop( );

			long millis = sw.getLastTaskTimeMillis( ) / 1000;
			
			String elapsed = String.format( 
				"%d:%d.%d", 
				millis / 60, millis % 60, 
				sw.getLastTaskTimeMillis( ) % 1000 
			); 			
			
			log.info( String.format(
				"Сообщение успешно обработано контроллером-балансиром. Это заняло: %s", elapsed 
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
			
			if ( exc instanceof MessageDispatchException )
			{
				Throwable innerExc = exc.getCause( );
				if ( null != innerExc && ( innerExc instanceof BalancerException ) )
				{
					BalancerException bexc = ( BalancerException )innerExc;
					if ( bexc.getRollback( ) )
					{
						log.info( "Случилась исключительная ситуация, которая требует отката транзакции" );
						throw new RuntimeException( errorMsg, exc );
					}
				}
			}
			
			// throw new RuntimeException( errorMsg, exc );
			
			try
			{
				_dispatcher.discard( message );
			}
			catch ( Exception exc2 )
			{
				// do nothing
			}
		}
	}
}
