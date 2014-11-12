package ru.acs.fts.aud.result.dispatcher.savers;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.aud.management.model.entities.EdeclAudCommand;
import ru.acs.fts.aud.management.model.entities.EdeclAudDocInfo;
import ru.acs.fts.aud.management.model.entities.EdeclAudMessage;
import ru.acs.fts.aud.management.model.entities.EdeclAudProcInfo;
import ru.acs.fts.aud.management.model.entities.EdeclAudSettings;
import ru.acs.fts.aud.management.model.services.AudService;
import ru.acs.fts.aud.management.utils.shared.GenericUtils;
import ru.acs.fts.aud.rest.service.model.objects.AudMessage;
import ru.acs.fts.aud.rest.service.model.objects.AudRegistry;
import ru.acs.fts.aud.rest.service.model.objects.AudRegistryDoc;
import ru.acs.fts.aud.rest.service.model.objects.AudRegistryResult;
import ru.acs.fts.aud.rest.service.model.objects.AudResponseMetadata;
import ru.acs.fts.aud.service.model.defines.AudCommandStates;

public class RegistrySaver
{
	private static final Logger log = LoggerFactory.getLogger( RegistrySaver.class );
	
	private static final String REGISTRY_UNLOCKED = "registry.unlocked";
	private static final String REGISTRY_END_DATE = "registry.end.date";
	
	private AudService _audService;
	
	// @formatter:off
	@Required public void setAudService( AudService audService ) { _audService = audService; }
	public AudService getAudService( ) { return _audService; }
	// @formatter:on
	
	public void processRegistry( AudMessage msg, AudResponseMetadata metadata )
	{
		try
		{
			safeProcessRegistry( msg, metadata );
		}
		catch ( Exception exc )
		{
			log.info( String.format(
				"[!] При обработке реестра произошла ошибка %s", exc.getMessage( )
			), exc );
			
			EdeclAudSettings set = _audService.getAudSettings( REGISTRY_UNLOCKED );
			set.setValue( Boolean.toString( true ) );
			_audService.merge( set );			
		}
	}
	
