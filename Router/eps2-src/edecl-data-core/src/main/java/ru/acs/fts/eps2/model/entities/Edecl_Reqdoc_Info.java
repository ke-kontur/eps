package ru.acs.fts.eps2.model.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@IdClass( Edecl_Reqdoc_Info_Ids.class )
@Table( name = "EDECL_REQDOC_INFO" )
public class Edecl_Reqdoc_Info implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	public static final int FLAG_ALLOWED_AFTER_ISSUE = 0x00000001;

    public static final int FLAG_ALLOWED_GRAPHIC = 0x00000010;

	public Edecl_Reqdoc_Info( )
	{

	}

	@Id
	@Column( name = "RDI_ENVELOPEID", length = 36, nullable = false )
	private String envelopeId;
	
	@Id
	@Column( name = "RDI_REQDOCID", length = 36, nullable = false )
	private String reqDocId;
	
	@Id
	@Column( name = "RDI_POSITIONID", length = 36, nullable = false )
	private String positionId;

	@Column( name = "RDI_DOCCODE", length = 5, nullable = false )
	private String docCode;
	
	@Column( name = "RDI_DOCNAME", length = 250 )
	private String DocName;
	
	@Column( name = "RDI_FLAGS", nullable = false )
	private int flags = 0;

	// @formatter:off
	public void setEnvelopeId( String envelopeId ) { this.envelopeId = envelopeId; }
	public String getEnvelopeId( ) { return envelopeId; }

	public void setReqDocId( String reqDocId ) { this.reqDocId = reqDocId; }
	public String getReqDocId( ) { return reqDocId; }

	public void setPositionId( String positionId ) { this.positionId = positionId; }
	public String getPositionId( ) { return positionId; }

	public void setDocCode( String docCode ) { this.docCode = docCode; }
	public String getDocCode( ) { return docCode; }

	public void setDocName( String docName ) { DocName = docName; }
	public String getDocName( ) { return DocName; }
	
	public void setFlags( int flags ) { this.flags = flags; }
	public int getFlags( ) { return flags; }
	// @formatter:on
}
