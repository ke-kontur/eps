package ru.acs.fts.aly.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "ALY_MESSAGES" )
public class AlyMessage
{
	@Id
	@Column( name = "AMSG_ID", length = 36, nullable = false )
	private String id;
	
	@Column( name = "AMSG_ENVELOPE_ID", length = 36, nullable = false )
	private String envelopeId;
	
	@Column( name = "AMSG_DOCUMENT_ID", length= 36, nullable = false )
	private String documentId;
	
	@Column( name = "AMSG_PROCESS_ID", length = 36, nullable = false )
	private String processId;
	
	@Column( name = "AMSG_SOFT_VERSION", length = 100, nullable = false )
	private String softVersion;
	
	// @formatter:off
	public void setId( String id ) { this.id = id; }
	public String getId( ) { return id; }
	
	public void setEnvelopeId( String envelopeId ) { this.envelopeId = envelopeId; }
	public String getEnvelopeId( ) { return envelopeId; }
	
	public void setDocumentId( String documentId ) { this.documentId = documentId; }
	public String getDocumentId( ) { return documentId; }
	
	public void setProcessId( String processId ) { this.processId = processId; }
	public String getProcessId( ) { return processId; }
	
	public void setSoftVersion( String softVersion ) { this.softVersion = softVersion; }
	public String getSoftVersion( ) { return softVersion; }
	// @formatter:on
}
