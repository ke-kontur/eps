package ru.acs.fts.eps2.model.services;

import java.util.List;

import ru.acs.fts.eps2.model.entities.EdeclAlbumDocList;
import ru.acs.fts.eps2.model.services.conditions.AlbumDocListCondition;
import ru.acs.fts.eps2.model.services.conditions.ISelectionCondition;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;

public class AlbumDocListService extends AbstractCachedService< EdeclAlbumDocList > 
{
	@Override
	public Class< EdeclAlbumDocList > getEntityClass( ) 
	{
		return EdeclAlbumDocList.class;
	}
	
	public EdeclAlbumDocList getAlbumDocList( String documentModeId )
		throws DatabaseException
	{
		ISelectionCondition< EdeclAlbumDocList > condition = new AlbumDocListCondition( documentModeId );
		EdeclAlbumDocList errList = null;
		List< EdeclAlbumDocList > errs = super.find( condition );
		if ( null != errs && ! errs.isEmpty( ) )
			errList = errs.get( 0 );
		
		return errList;
	}
}
