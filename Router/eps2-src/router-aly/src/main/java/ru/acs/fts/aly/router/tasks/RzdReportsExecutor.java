package ru.acs.fts.aly.router.tasks;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.persistence.queries.CursoredStream;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ru.acs.fts.aly.model.entities.AlyRzdReports;
import ru.acs.fts.aly.model.entities.AlyRzdReportsMaking;
import ru.acs.fts.aly.model.services.RzdReportsService;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.model.entities.Edecl_Messages;
import ru.acs.fts.eps2.model.services.EnvelopeService;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.utils.StringUtil;

public class RzdReportsExecutor
{
	private static final String RZD_PARTICIPANT_ID = "102773904696524";
	//private static final String RZD_PARTICIPANT_ID = "1027739046502";
	private static final String RZD_TO_ADDRESS = "wmq://RU.FTS.ASVD.COMM/RZD.TO";
	
	private RzdReportsService _rzdReportsService;
	private EnvelopeService _envelopeService;
	
	// @formatter:off
	@Required public void setRzdReportsService( RzdReportsService rzdReportsService ) { _rzdReportsService = rzdReportsService; }
	public RzdReportsService getRzdReportsService( ) { return _rzdReportsService; }
	
	@Required public void setEnvelopeService( EnvelopeService envelopeService ) { _envelopeService = envelopeService; }
	public EnvelopeService getEnvelopeService( ) { return _envelopeService; }
	// @formatter:on
	
	@Transactional( propagation = Propagation.REQUIRED, timeout = 3000000 ) // timeout = 300
	public List< AlyRzdReportsMaking > getRequestedReportsMaking( )
		throws DatabaseException
	{
		return _rzdReportsService.getRequestedMakings( );
	}
	
	@Transactional( propagation = Propagation.REQUIRED, timeout = 3000000 ) // timeout = 300
	public void beginMakingProcessing( AlyRzdReportsMaking making )
		throws DatabaseException
	{
		making.setIsBeingMade( ( short )2 );
		_rzdReportsService.merge( making );
	}
	
	@Transactional( propagation = Propagation.REQUIRED, timeout = 3000000 ) // timeout = 300
	public void completeMakingProcessing( AlyRzdReportsMaking making )
		throws DatabaseException
	{
		making.setIsMade( ( short )1 );
		making.setIsBeingMade( ( short )0 );
		_rzdReportsService.merge( making );
	}
	
	@Transactional( propagation = Propagation.REQUIRED, timeout = 3000000 ) // timeout = 300
	public void persistReport( Map< Integer, AlyRzdReports > days )
		throws DatabaseException
	{
		_rzdReportsService.persists( days.values( ) );
	}
	
