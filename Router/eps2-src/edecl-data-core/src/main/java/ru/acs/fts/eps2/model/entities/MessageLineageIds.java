package ru.acs.fts.eps2.model.entities;

import java.io.Serializable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class MessageLineageIds implements Serializable
{
	private static final long serialVersionUID = 1L;

	private String envelopeId;
	private String lineageId;
	
	// @formatter:off
	public void setEnvelopeId( String envelopeId ) { this.envelopeId = envelopeId; }
	public String getEnvelopeId( ) { return envelopeId; }
	
	public void setLineageId( String lineageId ) { this.lineageId = lineageId; }
	public String getLineageId( ) { return lineageId; }
	// @formatter:on
	
	public MessageLineageIds( )
	{
		
	}
	
	public boolean equals( Object obj )
	{
		if ( obj == null )
			return false;
		
		if ( obj == this )
			return true;
		
		if ( obj.getClass( ) != getClass( ) )
			return false;
		
		MessageLineage id = ( MessageLineage )obj;
		return new EqualsBuilder( )
			.append( envelopeId, id.getEnvelopeId( ) )
			.append( lineageId, id.getLineageId( ) )
			.isEquals( );
	}

	public int hashCode( )
	{
		return new HashCodeBuilder( 17, 31 )
			.append( envelopeId )
			.append( lineageId )
			.toHashCode( );
	}
	
}
