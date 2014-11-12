package ru.acs.fts.aud.router.processing;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.support.AbstractMessageSource;

public class AudMessageSource extends AbstractMessageSource
{
	private Map< String, String > _patterns;
	
	// @formatter:off
	@Required
	public void setPatterns( Map< String, String > patterns ) { _patterns = patterns; }
	public Map< String, String > getPatterns( ) { return _patterns; }
	// @formatter:on
	
	@Override
	protected MessageFormat resolveCode( String code, Locale locale )
	{
		String pattern = _patterns.get( code );
		if ( null == pattern )
			return null;
		
		return new MessageFormat( pattern, locale );
	}
}
