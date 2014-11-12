package ru.acs.fts.eps2.model.entities;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import java.io.Serializable;

/**
 * 
 * @author mrdekk
 *
 */
public class Edarch_Archive_Docs_Ids implements Serializable
{
	private static final long serialVersionUID = 1L;

	public Edarch_Archive_Docs_Ids( )
	{

	}

	private String ardocIdinternal;
	private String ardocArchIdinternal;

	public boolean equals( Object obj )
	{
		if ( obj == null )
			return false;
		
		if ( obj == this )
			return true;
		
		if ( obj.getClass( ) != getClass( ) )
			return false;
		
		Edarch_Archive_Docs_Ids ids = ( Edarch_Archive_Docs_Ids )obj;
		return new EqualsBuilder( )
				.append( ardocIdinternal, ids.getArdocIdinternal( ) )
				.append( ardocArchIdinternal, ids.getArdocArchIdinternal( ) )
				.isEquals( );
	}

	public int hashCode( )
	{
		return new HashCodeBuilder( 17, 31 ).append( ardocIdinternal )
				.append( ardocArchIdinternal ).toHashCode( );
	}

	public String getArdocArchIdinternal( ) { return ardocArchIdinternal; }
	public void setArdocArchIdinternal( String ardocArchIdinternal ) { this.ardocArchIdinternal = ardocArchIdinternal; }

	public String getArdocIdinternal( ) { return ardocIdinternal; }
	public void setArdocIdinternal( String ardocIdinternal ) { this.ardocIdinternal = ardocIdinternal; }

}
