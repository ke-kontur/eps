package ru.acs.fts.eps2.model.entities;

import java.io.Serializable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class ExtRtuRoutingIds implements Serializable // NO_UCD (use default)
{
	private static final long serialVersionUID = 1L;
	
	private String customCode;
	private int exchType;
	
	public ExtRtuRoutingIds( )
	{
		
	}
	
	public void setCustomCode( String customCode ) { this.customCode = customCode; }
	public String getCustomCode( ) { return customCode; }
	
	public void setExchType( int exchType ) { this.exchType = exchType; }
	public int getExchType( ) { return exchType; }
	
	public boolean equals( Object obj )
	{
		if ( obj == null )
			return false;
		
		if ( obj == this )
			return true;
		
		if ( obj.getClass( ) != getClass( ) )
			return false;
		
		ExtRtuRoutingIds ids = ( ExtRtuRoutingIds )obj;
		return new EqualsBuilder( )
			.append( customCode, ids.getCustomCode( ) )
			.append( exchType, ids.getExchType( ) )
			.isEquals( );
	}

	public int hashCode( )
	{
		return new HashCodeBuilder( 17, 31 )
			.append( customCode )
			.append( exchType )
			.toHashCode( );
	}
	
}
