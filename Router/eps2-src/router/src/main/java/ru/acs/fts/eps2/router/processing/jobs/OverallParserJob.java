package ru.acs.fts.eps2.router.processing.jobs;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

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

import org.jibx.runtime.JiBXException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.oxm.Unmarshaller;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import ru.acs.fts.custommarshaller.EnvelopeMarshaller;
import ru.acs.fts.custommarshaller.EnvelopeUnmarshaller;
import ru.acs.fts.custommarshaller.XStringMarshallableClass;
import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.engine.configuration.Configurator;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.data.kind.CompressType;
import ru.acs.fts.eps2.engine.data.kind.DocumentModeIDs;
import ru.acs.fts.eps2.engine.error.DiscardMessageException;
import ru.acs.fts.eps2.engine.error.EmergencyBatchException;
import ru.acs.fts.eps2.engine.objects.defines.EnvelopeOrigins;
import ru.acs.fts.eps2.engine.persistence.embedded.EnvelopeManager;
import ru.acs.fts.eps2.engine.persistence.embedded.EnvelopeProcessInfo;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobBatch;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.helpers.MarshallingHelper;
import ru.acs.fts.eps2.engine.processing.system.ErrorQueueTypes;
import ru.acs.fts.eps2.model.entities.MessageLineage;
import ru.acs.fts.eps2.model.services.EnvelopeService;
import ru.acs.fts.eps2.router.objects.EDDocument;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.util.helpers.UUIDGen;
import ru.acs.fts.eps2.utils.StringUtil;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;
import ru.acs.fts.schemas.album.eps_docresponse.EPSDocResponseType;
import ru.acs.fts.schemas.album.reqopenproc.ReqOpenProcType;
import ru.acs.fts.schemas.envelope.EnvelopeType;

public class OverallParserJob extends EDJob
{
	private static final Logger log = LoggerFactory.getLogger( OverallParserJob.class );
	private static final Logger logTrace = LoggerFactory.getLogger( "ru.acs.fts.eps2.trace.TRACER" );
	private static final String ACTION = "Задача для препроцессинга входящего конверта";

	private Unmarshaller _unmarshaller;
	private EnvelopeService _envelopeService;
	private EnvelopeManager _envelopeManager;
	
	private JobBatch _unmarshallFailedJobBatch;
	
	private Map< String, String > _sendSystemMapping = new HashMap< String, String >( );

	// @formatter:off
	@Required
	public void setUnmarshaller( Unmarshaller unmarshaller ) { _unmarshaller = unmarshaller; }
	public Unmarshaller getUnmarshaller( ) { return _unmarshaller; }
	
	@Required
	public void setEnvelopeService( EnvelopeService envelopeService ) { _envelopeService = envelopeService; }
	public EnvelopeService getEnvelopeService( ) { return _envelopeService; }
	
	@Required
	public void setEnvelopeManager( EnvelopeManager envelopeManager ) { _envelopeManager = envelopeManager; }
	public EnvelopeManager getEnvelopeManager( ) { return _envelopeManager; }
	
	public void setUnmarshallFailedJobBatch( JobBatch unmarshallFailedJobBatch ) { _unmarshallFailedJobBatch = unmarshallFailedJobBatch; }
	public JobBatch getUnmarshallFailedJobBatch( ) { return _unmarshallFailedJobBatch; }
	
	@Required
	public void setSendSystemMapping( Map< String, String > sendSystemMapping ) { _sendSystemMapping = sendSystemMapping; }
	public Map< String, String > getSendSystemMapping( ) { return _sendSystemMapping; }
	// @formatter:on

