package ru.acs.fts.eps2.ws.data.model.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import oracle.sql.TIMESTAMPTZ;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.TypeConverter;

@Entity
@Table( name = "EDECL_AUD_MESSAGES" )
public class AudMessage
{
	@Id
	@Column( name = "AMSG_ENVELOPEID", length = 36, nullable = false )
	private String envelopeId;
	
	@Column( name = "AMSG_INCOMEENVELOPEID", length = 36, nullable = true )
	private String incomeEnvelopeId;

	@Column( name = "AMSG_INITIALENVELOPEID", length = 36, nullable = true )
	private String initialEnvelopeId;
	
	@Column( name = "AMSG_SENDERINFORMATION", length = 100, nullable = false )
	private String senderInformation;
	
	@Column( name = "AMSG_RECEIVERINFORMATION", length = 100, nullable = false )
	private String receiverInformation;
	
	@Column( name = "AMSG_SOFTKIND", length = 100, nullable = true )
	private String softKind;
	
	@Column( name = "AMSG_SOFTVERSION", length = 100, nullable = true )
	private String softVersion;
	
	@Column( name = "AMSG_MESSAGEKIND", length = 30, nullable = true )
	private String messageKind;
	
	@Column( name = "AMSG_DOCUMENTID", length = 36, nullable = true )
	private String documentId;
	
	@Column( name = "AMSG_CUSTOMSCODE", nullable = true )
	private Integer customsCode;
	
	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamptz" )
	@TypeConverter( name = "timestamptz", dataType = TIMESTAMPTZ.class )
	@Column( name = "AMSG_PREPARATIONDATETIME", length = 9, nullable = false, columnDefinition = "TIMESTAMP(9) WITH TIME ZONE NOT NULL" )
	private Calendar preparationDateTime;
	
	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamptz" )
	@TypeConverter( name = "timestamptz", dataType = TIMESTAMPTZ.class )
	@Column( name = "AMSG_RECVDATE", length = 9, nullable = true, columnDefinition = "TIMESTAMP(9) WITH TIME ZONE NULL" )
	private Calendar receiveDate;

	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamptz" )
	@TypeConverter( name = "timestamptz", dataType = TIMESTAMPTZ.class )
	@Column( name = "AMSG_SENDDATE", length = 9, nullable = true, columnDefinition = "TIMESTAMP(9) WITH TIME ZONE NULL" )
	private Calendar sendDate;
	
	@Column( name = "AMSG_ARCHIVECLIENTID", length = 100, nullable = true )
	private String archiveClientId;
	
	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamptz" )
	@TypeConverter( name = "timestamptz", dataType = TIMESTAMPTZ.class )
	@Column( name = "AMSG_COA_DATETIME", length = 9, nullable = true, columnDefinition = "TIMESTAMP(9) WITH TIME ZONE NULL" )
	private Calendar coaDateTime;

	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamptz" )
	@TypeConverter( name = "timestamptz", dataType = TIMESTAMPTZ.class )
	@Column( name = "AMSG_COA_SAVE_DATETIME", length = 9, nullable = true, columnDefinition = "TIMESTAMP(9) WITH TIME ZONE NULL" )
	private Calendar coaSaveDateTime;

	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamptz" )
	@TypeConverter( name = "timestamptz", dataType = TIMESTAMPTZ.class )
	@Column( name = "AMSG_COD_SAVE_DATETIME", length = 9, nullable = true, columnDefinition = "TIMESTAMP(9) WITH TIME ZONE NULL" )
	private Calendar codSaveDateTime;

	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamptz" )
	@TypeConverter( name = "timestamptz", dataType = TIMESTAMPTZ.class )
	@Column( name = "AMSG_COD_DATETIME", length = 9, nullable = true, columnDefinition = "TIMESTAMP(9) WITH TIME ZONE NULL" )
	private Calendar codDateTime;

	@Lob
	@Column( name = "AMSG_BODY", nullable = true )
	private byte[ ] body;
	
