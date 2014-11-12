package ru.acs.fts.eps2.router.persistence.operators;

import org.springframework.oxm.Marshaller;

import ru.acs.fts.custommarshaller.EnvelopeMarshaller;
import ru.acs.fts.custommarshaller.XStringMarshallableClass;
import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.objects.EDDocument;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;

public abstract class BaseOperator implements IOperator
{
	public static byte[ ] marshall( Object document, Marshaller marshaller, byte[ ] tag )
		throws BaseProcessingException, DatabaseException
	{
		return marshall( document, marshaller ).getByteArray( );
	}
	
	public static XStringMarshallableClass marshall( Object document, Marshaller marshaller )
		throws BaseProcessingException, DatabaseException
	{
		String documentId = "<unknown>";
		
		try
		{
			EDDocument xdoc = new EDDocument( document );
			documentId = xdoc.getDocumentID( );
			
			EnvelopeMarshaller envMarshaller = new EnvelopeMarshaller( );			
			return envMarshaller.marshalBaseDocOrSignature( document, marshaller );
		}
		catch ( Exception e )
		{
			ErrorHelper.throwException( 
				"Не удалось маршаллить документ", documentId, 
				ResultCodes._09_96669_99, ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
		
		return null;
	}

}
