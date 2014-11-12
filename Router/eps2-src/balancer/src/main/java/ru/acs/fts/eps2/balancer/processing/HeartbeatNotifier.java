package ru.acs.fts.eps2.balancer.processing;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

public class HeartbeatNotifier // NO_UCD (use default)
{
	private List< Balancer > _balancers;
	
	// @formatter:off
	@Required public void setBalancers( List< Balancer > balancers ) { _balancers = balancers; }
	public List< Balancer > getBalancers( ) { return _balancers; }
	// @formatter:on
	
	public void processHeartbeat( String softVersion, String heartbeatDescription ) // NO_UCD (use default)
	{
		for ( Balancer balancer : _balancers )
		{
			balancer.processHeartbeat( softVersion, heartbeatDescription );
		}
	}
	
	public void dump( ) // NO_UCD (used by spring IoC context)
	{
		for ( Balancer balancer : _balancers )
		{
			balancer.dump( );
		}
	}
}
