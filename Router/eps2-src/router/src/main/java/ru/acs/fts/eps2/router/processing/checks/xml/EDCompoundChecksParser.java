package ru.acs.fts.eps2.router.processing.checks.xml;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.util.xml.DomUtils;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import ru.acs.fts.eps2.engine.processing.checks.xml.CompoundChecksParser;

public class EDCompoundChecksParser extends CompoundChecksParser // NO_UCD (use default)
{	
	@Override
	protected RootBeanDefinition parseClause( Element clause, ParserContext parserContext )
	{
		RootBeanDefinition clauseDef = super.parseClause( clause, parserContext ); 

		List<?> containerCheckList = DomUtils.getChildElementsByTagName( clause, "containerCheck" );

		if ( containerCheckList.size( ) > 0 )
		{
			Element containerCheckNode = ( Element )containerCheckList.get( 0 );
			RootBeanDefinition containerCheckDef =
				parseContainerCheck( containerCheckNode, parserContext );
					
			if ( null != containerCheckDef )
				clauseDef.getPropertyValues( ).addPropertyValue( "check", containerCheckDef );
		}
		else
		{
			List<?> rulesCheckList = DomUtils.getChildElementsByTagName( clause, "rulesCheck" );
			if ( rulesCheckList.size( ) > 0 )
			{
				Element rulesCheckNode = ( Element )rulesCheckList.get( 0 );
				RootBeanDefinition rulesCheckDef =
					parseRulesCheck( rulesCheckNode, parserContext );
						
				if ( null != rulesCheckDef )
					clauseDef.getPropertyValues( ).addPropertyValue( "check", rulesCheckDef );
			}
			else
			{
				List<?> statusCheckList = DomUtils.getChildElementsByTagName( clause, "statusCheck" );
				if ( statusCheckList.size( ) > 0 )
				{
					Element statusCheckNode = ( Element )statusCheckList.get( 0 );
					RootBeanDefinition statusCheckDef =
						parseStatusCheck( statusCheckNode, parserContext );
							
					if ( null != statusCheckDef )
						clauseDef.getPropertyValues( ).addPropertyValue( "check", statusCheckDef );
				}
			}
		}
		return clauseDef;
	}
	
	protected RootBeanDefinition parseContainerCheck( Element containerCheck, ParserContext parserContext )
	{
		RootBeanDefinition containerCheckDef = new RootBeanDefinition( );
		containerCheckDef.setSource( parserContext.extractSource( containerCheck ) );
		
		containerCheckDef.setBeanClassName( "ru.acs.fts.eps2.router.processing.checks.ContainerCheck" );
		
		Map< String, Integer > docCount = new HashMap< String, Integer >( );
		Map< String, String > docEq = new HashMap< String, String >( );
		
		NodeList subNodes = containerCheck.getChildNodes( );
		for ( int i = 0; i < subNodes.getLength( ); ++i )
		{
			Node node = subNodes.item( i );
			if ( null == node || ! ( node instanceof Element ) )
				continue;
			
			Element el = ( Element )node;
			
			String docModeId = el.getNodeName( ).substring( 2 );
			String textValue = el.getTextContent( );

			if ( textValue.startsWith( "id" ) )
			{
				String sDocModeId = textValue.substring( 2 );
				docEq.put( docModeId, sDocModeId );
			}
			else
			{
				try
				{
					Integer count = Integer.parseInt( textValue );
					docCount.put( docModeId, count );
				}
				catch ( NumberFormatException exc )
				{
					
				}
			}
		}
		
		containerCheckDef.getPropertyValues( ).addPropertyValue( "completeness", docCount );
		containerCheckDef.getPropertyValues( ).addPropertyValue( "equivalence", docEq );
		
		return containerCheckDef;
	}

	protected RootBeanDefinition parseRulesCheck( Element rulesCheck, ParserContext parserContext )
	{
		RootBeanDefinition rulesCheckDef = new RootBeanDefinition( );
		rulesCheckDef.setSource( parserContext.extractSource( rulesCheck ) );

		rulesCheckDef
				.setBeanClassName( "ru.acs.fts.eps2.router.processing.checks.RulesCheck" );

		List< ? > ruleList = DomUtils.getChildElementsByTagName( rulesCheck,
				"ruleName" );
		if ( ruleList.size( ) > 0 )
		{
			Element ruleNode = ( Element )ruleList.get( 0 );
			String v = ruleNode.getTextContent( );

			rulesCheckDef.getPropertyValues( ).addPropertyValue( "ruleName", v );

		}

		// TODO: сделать также если правил несколько

		return rulesCheckDef;

	}
	
	protected RootBeanDefinition parseStatusCheck( Element statusCheck, ParserContext parserContext )
	{
		RootBeanDefinition statusCheckDef = new RootBeanDefinition( );
		statusCheckDef.setSource( parserContext.extractSource( statusCheck ) );

		statusCheckDef
				.setBeanClassName( "ru.acs.fts.eps2.router.processing.checks.StatusCheck" );

		List<?> statusList = DomUtils.getChildElementsByTagName( statusCheck, "statusExp" );
		
		if ( statusList.size( ) > 0 )
		{
			List< String > statuses = new ArrayList< String >( );
			for ( int i = 0; i < statusList.size( ); ++i )
			{
				Element status = ( Element )statusList.get( i );
				statuses.add( status.getTextContent( ) );
			}
			
			statusCheckDef.getPropertyValues( ).addPropertyValue( "statusExps", statuses );
		}

		return statusCheckDef;
	}

}
