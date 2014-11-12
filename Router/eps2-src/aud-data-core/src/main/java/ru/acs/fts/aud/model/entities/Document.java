package ru.acs.fts.aud.model.entities;

import java.sql.Timestamp;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import oracle.sql.TIMESTAMP;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.TypeConverter;

import ru.acs.fts.aud.model.converter.UUIDConverter;

@Entity
@Table( name = "DOCUMENT" )
public class Document
{
	public static final short NO = ( short )0; // NO_UCD (use private)
	public static final short YES = ( short )1;
	
	public static final short SHOULD_NEVER_REINDEX = 2;
	
	@Id
	@Column( name = "ID" )
	@Converter( name = "uuidConverter", converterClass = UUIDConverter.class )
	@Convert( "uuidConverter" )
	private String id; // GUID
	
	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamp" )
	@TypeConverter( name = "timestamp", dataType = TIMESTAMP.class )
	@Column( name = "LASTSIGNATUREVERIFYDATE", length = 6, nullable = true, columnDefinition = "TIMESTAMP(6) NULL" )
	private Timestamp lastSignatureVerifyDate; 

	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamp" )
	@TypeConverter( name = "timestamp", dataType = TIMESTAMP.class )
	@Column( name = "SIGNATUREEXPIREDATE", length = 6, nullable = true, columnDefinition = "TIMESTAMP(6) NULL" )
	private Timestamp signatureExpireDate;

	@Column( name = "VERSIONNUMBER", nullable = false )
	private int versionNumber;

	@Lob
	@Column( name = "APPROVE", nullable = true )
	private byte[] approve;

	@Column( name = "CUSTOMSCODE", nullable = false, length = 8 )
	private String customsCode;

	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamp" )
	@TypeConverter( name = "timestamp", dataType = TIMESTAMP.class )
	@Column( name = "APPROVEEXPIREDATE", length = 6, nullable = true, columnDefinition = "TIMESTAMP(6) NULL" )
	private Timestamp approveExpireDate;

	@Column( name = "APPLIEDID", nullable = true, length = 100 )
	private String appliedId;

	@Column( name = "RETENTIONPERIOD", nullable = true )
	private Integer retentionPeriod;
	
	@Lob
	@Column( name = "CONTENT", nullable = true )
	private byte[] content;

	@Column( name = "ACTUAL", nullable = false )
	private short actual;

	@Column( name = "LASTSIGNATUREVERIFYRESULT", nullable = true )
	private Short lastSignatureVerifyResult;

	@Column( name = "SYNCHRONIZATIONSTATE", nullable = true, length = 255 )
	private String synchronizationState;

	@Column( name = "DELETED", nullable = false )
	private short deleted;

	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamp" )
	@TypeConverter( name = "timestamp", dataType = TIMESTAMP.class )
	@Column( name = "LASTSYNCHRONIZATIONDATE", length = 6, nullable = true, columnDefinition = "TIMESTAMP(6) NULL" )
	private Timestamp lastSynchronizationDate;

	@Column( name = "DESCRIPTION", nullable = true, length = 255 )
	private String description;

	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamp" )
	@TypeConverter( name = "timestamp", dataType = TIMESTAMP.class )
	@Column( name = "CREATIONDATE", length = 6, nullable = false, columnDefinition = "TIMESTAMP(6) NOT NULL" )
	private Timestamp creationDate;

	@Column( name = "VERSIONCHAIN", nullable = false )
	@Converter( name = "uuidConverter", converterClass = UUIDConverter.class )
	@Convert( "uuidConverter" )
	private String versionChain; // GUID

	@Lob
	@Column( name = "SIGNATURE", nullable = true )
	private byte[] signature;

	/*
	@Column( name = "PACKET_ID", nullable = false )
	@Converter( name = "uuidConverter", converterClass = UUIDConverter.class )
	@Convert( "uuidConverter" )
	private String packetId; // GUID
	*/
	@ManyToOne
	@JoinColumn( name = "PACKET_ID", nullable = false )
	private Packet packet;

	/*
	@Column( name = "DOCUMENTKINDVERSION_ID", nullable = true )
	@Converter( name = "uuidConverter", converterClass = UUIDConverter.class )
	@Convert( "uuidConverter" )
	private String documentKindVersionId; // GUID
	*/
	@ManyToOne
	@JoinColumn( name = "DOCUMENTKINDVERSION_ID", nullable = true )
	private DocumentKindVersion documentKindVersion;

	/*
	@Column( name = "DOCUMENTCONTAINER_ID", nullable = true )
	@Converter( name = "uuidConverter", converterClass = UUIDConverter.class )
	@Convert( "uuidConverter" )
	private String documentContainerId; // GUID
	*/
	@ManyToOne
	@JoinColumn( name = "DOCUMENTCONTAINER_ID", nullable = true )
	private Document documentContainer;
	
