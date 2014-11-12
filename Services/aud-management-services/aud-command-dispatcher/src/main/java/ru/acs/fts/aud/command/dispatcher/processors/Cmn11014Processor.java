package ru.acs.fts.aud.command.dispatcher.processors;

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

public class Cmn11014Processor extends BaseProcessor
{
	private static final Logger log = LoggerFactory.getLogger( Cmn11014Processor.class );

	@Override
	public boolean processCommand( EdeclAudIntCommand intCommand ) 
		throws Exception
	{
		log.info( String.format(
			"Начинаем обработку внутренней команды с идентификатором: %d", intCommand.getRecId( )
		) );
			
		AudCommandCreationContext saveRefDocCtx = null;
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
				"Формируем команду на сохранение ссылочного документа для внутренней команды %d",
				intCommand.getRecId( )
			) );
				
			saveRefDocCtx = DataAccess.createCommandForDocument( 
				doc.getRefDocumentId( ), procInfo, true, intCommand.getMsgCode( ) 
			);
				
			EdeclAudCommand commandToSaveRefDoc = saveRefDocCtx.getAudCommand( ); 			
			commandToSaveRefDoc.setIntCmd( intCommand );
			commandToSaveRefDoc.setState( AudCommandStates.WAITABLE );
			commandToSaveRefDoc.setEadFlag( 0 );
			persistAudCommandCreationContext( saveRefDocCtx );
				
			_audService.merge( procInfo );
				
			log.info( String.format(
				"Успешно создали команду на сохранения в БД с идентификатором %s, с документом на отправку" +
				"с идентификатором %s.",
				commandToSaveRefDoc.getGuid( ), doc.getRefDocumentId( )
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
				removeAudCommandCreationContext( saveRefDocCtx );
					
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
