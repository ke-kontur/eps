package ru.acs.fts.aud.management.utils.shared;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

public class GenericUtils
{
	public static boolean areNotNull( Object ... objects )
    {
            for ( Object object : objects )
                    if ( null == object )
                            return false;
            
            return true;
    }
	
	public static DateTime ensureTimeZone( DateTime dateTime )
	{
		DateTimeZone localZone = new DateTime( ).getZone( );
		DateTime localDate = dateTime.withZone( localZone );
		
		return localDate;
	}
}
