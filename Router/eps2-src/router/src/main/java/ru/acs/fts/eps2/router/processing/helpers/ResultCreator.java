package ru.acs.fts.eps2.router.processing.helpers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.core.processing.WarningLevels;
import ru.acs.fts.eps2.engine.data.kind.DocumentModeIDs;
import ru.acs.fts.eps2.model.services.ErrListService;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.util.helpers.UUIDGen;
import ru.acs.fts.eps2.utils.StringUtil;
import ru.acs.fts.schemas.album.result.EADInfoType;
import ru.acs.fts.schemas.album.result.ResponseType;
import ru.acs.fts.schemas.album.result.ResultInformationType;
import ru.acs.fts.schemas.album.result.ResultType;

public class ResultCreator
{
	private String _refDocumentId = null;
	private String _resultCode;
	
	private String _eadArchId = null;
	private String _eadArchDocId = null;
	private String _eadArchDeclId = null;
	private String _eadArchDocStatus = null;
	
	private EDJobBatchContext _jobBatchContext;
	
	// @formatter:off
	public void setRefDocumentId( String refDocumentId ) { _refDocumentId = refDocumentId; }
	public String geRefDocumentId( ) { return _refDocumentId; }
	
	@Required
	public void setResultCode( String resultCode ) { _resultCode = resultCode; }
	public String getResultCode( ) { return _resultCode; }
	
	public void setEadArchId( String eadArchId ) { _eadArchId = eadArchId; }
	public String getEadArchId( ) { return _eadArchId; }
	
	public void setEadArchDocId( String eadArchDocId ) { _eadArchDocId = eadArchDocId; }
	public String getEadArchDocId( ) { return _eadArchDocId; }
	
	public void setEadArchDeclId( String eadArchDeclId ) { _eadArchDeclId = eadArchDeclId; }
	public String getEadArchDeclId( ) { return _eadArchDeclId; }
	
	public void setEadArchDocStatus( String eadArchDocStatus ) { _eadArchDocStatus = eadArchDocStatus; }
	public String getEadArchDocStatus( ) { return _eadArchDocStatus; }
	
	@Required
	public void setJobBatchContext( EDJobBatchContext jobBatchContext ) { _jobBatchContext = jobBatchContext; }
	public EDJobBatchContext getJobBatchContext( ) { return _jobBatchContext; }
	// @formatter:on
	
	public ResultType generate( ) 
		throws DatabaseException
	{
		ResultType res = new ResultType( );
		
		res.setDocumentID( UUIDGen.getUUID( ).toString( ) );
		res.setRefDocumentID( _refDocumentId );
		res.setDocumentModeID( DocumentModeIDs.RESULT );
		
		List< ResponseType > responses = new ArrayList< ResponseType >( );
		res.setResponseList( responses );
		
		ResponseType response = new ResponseType( );
		responses.add( response );
		
		response.setRefDocumentID( _refDocumentId );

		List< ResultInformationType > resultInfos = new ArrayList< ResultInformationType >( );
		response.setResultInformationList( resultInfos );
		
		ResultInformationType resultInfo = new ResultInformationType( );
		resultInfos.add( resultInfo );
		
		resultInfo.setResultCode( _resultCode );
		resultInfo.setResultCategory( _resultCode.equals( ResultCodes._00_00000_00 ) ? Integer.toString( WarningLevels.INFO ) : Integer.toString( WarningLevels.ERROR ) );
		
		ErrListService errListService = _jobBatchContext.getServiceHolder( ).getErrListService( );
		String resultDescr = errListService.getErrorMessage( _resultCode );		

		List< String > resDescs = new ArrayList< String >( );
		resDescs.add( resultDescr );
		resultInfo.setResultDescriptionList( resDescs );
		
		if ( ! StringUtil.isNullOrEmpty( _eadArchId ) ||
			 ! StringUtil.isNullOrEmpty( _eadArchDocId ) ||
			 ! StringUtil.isNullOrEmpty( _eadArchDeclId ) ||
			 ! StringUtil.isNullOrEmpty( _eadArchDocStatus ) )
		{
			List< EADInfoType > eadInfos = new ArrayList< EADInfoType >( );
			resultInfo.setEADInfoList( eadInfos );
			
			EADInfoType eadInfo = new EADInfoType( );
			eadInfos.add( eadInfo );
			
			eadInfo.setArchID( _eadArchId );			
			eadInfo.setArchDocID( _eadArchDocId );
			eadInfo.setArchDeclID( _eadArchDeclId );
			eadInfo.setArchDocStatus( _eadArchDocStatus );
		}
		
		return res;		
	}
}