	public void safeProcessRegistry( AudMessage msg, AudResponseMetadata metadata )
	{
		AudRegistry registry = metadata.getAudRegistry( );
		
		// Проходимся по полученным данным, выставляем нужным командам нужные статусы
		for ( AudRegistryResult result : registry.getResults( ) )
		{
			// Шаг 1: По данным процедуры (GTDID) ищем все команды
			EdeclAudProcInfo pi = _audService.getProcInfoByGTD( 
				result.getGtdIdCustomsCode( ), 
				result.getGtdIdRegNumber( ), 
				result.getGtdIdRegDate( ).toDate( ) 
			);

			boolean procOk = true;
			
			if ( null != pi )
			{
				// Шаг 2: По полученным командам заполняем мап CmdId -> Map< DocId, Status >
				Map< Integer, Map< String, Boolean > > commandStatus = new HashMap< Integer, Map< String, Boolean > >( );
				Map< String, List< Integer > > docToCmd = new HashMap< String, List< Integer > >( );
				
				Map< Integer, EdeclAudCommand > commandsMap = new HashMap< Integer, EdeclAudCommand >( );
				Map< Integer, List< EdeclAudDocInfo > > commandsDocs = new HashMap< Integer, List< EdeclAudDocInfo > >( );
				
				List< EdeclAudCommand > cmds = new ArrayList< EdeclAudCommand >( pi.getAudCommands( ) );
				for ( EdeclAudCommand cmd : cmds )
				{
					commandsMap.put( cmd.getRecId( ), cmd );
					
					Map< String, Boolean > docStatus = commandStatus.get( cmd.getRecId( ) );
					if ( null == docStatus )
					{
						docStatus = new HashMap< String, Boolean >( );
						commandStatus.put( cmd.getRecId( ), docStatus );
					}
					
					List< EdeclAudDocInfo > dis = _audService.getDocInfosByAudCommand( cmd.getGuid( ) );
					commandsDocs.put( cmd.getRecId( ), dis );
					
					for ( EdeclAudDocInfo di : dis )
					{
						docStatus.put( di.getDocumentId( ), false );
						
						List< Integer > dtocmd = docToCmd.get( di.getDocumentId( ) );
						if ( null == dtocmd )
						{
							dtocmd = new ArrayList< Integer >( );
							docToCmd.put( di.getDocumentId( ), dtocmd );
						}
						
						dtocmd.add( cmd.getRecId( ) );
					}
				}
				
				// Шаг 3: Проходим по данным записи реестра и заполням мап
				for ( AudRegistryDoc doc : result.getDocs( ) )
				{
					List< Integer > cmdIds = docToCmd.get( doc.getAppDocumentId( ) );
					if ( null == cmdIds || 0 == cmdIds.size( ) )
						continue;
					
					for ( Integer cmdId : cmdIds )
					{
						Map< String, Boolean > docStatus = commandStatus.get( cmdId );
						if ( null != docStatus )
						{
							docStatus.put( doc.getAppDocumentId( ), true );
						}
					}
				}
				
				for ( Integer cmdId : commandStatus.keySet( ) )
				{
					boolean commandOk = true;
					Map< String, Boolean > docStatus = commandStatus.get( cmdId );
					for ( String docId : docStatus.keySet( ) )
					{
						if ( ! docStatus.get( docId ) )
						{
							commandOk = false;
							break;
						}
					}
					
					// Шаг 4.1: Если мап заполнен полностью, выставляем командам статус Processed ( если еще не был ) и заполняем нужные идентификаторы
					if ( commandOk )
					{
						log.info( String.format(
							"Для команды %d получено подтверждение в реестре об успешном размещении документов в АЮДе. Обновляем поля...",
							cmdId
						) );
						
						// EdeclAudCommand cmd = _audService.getAudCommand( cmdId );
						EdeclAudCommand cmd = commandsMap.get( cmdId );
						
						cmd.setDateTime( new GregorianCalendar( ) );
						cmd.setIntError( null );
						cmd.setErrDescription( null );
						cmd.setErrCode( null );
						cmd.setState( AudCommandStates.PROCESSED );
						
						_audService.merge( cmd );
						
						byte[ ] nullxBytes = "nullx".getBytes( Charset.forName( "UTF-8" ) );
						EdeclAudMessage message = cmd.getOutEnvelope( );
						if ( null != message )
						{
							message.setBody( nullxBytes );
							_audService.merge( message );
						}	
						
						message = cmd.getInEnveope( );
						if ( null != message )
						{
							message.setBody( nullxBytes );
							_audService.merge( message );
						}
						
						// List< EdeclAudDocInfo > docInfos = _audService.getDocInfosByAudCommand( cmd.getGuid( ) );
						List< EdeclAudDocInfo > docInfos = commandsDocs.get( cmdId );
						
						Map< String, EdeclAudDocInfo > dis = new HashMap< String, EdeclAudDocInfo >( );
						for ( EdeclAudDocInfo di : docInfos )
						{
							dis.put( di.getDocumentId( ), di );
						}
						
						for ( AudRegistryDoc adoc : result.getDocs( ) )
						{
							EdeclAudDocInfo di = dis.get( adoc.getAppDocumentId( ) );
							if ( null == di )
								continue;
							
							copyInformation( result, adoc, di );
							_audService.merge( di );
						}
					}
					// Шаг 4.2: Если мап заполнен не полностью нужной команде и ее документам мы выставляем статус Waitable
					else
					{
						log.info( String.format(
							"[!] Успешное размещение документов для команды %d не подтверждено реестром из АЮДа. Сбрасываем статусы",
							cmdId
						) );
						
						procOk = false;
						
						// EdeclAudCommand cmd = _audService.getAudCommand( cmdId );
						EdeclAudCommand cmd = commandsMap.get( cmdId );
						
						cmd.setState( AudCommandStates.WAITABLE );
						cmd.setIntError( null );
						cmd.setErrDescription( null );
						cmd.setErrCode( null );
						_audService.merge( cmd );
						
						// List< EdeclAudDocInfo > dis = _audService.getDocInfosByAudCommand( cmd.getGuid( ) );
						List< EdeclAudDocInfo > dis = commandsDocs.get( cmdId );
						
						for ( EdeclAudDocInfo di : dis )
						{
							di.setState( AudCommandStates.WAITABLE );
							di.setErrorCode( null );
							di.setErrorDescription( null );
							_audService.merge( di );
						}
					}
				}
			}
			else
			{
				procOk = false;
			}
				
			if ( procOk )
			{
				log.info( String.format(
					"Для процедуры %s получено подтверждение из реестра об успешном размещении документов в АЮД",
					result.getAppPacketId( )
				) );
				
				boolean changed = false;
				if ( null == pi.getPacketId( ) || ! pi.getPacketId( ).equals( result.getArchPacketId( ) ) )
				{
					pi.setPacketId( result.getArchPacketId( ) );
					changed = true;
				}
				
				if ( null == pi.getPkCreateDateTime( ) || ! pi.getPkCreateDateTime( ).equals( mapJodaDateTime( result.getPacketPutDateTime( ) ) ) )
				{
					if ( null != result.getPacketPutDateTime( ) )
						pi.setPkCreateDateTime( mapJodaDateTime( result.getPacketPutDateTime( ) ) );
					else
						pi.setPkCreateDateTime( new GregorianCalendar( ) );
					changed = true;
				}
				
				if ( changed )
				{
					pi.setPkChangeDateTime( new GregorianCalendar( ) );
					_audService.merge( pi );
				}
			}
			else
			{
				log.info( String.format(
					"[!] Успешное размещение документов для процедуры %s в АЮДе реестром не подтверждено!",
					result.getAppPacketId( )
				) );
			}
		}
		
		// Обновляем параметры в настройках
		EdeclAudSettings set = _audService.getAudSettings( REGISTRY_UNLOCKED );
		set.setValue( Boolean.toString( true ) );
		_audService.merge( set );
		
		set = _audService.getAudSettings( REGISTRY_END_DATE );
		if ( null == set.getValue( ) || "".equals( set.getValue( ) ) )
		{
			set.setValue( new DateTime( ).toString( ) );
		}
		else
		{
			DateTime dt = new DateTime( set.getValue( ) );
			dt = dt.minusDays( 1 );
			
			/** Начало времен */
			if ( dt.compareTo( new DateTime( "2009-01-01T00:00:00.000+00:00" ) ) < 0 )
				dt = new DateTime( );
			
			set.setValue( dt.toString( ) );
		}
		_audService.merge( set );
	}
	
