package ru.acs.fts.aud.command.dispatcher.processors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.acs.fts.aud.command.dispatcher.shared.AudCommandCreationContext;
import ru.acs.fts.aud.command.dispatcher.shared.DataAccess;
import ru.acs.fts.aud.management.model.entities.EdeclAudCommand;
import ru.acs.fts.aud.management.model.entities.EdeclAudIntCommand;
import ru.acs.fts.aud.management.model.entities.EdeclAudProcInfo;
import ru.acs.fts.aud.management.utils.shared.StringUtils;
import ru.acs.fts.aud.service.model.defines.AudCommandStates;

public class SingleDocSendProcessor extends BaseProcessor
{
	private static final Logger log = LoggerFactory.getLogger( SingleDocSendProcessor.class );
	
	@Override
	public boolean processCommand( EdeclAudIntCommand intCommand ) throws Exception
	{
		log.info( String.format(
			"[SingleDocSendProcessor]: Начинаем обработку команды %d",
			( null != intCommand.getRecId( ) ) ? intCommand.getRecId( ) : -1
		) );
		
		AudCommandCreationContext saveCtx = null;
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
			
			if ( StringUtils.isNullOrEmpty( procInfo.getGtdCustomsCode( ) ) ||
				 StringUtils.isNullOrEmpty( procInfo.getGtdNumber( ) ) ||
				 null == procInfo.getGtdRegistrationDate( ) )
			{
				intCommand.setState( AudCommandStates.ERROR );
				intCommand.setIntError( "Декларация по процедура декларирования не была зарегистрирована в установленном порядке".getBytes( "UTF-8" ) );
				_audService.merge( intCommand );
			}

			saveCtx = DataAccess.createCommandForDocument(
				intCommand.getDocumentId( ), procInfo, false, intCommand.getMsgCode( ) 
			);
			
			EdeclAudCommand commandToSave = saveCtx.getAudCommand( );			
			commandToSave.setState( AudCommandStates.WAITABLE );
			commandToSave.setIntCmd( intCommand );
			commandToSave.setEadFlag( 0 );
			persistAudCommandCreationContext( saveCtx );

			log.info( String.format(
				"Создали АЮД команду с идентификатором %s, для отправки документа %s",
				commandToSave.getGuid( ), intCommand.getDocumentId( ) 
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
				removeAudCommandCreationContext( saveCtx );
				
				intCommand.setState( AudCommandStates.ERROR );
				intCommand.setIntError( exc.toString( ).getBytes( "UTF-8" ) );
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
