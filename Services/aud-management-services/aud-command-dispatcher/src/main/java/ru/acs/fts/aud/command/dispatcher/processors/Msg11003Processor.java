package ru.acs.fts.aud.command.dispatcher.processors;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.UUID;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import ru.acs.fts.aud.command.dispatcher.shared.AudCommandCreationContext;
import ru.acs.fts.aud.command.dispatcher.shared.EadIds;
import ru.acs.fts.aud.management.model.entities.EdarchDocument;
import ru.acs.fts.aud.management.model.entities.EdeclAlbumDocList;
import ru.acs.fts.aud.management.model.entities.EdeclAudCommand;
import ru.acs.fts.aud.management.model.entities.EdeclAudDocInfo;
import ru.acs.fts.aud.management.model.entities.EdeclAudIntCommand;
import ru.acs.fts.aud.management.model.entities.EdeclAudProcInfo;
import ru.acs.fts.aud.management.model.entities.EdeclDocument;
import ru.acs.fts.aud.management.model.services.EdarchService;
import ru.acs.fts.aud.management.utils.exceptions.ErrorHelper;
import ru.acs.fts.aud.service.model.defines.AudCommandStates;

public class Msg11003Processor extends BaseProcessor
{
	private static final Logger log = LoggerFactory.getLogger( Msg11003Processor.class );
	
	private EdarchService _edarchService;
	
	// @formatter:off
	@Required public void setEdarchService( EdarchService edarchService ) { _edarchService = edarchService; }
	public EdarchService getEdarchService( ) { return _edarchService; }
	// @formatter:on

	@Override
	public boolean processCommand( EdeclAudIntCommand intCommand ) 
		throws Exception
	{
		log.info( String.format(
			"Начинаем обработку внутренней команды с идентификатором: %d", intCommand.getRecId( )
		) );
		
		List< AudCommandCreationContext > ctxs = new ArrayList< AudCommandCreationContext >( );
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

			List< EadIds > requestedArchDocs = getEadIdentifiers( intCommand );
			
			for ( EadIds archDocIds : requestedArchDocs )
			{
				List< EdarchDocument > archDocs = _edarchService.getDocuments( archDocIds.getArchId( ), archDocIds.getArchDocId( ) );				
				if ( null == archDocs || 0 == archDocs.size( ) )
					continue;

				AudCommandCreationContext ctx = new AudCommandCreationContext( );
				ctxs.add( ctx );
				
				EdeclAudCommand commandToSave = new EdeclAudCommand( );
				ctx.setAudCommand( commandToSave );
				
				commandToSave.setGuid( UUID.randomUUID( ).toString( ) );
				commandToSave.setDateTime( new GregorianCalendar( ) );
				commandToSave.setEadFlag( 1 );
				commandToSave.setState( AudCommandStates.WAITABLE );
				commandToSave.setIntCmd( intCommand );
				commandToSave.setProcInfo( procInfo );
				
				List< EdeclAudDocInfo > docInfos = new ArrayList< EdeclAudDocInfo >( );
				ctx.setDocInfos( docInfos );

				for ( EdarchDocument ed : archDocs )
				{
					EdeclAudDocInfo docInfo = new EdeclAudDocInfo( );
					docInfos.add( docInfo );
					
					docInfo.setEadArchiveId( ed.getArchive( ).getIdInternal( ) );
					docInfo.setEadDocumentId( ed.getIdInternal( ) );
					docInfo.setAudExtDocId( ed.getAudDocumentId( ) );
					docInfo.setAudExtPacketId( ed.getAudPacketId( ) );
					docInfo.setDocumentId( ed.getDocumentId( ) );
					docInfo.setDocumentModeId( ed.getDocType( ) );
					docInfo.setProcInfo( procInfo );
					docInfo.setRefDocumentId( ed.getRefDocumentId( ) );
					docInfo.setRefMainDoc( ed.getDocumentId( ) );
					docInfo.setCmdRefGuid( commandToSave.getGuid( ) );
					docInfo.setState( AudCommandStates.WAITABLE );
					
	    			EdeclAlbumDocList docList = _edeclService.getAlbumDocListRecord( ed.getDocType( ) );
		    		if ( null != docList )
		    			docInfo.setDescription( docList.getDocDescription( ) );
		    		
		    		procInfo.getAudDocInfos( ).add( docInfo );
				}
				
				if ( docInfos.size( ) > 0 )
				{
					persistAudCommandCreationContext( ctx );
					
					log.info( String.format( "Сохранили все команды и документы на отправку для внутренней команды %d", intCommand.getRecId( ) ) );
					log.info( String.format( 
						"Создали команду с идентификатором %s для отправки в АЮД " +
						"документа с идентификатором %s, номер ЭАД архива %s, код документа в ЭАД %s",
						commandToSave.getGuid( ), intCommand.getDocumentId( ), 
						archDocIds.getArchId( ), archDocIds.getArchDocId( )
					) );					
				}
			}
			
			_audService.merge( procInfo );
			
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
				for ( AudCommandCreationContext ctx : ctxs )
				{
					removeAudCommandCreationContext( ctx );
				}
					
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

	private List< EadIds > getEadIdentifiers( EdeclAudIntCommand intCommand ) 
		throws ParserConfigurationException, SAXException, IOException, XPathExpressionException
	{
		List< EadIds > eadIds = new ArrayList< EadIds >( );
		
		EdeclDocument edoc = _edeclService.getDocument( intCommand.getDocumentId( ) );
		ByteArrayInputStream bais = new ByteArrayInputStream( edoc.getBody( ) );
		
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance( );
		dbf.setNamespaceAware( true );
		
		DocumentBuilder db = dbf.newDocumentBuilder( );		
		Document xdoc = db.parse( bais );
		
		XPathFactory xpf = XPathFactory.newInstance( );
		XPath xp = xpf.newXPath( );
		XPathExpression xpe = xp.compile( "//*[local-name()='RequestedDoc']" );
		XPathExpression xpArchId = xp.compile( ".//*[local-name()='AarchID']/text()" );
		XPathExpression xpArchDocId = xp.compile( ".//*[local-name()='ArchDocID']/text()" );
		
		NodeList requestedDocs = ( NodeList )xpe.evaluate( xdoc, XPathConstants.NODESET );
		for ( int i = 0; i < requestedDocs.getLength( ); ++i )
		{
			Node requestedDoc = requestedDocs.item( i );
			if ( null == requestedDoc )
				continue;
			
			Node archId = ( Node )xpArchId.evaluate( requestedDoc, XPathConstants.NODE );
			Node archDocId = ( Node )xpArchDocId.evaluate( requestedDoc, XPathConstants.NODE );
			if ( null != archId && null != archDocId )
			{
				EadIds ids = new EadIds( );
				ids.setArchId( archId.getNodeValue( ) );
				ids.setArchDocId( archDocId.getNodeValue( ) );
				
				eadIds.add( ids );
			}
		}
		
		return eadIds;
	}		
}
