package ru.acs.fts.eps2.router.processing.ead.mappers;

import org.joda.time.LocalDate;

import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.model.entities.Edarch_Archive_Docs;
import ru.acs.fts.eps2.model.entities.Edarch_Archive_Docs_WithContent;
import ru.acs.fts.eps2.router.processing.ead.EadResponse;

public class FromEadMapper
{	
	public static EadResponse mapEadResponse( Edarch_Archive_Docs documentRecord )
	{
		EadResponse response = new EadResponse( );
		
		response.setResultCode( ResultCodes._00_00000_00 );
		response.setDocData( null );
		response.setAlbumVersion( documentRecord.getArdocAlbumVersion( ) );
		response.setDocDate( new LocalDate( documentRecord.getArdocCreateDate( ) ) );
		response.setDocumentModeId( documentRecord.getArdocDocType( ) );
		
		return response;
	}
	
	public static EadResponse mapEadResponse( Edarch_Archive_Docs documentRecord, Edarch_Archive_Docs_WithContent documentData )
	{
		EadResponse response = mapEadResponse( documentRecord );

		response.setDocData( documentData.getArdocDsDate( ) );
		
		return response;
	}
	
	public static EadResponse mapFailedEadResponse( String resultCode )
	{
		EadResponse response = new EadResponse( );
		
		response.setResultCode( resultCode );
		
		return response;
	}
}
