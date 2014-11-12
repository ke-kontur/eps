package ru.acs.fts.eps2.router.processing.helpers;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.core.processing.WarningLevels;
import ru.acs.fts.eps2.engine.processing.ResultDescriptionInfo;
import ru.acs.fts.eps2.model.entities.Edecl_Errlist;
import ru.acs.fts.eps2.model.services.ErrListService;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.util.helpers.UUIDGen;
import ru.acs.fts.eps2.utils.ReflectionHelper;
import ru.acs.fts.eps2.utils.StringUtil;
import ru.acs.fts.schemas.album.result.ResponseType;
import ru.acs.fts.schemas.album.result.ResultInformationType;
import ru.acs.fts.schemas.album.result.ResultType;

public class ResultEnvelopeHelper
{
    public static final int DESCRIPTION_PART_MAX_SIZE = 250; // NO_UCD (use private)
    private static final String RESULT_DOCUMENT_MODE_ID = "1004054E";
    public static final String STRING_FILTER_PATTERN = "(\\$.*\\$)"; // NO_UCD (use private)
    
	protected static final Logger log = LoggerFactory.getLogger( ResultEnvelopeHelper.class );     // NO_UCD (use private)
    	
    /**
     * Составить документ с результатом по объекту с исключительной ситуацией.
     */
	/*
	public static ResultType getResultDocument( String refDocumentId, BaseEpsCatchedException exception )
	{
		return getResultDocument( refDocumentId, exception.getResultCode( ) );
	}
	*/
	

    public static ResultType getOkResultDocument( String refDocumentId, String resultDescription )
    {
        return createResultDocument(
        	refDocumentId, resultDescription,
        	ResultCodes._00_00000_00, WarningLevels.INFO 
        );
    }
    
    public static ResultType getResultDocument( 
        	String refDocumentId, String errorCode,
        	ErrListService errListService ) 
        throws DatabaseException 
    {
    	Edecl_Errlist errList = errListService.getErrList( 
    			errorCode );
        		
    	if ( null == errList ) 
        {
        	return createResultDocument(
        			refDocumentId, "Не удалось получить описание ошибки",
               		errorCode, WarningLevels.ERROR
            );
        } 
        else 
        {
        	return createResultDocument(
               		refDocumentId, errList.getPublicDescription( ),
               		errorCode, errList.getCategory( ).intValue( ) 
            );
        }
    }
    
    public static ResultType getResultDocument( EDJobBatchContext jobBatchContext, String errorCode ) 
    	throws DatabaseException 
    {
    	ErrListService errListService = jobBatchContext.getServiceHolder( ).getErrListService( );
    	
    	EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
    	String refDocumentId = recvEnv.getDocument( ).getDocumentID( );
    	
    	Edecl_Errlist errList = errListService.getErrList( errorCode );
    	
    	if ( null == errList ) 
        {
        	return createResultDocument(
        		refDocumentId, "Не удалось получить описание ошибки",
               	errorCode, WarningLevels.ERROR
            );
        } 
    	
    	String description = "";
    	try
    	{
    		description = filterErrorDescription( recvEnv, errList.getPublicDescription( ) );
    	}
    	catch ( Exception ex )
    	{
    		log.info( "Не удалось обработать описание ErrorDescription", ex );
    		
    		return createResultDocument(
        			refDocumentId, "Не удалось получить описание ошибки",
               		errorCode, WarningLevels.ERROR
            );
    	}
    	
    	return createResultDocument(
           		refDocumentId, description,
           		errorCode, errList.getCategory( ).intValue( ) );
    }

