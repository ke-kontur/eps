package ru.acs.fts.eps2.ws.eps.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.regex.Pattern;

import javax.naming.NamingException;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ru.acs.fts.eps2.ws.data.model.entities.Envelope;
import ru.acs.fts.eps2.ws.data.model.entities.ProcedureInformation;
import ru.acs.fts.eps2.ws.data.model.entities.ProcedureState;
import ru.acs.fts.eps2.ws.data.model.services.EnvelopeService;
import ru.acs.fts.eps2.ws.data.model.services.ProcedureService;
import ru.acs.fts.eps2.ws.eps.exceptions.ErrorCodes;
import ru.acs.fts.eps2.ws.eps.exceptions.GenericException;
import ru.acs.fts.eps2.ws.eps.serviceModel.objects.Procedure;
import ru.acs.fts.eps2.ws.eps.serviceModel.responses.ErrorResponse;
import ru.acs.fts.eps2.ws.eps.serviceModel.responses.ProcedureResponse;
import ru.acs.fts.eps2.ws.eps.serviceModel.responses.Response;

@Controller
@RequestMapping( "/procedures" )
public class ProcedureController 
{
	@Autowired
	@Qualifier( "envelopeService" )
	private EnvelopeService _envelopeService;
	
	@Autowired
	@Qualifier( "procedureService" )
	private ProcedureService _procedureService;

	@Autowired
	@Qualifier( "rtuCodes" )
	private String _rtuCodes;
	
	@RequestMapping( value = "/{id}/sequence", method = RequestMethod.GET )
	public @ResponseBody Response getProcedureSequence( @PathVariable( "id" ) String id )
	{
		try
		{
			List< ProcedureInformation > procInfos = _procedureService.findMatchById( id );
			if ( null == procInfos )
				throw new GenericException( ErrorCodes.ERROR_NOT_EXISTS, String.format( "Процедуры с id, подходящим  по шаблону %s, не существует!", id ) );
			else if ( procInfos.size( ) > 1 )
				throw new GenericException( ErrorCodes.ERROR_MULTIPLE_RESULTS, String.format( "По указанному шаблону %s найдено более одной процедуры", id ) );
			
			ProcedureInformation procInfo = procInfos.get( 0 );
			
			List< Envelope > envelopes = _envelopeService.findByProcedureId( procInfo.getProcessId( ) );
			if ( null == envelopes )
				throw new GenericException( ErrorCodes.ERROR_UNKNOWN, String.format( "При запросе конвертов для процедуры с id: %s произошла ошибка!", envelopes ) );
			
			envelopes = _envelopeService.findByInitialOrIncomeEnvelopes( envelopes, false );
			
			Procedure proc = mapProcedure( procInfo, envelopes );
			
			ProcedureResponse response = new ProcedureResponse( );
			response.setProcedure( proc );
			
			return response;
		}
		catch ( GenericException exc )
		{
			ErrorResponse response = new ErrorResponse( );
//			response.setStatus( "fail" );
			response.setStatus( exc.getCode( ) );
			response.setMessage( exc.getMessage( ) );
			
			return response;
		}
	}

