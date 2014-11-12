package ru.acs.fts.eps2.router.persistence.mappers;

import org.springframework.oxm.Marshaller;

import ru.acs.fts.custommarshaller.EnvelopeMarshaller;
import ru.acs.fts.eps2.engine.data.kind.DocumentStates;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
import ru.acs.fts.eps2.model.entities.Edecl_Notuniq_Msg_Doc;
import ru.acs.fts.eps2.router.objects.EDDocument;
import ru.acs.fts.eps2.util.helpers.UUIDGen;
import ru.acs.fts.eps2.utils.StringUtil;

public class BodyToDbMapper
{
	private static Marshaller _marshaller;
	
	// @formatter:off
	public void setMarshaller( Marshaller marshaller ) { _marshaller = marshaller; }
	public Marshaller getMarshaller( ) { return _marshaller; }
	// @formatter:on
	
	public static Edecl_Msg_Doc mapUniqDocument( EDDocument doc )
	{
		Edecl_Msg_Doc uniqDocument = new Edecl_Msg_Doc( );
		
		uniqDocument.setAjdGlobalDocId( UUIDGen.getUUID( ).toString( ) /* UUID.randomUUID( ).toString( ) */ );
		uniqDocument.setBody( getDocumentBody( doc ) );		
		uniqDocument.setRefMainDoc( doc.getRefMainDoc( ) );
		uniqDocument.setRefDocumentId( doc.getRefDocumentID( ) );
		uniqDocument.setDocumentID( doc.getDocumentID( ) ); 
		uniqDocument.setDocumentModeId( doc.getDocumentModeID( ) ); 
		uniqDocument.setModificationId( doc.getModificationID( ) );
		uniqDocument.setState( getState( doc ) );
		uniqDocument.setIncomeDocId( doc.getIncomeDocumentID( ) );
		
		return uniqDocument;		
	}
	
	public static Edecl_Notuniq_Msg_Doc mapNotUniqDocument( EDDocument doc )
	{
		Edecl_Notuniq_Msg_Doc notUniqDocument = new Edecl_Notuniq_Msg_Doc( );
		
		notUniqDocument.setRefMainDoc( doc.getRefMainDoc( ) );
		notUniqDocument.setRefDocumentId( doc.getRefDocumentID( ) ); 
		notUniqDocument.setDocumentId( doc.getDocumentID( ) ); 
		notUniqDocument.setDocumentModeId( doc.getDocumentModeID( ) ); 
		notUniqDocument.setRecordId( UUIDGen.getUUID( ).toString( ) );
		
		return notUniqDocument;
	}
	
	private static byte[ ] getDocumentBody( EDDocument doc )
	{
		if ( ! doc.getSaveBody( ) )
			return "nullx".getBytes( );
		
		try
		{
			EnvelopeMarshaller envMarshaller = new EnvelopeMarshaller( );
			return envMarshaller.marshalBaseDocOrSignature( doc.getRawDocument( ), _marshaller ).getByteArray( );
		}
		catch ( Exception exc )
		{
			return "errorx".getBytes( );
		}
	}
	
	private static String getState( EDDocument doc )
	{
		String state = DocumentStates.NOTSET;
		if ( ! StringUtil.isNullOrEmpty( doc.getCurrentState( ) ) )
			state = doc.getCurrentState( );
		
		return state;
	}
}
