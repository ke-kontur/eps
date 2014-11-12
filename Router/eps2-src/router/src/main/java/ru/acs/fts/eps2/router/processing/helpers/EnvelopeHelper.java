package ru.acs.fts.eps2.router.processing.helpers;

import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.utils.StringUtil;
import ru.acs.fts.schemas.envelope.ApplicationInfType;

public class EnvelopeHelper
{
	private EnvelopeHelper( ) { }
	
	private static String MESSAGE_KIND_PREFIX = "UD:";
	
	public static String getCodeFromMessageKind( EDEnvelope env ) // NO_UCD (use private)
	{
		String code = null;
		String messageKind = env.getApplicationInfo( ).getMessageKind( );
		if ( ! StringUtil.isNullOrEmpty( code ) )
			code = getCodeFromString( messageKind );
		
		return  code;
	}
	
	public static String getCodeFromString( String string ) // NO_UCD (use private)
	{
		String code = null;
		if ( ! StringUtil.isNullOrEmpty( string ) )
		{
			String formattedMessageKind = string.toUpperCase( );
			String prefix = getMessageKindPrefix( );
			if ( formattedMessageKind.startsWith( prefix ) )
				code = formattedMessageKind.substring( prefix.length( ) );
		}
		return code;
	}
	
	public static String getMessageKindPrefix( ) // NO_UCD (use private)
	{
		return MESSAGE_KIND_PREFIX;
	}
	
	public static void setUpMessageKind( EDEnvelope env, String customsCode ) // NO_UCD (use private)
	{
		String messageKind = new StringBuilder( getMessageKindPrefix( ) )
			.append( customsCode ).toString( );
		
		env.getApplicationInfo( ).setMessageKind( messageKind );
	}
	
	public static void setUpMessageKind( EDEnvelope env, Edecl_Proc_Information procInfo )
	{
		ApplicationInfType applicationInfo = env.getApplicationInfo( );
		String messageKind = applicationInfo.getMessageKind( );
		String code = procInfo.getBorderCustCode( );
		
		if ( isNullOrEmpty( messageKind ) )
		{
			setUpMessageKind( env, code );
		}
		else
		{
			String messageKindCode = EnvelopeHelper.getCodeFromMessageKind( env );
			if ( isNullOrEmpty( messageKindCode ) || ! messageKindCode.equalsIgnoreCase( code ) )
				setUpMessageKind( env, code );
		}
	}
	
	private static boolean isNullOrEmpty( String string )
	{
		return StringUtil.isNullOrEmpty( string );
	}
}
