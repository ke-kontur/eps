package ru.acs.fts.eps2.engine.tasks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GCTask
{
	private static final Logger log = LoggerFactory.getLogger( GCTask.class );
	
	public void collect( )
	{
		log.info( "TASK: вызываем GC" );
		
		System.gc( );
	}
}
