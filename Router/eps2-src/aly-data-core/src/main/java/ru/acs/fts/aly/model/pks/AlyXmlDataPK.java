package ru.acs.fts.aly.model.pks;

import java.io.Serializable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class AlyXmlDataPK implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String messageId;
	
	// @formatter:off
	public void setId( Integer id ) { this.id = id; }
	public Integer getId( ) { return id; }
	
	public void setMessageId( String messageId ) { this.messageId = messageId; }
	public String getMessageId( ) { return messageId; }
	// @formatter:on	
	
	public boolean equals( Object obj )
	{
		if ( obj == null )
			return false;
		
		if ( obj == this )
			return true;
		
		if ( obj.getClass( ) != getClass( ) )
			return false;
		
		AlyXmlDataPK pk = ( AlyXmlDataPK )obj;
		return new EqualsBuilder( )
				.append( id, pk.getId( ) )
				.append( messageId, pk.getMessageId( ) )
				.isEquals( );
	}

	public int hashCode( )
	{
		return new HashCodeBuilder( 17, 31 )
			.append( id )
			.append( messageId )
			.toHashCode( );
	}
}
