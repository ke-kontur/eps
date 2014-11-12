package ru.acs.fts.eps2.util.helpers;

import org.springframework.util.StopWatch;

public class StopWatchHelper
{
	public static String timeToString( StopWatch sw )
	{
		long millis = sw.getLastTaskTimeMillis( ) / 1000;
		
		String elapsed = String.format( 
			"%d:%d.%d", 
			millis / 60, millis % 60, 
			sw.getLastTaskTimeMillis( ) % 1000 
		); 			
		
		return elapsed;
	}
}
