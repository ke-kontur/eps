package ru.acs.fts.eps2.router.processing.helpers;

import java.util.ArrayList;
import java.util.List;

import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.core.processing.WarningLevels;
import ru.acs.fts.eps2.engine.data.kind.DocumentModeIDs;
import ru.acs.fts.eps2.model.entities.Edecl_Errlist;
import ru.acs.fts.eps2.model.services.ErrListService;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.util.helpers.UUIDGen;
import ru.acs.fts.schemas.admin.int_dtresponce.INTDTResponseType;
import ru.acs.fts.schemas.album.result.ResponseType;
import ru.acs.fts.schemas.album.result.ResultInformationType;
import ru.acs.fts.schemas.album.result.ResultType;

public class DocumentCreator  // NO_UCD (use default)
{
	public static final int DESCRIPTION_PART_MAX_SIZE = 250; // NO_UCD (use private)

    public static ResultType createSuccessResultDocument( String refDocumentId, String resultDescription ) // NO_UCD (use default)
    {
        return createResultDocument(
        	refDocumentId, resultDescription,
        	ResultCodes._00_00000_00, WarningLevels.INFO 
        );
    }	
    	
    public static ResultType createResultDocument(  // NO_UCD (use default)
        	String refDocumentId, String errorCode,
        	ErrListService errListService ) 
        throws DatabaseException 
    {
    	Edecl_Errlist errList = errListService.getErrList( errorCode );
        		
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
    
    public static INTDTResponseType createGatewayResult( 
    		String refDocumentId, String errorCode, 
    		ErrListService errListService ) 
    	throws DatabaseException
    {
    	Edecl_Errlist errList = errListService.getErrList( errorCode );
    	
    	if ( null == errList )
    	{
    		return createGatewayResultDocument( 
    				refDocumentId, "Не удалось получить описание ошибки", 
    				errorCode );
    	}
    	else
    	{
    		return createGatewayResultDocument( 
    				refDocumentId, errList.getPublicDescription( ), 
    				errorCode );
    	}
    }
	
	private static ResultType createResultDocument( 
			String refDocumentId, String resultDescription, 
			String resultCode, int warningLevel )
	{
		// ResultType
		ResultType result = new ResultType( );

		result.setDocumentModeID( DocumentModeIDs.RESULT );
		result.setDocumentID( UUIDGen.getUUID( ).toString( ) );
		result.setRefDocumentID( refDocumentId );

		// ResponseType[]
		List< ResponseType > responseList = new ArrayList< ResponseType >( );
		result.setResponseList( responseList );

		// ResponseType
		ResponseType response = new ResponseType( );
		response.setRefDocumentID( refDocumentId );
		responseList.add( response );

		// ResultInformationType[]
		List< ResultInformationType > resultInformation = new ArrayList< ResultInformationType >( );
		response.setResultInformationList( resultInformation );
		
		// ResultInformationType
		ResultInformationType informationType = new ResultInformationType( );
		informationType.setResultCode( resultCode );
		informationType.setResultCategory( Integer.toString( warningLevel ) );
		resultInformation.add( informationType );

		// ResultDescription
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

		return result;
	}
	
	private static INTDTResponseType createGatewayResultDocument(
			String refDocumentId, String resultDescription, String resultCode )
	{
		INTDTResponseType response = new INTDTResponseType( );
		
		response.setDocumentModeID( DocumentModeIDs.INT_DT_RESPONSE );
		response.setDocumentID( UUIDGen.getUUID( ).toString( ) );
		response.setRefDocumentID( refDocumentId );
		response.setResultCode( resultCode );
		response.setResultDescription( null != resultDescription ? resultDescription : "" );
				
		return response;
	}
	
    public static ArrayList< String > splitDescription( String description )  // NO_UCD (use private)
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
}
