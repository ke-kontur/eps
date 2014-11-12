package ru.acs.fts.eps2.model.entities;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import java.io.Serializable;

/**
 * User: CAA
 * Date: 28.12.2012
 * Time: 12:00
 */

public class Edarch_Read_Access_Ids implements Serializable
{
	private static final long serialVersionUID = 1L;

	public Edarch_Read_Access_Ids( )
	{

	}

	private String participantId;
	private String idInternal;
	private String archIdInternal;

	public boolean equals( Object obj )
	{
		if ( obj == null )
			return false;
		
		if ( obj == this )
			return true;
		
		if ( obj.getClass( ) != getClass( ) )
			return false;
		
		Edarch_Read_Access_Ids ids = ( Edarch_Read_Access_Ids )obj;
		return new EqualsBuilder( )
				.append( participantId, ids.getParticipantId( ) )
				.append( idInternal, ids.getIdInternal( ) )
				.append( archIdInternal, ids.getArchIdInternal( ) ).isEquals( );
	}

	public int hashCode( )
	{
		return new HashCodeBuilder( 17, 31 ).append( participantId )
				.append( idInternal ).append( archIdInternal ).toHashCode( );
	}

	public String getParticipantId( ) { return participantId; }
	public void setParticipantId( String participantId ) { this.participantId = participantId; }
	
	public String getIdInternal( ) { return idInternal; }
	public void setIdInternal( String idInternal ) { this.idInternal = idInternal; }

	public String getArchIdInternal( ) { return archIdInternal; }
	public void setArchIdInternal( String archIdInternal ) { this.archIdInternal = archIdInternal; }
}
