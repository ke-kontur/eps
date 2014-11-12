package ru.acs.fts.eps2.util.time;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;

public class TimeUtil 
{
	private TimeUtil( ) { }
	
    public static String getTimeZone( Calendar calendar ) // NO_UCD (use private)
    {
        int rawOffset = calendar.getTimeZone( ).getRawOffset( );
        String sign = ( rawOffset < 0 ) ? "-" : "+";
        rawOffset = ( ( rawOffset < 0 ) ? -rawOffset : rawOffset ) / 60000;
        int hoursOffset = ( rawOffset / 60 );
        int minsOffset = ( rawOffset % 60 );
        return sign + ( ( hoursOffset < 10 ) ? "0" + hoursOffset : hoursOffset ) + ":" +
                ( ( minsOffset < 10 ) ? "0" + minsOffset : minsOffset );
    }
    
    public static String getDateTimeWithTimeZone( Calendar calendar, String pattern ) // NO_UCD (use private)
    {
        SimpleDateFormat formatter = new SimpleDateFormat( pattern );
        return formatter.format( calendar.getTime( ) ) + getTimeZone( calendar );
    }
    
    public static String getDateTimeWithTimeZone( Calendar calendar ) // NO_UCD (unused code)
    {
        return getDateTimeWithTimeZone( calendar, "yyyy-MM-dd'T'HH:mm:ss" );
    }
    
    public static long getMillisInOneDay( )
    {
    	return 24 * 60 * 60 * 1000;
    }
    
    public static Calendar convertDateToCalendar( Date date )
    {
    	if ( null == date )
    		return null;
    	
    	Calendar calendar = Calendar.getInstance( );
    	calendar.setTime( date );
    	
    	return calendar;
    }
    
    public static Calendar convertToCalendar( DateTime dateTime )
    {
    	if ( null == dateTime )
    		return null;
    	
    	return dateTime.toGregorianCalendar( );
    }
    
    public static Date convertToDate( DateTime dateTime )
    {
    	if ( null == dateTime )
    		return null;
    	
    	return dateTime.toDate( );
    }
    
    public static DateTime convertToDateTime( Date date )
    {
    	return null == date ? null : new DateTime( date );
    }
    
    public static DateTime convertToDateTime( Calendar calendar )
    {
    	return null == calendar ? null : new DateTime( calendar );
    }
    
    public static LocalDate convertToLocalDate( Date date )
    {
    	return null == date ? null : new LocalDate( date );
    }
    
    public static String formatTimeWithTZDotNetStyle( Date date ) // NO_UCD (unused code)
    {
    	SimpleDateFormat dateFormat = new SimpleDateFormat( "HH:mm:ssZ" );
    	String formatted = dateFormat.format( date );
    	
    	return new StringBuffer( formatted ).insert( formatted.length( ) - 2, ":" ).toString( );
    }
    
	public static Timestamp convertToTimestamp( Calendar calendar ) // NO_UCD (unused code)
	{
		Timestamp timestamp = null;
		if ( null != calendar )
			timestamp = new Timestamp( calendar.getTime( ).getTime( ) );
		
		return timestamp;
	}
	
	public static Timestamp convertToTimestamp( Date date )
	{
		Timestamp timestamp = null;
		if ( null != date )
			timestamp = new Timestamp( date.getTime( ) );
			
		return timestamp;
	}
	
	public static Timestamp convertToTimestamp( DateTime dateTime )
	{
		Timestamp timestamp = null;
		if ( null != dateTime )
			timestamp = convertToTimestamp( dateTime.toDate( ) );
		
		return timestamp;
	}    
	
	public static Timestamp convertToTimestamp( LocalDate localDate )
	{
		Timestamp timestamp = null;
		if ( null != localDate )
		{
			timestamp = new Timestamp( localDate.toDate( ).getTime( ) );
		}
		
		return timestamp;
	}	
	
	public static Timestamp convertToTimestamp( LocalTime localTime  )
	{
		Timestamp timestamp = null;
		if ( null != localTime )
		{
			timestamp = new Timestamp( localTime.toDateTimeToday( ).getMillis( ) );
		}
		
		return timestamp;
	}	
	
	public static Timestamp newTimestamp( )
	{
		return convertToTimestamp( new Date( ) );
	}
	
	public static Timestamp addMillis( Timestamp timestamp, long millis )
	{
		if ( null == timestamp )
			return null;
		
		return new Timestamp( timestamp.getTime( ) + millis );
	}	
	
	public static java.sql.Date convertToSqlDate( DateTime dateTime ) // NO_UCD (unused code)
	{
		java.sql.Date date = null;
		if ( null != dateTime )
			date = new java.sql.Date( dateTime.getMillis( ) );
		
		return date;
	}
	
	public static java.sql.Date convertToSqlDate( Date date )
	{
		java.sql.Date sqlDate = null;
		if ( null != date )
			sqlDate = new java.sql.Date( date.getTime( ) );
		
		return sqlDate;
	}
	
	public static java.sql.Date convertToSqlDate( LocalDate localDate )
	{
		java.sql.Date sqlDate = null;
		if ( null != localDate )
			sqlDate = new java.sql.Date( localDate.toDate( ).getTime( ) );
		
		return sqlDate;
	}	
	
	public static String formatDate( Date date, String format ) // NO_UCD (use private)
	{
		String result = null;
		if ( null != date )
		{
			SimpleDateFormat sdf = new SimpleDateFormat( format );
			result = sdf.format( date );
		}
		
		return result;
	}
	
	public static String formatSqlDate( java.sql.Date date, String format )
	{
		return formatDate( date, format );
	}
	
	public static long getMillisInHours( int hours )
	{
		long millisInOneHour = 60 * 60 * 1000;
		
		return millisInOneHour * hours; 
	}
}
