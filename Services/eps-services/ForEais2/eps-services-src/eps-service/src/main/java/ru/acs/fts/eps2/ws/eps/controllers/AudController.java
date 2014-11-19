package ru.acs.fts.eps2.ws.eps.controllers;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ru.acs.fts.eps2.ws.data.model.services.AudService;
import ru.acs.fts.eps2.ws.eps.exceptions.ErrorCodes;
import ru.acs.fts.eps2.ws.eps.exceptions.GenericException;
import ru.acs.fts.eps2.ws.eps.serviceModel.responses.AudCommandResponse;
import ru.acs.fts.eps2.ws.eps.serviceModel.responses.AudIntCommandResponse;
import ru.acs.fts.eps2.ws.eps.serviceModel.responses.AudProcInfosResponse;
import ru.acs.fts.eps2.ws.eps.serviceModel.responses.ErrorResponse;
import ru.acs.fts.eps2.ws.eps.serviceModel.responses.Response;
import ru.acs.fts.eps2.ws.utils.helpers.Base64Coder;

@Controller
@RequestMapping( "/aud" )
public class AudController
{
	private static final String CREATION_DATE = "CREATION";
	private static final String CHANGE_DATE = "CHANGE";
	
	@Autowired
	@Qualifier( "audService" )
	private AudService _audService;

	@RequestMapping( value = "/all", method = RequestMethod.GET )
	public @ResponseBody Response getAudInfoAll( 
			@RequestParam( value = "offset", required = true ) int offset,
			@RequestParam( value = "limit", required = true ) int limit )
	{
		try
		{
			List< ru.acs.fts.eps2.ws.data.model.entities.AudProcInfo > procInfos =
				_audService.findAllProcInfos( offset, limit );
			
			AudProcInfosResponse response = makeAudProcInfoResponse( procInfos );
			response.setTotalRecords( _audService.countAllProcInfos( ) );
			
			return response;
		}
		catch ( Exception exc )
		{
			ErrorResponse response = new ErrorResponse( );
			response.setStatus( "fail" );
			response.setMessage( exc.getMessage( ) );
			
			return response;
		}		
	}
	
	@RequestMapping( value = "/failed", method = RequestMethod.GET )
	public @ResponseBody Response getAudInfoFailed(
			@RequestParam( value = "offset", required = true ) int offset,
			@RequestParam( value = "limit", required = true ) int limit )
	{
		try 
		{
			List< ru.acs.fts.eps2.ws.data.model.entities.AudProcInfo > procInfos =
				_audService.findFailedProcInfos( offset, limit );
			
			AudProcInfosResponse response = makeAudProcInfoResponse( procInfos );
			response.setTotalRecords( _audService.countFailedProcInfos( ) );
			// response.setTotalRecords( 0 );
			
			return response;
		}
		catch ( Exception exc )
		{
			ErrorResponse response = new ErrorResponse( );
			response.setStatus( "fail" );
			response.setMessage( exc.getMessage( ) );
			
			return response;
		}
	}
	
	@RequestMapping( value = "/{id}", method = RequestMethod.GET )
	public @ResponseBody Response getAudInfoId( @PathVariable( "id" ) String id )
	{
		try
		{
			List< ru.acs.fts.eps2.ws.data.model.entities.AudProcInfo > procInfos =
				_audService.findProcInfo( id );
			
			return makeAudProcInfoResponse( procInfos );
		}
		catch ( Exception exc )
		{
			ErrorResponse response = new ErrorResponse( );
			response.setStatus( "fail" );
			response.setMessage( exc.getMessage( ) );
			
			return response;
		}
	}
	
