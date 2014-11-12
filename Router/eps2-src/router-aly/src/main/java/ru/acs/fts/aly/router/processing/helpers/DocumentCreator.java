package ru.acs.fts.aly.router.processing.helpers;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;

import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.core.processing.WarningLevels;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.util.helpers.UUIDGen;
import ru.acs.fts.schemas.admin.intexchresult.IntExchResultType;
import ru.acs.fts.schemas.admin.intexchresult.ResponseType;
import ru.acs.fts.schemas.admin.intexchresult.ResultInformationType;

public class DocumentCreator  // NO_UCD (use default)
{
	public static final int DESCRIPTION_PART_MAX_SIZE = 250; // NO_UCD (use private)

    public static IntExchResultType createSuccessResultDocument( String refDocumentId, String resultDescription ) // NO_UCD (use default)
    {
        return createResultDocument(
        	refDocumentId, resultDescription,
        	ResultCodes._00_00000_00, WarningLevels.INFO 
        );
    }	
    	
    public static IntExchResultType createResultDocument(  // NO_UCD (use default)
        	String refDocumentId, String errorCode ) 
        throws DatabaseException 
    {
    	return createResultDocument(
           	refDocumentId, null,
           	errorCode, WarningLevels.ERROR 
        );
    }	
	
	private static IntExchResultType createResultDocument(
			String refDocumentId, String resultDescription, 
			String resultCode, int warningLevel )
	{
		DateTime now = new DateTime( );
		
		// ResultType
		IntExchResultType result = new IntExchResultType( );

		result.setDocumentID( UUIDGen.getUUID( ).toString( ) );
		result.setRefDocumentID( refDocumentId );
		result.setDocumentModeID( "1090016E" );
		
		List< ResponseType > responses = new ArrayList< ResponseType >( );
		result.setResponseList( responses );
		
		ResponseType response = new ResponseType( );
		responses.add( response );
		
		response.setRefDocumentID( refDocumentId );
		response.setCreateDate( now.toLocalDate( ) );
		response.setCreateTime( now.toLocalTime( ) );
		
		List< ResultInformationType > resInfos = new ArrayList< ResultInformationType >( );
		response.setResultInformationList( resInfos );
		
		ResultInformationType resInfo = new ResultInformationType( );
		resInfos.add( resInfo );
		
		resInfo.setResultCode( resultCode );

		if ( null != resultDescription )
		{
			if ( resultDescription.length( ) < DESCRIPTION_PART_MAX_SIZE )
				resInfo.setResultDescriptionList( toArray( resultDescription ) );
			else
				resInfo.setResultDescriptionList( splitDescription( resultDescription ) );
		}
		else
			resInfo.setResultDescriptionList( toArray( "" ) );

		return result;
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
    
    public static ArrayList< String > toArray( String desc )
    {
    	ArrayList< String > res = new ArrayList< String >( );
    	res.add( desc );
    	
    	return res;
    }
}
