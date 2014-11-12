package ru.acs.fts.eps2.engine.transport.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ibm.jms.JMSBytesMessage;

import ru.acs.fts.eps2.engine.error.JMSMessageConverterException;

import javax.jms.BytesMessage;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.StreamMessage;

import java.io.ByteArrayOutputStream;

public class JMSMessageConverter
{
	private static final Logger log = LoggerFactory.getLogger( JMSMessageConverter.class );

	public static byte[ ] toBytes( Message message ) 
		throws JMSMessageConverterException
	{
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream( );

		byte[ ] buffer = new byte[ 1024 ];
		int countReadBytes = 0;

		try
		{
			if ( message instanceof JMSBytesMessage )
			{
				JMSBytesMessage jmsMessage = ( JMSBytesMessage )message;
				
				log.debug( String.format( 
					"Размер тела сообщения: %d", jmsMessage.getBodyLength( ) 
				) );
				
				while ( ( countReadBytes = jmsMessage.readBytes( buffer ) ) != -1 )
				{
					outputStream.write( buffer, 0, countReadBytes );
				}
			}
			else if ( message instanceof BytesMessage )
			{
				BytesMessage bytesMessage = ( BytesMessage )message;
				bytesMessage.reset( );

				while ( ( countReadBytes = bytesMessage.readBytes( buffer ) ) != -1 )
				{
					outputStream.write( buffer, 0, countReadBytes );
				}
			}
			else if ( message instanceof StreamMessage )
			{
				StreamMessage streamMessage = ( StreamMessage )message;
				streamMessage.reset( );
				
				while ( ( countReadBytes = streamMessage.readBytes( buffer ) ) != -1 )
				{
					outputStream.write( buffer, 0, countReadBytes );
				}
			}
			else
			{
				String errorMsg = 
					"Не удалось преобразовать JMS сообщение в массив байт. Неизвестный тип данных.";
				
				log.error( errorMsg );
				throw new JMSMessageConverterException( errorMsg );
			}
		}
		catch ( JMSException e )
		{
			String msg = "Ошибка перевода JMS сообщения в массив байт."; 
			String errorMsg = String.format( "%s %s", msg, e.getMessage( ) );
			
			log.error( errorMsg, e );
			throw new JMSMessageConverterException( msg, e );
		}

		return outputStream.toByteArray( );
	}

}