	@OneToMany( mappedBy = "documentContainer", cascade = { CascadeType.MERGE } )
	private List<Document> documentsInside = new ArrayList<Document>( );

	/*
	@Column( name = "CLIENT_ID", nullable = false )
	@Converter( name = "uuidConverter", converterClass = UUIDConverter.class )
	@Convert( "uuidConverter" )
	private String clientId; // GUID
	*/
	@ManyToOne
	@JoinColumn( name = "CLIENT_ID", nullable = false )
	private Client client;

	@Column( name = "SIGNATUREINITFLAG", nullable = false )
	private short signatureInitFlag;

	@Column( name = "NEED_REINDEX", nullable = false )
	private short needReindex;

	@Column( name = "REFEXTARCHPACKID", nullable = true )
	@Converter( name = "uuidConverter", converterClass = UUIDConverter.class )
	@Convert( "uuidConverter" )
	private String refExtArchPackId; // GUID

	@Column( name = "REFEXTARCHDOCID", nullable = true )
	@Converter( name = "uuidConverter", converterClass = UUIDConverter.class )
	@Convert( "uuidConverter" )
	private String refExtArchDocId; // GUID
	
	@OneToMany( mappedBy = "document" )
	private List< RetentionControlResult > retentionResults = new ArrayList< RetentionControlResult >( );
	
	@OneToMany( mappedBy = "document" )
	private List< SignatureControlResult > signatureResults = new ArrayList< SignatureControlResult >( );
	
	@OneToMany( mappedBy = "document" )
	private List< DestructionResult > destructionResults = new ArrayList< DestructionResult >( );
	
	@OneToMany( mappedBy = "document" )
	private List< ExpertResult > expertResults = new ArrayList< ExpertResult >( );
	
	/*
	@OneToMany( mappedBy = "document" )
	private List< ArchiveRequest > archiveRequests = new ArrayList< ArchiveRequest >( );
	*/
	
	@OneToMany( mappedBy = "appliedDocument" )
	private List< ProtocolItem > protocolItems = new ArrayList< ProtocolItem >( );
	
	@OneToMany( mappedBy = "document" )
	private List< AttributeContent > attributeContents = new ArrayList< AttributeContent >( );

	// @formatter:off
	public void setId( String id ) { this.id = id; }
	public String getId( ) { return id; }

	public void setLastSignatureVerifyDate( Timestamp lastSignatureVerifyDate ) { this.lastSignatureVerifyDate = lastSignatureVerifyDate; }
	public Timestamp getLastSignatureVerifyDate( ) { return lastSignatureVerifyDate; }

	public void setSignatureExpireDate( Timestamp signatureExpireDate ) { this.signatureExpireDate = signatureExpireDate; }
	public Timestamp getSignatureExpireDate( ) { return signatureExpireDate; }

	public void setVersionNumber( int versionNumber ) { this.versionNumber = versionNumber; }
	public int getVersionNumber( ) { return versionNumber; }

	public void setApprove( byte[ ] approve ) { this.approve = approve; }
	public byte[] getApprove( ) { return approve; }

	public void setCustomsCode( String customsCode ) { this.customsCode = customsCode; }
	public String getCustomsCode( ) { return customsCode; }

	public void setApproveExpireDate( Timestamp approveExpireDate ) { this.approveExpireDate = approveExpireDate; }
	public Timestamp getApproveExpireDate( ) { return approveExpireDate; }

	public void setAppliedId( String appliedId ) { this.appliedId = appliedId; }
	public String getAppliedId( ) { return appliedId; }

	public void setRetentionPeriod( Integer retentionPeriod ) { this.retentionPeriod = retentionPeriod; }
	public Integer getRetentionPeriod( ) { return retentionPeriod; }

	public void setContent( byte[ ] content ) { this.content = content; }
	public byte[ ] getContent( ) { return content; }

	public void setActual( short actual ) { this.actual = actual; }
	public short getActual( ) { return actual; }

	public void setLastSignatureVerifyResult( Short lastSignatureVerifyResult ) { this.lastSignatureVerifyResult = lastSignatureVerifyResult; }
	public Short getLastSignatureVerifyResult( ) { return lastSignatureVerifyResult; }

	public void setSynchronizationState( String synchronizationState ) { this.synchronizationState = synchronizationState; }
	public String getSynchronizationState( ) { return synchronizationState; }

	public void setDeleted( short deleted ) { this.deleted = deleted; }
	public short getDeleted( ) { return deleted; }

