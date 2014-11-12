package ru.acs.fts.eps2.model.entities;

import javax.persistence.*;

@Entity
@Table( name = "EDECL_RESULT_INFO" )
public class Edecl_Result
{
	public Edecl_Result( )
	{

	}

	@Id
	@Column( name = "RES_ID" )
	@GeneratedValue( generator = "InvSeq" )
	@SequenceGenerator( name = "InvSeq", sequenceName = "RES_ID_SEQ", allocationSize = 1 )
	private long id;

	@Column( name = "RES_RESULTCODE", length = 12, nullable = false )
	private String resultCode;

	@Column( name = "RES_ENVELOPEID", length = 36, nullable = false )
	private String envelopeId;

	@Column( name = "RES_DOCUMENTID", length = 36 )
	private String documentId;

	// @formatter:off
	public void setId( long id ) { this.id = id; }
	public long getId( ) { return id; }
	
	public void setResultCode( String resultCode ) { this.resultCode = resultCode; }
	public String getResultCode( ) { return resultCode; }

	public void setEnvelopeId( String envelopeId ) { this.envelopeId = envelopeId; }
	public String getEnvelopeId( ) { return envelopeId; }

	public void setDocumentId( String documentId ) { this.documentId = documentId; }
	public String getDocumentId( ) { return documentId; }
	// @formatter:on
}