	@Override
	public void edExecute( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		byte[ ] message = jobBatchContext.getMessage( );
		
		log.debug( "Десериализуем сообщение и заполняем все необходимые нам поля" );
		logTrace.trace( new String( message, "UTF-8" ) );

		EnvelopeType envelope = null;
		boolean unmarshallFailed = false;
		boolean compressed = false;

		try
		{
			EnvelopeUnmarshaller unmarshaller = new EnvelopeUnmarshaller( );
			envelope = unmarshaller.unmarshall( message, _unmarshaller );
			compressed = unmarshaller.getWasCompressed( );
		}
		catch ( Exception exc )
		{
			log.info( "У анмашраллера не получилось :(", exc );
			
			Map< String, Object > params = new HashMap< String, Object >( );
			
			envelope = unmarshallWithoutBody( message, params );
			unmarshallFailed = true;
			compressed =( Boolean )params.get( "wasCompressed" );
			
			jobBatchContext.put( ContextConstants.UNMARSHALLER_EXCEPTION, exc );
		}
				
		EDEnvelope receivedEnvelope = createReceivedEnvelope( envelope, jobBatchContext );		
		receivedEnvelope.setWasCompressed( compressed );
		
		jobBatchContext.setReceivedEnvelope( receivedEnvelope );

		checkPreviousProcessing( receivedEnvelope, jobBatchContext );
		ensureLineage( receivedEnvelope, jobBatchContext );
		
		if ( unmarshallFailed )
		{
			if ( receivedEnvelope.getMessageType( ).equals( MessageType.ADM_00010 ) )
			{
				if ( ! unmarshallEpsDocResponse( receivedEnvelope ) )
					throw new EmergencyBatchException( _unmarshallFailedJobBatch );
			}
			else
				throw new EmergencyBatchException( _unmarshallFailedJobBatch );
		}
		
		/**
		 * Немного лога для информации
		 */
		try
		{
			String logMsg = String.format(
				"Получено сообщение [%s : %s] от системы [%s]",
				receivedEnvelope.getMessageType( ),
				receivedEnvelope.getApplicationInfo( ).getSoftVersion( ),
				receivedEnvelope.getSenderSystem( )
			);
			log.info( logMsg );
		}
		catch ( Exception exc )
		{
			log.error( ":'(", exc );
		}
	}

	@Override
	public String getAction( )
	{
		return ACTION;
	}
	
	private EnvelopeType unmarshallWithoutBody( byte[ ] message, Map< String, Object > params ) 
		throws Exception
	{
		try
		{
			EnvelopeUnmarshaller unmarshaller = new EnvelopeUnmarshaller( );
			
			EnvelopeType envelope = unmarshaller.unmarshallWithoutBody( message, _unmarshaller );
			params.put( "wasCompressed", unmarshaller.getWasCompressed( ) );
			
			return envelope;
		}
		catch ( Exception exc )
		{
			log.info( "У анмаршаллера совсем не получилось :'(", exc );
			throw new DiscardMessageException( message, ErrorQueueTypes.ERROR_RECV );
		}
	}
	
	private EDEnvelope createReceivedEnvelope( 
			final EnvelopeType envelope, EDJobBatchContext jobBatchContext ) 
		throws BaseProcessingException, DatabaseException
	{
		String senderSystem = jobBatchContext.getSenderSystem( );
		
		EDEnvelope recEnv = new EDEnvelope( envelope, senderSystem );

		String sendSys = _sendSystemMapping.get( recEnv.getMessageType( ) );
		if ( ! StringUtil.isNullOrEmpty( sendSys ) )
			recEnv = new EDEnvelope( envelope, sendSys );
		
		recEnv.setSaveEnvelope( true );
		recEnv.setSaveDocument( true );
		recEnv.setCompressType( CompressType.NotCompressed );
		recEnv.setOrigin( EnvelopeOrigins.INCOME );
		
		return recEnv;
	}	

	/**
	 * Проверяем, не обрабатывали ли уже мы это сообщение и если да, то
	 * подгружаем результаты
	 * @throws BaseProcessingException 
	 * @throws DiscardMessageException 
	 */
	private void checkPreviousProcessing( final EDEnvelope envelope, EDJobBatchContext jobBatchContext ) 
		throws BaseProcessingException, DiscardMessageException
	{
		/*
		try
		{
		*/
			String incomeEnvelopeId = envelope.getEnvelopeID( );

			EnvelopeProcessInfo procInfo = 
				_envelopeManager.getProcessInfoByEnvelopeId( incomeEnvelopeId );
			
			if ( procInfo != null )
			{
				if ( procInfo.getRunningMode( ) != ProcessingConstants.ERROR_TYPE_NORMAL )
				{
					jobBatchContext.setRunningMode( procInfo.getRunningMode( ) );
					jobBatchContext.setFailScenario( procInfo.getFailScenario( ) );
					jobBatchContext.setContextException( procInfo.getPreviousException( ) );
					jobBatchContext.setInitialFailedResultCode( procInfo.getProcessingResult( ) );
				}

				procInfo.incrementProcessingCount( );
				if ( procInfo.getProcessingCount( ) > EnvelopeProcessInfo.COUNT_FOR_PROCESSING )
				{
					throw new DiscardMessageException( jobBatchContext.getMessage( ), ErrorQueueTypes.ERROR_RECV );
				}
			}
			/*
		}
		catch ( Exception e )
		{
			log.error( 
				String.format( "Ошибка сохранения во внутренню БД. некритично %s", e.getMessage( ) ), 
				e 
			);
		}
		*/		
	}	
	