	// @Transactional( propagation = Propagation.REQUIRED, timeout = 3000000 ) // timeout = 300
	public Map< Integer, AlyRzdReports > makeReport( AlyRzdReportsMaking making )
		throws DatabaseException
	{
		DateTime from = new DateTime( making.getDstamp( ).longValue( ) * 1000L );		
		DateTime to = from.plusMonths( 1 );
		
		Map< Integer, AlyRzdReports > days = new HashMap< Integer, AlyRzdReports >( );

		Set< String > t1Processes = new HashSet< String >( );
		Set< String > t2Processes = new HashSet< String >( );
		Set< String > t3Processes = new HashSet< String >( );

		Map< String, Boolean > result = new HashMap< String, Boolean >( );
		
		Set< String > messageTypes = new HashSet< String >( );
		messageTypes.add( MessageType.ED_11002 );
		messageTypes.add( MessageType.CMN_12092 );
		messageTypes.add( MessageType.CMN_12002 );
		messageTypes.add( MessageType.CMN_12003 );
		messageTypes.add( MessageType.CMN_12093 );
		messageTypes.add( MessageType.CMN_12094 );
		messageTypes.add( MessageType.CMN_12118 );
		messageTypes.add( MessageType.CMN_12095 );
		messageTypes.add( MessageType.CMN_12101 );
		messageTypes.add( MessageType.CMN_12096 );
		messageTypes.add( MessageType.CMN_12097 );
		messageTypes.add( MessageType.CMN_12079 );
		messageTypes.add( MessageType.CMN_12081 );
		messageTypes.add( MessageType.CMN_12084 );
		messageTypes.add( MessageType.CMN_12080 );
		messageTypes.add( MessageType.CMN_12085 );
		messageTypes.add( MessageType.CMN_12086 );
		messageTypes.add( MessageType.CMN_00001 );
		messageTypes.add( MessageType.CMN_00004 );
		
		List< Msg > msgs = new ArrayList< Msg >( );
		
		CursoredStream cursor = _envelopeService.getEnvelopesForRzdReport( RZD_PARTICIPANT_ID, from.toGregorianCalendar( ), to.toGregorianCalendar( ), messageTypes );
		
		messageTypes.remove( MessageType.CMN_00001 );
		messageTypes.remove( MessageType.CMN_00004 );
		
		final int PAGE_SIZE = 100;
		
		while( ! cursor.atEnd( ) )
		{
			@SuppressWarnings( "unchecked" )
			List< Edecl_Messages > xmsgs = ( List< Edecl_Messages > )cursor.nextElements( PAGE_SIZE );

			for ( Edecl_Messages msg : xmsgs )
			{
				if ( ! StringUtil.isNullOrEmpty( msg.getProcessId( ) ) )
				{
					if ( msg.getMessageType( ).equals( MessageType.CMN_12092 ) )
						t1Processes.add( msg.getProcessId( ) );
					else if ( msg.getMessageType( ).equals( MessageType.CMN_12095 ) )
						t2Processes.add( msg.getProcessId( ) );
					else if ( msg.getMessageType( ).equals( MessageType.CMN_12079 ) )
						t3Processes.add( msg.getProcessId( ) );
				}
				
				if ( ! StringUtil.isNullOrEmpty( msg.getInitialEnvelopeId( ) ) )
				{
					if ( msg.getMessageType( ).equals( MessageType.CMN_00001 ) )
						result.put( msg.getInitialEnvelopeId( ), false );
					else if ( msg.getMessageType( ).equals( MessageType.CMN_00004 ) )
						result.put( msg.getInitialEnvelopeId( ), true );
				}
				
				if ( messageTypes.contains( msg.getMessageType( ) ) )
				{
					Msg xmsg = new Msg( );
					xmsg.messageType = msg.getMessageType( );
					xmsg.receiverInformation = msg.getReceiverInformation( );
					xmsg.senderInformation = msg.getSenderInformation( );
					xmsg.processId = msg.getProcessId( );
					xmsg.envelopeId = msg.getEnvelopeId( );
					xmsg.preparationDateTime = msg.getPreparationDatetime( );

					msgs.add( xmsg );
				}
			}
		}
		
		cursor.close( );
				
		for ( Msg msg : msgs )
		{
			int day = msg.preparationDateTime.get( Calendar.DAY_OF_MONTH );
			AlyRzdReports rep = days.get( day );
			if ( null == rep )
			{
				Calendar dstamp = new GregorianCalendar( 
					msg.preparationDateTime.get( Calendar.YEAR ), 
					msg.preparationDateTime.get( Calendar.MONTH ),
					msg.preparationDateTime.get( Calendar.DAY_OF_MONTH )
				);
				
				rep = new AlyRzdReports( );
				rep.setDstamp( ( int )( dstamp.getTimeInMillis( ) / 1000L ) );
				
				days.put( day, rep );
			}
			
			if ( msg.messageType.equals( MessageType.ED_11002 ) && msg.receiverInformation.equals( RZD_TO_ADDRESS ) )
			{
				if ( t1Processes.contains( msg.processId ) )
				{
					rep.setT1Ed11002Sent( rep.getT1Ed11002Sent( ) + 1 );
					continue;
				}
				else if ( t2Processes.contains( msg.processId ) )
				{
					rep.setT2Ed11002Sent( rep.getT2Ed11002Sent( ) + 1 );
					continue;
				}
				else if ( t3Processes.contains( msg.processId ) )
				{
					rep.setT3Ed11002Sent( rep.getT3Ed11002Sent( ) + 1 );
					continue;
				}
			}
			else if ( msg.messageType.equals( MessageType.CMN_12092 ) && msg.senderInformation.equals( RZD_TO_ADDRESS ) && result.containsKey( msg.envelopeId ) )
			{
				boolean res = result.get( msg.envelopeId );
				if ( res )
				{
					rep.setT1Cmn12092Success( rep.getT1Cmn12092Success( ) + 1 );
					continue;
				}
				else
				{
					rep.setT1Cmn12092Fail( rep.getT1Cmn12092Fail( ) + 1 );
					continue;
				}
			}
			else if ( msg.messageType.equals( MessageType.CMN_12002 ) && result.containsKey( msg.envelopeId ) )
			{
				boolean res = result.get( msg.envelopeId );
				if ( t1Processes.contains( msg.processId ) )
				{
					if ( res )
					{
						if ( msg.receiverInformation.equals( RZD_TO_ADDRESS ) )
							rep.setT1Cmn12002Sent( rep.getT1Cmn12002Sent( ) + 1 );
						else
							rep.setT1Cmn12002Success( rep.getT1Cmn12002Success( ) + 1 );
						
						continue;
					}
					else
					{
						if ( ! msg.receiverInformation.equals( RZD_TO_ADDRESS ) )
							rep.setT1Cmn12002Fail( rep.getT1Cmn12002Fail( ) + 1 );
						continue;
					}
				}
				else if ( t2Processes.contains( msg.processId ) )
				{
					if ( res )
					{
						if ( msg.receiverInformation.equals( RZD_TO_ADDRESS ) )
							rep.setT2Cmn12002Sent( rep.getT2Cmn12002Sent( ) + 1 );
						else
							rep.setT2Cmn12002Success( rep.getT2Cmn12002Success( ) + 1 );
						
						continue;
					}
					else
					{
						if ( ! msg.receiverInformation.equals( RZD_TO_ADDRESS ) )
							rep.setT2Cmn12002Fail( rep.getT2Cmn12002Fail( ) + 1 );
						continue;
					}
				}
				else if ( t3Processes.contains( msg.processId ) )
				{
					if ( res )
					{
						if ( msg.receiverInformation.equals( RZD_TO_ADDRESS ) )
							rep.setT3Cmn12002Sent( rep.getT3Cmn12002Sent( ) + 1 );
						else
							rep.setT3Cmn12002Success( rep.getT3Cmn12002Success( ) + 1 );
						
						continue;
					}
					else
					{
						if ( ! msg.receiverInformation.equals( RZD_TO_ADDRESS ) )
							rep.setT3Cmn12002Fail( rep.getT3Cmn12002Fail( ) + 1 );
						continue;
					}
				}
			}
			else if ( msg.messageType.equals( MessageType.CMN_12003 ) && result.containsKey( msg.envelopeId ) )
			{
				boolean res = result.get( msg.envelopeId );
				if ( t1Processes.contains( msg.processId ) )
				{
					if ( res )
					{
						if ( msg.receiverInformation.equals( RZD_TO_ADDRESS ) )
							rep.setT1Cmn12003Sent( rep.getT1Cmn12003Sent( ) + 1 );
						else
							rep.setT1Cmn12003Success( rep.getT1Cmn12003Success( ) + 1 );
						
						continue;
					}
					else
					{
						if ( ! msg.receiverInformation.equals( RZD_TO_ADDRESS ) )
							rep.setT1Cmn12003Fail( rep.getT1Cmn12003Fail( ) + 1 );
						continue;
					}
				}
				else if ( t2Processes.contains( msg.processId ) )
				{
					if ( res )
					{
						if ( msg.receiverInformation.equals( RZD_TO_ADDRESS ) )
							rep.setT2Cmn12003Sent( rep.getT2Cmn12003Sent( ) + 1 );
						else
							rep.setT2Cmn12003Success( rep.getT2Cmn12003Success( ) + 1 );
						
						continue;
					}
					else
					{
						if ( ! msg.receiverInformation.equals( RZD_TO_ADDRESS ) )
							rep.setT2Cmn12003Fail( rep.getT2Cmn12003Fail( ) + 1 );
						continue;
					}
				}
				else if ( t3Processes.contains( msg.processId ) )
				{
					if ( res )
					{
						if ( msg.receiverInformation.equals( RZD_TO_ADDRESS ) )
							rep.setT3Cmn12003Sent( rep.getT3Cmn12003Sent( ) + 1 );
						else
							rep.setT3Cmn12003Success( rep.getT3Cmn12003Success( ) + 1 );
						
						continue;
					}
					else
					{
						if ( ! msg.receiverInformation.equals( RZD_TO_ADDRESS ) )
							rep.setT3Cmn12003Fail( rep.getT3Cmn12003Fail( ) + 1 );
						continue;
					}
				}
			}
			else if ( msg.messageType.equals( MessageType.CMN_12093 ) && result.containsKey( msg.envelopeId ) )
			{
				boolean res = result.get( msg.envelopeId );
				if ( res )
				{
					if ( msg.receiverInformation.equals( RZD_TO_ADDRESS ) )
						rep.setT1Cmn12093Sent( rep.getT1Cmn12093Sent( ) + 1 );
					else
						rep.setT1Cmn12093Success( rep.getT1Cmn12093Success( ) + 1 );
					
					continue;
				}
				else
				{
					if ( ! msg.receiverInformation.equals( RZD_TO_ADDRESS ) )
						rep.setT1Cmn12093Fail( rep.getT1Cmn12093Fail( ) + 1 );
					continue;
				}
			}
			else if ( msg.messageType.equals( MessageType.CMN_12094 ) && msg.senderInformation.equals( RZD_TO_ADDRESS ) && result.containsKey( msg.envelopeId ) )
			{
				boolean res = result.get( msg.envelopeId );
				if ( res )
				{
					rep.setT1Cmn12094Success( rep.getT1Cmn12094Success( ) + 1 );
					continue;
				}
				else
				{
					rep.setT1Cmn12094Fail( rep.getT1Cmn12094Fail( ) + 1 );
					continue;
				}
			}
			else if ( msg.messageType.equals( MessageType.CMN_12118 ) && result.containsKey( msg.envelopeId ) )
			{
				boolean res = result.get( msg.envelopeId );
				if ( res )
				{
					if ( msg.receiverInformation.equals( RZD_TO_ADDRESS ) )
						rep.setT1Cmn12118Sent( rep.getT1Cmn12118Sent( ) + 1 );
					else
						rep.setT1Cmn12118Success( rep.getT1Cmn12118Success( ) + 1 );
					
					continue;
				}
				else
				{
					if ( ! msg.receiverInformation.equals( RZD_TO_ADDRESS ) )
						rep.setT1Cmn12118Fail( rep.getT1Cmn12118Fail( ) + 1 );
					continue;
				}
			}
			else if ( msg.messageType.equals( MessageType.CMN_12095 ) && msg.senderInformation.equals( RZD_TO_ADDRESS ) && result.containsKey( msg.envelopeId ) )
			{
				boolean res = result.get( msg.envelopeId );
				if ( res )
				{
					rep.setT2Cmn12095Success( rep.getT2Cmn12095Success( ) + 1 );
					continue;
				}
				else
				{
					rep.setT2Cmn12095Fail( rep.getT2Cmn12095Fail( ) + 1 );
					continue;
				}
			}
			else if ( msg.messageType.equals( MessageType.CMN_12101 ) && msg.senderInformation.equals( RZD_TO_ADDRESS ) && result.containsKey( msg.envelopeId ) )
			{
				boolean res = result.get( msg.envelopeId );
				if ( res )
				{
					rep.setT2Cmn12101Success( rep.getT2Cmn12101Success( ) + 1 );
					continue;
				}
				else
				{
					rep.setT2Cmn12101Fail( rep.getT2Cmn12101Fail( ) + 1 );
					continue;
				}
			}
			else if ( msg.messageType.equals( MessageType.CMN_12096 ) && result.containsKey( msg.envelopeId ) )
			{
				boolean res = result.get( msg.envelopeId );
				if ( res )
				{
					if ( msg.receiverInformation.equals( RZD_TO_ADDRESS ) )
						rep.setT2Cmn12096Sent( rep.getT2Cmn12096Sent( ) + 1 );
					else
						rep.setT2Cmn12096Success( rep.getT2Cmn12096Success( ) + 1 );
					
					continue;
				}
				else
				{
					if ( ! msg.receiverInformation.equals( RZD_TO_ADDRESS ) )
						rep.setT2Cmn12096Fail( rep.getT2Cmn12096Fail( ) + 1 );
					continue;
				}
			}
			else if ( msg.messageType.equals( MessageType.CMN_12097 ) && ! msg.receiverInformation.equals( RZD_TO_ADDRESS ) && result.containsKey( msg.envelopeId ) )
			{
				boolean res = result.get( msg.envelopeId );
				if ( res )
				{
					rep.setT2Cmn12097Success( rep.getT2Cmn12097Success( ) + 1 );
					continue;
				}
				else
				{
					rep.setT2Cmn12097Fail( rep.getT2Cmn12097Fail( ) + 1 );
					continue;
				}
			}
			else if ( msg.messageType.equals( MessageType.CMN_12079 ) && msg.senderInformation.equals( RZD_TO_ADDRESS ) && result.containsKey( msg.envelopeId ) )
			{
				boolean res = result.get( msg.envelopeId );
				if ( res )
				{
					rep.setT3Cmn12079Success( rep.getT3Cmn12079Success( ) + 1 );
					continue;
				}
				else
				{
					rep.setT3Cmn12079Fail( rep.getT3Cmn12079Fail( ) + 1 );
					continue;
				}
			}
			else if ( msg.messageType.equals( MessageType.CMN_12081 ) && result.containsKey( msg.envelopeId ) )
			{
				boolean res = result.get( msg.envelopeId );
				if ( res )
				{
					if ( msg.receiverInformation.equals( RZD_TO_ADDRESS ) )
						rep.setT3Cmn12081Sent( rep.getT3Cmn12081Sent( ) + 1 );
					else
						rep.setT3Cmn12081Success( rep.getT3Cmn12081Success( ) + 1 );
					
					continue;
				}
				else
				{
					if ( ! msg.receiverInformation.equals( RZD_TO_ADDRESS ) )
						rep.setT3Cmn12081Fail( rep.getT3Cmn12081Fail( ) + 1 );
					continue;
				}
			}
			else if ( msg.messageType.equals( MessageType.CMN_12084 ) && result.containsKey( msg.envelopeId ) )
			{
				boolean res = result.get( msg.envelopeId );
				if ( res )
				{
					if ( msg.receiverInformation.equals( RZD_TO_ADDRESS ) )
						rep.setT3Cmn12084Sent( rep.getT3Cmn12084Sent( ) + 1 );
					else
						rep.setT3Cmn12084Success( rep.getT3Cmn12084Success( ) + 1 );
					
					continue;
				}
				else
				{
					if ( ! msg.receiverInformation.equals( RZD_TO_ADDRESS ) )
						rep.setT3Cmn12084Fail( rep.getT3Cmn12084Fail( ) + 1 );
					continue;
				}
			}
			else if ( msg.messageType.equals( MessageType.CMN_12080 ) && msg.senderInformation.equals( RZD_TO_ADDRESS ) && result.containsKey( msg.envelopeId ) )
			{
				boolean res = result.get( msg.envelopeId );
				if ( res )
				{
					rep.setT3Cmn12080Success( rep.getT3Cmn12080Success( ) + 1 );
					continue;
				}
				else
				{
					rep.setT3Cmn12080Fail( rep.getT3Cmn12080Fail( ) + 1 );
					continue;
				}
			}
			else if ( msg.messageType.equals( MessageType.CMN_12085 ) && result.containsKey( msg.envelopeId ) )
			{
				boolean res = result.get( msg.envelopeId );
				if ( res )
				{
					if ( msg.receiverInformation.equals( RZD_TO_ADDRESS ) )
						rep.setT3Cmn12085Sent( rep.getT3Cmn12085Sent( ) + 1 );
					else
						rep.setT3Cmn12085Success( rep.getT3Cmn12085Success( ) + 1 );
					
					continue;
				}
				else
				{
					if ( ! msg.receiverInformation.equals( RZD_TO_ADDRESS ) )
						rep.setT3Cmn12085Fail( rep.getT3Cmn12085Fail( ) + 1 );
					continue;
				}
			}
			else if ( msg.messageType.equals( MessageType.CMN_12086 ) )
			{
				rep.setT3Cmn12086Sent( rep.getT3Cmn12086Sent( ) + 1 );
				continue;
			}
		}
		
		return days;
	}
	
	protected static class Msg
	{
		public String messageType;
		public String receiverInformation;
		public String senderInformation;
		public String processId;
		public String envelopeId;
		public Calendar preparationDateTime;
	}
}
