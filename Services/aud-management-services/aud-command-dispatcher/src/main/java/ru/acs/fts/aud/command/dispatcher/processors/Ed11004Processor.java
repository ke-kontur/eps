package ru.acs.fts.aud.command.dispatcher.processors;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.acs.fts.aud.command.dispatcher.shared.AudCommandCreationContext;
import ru.acs.fts.aud.command.dispatcher.shared.DataAccess;
import ru.acs.fts.aud.management.model.entities.EdeclAudCommand;
import ru.acs.fts.aud.management.model.entities.EdeclAudIntCommand;
import ru.acs.fts.aud.management.model.entities.EdeclAudProcInfo;
import ru.acs.fts.aud.management.model.entities.EdeclDocument;
import ru.acs.fts.aud.management.utils.exceptions.ErrorHelper;
import ru.acs.fts.aud.service.model.defines.AudCommandStates;

public class Ed11004Processor extends BaseProcessor
{
	private static final Logger log = LoggerFactory.getLogger( Ed11004Processor.class );

	@Override
	public boolean processCommand( EdeclAudIntCommand intCommand ) 
		throws Exception
	{
		log.info( String.format(
			"Начинаем обработку внутренней команды с идентификатором: %d", intCommand.getRecId( )
		) );
			
		AudCommandCreationContext saveDocCtx = null;
		try
		{
			EdeclAudProcInfo procInfo = _audOperator.getAudProcedureInfo( intCommand.getProcessId( ) );
			if ( null == procInfo )
			{
				intCommand.setState( AudCommandStates.ERROR );
				intCommand.setIntError( "Не найдена процедура для этой команды".getBytes( "UTF-8" ) );
				_audService.merge( intCommand );
				return false;
			}

			EdeclDocument doc = _edeclService.getDocument( intCommand.getDocumentId( ) );
				
			log.info( String.format( 
				"Формируем команду на сохранение вложенного документа для внутренней команды %d",
				intCommand.getRecId( )
			) );
			
			List< EdeclDocument > subdocs = doc.getNestedDocuments( );
			if ( null == subdocs || 0 == subdocs.size( ) )
			{
				log.info( String.format(
					"Для документа сообщения ED.11004 нет вложенных документов, идентификатор команды %d",
					intCommand.getRecId( )
				) );
				throw new Exception( "Нет вложенных документов" );
			}
			
			EdeclDocument subDoc = subdocs.get( 0 );
				
			saveDocCtx = DataAccess.createCommandForDocument( 
				subDoc.getDocumentId( ), procInfo, true, intCommand.getMsgCode( ) 
			);
				
			EdeclAudCommand commandToSaveDoc = saveDocCtx.getAudCommand( ); 			
			commandToSaveDoc.setIntCmd( intCommand );
			commandToSaveDoc.setState( AudCommandStates.WAITABLE );
			commandToSaveDoc.setEadFlag( 1 );
			persistAudCommandCreationContext( saveDocCtx );
				
			_audService.merge( procInfo );
				
			log.info( String.format(
				"Успешно создали команду на сохранения в БД с идентификаторами %s, с документом на отправку" +
				"с идентификаторами %s.",
				commandToSaveDoc.getGuid( ), subDoc.getDocumentId( )
			) );
			
			return true;
		}
		catch ( Exception exc )
		{
			log.error( String.format( 
				"Ошибка обработки команды %d. Помечаем ее как ошибочную.", intCommand.getRecId( ) ),
				exc 
			);
				
			try
			{
				removeAudCommandCreationContext( saveDocCtx );
					
				intCommand.setState( AudCommandStates.ERROR );
				intCommand.setIntError( ErrorHelper.getExceptionData( exc ) );
				_audService.merge( intCommand );
			}
			catch ( Exception exc2 )
			{
				log.error( String.format(
					"Не удалось пометить внутреннюю команду %d как ошибочную. Откатываем транзакцию.",
					intCommand.getRecId( )
				), exc2 );
					
				throw exc2;
			}
		}
		
		return false;
	}

}
