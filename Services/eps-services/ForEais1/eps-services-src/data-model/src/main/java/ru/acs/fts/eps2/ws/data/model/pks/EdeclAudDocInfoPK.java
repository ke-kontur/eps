package ru.acs.fts.eps2.ws.data.model.pks;

import java.io.Serializable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class EdeclAudDocInfoPK implements Serializable
{
	private static final long serialVersionUID = 1L;

	private String documentId;
	private String refMainDoc;
	private String cmdRefGuid;

	// @formatter:off
	public void setDocumentId( String documentId ) { this.documentId = documentId; }
	public String getDocumentId( ) { return documentId; }
	
	public void setRefMainDoc( String refMainDoc ) { this.refMainDoc = refMainDoc; }
	public String getRefMainDoc( ) { return refMainDoc; }

	public void setCmdRefGuid( String cmdRefGuid ) { this.cmdRefGuid = cmdRefGuid; }
	public String getCmdRefGuid( ) { return cmdRefGuid; }
	// @formatter:on
	
	public boolean equals( Object obj )
	{
		if ( obj == null ) return false;
		if ( obj == this ) return true;
		if ( obj.getClass( ) != getClass( ) ) return false;
		
		EdeclAudDocInfoPK pk = ( EdeclAudDocInfoPK )obj;
		
		return new EqualsBuilder( )
			.append( documentId, pk.documentId )
			.append( refMainDoc, pk.refMainDoc )
			.append( cmdRefGuid, pk.cmdRefGuid )
			.isEquals( );
	}

	public int hashCode( )
	{
		return new HashCodeBuilder( 17, 31 )
			.append( documentId )
			.append( refMainDoc )
			.append( cmdRefGuid )
			.toHashCode( );
	}
}
