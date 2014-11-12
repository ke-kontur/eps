package ru.acs.fts.eps2.model.services.conditions;

import java.util.HashMap;
import java.util.Map;

import ru.acs.fts.eps2.model.entities.Edecl_G44_Docmodid;

public class G44Condition extends AbstractSelectionCondition< Edecl_G44_Docmodid > 
{
	private String _docCode;
	private String _documentModeId;
	
	
	public G44Condition( String docCode, String documentModeId )
	{
		_docCode = docCode;
		_documentModeId = documentModeId;
	}
	
	@Override
	public boolean check( Edecl_G44_Docmodid g44relation )
	{
		boolean result = false;
		if ( null != g44relation )
		{
			String relDocCode = g44relation.getDocCode( );
			String relDocumentModeId = g44relation.getDocModeId( );
			
			result = compare( relDocCode, _docCode ) && compare( relDocumentModeId, _documentModeId );
		}
				
		return result;
	}

	@Override
	public String getQueryString( ) 
	{
		StringBuilder q = new StringBuilder( );
		q.append( "select rel from Edecl_G44_Docmodid rel " );
		q.append( "where rel.docCode = :docCode" );
			q.append( " and rel.docModeId = :documentModeId " );
		
		return q.toString( );
	}

	@Override
	public Map< String, Object > getQueryArgs( )
	{
		Map< String,Object > args = new HashMap< String, Object >( );
		args.put( "docCode", _docCode );
		args.put( "documentModeId", _documentModeId );
		
		return args;
	}

}
