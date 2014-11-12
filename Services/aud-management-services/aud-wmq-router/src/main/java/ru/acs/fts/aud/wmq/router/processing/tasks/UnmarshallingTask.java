package ru.acs.fts.aud.wmq.router.processing.tasks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.oxm.Unmarshaller;

import ru.acs.fts.custommarshaller.EnvelopeUnmarshaller;
import ru.acs.fts.schemas.envelope.EnvelopeType;

public class UnmarshallingTask
{
	private static final Logger log = LoggerFactory.getLogger( UnmarshallingTask.class );
	
	private Unmarshaller _unmarshaller;
	
	// @formatter:off
	@Required public void setUnmarshaller( Unmarshaller unmarshaller ) { _unmarshaller = unmarshaller; }
	public Unmarshaller getUnmarshaller( ) { return _unmarshaller; }
	// @formatter:on
	
	public EnvelopeType unmarshall( byte[ ] message )
		throws Exception
	{
		log.info( "Начинаем преобразование входящего сообщение в объекты классов (анмаршаллинг)" );
		
		EnvelopeUnmarshaller envUnmarshaller = new EnvelopeUnmarshaller( );		
		EnvelopeType envelope = envUnmarshaller.unmarshall( message, _unmarshaller );
		
		log.info( "Анмаршаллинг входящего конверта успешно завершен" );
		
		return envelope;
	}
}
