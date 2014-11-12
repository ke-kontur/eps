package ru.acs.fts.eps2.ws.eps.controllers;

import java.io.ByteArrayInputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.annotation.Resource;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import ru.acs.fts.eps2.ws.data.model.entities.Document;
import ru.acs.fts.eps2.ws.data.model.entities.Envelope;
import ru.acs.fts.eps2.ws.data.model.entities.RzdCommand;
import ru.acs.fts.eps2.ws.data.model.services.DocumentService;
import ru.acs.fts.eps2.ws.data.model.services.EnvelopeService;
import ru.acs.fts.eps2.ws.data.model.services.RzdCommandService;
import ru.acs.fts.eps2.ws.eps.serviceModel.responses.ErrorResponse;
import ru.acs.fts.eps2.ws.eps.serviceModel.responses.Response;

@Controller
@RequestMapping( "/rzdCommands" )
public class RzdCommandController
{
	private static final Logger log = LoggerFactory.getLogger( RzdCommandController.class );
	
	@Autowired
	@Qualifier( "envelopeService" )
	private EnvelopeService _envelopeService;
	
	@Autowired
	@Qualifier( "documentService" )
	private DocumentService _documentService;
	
	@Autowired
	@Qualifier( "rzdCommandService" )
	private RzdCommandService _rzdCommandService;
	
	/*
	@Autowired
	@Qualifier( "innNumbers" )
	*/
	@Resource( name = "innNumbers" )
	private List< String > _innNumbers;
	
	/*
	@Autowired
	@Qualifier( "decisionCodes" )
	*/
	@Resource( name = "decisionCodes" )
	private List< String > _decisionCodes;
	
	/*
	@Autowired
	@Qualifier( "transportCodeModes" )
	*/
	@Resource( name = "transportCodeModes" )
	private List< String > _transportCodeModes;
	
	@RequestMapping( value = "/reprocess", method = RequestMethod.GET )
	public @ResponseBody Response reprocessRzdCommands( )
	{
		try
		{
			Response resp = new Response( );
			Calendar date = new GregorianCalendar( 2013, 10, 1, 0, 0, 0 );
			List< String > envelopeIds = _envelopeService.getCmn11033IdsWithoutRzdCommand( date );

			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance( );
			dbf.setNamespaceAware( true );
			DocumentBuilder db = dbf.newDocumentBuilder( );
			
			XPathFactory xpf = XPathFactory.newInstance( );
			XPath xp = xpf.newXPath( );
			XPathExpression xpeInn = xp.compile( "//*[local-name()='ESADout_CU']/*[local-name()='ESADout_CUGoodsShipment']/*[local-name()='ESADout_CUConsignor']/*[local-name()='RFOrganizationFeatures']/*[local-name()='INN']" );
			XPathExpression xpeDecisionCode = xp.compile( "//*[local-name()='GTDOutCustomsMark']/*[local-name()='GTDOutResolution']/*[local-name()='DecisionCode']" );
			XPathExpression xpeDecisionCode2 = xp.compile( "//*[local-name()='GTDOutCustomsMark']/*[local-name()='GTDOutGoodsResolution']/*[local-name()='DecisionCode']" );
			XPathExpression xpeTransportModeCode = xp.compile( "//*[local-name()='ESADout_CU']/*[local-name()='ESADout_CUGoodsShipment']/*[local-name()='ESADout_CUConsigment']/*[local-name()='ESADout_CUBorderTransport']/*[local-name()='TransportModeCode']" );
			XPathExpression xpeEsadDocumentId = xp.compile( "//*[local-name()='ESADout_CU']/*[local-name()='DocumentID']" );
			
			for ( String envelopeId : envelopeIds )
			{
				Envelope envelope = _envelopeService.findById( envelopeId );
				if ( null != envelope )
				{
					Document document = _documentService.findById( envelope.getDocumentId( ) );
					if ( null != document )
					{
						org.w3c.dom.Document domBody = db.parse( new ByteArrayInputStream( document.getBody( ) ) );
						
						if ( checkXPath( domBody, xpeInn, _innNumbers, false, -1 ) && ( checkXPath( domBody, xpeDecisionCode, _decisionCodes, false, -1 ) 
										|| ( checkXPath( domBody, xpeDecisionCode, null, false, 2 ) && checkXPath( domBody, xpeDecisionCode2, _decisionCodes, true, -1 ) ) ) 
										&& checkXPath( domBody, xpeTransportModeCode, _transportCodeModes, false, -1 ) )
						{
							log.info( "Конверт {} прошел проверку!", envelopeId );
							Node esadDocumentIdNode = ( Node )xpeEsadDocumentId.evaluate( domBody, XPathConstants.NODE );
							
							String esadDocumentId = null;
							
							if ( null != esadDocumentIdNode )
							{
								esadDocumentId = esadDocumentIdNode.getTextContent( );
							}
							
							RzdCommand cmd = new RzdCommand( );
							cmd.setEnvelopeId( envelopeId );
							cmd.setDocumentId( document.getDocumentId( ) );
							cmd.setProcessId( envelope.getProcessId( ) );
							cmd.setParticipantId( envelope.getParticipantId( ) );
							cmd.setCustomsCode( String.valueOf( envelope.getSenderCustomsCode( ) ) );
							cmd.setSoftVersion( envelope.getSoftVersion( ) );
							cmd.setEsadId( esadDocumentId );
							cmd.setStatus( "Waitable" );
							
							_rzdCommandService.persistRzdCommand( cmd );
						}
						else
						{
							log.info( "Конверт {} провалил проверку", envelopeId );
						}
					}
				}
			}
			
			log.info( "Поиск конвертов завершен. Результат: УСПЕХ." );
			
			return resp;
		}
		catch ( Exception exc )
		{
			ErrorResponse response = new ErrorResponse( );
			response.setStatus( "fail" );
			response.setMessage( exc.getMessage( ) );
			
			log.info( "Поиск конвертов завершен. Результат: ОШИБКА." );
			
			return response;
		}
	}
	
	private boolean checkXPath( org.w3c.dom.Document document, XPathExpression expression, List< String > values, boolean checkOne, int length ) 
	{
		boolean result = false;
		try
		{
			NodeList nodes = ( NodeList )expression.evaluate( document, XPathConstants.NODESET );
			if ( null != nodes )
			{
				int size = nodes.getLength( );
				for ( int index = 0; index < size; index++ )
				{
					Node node = nodes.item( index );
					String nodeValue = node.getTextContent( );
					if ( null != nodeValue && ( length >= 0 ? nodeValue.length( ) == length : values.contains( nodeValue ) ) )
					{
						result = true;
						if ( checkOne )
							break;
					}
					else
						if ( ! checkOne )
						{
							result = false;
							break;
						}
				}
			}
		}
		catch ( XPathExpressionException ex )
		{
			log.info( "Ошибка при обработке XPathQuery = {}", ex.getMessage( ) );
//			result = false;
		}
		
		return result;
	}
}
