package ru.acs.fts.eps2.router.processing.ead.mappers;

import java.util.Calendar;
import java.util.Date;

import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.model.entities.Edarch_Reqinfo;
import ru.acs.fts.eps2.model.entities.ExtEadManifest;
import ru.acs.fts.eps2.router.processing.ead.EadRequest;
import ru.acs.fts.eps2.router.processing.ead.EadResponse;

public class EadToManifestMapper
{
	public static ExtEadManifest map2Manifest( 
			String envelopeId, String documentId,
			EadRequest request, EadResponse response )
	{
		ExtEadManifest manifest = new ExtEadManifest( );
		manifest.setRequestEnvelopeId( envelopeId );
		manifest.setRequestDocumentId( documentId );
		manifest.setRequestArchId( request.getArchId( ) );
		manifest.setRequestArchDocId( request.getArchDocId( ) );
		manifest.setRequestLineId( request.getLineId( ) );
		manifest.setRequestDate( Calendar.getInstance( ) );
		manifest.setDocCode( request.getDocCode( ) );
		manifest.setSoftVersion( request.getSoftVersion( ) );

		if ( response.isSucceeded( ) )
		{
			manifest.setStatus( ExtEadManifest.STATUS_RECEIVED );
			manifest.setData( response.getDocData( ) );
			manifest.setAlbumVersion( response.getAlbumVersion( ) );
			manifest.setCreateDate( response.getDocDate( ).toDate( ) ); 
			manifest.setDocumentModeId( response.getDocumentModeId( ) );
			manifest.setResultCode( ResultCodes._00_00000_00 );
		}
		else
		{
			manifest.setStatus( ExtEadManifest.STATUS_FAILED );
			manifest.setResultCode( response.getResultCode( ) ); 
		}		
		
		return manifest;
	}	
	
	public static ExtEadManifest map2Manifest(
			String envelopeId, String documentId,
			EadRequest request )
	{
		ExtEadManifest manifest = new ExtEadManifest( );
		manifest.setRequestEnvelopeId( envelopeId );
		manifest.setRequestDocumentId( documentId );
		manifest.setRequestArchId( request.getArchId( ) );
		manifest.setRequestArchDocId( request.getArchDocId( ) );
		manifest.setStatus( ExtEadManifest.STATUS_REQUESTED );
		manifest.setData( null );
		manifest.setRequestLineId( request.getLineId( ) );
		manifest.setRequestDate( Calendar.getInstance( ) );
		manifest.setAlbumVersion( "" );
		manifest.setCreateDate( new Date( ) );
		manifest.setDocCode( request.getDocCode( ) );
		manifest.setSoftVersion( request.getSoftVersion( ) );
		
		return manifest;
	}	

	public static ExtEadManifest map2Manifest_Reqinfo( 
			String envelopeId, String documentId,
			EadRequest request, Edarch_Reqinfo response )
	{
		ExtEadManifest manifest = new ExtEadManifest( );
		manifest.setRequestEnvelopeId( envelopeId );
		manifest.setRequestDocumentId( documentId );
		manifest.setRequestArchId( request.getArchId( ) );
		manifest.setRequestArchDocId( request.getArchDocId( ) );
		manifest.setRequestLineId( request.getLineId( ) );
		manifest.setRequestDate( Calendar.getInstance( ) );
		manifest.setDocCode( request.getDocCode( ) );
		manifest.setSoftVersion( request.getSoftVersion( ) );

		if ( null != response )
		{
			manifest.setStatus( ExtEadManifest.STATUS_RECEIVED );
			manifest.setResultCode( ResultCodes._00_00000_00 );
		}
		else
		{
			manifest.setStatus( ExtEadManifest.STATUS_FAILED );
			manifest.setResultCode( ResultCodes._03_00107_01 ); 
		}		
		
		return manifest;
	}	
	
	public static ExtEadManifest map2Manifest_Reqinfo(
			String envelopeId, String documentId,
			EadRequest request )
	{
		ExtEadManifest manifest = new ExtEadManifest( );
		manifest.setRequestEnvelopeId( envelopeId );
		manifest.setRequestDocumentId( documentId );
		manifest.setRequestArchId( request.getArchId( ) );
		manifest.setRequestArchDocId( request.getArchDocId( ) );
		manifest.setStatus( ExtEadManifest.STATUS_REQUESTED );
		manifest.setData( null );
		manifest.setRequestLineId( request.getLineId( ) );
		manifest.setRequestDate( Calendar.getInstance( ) );
		manifest.setAlbumVersion( "" );
		manifest.setCreateDate( new Date( ) );
		manifest.setDocCode( request.getDocCode( ) );
		manifest.setSoftVersion( request.getSoftVersion( ) );
		
		return manifest;
	}	
	
}
