package ru.acs.fts.aud.command.dispatcher.processors;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.acs.fts.aud.command.dispatcher.shared.AudCommandCreationContext;
import ru.acs.fts.aud.command.dispatcher.shared.DataAccess;
import ru.acs.fts.aud.management.model.entities.EdeclAudCommand;
import ru.acs.fts.aud.management.model.entities.EdeclAudDocInfo;
import ru.acs.fts.aud.management.model.entities.EdeclAudIntCommand;
import ru.acs.fts.aud.management.model.entities.EdeclAudProcInfo;
import ru.acs.fts.aud.management.utils.defines.DocumentModeIDs;
import ru.acs.fts.aud.management.utils.exceptions.ErrorHelper;
import ru.acs.fts.aud.service.model.defines.AudCommandStates;

public class DocumentOutProcessor extends BaseProcessor
{
	private static final Logger log = LoggerFactory.getLogger( DocumentOutProcessor.class );

	@Override
	public boolean processCommand( EdeclAudIntCommand intCommand ) 
		throws Exception
	{
		log.info( String.format(
			"Начинаем обработку внутренней команды с идентификатором: %d", intCommand.getRecId( )
		) );
		
		AudCommandCreationContext saveCtx = null;
		List< EdeclAudDocInfo > duplicateDocInfos = new ArrayList< EdeclAudDocInfo >( );
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
			
			saveCtx = DataAccess.createCommandForDocument( 
				intCommand.getDocumentId( ), procInfo, true, intCommand.getMsgCode( ) 
			);
			
			EdeclAudCommand commandToSave = saveCtx.getAudCommand( );
			commandToSave.setIntCmd( intCommand );
			commandToSave.setState( AudCommandStates.WAITABLE );
			commandToSave.setEadFlag( 0 );
			persistAudCommandCreationContext( saveCtx );
			
			EdeclAudDocInfo mainDoc = saveCtx.getMainDoc( );
			List< String > notUniqDocIds = _edeclService.getNotUniqDocumentsIdsByRefDocumentId( intCommand.getDocumentId( ) );
			
			for ( String notUniqDocId : notUniqDocIds )
			{
				log.info( String.format(
					"Найден неуникальный документ с идентификатором %s", notUniqDocId
				) );
				
				List< EdeclAudDocInfo > notUniqDocuments = _audService.getDocInfosByDocumentId( notUniqDocId );
				
				if ( null != notUniqDocuments && 0 != notUniqDocuments.size( ) )
				{
					boolean containsSubDocument = false;
					for ( EdeclAudDocInfo di : notUniqDocuments )
					{
						if ( di.getRefMainDoc( ).equalsIgnoreCase( intCommand.getDocumentId( ) ) )
							containsSubDocument = true;
					}
					
					if ( ! containsSubDocument )
					{
						log.info( String.format(
							"Добавляем неуникальный документ с идентификатором %s", notUniqDocId
						) );
						
						EdeclAudDocInfo fd = notUniqDocuments.get( 0 );
						
						EdeclAudDocInfo dd = new EdeclAudDocInfo( );
						dd.setAudExtDocId( fd.getAudExtDocId( ) );
						dd.setAudExtPacketId( fd.getAudExtPacketId( ) );
						dd.setCmdRefGuid( commandToSave.getGuid( ) );
						dd.setDescription( fd.getDescription( ) );
						dd.setDocumentId( fd.getDocumentId( ) );
						dd.setDocumentModeId( fd.getDocumentModeId( ) );
						dd.setEadArchiveId( fd.getEadArchiveId( ) );
						dd.setEadDocumentId( fd.getEadDocumentId( ) );
						dd.setNeedPrevVersion( 1 );
						dd.setPrevVersion( fd.getArchDocId( ) );
						dd.setProcInfo( fd.getProcInfo( ) );
						dd.setRefDocumentId( fd.getRefDocumentId( ) );
						dd.setState( AudCommandStates.WAITABLE );
						dd.setRefMainDoc( intCommand.getDocumentId( ) );
						_audService.persist( dd );
						
						duplicateDocInfos.add( dd );
					}
				}
			}
			
			if ( null != mainDoc && ( null == mainDoc.getRefDocumentId( ) || 0 == mainDoc.getRefDocumentId( ).length( ) ) )
			{
				EdeclAudDocInfo dt = saveCtx.getDocumentByDocumentModeId( DocumentModeIDs.ESAD_OUT_CU );
				if ( null != dt )
				{
					EdeclAudDocInfo lastPut = _audService.getLastPutDocumentByDocumentId( dt.getDocumentId( ) );
					mainDoc.setRefDocumentId( lastPut.getRefMainDoc( ) );
					_audService.merge( mainDoc );
				}
			}
			
			_audService.merge( procInfo );
			
			log.info( String.format(
				"Создали команду для сохранения с идентификатором %s и документом на отправку %s",
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
				for ( EdeclAudDocInfo ddi : duplicateDocInfos )
				{
					_audService.delete( ddi );
				}
				removeAudCommandCreationContext( saveCtx );
				
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
