package ru.acs.fts.eps2.model.entities;

import javax.persistence.*;

@Entity
@Table( name = "EDECL_MSG_DOC" )
public class Edecl_Msg_Doc
{
	public Edecl_Msg_Doc( )
	{

	}

	@Id
	@Column( name = "DOC_DOCUMENTID", length = 36, nullable = false )
	private String documentID;
	
	@Column( name = "DOC_REFMAINDOC", length = 36 )
	private String refMainDoc;
	
	@Column( name = "DOC_MODIFICATIONID", length = 36 )
	private String modificationId;
	
	@Column( name = "DOC_DOCUMENTMODEID", length = 30 )
	private String documentModeId;
	
	@Column( name = "DOC_REFDOCUMENTID", length = 36 )
	private String refDocumentId;
	
	@Lob
	@Column( name = "DOC_BODY" )
	private byte[ ] body;
	
	@Column( name = "DOC_STATE", length = 20, nullable = false )
	private String state;
	
	@Column( name = "DOC_INCOMEDOCID", length = 36 )
	private String incomeDocId;
	
	@Column( name = "DOC_AJD_STATUS", length = 100 )
	private String ajdStatus;
	
	@Column( name = "DOC_AJD_CURRENTDOCID", length = 36 )
	private String ajdCurrentDocId;
	
	@Column( name = "DOC_AJD_SETDOCID", length = 36 )
	private String ajdSetDocId;
	
	@Column( name = "DOC_AJD_GLOBALDOCID", length = 36 )
	private String ajdGlobalDocId;
	
	@Column( name = "DOC_AUDCOMMANDFLAG", length = 1 )
	private Integer audCommandFlag = 2;
	

	public String getDocumentID( ) { return documentID; }
	public void setDocumentID( String documentID ) { this.documentID = documentID; }

	public String getRefMainDoc( ) { return refMainDoc; }
	public void setRefMainDoc( String refMainDoc ) { this.refMainDoc = refMainDoc; }

	public String getModificationId( ) { return modificationId; }
	public void setModificationId( String modificationId ) { this.modificationId = modificationId; }

	public String getDocumentModeId( ) { return documentModeId; }
	public void setDocumentModeId( String documentModeId ) { this.documentModeId = documentModeId; }

	public String getRefDocumentId( ) { return refDocumentId; }
	public void setRefDocumentId( String refDocumentId ) { this.refDocumentId = refDocumentId; }

	public byte[ ] getBody( ) { return body; }
	public void setBody( byte[ ] body ) { this.body = body; }

	public String getState( ) { return state; }
	public void setState( String state ) { this.state = state; }

	public String getIncomeDocId( ) { return incomeDocId; }
	public void setIncomeDocId( String incomeDocId ) { this.incomeDocId = incomeDocId; }

	public String getAjdStatus( ) { return ajdStatus; }
	public void setAjdStatus( String ajdStatus ) { this.ajdStatus = ajdStatus; }

	public String getAjdCurrentDocId( ) { return ajdCurrentDocId; }
	public void setAjdCurrentDocId( String ajdCurrentDocId ) { this.ajdCurrentDocId = ajdCurrentDocId; }

	public String getAjdSetDocId( ) { return ajdSetDocId; }
	public void setAjdSetDocId( String ajdSetDocId ) { this.ajdSetDocId = ajdSetDocId; }

	public String getAjdGlobalDocId( ) { return ajdGlobalDocId; }
	public void setAjdGlobalDocId( String ajdGlobalDocId ) { this.ajdGlobalDocId = ajdGlobalDocId; }

	public Integer getAudCommandFlag( ) { return audCommandFlag; }
	public void setAudCommandFlag( Integer audCommandFlag ) { this.audCommandFlag = audCommandFlag; }
}