	@RequestMapping( value = "/byDateRange", method = RequestMethod.GET )
	public @ResponseBody Response getAudInfByDateRange( 
			@RequestParam( value = "offset", required = true ) int offset,
			@RequestParam( value = "limit", required = true ) int limit,
			@RequestParam( value = "dateType", required = true ) String dateType,
			@RequestParam( value = "start", required = true ) String start,
			@RequestParam( value = "end", required = true ) String end )
	{
		try
		{
			List< ru.acs.fts.eps2.ws.data.model.entities.AudProcInfo > procInfos = null;
				
			DateTime startDate = new DateTime( start );
			DateTime endDate = new DateTime( end );
			
			if ( CREATION_DATE.equalsIgnoreCase( dateType ) )
				procInfos = _audService.getProcInfosByCreateDate( offset, limit, startDate, endDate );
			else if ( CHANGE_DATE.equalsIgnoreCase( dateType ) )
				procInfos = _audService.getProcInfosByChangeDate( offset, limit, startDate, endDate );
			else 
				throw new GenericException( ErrorCodes.ERROR_WRONG_PARAM, String.format( "Неожиданный параметр dateType : %s", dateType ) );
			
			if ( null == procInfos )
				procInfos = new ArrayList< ru.acs.fts.eps2.ws.data.model.entities.AudProcInfo >( );
			
			AudProcInfosResponse response = makeAudProcInfoResponse( procInfos ); 
			if ( CREATION_DATE.equalsIgnoreCase( dateType ) )
				response.setTotalRecords( _audService.countDateRangedProcInfosByCreateDate( startDate, endDate ) );
			else if ( CHANGE_DATE.equalsIgnoreCase( dateType ) )
				response.setTotalRecords( _audService.countDateRangedProcInfosByChangeDate( startDate, endDate ) );
			return response;
		}
		catch ( GenericException exc )
		{
			ErrorResponse response = new ErrorResponse( );
			response.setStatus( exc.getCode( ) );
			response.setMessage( exc.getMessage( ) );
			
			return response;
		}
	}
	
	@RequestMapping( value = "/intcmd/{id}/resend", method = RequestMethod.GET )
	public @ResponseBody Response intCmdResend( @PathVariable( "id" ) int recId )
	{
		try
		{
			ru.acs.fts.eps2.ws.data.model.entities.AudIntCommand dbIntCmd =
				_audService.getIntCommand( recId );
			
			if ( null == dbIntCmd )
				throw new Exception( String.format( "No int-command for id: %d", recId ) );
			
			dbIntCmd.setState( "Waitable" );
			_audService.merge( dbIntCmd );
			
			AudIntCommandResponse response = new AudIntCommandResponse( );
			
			ru.acs.fts.eps2.ws.eps.serviceModel.objects.AudIntCommand smIntCmd =
				new ru.acs.fts.eps2.ws.eps.serviceModel.objects.AudIntCommand( );
			
			db2sm( dbIntCmd, smIntCmd );
			response.setIntCommand( smIntCmd );
			
			return response;
		}
		catch ( Exception exc )
		{
			ErrorResponse response = new ErrorResponse( );
			response.setStatus( "fail" );
			response.setMessage( exc.getMessage( ) );
			
			return response;
		}
	}
	
	@RequestMapping( value = "/cmd/{id}/resend", method = RequestMethod.GET )
	public @ResponseBody Response cmdResend( @PathVariable( "id" ) int recId )
	{
		try
		{
			ru.acs.fts.eps2.ws.data.model.entities.AudCommand dbCmd =
				_audService.getCommand( recId );
			
			if ( null == dbCmd )
				throw new Exception( String.format( "No command for id: %d", recId ) );
			
			dbCmd.setState( "Waitable" );
			_audService.merge( dbCmd );
			
			AudCommandResponse response = new AudCommandResponse( );
			
			ru.acs.fts.eps2.ws.eps.serviceModel.objects.AudCommand smCmd =
				new ru.acs.fts.eps2.ws.eps.serviceModel.objects.AudCommand( );
			
			db2sm( dbCmd, smCmd );
			response.setCommand( smCmd );
			
			return response;
		}
		catch ( Exception exc )
		{
			ErrorResponse response = new ErrorResponse( );
			response.setStatus( "fail" );
			response.setMessage( exc.getMessage( ) );
			
			return response;
		}
	}
	