	private void ensureLineage( EDEnvelope envelope, EDJobBatchContext jobBatchContext ) 
		throws DatabaseException
	{
		EnvelopeService envSrc = jobBatchContext.getServiceHolder( ).getEnvelopeService( );
		
		String initialEnvelopeId = envelope.getInitialEnvelopeID( );
		if ( ! StringUtil.isNullOrEmpty( initialEnvelopeId ) )
		{
			MessageLineage ml = envSrc.getLineage( initialEnvelopeId );
			if ( null != ml )
			{
				envelope.setLineageId( ml.getLineageId( ) );
				return ;
			}
		}
		
		String processId = envelope.getProcessID( );
		if ( ! StringUtil.isNullOrEmpty( processId ) )
		{
			MessageLineage ml = envSrc.getLineage( processId );
			if ( null != ml )
			{
				envelope.setLineageId( ml.getLineageId( ) );
				return ;
			}
		}
	}

	private boolean unmarshallEpsDocResponse( EDEnvelope receivedEnvelope )
		throws Exception
	{
		try
		{
			XStringMarshallableClass xstr = ( XStringMarshallableClass )receivedEnvelope.getDocument( ).getRawDocument( );
			
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance( );
			dbf.setNamespaceAware( true );
			
			DocumentBuilder db = dbf.newDocumentBuilder( );
			Document doc = db.parse( new ByteArrayInputStream( xstr.getByteArray( ) ) );			
			
			XPathFactory xpf = XPathFactory.newInstance( );
			XPath xp = xpf.newXPath( );
			
			XPathExpression xpe = xp.compile( "//*[local-name()='EPS_DocResponse']/*[local-name()='DocResponse']/*[local-name()='DocResponseBody']/*" );
			Node docBody = ( Node )xpe.evaluate( doc, XPathConstants.NODE );
			
			byte[ ] appliedDoc = serialize( docBody );
			XStringMarshallableClass appDoc = new XStringMarshallableClass( );
			appDoc.setByteArray( appliedDoc );
			appDoc.setEncoding( Configurator.WORKING_ENCODING );
						
			Node parent = docBody.getParentNode( );
			parent.removeChild( docBody );
			putDummy( doc, parent, db );
			
			byte[ ] message = serialize( doc );
			
			EnvelopeUnmarshaller envUnmarshaller  = new EnvelopeUnmarshaller( );
			Object docResponse = envUnmarshaller.unmarshallBaseDocOrSignature( message, _unmarshaller );
			
			EDDocument eddoc = new EDDocument( docResponse );
			EPSDocResponseType dr = eddoc.getDocumentAsClass( EPSDocResponseType.class );
			dr.getDocResponse( ).getDocResponseBody( ).setAny( appDoc );
			
			EDDocument edSubDoc = new EDDocument( appDoc );
			
			eddoc.getContainerDocuments( ).put( appDoc.getDocumentID( ), edSubDoc );
			
			receivedEnvelope.setDocument( eddoc );
			
			return true;
		}
		catch ( Exception exc )
		{
			log.debug( "Странная ошибка...", exc );
			throw exc;
		}		
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
	
	public void putDummy( Document doc, Node parent, DocumentBuilder db )
            throws IOException, SAXException, JiBXException {
		ReqOpenProcType openProc = new ReqOpenProcType( );
		openProc.setDocumentModeID( DocumentModeIDs.REQ_OPEN_PROC );
		openProc.setDocumentID( UUIDGen.getUUID( ).toString( ) );
		openProc.setDeclarant( new OrganizationType( ) );
		
		EnvelopeMarshaller envMarshaller = new EnvelopeMarshaller( );
		byte[ ] bytes = envMarshaller.marshalBaseDocOrSignature( openProc, MarshallingHelper.getSharedMarshaller( ) ).getByteArray( );
		
		Document xdoc = db.parse( new ByteArrayInputStream( bytes ) );
		parent.appendChild( doc.importNode( xdoc.getDocumentElement( ), true ) );
	}
	
}
