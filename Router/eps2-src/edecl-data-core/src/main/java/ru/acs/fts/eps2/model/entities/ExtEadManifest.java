package ru.acs.fts.eps2.model.entities;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import oracle.sql.TIMESTAMPTZ;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.TypeConverter;

@Entity
@IdClass( ExtEadManifestIds.class )
@Table( name = "EDECL_EXTEAD_MANIFEST" )
public class ExtEadManifest
{
	public static final int STATUS_REQUESTED = 0;
	public static final int STATUS_RECEIVED = 1;
	public static final int STATUS_FAILED = 2;
	
    @Id
    @Column( name = "EXTEAD_REQ_ENVELOPEID", length = 36, nullable = false )
    private String requestEnvelopeId;

    @Column( name = "EXTEAD_REQ_DOCUMENTID", length = 36 )
    private String requestDocumentId;

    @Column( name = "EXTEAD_REQ_ARCHID", length = 36, nullable = true )
    private String requestArchId;
    
    @Column( name = "EXTEAD_REQ_ARCH_DOCID", length = 36, nullable = true )
    private String requestArchDocId;
    
    @Column( name = "EXTEAD_STATUS" )
    private Integer status;

	@Lob
	@Column( name = "EXTEAD_DOC_DATA" )
	private byte[ ] data;
	
	@Id
	@Column( name = "EXTEAD_REQ_LINEID", length = 36 )
	private String requestLineId;
    
	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamptz" )
	@TypeConverter( name = "timestamptz", dataType = TIMESTAMPTZ.class )
	@Column( name = "EXTEAD_REQ_DATE", length = 9, nullable = false, columnDefinition = "TIMESTAMP(9) WITH TIME ZONE NOT NULL" )
	private Calendar requestDate;
	
	@Column( name = "EXTEAD_ALBUM_VERSION", length = 6 )
	private String albumVersion;
	
	@Temporal( TemporalType.DATE )
	@Column( name = "EXTEAD_CREATE_DATE" )
	private Date createDate;
	
	@Column( name = "EXTEAD_RESULT_CODE", length = 12 )
	private String resultCode;
	
	@Column( name = "EXTEAD_REQ_DOCCODE", length = 5 )
	private String docCode;
	
	@Column( name = "EXTEAD_DOCUMENT_MODE_ID", length = 30 )
	private String documentModeId;
	
	@Column( name = "EXTEAD_SOFTVERSION", length = 50, nullable = false )
	private String softVersion;
	
	public ExtEadManifest( )
	{
		
	}
	
	public void setRequestEnvelopeId( String requestEnvelopeId ) { this.requestEnvelopeId = requestEnvelopeId; }
	public String getRequestEnvelopeId( ) { return requestEnvelopeId; }
	
	public void setRequestDocumentId( String requestDocumentId ) { this.requestDocumentId = requestDocumentId; }
	public String getRequestDocumentId( ) { return requestDocumentId; }
	
	public void setRequestArchId( String requestArchId ) { this.requestArchId = requestArchId; }
	public String getRequestArchId( ) { return requestArchId; }
	
	public void setRequestArchDocId( String requestArchDocId ) { this.requestArchDocId = requestArchDocId; }
	public String getRequestArchDocId( ) { return requestArchDocId; }
	
	public void setStatus( Integer status ) { this.status = status; }
	public Integer getStatus( ) { return status; }
	
	public void setData( byte[ ] data ) { this.data = data; }
	public byte[ ] getData( ) { return data; }
	
	public void setRequestLineId( String requestLineId ) { this.requestLineId = requestLineId; }
	public String getRequestLineId( ) { return requestLineId; }
	
	public void setRequestDate( Calendar requestDate ) { this.requestDate = requestDate; }
	public Calendar getRequestDate( ) { return requestDate; }
	
	public void setAlbumVersion( String albumVersion ) { this.albumVersion = albumVersion; }
	public String getAlbumVersion( ) { return albumVersion; }
	
	public void setCreateDate( Date createDate ) { this.createDate = createDate; }
	public Date getCreateDate( ) { return createDate; }
	
	public void setResultCode( String resultCode ) { this.resultCode = resultCode; }
	public String getResultCode( ) { return resultCode; }
	
	public void setDocCode( String docCode ) { this.docCode = docCode; }
	public String getDocCode( ) { return docCode; }
	
	public void setDocumentModeId( String documentModeId ) { this.documentModeId = documentModeId; }
	public String getDocumentModeId( ) { return documentModeId; }
	
	public void setSoftVersion( String softVersion ) { this.softVersion = softVersion; }
	public String getSoftVersion( ) { return softVersion; }
}
