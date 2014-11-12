package ru.acs.fts.eps2.model.services.conditions;

import java.util.HashMap;
import java.util.Map;

import ru.acs.fts.eps2.model.entities.EdeclAlbumDocList;

public class AlbumDocListCondition extends AbstractSelectionCondition< EdeclAlbumDocList > 
{
	private String _documentModeId;
	
	public AlbumDocListCondition( String documentModeId )
	{
		_documentModeId = documentModeId;
	}
	
	@Override
	public boolean check( EdeclAlbumDocList object )
	{
		boolean result = false;
		if ( null != object )
		{
			String objDocumetModeId = object.getDocumentModeId( );
			result = compare( objDocumetModeId, _documentModeId );
		}
				
		return result;
	}

	@Override
	public String getQueryString( ) 
	{
		StringBuilder queryBuilder = new StringBuilder( );
		queryBuilder.append( "select adl from EdeclAlbumDocList adl " );
		queryBuilder.append( "where adl.documentModeId = :docModeId" );
		
		return queryBuilder.toString( );
	}

	@Override
	public Map< String, Object > getQueryArgs( )
	{
		Map< String,Object > args = new HashMap< String, Object >( );
		args.put( "docModeId", _documentModeId );
		
		return args;
	}

}
