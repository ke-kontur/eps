package ru.acs.fts.aly.router.processing.jobs;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import ru.acs.fts.aly.model.entities.AlyEsadDiff;
import ru.acs.fts.aly.model.entities.AlyEsadRepl;
import ru.acs.fts.aly.model.entities.AlyXmlData;
import ru.acs.fts.aly.model.services.DiffService;
import ru.acs.fts.aly.model.services.MessageService;
import ru.acs.fts.aly.model.supplementary.XmlRestore;
import ru.acs.fts.aly.model.supplementary.XmlTree;
import ru.acs.fts.aly.router.objects.AlyEnvelope;
import ru.acs.fts.aly.router.processing.AlyJobBatchContext;
import ru.acs.fts.aly.router.processing.helpers.DocumentComparator;
import ru.acs.fts.aly.router.processing.helpers.ErrorHelper;
import ru.acs.fts.aly.router.processing.supplementary.esad.comparison.DocComparisonItem;
import ru.acs.fts.custommarshaller.XStringMarshallableClass;
import ru.acs.fts.eps2.engine.data.kind.DocumentModeIDs;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
import ru.acs.fts.eps2.model.services.EnvelopeService;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.utils.StringUtil;

public class EsadComparisonJob extends AlyJob
{
	private static final Logger log = LoggerFactory.getLogger( EsadComparisonJob.class );
	
	@Override
	public void alyExecute( AlyJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		AlyEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		String softVersion = recvEnv.getSoftVersion( );
		
		// Шаг 1: Получение ESADout_CU из текущего конверта (ok)
		Element cEsadOutCu = getCurrentEsadOut( jobBatchContext );
		
		String documentId = getDocumentID( cEsadOutCu );
		if ( null == documentId || documentId.isEmpty( ) )
			ErrorHelper.throwBasicException( "ESADout_CU не содержит DocumentID" );
		
		DiffService diffSrv = jobBatchContext.getServiceHolder( ).getDiffService( );
		
		AlyEsadRepl erepl = diffSrv.getRepl( documentId );
		if ( null != erepl )
		{
			log.info( String.format(
				"Сравнение для такой декларации %s уже есть в базе, игнорируем",
				documentId 
			) );
			
			return ;
		}

		// Шаг 2: Получение ESADout_CU из ссылочного конверта, который разложен в базе
		Element cRefEsadOutCu = getRefEsadOut( jobBatchContext );
		
		String refDocumentId = getDocumentID( cRefEsadOutCu );
		if ( null == refDocumentId || refDocumentId.isEmpty( ) )
		{
			/**
			 * У данной декларации нет ссылочного идентификатора, что может означать две вещи:
			 * либо это первоначальный документ, тогда вопрос зачем мы его обрабатываем, либо
			 * это ошибка и RefDocumentID забыли, но это дело должна контроллировать ЭПС, поэтому
			 * здесь мы просто игнорируем обработку для данного документа.
			 */
			log.info( String.format(
				"EnvelopeID: %s, Для ESADout_CU не найден ссылочный идентификатор, сравнение деклараций не возможно",
				jobBatchContext.getReceivedEnvelope( ).getEnvelopeID( )
			) );
			return ;
		}
				
		// Шаг 3: Сравнение XML с записью отличий в массив
		List< DocComparisonItem > result = new ArrayList< DocComparisonItem >( );
		DocumentComparator.compare( cEsadOutCu, cRefEsadOutCu, result );
		
		// Шаг 4: Сохранение результатов сравнения в БД
		int id = 0;
		List< AlyEsadDiff > diffs = new ArrayList< AlyEsadDiff >( );
		for ( DocComparisonItem item : result )
		{
			AlyEsadDiff diff = new AlyEsadDiff( );
			diff.setId( id++ );
			diff.setMessageId( documentId );
			diff.setPath( item.getPath( ) );
			diff.setOldValue( item.getOldValue( ) );
			diff.setNewValue( item.getNewValue( ) );
			diff.setOp( item.getOp( ).toString( ) );
			diff.setGoodsNumeric( getGoodsNumeric( item.getCur( ), item.getOld( ) ) );
			diff.setSoftVersion( softVersion );
			
			diffs.add( diff );
			// diffSrv.persist( diff );
		}
		
		diffSrv.persist( diffs );
		
		AlyEsadRepl repl = new AlyEsadRepl( );
		repl.setEsadId( documentId );
		repl.setRefEsadId( refDocumentId );
		repl.setSoftVersion( recvEnv.getSoftVersion( ) );
		
		AlyEsadRepl refRepl = diffSrv.getRepl( refDocumentId );
		if ( null != refRepl && null != refRepl.getGtdId( ) && ! refRepl.getGtdId( ).isEmpty( ) )
			repl.setGtdId( refRepl.getGtdId( ) );
		
		diffSrv.persist( repl );
	}

