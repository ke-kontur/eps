package ru.acs.fts.eps2.engine.processing.checks.xml;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.xml.DomUtils;
import org.w3c.dom.Element;

import ru.acs.fts.eps2.engine.processing.checks.XPathCheck;

@Deprecated
public class XPathCheckTypeBeanDefinitionParser extends AbstractSingleBeanDefinitionParser // NO_UCD (deprecated)
{	
	protected Class< ? > getBeanClass( Element element )
	{
		return XPathCheck.class;
	}
	
	protected void doParse( Element element, BeanDefinitionBuilder bean )
	{
		List<?> xPathVariableList = DomUtils.getChildElementsByTagName( element, "xPathVariable" );
		if ( xPathVariableList.size( ) > 0 )
		{
			Element xPathVariableNode = ( Element )xPathVariableList.get( 0 );
			String v = xPathVariableNode.getTextContent( );
			bean.addPropertyValue( "XPathVariable", v );
		}
		
		List<?> valueList = DomUtils.getChildElementsByTagName( element, "value" );
		if ( valueList.size( ) > 0 )
		{
			Element valueNode = ( Element )valueList.get( 0 );
			String v = valueNode.getTextContent( );
			bean.addPropertyValue( "value", v );
		}
		
		List<?> valuesList = DomUtils.getChildElementsByTagName( element, "values" );
		if ( valuesList.size( ) > 0 )
		{
			Element valuesNode = ( Element )valuesList.get( 0 );
			List< String > values = new ArrayList< String >( );
			
			List<?> valuesValueList = DomUtils.getChildElementsByTagName( valuesNode, "value" );
			if ( valuesValueList.size( ) > 0 )
			{
				for ( int i = 0; i < valuesValueList.size( ); ++i )
				{
					Element value = ( Element )valuesValueList.get( i );
					values.add( value.getTextContent( ) );
				}
			}
			
			bean.addPropertyValue( "values", values );
		}
		
		List<?> lengthList = DomUtils.getChildElementsByTagName( element, "length" );
		if ( lengthList.size( ) > 0 )
		{
			Element lengthNode = ( Element )lengthList.get( 0 );
			String v = lengthNode.getTextContent( );
			Integer vi = Integer.parseInt( v );
			bean.addPropertyValue( "length", vi );
		}
		
		List<?> valuesSearchOneList = DomUtils.getChildElementsByTagName( element, "valuesSearchOne" );
		if ( valuesSearchOneList.size( ) > 0 )
		{
			Element valuesSearchOneNode = ( Element )valuesSearchOneList.get( 0 );
			String v = valuesSearchOneNode.getTextContent( );
			Boolean vb = Boolean.parseBoolean( v );
			bean.addPropertyValue( "valuesSearchOne", vb );
		}
	}
}
