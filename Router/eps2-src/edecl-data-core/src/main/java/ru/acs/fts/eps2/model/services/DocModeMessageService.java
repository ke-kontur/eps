package ru.acs.fts.eps2.model.services;

import java.util.HashMap;
import java.util.Map;

import ru.acs.fts.eps2.model.entities.Edecl_Docmodeid_Msgtype;
import ru.acs.fts.eps2.model.services.conditions.AbstractSelectionCondition;
import ru.acs.fts.eps2.model.services.conditions.ISelectionCondition;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;

public class DocModeMessageService extends AbstractCachedService< Edecl_Docmodeid_Msgtype >
{
	@Override
	public Class< Edecl_Docmodeid_Msgtype > getEntityClass( )
	{
		return Edecl_Docmodeid_Msgtype.class;
	}
	
	public boolean isDocModeMessageExists( String docModeId, String messageType )
		throws DatabaseException
	{
		ISelectionCondition< Edecl_Docmodeid_Msgtype > condition = 
			new DocModeMessageSelectionCondition( docModeId, messageType );
		
		return exists( condition );
	}
	
	private static class DocModeMessageSelectionCondition 
		extends AbstractSelectionCondition< Edecl_Docmodeid_Msgtype >
	{
		private String _documentModeId;
		private String _messageType;
		
		public DocModeMessageSelectionCondition( String documentModeId, String messageType )
		{
			_documentModeId = documentModeId;
			_messageType = messageType;
		}
		
		@Override
		public boolean check( Edecl_Docmodeid_Msgtype object )
		{
			boolean result = false;
			if ( null != object )
			{
				result = compare( object.getDocModeId( ), _documentModeId )
						&& compare( object.getMsgType( ), _messageType );
			}
			
			return result;
		}

		@Override
		public String getQueryString( )
		{
			StringBuilder query = new StringBuilder( "select dm from Edecl_Docmodeid_Msgtype dm" );
			query.append( " where dm.docModeId = :docModeId" );
			query.append( " and dm.msgType = :msgType" );
			
			return query.toString( );
		}

		@Override
		public Map< String, Object > getQueryArgs( )
		{
			Map< String, Object > args = new HashMap< String, Object >( );
			args.put( "docModeId", _documentModeId );
			args.put( "msgType", _messageType );
			
			return args;
		}
	}
}
