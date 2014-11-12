package ru.acs.fts.eps2.engine.processing.checks.xml;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class CompoundChecksNamespaceHandler extends NamespaceHandlerSupport // NO_UCD (used by spring.handlers)
{
	@Override
	public void init( )
	{
		registerBeanDefinitionParser( "checksSentence", new CompoundChecksParser( ) );
	}	
}
