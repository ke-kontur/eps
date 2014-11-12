package ru.acs.fts.aud.command.executor.mappers;

import java.io.UnsupportedEncodingException;
import java.util.Calendar;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

import ru.acs.fts.aud.management.model.entities.EdeclAudMessage;
import ru.acs.fts.aud.management.utils.shared.Base64Coder;
import ru.acs.fts.aud.management.utils.shared.GenericUtils;
import ru.acs.fts.aud.rest.service.model.objects.AudMessage;

public class AudMessageMapper
{
	public static EdeclAudMessage mapAudMessage( AudMessage audMessage ) 
		throws UnsupportedEncodingException
	{
		EdeclAudMessage dbmsg = new EdeclAudMessage( );
		
		dbmsg.setEnvelopeId( audMessage.getEnvelopeId( ) );
		dbmsg.setIncomeEnvelopeId( audMessage.getIncomeEnvelopeId( ) );
		dbmsg.setInitialEnvelopeId( audMessage.getInitialEnvelopeId( ) );
		dbmsg.setSenderInformation( audMessage.getSenderInformation( ) );
		dbmsg.setReceiverInformation( audMessage.getReceiverInformation( ) );
		dbmsg.setSoftKind( audMessage.getSoftKind( ) );
		dbmsg.setSoftVersion( audMessage.getSoftVersion( ) );
		dbmsg.setMessageKind( audMessage.getMessageKind( ) );
		dbmsg.setDocumentId( audMessage.getDocumentId( ) );
		dbmsg.setCustomsCode( audMessage.getCustomsCode( ) );
		dbmsg.setPreparationDateTime( mapJodaDateTime( audMessage.getPreparationDateTime( ) ) );
		dbmsg.setReceiveDate( mapJodaDateTime( audMessage.getRecvDate( ) ) );
		dbmsg.setSendDate( mapJodaDateTime( audMessage.getSendDate( ) ) );
		dbmsg.setArchiveClientId( audMessage.getArchiveClientId( ) );
		dbmsg.setCoaDateTime( null );
		dbmsg.setCoaSaveDateTime( null );
		dbmsg.setCodDateTime( null );
		dbmsg.setCodSaveDateTime( null );
		
		dbmsg.setBody( Base64Coder.decodeAsBytes( audMessage.getDocument( ), "UTF-8" ) );
		
		return dbmsg;
	}
	
	public static Calendar mapJodaDateTime( DateTime dt )
	{
		if ( null == dt )
			return null;
		
		return GenericUtils.ensureTimeZone( dt ).toGregorianCalendar( );
	}
}