	private AudProcInfosResponse makeAudProcInfoResponse( List< ru.acs.fts.eps2.ws.data.model.entities.AudProcInfo > procInfos )
	{
		AudProcInfosResponse response = new AudProcInfosResponse( );
		
		List< ru.acs.fts.eps2.ws.eps.serviceModel.objects.AudProcInfo > rProcInfos =
			new ArrayList< ru.acs.fts.eps2.ws.eps.serviceModel.objects.AudProcInfo >( );
		response.setProcInfos( rProcInfos );
		
		for ( ru.acs.fts.eps2.ws.data.model.entities.AudProcInfo pInfo : procInfos )
		{
			ru.acs.fts.eps2.ws.eps.serviceModel.objects.AudProcInfo rProcInfo = 
				new ru.acs.fts.eps2.ws.eps.serviceModel.objects.AudProcInfo( );
			rProcInfos.add( rProcInfo );
			
			rProcInfo.setProcessId( pInfo.getProcessId( ) );
			rProcInfo.setGtdCustomsCode( pInfo.getGtdCustomsCode( ) );
			rProcInfo.setGtdRegistrationDate( java2joda( pInfo.getGtdRegistrationDate( ) ) );
			rProcInfo.setGtdNumber( pInfo.getGtdNumber( ) );
			rProcInfo.setPacketId( pInfo.getPacketId( ) );
			rProcInfo.setPkCreateDateTime( java2joda( pInfo.getPkCreateDateTime( ) ) );
			rProcInfo.setPkChangeDateTime( java2joda( pInfo.getPkChangeDateTime( ) ) );
			
			List< ru.acs.fts.eps2.ws.eps.serviceModel.objects.AudIntCommand > rIntCommands
				= new ArrayList< ru.acs.fts.eps2.ws.eps.serviceModel.objects.AudIntCommand >( );
			rProcInfo.setAudIntCommands( rIntCommands );
			
			List< ru.acs.fts.eps2.ws.data.model.entities.AudIntCommand > intCommands = pInfo.getAudIntCommands( );
			if ( null == intCommands || 0 == intCommands.size( ) )
				continue;
			
			for ( ru.acs.fts.eps2.ws.data.model.entities.AudIntCommand intCmd : intCommands )
			{
				ru.acs.fts.eps2.ws.eps.serviceModel.objects.AudIntCommand rIntCmd = 
					new ru.acs.fts.eps2.ws.eps.serviceModel.objects.AudIntCommand( );
				rIntCommands.add( rIntCmd );
						
				db2sm( intCmd, rIntCmd );
				
				List< ru.acs.fts.eps2.ws.eps.serviceModel.objects.AudCommand > rCmds =
					new ArrayList< ru.acs.fts.eps2.ws.eps.serviceModel.objects.AudCommand >( );
				rIntCmd.setAudCommands( rCmds );
				
				List< ru.acs.fts.eps2.ws.data.model.entities.AudCommand > cmds = intCmd.getAudCommands( );
				if ( null == cmds || 0 == cmds.size( ) )
					continue;
				
				for ( ru.acs.fts.eps2.ws.data.model.entities.AudCommand cmd : cmds )
				{
					ru.acs.fts.eps2.ws.eps.serviceModel.objects.AudCommand rCmd =
						new ru.acs.fts.eps2.ws.eps.serviceModel.objects.AudCommand( );
					rCmds.add( rCmd );
					
					db2sm( cmd, rCmd );
					
					List< ru.acs.fts.eps2.ws.eps.serviceModel.objects.AudDocInfo > rDocInfos =
						new ArrayList< ru.acs.fts.eps2.ws.eps.serviceModel.objects.AudDocInfo >( );
					rCmd.setDocInfos( rDocInfos );
					
					List< ru.acs.fts.eps2.ws.data.model.entities.AudDocInfo > docInfos = _audService.getDocInfos( cmd.getGuid( ) ); 
					if ( null == docInfos || 0 == docInfos.size( ) )
						continue;
					
					for ( ru.acs.fts.eps2.ws.data.model.entities.AudDocInfo docInfo : docInfos )
					{
						ru.acs.fts.eps2.ws.eps.serviceModel.objects.AudDocInfo rDocInfo =
							new ru.acs.fts.eps2.ws.eps.serviceModel.objects.AudDocInfo( );
						rDocInfos.add( rDocInfo );
						
						rDocInfo.setDocumentId( docInfo.getDocumentId( ) );
						rDocInfo.setRefMainDoc( docInfo.getRefMainDoc( ) );
						rDocInfo.setRefDocumentId( docInfo.getRefDocumentId( ) );
						rDocInfo.setDocumentModeId( docInfo.getDocumentModeId( ) );
						rDocInfo.setArchDocId( docInfo.getArchDocId( ) );
						rDocInfo.setPutDateTime( java2joda( docInfo.getPutDateTime( ) ) );
						rDocInfo.setState( docInfo.getState( ) );
						rDocInfo.setEadDocumentId( docInfo.getEadDocumentId( ) );
						rDocInfo.setEadArchiveId( docInfo.getEadArchiveId( ) );
						rDocInfo.setDescription( docInfo.getDescription( ) );
						rDocInfo.setAudExtPacketId( docInfo.getAudExtPacketId( ) );
						rDocInfo.setAudExtDocId( docInfo.getAudExtDocId( ) );
						rDocInfo.setNeedPrevVersion( docInfo.getNeedPrevVersion( ) );
						rDocInfo.setPrevVersion( docInfo.getPrevVersion( ) );
						rDocInfo.setVersion( docInfo.getVersion( ) );
						rDocInfo.setErrorCode( docInfo.getErrorCode( ) );
						rDocInfo.setErrorDescription( docInfo.getErrorDescription( ) );
					}
				}
			}
		}
		
		return response;
	}
	
