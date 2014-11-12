package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.io.ByteArrayInputStream;
import java.io.StringWriter;
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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import ru.acs.fts.custommarshaller.XStringMarshallableClass;
import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.configuration.Configurator;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.objects.EDDocument;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.objects.defines.DocumentSaveTypes;
import ru.acs.fts.eps2.router.objects.defines.DocumentUniquenesses;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.utils.StringUtil;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.reqesadinfo.ReqESADInfoType;

/**
 * Бизнес процесс обработки сообщения CMN.00307
 */
public class MessageCMN00307BusinessProcess extends BusinessProcess
{
	protected final Logger log = LoggerFactory.getLogger( MessageCMN00307BusinessProcess.class );

	private DocumentBuilderFactory documentBuilderFactory = null;
	private XPathFactory xPathFactory = null;

	private static String customsProcedureType = "ЭК";
	private static List< String > decisionCodes = null;
	
	public MessageCMN00307BusinessProcess( )
	{
		decisionCodes = new ArrayList< String >( );
		decisionCodes.add( "10" );
		decisionCodes.add( "11" );
		decisionCodes.add( "20" );
		decisionCodes.add( "**" );
	}

	private static byte[ ] getDocumentFromNode( Node node ) 
		throws TransformerException
	{
		if ( node == null )
			return null;
		
		StringWriter sw = new StringWriter( );
		Transformer t = TransformerFactory.newInstance( ).newTransformer( );
		t.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "yes" );
		t.transform( new DOMSource( node ), new StreamResult( sw ) );
		
