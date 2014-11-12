package ru.acs.fts.eps2.model.entities;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import java.io.Serializable;

public class Edarch_Reqinfo_Ids implements Serializable // NO_UCD (use default)
{
	private static final long serialVersionUID = 1L;

	public Edarch_Reqinfo_Ids( )
	{

	}

	private String reqEnvId;
	private String idInternal;
	private String ardocIdInternal;

	public boolean equals( Object obj )
	{
		if ( obj == null )
			return false;
		
		if ( obj == this )
			return true;
		
		if ( obj.getClass( ) != getClass( ) )
			return false;
		
		Edarch_Reqinfo_Ids ids = ( Edarch_Reqinfo_Ids )obj;
		return new EqualsBuilder( ).append( reqEnvId, ids.getReqEnvId( ) )
				.append( idInternal, ids.getIdInternal( ) )
				.append( ardocIdInternal, ids.getArdocIdInternal( ) )
				.isEquals( );
	}

	public int hashCode( )
	{
		return new HashCodeBuilder( 17, 31 ).append( reqEnvId )
				.append( idInternal ).append( ardocIdInternal ).toHashCode( );
	}

	public String getReqEnvId( ) { return reqEnvId; }
	public void setReqEnvId( String reqEnvId ) { this.reqEnvId = reqEnvId; }

	public String getIdInternal( ) { return idInternal; }
	public void setIdInternal( String idInternal ) { this.idInternal = idInternal; }

	public String getArdocIdInternal( ) { return ardocIdInternal; }
	public void setArdocIdInternal( String ardocIdInternal ) { this.ardocIdInternal = ardocIdInternal; }
}