	@RequestMapping( value = "/{id}/messageSequence", method = RequestMethod.GET )
	public @ResponseBody Response getProcedureSequenceByMessage( @PathVariable( "id" ) String id )
	{
		try
		{
			List< Envelope > envs = _envelopeService.findMatchById( id );
			if ( null == envs )
				throw new GenericException( ErrorCodes.ERROR_NOT_EXISTS, String.format( "Конверта с id: %s не существует!", id ) );
			else if ( envs.size( ) > 1 )
				throw new GenericException( ErrorCodes.ERROR_MULTIPLE_RESULTS, String.format( "Найдено более одного конверта по указанному шаблону '%s'", id ));
			
			Envelope env = envs.get( 0 );
			
			ProcedureInformation procInfo = _procedureService.findById( env.getProcessId( ) );
			List< Envelope > envelopes = null;
			if ( null == procInfo )
			{
				procInfo = new ProcedureInformation( );
				procInfo.setProcessId( "<no procedure>" );
				procInfo.setCustCode( Integer.parseInt( getWeAreOn( i2s( env.getSenderCustomsCode( ) ), i2s( env.getReceiverCustomsCode( ) ) ) ) );
				procInfo.setBorderCustCode( null );
				procInfo.setUdFlag( 0 );
				procInfo.setParticipantId( env.getParticipantId( ) );
				
				envelopes = new ArrayList< Envelope >( );
				envelopes.add( env );
				
				envelopes = _envelopeService.findByInitialOrIncomeEnvelopes( envelopes, false );
			}
			else
			{
				envelopes = _envelopeService.findByProcedureId( env.getProcessId( ) );
				if ( null == envelopes )
					throw new GenericException( String.format( "При запросе конвертов для процедуры с id: %s произошла ошибка!", env.getProcessId( ) ) );
				
				envelopes = _envelopeService.findByInitialOrIncomeEnvelopes( envelopes, false );
			}
			
			/*
			List< Envelope > ads = _envelopeService.findByInitialOrIncomeEnvelopes( envelopes );
			if ( null != ads && 0 != ads.size( ) )
			{
				envelopes.addAll( ads );
			}
			*/
			
			Procedure proc = mapProcedure( procInfo, envelopes );
			
			ProcedureResponse response = new ProcedureResponse( );
			response.setProcedure( proc );
			
			return response;
		}
		catch ( GenericException exc )
		{
			ErrorResponse response = new ErrorResponse( );
			response.setStatus( exc.getCode( ) );
			response.setMessage( exc.getMessage( ) );
			
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
	
	private Procedure mapProcedure( ProcedureInformation procInfo, List< Envelope > envelopes )
	{
		Procedure proc = new Procedure( );
		
		proc.setProcessId( procInfo.getProcessId( ) );
		proc.setCustCode( procInfo.getCustCode( ) );
		proc.setBorderCustCode( procInfo.getBorderCustCode( ) );
		proc.setUdFlag( procInfo.getUdFlag( ) );
		proc.setParticipantId( procInfo.getParticipantId( ) );

		try
		{
			List< String > patterns = Arrays.asList( 
				_rtuCodes.replace( "?", "\\d" )
				.replace( "*", "\\d*" )
				.split( "," ) );
			
			String cc = Integer.toString( procInfo.getCustCode( ) );
			String bcc = ( null != procInfo.getBorderCustCode( ) ) ? procInfo.getBorderCustCode( ).toString( ) : "";
			
			Pattern pattern;
			for ( String ptrn : patterns )
			{
				pattern = Pattern.compile( ptrn );
				if ( pattern.matcher( cc ).matches( ) )
				{
					proc.setWeAreOn( procInfo.getCustCode( ) );
					break;
				}
				else if ( pattern.matcher( bcc ).matches( ) )
				{
					proc.setWeAreOn( procInfo.getBorderCustCode( ) );
					break;
				}
			}
		}
		catch ( Exception exc )
		{
			proc.setWeAreOn( procInfo.getCustCode( ) );
		}
		
		List< ru.acs.fts.eps2.ws.eps.serviceModel.objects.Envelope > renvs = 
			new ArrayList< ru.acs.fts.eps2.ws.eps.serviceModel.objects.Envelope >( );
		proc.setEnvelopes( renvs );
		
		for ( Envelope envelope : envelopes )
		{
			ru.acs.fts.eps2.ws.eps.serviceModel.objects.Envelope renv =
				new ru.acs.fts.eps2.ws.eps.serviceModel.objects.Envelope( );
			renvs.add( renv );

			renv.setEnvelopeId( envelope.getEnvelopeId( ) );
			renv.setMessageType( envelope.getMessageType( ) );
			renv.setParticipantId( envelope.getParticipantId( ) );
			renv.setReceiverCustomsCode( ( null != envelope.getReceiverCustomsCode( ) ) ? envelope.getReceiverCustomsCode( ).toString( ) : null );
			renv.setReceiverCustomsExchType( ( null != envelope.getReceiverExchType( ) ) ? envelope.getReceiverExchType( ).toString( ) : null );
			renv.setSenderCustomsCode( ( null != envelope.getSenderCustomsCode( ) ) ? envelope.getSenderCustomsCode( ).toString( ) : null );
			renv.setSenderCustomsExchType( ( null != envelope.getSenderExchType( ) ) ? envelope.getSenderExchType( ).toString( ) : null );
			renv.setIncomeEnvelopeId( ( null != envelope.getIncomeEnvelopeId( ) ) ? envelope.getIncomeEnvelopeId( ) : null );
			renv.setInitialEnvelopeId( ( null != envelope.getInitialEnvelopeId( ) ) ? envelope.getInitialEnvelopeId( ) : null );
			
			ProcedureState pState = _procedureService.getState( envelope.getEnvelopeId( ), procInfo.getProcessId( ) );
			if ( null != pState )
				renv.setProcedureState( pState.getStateCode( ) );
			
			Calendar date = envelope.getReceiverDate( );
			if ( null == date )
				date = envelope.getSendDate( );
			if ( null == date )
				date = envelope.getPreparationDateTime( );
			
			renv.setEnvelopeTime( new DateTime( date ) );
		}
		
		return proc;
	}
	
	private String getWeAreOn( String senderCustomsCode, String receiverCustomsCode ) 
		throws NamingException
	{
		List< String > patterns = Arrays.asList( 
			_rtuCodes.replace( "?", "\\d" )
			.replace( "*", "\\d*" )
			.split( "," ) );
					
		Pattern pattern;
		for ( String ptrn : patterns )
		{
			pattern = Pattern.compile( ptrn );
			if ( null != senderCustomsCode && pattern.matcher( senderCustomsCode ).matches( ) )
			{
				return senderCustomsCode;
			}
			else if ( null != receiverCustomsCode && pattern.matcher( receiverCustomsCode ).matches( ) )
			{
				return receiverCustomsCode;
			}
		}

		return ( null != senderCustomsCode ) ? senderCustomsCode : ( null != receiverCustomsCode ) ? receiverCustomsCode : null;
	}
	
	private String i2s( Integer v )
	{
		if ( null != v )
			return v.toString( );
		
		return null;
	}
}