	public static Calendar mapJodaDateTime( DateTime dt )
	{
		if ( null == dt )
			return null;
		
		return GenericUtils.ensureTimeZone( dt ).toGregorianCalendar( );
	}

	private void copyInformation( AudRegistryResult result, AudRegistryDoc adoc, EdeclAudDocInfo doc )
	{
		setInformation(
			doc, adoc.getArchDocumentId( ),
			AudCommandStates.PROCESSED, adoc.getArchVersion( ),
			null, null, 
			result.getPacketPutDateTime( )
		);
	}
	
	private void setInformation( 
			EdeclAudDocInfo doc, String archiveDocumentId,
			String state, int version,
			String errorCode, String errorDescription,
			DateTime putDateTime )
	{
		/*
		log.info( String.format(
			"Обработка PutDocumentResponse: архивный идентификатор корневого документа %s",
			archiveDocumentId
		) );
		*/		

		doc.setState( state );
		doc.setArchDocId( archiveDocumentId );
		doc.setVersion( Integer.toString( version ) );
		doc.setErrorCode( errorCode );
		doc.setErrorDescription( errorDescription );
		
		if ( null != putDateTime )
			doc.setPutDateTime( mapJodaDateTime( putDateTime ) );
		else
			doc.setPutDateTime( new GregorianCalendar( ) );		
		
		_audService.merge( doc );
	}	
}
