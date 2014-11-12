package ru.acs.fts.eps2.router.persistence.mappers;

import java.util.Calendar;
import java.util.GregorianCalendar;

import ru.acs.fts.eps2.engine.objects.defines.EnvelopeOrigins;
import ru.acs.fts.eps2.model.entities.Edecl_Messages;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.utils.StringUtil;
import ru.acs.fts.schemas.envelope.ApplicationInfType;
import ru.acs.fts.schemas.envelope.CustomsType;
import ru.acs.fts.schemas.envelope.EDHeaderType;
import ru.acs.fts.schemas.envelope.RoutingInfType;

public class EnvelopeToDbMapper
{
	
	public static Edecl_Messages mapEnvelope( EDEnvelope env )
	{
		Edecl_Messages dbMsg = new Edecl_Messages( );

		dbMsg.setIncomeEnvelopeId( env.getIncomeEnvelopeID( ) ); 
		dbMsg.setCompresstype( env.getCompressType( ).getCompressTypeText( ) );
		dbMsg.setCod( null );

		mapRoutingInfo( dbMsg, env.getRoutingInfo( ) );
		mapEdHeader( dbMsg, env.getEDHeader( ) );
		mapApplicationInfo( dbMsg, env.getApplicationInfo( ) );

		mapBody( dbMsg, env );

		if ( EnvelopeOrigins.INCOME == env.getOrigin( ) )
			dbMsg.setReceiveDate( new GregorianCalendar( ) );
		else
			dbMsg.setSendDate( new GregorianCalendar( ) );
		
		return dbMsg;
	}
	
	private static void mapRoutingInfo( Edecl_Messages dbMsg, RoutingInfType routingInfo )
	{
		if ( null == routingInfo || null == dbMsg )
			return ;
		
		dbMsg.setEnvelopeId( routingInfo.getEnvelopeID( ) );
		dbMsg.setInitialEnvelopeId( routingInfo.getInitialEnvelopeID( ) );
		dbMsg.setSenderInformation( routingInfo.getSenderInformation( ) );
		if ( null != routingInfo.getReceiverInformationList( ) && 0 != routingInfo.getReceiverInformationList( ).size( ) )
			dbMsg.setReceiverInformation( routingInfo.getReceiverInformationList( ).get( 0 ) );
		else
			dbMsg.setReceiverInformation( "<unknown>" );
		
		Calendar cal = routingInfo.getPreparationDateTime( ).toGregorianCalendar( );
		dbMsg.setPreparationDatetime( cal );
		
		if ( null != routingInfo.getPriority( ) )
			dbMsg.setPriority( routingInfo.getPriority( ).intValue( ) );
		
		dbMsg.setExpiration( routingInfo.getExpiration( ) );		
	}
	
	private static void mapEdHeader( Edecl_Messages dbMsg, EDHeaderType edHeader )
	{
		if ( null == edHeader || null == dbMsg )
			return ;
		
		dbMsg.setMessageType( edHeader.getMessageType( ) );
		dbMsg.setParticipantId( edHeader.getParticipantID( ) );
		dbMsg.setProcessId( edHeader.getProccessID( ) );

		CustomsType custom = edHeader.getSenderCustoms( );
		if ( custom != null )
		{
			dbMsg.setSenderCustomCode( Integer.parseInt( custom.getCustomsCode( ) ) );
			dbMsg.setSenderExchangeType( Integer.parseInt( custom.getExchType( ) ) );
		}

		custom = edHeader.getReceiverCustoms( );
		if ( custom != null )
		{
			dbMsg.setRcvCustomCode( Integer.parseInt( custom.getCustomsCode( ) ) );
			dbMsg.setRcvExchangeType( Integer.parseInt( custom.getExchType( ) ) );
		}
	}
	
	private static void mapApplicationInfo( Edecl_Messages dbMsg, ApplicationInfType applicationInfo )
	{
		if ( null == applicationInfo || null == dbMsg )
			return ;
		
		dbMsg.setSoftKind( applicationInfo.getSoftKind( ) );
		dbMsg.setMessageKind( applicationInfo.getMessageKind( ) ); 
		dbMsg.setSoftVersion( applicationInfo.getSoftVersion( ) );
	}
	
	private static void mapBody( Edecl_Messages dbMsg, EDEnvelope env )
	{
		String documentId = env.getDocument( ).getDocumentID( );
		if ( ! StringUtil.isNullOrEmpty( documentId ) )
			dbMsg.setDocumentId( documentId );
	}
}
