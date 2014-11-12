package ru.acs.fts.eps2.model.entities;

import java.io.Serializable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class ExtEadManifestIds implements Serializable
{
	private static final long serialVersionUID = 1L;
	
    private String requestEnvelopeId;
	private String requestLineId;
	
	public ExtEadManifestIds( )
	{
		
	}

	public void setRequestEnvelopeId( String requestEnvelopeId ) { this.requestEnvelopeId = requestEnvelopeId; }
	public String getRequestEnvelopeId( ) { return requestEnvelopeId; }
	
	public void setRequestLineId( String requestLineId ) { this.requestLineId = requestLineId; }
	public String getRequestLineId( ) { return requestLineId; }
	
	public boolean equals( Object obj )
	{
		if ( obj == null )
			return false;
		
		if ( obj == this )
			return true;
		
		if ( obj.getClass( ) != getClass( ) )
			return false;
		
		ExtEadManifestIds ids = ( ExtEadManifestIds )obj;
		return new EqualsBuilder( )
			.append( requestEnvelopeId, ids.getRequestEnvelopeId( ) )
			.append( requestLineId, ids.getRequestLineId( ) )
			.isEquals( );
	}

	public int hashCode( )
	{
		return new HashCodeBuilder( 17, 31 )
			.append( requestEnvelopeId )
			.append( requestLineId )
			.toHashCode( );
	}
	
}
