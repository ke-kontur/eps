package ru.acs.fts.eps2.engine.processing.checks.xml;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.parsing.BeanComponentDefinition;
import org.springframework.beans.factory.parsing.CompositeComponentDefinition;
import org.springframework.beans.factory.support.ManagedList;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.factory.xml.BeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.util.xml.DomUtils;
import org.w3c.dom.Element;

public class CompoundChecksParser implements BeanDefinitionParser // NO_UCD (use default)
{

	@Override
	public BeanDefinition parse( Element element, ParserContext parserContext )
	{
		CompositeComponentDefinition compositeDef = new CompositeComponentDefinition(
			element.getTagName( ), 
			parserContext.extractSource( element )
		);
		parserContext.pushContainingComponent( compositeDef );
		
		parseChecksSentence( element, parserContext );
		
		parserContext.popAndRegisterContainingComponent();
		return null;		
	}
	
	protected void parseChecksSentence( Element sentence, ParserContext parserContext )
	{
		RootBeanDefinition checkSentenceDef = new RootBeanDefinition( );
		checkSentenceDef.setSource( parserContext.extractSource( sentence ) );
		
		checkSentenceDef.setBeanClassName( "ru.acs.fts.eps2.engine.processing.checks.ChecksSentence" );
		
		List<Element> clauseList = DomUtils.getChildElementsByTagName( sentence, "clause" );
		if ( clauseList.size( ) > 0 )
		{
			ManagedList< RootBeanDefinition > clauses = new ManagedList< RootBeanDefinition >( );
			for ( int i = 0; i < clauseList.size( ); ++i )
			{
				Element clauseNode = clauseList.get( i );
				RootBeanDefinition clauseDef = 
					parseClause( clauseNode, parserContext );
				
				if ( null != clauseDef )
					clauses.add( clauseDef );
			}
			
			checkSentenceDef.getPropertyValues( ).addPropertyValue( "checks", clauses );
		}
		
		parserContext.registerBeanComponent(
			new BeanComponentDefinition( checkSentenceDef, sentence.getAttribute( "id" ) ) 
		);		
	}
	
	protected RootBeanDefinition parseClause( Element clause, ParserContext parserContext )
	{
		RootBeanDefinition clauseDef = new RootBeanDefinition( );
		clauseDef.setSource( parserContext.extractSource( clause ) );
		
		clauseDef.setBeanClassName( "ru.acs.fts.eps2.engine.processing.checks.ChecksBlockClause" );
		
		String op = clause.getAttribute( "op" );
		clauseDef.getPropertyValues( ).addPropertyValue( "clause", op );
		
		String negation = clause.getAttribute( "negation" );
		if ( null != negation )
			clauseDef.getPropertyValues( ).addPropertyValue( "negation", negation );
		
		List<?> checksBlockList = DomUtils.getChildElementsByTagName( clause, "checksBlock" );
		if ( checksBlockList.size( ) > 0 )
		{
			Element checksBlockNode = ( Element )checksBlockList.get( 0 );
			RootBeanDefinition checksBlockDef = 
				parseChecksBlock( checksBlockNode, parserContext );
			
			if ( null != checksBlockDef )
				clauseDef.getPropertyValues( ).addPropertyValue( "check", checksBlockDef );
		}
		else
		{
			List<?> xPathChecksList = DomUtils.getChildElementsByTagName( clause, "xPathCheck" );
			if ( xPathChecksList.size( ) > 0 )
			{
				Element xPathCheckNode = ( Element )xPathChecksList.get( 0 );
				RootBeanDefinition xPathCheckDef = 
					parseXPathCheck( xPathCheckNode, parserContext );
				
				if ( null != xPathCheckDef )
					clauseDef.getPropertyValues( ).addPropertyValue( "check", xPathCheckDef );
			}
		}
		
		return clauseDef;
	}
	
	protected RootBeanDefinition parseChecksBlock( Element checksBlock, ParserContext parserContext )
	{
		RootBeanDefinition checksBlockDef = new RootBeanDefinition( );
		checksBlockDef.setSource( parserContext.extractSource( checksBlock ) );
		
		checksBlockDef.setBeanClassName( "ru.acs.fts.eps2.engine.processing.checks.ChecksBlock" );
		
		List< Element > clauseList = DomUtils.getChildElementsByTagName( checksBlock, "clause" );
		if ( clauseList.size( ) > 0 )
		{
			ManagedList< RootBeanDefinition > clauses = new ManagedList< RootBeanDefinition >( );
			for ( int i = 0; i < clauseList.size( ); ++i )
			{
				Element clauseNode = ( Element )clauseList.get( i );
				RootBeanDefinition clauseDef = 
					parseClause( clauseNode, parserContext );
				
				if ( null != clauseDef )
					clauses.add( clauseDef );
			}
			
			checksBlockDef.getPropertyValues( ).addPropertyValue( "checks", clauses );
		}		
		
		return checksBlockDef;
	}
	
	protected RootBeanDefinition parseXPathCheck( Element xPathCheck, ParserContext parserContext )
	{
		RootBeanDefinition xPathCheckDef = new RootBeanDefinition( );
		xPathCheckDef.setSource( parserContext.extractSource( xPathCheck ) );
		
		xPathCheckDef.setBeanClassName( "ru.acs.fts.eps2.engine.processing.checks.XPathCheck" );
		
		List<?> xPathVariableList = DomUtils.getChildElementsByTagName( xPathCheck, "xPathVariable" );
		if ( xPathVariableList.size( ) > 0 )
		{
			Element xPathVariableNode = ( Element )xPathVariableList.get( 0 );
			String v = xPathVariableNode.getTextContent( );
			
			xPathCheckDef.getPropertyValues( ).addPropertyValue( "XPathVariable", v );
		}
		
		List<?> valueList = DomUtils.getChildElementsByTagName( xPathCheck, "value" );
		if ( valueList.size( ) > 0 )
		{
			Element valueNode = ( Element )valueList.get( 0 );
			String v = valueNode.getTextContent( );
			
			xPathCheckDef.getPropertyValues( ).addPropertyValue( "value", v );
		}
		
		List<?> valuesList = DomUtils.getChildElementsByTagName( xPathCheck, "values" );
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
			
			xPathCheckDef.getPropertyValues( ).addPropertyValue( "values", values );
		}		
		
		return xPathCheckDef;
	}

}
