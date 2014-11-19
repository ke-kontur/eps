package ru.acs.fts.aud.wmq.router.processing.tasks;

import java.io.IOException;

import org.jibx.runtime.JiBXException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.oxm.Marshaller;

import ru.acs.fts.custommarshaller.EnvelopeMarshaller;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDBaseEnvelopeType;
import ru.acs.fts.schemas.envelope.BodyType;
import ru.acs.fts.schemas.envelope.EnvelopeType;
import ru.acs.fts.schemas.envelope.SignatureType;

public class AcquireAudDocumentTask
{
	private static final Logger log = LoggerFactory.getLogger( AcquireAudDocumentTask.class );
	
	private Marshaller _marshaller;
	
	// @formatter:off
	@Required public void setMarshaller( Marshaller marshaller ) { _marshaller = marshaller; }
	public Marshaller getMarshaller( ) { return _marshaller; }
	// @formatter:on
	
	// out
	
	private byte[ ] _data;
	private AUDBaseEnvelopeType _audMessage;
	
	// @formatter:off
	public byte[ ] getData( ) { return _data; }
	
	public AUDBaseEnvelopeType getAudMessage( ) { return _audMessage; }
	// @formatter:on
	
	public void acquire( EnvelopeType envelope )
			throws IOException, JiBXException {
		log.info( "Начали получение документа и обертки АЮДа из полученного конверта" );
		
		BodyType body = envelope.getBody( );
		Object signDoc = body.getAnyList( ).get( 0 );
		
		EnvelopeMarshaller envMarshaller = new EnvelopeMarshaller( );
		_data = envMarshaller.marshalBaseDocOrSignature( signDoc, _marshaller ).getByteArray( );
		
		while ( signDoc instanceof SignatureType )
		{
			SignatureType sig = ( SignatureType )signDoc;
			signDoc = sig.getObject( ).getAny( );
		}
		
		if ( signDoc instanceof AUDBaseEnvelopeType )
		{
			_audMessage = ( AUDBaseEnvelopeType )signDoc;
		}
		
		log.info( "Закончили получение документа и обертки АЮДа из полученного конверта" );
	}
}