	@Override
	public String getAction( )
	{
		return "Задача сравнение ДТ";
	}
	
	private Element getEsadFromContainer( String documentId, AlyJobBatchContext jobBatchContext ) 
		throws Exception
	{
		EnvelopeService envSrv = jobBatchContext.getServiceHolder( ).getEnvelopeService( );
		
		List< Edecl_Msg_Doc > cdocs = envSrv.getContainerDocuments( documentId );
		for ( Edecl_Msg_Doc cdoc : cdocs )
		{
			if ( ! cdoc.getDocumentModeId( ).equals( DocumentModeIDs.ESAD_OUT_CU ) )
				continue;
			
			DocumentBuilder db = getDbf( ).newDocumentBuilder( );
			Document doc = db.parse( new ByteArrayInputStream( cdoc.getBody( ) ) );
			
			XPath xp = getXpf( ).newXPath( );
			XPathExpression xpe = xp.compile( "//*[local-name()='ESADout_CU']" );
			
			Node esadoutcu = ( Node )xpe.evaluate( doc, XPathConstants.NODE );
			if ( null == esadoutcu || ! ( esadoutcu instanceof Element ) )
				ErrorHelper.throwBasicException( "Не найден ESADout_CU" );
			
			return ( Element )esadoutcu;			
		}
		
		return null;
	}

	private Element getCurrentEsadOut( AlyJobBatchContext jobBatchContext )
		throws Exception
	{
		return getEsadFromContainer( 
			jobBatchContext.getReceivedEnvelope( ).getDocument( ).getDocumentID( ), 
			jobBatchContext 
		);
	}
	
	private Element getRefEsadOut( AlyJobBatchContext jobBatchContext )
		throws Exception
	{
		if ( StringUtil.isNullOrEmpty( jobBatchContext.getReceivedEnvelope( ).getDocument( ).getRefDocumentID( ) ) )
			return null;
		
		return getEsadFromContainer( 
			jobBatchContext.getReceivedEnvelope( ).getDocument( ).getRefDocumentID( ), 
			jobBatchContext 
		);
	}
	
	/*
	private String getGoodsNumeric( Element cur, XmlTree old )
		throws Exception
	{
		XPath xp = getXpf( ).newXPath( );
		XPathExpression numxpe = xp.compile( ".//*[local-name()='GoodsNumeric']/text()" );
		
		String goodsNumeric = null;
		
		if ( null != cur )
		{
			Node n = cur;
			do
			{
				if ( ! ( n instanceof Element ) ) 
					continue;
				
				Element el = ( Element )n;
				if ( el.getLocalName( ).equals( "ESADout_CUGoods" ) )
				{					
					String v = ( String )numxpe.evaluate( el, XPathConstants.STRING );
					if ( null != v && ! v.isEmpty( ) )
					{
						goodsNumeric = v;
						break;
					}
				}
			} while ( ( n = n.getParentNode( ) ) != null );
		}
		
		if ( null != goodsNumeric && ! goodsNumeric.isEmpty( ) )
			return goodsNumeric;
		
		if ( null != old )
		{
			XmlTree xmlt = old;
			do
			{
				if ( xmlt.getCurrent( ).getTagName( ).equals( "ESADout_CUGoods" ) )
				{
					XmlTree numt = xmlt.traverseTo( "GoodsNumeric" );
					if ( null != numt )
					{
						String v = numt.getCurrent( ).getTagValue( );
						if ( null != v && ! v.isEmpty( ) )
						{
							goodsNumeric = v;
							break;
						}
					}
				}
			} while ( ( xmlt = xmlt.getParent( ) ) != null );
		}
		
		return goodsNumeric;
	}
	*/
	
	private String getGoodsNumeric( Element cur, Element old )
		throws Exception
	{
		XPath xp = getXpf( ).newXPath( );
		XPathExpression numxpe = xp.compile( ".//*[local-name()='GoodsNumeric']/text()" );
		
		List< Element > checks = new ArrayList< Element >( );
		if ( null != cur ) checks.add( cur );
		if ( null != old ) checks.add( old );
		
		for ( Element check : checks )
		{
			Node n = check;
			do
			{
				if ( ! ( n instanceof Element ) )
					continue;
				
				Element el = ( Element )n;
				if ( el.getLocalName( ).equals( "ESADout_CUGoods" ) )
				{
					String v = ( String )numxpe.evaluate( el, XPathConstants.STRING );
					if ( null != v && ! v.isEmpty( ) )
						return v;
				}
			} while ( ( n = n.getParentNode( ) ) != null );
		}
		
		return null;
	}	
}
