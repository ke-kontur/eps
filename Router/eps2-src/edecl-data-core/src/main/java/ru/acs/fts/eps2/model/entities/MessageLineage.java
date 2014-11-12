package ru.acs.fts.eps2.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass( MessageLineageIds.class )
@Table( name = "EDECL_MSG_LINEAGE" )
public class MessageLineage
{
	@Id
	@Column( name = "LA_ENVELOPE_ID", length = 36, nullable = false )
	private String envelopeId;
	
	@Id
	@Column( name = "LA_LINEAGE_ID", length = 36, nullable = false )
	private String lineageId;
	
	// @formatter:off
	public void setEnvelopeId( String envelopeId ) { this.envelopeId = envelopeId; }
	public String getEnvelopeId( ) { return envelopeId; }
	
	public void setLineageId( String lineageId ) { this.lineageId = lineageId; }
	public String getLineageId( ) { return lineageId; }
	// @formatter:on
}
