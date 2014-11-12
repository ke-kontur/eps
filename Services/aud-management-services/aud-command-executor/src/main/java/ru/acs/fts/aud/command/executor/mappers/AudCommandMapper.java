package ru.acs.fts.aud.command.executor.mappers;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import ru.acs.fts.aud.management.model.entities.EdarchDocument;
import ru.acs.fts.aud.management.model.entities.EdeclAudCommand;
import ru.acs.fts.aud.management.model.entities.EdeclAudDocInfo;
import ru.acs.fts.aud.management.model.entities.EdeclAudProcInfo;
import ru.acs.fts.aud.management.model.entities.EdeclDocument;
import ru.acs.fts.aud.management.model.entities.EdeclProcInformation;
import ru.acs.fts.aud.management.model.services.AudService;
import ru.acs.fts.aud.management.model.services.EdarchService;
import ru.acs.fts.aud.management.model.services.EdeclService;
import ru.acs.fts.aud.management.utils.shared.Base64Coder;
import ru.acs.fts.aud.management.utils.shared.StringUtils;
import ru.acs.fts.aud.rest.service.model.objects.AudCommand;
import ru.acs.fts.aud.rest.service.model.objects.AudProcInfo;
import ru.acs.fts.aud.rest.service.model.objects.DocInfo;

public class AudCommandMapper
{
	private static final Logger log = LoggerFactory.getLogger( AudCommandMapper.class );
	
	private AudService _audService;
	private EdarchService _edarchService;
	private EdeclService _edeclService;
	
	// @formatter:off
	@Required public void setAudService( AudService audService ) { _audService = audService; }
	public AudService getAudService( ) { return _audService; }
	
	@Required public void setEdarchService( EdarchService edarchService ) { _edarchService = edarchService; }
	public EdarchService getEdarchService( ) { return _edarchService; }
	
	@Required public void setEdeclService( EdeclService edeclService ) { _edeclService = edeclService; }
	public EdeclService getEdeclService( ) { return _edeclService; }
	// @formatter:on
	
	public AudCommand mapEdeclAudCommand( EdeclAudCommand edeclAudCommand, List< EdeclAudDocInfo > edeclAudDocInfos ) 
		throws UnsupportedEncodingException
	{
		AudCommand audCommand = new AudCommand( );
		
		audCommand.setRecId( edeclAudCommand.getRecId( ) );
		audCommand.setDateTime( new DateTime( edeclAudCommand.getDateTime( ) ) );
		audCommand.setState( edeclAudCommand.getState( ) );
		audCommand.setErrCode( edeclAudCommand.getErrCode( ) );
		audCommand.setErrDescription( edeclAudCommand.getErrDescription( ) );
		audCommand.setEadFlag( edeclAudCommand.getEadFlag( ) );
		audCommand.setIntCmd( edeclAudCommand.getIntCmd( ).getRecId( ) );
		audCommand.setGuid( edeclAudCommand.getGuid( ) );
		audCommand.setEnvelopeId( edeclAudCommand.getEnvelopeId( ) );
		
		audCommand.setProcInfo( mapEdeclAudProcInfo( edeclAudCommand.getProcInfo( ) ) );
		audCommand.setDocInfos( mapEdeclAudDocInfos( edeclAudCommand, edeclAudDocInfos ) );
		
		audCommand.setSoftVersion( mapEdeclSoftVersion( edeclAudCommand ) );

		return audCommand;
	}
	
	public AudProcInfo mapEdeclAudProcInfo( EdeclAudProcInfo edeclAudProcInfo )
	{
		AudProcInfo audProcInfo = new AudProcInfo( );
		
		audProcInfo.setProcessId( edeclAudProcInfo.getProcessId( ) );
		audProcInfo.setGtdCustomsCode( edeclAudProcInfo.getGtdCustomsCode( ) );
		audProcInfo.setGtdRegistrationDate( new DateTime( edeclAudProcInfo.getGtdRegistrationDate( ) ) );
		
		audProcInfo.setGtdNumber( edeclAudProcInfo.getGtdNumber( ) );
		if ( null != edeclAudProcInfo.getGtdNumber( ) && edeclAudProcInfo.getGtdNumber( ).startsWith( "ОБ" ) )
			audProcInfo.setGtdNumber( edeclAudProcInfo.getGtdNumber( ).substring( 2 ) );
		
		audProcInfo.setPacketId( edeclAudProcInfo.getPacketId( ) );
		audProcInfo.setPkCreateDateTime( new DateTime( edeclAudProcInfo.getPkCreateDateTime( ) ) );
		audProcInfo.setPkChangeDateTime( new DateTime( edeclAudProcInfo.getPkChangeDateTime( ) ) );
		
		return audProcInfo;
	}
	
