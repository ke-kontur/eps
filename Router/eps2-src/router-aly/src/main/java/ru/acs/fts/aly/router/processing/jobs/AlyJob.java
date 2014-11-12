package ru.acs.fts.aly.router.processing.jobs;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.springframework.beans.factory.annotation.Required;
import org.w3c.dom.Element;

import ru.acs.fts.aly.router.model.AlyServiceHolder;
import ru.acs.fts.aly.router.processing.AlyJobBatchContext;
import ru.acs.fts.eps2.engine.processing.Job;
import ru.acs.fts.eps2.engine.processing.JobBatchContext;
import ru.acs.fts.eps2.engine.processing.JobContext;

public abstract class AlyJob extends Job // NO_UCD (use default)
{
	protected AlyServiceHolder _serviceHolder;
	
	// @formatter:off
	@Required
	public void setServiceHolder( AlyServiceHolder serviceHolder ) { _serviceHolder = serviceHolder; }
	public AlyServiceHolder getServiceHolder( ) { return _serviceHolder; }
	// @formatter:on
	
	@Override
	public void execute( JobBatchContext jobBatchContext, JobContext jobContext ) throws Exception
	{
		alyExecute( ( AlyJobBatchContext )jobBatchContext, jobContext );
	}
	
	public abstract void alyExecute( AlyJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception;
		
	private DocumentBuilderFactory _dbf;
	private XPathFactory _xpf;
	
	protected DocumentBuilderFactory getDbf( )
	{
		if ( null == _dbf )
		{
			_dbf = DocumentBuilderFactory.newInstance( );
			_dbf.setNamespaceAware( true );
		}
		
		return _dbf;
	}
	
	protected XPathFactory getXpf( )
	{
		if ( null == _xpf )
		{
			_xpf = XPathFactory.newInstance( );
		}
		
		return _xpf;
	}

	
	protected String getDocumentID( Element document )
		throws Exception
	{
		if ( null == document )
			return null;
		
		XPath xp = getXpf( ).newXPath( );
		XPathExpression xpe = xp.compile( ".//*[local-name()='DocumentID']/text()" );
		
		return ( String )xpe.evaluate( document, XPathConstants.STRING );
	}

	protected String getRefDocumentID( Element document )
		throws Exception
	{
		XPath xp = getXpf( ).newXPath( );
		XPathExpression xpe = xp.compile( ".//*[local-name()='RefDocumentID']/text()" );
		
		return ( String )xpe.evaluate( document, XPathConstants.STRING );
	}	
}
