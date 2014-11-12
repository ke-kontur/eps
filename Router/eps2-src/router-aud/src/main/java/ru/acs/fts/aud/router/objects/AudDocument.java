package ru.acs.fts.aud.router.objects;

import java.util.ArrayList;
import java.util.List;

import ru.acs.fts.custommarshaller.XStringMarshallableClass;
import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.engine.objects.Document;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;

public class AudDocument extends Document
{	
	// @formatter:off
	// @formatter:on
	
	public AudDocument( Object rawDocument ) throws BaseProcessingException, DatabaseException
	{
		super( rawDocument );
	}

	/**
	 * Открытые методы
	 * @throws DatabaseException 
	 */
	
	@Override
	public Document cloneWithoutSignature( ) 
		throws BaseProcessingException, DatabaseException
	{
		// TODO: Проработать и сделать правильно для возможных АЮДовских контейнеров
		
		return new AudDocument( getNakedDocument( ) );
	}

	@Override
	public void setSigned( Object signed ) 
		throws BaseProcessingException
	{
		// TODO: Проработать и сделать правильно для возможных АЮДовских контейнеров
		
		doNotUseThis_setRawDocument( signed );
	}

	@Override
	public List< String > getSubDocumentsXPathes( )
	{
		// TODO: Проработать и сделать правильно для возможных АЮДовских контейнеров
		
		return new ArrayList< String >( );
	}

	@Override
	public String getXmlNamespace( ) throws Exception
	{
		// TODO: Сделать чтоб работало для всех документов
		
		Object doc = getNakedDocument( );
		if ( ! ( doc instanceof XStringMarshallableClass ) )
			return null;
		
		XStringMarshallableClass xstr = ( XStringMarshallableClass )doc;
		return xstr.getXmlNamespace( );
	}

	@Override
	protected void extractContainerDocuments( ) throws BaseProcessingException
	{
		// TODO: Проработать и сделать правильно для возможных АЮДовских контейнеров
	}
}
