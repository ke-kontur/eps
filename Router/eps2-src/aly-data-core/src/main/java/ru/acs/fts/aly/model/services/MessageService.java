package ru.acs.fts.aly.model.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.orm.jpa.JpaTemplate;

import ru.acs.fts.aly.model.entities.AlyMessage;
import ru.acs.fts.aly.model.entities.AlyXmlData;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;

@SuppressWarnings( "deprecation" )
public class MessageService implements IGenericService
{
	private BaseStorage< AlyMessage > _messagesStorage;
	private BaseStorage< AlyXmlData > _xmlDatasStorage;
	
	public MessageService( )
	{
		_messagesStorage = new BaseStorage< AlyMessage >( AlyMessage.class );
		_xmlDatasStorage = new BaseStorage< AlyXmlData >( AlyXmlData.class );
	}
	
	@Override
	public void setJpaTemplate( JpaTemplate jpaTemplate )
	{
		_messagesStorage.setJpaTemplate( jpaTemplate );
		_xmlDatasStorage.setJpaTemplate( jpaTemplate );
	}
	
	@Override
	public JpaTemplate getJpaTemplate( )
	{
		return _messagesStorage.getJpaTemplate( );
	}	
	
	// merges
	
	public void merge( AlyMessage msg ) 
		throws DatabaseException
	{
		_messagesStorage.mergeAndFlush( msg );
	}
	
	public void merge( AlyXmlData xmlData )
		throws DatabaseException
	{
		_xmlDatasStorage.mergeAndFlush( xmlData );
	}
	
	// persists
	
	public void persist( AlyMessage msg )
		throws DatabaseException
	{
		_messagesStorage.persistAndFlush( msg );		
	}
	
	public void persist( AlyXmlData xmlData )
		throws DatabaseException
	{
		_xmlDatasStorage.persistAndFlush( xmlData );
	}
	
	public void persist( List< AlyXmlData > xmlDatas ) 
		throws DatabaseException
	{
		for ( AlyXmlData data : xmlDatas )
		{
			_xmlDatasStorage.persist( data );
		}
		
		_xmlDatasStorage.flush( );
	}
	
	// requests
	
	public AlyMessage getMessage( String messageId ) 
		throws DatabaseException
	{
		return _messagesStorage.get( messageId );
	}
	
	public List< AlyMessage > searchMessages( String query, int offset, int limit ) 
		throws DatabaseException
	{
		StringBuilder q = new StringBuilder( );

		q.append( "select am from AlyMessage am, AlyXmlData axd " );
		q.append( "where am.id = axd.messageId " );
			q.append( "and axd.tagValue like :query " );
		q.append( "group by am " );
			
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "query", String.format( "%%%s%%", query ) );
		
		List< AlyMessage > res = _messagesStorage.selectSlice( q.toString( ), args, offset, limit );
		if ( null == res )
			return new ArrayList< AlyMessage >( );
		
		return res;
	}
	
	public List< AlyXmlData > getDocumentByMsgId( String messageId ) 
		throws DatabaseException
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select axd from AlyXmlData axd " );
		q.append( "where axd.messageId = :messageId " );
		q.append( "order by axd.id " );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "messageId", messageId );
		
		List< AlyXmlData > res = _xmlDatasStorage.select( q.toString( ), args );
		if ( null == res )
			return new ArrayList< AlyXmlData >( );
		
		return res;		
	}
	
	public List< AlyXmlData > getDocument( String documentId ) 
		throws DatabaseException
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select am from AlyMessage am " );
		q.append( "where am.documentId = :documentId " );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "documentId", documentId );
		
		List< AlyMessage > msgs = _messagesStorage.select( q.toString( ), args );
		if ( null == msgs || 0 == msgs.size( ) )
			return new ArrayList< AlyXmlData >( );
		
		String msgId = msgs.get( 0 ).getId( );

		return getDocumentByMsgId( msgId );
	}
	
	public List< AlyXmlData > getDocumentIndirect( String documentId ) 
		throws DatabaseException
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select axd from AlyXmlData axd " );
		q.append( "where axd.tagName = 'DocumentID' " );
		q.append( "and axd.tagValue like :documentId " );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "documentId", "%" + documentId );
		
		List< AlyXmlData > srch = _xmlDatasStorage.select( q.toString( ), args );
		if ( null == srch || srch.isEmpty( ) )
			return new ArrayList< AlyXmlData >( );
		
		String msgId = srch.get( 0 ).getMessageId( );
		
		return getDocumentByMsgId( msgId );
	}
	
	public List< AlyXmlData > getNotifGTDRegistrationByRefDocId( String documentId )
		throws DatabaseException
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select axd2 from AlyXmlData axd, AlyXmlData axd2 " );
		q.append( "where axd.tagName = 'RefDocumentID' " );
			q.append( "and axd.tagValue = :documentId " );
			q.append( "and axd2.tagName = 'NotifGTDRegistration' " );
			q.append( "and axd.messageId = axd2.messageId " );
			q.append( "and axd2.id = axd.tagParent " );
			
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "documentId", documentId );
		
		List< AlyXmlData > srchs = _xmlDatasStorage.select( q.toString( ), args );
		if ( null == srchs || srchs.isEmpty( ) )
			return null;
		
		AlyXmlData srch = srchs.get( 0 );
		
		return getDocumentByMsgId( srch.getMessageId( ) );
	}
	
	public String getRefDocumentIDIndirect( String documentId )
		throws DatabaseException
	{
		StringBuilder q = new StringBuilder( );
		
		
		q.append( "select axd from AlyXmlData axd " );
		q.append( "where axd.tagName = 'DocumentID' " );
		q.append( "and axd.tagValue like :documentId " );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "documentId", "%" + documentId );
		
		List< AlyXmlData > srch = _xmlDatasStorage.select( q.toString( ), args );
		if ( null == srch || srch.isEmpty( ) )
			return null;

		for ( AlyXmlData rec : srch )
		{
			String msgId = rec.getMessageId( );
			Integer parentId = rec.getTagParent( );
			
			q = new StringBuilder( );
			
			q.append( "select axd from AlyXmlData axd " );
			q.append( "where axd.tagName = 'RefDocumentID' " );
				q.append( "and axd.tagParent = :parentId " );
				q.append( "and axd.messageId = :messageId " );
				
			args = new HashMap< String, Object >( );
			args.put( "parentId", parentId );
			args.put( "messageId", msgId );
			
			srch = _xmlDatasStorage.select( q.toString( ), args );
			if ( null == srch || srch.isEmpty( ) )
				continue;
			
			AlyXmlData xrec = srch.get( 0 );
			
			return xrec.getTagValue( );
		}
		
		return null;
	}
}
