package ru.acs.fts.aud.command.dispatcher.shared;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.aud.management.model.entities.EdeclAlbumDocList;
import ru.acs.fts.aud.management.model.entities.EdeclAudCommand;
import ru.acs.fts.aud.management.model.entities.EdeclAudDocInfo;
import ru.acs.fts.aud.management.model.entities.EdeclAudMsgType;
import ru.acs.fts.aud.management.model.entities.EdeclAudProcInfo;
import ru.acs.fts.aud.management.model.entities.EdeclDocument;
import ru.acs.fts.aud.management.model.services.AudService;
import ru.acs.fts.aud.management.model.services.EdeclService;
import ru.acs.fts.aud.service.model.defines.AudCommandStates;

public class DataAccess
{
	private static final Logger log = LoggerFactory.getLogger( DataAccess.class );
	
	private static EdeclService _edeclService;
	private static AudService _audService;
	
	private static Map< String, String > _documentDescriptions;
	
	// @formatter:off
	@Required public void setEdeclService( EdeclService edeclService ) { _edeclService = edeclService; }
	public EdeclService getEdeclService( ) { return _edeclService; }
	
	@Required public void setAudService( AudService audService ) { _audService = audService; }
	public AudService getAudService( ) { return _audService; }
	
	@Required public void setDocumentDescriptions( Map< String, String > documentDescriptions ) { _documentDescriptions = documentDescriptions; }
	public Map< String, String > getDocumentDescriptions( ) { return _documentDescriptions; }
	// @formatter:on
	
	public static AudCommandCreationContext createCommandForDocument(
			String documentId, EdeclAudProcInfo procInfo, 
			boolean needSetPrevVersion, String messageType )
	{
		AudCommandCreationContext ctx = new AudCommandCreationContext( );
		
		EdeclAudCommand cmd = new EdeclAudCommand( );
		cmd.setGuid( UUID.randomUUID( ).toString( ) );
		cmd.setDateTime( new GregorianCalendar( ) );
		cmd.setEadFlag( 1 ); // TODO: магическое число! заменить на символьную константу
		cmd.setProcInfo( procInfo );
		
		ctx.setAudCommand( cmd );
		
		List< EdeclAudDocInfo > docInfos = getDocumentInfos( documentId, procInfo, needSetPrevVersion, messageType );
		if ( docInfos.size( ) > 0 )
		{
			ctx.setDocInfos( docInfos );
    		log.info( String.format(
       			"Привязываем созданные документы для команды с идентификатором: %s", cmd.getGuid( )
       		) );
			
    		String cmdRefGuid = docInfos.get( 0 ).getCmdRefGuid( );
    		if ( null == cmdRefGuid || 0 == cmdRefGuid.length( ) )
    		{
    			for ( EdeclAudDocInfo audDocInfo : docInfos )
    			{
    				audDocInfo.setState( AudCommandStates.WAITABLE );
    				audDocInfo.setCmdRefGuid( cmd.getGuid( ) );
    				
    				procInfo.getAudDocInfos( ).add( audDocInfo );
    				// _audService.merge( procInfo ); Это должна делать вызывающая сторона после сохранения документа
    				
    				for ( EdeclAudDocInfo audDocInfo2 : docInfos )
    				{
    					if ( audDocInfo2.getDocumentId( ).equalsIgnoreCase( audDocInfo.getRefDocumentId( ) ) )
    					{
    						audDocInfo.setNeedPrevVersion( 0 );
    						break;
    					}
    				}
    			}
    		}    		
		}
		
		return ctx;
	}
    
    public static List< EdeclAudDocInfo > getDocumentInfos( 
    		String documentId, EdeclAudProcInfo procInfo, 
    		boolean needSetPrevVersion, String msgType )
    {
    	log.info( String.format(
    		"Создаем или выбираем сущности EdeclAudDocInfo, DocumentID: %s, ProcessID: %s, MessageType: %s",
    		documentId, procInfo.getProcessId( ), msgType
    	) );
    	
    	List< EdeclDocument > docs = _edeclService.getDocuments( documentId );
    	
    	if ( null == docs )
    		return new ArrayList< EdeclAudDocInfo >( );
    	
    	List< EdeclAudDocInfo > audDocInfos = new ArrayList< EdeclAudDocInfo >( );
    	
    	for ( EdeclDocument doc : docs )
    	{
    		EdeclAudDocInfo audDoc = new EdeclAudDocInfo( );
    		
    		audDoc.setProcInfo( procInfo );
    		audDoc.setArchDocId( null );
    		audDoc.setDocumentId( doc.getDocumentId( ) );
    		audDoc.setDocumentModeId( doc.getDocumentModeId( ) );
    		audDoc.setRefDocumentId( doc.getRefDocumentId( ) );
    		audDoc.setRefMainDoc( ( null != doc.getRefMainDoc( ) ) ? doc.getRefMainDoc( ) : doc.getDocumentId( ) );
    		
    		if ( _documentDescriptions.containsKey( doc.getDocumentModeId( ) ) )
    		{
    			EdeclAudMsgType audMsgType = _audService.getAudMsgType( msgType );
    			if ( null != audMsgType )
    				audDoc.setDescription( audMsgType.getDescription( ) );
    		}
    		else
    		{
    			EdeclAlbumDocList docList = _edeclService.getAlbumDocListRecord( doc.getDocumentModeId( ) );
    			if ( null != docList )
    				audDoc.setDescription( docList.getDocDescription( ) );
    		}
    		
    		audDoc.setNeedPrevVersion( needSetPrevVersion ? 1 : 0 );
    		
    		audDocInfos.add( audDoc );
    	}

    	return audDocInfos;
    }    
}
