package ru.acs.fts.aly.router.processing.jobs;

import java.io.ByteArrayInputStream;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;

import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import ru.acs.fts.aly.model.entities.AlyEsadRepl;
import ru.acs.fts.aly.model.services.DiffService;
import ru.acs.fts.aly.router.objects.AlyEnvelope;
import ru.acs.fts.aly.router.processing.AlyJobBatchContext;
import ru.acs.fts.aly.router.processing.helpers.ErrorHelper;
import ru.acs.fts.eps2.engine.data.kind.DocumentModeIDs;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
import ru.acs.fts.eps2.utils.StringUtil;

public class NotifGTDRegistrationJob extends AlyJob
{
	private static final Logger log = LoggerFactory.getLogger( NotifGTDRegistrationJob.class );
	
	@Override
	public void alyExecute( AlyJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		AlyEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );	
		
		Element ngtdreg = getNotifGTDRegistration( recvEnv, jobBatchContext );
		String gtdId = getGtdId( ngtdreg );
		if ( null == gtdId || gtdId.isEmpty( ) )
			ErrorHelper.throwBasicException( "Не удалось выяснить GTDID из документа" );
		
		String refDocumentId = recvEnv.getDocument( ).getRefDocumentID( );
		if ( null == refDocumentId || refDocumentId.isEmpty( ) )
		{
			/**
			 * У данного уведомления нет RefDocumentID, что странно.
			 * Такого быть не должно. Обрабатывать дальше нет смысла, поэтому прерываемся.
			 */
			log.info( String.format(
				"EnvelopeID: %s, Для NotifGTDRegistration не найден ссылочный идентификатор, сохранение информации невозможно",
				jobBatchContext.getReceivedEnvelope( ).getEnvelopeID( )
			) );
			return ;
		}
		
		List< Edecl_Msg_Doc > cdocs = jobBatchContext.getServiceHolder( ).getEnvelopeService( )
			.getContainerDocuments( refDocumentId );
		String esadId = null;
		String refEsadId = null;
		for ( Edecl_Msg_Doc cdoc : cdocs )
		{
			if ( ! cdoc.getDocumentModeId( ).equals( DocumentModeIDs.ESAD_OUT_CU ) )
				continue;
			
			esadId = cdoc.getDocumentID( );
			refEsadId = cdoc.getRefDocumentId( );
		}
		
		/*
		MessageService msgSrv = jobBatchContext.getServiceHolder( ).getMessageService( );
		List< AlyXmlData > refDocument = msgSrv.getDocumentIndirect( refDocumentId );
		if ( null == refDocument || refDocument.isEmpty( ) )
			ErrorHelper.throwBasicException( "В базе данных не найдено XML представление для ссылочного документа" );
		
		XmlTree xmlt = _xmlRestore.restoreImpl( refDocument );
		xmlt = xmlt.traverseTo( "ESADout_CU" );
		
		XmlTree tDocId = xmlt.traverseTo( "DocumentID" );
		XmlTree tRefDocId = xmlt.traverseTo( "RefDocumentID" );
		*/
		
		DiffService diffSrv = jobBatchContext.getServiceHolder( ).getDiffService( );
		if ( ! StringUtil.isNullOrEmpty( esadId ) )
		{
			AlyEsadRepl repl = diffSrv.getRepl( esadId );
			if ( null != repl )
			{
				repl.setGtdId( gtdId );
				diffSrv.merge( repl );

				AlyEsadRepl r = repl;
				while ( ( r = diffSrv.getRepl( r.getRefEsadId( ) ) ) != null )
				{
					r.setGtdId( gtdId );
					diffSrv.merge( r );
				}
				
				r = repl;
				while ( ( r = diffSrv.getReplByRef( r.getEsadId( ) ) ) != null )
				{
					r.setGtdId( gtdId );
					diffSrv.merge( r );
				}
			}
		}
		
		if ( ! StringUtil.isNullOrEmpty( refEsadId ) )
		{
			AlyEsadRepl repl = diffSrv.getRepl( refEsadId );
			if ( null != repl )
			{
				repl.setGtdId( gtdId );
				diffSrv.merge( repl );

				AlyEsadRepl r = repl;
				while ( ( r = diffSrv.getRepl( r.getRefEsadId( ) ) ) != null )
				{
					r.setGtdId( gtdId );
					diffSrv.merge( r );
				}
				
				r = repl;
				while ( ( r = diffSrv.getReplByRef( r.getEsadId( ) ) ) != null )
				{
					r.setGtdId( gtdId );
					diffSrv.merge( r );
				}
			}
		}
	}

	@Override
	public String getAction( )
	{
		return "Задача сохранения уведомления о регистрации ДТ";
	}

	private Element getNotifGTDRegistration( AlyEnvelope recvEnv, AlyJobBatchContext jobBatchContext )
		throws Exception
	{
		Edecl_Msg_Doc dbdoc = jobBatchContext.getServiceHolder( ).getEnvelopeService( )
			.getDocument( recvEnv.getDocument( ).getDocumentID( ) );
		if ( null == dbdoc )
			return null;
		
		DocumentBuilder db = getDbf( ).newDocumentBuilder( );
		Document doc = db.parse( new ByteArrayInputStream( dbdoc.getBody( ) ) );
		
		XPath xp = getXpf( ).newXPath( );
		XPathExpression xpe = xp.compile( "//*[local-name()='NotifGTDRegistration']" );
		
		Node esadoutcu = ( Node )xpe.evaluate( doc, XPathConstants.NODE );
		if ( null == esadoutcu || ! ( esadoutcu instanceof Element ) )
			ErrorHelper.throwBasicException( "Не найден NotifGTDRegistration" );
		
		return ( Element )esadoutcu;
	}

	private String getGtdId( Element ngtdreg )
		throws Exception
	{
		XPath xp = getXpf( ).newXPath( );
		XPathExpression xpe = xp.compile( ".//*[local-name()='GTDID']" );
		Node n = ( Node )xpe.evaluate( ngtdreg, XPathConstants.NODE );
		if ( null == n || ! ( n instanceof Element ) )
			return null;
		
		Element el = ( Element )n;
		
		String customsCode = null;
		String registrationDate = null;
		String regNumber = null;
		
		for ( Node child = el.getFirstChild( ); child != null; child = child.getNextSibling( ) )
		{
			if ( ! ( child instanceof Element ) )
				continue;
			
			Element elchild = ( Element )child;
			if ( elchild.getLocalName( ).equals( "CustomsCode" ) )
				customsCode = elchild.getTextContent( );
			else if ( elchild.getLocalName( ).equals( "RegistrationDate" ) )
				registrationDate = elchild.getTextContent( );
			else if ( elchild.getLocalName( ).equals( "GTDNumber" ) )
				regNumber = elchild.getTextContent( );
		}
		
		if ( null != customsCode && null != registrationDate && null != regNumber &&
			 ! customsCode.isEmpty( ) && ! registrationDate.isEmpty( ) && ! regNumber.isEmpty( ) )
		{
			return String.format(
				"%s/%s/%s",
				customsCode,
				new DateTime( registrationDate ).toString( "ddMMyy" ),
				regNumber
			);
		}
		
		return null;
	}	
}