	private void db2sm( 
		ru.acs.fts.eps2.ws.data.model.entities.AudIntCommand dbIntCmd,
		ru.acs.fts.eps2.ws.eps.serviceModel.objects.AudIntCommand smIntCmd )
	{
		smIntCmd.setRecId( dbIntCmd.getRecId( ) );
		smIntCmd.setDocumentId( dbIntCmd.getDocumentId( ) );
		smIntCmd.setMessageCode( dbIntCmd.getMsgCode( ) );
		smIntCmd.setDateTime( java2joda( dbIntCmd.getDateTime( ) ) );
		smIntCmd.setState( dbIntCmd.getState( ) );
		smIntCmd.setInternalError( toBase64( dbIntCmd.getIntError( ) ) );
		smIntCmd.setEnvelopeId( dbIntCmd.getEnvelopeId( ) );
		smIntCmd.setRegId( dbIntCmd.getRegId( ) );		
	}
	
	private void db2sm(
		ru.acs.fts.eps2.ws.data.model.entities.AudCommand dbCmd,
		ru.acs.fts.eps2.ws.eps.serviceModel.objects.AudCommand smCmd )
	{
		smCmd.setRecId( dbCmd.getRecId( ) );
		smCmd.setDateTime( java2joda( dbCmd.getDateTime( ) ) );
		smCmd.setState( dbCmd.getState( ) );
		smCmd.setErrorCode( dbCmd.getErrCode( ) );
		smCmd.setErrorDescription( dbCmd.getErrDescription( ) );
		smCmd.setOutEnvelope( mapEnvelope( dbCmd.getOutEnvelope( ) ) );
		smCmd.setInEnvelope( mapEnvelope( dbCmd.getInEnveope( ) ) );
		smCmd.setEadFlag( dbCmd.getEadFlag( ) );
		smCmd.setInternalError( toBase64( dbCmd.getIntError( ) ) );
		smCmd.setGuid( dbCmd.getGuid( ) );
		smCmd.setEnvelopeId( dbCmd.getEnvelopeId( ) );		
	}
	
	private DateTime java2joda( Date date )
	{
		if ( null == date )
			return null;
		
		return new DateTime( date );
	}
	
	private DateTime java2joda( Calendar calendar )
	{
		if ( null == calendar )
			return null;
		
		return new DateTime( calendar );
	}
	
	private String toBase64( byte[ ] bytes )
	{
		if ( null == bytes )
			return null;

		try
		{
			return Base64Coder.encodeAsString( bytes, "UTF-8" );
		}
		catch ( Exception exc )
		{
			return "<base64>";
		}
	}
	
	private ru.acs.fts.eps2.ws.eps.serviceModel.objects.AudMessage mapEnvelope( ru.acs.fts.eps2.ws.data.model.entities.AudMessage msg )
	{
		if ( null == msg )
			return null;
		
		ru.acs.fts.eps2.ws.eps.serviceModel.objects.AudMessage rMsg =
			new ru.acs.fts.eps2.ws.eps.serviceModel.objects.AudMessage( );

		rMsg.setEnvelopeId( msg.getEnvelopeId( ) );
		rMsg.setIncomeEnvelopeId( msg.getIncomeEnvelopeId( ) );
		rMsg.setInitialEnvelopeId( msg.getInitialEnvelopeId( ) );
		rMsg.setSenderInformation( msg.getSenderInformation( ) );
		rMsg.setReceiverInformation( msg.getReceiverInformation( ) );
		rMsg.setSoftKind( msg.getSoftKind( ) );
		rMsg.setSoftVersion( msg.getSoftVersion( ) );
		rMsg.setMessageKind( msg.getMessageKind( ) );
		rMsg.setDocumentId( msg.getDocumentId( ) );
		rMsg.setCustomsCode( msg.getCustomsCode( ) );
		rMsg.setPreparationDateTime( java2joda( msg.getPreparationDateTime( ) ) );
		rMsg.setReceiveDate( java2joda( msg.getReceiveDate( ) ) );
		rMsg.setSendDate( java2joda( msg.getSendDate( ) ) );
		rMsg.setArchiveClientId( msg.getArchiveClientId( ) );
		rMsg.setCoaDateTime( java2joda( msg.getCoaDateTime( ) ) );
		rMsg.setCoaSaveDateTime( java2joda( msg.getCoaSaveDateTime( ) ) );
		rMsg.setCodSaveDateTime( java2joda( msg.getCodSaveDateTime( ) ) );
		rMsg.setCodDateTime( java2joda( msg.getCodDateTime( ) ) );
		rMsg.setBody( toBase64( msg.getBody( ) ) );
		
		return rMsg;
	}
}