	public List< DocInfo > mapEdeclAudDocInfos( EdeclAudCommand edeclAudCommand, List< EdeclAudDocInfo > edeclAudDocInfos_ ) 
		throws UnsupportedEncodingException
	{
		List< DocInfo > docInfos = new ArrayList< DocInfo >( );
		
		List< EdeclAudDocInfo > edeclAudDocInfos = _audService.getDocInfosByAudCommand( edeclAudCommand.getGuid( ) );
		int docsCount = edeclAudDocInfos.size( );
		
		edeclAudDocInfos_.addAll( edeclAudDocInfos );
		
		for ( EdeclAudDocInfo edeclAudDocInfo : edeclAudDocInfos )
		{
			DocInfo docInfo = mapEdeclAudDocInfo( edeclAudDocInfo, docsCount );
			if ( null != docInfo )
				docInfos.add( docInfo );
		}
		
		return docInfos;
	}
	
	private DocInfo mapEdeclAudDocInfo( EdeclAudDocInfo edeclAudDocInfo, int docsCount ) 
		throws UnsupportedEncodingException
	{
		DocInfo docInfo = new DocInfo( );
		
		docInfo.setDocumentId( edeclAudDocInfo.getDocumentId( ) );
		docInfo.setRefMainDoc( edeclAudDocInfo.getRefMainDoc( ) );
		docInfo.setRefDocumentId( edeclAudDocInfo.getRefDocumentId( ) );
		docInfo.setDocumentModeId( edeclAudDocInfo.getDocumentModeId( ) );
		docInfo.setArchDocId( edeclAudDocInfo.getArchDocId( ) );
		docInfo.setPutDateTime( new DateTime( edeclAudDocInfo.getPutDateTime( ) ) );
		docInfo.setState( edeclAudDocInfo.getState( ) );
		docInfo.setEadDocumentId( edeclAudDocInfo.getEadDocumentId( ) );
		docInfo.setEadArchiveId( edeclAudDocInfo.getEadArchiveId( ) );
		docInfo.setDescription( edeclAudDocInfo.getDescription( ) );
		docInfo.setAudExtPacketId( edeclAudDocInfo.getAudExtPacketId( ) );
		docInfo.setAudExtDocId( edeclAudDocInfo.getAudExtDocId( ) );
		docInfo.setProcessId( edeclAudDocInfo.getProcInfo( ).getProcessId( ) );
		docInfo.setNeedPrevVersion( edeclAudDocInfo.getNeedPrevVersion( ) );
		docInfo.setPrevVersion( edeclAudDocInfo.getPrevVersion( ) );
		docInfo.setVersion( edeclAudDocInfo.getVersion( ) );
		docInfo.setErrorCode( edeclAudDocInfo.getErrorCode( ) );
		docInfo.setErrorDescription( edeclAudDocInfo.getErrorDescription( ) );

		EdeclDocument document = _edeclService.getDocument( edeclAudDocInfo.getDocumentId( ) );	
		
		byte[ ] docBody = ensureDocumentBody( document );
		
		docInfo.setDocumentBody( Base64Coder.encodeAsString( docBody, "UTF-8" ) );

		if (   StringUtils.isNullOrEmpty( docInfo.getAudExtDocId( ) ) &&
			   StringUtils.isNullOrEmpty( docInfo.getAudExtPacketId( ) ) &&
			 ! StringUtils.isNullOrEmpty( docInfo.getEadArchiveId( ) ) &&
			 ! StringUtils.isNullOrEmpty( docInfo.getEadDocumentId( ) ) )
		{
			List< EdarchDocument > documents = _edarchService.getDocuments( docInfo.getEadArchiveId( ), docInfo.getEadDocumentId( ) );
			if ( documents.size( ) > 0 )
			{
				EdarchDocument archDocument = documents.get( 0 );
				docInfo.setDocumentBody( Base64Coder.encodeAsString( archDocument.getDsData( ), "UTF-8" ) );
			}
		}		
		
		return docInfo;
	}
	
	private String mapEdeclSoftVersion( EdeclAudCommand edeclAudCommand )
	{
		EdeclProcInformation procInfo = _edeclService.getProcInformation( edeclAudCommand.getProcInfo( ).getProcessId( ) );
		if ( null == procInfo )
			return "0.0.0/0.0.0";
		
		return procInfo.getSoftVersion( );
	}
	
