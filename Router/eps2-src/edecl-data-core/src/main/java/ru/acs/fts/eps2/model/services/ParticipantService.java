package ru.acs.fts.eps2.model.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.orm.jpa.JpaTemplate;

import ru.acs.fts.eps2.model.entities.Edecl_Participant;
import ru.acs.fts.eps2.model.entities.Edecl_Wmqaddress;
import ru.acs.fts.eps2.model.entities.Edmac_Organization;
import ru.acs.fts.eps2.model.entities.Edmac_Person;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;

@SuppressWarnings( "deprecation" )
public class ParticipantService implements IGenericService
{
	private BaseStorage< Edecl_Participant > _edeclParticipants;
	private BaseStorage< Edmac_Organization > _edmacOrganizations;
	private BaseStorage< Edmac_Person > _edmacPersons;
	
    private Edecl_Wmqaddress _extGateTransmissionAddress;
    
    @Required
    public void setExtGateTransmissionAddress( Edecl_Wmqaddress extGateTransmissionAddress ) { _extGateTransmissionAddress = extGateTransmissionAddress; }
    public Edecl_Wmqaddress getExtGateTransmissionAddress( ) { return _extGateTransmissionAddress; }
	
	public ParticipantService( )
	{
		_edeclParticipants = new BaseStorage< Edecl_Participant >( Edecl_Participant.class );
		_edmacOrganizations = new BaseStorage< Edmac_Organization >( Edmac_Organization.class );
		_edmacPersons = new BaseStorage< Edmac_Person >( Edmac_Person.class );
	}

	@Override
	public void setJpaTemplate( JpaTemplate jpaTemplate )
	{
		_edeclParticipants.setJpaTemplate( jpaTemplate );
		_edmacOrganizations.setJpaTemplate( jpaTemplate );
		_edmacPersons.setJpaTemplate( jpaTemplate );
	}

	@Override
	public JpaTemplate getJpaTemplate( )
	{
		return _edeclParticipants.getJpaTemplate( );
	}

	public Edecl_Participant getParticipant( String participantId )
		throws DatabaseException
	{
		return _edeclParticipants.get( participantId );
	}
	
	public Edmac_Organization getOrganization( String orgId )
		throws DatabaseException
	{
		return _edmacOrganizations.get( orgId );
	}
	
	public Edmac_Person getPerson( String personId )
		throws DatabaseException
	{
		return _edmacPersons.get( personId );
	}
	
	public void merge( Edecl_Participant participant ) 
		throws DatabaseException
	{
		_edeclParticipants.mergeAndFlush( participant );
	}
	
	public void merge( Edmac_Organization org )
		throws DatabaseException
	{
		_edmacOrganizations.mergeAndFlush( org );
	}
	
	public void merge( Edmac_Person person ) 
		throws DatabaseException
	{
		_edmacPersons.mergeAndFlush( person );
	}

	public Edecl_Participant getParticipantBySvhLicNum( String svhLicNum )
		throws DatabaseException
	{
		StringBuilder q = new StringBuilder( );

		q.append( "select p from Edecl_Participant p " );
		q.append( "where p.svhLicNum = :svhLicNum " );

		Map< String, Object > args = new HashMap< String, Object >( );
		args.put( "svhLicNum", svhLicNum );

		List< Edecl_Participant > res = _edeclParticipants.select( q.toString( ), args );
		if ( null == res || 0 == res.size( ) )
			return null;
		
		return res.get( 0 );
	}
	
	public boolean isParticipantExists( String participantId )
		throws DatabaseException
	{
		return null != getParticipant( participantId );
	}
}
