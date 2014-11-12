package ru.acs.fts.eps2.ws.data.model.services;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.orm.jpa.JpaTemplate;
import org.springframework.transaction.annotation.Transactional;

import ru.acs.fts.eps2.ws.data.model.entities.Envelope;

@SuppressWarnings( "deprecation" ) 
public class EnvelopeService
{
	private BaseStorage< Envelope > _envelopesStorage;
	
	// @formatter:off
	@Required
	public void setJpaTemplate( JpaTemplate jpaTemplate )
	{
		_envelopesStorage.setJpaTemplate( jpaTemplate );
	}
	public JpaTemplate getJpaTemplate( ) { return _envelopesStorage.getJpaTemplate( ); }
	// @formatter:on
	
	public EnvelopeService( )
	{
		_envelopesStorage = new BaseStorage< Envelope >( Envelope.class );		
	}

	@Transactional
	public Envelope findById( String envelopeId )
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select e from Envelope e " );
		q.append( "where e.envelopeId = :envelopeId " );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "envelopeId", envelopeId );
		
		List< Envelope > res = _envelopesStorage.select( q.toString( ), args );
		if ( null == res || 0 == res.size( ) )
			return null;
		
		return res.get( 0 );
	}
	
	@Transactional
	public List< Envelope > findMatchById( String envelopeId )
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select e from Envelope e " );
		q.append( "where UPPER( e.envelopeId ) like :envelopeId " );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "envelopeId", String.format( "%s%%", envelopeId.toUpperCase( ) ) );
		
		List< Envelope > res = _envelopesStorage.select( q.toString( ), args );
		if ( null == res || 0 == res.size( ) )
			return null;
		
		return res;
	}
	
	@Transactional
	public List< Envelope > findByInitialId( String initialEnvelopeId )
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select e from Envelope e " );
		q.append( "where e.initialEnvelopeId = :initialEnvelopeId " );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "initialEnvelopeId", initialEnvelopeId );
		
		List< Envelope > res = _envelopesStorage.select( q.toString( ), args );
		if ( null == res )
			return new ArrayList< Envelope >( );
		
		return res;		
	}

	@Transactional
	public List< Envelope > findByIncomeId( String incomeEnvelopeId )
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select e from Envelope e " );
		q.append( "where e.incomeEnvelopeId = :incomeEnvelopeId " );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "incomeEnvelopeId", incomeEnvelopeId );
		
		List< Envelope > res = _envelopesStorage.select( q.toString( ), args );
		if ( null == res )
			return new ArrayList< Envelope >( );
		
		return res;		
	}

	@Transactional
	public List< Envelope > findByRefs( String envelopeId )
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select e from Envelope e " );
		q.append( "where e.incomeEnvelopeId = :envelopeId " );
			q.append( " or e.initialEnvelopeId = :envelopeId " );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "envelopeId", envelopeId );
		
		List< Envelope > res = _envelopesStorage.select( q.toString( ), args );
		if ( null == res )
			return new ArrayList< Envelope >( );
		
		return res;		
	}
	
	@Transactional
	public List< Envelope > findByProcedureId( String processId )
	{
		StringBuilder q = new StringBuilder( );
		
		q.append( "select e from Envelope e " );
		q.append( "where e.processId = :processId " );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "processId", processId );
		
		List< Envelope > res = _envelopesStorage.select( q.toString( ), args );
		if ( null == res )
			return new ArrayList< Envelope >( );
		
		return res;
	}
	
	@Transactional
	public List< Envelope > findByInitialOrIncomeEnvelopes( List< Envelope > envelopes, boolean useRefs )
	{
		List< Envelope > res = new ArrayList< Envelope >( );
		res.addAll( envelopes );
		
		Set< String > ids = new HashSet< String >( );
		Set< String > checked = new HashSet< String >( );
		
		List< Envelope > bckp = new ArrayList< Envelope >( );
		
		for ( Envelope env : envelopes )
		{
			ids.add( env.getEnvelopeId( ) );
		}
		
		boolean require = false;
		
		do
		{
			require = false;
			
			for ( Envelope env : res )
			{
				String initialId = env.getInitialEnvelopeId( );
				if ( ! ids.contains( initialId ) )
				{			
					Envelope e = _envelopesStorage.get( initialId );
					if ( null != e )
					{
						bckp.add( e );
						ids.add( initialId );
						
						require = true;
					}
				}
				
				String incomeId = env.getIncomeEnvelopeId( );
				if ( ! ids.contains( incomeId ) )
				{
					Envelope e = _envelopesStorage.get( incomeId );
					if ( null != e )
					{
						bckp.add( e );
						ids.add( incomeId );
						
						require = true;
					}
				}

				if ( useRefs )
				{
					String envId = env.getEnvelopeId( );
					if ( ! checked.contains( envId ) )
					{
						checked.add( envId );
						
						List< Envelope > inits = findByRefs( envId );
						for ( Envelope init : inits )
						{
							if ( ! ids.contains( init.getEnvelopeId( ) ) )
							{
								bckp.add( init );
								ids.add( init.getEnvelopeId( ) );
										
								require = true;
							}
						}									
					}			
				}
			}
						
			res.addAll( bckp );
			bckp.clear( );
		} while ( require );
		
		return res;
	}
	
	@SuppressWarnings( "unchecked" )
	@Transactional
	public List< String > getCmn11033IdsWithoutRzdCommand( Calendar date )
	{
		StringBuilder query = new StringBuilder( "select env.envelopeId from Envelope env where env.messageType = 'CMN.11033' and env.incomeEnvelopeId is null" );
		query.append( " and env.receiveDate >= :date" );
		query.append( " and not exists ( select com from RzdCommand com where com.envelopeId = env.envelopeId and env.documentId = com.documentId )" );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "date", date );
		
		return ( List< String > )_envelopesStorage.selectSpecial( query.toString( ), args );
	}
}