	private byte[ ] ensureDocumentBody( EdeclDocument doc )
	{
		byte[ ] body = doc.getBody( );
		
		try
		{
			if ( null != body && 0 != body.length )
			{
				String bodyStr = new String( body, "UTF-8" );
				if ( null != bodyStr && 0 != bodyStr.length( ) && ! "nullx".equals( bodyStr ) && ! "null".equals( bodyStr ) )
					return body;
			}
		}
		catch ( Exception exc )
		{
			
		}
		
		// Упс. Документ не содержит body
		
		// Попытаемся спросить у его родителя
		
		if ( null == doc.getRefMainDoc( ) || 0 == doc.getRefMainDoc( ).length( ) )
			return null; // Увы, родителя нет - тут ахтунг какой-то
		
		EdeclDocument maindoc = _edeclService.getDocument( doc.getRefMainDoc( ) );
		if ( null == maindoc )
			return null; // Увы, родителя нет - тут ахтунг какой-то
		
		body = maindoc.getBody( );
		if ( null == body || 0 == body.length )
			return null; // Увы, у родителя нет тела тоже - тут ахтунг какой-то

		try
		{
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance( );
			dbf.setNamespaceAware( true );
			
			DocumentBuilder db = dbf.newDocumentBuilder( );
			Document xmldoc = db.parse( new ByteArrayInputStream( body ) );
			
			XPathFactory xpf = XPathFactory.newInstance( );
			XPath xp = xpf.newXPath( );

			/*
			XPathExpression edcnt = xp.compile( "//*[local-name()='ED_Container']/*[local-name()='ContainerDoc']/*[local-name()='DocBody']" );
			XPathExpression archaddrq = xp.compile( "//*[local-name()='ArchAddDocRequest']/*[local-name()='ArchDoc']" );
			XPathExpression archupd = xp.compile( "//*[local-name()='ArchDocUpdate']/*[local-name()='ArchDoc']" );
			XPathExpression docresp = xp.compile( "//*[local-name()='EPS_DocResponse']/*[local-name()='DocResponse']/*[local-name()='DocResponseBody']" );
			*/
			
			XPathExpression edcnt = xp.compile( "//*[local-name()='ED_Container']" );
			Node edCnt = ( Node )edcnt.evaluate( xmldoc, XPathConstants.NODE );
			if ( null != edCnt )
			{
				XPathExpression docs = xp.compile( "//*[local-name()='ED_Container']/*[local-name()='ContainerDoc']/*[local-name()='DocBody']/*" );
				XPathExpression docid = xp.compile( ".//*[local-name()='DocumentID']/text()" );
				NodeList nodes = ( NodeList )docs.evaluate( xmldoc, XPathConstants.NODESET );
				for ( int i = 0; i < nodes.getLength( ); ++i )
				{
					Node node = nodes.item( i );
					String docId = ( String )docid.evaluate( node, XPathConstants.STRING );
					if ( docId.equals( doc.getDocumentId( ) ) )
					{
						Document rdoc = db.newDocument( );
						rdoc.appendChild( rdoc.importNode( node, true ) );
						return serialize( rdoc );
					}
				}
			}
			else
			{
				XPathExpression docresp = xp.compile( "//*[local-name()='EPS_DocResponse']" );
				Node docResp = ( Node )docresp.evaluate( xmldoc, XPathConstants.NODE );
				if ( null != docResp )
				{
					XPathExpression subdoc = xp.compile( "//*[local-name()='EPS_DocResponse']/*[local-name()='DocResponse']/*[local-name()='DocResponseBody']/*" );
					Node subDoc = ( Node )subdoc.evaluate( xmldoc, XPathConstants.NODE );
					if ( null != subDoc )
					{
						Document rdoc = db.newDocument( );
						rdoc.appendChild( rdoc.importNode( subDoc, true ) );
						return serialize( rdoc );
					}
				}
				else
				{
					XPathExpression archadd = xp.compile( "//*[local-name()='ArchAddDocRequest']" );
					Node archAdd = ( Node )archadd.evaluate( xmldoc, XPathConstants.NODE );
					if ( null != archAdd )
					{
						XPathExpression subdoc = xp.compile( "//*[local-name()='ArchAddDocRequest']/*[local-name()='ArchDoc']/*" );
						Node subDoc = ( Node )subdoc.evaluate( xmldoc, XPathConstants.NODE );
						if ( null != subDoc )
						{
							Document rdoc = db.newDocument( );
							rdoc.appendChild( rdoc.importNode( subDoc, true ) );
							return serialize( rdoc );
						}
					}
					else
					{
						XPathExpression archupd = xp.compile( "//*[local-name()='ArchDocUpdate']" );
						Node archUpd = ( Node )archupd.evaluate( xmldoc, XPathConstants.NODE );
						if ( null != archUpd )
						{
							XPathExpression subdoc = xp.compile( "//*[local-name()='ArchDocUpdate']/*[local-name()='ArchDoc']/*" );
							Node subDoc = ( Node )subdoc.evaluate( xmldoc, XPathConstants.NODE );
							if ( null != subDoc )
							{
								Document rdoc = db.newDocument( );
								rdoc.appendChild( rdoc.importNode( subDoc, true ) );
								return serialize( rdoc );
							}
						}
					}
				}
			}
		}
		catch ( Exception exc )
		{
			return null;
		}
		
		// Увы, мы не смогли найти тело документа
		return null;
	}
	
	private byte[ ] serialize( Node node ) 
		throws TransformerException
	{
		ByteArrayOutputStream baos = new ByteArrayOutputStream( );
		try 
		{
			Transformer t = TransformerFactory.newInstance( ).newTransformer( );
			t.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "yes" );
			t.setOutputProperty( OutputKeys.INDENT, "no" );
			t.transform( new DOMSource( node ), new StreamResult( baos ) );
		} 
		catch ( TransformerException te ) 
		{
			log.error( "Ошибка трансформации", te );
			throw te;
		}
		
		return baos.toByteArray( );
	}		
			
}
