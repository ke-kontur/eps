package ru.acs.fts.eps2.router.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.scheduling.timer.ScheduledTimerTask;

// TODO: Надо бы убрать это дело, т.к. Spring у нас сейчас нормальный и SPEL есть
@Deprecated
public class ConditionalList
{
	private Map< ScheduledTimerTask, Boolean > timerTasks;

	// @formatter:off
	@Required 
	public void setObjects( Map< ScheduledTimerTask, Boolean > objects ) { this.timerTasks = objects; }
	public Map< ScheduledTimerTask, Boolean > getObjects( ) { return timerTasks; }
	// @formatter:on
	
	public ScheduledTimerTask[ ] list( )
	{
		if ( null == timerTasks )
			return null;
		
		List< ScheduledTimerTask > list = new ArrayList< ScheduledTimerTask >( );
		for ( ScheduledTimerTask obj : timerTasks.keySet( ) )
		{
			if ( timerTasks.get( obj ) )
				list.add( obj );
		}
		
		return list.toArray( new ScheduledTimerTask[ list.size( ) ] );
	}
}
