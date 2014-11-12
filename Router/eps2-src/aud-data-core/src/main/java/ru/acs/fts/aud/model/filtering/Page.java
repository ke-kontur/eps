package ru.acs.fts.aud.model.filtering;

import java.util.List;

public class Page< T >
{
	private List< T > _items;
	private long _overallAmount;
	
	public Page( List< T > items, long overallAmount )
	{
		_items = items;
		_overallAmount = overallAmount;
	}
	
	// @formatter:off
	public List< T > getItems( ) { return _items; }
	public long getOverallAmount( ) { return _overallAmount; }
	// @formatter:on
}
