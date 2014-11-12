package ru.acs.fts.eps2.balancer.processing;

import java.util.HashSet;
import java.util.Set;

import javax.jms.Destination;

import org.joda.time.DateTime;
import org.joda.time.Interval;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.core.JmsTemplate;

public class EpsDestination
{
	private static final Logger log = LoggerFactory.getLogger( EpsDestination.class );
	
	private static final long ELAPSED_TO_DIE = 5 * 60 * 1000; // 5 minutes in milliseconds	
	
	private Destination _destination;
	private JmsTemplate _jmsTemplate;
	private String _description = "Не задан description !!!";
	
	private DateTime _lastUpdated = new DateTime( );
	private boolean _enabled = true;
	
	private Set< String > _customsCodes = new HashSet< String >( );
	private long _load = 0;
	
	// @formatter:off
	public void setDestination( Destination destination ) { _destination = destination; }
	public Destination getDestination( ) { return _destination; }
	
	public void setJmsTemplate( JmsTemplate jmsTemplate ) { _jmsTemplate = jmsTemplate; }
	public JmsTemplate getJmsTemplate( ) { return _jmsTemplate; }
	
	public void setDescription( String description ) { _description = description; }
	public String getDescription( ) { return _description; }
	
	public Set< String > getCustomsCodes( ) { return _customsCodes; }
	
	public void setLoad( long load ) { _load = load; }
	public long getLoad( ) { return _load; }
	// @formatter:on
	
	public void addLoad( long amount ) { _load += amount; } // NO_UCD (use default)
	
	public void heartbeat( ) // NO_UCD (use default)
	{
		boolean oldValue = _enabled;
		
		enable( );
		
		if ( ! oldValue && _enabled )
			log.info( String.format( "Точка %s включена", _description ) );
		else if ( oldValue && ! _enabled )
			log.info( String.format( "Точка %s отключена", _description ) );
	}

	public void enable( ) // NO_UCD (use private)
	{
		_lastUpdated = new DateTime( );
		_enabled = true;
	}
	
	public void disable( ) // NO_UCD (use default)
	{
		_enabled = false;
		_customsCodes.clear( );
	}
	
	public boolean isEnabled( )
	{
		return _enabled;
	}
	
	public void check( ) // NO_UCD (use default)
	{
		DateTime now = new DateTime( );
		
		if ( _lastUpdated.compareTo( now ) > 0 )
		{
			log.info( String.format( "Для точки %s обнаружен перевод часов !!!", _description ) );
			return ;
		}
		
		Interval interv = new Interval( _lastUpdated, now );
		boolean oldValue = _enabled;
		
		long elapsed = interv.toDurationMillis( );
		if ( elapsed > ELAPSED_TO_DIE )
		{
			disable( );
		}
		
		if ( ! oldValue && _enabled )
			log.info( String.format( "Точка %s включена", _description ) );
		else if ( oldValue && ! _enabled )
			log.info( String.format( "Точка %s отключена", _description ) );
	}
}
