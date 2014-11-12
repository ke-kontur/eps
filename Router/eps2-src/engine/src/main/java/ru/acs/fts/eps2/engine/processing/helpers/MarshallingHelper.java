package ru.acs.fts.eps2.engine.processing.helpers;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;

public class MarshallingHelper
{
	private static Marshaller marshaller;
	private static Unmarshaller unmarshaller;
	
	public static Marshaller getSharedMarshaller( ) { return marshaller; }
	public static Unmarshaller getSharedUnmarshaller( ) { return unmarshaller; }
	
	@Required
	public void setMarshaller( Marshaller marshaller ) { MarshallingHelper.marshaller = marshaller; }
	public Marshaller getMarshaller( ) { return marshaller; }
	
	@Required
	public void setUnmarshaller( Unmarshaller unmarshaller ) { MarshallingHelper.unmarshaller = unmarshaller; }
	public Unmarshaller getUnmarshaller( ) { return unmarshaller; }
}
