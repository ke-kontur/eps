package ru.acs.fts.eps2.router.processing.checks.xml;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class EDCompoundChecksNamespaceHandler extends NamespaceHandlerSupport // NO_UCD (used by spring.handlers)
{
	@Override
	public void init( )
	{
		registerBeanDefinitionParser( "checksSentence", new EDCompoundChecksParser( ) );
	}	
}
