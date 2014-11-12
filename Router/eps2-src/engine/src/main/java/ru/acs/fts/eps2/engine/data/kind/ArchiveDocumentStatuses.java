package ru.acs.fts.eps2.engine.data.kind;

public class ArchiveDocumentStatuses
{
	public static final String DOC_NEW_ACTUAL = "DocNewActual";
	
	public static final String DOC_NEW_EXPIRE = "DocNewExpire";
	
	public static final String DOC_ACTIVE_ACTUAL = "DocActiveActual";
	
	public static final String DOC_ACTIVE_EXPIRE = "DocActiveExpire";
	
	public static final boolean isNewActual( String status )
	{
		return DOC_NEW_ACTUAL.equalsIgnoreCase( status );
	}
	
	public static final boolean isActiveActual( String status )
	{
		return DOC_ACTIVE_ACTUAL.equalsIgnoreCase( status );
	}
	
	public static final boolean isNew( String status )
	{
		return DOC_NEW_ACTUAL.equalsIgnoreCase( status )
				|| DOC_NEW_EXPIRE.equalsIgnoreCase( status );
	}
	
	public static final boolean isActive( String status )
	{
		return DOC_ACTIVE_ACTUAL.equals( status )
				|| DOC_ACTIVE_EXPIRE.equals( status );
	}
}
