package ru.acs.fts.aud.command.dispatcher.shared;

import java.util.ArrayList;
import java.util.List;

import ru.acs.fts.aud.management.model.entities.EdeclAudCommand;
import ru.acs.fts.aud.management.model.entities.EdeclAudDocInfo;

public class AudCommandCreationContext
{
	private EdeclAudCommand _audCommand;
	private List< EdeclAudDocInfo > _docInfos = new ArrayList< EdeclAudDocInfo >( );
	
	// @formatter:off
	public void setAudCommand( EdeclAudCommand audCommand ) { _audCommand = audCommand; }
	public EdeclAudCommand getAudCommand( ) { return _audCommand; }
	
	public void setDocInfos( List< EdeclAudDocInfo > docInfos ) { _docInfos = docInfos; }
	public List< EdeclAudDocInfo > getDocInfos( ) { return _docInfos; }
	// @formatter:on
	
	public EdeclAudDocInfo getMainDoc( )
	{
		for ( EdeclAudDocInfo doc : _docInfos )
		{
			if ( doc.getRefMainDoc( ).equalsIgnoreCase( doc.getDocumentId( ) ) )
				return doc;
		}
		
		return null;
	}
	
	public EdeclAudDocInfo getDocumentByDocumentModeId( String documentModeId )
	{
		for ( EdeclAudDocInfo doc : _docInfos )
		{
			if ( doc.getDocumentModeId( ).equalsIgnoreCase( documentModeId ) )
				return doc;
		}
		
		return null;
	}
}
