package ru.acs.fts.eps2.engine.objects;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.schemas.envelope.SignatureType;

public abstract class Document
{
	private static final Logger log = LoggerFactory.getLogger( Document.class );
	
	/**
	 * Контекст общего назначения
	 */
	private final GeneralPurposeContext _context = new GeneralPurposeContext( );
	
	/**
	 * Ссылка на прикладной документ
	 */
	private Object _rawDocument;
		
	/**
	 * Флаг необходимости сохранения тела сообщения. В случае false в BLOB будет помещена строка "nullx"
	 */
	private boolean _saveBody = true;
	
	/**
	 * Документы в контейнере
	 */
	private Map< String, Document > _containerDocuments = new HashMap< String, Document >( );
	
	public Document( Object rawDocument ) throws BaseProcessingException, DatabaseException
	{
		_rawDocument = rawDocument;
		
		extractContainerDocuments( );
	}
	
	// @formatter:off
	public GeneralPurposeContext getContext( ) { return _context; }
	
	public void doNotUseThis_setRawDocument( Object rawDocument ) { _rawDocument = rawDocument; }
	public Object getRawDocument( ) { return _rawDocument; }
	
	public void setSaveBody( boolean saveBody ) { _saveBody = saveBody; }
	public boolean getSaveBody( ) { return _saveBody; }
	
	public void setContainerDocuments( Map< String, Document > containerDocuments ) { _containerDocuments = containerDocuments; }
	public Map< String, Document > getContainerDocuments( ) { return _containerDocuments; }
	// @formatter:on
	
	/**
	 * Общие операции
	 */
	
	public boolean hasSignature( )
	{
		return ( _rawDocument instanceof SignatureType );
	}
	
	public abstract Document cloneWithoutSignature( ) throws BaseProcessingException, DatabaseException;
	public abstract void setSigned( Object signed ) throws BaseProcessingException, DatabaseException;
	
	public abstract List< String > getSubDocumentsXPathes( );
	
	public Object getNakedDocument( )
	{
		if ( null == _rawDocument )
			return null;
		
		Object doc = _rawDocument;
		while ( doc instanceof SignatureType )
		{
			SignatureType sig = ( SignatureType )doc;
			doc = sig.getObject( ).getAny( );
		}
		return doc;
	}
	
	public String getDocumentID( )
	{
		if ( null == _rawDocument )
			return null;
		
		try
		{
			Object doc = getNakedDocument( );
			
			Method mGet = getMethodByName( doc, "getDocumentID", 0 );
			String documentId = mGet.invoke( doc, ( Object[ ] )null ).toString( );

			return documentId;
		}
		catch ( Exception exc )
		{
			// log.error( ":'(", exc );
		}

		return null;
	}
	
	public void setDocumentID( String documentId )
	{
		if ( null == _rawDocument )
			throw new IllegalStateException( "Документ еще не инициализирован!" );
		if ( hasSignature( ) )
			throw new IllegalStateException( "Нельзя изменять документ внутри подписи!" );
		
		try
		{
			Object doc = getNakedDocument( );
			String[ ] str = new String[ ] { documentId };

			Method mSet = getMethodByName( doc, "setDocumentID", 1 );
			mSet.invoke( doc, ( Object[ ] )str );
		}
		catch ( Exception exc )
		{
			throw new IllegalStateException( exc );
		}		
	}
	
	public String getRefDocumentID( )
	{
		if ( null == _rawDocument )
			return null;
		
		try
		{
			Object doc = getNakedDocument( );
			
			Method mGet = getMethodByName( doc, "getRefDocumentID", 0 );
			String refDocumentId = mGet.invoke( doc, ( Object[ ] )null ).toString( );

			return refDocumentId;
		}
		catch ( Exception exc )
		{
			// log.error( ":'(", exc );
		}

		return null;		
	}
	
