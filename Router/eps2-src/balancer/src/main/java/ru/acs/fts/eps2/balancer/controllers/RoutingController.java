package ru.acs.fts.eps2.balancer.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ru.acs.fts.eps2.balancer.processing.Balancer;
import ru.acs.fts.eps2.balancer.processing.EpsDestination;
import ru.acs.fts.eps2.balancer.processing.HeartbeatNotifier;
import ru.acs.fts.eps2.balancer.service.model.BalancedItem;
import ru.acs.fts.eps2.balancer.service.model.BalancerData;

@Controller
public class RoutingController
{
	@Autowired
	@Qualifier( "heartbeatNotifier" )
	private HeartbeatNotifier _notifier;
	
	@RequestMapping( value = "/", method = RequestMethod.GET )
	public ModelAndView index( )
	{
		ModelAndView mav = new ModelAndView( "index" );
		
		List< BalancerData > balancers = new ArrayList< BalancerData >( );
		
		for ( Balancer balancer : _notifier.getBalancers( ) )
		{
			BalancerData bdata = new BalancerData( );
			bdata.setName( balancer.getDescription( ) );
			bdata.setUseHeartbeat( balancer.getUseHeartbeat( ) ? "Использует сердцебиение" : "Не использует сердцебиение" );
			bdata.setUseListenerContainer( null != balancer.getListenerContainer( ) ? "Управляет контейнером" : "Не управляет контейнером" );
			
			for ( String version : balancer.getRoutes( ).keySet( ) )
			{
				List< EpsDestination > destinations = balancer.getRoutes( ).get( version );
				
				boolean firstItem = true;
				for ( EpsDestination dest : destinations )
				{
					BalancedItem item = new BalancedItem( );
					
					item.setFirst( firstItem );					
					if ( firstItem )
						item.setRowspan( destinations.size( ) );
					
					firstItem = false;
					
					item.setVersion( version );
					item.setDestination( dest.getDescription( ) );
					item.setLoad( dest.getLoad( ) );
					
					StringBuilder codes = new StringBuilder( );
					boolean firstCode = true;
					for ( String code : dest.getCustomsCodes( ) )
					{
						if ( ! firstCode )
							codes.append( ", " );
						firstCode = false;
						codes.append( code );
					}
					item.setCodes( codes.toString( ) );
					
					if ( balancer.getUseHeartbeat( ) && ! dest.isEnabled( ) )
						item.setStyle( "off" );
					else
						item.setStyle( "on" );
					
					bdata.getItems( ).add( item );
				}
			}
			
			balancers.add( bdata );
		}
		
		mav.addObject( "balancers", balancers );
		
		return mav;
	}
}