    private static ResultType createResultDocument( 
    		String refDocumentId, String resultDescription,
            String resultCode, int warningLevel ) 
    {
    	ResultType type = new ResultType( );
    	type.setDocumentID( UUIDGen.getUUID( ).toString( ) );
    	type.setRefDocumentID( refDocumentId );
    	type.setDocumentModeID( RESULT_DOCUMENT_MODE_ID );
    	
    	ResultInformationType informationType = new ResultInformationType( );
    	informationType.setResultCode( resultCode );
    	informationType.setResultCategory( Integer.toString( warningLevel ) );

    	List< String > resultDescriptionList = new ArrayList< String >( );
    	informationType.setResultDescriptionList( resultDescriptionList );

    	if ( null != resultDescription )
    	{
	    	if ( resultDescription.length( ) < DESCRIPTION_PART_MAX_SIZE ) 
	    		resultDescriptionList.add( resultDescription ); 		
	    	else 
	    		resultDescriptionList.addAll( splitDescription( resultDescription ) );
    	}
    	else
    		resultDescriptionList.add( "" );
    	
    	ResponseType response = new ResponseType( );
    	response.setRefDocumentID( refDocumentId );
    	
    	List< ResultInformationType > resultInformation = new ArrayList< ResultInformationType >( );
    	resultInformation.add( informationType );
    	response.setResultInformationList( resultInformation );
    	
    	List< ResponseType > responseList = new ArrayList< ResponseType >( );
    	responseList.add( response );
    	type.setResponseList( responseList );
    	
    	return type;
    }
 
    public static ArrayList< String > splitDescription( String description ) 
    {
    	if ( null == description )
    		return null;

    	int size = description.length( );
    	int count = ( size - 1 ) / DESCRIPTION_PART_MAX_SIZE + 1;
    	int tail = DESCRIPTION_PART_MAX_SIZE * count - size;
    	int entireCount = ( tail != 0 ) ? ( count - 1 ) : count;

    	ArrayList< String > descriptionParts = new ArrayList< String >( count );
    	int position = 0;
    	for ( int i = 0; i < entireCount; i++ ) 
    	{
    		descriptionParts.add( description.substring( position, position + DESCRIPTION_PART_MAX_SIZE ) );
    		position += DESCRIPTION_PART_MAX_SIZE;
    	}
    	
    	if ( tail != 0 ) 
    		descriptionParts.add(description.substring(position));

    	return descriptionParts;
    }
    

	public static ResultDescriptionInfo getErrorInformation( 
			ErrListService errListService, String errorCode ) 
		throws DatabaseException
	{
		ResultDescriptionInfo resultDescriptionInfo = new ResultDescriptionInfo( );			
    	Edecl_Errlist errList = errListService.getErrList( errorCode );
    	
    	if ( null != errList )
    	{
    		resultDescriptionInfo.category = null;
    		if ( null != errList.getCategory( ) )
    			resultDescriptionInfo.category = errList.getCategory( ).toString( );
    		
    		resultDescriptionInfo.description = ResultEnvelopeHelper.splitDescription(
    			errList.getPublicDescription( )
    		);
    	}
    	else
    	{
			log.error( String.format(
				"Не удалось получить описание ошибки %s",
				errorCode 
			) );
    		
    	}
    	
		return resultDescriptionInfo;
	}	
	
	private static String filterErrorDescription( EDEnvelope recvEnv, String description ) 
		throws IllegalArgumentException, IllegalAccessException, InvocationTargetException
	{
		StringBuffer resultBuilder = new StringBuffer( );
		Pattern pattern = Pattern.compile( STRING_FILTER_PATTERN );
		Matcher matcher = pattern.matcher( description );
		
		String tail = "";
		boolean matched = false;
		while ( matcher.find( ) )
		{
			matcher.appendReplacement( resultBuilder, 
					getValueFromContext( recvEnv, matcher.group( 1 ) ) );
			matched = true;
			tail = description.substring( matcher.end( ) );
		}
		
		if ( matched )
			resultBuilder.append( tail );
		
		String result = resultBuilder.toString( );
		if ( StringUtil.isNullOrEmpty( result ) )
			result = description;
			
		return result;
	}
	
	private static String getValueFromContext( EDEnvelope recvEnv, String param )
		throws IllegalArgumentException, IllegalAccessException, InvocationTargetException
	{
		StringBuilder getterName = new StringBuilder( param.substring( 1, param.length( ) - 1 )  );
		char first = Character.toUpperCase( getterName.charAt( 0 ) );
		getterName.setCharAt( 0, first );
		getterName.insert( 0, "get" );
		
		Method getter = ReflectionHelper.getMethodByName( recvEnv, getterName.toString( ), 0 );
		Object result = null;
		
		if ( null != getter )
			result = getter.invoke( recvEnv );
		else
		{
			getter = ReflectionHelper.getMethodByName( recvEnv.getDocument( ), getterName.toString( ), 0 );
			if ( null != getter )
				result = getter.invoke( recvEnv.getDocument( ) );
		}
		
		return null == result ? "null" : result.toString( );
	}
	
}
