package ru.acs.fts.eps2.failedMessages.persistence.services;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

import org.springframework.orm.jpa.JpaTemplate;

import ru.acs.fts.eps2.failedMessages.exceptions.StorageException;
import ru.acs.fts.eps2.failedMessages.persistence.entities.Envelope;

@SuppressWarnings( "deprecation" )
public class MessageService implements IPersistenceService
{
	private BaseStorage< Envelope > _messageStorage;
	
	public MessageService( )
	{
		_messageStorage = new BaseStorage< Envelope >( Envelope.class );
	}
	
	@Override
	public void setJpaTemplate( JpaTemplate jpaTemplate )
	{
		_messageStorage.setJpaTemplate( jpaTemplate );
	}

	@Override
	public JpaTemplate getJpaTemplate( )
	{
		return _messageStorage.getJpaTemplate( );
	}
	
	public Envelope getMessage( String envelopeId )
	{
		return _messageStorage.get( envelopeId );
	}
	
	public void mergeMessage( Envelope envelope ) 
		throws StorageException
	{
		_messageStorage.executeMergeAndFlush( envelope );
	}
	
	public void updateMessage( String envelopeId, Calendar msgDate, boolean fillCoa, boolean fillCod ) 
		throws StorageException
	{
		if ( fillCoa || fillCod )
		{
			StringBuilder query = new StringBuilder( "update Envelope e set " );
			Map< String, Object > args = new HashMap< String, Object >( );
			args.put( "envelopeId", envelopeId );
			args.put( "msgDate", msgDate );
			args.put( "nowDate", GregorianCalendar.getInstance( ) );
			
			if ( fillCoa )
			{
				query.append( " e.coaDatetime = :msgDate, e.coaSaveDatetime = :nowDate" );
			}
			
			if ( fillCod )
			{
				if ( fillCoa )
					query.append( "," );
				query.append( " e.codDatetime = :msgDate, e.codSaveDatetime = :nowDate" );
			}
			
			query.append( " where e.envelopeId = :envelopeId" );
			
			_messageStorage.executeUpdateRequest( query.toString( ), args );
		}
	}
}
