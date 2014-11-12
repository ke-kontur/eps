package ru.acs.fts.eps2.ws.data.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table( name = "EDECL_MSG_DOC" )
public class Document
{
	@Id
	@Column( name = "DOC_DOCUMENTID", length = 36, nullable = false )
	private String documentId;
	
	@Column( name = "DOC_REFMAINDOC", length = 36, nullable = true )
	private String refMainDocument;
	
	@Column( name = "DOC_MODIFICATIONID", length = 36, nullable = true )
	private String modificationId;
	
	@Column( name = "DOC_DOCUMENTMODEID", length = 30, nullable = true )
	private String documentModeId;
	
	@Column( name = "DOC_REFDOCUMENTID", length = 36, nullable = true )
	private String refDocumentId;
	
	@Lob
	@Column( name = "DOC_BODY", nullable = true )
	private byte[ ] body;
	
	@Column( name = "DOC_STATE", length = 20, nullable = false )
	private String state;
	
	@Column( name = "DOC_INCOMEDOCID", length = 36, nullable = true )
	private String incomeDocumentId;
	
	@Column( name = "DOC_AJD_STATUS", length = 100, nullable = true )
	private String audStatus;
	
	@Column( name = "DOC_AJD_CURRENTDOCID", length = 36, nullable = true )
	private String audCurrentDocumentId;
	
	@Column( name = "DOC_AJD_SETDOCID", length = 36, nullable = true )
	private String audSetDocumentId;
	
	@Column( name = "DOC_AJD_GLOBALDOCID", length = 36, nullable = true )
	private String audGlobalDocumentId;
	
	@Column( name = "DOC_AUDCOMMANDFLAG", nullable = true )
	private Integer audCommandFlag;
	
	// @formatter:off
	public void setDocumentId( String documentId ) { this.documentId = documentId; }
	public String getDocumentId( ) { return documentId; }

	public void setRefMainDocument( String refMainDocument ) { this.refMainDocument = refMainDocument; }
	public String getRefMainDocument( ) { return refMainDocument; }

	public void setModificationId( String modificationId ) { this.modificationId = modificationId; }
	public String getModificationId( ) { return modificationId; }

	public void setDocumentModeId( String documentModeId ) { this.documentModeId = documentModeId; }
	public String getDocumentModeId( ) { return documentModeId; }

	public void setRefDocumentId( String refDocumentId ) { this.refDocumentId = refDocumentId; }
	public String getRefDocumentId( ) { return refDocumentId; }

	public void setBody( byte[ ] body ) { this.body = body; }
	public byte[ ] getBody( ) { return body; }

	public void setState( String state ) { this.state = state; }
	public String getState( ) { return state; }

	public void setIncomeDocumentId( String incomeDocumentId ) { this.incomeDocumentId = incomeDocumentId; }
	public String getIncomeDocumentId( ) { return incomeDocumentId; }

	public void setAudStatus( String audStatus ) { this.audStatus = audStatus; }
	public String getAudStatus( ) { return audStatus; }

	public void setAudCurrentDocumentId( String audCurrentDocumentId ) { this.audCurrentDocumentId = audCurrentDocumentId; }
	public String getAudCurrentDocumentId( ) { return audCurrentDocumentId; }

	public void setAudSetDocumentId( String audSetDocumentId ) { this.audSetDocumentId = audSetDocumentId; }
	public String getAudSetDocumentId( ) { return audSetDocumentId; }

	public void setAudGlobalDocumentId( String audGlobalDocumentId ) { this.audGlobalDocumentId = audGlobalDocumentId; }
	public String getAudGlobalDocumentId( ) { return audGlobalDocumentId; }

	public void setAudCommandFlag( Integer audCommandFlag ) { this.audCommandFlag = audCommandFlag; }
	public Integer getAudCommandFlag( ) { return audCommandFlag; }
	// @formatter:on
}
