package ru.acs.fts.eps2.ws.data.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table( name = "EDECL_RZD_SENDCOMMANDS" )
public class RzdCommand
{
	@Id
	@Column( name = "RZDCMD_ENVELOPEID", length = 36 )
	private String envelopeId;
	
	@Id
	@Column( name = "RZDCMD_DOCUMENTID", length = 36 )
	private String documentId;
	
	@Column( name = "RZDCMD_PROCESSID", length = 36, nullable = false )
	private String processId;
	
	@Column( name = "RZDCMD_PARTICIPANTID", length = 100, nullable = true )
	private String participantId;
	
	@Column( name = "RZDCMD_CUSTOMSCODE", length = 30, nullable = true )
	private String customsCode;
	
	@Column( name = "RZDCMD_SOFTVERSION", length = 100, nullable = false )
	private String softVersion;
	
	@Column( name = "RZDCMD_ESADID", length = 36, nullable = true )
	private String esadId;
	
	@Column( name = "RZDCMD_STATUS", length = 100, nullable = true )
	private String status;
	
	@Lob
	@Column( name = "RZDCMD_ERROR", length = 4000, nullable = true )
	private byte[ ] error;
	
	// @formatter:off
	public void setEnvelopeId( String envelopeId ) { this.envelopeId = envelopeId; }
	public String getEnvelopeId( ) { return envelopeId; }
	
	public void setDocumentId( String documentId ) { this.documentId = documentId; }
	public String getDocumentId( ) { return documentId; }
	
	public void setProcessId( String processId ) { this.processId = processId; }
	public String getProcessId( ) { return processId; }
	
	public void setParticipantId( String participantId ) { this.participantId = participantId; }
	public String getParticipantId( ) { return participantId; }
	
	public void setCustomsCode( String customsCode ) { this.customsCode = customsCode; }
	public String getCustomsCode( ) { return customsCode; }
	
	public void setSoftVersion( String softVersion ) { this.softVersion = softVersion; }
	public String getSoftVersion( ) { return softVersion; }
	
	public void setEsadId( String esadId ) { this.esadId = esadId; }
	public String getEsadId( ) { return esadId; }
	
	public void setStatus( String status ) { this.status = status; }
	public String getStatus( ) { return status; }
	
	public void setError( byte[ ] error ) { this.error = error; }
	public byte[ ] getError( ) { return error; }
	// @formatter:on
}
