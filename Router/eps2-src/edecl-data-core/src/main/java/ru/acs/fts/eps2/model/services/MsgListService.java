package ru.acs.fts.eps2.model.services;

import java.util.List;

import ru.acs.fts.eps2.model.entities.EdeclMsgList;
import ru.acs.fts.eps2.model.services.conditions.ISelectionCondition;
import ru.acs.fts.eps2.model.services.conditions.MsgListCondition;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;

public class MsgListService extends AbstractCachedService< EdeclMsgList > 
{
	@Override
	public Class< EdeclMsgList > getEntityClass( ) 
	{
		return EdeclMsgList.class;
	}
	
	public EdeclMsgList getMsgList( String messageType )
		throws DatabaseException
	{
		ISelectionCondition< EdeclMsgList > condition = new MsgListCondition( messageType );
		EdeclMsgList errList = null;
		List< EdeclMsgList > errs = super.find( condition );
		if ( null != errs && ! errs.isEmpty( ) )
			errList = errs.get( 0 );
		
		return errList;
	}
}