		try
		{
			return sw.toString( ).getBytes( "UTF-8" );
		}
		catch ( UnsupportedEncodingException e )
		{
			return null;
		}
	}

	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		ReqESADInfoType document = recvEnv.getDocument( ).getDocumentAsClass( ReqESADInfoType.class );
				
		Edecl_Proc_Information procInformation = null;
		String gtdInfoString = null;
		
		{
			GTDIDType gtd = document.getGTDID( ); 
			procInformation = _serviceHolder.getProcedureService( ).getProcessIdByGtdNumber( 
				gtd.getGTDNumber( ), 
				gtd.getCustomsCode( ), 
				gtd.getRegistrationDate( ).toDate( ) 
			);
			
			gtdInfoString = String.format(
				"CustomCode = %s, RegistrationDate = %s, Number = %s",
				gtd.getCustomsCode( ), 
				gtd.getRegistrationDate( ).toString( ),
				gtd.getGTDNumber( ) 
			);
		}
		
		if ( procInformation == null )
		{
			String errorString = String.format(
				"Не найден идентификатор процедуры, в котором была выпущена декларация: %s",
				gtdInfoString
			);
			
			log.error( errorString );
			throwRequestedDtNotFound( jobBatchContext );
		}
		
		jobBatchContext.put( ContextConstants.ANSWER_SOFT_VERSION, procInformation.getSoftVersion( ) );		
		
		String containerId = null;
		{
			containerId = 
				_serviceHolder.getEnvelopeService( ).getDocumentIdByProcessIdForCMN00307( procInformation.getProcessId( ) );

			if ( StringUtil.isNullOrEmpty( containerId ) )
			{
				String errorString = String.format(
					"Не найден документ для ДТ с идентификаторами: %s",
					gtdInfoString
				);
				
				log.error( errorString );
				throwRequestedDtNotFound( jobBatchContext );
			}
		}
		
		byte[ ] containerMainDocument = null;
		{
			Edecl_Msg_Doc xdoc = _serviceHolder.getEnvelopeService( ).getDocument( containerId );
			if ( null == xdoc )
			{
				String errorString = String.format(
					"В базе данных отсутствует документ для ДТ с идентификатором: %s",
					containerId
				);
				
				log.error( errorString );
				throwRequestedDtNotFound( jobBatchContext );
			}
			
			containerMainDocument = xdoc.getBody( );
			if ( containerMainDocument == null )
			{
				String errorString = String.format(
					"Не удалось считать документы для ДТ с идентификаторами: %s",
					gtdInfoString
				);
				
				log.error( errorString );
				throwRequestedDtNotFound( jobBatchContext );
			}
		}
		
		if ( documentBuilderFactory == null )
		{
			documentBuilderFactory = DocumentBuilderFactory.newInstance( );
			
			/** never forget this! */
			documentBuilderFactory.setNamespaceAware( true ); 
		}
		
		DocumentBuilder builder = documentBuilderFactory.newDocumentBuilder( );
		Document domDoc = builder.parse( new ByteArrayInputStream( containerMainDocument ) );
		if ( xPathFactory == null )
			xPathFactory = XPathFactory.newInstance( );
		
		XPath xpath = xPathFactory.newXPath( );
		XPathExpression xpathResult = xpath.compile( 
			"//*[local-name()='GTDOutCustomsMark']/*[local-name()='GTDOutResolution']/*[local-name()='DecisionCode']/text()" 
		);
		
		String result = ( String )xpathResult.evaluate( domDoc, XPathConstants.STRING );
		if ( StringUtil.isNullOrEmpty( result ) )
		{
			String errorString = String.format(
				"Не удалось извлечь значение DecisionCode для ДТ с идентификаторами: %s",
				gtdInfoString
			);
			
			log.error( errorString );
			throwRequestedDtNotFound( jobBatchContext );
		}
		
		if ( ! decisionCodes.contains( result ) )
		{
			String errorString = String.format(
				"Запрещенное значение DecisionCode для ДТ с идентификаторами: [%s] = %s",
				gtdInfoString, result 
			);
			
			log.error( errorString );
			throwRequestedDtNotFound( jobBatchContext );
		}
		
		xpathResult = xpath.compile( "//*[local-name()='ESADout_CU']" );
		Node nodeWithESADout_CU = ( Node )xpathResult.evaluate( domDoc, XPathConstants.NODE );
		if ( nodeWithESADout_CU == null )
		{
			String errorString = String.format(
				"Не удалось извлечь документ ESADout_CU для ДТ с идентификаторами: %s",
				gtdInfoString
			);
			
			log.error( errorString );
			throwRequestedDtNotFound( jobBatchContext );
		}
		
		xpathResult = xpath.compile( "//*[local-name()='CustomsProcedure']/text()" );
		result = ( String )xpathResult.evaluate( nodeWithESADout_CU, XPathConstants.STRING );
		if ( StringUtil.isNullOrEmpty( result ) || ! result.equals( customsProcedureType ) )
		{
			String errorString = String.format(
				"Запрещенное значение CustomsProcedure для ДТ с идентификаторами: [%s] = %s",
				gtdInfoString, result 
			);
			
			log.error( errorString );
			throwRequestedDtNotFound( jobBatchContext );
		}
		
		boolean signituredDocumentFound = false;
		byte[ ] esadOutDocument = null;
		
		Node parentNode = nodeWithESADout_CU.getParentNode( );
		if ( parentNode != null )
		{
			parentNode = parentNode.getParentNode( );
			if ( parentNode != null && parentNode.getLocalName( ).equals( "Signature" ) )
			{
				esadOutDocument = getDocumentFromNode( parentNode );
				signituredDocumentFound = true;
				
				log.info( "Получены бинарные данные ДТ" );
			}
		}
		if ( ! signituredDocumentFound || esadOutDocument == null || esadOutDocument.length == 0 )
		{
			String errorString = String.format(
				"Не удалось получить содержимое документа ESADout_CU для ДТ с идентификаторами: %s",
				gtdInfoString
			);
			
			log.error( errorString );
			throwRequestedDtNotFound( jobBatchContext );
		}
		
		XStringMarshallableClass xOutObj = new XStringMarshallableClass( );
		xOutObj.setByteArray( esadOutDocument );
		xOutObj.setEncoding( Configurator.WORKING_ENCODING );

		EDDocument doc = new EDDocument( xOutObj );
		doc.setSaveBody( true );
		doc.setSaveType( DocumentSaveTypes.INSERT );
		doc.setUniqueness( DocumentUniquenesses.NOT_UNIQ );

		jobBatchContext.put( jobContext.getString( ContextConstants.DOCUMENT_NAME ), doc );

	}
	
	private void throwRequestedDtNotFound( EDJobBatchContext jobBatchContext )
		throws BaseProcessingException, DatabaseException
	{
		ErrorHelper.throwException(
			jobBatchContext, ResultCodes._03_00105_01, 
			ProcessingConstants.ERROR_TYPE_BUSINESS 
		);
	}
}
