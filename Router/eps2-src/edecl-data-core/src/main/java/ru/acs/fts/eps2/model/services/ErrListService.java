package ru.acs.fts.eps2.model.services;

import java.util.List;

import ru.acs.fts.eps2.model.entities.Edecl_Errlist;
import ru.acs.fts.eps2.model.services.conditions.ErrListCondition;
import ru.acs.fts.eps2.model.services.conditions.ISelectionCondition;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;

public class ErrListService extends AbstractCachedService< Edecl_Errlist > 
{
	@Override
	public Class< Edecl_Errlist > getEntityClass( ) 
	{
		return Edecl_Errlist.class;
	}
	
	public Edecl_Errlist getErrList( String errorCode )
		throws DatabaseException
	{
		ISelectionCondition< Edecl_Errlist > condition = new ErrListCondition( errorCode );
		Edecl_Errlist errList = null;
		List< Edecl_Errlist > errs = super.find( condition );
		if ( null != errs && ! errs.isEmpty( ) )
			errList = errs.get( 0 );
		
		return errList;
	}
	
	public String getErrorMessage( String errorCode )
		throws DatabaseException
	{
		String message = "";
		Edecl_Errlist errList = getErrList( errorCode );
		
		if ( null != errList )
			message = errList.getPublicDescription( );
		
		return message;
	}
}