	@OneToMany( mappedBy = "inEnvelope", cascade = { CascadeType.ALL } )
	private List< AudCommand > audInCommands = new ArrayList< AudCommand >( );

	@OneToMany( mappedBy = "outEnvelope", cascade = { CascadeType.ALL } )
	private List< AudCommand > audOutCommands = new ArrayList< AudCommand >( );

	// @formatter:off
	public void setEnvelopeId( String envelopeId ) { this.envelopeId = envelopeId; }
	public String getEnvelopeId( ) { return envelopeId; }
	
	public void setIncomeEnvelopeId( String incomeEnvelopeId ) { this.incomeEnvelopeId = incomeEnvelopeId; }
	public String getIncomeEnvelopeId( ) { return incomeEnvelopeId; }

	public void setInitialEnvelopeId( String initialEnvelopeId ) { this.initialEnvelopeId = initialEnvelopeId; }
	public String getInitialEnvelopeId( ) { return initialEnvelopeId; }

	public void setSenderInformation( String senderInformation ) { this.senderInformation = senderInformation; }
	public String getSenderInformation( ) { return senderInformation; }

	public void setReceiverInformation( String receiverInformation ) { this.receiverInformation = receiverInformation; }
	public String getReceiverInformation( ) { return receiverInformation; }

	public void setSoftKind( String softKind ) { this.softKind = softKind; }
	public String getSoftKind( ) { return softKind; }

	public void setSoftVersion( String softVersion ) { this.softVersion = softVersion; }
	public String getSoftVersion( ) { return softVersion; }

	public void setMessageKind( String messageKind ) { this.messageKind = messageKind; }
	public String getMessageKind( ) { return messageKind; }

	public void setDocumentId( String documentId ) { this.documentId = documentId; }
	public String getDocumentId( ) { return documentId; }

	public void setCustomsCode( Integer customsCode ) { this.customsCode = customsCode; }
	public Integer getCustomsCode( ) { return customsCode; }

	public void setPreparationDateTime( Calendar preparationDateTime ) { this.preparationDateTime = preparationDateTime; }
	public Calendar getPreparationDateTime( ) { return preparationDateTime; }

	public void setReceiveDate( Calendar receiveDate ) { this.receiveDate = receiveDate; }
	public Calendar getReceiveDate( ) { return receiveDate; }
	
	public void setSendDate( Calendar sendDate ) { this.sendDate = sendDate; }
	public Calendar getSendDate( ) { return sendDate; }

	public void setArchiveClientId( String archiveClientId ) { this.archiveClientId = archiveClientId; }
	public String getArchiveClientId( ) { return archiveClientId; }

	public void setCoaDateTime( Calendar coaDateTime ) { this.coaDateTime = coaDateTime; }
	public Calendar getCoaDateTime( ) { return coaDateTime; }

	public void setCoaSaveDateTime( Calendar coaSaveDateTime ) { this.coaSaveDateTime = coaSaveDateTime; }
	public Calendar getCoaSaveDateTime( ) { return coaSaveDateTime; }

	public void setCodSaveDateTime( Calendar codSaveDateTime ) { this.codSaveDateTime = codSaveDateTime; }
	public Calendar getCodSaveDateTime( ) { return codSaveDateTime; }

	public void setCodDateTime( Calendar codDateTime ) { this.codDateTime = codDateTime; }
	public Calendar getCodDateTime( ) { return codDateTime; }

	public void setBody( byte[ ] body ) { this.body = body; }	
	public byte[ ] getBody( ) { return body; }

	public void setAudInCommands( List< AudCommand > audInCommands ) { this.audInCommands = audInCommands; }
	public List< AudCommand > getAudInCommands( ) { return audInCommands; }

	public void setAudOutCommands( List< AudCommand > audOutCommands ) { this.audOutCommands = audOutCommands; }
	public List< AudCommand > getAudOutCommands( ) { return audOutCommands; }
	// @formatter:on
}
