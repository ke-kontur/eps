package ru.acs.fts.aud.wmq.router.transport.in;

import javax.jms.Message;
import javax.jms.MessageListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ru.acs.fts.aud.wmq.router.helpers.JmsConverter;
import ru.acs.fts.aud.wmq.router.processing.AudMessageDispatcher;
import ru.acs.fts.aud.wmq.router.transport.out.AudMessageSender;

public class AudMessageListener implements MessageListener
{
	private static final Logger log = LoggerFactory.getLogger( AudMessageListener.class );
	
	private AudMessageSender _audMessageSender;
	private AudMessageDispatcher _audMessageDispatcher;
	
	// @formatter:off
	@Required public void setAudMessageSender( AudMessageSender audMessageSender ) { _audMessageSender = audMessageSender; }
	public AudMessageSender getAudMessageSender( ) { return _audMessageSender; }
	
	@Required public void setAudMessageDispatcher( AudMessageDispatcher audMessageDispatcher ) { _audMessageDispatcher = audMessageDispatcher; }
	public AudMessageDispatcher getAudMessageDispatcher( ) { return _audMessageDispatcher; }
	// @formatter:on

	@Override
	@Transactional( propagation = Propagation.REQUIRED, timeout = 300 )
	public void onMessage( Message message )
	{
		try
		{
			log.info( "Получили новое сообщение" );
			
			byte[ ] bytes = JmsConverter.convert( message );
			
			log.info( String.format(
				"Преобразовали сообщение в массив байт: %s",
				new String( bytes, "UTF-8" ) 
			) );
			
			_audMessageDispatcher.dispatch( bytes );
			
			log.info( String.format(
				"Успешно обработали сообщение от АЮДа"
			) );
		}
		catch ( Exception exc )
		{
			log.error( "Не смогли обработать сообщение", exc );
			
			try
			{
				_audMessageSender.setToError( message );
			}
			catch ( Exception exc2 )
			{
				log.error( "Не удалось отправить сообщение в очередь ошибочных. Мы его съели :(", exc2 );
			}
		}
	}

}
