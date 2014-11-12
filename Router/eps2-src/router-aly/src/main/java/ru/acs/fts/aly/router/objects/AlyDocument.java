package ru.acs.fts.aly.router.objects;

import java.util.ArrayList;
import java.util.List;

import ru.acs.fts.custommarshaller.XStringMarshallableClass;
import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.engine.objects.Document;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;

public class AlyDocument extends Document
{

	public AlyDocument( Object rawDocument ) 
		throws BaseProcessingException, DatabaseException
	{
		super( rawDocument );
	}

	@Override
	public Document cloneWithoutSignature( ) 
		throws BaseProcessingException, DatabaseException
	{
		// TODO: Проработать и сделать правильно для возможных контейнеров		
		return new AlyDocument( getNakedDocument( ) );
	}

	@Override
	public void setSigned( Object signed ) 
		throws BaseProcessingException, DatabaseException
	{
		// TODO: Проработать и сделать правильно для возможных контейнеров
		doNotUseThis_setRawDocument( signed );
	}

	@Override
	public List< String > getSubDocumentsXPathes( )
	{
		// TODO: Проработать и сделать правильно для возможных контейнеров		
		return new ArrayList< String >( );
	}

	@Override
	public String getXmlNamespace( ) throws Exception
	{
		Object doc = getNakedDocument( );
		if ( ! ( doc instanceof XStringMarshallableClass ) )
			return null;
		
		XStringMarshallableClass xstr = ( XStringMarshallableClass )doc;
		return xstr.getXmlNamespace( );
	}

	@Override
	protected void extractContainerDocuments( ) 
		throws BaseProcessingException, DatabaseException
	{
		// TODO: Проработать и сделать правильно для возможных контейнеров		
	}

}
