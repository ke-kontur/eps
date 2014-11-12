package ru.acs.fts.eps2.engine.processing.checks;

import java.util.List;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.springframework.beans.factory.annotation.Required;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import ru.acs.fts.eps2.engine.objects.Envelope;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobBatchContext;
import ru.acs.fts.eps2.utils.StringUtil;

/**
 * Класс реализующий интерфейс проверок в документе и осуществляющий XPath проверки
 * 
 * Важно! Требуется всегда xPathVariable и либо одно скалярное значение (value) или
 * заданный список значений (values)
 * 
 * @author mrdekk
 * @since 5.0.11
 */
public class XPathCheck implements ICheck
{
	private String xPathVariable;
	private String value;
	private Integer length;
	private List< String > values;
	private Boolean valuesSearchOne;
	
	@Required
	public void setXPathVariable( String xPathVariable ) { this.xPathVariable = xPathVariable; }
	public String getXPathVariable( ) { return xPathVariable; }
	
	// @Required
	public void setValue( String value ) { this.value = value; }
	public String getValue( ) { return value; }
	
	// @Required
	public void setLength( Integer length ) { this.length = length; }
	public Integer getLength( ) { return length; }
	
	// @Required
	public void setValues( List< String > values ) { this.values = values; }
	public List< String > getValues( ) { return values; }
	
	// @Requred
	public void setValuesSearchOne( Boolean valuesSearchOne ) { this.valuesSearchOne = valuesSearchOne; }
	public Boolean getValuesSearchOne( ) { return valuesSearchOne; }
	
	@Override
	public boolean check( Envelope envelope, JobBatchContext jobBatchContext )
		throws Exception
	{
		if ( ! jobBatchContext.contains( ContextConstants.XML_DOM_DOCUMENT ) )
			throw new Exception( "XML DOM документ не найден в контексте пакете задач!" );
		
		Document domDoc = ( Document )jobBatchContext.get( ContextConstants.XML_DOM_DOCUMENT );
		
		XPathFactory xPathFactory = XPathFactory.newInstance( );		
		XPath xpath = xPathFactory.newXPath( );
		XPathExpression xpathResult = xpath.compile( xPathVariable );

		boolean satisfied = true;
		
		NodeList results = ( NodeList )xpathResult.evaluate( domDoc, XPathConstants.NODESET );
		if ( 0 == results.getLength( ) )
		{
			if ( null != value && ! value.equalsIgnoreCase( "nullx" ) )
				return false;
			if ( null != values && ! values.contains( "nullx" ) )
				return false;
		}
		
		for ( int i = 0; i < results.getLength( ); ++i )
		{	
			Node node = results.item( i );
			
			//String result = ( String )xpathResult.evaluate( domDoc, XPathConstants.STRING );
			String result = node.getTextContent( );
			if ( StringUtil.isNullOrEmpty( result ) )
				result = "nullx";
	
			result = result.replaceAll( "\n", "" ).replaceAll( "\t", "" ).replaceAll( "\r", "" );
			
			if ( null != value )
			{
				satisfied = satisfied && ( value.equalsIgnoreCase( result ) );
				if ( satisfied && null != valuesSearchOne && valuesSearchOne.booleanValue( ) )
				{
					/**
					 * Нам требуется найти только один узел с заданными значениями ( valuesSearchOne = true )
					 * мы его нашли, поэтому все хватит
					 */
					i = results.getLength( ) + 1;					
				}
				// return ( value.equalsIgnoreCase( result ) );
			}
			else if ( null != values )
			{
				boolean found = false;
				for ( String v : values )
				{
					if ( v.equalsIgnoreCase( result ) )
					{
						//return true;
						found = true;
						break;
					}
				}
				
				if ( ! found )
					satisfied = false;
				else if ( null != valuesSearchOne && valuesSearchOne.booleanValue( ) )
				{
					/**
					 * Нам требуется найти только один узел с заданными значениями ( valuesSearchOne = true )
					 * мы его нашли, поэтому все хватит
					 */
					i = results.getLength( ) + 1;
				}
			}
			else if ( null != length )
			{
				satisfied = satisfied && ( result.length( ) == length.intValue( ) );
			}
		}
		
		return satisfied;
	}
}
