package ru.acs.fts.aud.management.model.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table( name = "EDECL_MSG_DOC" )
public class EdeclDocument
{
	@Id
	@Column( name = "DOC_DOCUMENTID", length = 36, nullable = false )
	private String documentId;
	
	/*
	@Column( name = "DOC_REFMAINDOC", length = 36, nullable = true )
	private String refMainDoc;
	*/
	@ManyToOne
	@JoinColumn( name = "DOC_REFMAINDOC", nullable = true )
	private EdeclDocument mainDocument;
	
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
	
	/*
	@Column( name = "DOC_INCOMEDOCID", length = 36, nullable = true )
	private String incomeDocId;
	*/
	@ManyToOne
	@JoinColumn( name = "DOC_INCOMEDOCID", nullable = true )
	private EdeclDocument incomeDocument;
	
	@Column( name = "DOC_AJD_STATUS", length = 100, nullable = true )
	private String audStatus;
	
	@Column( name = "DOC_AJD_CURRENTDOCID", length = 36, nullable = true )
	private String audCurrentDocId;
	
	@Column( name = "DOC_AJD_SETDOCID", length = 36, nullable = true )
	private String audSetDocId;
	
	@Column( name = "DOC_AJD_GLOBALDOCID", length = 36, nullable = true )
	private String audGlobalDocId;
	
	@Column( name = "DOC_AUDCOMMANDFLAG", nullable = true )
	private Integer audCommandFlag;
	
	@OneToMany( mappedBy = "document", cascade = { CascadeType.ALL } )
	private List< EdeclEnvelope > envelopes = new ArrayList< EdeclEnvelope >( );
	
	/** инверсия для incomeDocument */
	@OneToMany( mappedBy = "incomeDocument", cascade = { CascadeType.ALL } )
	private List< EdeclDocument > subsequentDocuments = new ArrayList< EdeclDocument >( );
	
	/** инверсия для mainDocument */
	@OneToMany( mappedBy = "mainDocument", cascade = { CascadeType.ALL } )
	private List< EdeclDocument > nestedDocuments = new ArrayList< EdeclDocument >( );
	
	@OneToMany( mappedBy = "document", cascade = { CascadeType.ALL } )
	private List< EdeclNotUniqDocument > notUniqDocuments = new ArrayList< EdeclNotUniqDocument >( );
	
	@OneToMany( mappedBy = "mainDocument", cascade = { CascadeType.ALL } )
	private List< EdeclNotUniqDocument > notUniqNestedDocuments = new ArrayList< EdeclNotUniqDocument >( );
	
	@OneToMany( mappedBy = "document", cascade = { CascadeType.ALL } )
	private List< EdeclResultInfo > results = new ArrayList< EdeclResultInfo >( );
	
	// @formatter:off
	public void setDocumentId( String documentId ) { this.documentId = documentId; }
	public String getDocumentId( ) { return documentId; }

	/*
	public void setRefMainDoc( String refMainDoc ) { this.refMainDoc = refMainDoc; }
	public String getRefMainDoc( ) { return refMainDoc; }
	*/
	public void setMainDocument( EdeclDocument mainDocument ) { this.mainDocument = mainDocument; }
	public EdeclDocument getMainDocument( ) { return mainDocument; }

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

	/*
	public void setIncomeDocId( String incomeDocId ) { this.incomeDocId = incomeDocId; }
	public String getIncomeDocId( ) { return incomeDocId; }
	*/
	public void setIncomeDocument( EdeclDocument incomeDocument ) { this.incomeDocument = incomeDocument; }
	public EdeclDocument getIncomeDocument( ) { return incomeDocument; }

	public void setAudStatus( String audStatus ) { this.audStatus = audStatus; }
	public String getAudStatus( ) { return audStatus; }

	public void setAudCurrentDocId( String audCurrentDocId ) { this.audCurrentDocId = audCurrentDocId; }
	public String getAudCurrentDocId( ) { return audCurrentDocId; }

	public void setAudSetDocId( String audSetDocId ) { this.audSetDocId = audSetDocId; }
	public String getAudSetDocId( ) { return audSetDocId; }

	public void setAudGlobalDocId( String audGlobalDocId ) { this.audGlobalDocId = audGlobalDocId; }
	public String getAudGlobalDocId( ) { return audGlobalDocId; } 

	public void setAudCommandFlag( Integer audCommandFlag ) { this.audCommandFlag = audCommandFlag; }
	public Integer getAudCommandFlag( ) { return audCommandFlag; }
	
	public void setEnvelopes( List< EdeclEnvelope > envelopes ) { this.envelopes = envelopes; }
	public List< EdeclEnvelope > getEnvelopes( ) { return envelopes; }
	
	public void setSubsequentDocuments( List< EdeclDocument > relatedDocuments ) { this.subsequentDocuments = relatedDocuments; }
	public List< EdeclDocument > getSubsequentDocuments( ) { return subsequentDocuments; }
	
	public void setNestedDocuments( List< EdeclDocument > nestedDocuments ) { this.nestedDocuments = nestedDocuments; }
	public List< EdeclDocument > getNestedDocuments( ) { return nestedDocuments; }
	
	public void setNotUniqDocuments( List< EdeclNotUniqDocument > notUniqDocuments ) { this.notUniqDocuments = notUniqDocuments; }
	public List< EdeclNotUniqDocument > getNotUniqDocuments( ) { return notUniqDocuments; }
	
	public void setNotUniqNestedDocuments( List< EdeclNotUniqDocument > notUniqNestedDocuments ) { this.notUniqNestedDocuments = notUniqNestedDocuments; }
	public List< EdeclNotUniqDocument > getNotUniqNestedDocuments( ) { return notUniqNestedDocuments; }
	
	public void setResults( List< EdeclResultInfo > results ) { this.results = results; }
	public List< EdeclResultInfo > getResults( ) { return results; }
	// @formatter:on

	@Transient
	public String getRefMainDoc( )
	{
		if ( null != mainDocument )
			return mainDocument.getDocumentId( );
		
		return null;
	}
}
