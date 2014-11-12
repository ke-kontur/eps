package ru.acs.fts.aud.command.executor.processors;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.aud.command.executor.mappers.AudCommandMapper;
import ru.acs.fts.aud.command.executor.mappers.AudMessageMapper;
import ru.acs.fts.aud.command.executor.ws.AudWmqRestWs;
import ru.acs.fts.aud.management.model.entities.EdeclAudCommand;
import ru.acs.fts.aud.management.model.entities.EdeclAudDocInfo;
import ru.acs.fts.aud.management.model.entities.EdeclAudMessage;
import ru.acs.fts.aud.management.utils.exceptions.ErrorHelper;
import ru.acs.fts.aud.management.utils.shared.StringUtils;
import ru.acs.fts.aud.rest.service.model.objects.AudCommand;
import ru.acs.fts.aud.rest.service.model.objects.AudMessage;
import ru.acs.fts.aud.rest.service.model.objects.DocInfo;
import ru.acs.fts.aud.service.model.defines.AudCommandStates;

public class GenericProcessor extends BaseProcessor
{
	private static final Logger log = LoggerFactory.getLogger( GenericProcessor.class );
	
	private AudCommandMapper _audCommandMapper;
	private AudWmqRestWs _audWmqRestWsClient;
	
	// @formatter:off
	@Required public void setAudCommandMapper( AudCommandMapper audCommandMapper ) { _audCommandMapper = audCommandMapper; }
	public AudCommandMapper getAudCommandMapper( ) { return _audCommandMapper; }
	
	@Required public void setAudWmqRestWsClient( AudWmqRestWs audWmqRestWsClient ) { _audWmqRestWsClient = audWmqRestWsClient; }
	public AudWmqRestWs getAudWmqRestWsClient( ) { return _audWmqRestWsClient; }
	// @formatter:on

	public boolean processCommand( EdeclAudCommand command ) 
		throws Exception
	{
		try
		{
			log.info( String.format(
				"Начинаем обработку команду %d", command.getRecId( )
			) );
			
			List< EdeclAudDocInfo > edeclAudDocInfos = new ArrayList< EdeclAudDocInfo >( );
			AudCommand cmd = _audCommandMapper.mapEdeclAudCommand( command, edeclAudDocInfos );
			
			ensurePrevVersion( cmd );
			
			log.info( String.format(
				"Преобразовали команду %d для отправки в WmqAudRouter", command.getRecId( )
			) );
			
			AudMessage msg = _audWmqRestWsClient.sendCommand( cmd );
			
			log.info( String.format(
				"Успешно передали команду %d WmqAudRouter'у", command.getRecId( )
			) );
			
			EdeclAudMessage dbMsg = AudMessageMapper.mapAudMessage( msg );
			
			log.info( String.format(
				"Успешно преобразовали ответ WmqAudRouter'а на команду %d", command.getRecId( )
			) );
			
			command.setOutEnvelope( dbMsg );
			command.setState( AudCommandStates.SENDED );
			command.setDateTime( new GregorianCalendar( ) );
			_audService.merge( command );
			
			log.info( String.format(
				"Успешно сохранили ответ WmqAudRouter'а в БД для команды %d", command.getRecId( )
			) );

			List< EdeclAudDocInfo > documents = _audService.getDocInfosByAudCommand( command.getGuid( ) );
			for ( EdeclAudDocInfo doc : documents )
			{
				for ( DocInfo di : cmd.getDocInfos( ) )
				{
					if ( di.getDocumentId( ).equalsIgnoreCase( doc.getDocumentId( ) ) )
					{
						doc.setPrevVersion( di.getPrevVersion( ) );
					}
				}
				
				doc.setState( AudCommandStates.SENDED );
				_audService.merge( doc );
			}
			
			log.info( String.format(
				"Успешно обработали команду %d", command.getRecId( )
			) );
			
			return true;
		}
		catch ( Exception exc )
		{
			log.error( String.format( 
				"При обработки команды на отправку произошла ошибка", command.getRecId( ) 
			), exc );
			
			try
			{
				command.setState( AudCommandStates.ERROR );
				command.setIntError( ErrorHelper.getExceptionData( exc ) );
				command.setDateTime( new GregorianCalendar( ) );
				_audService.merge( command );
			}
			catch ( Exception exc2 )
			{
				log.error( String.format(
					"Не удалось пометить внутреннюю команду %d как ошибочную. Откатываем транзакцию.",
					command.getRecId( )
				), exc2 );
					
				throw exc2;				
			}
		}
		
		return false;
	}
	
	private void ensurePrevVersion( AudCommand cmd )
	{
		DocInfo mainDoc = null;
		
		for ( DocInfo docInfo : cmd.getDocInfos( ) )
		{
			if ( docInfo.getRefMainDoc( ).equalsIgnoreCase( docInfo.getDocumentId( ) ) )
				mainDoc = docInfo;
		}
		
		if ( null == mainDoc )
			return ;
		
		ensurePrevVersion( mainDoc );
	}

	private void ensurePrevVersion( DocInfo mainDoc )
	{
		if ( null == mainDoc.getNeedPrevVersion( ) || 1 != mainDoc.getNeedPrevVersion( ) )
		{
			log.info( String.format(
				"Документ %s не требует предыдущей версии (%s)",
				mainDoc.getDocumentId( ),
				( null != mainDoc.getNeedPrevVersion( ) ) ? mainDoc.getNeedPrevVersion( ).toString( ) : "null"
			) );
		}
		
		log.info( String.format(
			"Получаем предыдущую версию %s", mainDoc.getDocumentId( )
		) );
				
		if ( mainDoc.getRefMainDoc( ).equalsIgnoreCase( mainDoc.getDocumentId( ) ) )
		{
			if ( ! StringUtils.isNullOrEmpty( mainDoc.getDocumentId( ) ) &&
				 ! StringUtils.isNullOrEmpty( mainDoc.getRefMainDoc( ) ) &&
				 ! StringUtils.isNullOrEmpty( mainDoc.getDocumentModeId( ) ) )
			{
				String refArch = _audService.getArchDocIdByDocAndNotByRefMainDoc( 
					mainDoc.getDocumentId( ), mainDoc.getRefMainDoc( ), 
					mainDoc.getDocumentModeId( ) 
				);
				
				if ( ! StringUtils.isNullOrEmpty( refArch ) )
					mainDoc.setPrevVersion( refArch );
			}
					
			if ( ! StringUtils.isNullOrEmpty( mainDoc.getRefDocumentId( ) ) )
			{
				String refArch = _audService.getArchDocIdByRefDocumentId( 
					mainDoc.getRefDocumentId( ), mainDoc.getDocumentModeId( ) 
				);
                	
                if ( ! StringUtils.isNullOrEmpty( refArch ) )
                	mainDoc.setPrevVersion( refArch );
			}
		}
	}		
}
