package ru.acs.fts.aud.router.model.managers;

import org.springframework.oxm.Marshaller;

import ru.acs.fts.aud.router.model.AudServiceHolder;
import ru.acs.fts.aud.router.processing.definitions.ErrorMessageSourceKeys;
import ru.acs.fts.aud.router.processing.exceptions.ArchiveException;
import ru.acs.fts.aud.router.processing.helpers.ExceptionHelper;
import ru.acs.fts.custommarshaller.EnvelopeMarshaller;
import ru.acs.fts.custommarshaller.XStringMarshallableClass;
import ru.acs.fts.eps2.core.processing.ProcessingConstants;

public class BaseManager // NO_UCD (use default)
{
	protected AudServiceHolder _serviceHolder;
	
	// @formatter:off
	public void setServiceHolder( AudServiceHolder serviceHolder ) { _serviceHolder = serviceHolder; }
	public AudServiceHolder getServiceHolder( ) { return _serviceHolder; }
	// @formatter:on
	
	public static byte[ ] marshall( Object document, Marshaller marshaller, byte[ ] tag ) 
		throws ArchiveException 
	{
		return marshall( document, marshaller ).getByteArray( );
	}
	
	public static XStringMarshallableClass marshall( Object document, Marshaller marshaller ) 
		throws ArchiveException
	{
		try
		{
			EnvelopeMarshaller envMarshaller = new EnvelopeMarshaller( );			
			return envMarshaller.marshalBaseDocOrSignature( document, marshaller );
		}
		catch ( Exception e )
		{
			ExceptionHelper.throwArchiveException( 
				ProcessingConstants.ERROR_TYPE_BUSINESS, 
				ErrorMessageSourceKeys.ERROR_XML_1005, ( Object[ ] )null 
			);
		}
		
		return null;
	}	
}
