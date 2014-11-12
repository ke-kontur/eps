package ru.acs.fts.eps2.router.errors;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.kind.DocumentModeIDs;
import ru.acs.fts.eps2.engine.error.Errors;
import ru.acs.fts.eps2.engine.objects.Document;
import ru.acs.fts.eps2.engine.objects.Envelope;
import ru.acs.fts.eps2.engine.processing.JobBatchContext;
import ru.acs.fts.eps2.engine.restWs.crypto.responses.CheckSignResponse;
import ru.acs.fts.eps2.engine.restWs.shared.serviceModel.DocumentCheckResult;
import ru.acs.fts.eps2.engine.restWs.shared.serviceModel.ResultInformation;
import ru.acs.fts.eps2.engine.restWs.struct.responses.DocumentValidationResponse;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.utils.StringUtil;
import ru.acs.fts.schemas.album.result.ResponseType;
import ru.acs.fts.schemas.album.result.ResultInformationType;
import ru.acs.fts.schemas.album.result.ResultType;

public class EDErrors extends Errors
{
	@Override
	public void throwException( String message, String documentId, String resultCode, String errorType ) 
		throws BaseProcessingException, DatabaseException
	{
		ErrorHelper.throwException( message, documentId, resultCode, errorType );
	}

	@Override
	public void throwException( String message, String resultCode, Object document, String errorType ) 
		throws BaseProcessingException
	{
		throw new ResultTypeException( message, resultCode, ( ResultType )document, errorType );
	}
	
	@Override
	public BaseProcessingException convert( DatabaseException exc, JobBatchContext jobBatchContext ) 
	{
		try
		{
			return ErrorHelper.createException( ( EDJobBatchContext )jobBatchContext, ResultCodes._02_00000_06 );
		}
		catch ( DatabaseException exc2 )
		{
			throw new NullPointerException( exc2.getMessage( ) );
		}
	}
	
	@Override
	public BaseProcessingException convert( NullPointerException exc, JobBatchContext jobBatchContext )
	{
		try
		{
			return ErrorHelper.createException( ( EDJobBatchContext )jobBatchContext, ResultCodes._99_90002_01 );
		}
		catch ( DatabaseException exc2 )
		{
			return convert( exc2, jobBatchContext );
		}
	}

	@Override
	public void throwStructControlException( 
			DocumentValidationResponse response, Envelope env ) 
		throws BaseProcessingException, DatabaseException
	{
		DateTime now = new DateTime( );
		
		ResultType res = new ResultType( );
		res.setDocumentID( StringUtil.generateUuid( ) );
		res.setRefDocumentID( env.getDocument( ).getDocumentID( ) );
		res.setDocumentModeID( DocumentModeIDs.RESULT );
		
		List< ResponseType > responses = new ArrayList< ResponseType >( );
		res.setResponseList( responses );
		
		for ( DocumentCheckResult rs : response.getResults( ) )
		{
			ResponseType resp = new ResponseType( );
			responses.add( resp );
			
			resp.setCreateDate( now.toLocalDate( ) );
			resp.setCreateTime( now.toLocalTime( ).toString( ) );
			resp.setRefDocumentID( rs.getRefDocumentId( ) );
			
			List< ResultInformationType > rinfos = new ArrayList< ResultInformationType >( );
			resp.setResultInformationList( rinfos );
			
			for ( ResultInformation inf : rs.getInformation( ) )
			{
				ResultInformationType info = new ResultInformationType( );
				rinfos.add( info );
				
				info.setResultCategory( Integer.toString( inf.getCategory( ) ) );
				info.setResultCode( inf.getCode( ) );
				info.setResultDescriptionList( inf.getDescription( ) );
				info.setResultSource( Integer.toString( inf.getSource( ) ) );
			}
		}

		throw new ResultTypeException( 
			"Документ не соответствует схеме", 
			ResultCodes._01_00071_01, 
			res, 
			ProcessingConstants.ERROR_TYPE_CHECK 
		);
	}

