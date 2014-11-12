package ru.acs.fts.eps2.model.entities;

import java.io.Serializable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class ProcParticipantAccessIds implements Serializable
{
	private static final long serialVersionUID = 1L;

	private String processId;
	private String participantId;
	private String softVersion;

	// @formatter:off
	public void setProcessId( String processId ) { this.processId = processId; }
	public String getProcessId( ) { return processId; }
	
	public void setParticipantId( String participantId ) { this.participantId = participantId; }
	public String getParticipantId( ) { return participantId; }
	
	public void setSoftVersion( String softVersion ) { this.softVersion = softVersion; }
	public String getSoftVersion( ) { return softVersion; }
	// @formatter:on

	public boolean equals( Object obj )
	{
		if ( obj == null )
			return false;
		
		if ( obj == this )
			return true;
		
		if ( obj.getClass( ) != getClass( ) )
			return false;
		
		ProcParticipantAccessIds ids = ( ProcParticipantAccessIds )obj;
		return new EqualsBuilder( )
			.append( processId, ids.getProcessId( ) )
			.append( participantId, ids.getParticipantId( ) )
			.append( softVersion, ids.getSoftVersion( ) )
			.isEquals( );
	}

	public int hashCode( )
	{
		return new HashCodeBuilder( 17, 31 )
			.append( processId )
			.append( participantId )
			.append( softVersion )
			.toHashCode( );
	}
}