	public void setLastSynchronizationDate( Timestamp lastSynchronizationDate ) { this.lastSynchronizationDate = lastSynchronizationDate; }
	public Timestamp getLastSynchronizationDate( ) { return lastSynchronizationDate; }

	public void setDescription( String description ) { this.description = description; }
	public String getDescription( ) { return description; }

	public void setCreationDate( Timestamp creationDate ) { this.creationDate = creationDate; }
	public Timestamp getCreationDate( ) { return creationDate; }
	
	public void setVersionChain( String versionChain ) { this.versionChain = versionChain; }
	public String getVersionChain( ) { return versionChain; }

	public void setSignature( byte[ ] signature ) { this.signature = signature; }
	public byte[ ] getSignature( ) { return signature; }

	/*
	public void setPacketId( String packetId ) { this.packetId = packetId; }
	public String getPacketId( ) { return packetId; }
	*/
	public void setPacket( Packet packet ) { this.packet = packet; }
	public Packet getPacket( ) { return packet; }
	
	/*
	public void setDocumentKindVersionId( String documentKindVersionId ) { this.documentKindVersionId = documentKindVersionId; }
	public String getDocumentKindVersionId( ) { return documentKindVersionId; }
	*/
	public void setDocumentKindVersion( DocumentKindVersion documentKindVersion ) { this.documentKindVersion = documentKindVersion; }
	public DocumentKindVersion getDocumentKindVersion( ) { return documentKindVersion; }

	/*
	public void setDocumentContainerId( String documentContainerId ) { this.documentContainerId = documentContainerId; }
	public String getDocumentContainerId( ) { return documentContainerId; }
	*/
	public void setDocumentContainer( Document documentContainer ) { this.documentContainer = documentContainer; }
	public Document getDocumentContainer( ) { return documentContainer; }
	
	public void setDocumentsInside( List< Document > documentsInside ) { this.documentsInside = documentsInside; }
	public List< Document > getDocumentsInside( ) { return documentsInside; }

	/*
	public void setClientId( String clientId ) { this.clientId = clientId; }
	public String getClientId( ) { return clientId; }
	*/
	public void setClient( Client client ) { this.client = client; }
	public Client getClient( ) { return client; }

	public void setSignatureInitFlag( short signatureInitFlag ) { this.signatureInitFlag = signatureInitFlag; }
	public short getSignatureInitFlag( ) { return signatureInitFlag; }

	public void setNeedReindex( short needReindex ) { this.needReindex = needReindex; }
	public short getNeedReindex( ) { return needReindex; }

	public void setRefExtArchPackId( String refExtArchPackId ) { this.refExtArchPackId = refExtArchPackId; }
	public String getRefExtArchPackId( ) { return refExtArchPackId; }

	public void setRefExtArchDocId( String refExtArchDocId ) { this.refExtArchDocId = refExtArchDocId; }
	public String getRefExtArchDocId( ) { return refExtArchDocId; }
	
	public void setRetentionResults( List< RetentionControlResult > retentionResults ) { this.retentionResults = retentionResults; }
	public List< RetentionControlResult > getRetentionResults( ) { return retentionResults; }
	
	public void setSignatureResults( List< SignatureControlResult > signatureResults ) { this.signatureResults = signatureResults; }
	public List< SignatureControlResult > getSignatureResults( ) { return signatureResults; }
	
	public void setDestructionResults( List< DestructionResult > destructionResults ) { this.destructionResults = destructionResults; }
	public List< DestructionResult > getDestructionResults( ) { return destructionResults; }
	
	public void setExpertResults( List< ExpertResult > expertResults ) { this.expertResults = expertResults; }
	public List< ExpertResult > getExpertResults( ) { return expertResults; }
	
	/*
	public void setArchiveRequests( List< ArchiveRequest > archiveRequests ) { this.archiveRequests = archiveRequests; }
	public List< ArchiveRequest > getArchiveRequests( ) { return archiveRequests; }
	*/
	
	public void setProtocolItems( List< ProtocolItem > protocolItems ) { this.protocolItems = protocolItems; }
	public List< ProtocolItem > getProtocolItems( ) { return protocolItems; }
	
	public void setAttributeContents( List< AttributeContent > attributeContents ) { this.attributeContents = attributeContents; }
	public List< AttributeContent > getAttributeContents( ) { return attributeContents; }
	// @formatter:on
	
	public boolean isAllInsideDocumentsDeleted( )
	{
		if ( null == documentsInside || 0 == documentsInside.size( ) )
			return true;
		
		for ( Document doc : documentsInside )
		{
			if ( doc.getDeleted( ) == NO )
				return false;
		}
		
		return true;
	}
}