	@Override
	public void throwCheckSignException( CheckSignResponse response, Envelope envelope ) 
		throws BaseProcessingException, DatabaseException
	{
		DateTime now = new DateTime( );
		
		ResultType res = new ResultType( );
		res.setDocumentID( StringUtil.generateUuid( ) );
		res.setRefDocumentID( envelope.getDocument( ).getDocumentID( ) );		
		res.setDocumentModeID( DocumentModeIDs.RESULT );
		
		List< ResponseType > responses = new ArrayList< ResponseType >( );
		res.setResponseList( responses );
		
		for ( DocumentCheckResult rs : response.getResults( ) )
		{
			ResponseType resp = new ResponseType( );
			responses.add( resp );
			
			resp.setCreateDate( now.toLocalDate( ) );
			resp.setCreateTime( now.toLocalTime( ).toString( ) );
			resp.setRefDocumentID( rs.getRefDocumentId( ) );
			
			List< ResultInformationType > rinfos = new ArrayList< ResultInformationType >( );
			resp.setResultInformationList( rinfos );
			
			for ( ResultInformation inf : rs.getInformation( ) )
			{
				ResultInformationType info = new ResultInformationType( );
				rinfos.add( info );
				
				info.setResultCategory( Integer.toString( inf.getCategory( ) ) );
				info.setResultCode( inf.getCode( ) );
				info.setResultDescriptionList( inf.getDescription( ) );
				info.setResultSource( Integer.toString( inf.getSource( ) ) );
			}
		}

		throw new ResultTypeException( 
			"Некорректная ЭЦП.", 
			ResultCodes._01_00051_01, 
			res, 
			ProcessingConstants.ERROR_TYPE_CHECK 
		);
	}
	
	@Override
	public void throwCheckSignException( Document document, String message, String resultCode ) 
		throws BaseProcessingException, DatabaseException
	{
		throwException( message, document.getDocumentID( ), resultCode, ProcessingConstants.ERROR_TYPE_CHECK );
	}
	
	@Override
	public void throwStructControlException( Document document, String message, String resultCode ) 
		throws BaseProcessingException, DatabaseException
	{
		throwException( message, document.getDocumentID( ), resultCode, ProcessingConstants.ERROR_TYPE_CHECK );
	}

	@Override
	public void throwGenericRestException( 
			Exception exc, Envelope env, 
			String message, String resultCode ) 
		throws BaseProcessingException, DatabaseException
	{
		if ( exc instanceof BaseProcessingException )
			throw ( BaseProcessingException )exc;
		else if ( exc instanceof DatabaseException )
			throw ( DatabaseException )exc;
		
		DateTime now = new DateTime( );
		
		ResultType res = new ResultType( );
		res.setDocumentID( StringUtil.generateUuid( ) );
		res.setRefDocumentID( env.getDocument( ).getDocumentID( ) );
		res.setDocumentModeID( DocumentModeIDs.RESULT );
		
		List< ResponseType > responses = new ArrayList< ResponseType >( );
		res.setResponseList( responses );
		
		ResponseType resp = new ResponseType( );
		responses.add( resp );
			
		resp.setCreateDate( now.toLocalDate( ) );
		resp.setCreateTime( now.toLocalTime( ).toString( ) );
		resp.setRefDocumentID( env.getDocument( ).getDocumentID( ) );
			
		List< ResultInformationType > rinfos = new ArrayList< ResultInformationType >( );
		resp.setResultInformationList( rinfos );
			
		ResultInformationType info = new ResultInformationType( );
		rinfos.add( info );
				
		info.setResultCategory( Integer.toString( 1 ) );
		info.setResultCode( resultCode );
		
		List< String > rlist = new ArrayList< String >( );
		rlist.add( message );
		info.setResultDescriptionList( rlist );
		
		info.setResultSource( Integer.toString( 0 ) );

		throw new ResultTypeException( 
			message, 
			resultCode, 
			res, 
			ProcessingConstants.ERROR_TYPE_CHECK 
		);
	}

}
