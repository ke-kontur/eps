package ru.acs.fts.eps2.model.entities;

import java.io.Serializable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class RzdSendCommandsId implements Serializable // NO_UCD (use default)
{
	private static final long serialVersionUID = 1L;
	
	private String envelopeId;
	private String documentId;	
	
	// @formatter:off
	public void setEnvelopeId( String envelopeId ) { this.envelopeId = envelopeId; }
	public String getEnvelopeId( ) { return envelopeId; }
	
	public void setDocumentId( String documentId ) { this.documentId = documentId; }
	public String getDocumentId( ) { return documentId; }
	// @formatter:on
	
	public RzdSendCommandsId( )
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
		
		RzdSendCommandsId id = ( RzdSendCommandsId )obj;
		return new EqualsBuilder( )
			.append( envelopeId, id.getEnvelopeId( ) )
			.append( documentId, id.getDocumentId( ) )
			.isEquals( );
	}

	public int hashCode( )
	{
		return new HashCodeBuilder( 17, 31 )
			.append( envelopeId )
			.append( documentId )
			.toHashCode( );
	}
	
}
