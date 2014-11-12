package ru.acs.fts.eps2.engine.processing;

import java.util.List;
import java.util.ListIterator;

public class JobBatch
{
	private List< PreparedJob > preparedJobs;
	private String description;

	public JobBatch( )
	{
	}

	// @formatter:off
	public void setPreparedJobs( List< PreparedJob > preparedJobs ) { this.preparedJobs = preparedJobs; }
	public List< PreparedJob > getPreparedJobs( ) { return preparedJobs; }

	public void setDescription( String description ) { this.description = description; }
	public String getDescription( ) { return description; }
	// @formatter:on

	public int size( ) // NO_UCD (use default)
	{
		return ( preparedJobs == null ) ? 0 : preparedJobs.size( );
	}

	@Deprecated
	public ListIterator< PreparedJob > createIterator( int index ) // NO_UCD (unused code)
	{
		if ( null == preparedJobs )
			return null;
		
		return preparedJobs.listIterator( index );
	}

	@Deprecated
	public ListIterator< PreparedJob > createIterator( ) // NO_UCD (unused code)
	{
		if ( preparedJobs == null )
			return null;

		return preparedJobs.listIterator( );
	}
}
