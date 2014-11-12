package ru.acs.fts.eps2.balancer.service.model;

import java.util.ArrayList;
import java.util.List;

public class BalancerData
{
	private String _name;
	private String _description;
	private String _useHeartbeat;
	private String _useListenerContainer;
	private List< BalancedItem > _items = new ArrayList< BalancedItem >( ); 
	
	// @formatter:off
	public void setName( String name ) { _name = name; }
	public String getName( ) { return _name; }
	
	public void setDescription( String description ) { _description = description; }
	public String getDescription( ) { return _description; }
	
	public void setUseHeartbeat( String useHeartbeat ) { _useHeartbeat = useHeartbeat; }
	public String getUseHeartbeat( ) { return _useHeartbeat; }
	
	public void setUseListenerContainer( String useListenerContainer ) { _useListenerContainer = useListenerContainer; }
	public String getUseListenerContainer( ) { return _useListenerContainer; }
	
	public void setItems( List< BalancedItem > items ) { _items = items; }
	public List< BalancedItem > getItems( ) { return _items; }
	// @formatter:on
}