	public void setRefDocumentID( String refDocumentId )
	{
		if ( null == _rawDocument )
			throw new IllegalStateException( "Документ еще не инициализирован!" );
		if ( hasSignature( ) )
			throw new IllegalStateException( "Нельзя изменять документ внутри подписи!" );
		
		try
		{
			Object doc = getNakedDocument( );
			String[ ] str = new String[ ] { refDocumentId };

			Method mSet = getMethodByName( doc, "setRefDocumentID", 1 );
			mSet.invoke( doc, ( Object[ ] )str );
		}
		catch ( Exception exc )
		{
			throw new IllegalStateException( exc );
		}		
	}
	
	public String getDocumentModeID( )
	{
		if ( null == _rawDocument )
			return null;
		
		try
		{
			Object doc = getNakedDocument( );
			
			Method mGet = getMethodByName( doc, "getDocumentModeID", 0 );
			String documentModeId = mGet.invoke( doc, ( Object[ ] )null ).toString( );

			return documentModeId;
		}
		catch ( Exception exc )
		{
			// log.error( ":'(", exc );
		}

		return null;
	}
	
	public String getArchDeclId( )
	{
		if ( null == _rawDocument )
			return null;
		
		try
		{
			Object doc = getNakedDocument( );
			
			Method mGet = getMethodByName( doc, "getArchDeclID", 0 );
			String archDeclId = mGet.invoke( doc, ( Object[ ] )null ).toString( );
			
			return archDeclId;
		}
		catch ( Exception ex )
		{
			// log.error( ":'(", ex );
		}
		
		return null;
	}
	
	@SuppressWarnings( "unchecked" )
	public < T > T getDocumentAsClass( Class<T> clz ) 
		throws Exception
	{
		Object doc = getNakedDocument( );
		
		if ( null == doc || null == clz || ! clz.isAssignableFrom( doc.getClass( ) ) )
		{
			String errorMsg = String.format(
				"Для обработки ожидался другой класс, мы ждали %s, а получили %s",
				null != clz ? clz.getSimpleName( ) : "null", 
				null != doc ? doc.getClass( ).getSimpleName( ) : "null"
			);
			
			throw new Exception( errorMsg );
		}

		return ( T )doc;
	}
	
	public < T > boolean isDocumentOfClass( Class< T > clz )
	{
		Object doc = getNakedDocument( );
		if ( null == doc )
			return false;
		
		return ( clz.isAssignableFrom( doc.getClass( ) ) );
	}
	
	
	public Document getDocumentInContainer( String documentId )
	{
		if ( ! getContainerDocuments( ).containsKey( documentId ) )
			return null;
		
		return getContainerDocuments( ).get( documentId );
	}
	
	public < T > Document getDocumentInContainer( Class< T > cls )
	{
		for ( String cDocId : getContainerDocuments( ).keySet( ) )
		{
			Document cdoc = getContainerDocuments( ).get( cDocId );
			if ( cdoc.isDocumentOfClass( cls ) )
				return cdoc;
		}
		
		return null;
	}
	
	public abstract String getXmlNamespace( )  throws Exception;
	
	
	/**
	 * Закрытые методы
	 */
	protected abstract void extractContainerDocuments( ) throws BaseProcessingException, DatabaseException;
		
	/**
	 * Рефлексия
	 */
	
	public static Method getMethodByName( Object obj, String name, int paramsCount )
	{
		Class< ? > clz = obj.getClass( );
		for ( Method m : clz.getMethods( ) )
		{
			if ( m.getName( ).equals( name ) && m.getParameterTypes( ).length == paramsCount
					&& !Modifier.isStatic( m.getModifiers( ) ) )
				return m;
		}

		return null;
	}
	
	public static Field getFieldByName( Object obj, String name ) // NO_UCD (use private)
	{
		Class< ? > cls = obj.getClass( );
		try
		{
			Field f = cls.getDeclaredField( name );
			if ( null != f )
			{
				f.setAccessible( true );
				return f;
			}
		}
		catch ( Exception ex )
		{
			log.error( ":'(", ex );
		}
		
		return null;
	}
	
}
