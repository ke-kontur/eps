package ru.acs.fts.aud.wmq.router.helpers;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

import javax.jms.BytesMessage;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.StreamMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ibm.jms.JMSTextMessage;

public class JmsConverter
{
	private static final Logger log = LoggerFactory.getLogger( JmsConverter.class );
	
	public static byte[ ] convert( Message message ) 
		throws Exception
	{
		ByteArrayOutputStream os = new ByteArrayOutputStream( );
		
		byte[ ] buffer = new byte[ 1024 ];
		int countReadBytes = 0;
		try 
		{
			if ( message instanceof BytesMessage ) 
			{
				BytesMessage bytesMessage = ( BytesMessage )message;
				bytesMessage.reset( );
				while ( ( countReadBytes = bytesMessage.readBytes( buffer ) ) != -1 ) 
				{
					os.write( buffer, 0, countReadBytes );
				}
			} 
			else if ( message instanceof StreamMessage ) 
			{
				StreamMessage streamMessage = ( StreamMessage )message;
				streamMessage.reset( );
				while ( ( countReadBytes = streamMessage.readBytes( buffer ) ) != -1 ) 
				{
					os.write( buffer, 0, countReadBytes );
				}
			} 
			else if ( message instanceof JMSTextMessage )
			{
				JMSTextMessage jmsTextMessage = ( JMSTextMessage )message;
				
				String text = jmsTextMessage.getText( );
				countReadBytes = text.length( );
					
				try
				{
					os.write( text.getBytes( "UTF-8" ), 0, countReadBytes );
				}
				catch ( UnsupportedEncodingException e )
				{
					// EMTPY
				}
			} 
			else
			{
				String errorMsg = String.format(
					"Не удалось преобразовать JMS сообщение в массив байт. Неизвестный тип данных: %s.",
					message.getClass( ).getName( )
				); 
				
				log.error( errorMsg );
				throw new Exception( errorMsg );
			}
		} 
		catch ( JMSException e ) 
		{
			String errorMsg = String.format(
				"Ошибка перевода JMS сообщения в массив байт: %s",
				e.getMessage( )
			);
			
			log.error( errorMsg, e );
			throw new Exception( errorMsg, e );
		}		
		
		return os.toByteArray( );		
	}
}
