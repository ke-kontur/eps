package ru.acs.fts.aud.model.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;

import ru.acs.fts.aud.model.converter.UUIDConverter;

@Entity
@Table( name = "CLIENT" )
public class Client
{
	public static final String OPERATOR = "OPERATOR"; // NO_UCD (use private)
	public static final String SYSTEM = "SYSTEM"; // NO_UCD (use private)

	@Id
	@Column( name = "ID" )
	@Converter( name = "uuidConverter", converterClass = UUIDConverter.class )
	@Convert( "uuidConverter" )
	private String id; // GUID

	@Column( name = "DESCRIPTION", nullable = true, length = 255 )
	private String description;
	
	@Column( name = "APPLIEDID", nullable = false, length = 255 )
	private String appliedId;
	
	@Column( name = "CLIENTTYPE", nullable = false, length = 255 )
	private String clientType;
	
	@Column( name = "SENDNOTIFICATION", nullable = false )
	private short sendNotification;
	
	@Column( name = "ACCESSENABLED", nullable = false )
	private short accessEnabled;
	
	@OneToMany( mappedBy = "client", cascade = CascadeType.REMOVE )
	private List< ClientPermission > permissions = new ArrayList< ClientPermission >( );
    
	@OneToMany( mappedBy = "client" )
	private List< Document > documents = new ArrayList< Document >( );
    
	@OneToMany( mappedBy = "client" )
	private List< Packet > packets = new ArrayList< Packet >( );
	/*
	@Column( name = "LEGAL_DOCUMENT_ID", nullable = false, length = 100 )
	private String legalDocumentId;
	
	@Column( name = "LAST_NAME", nullable = false, length = 50 )
	private String lastName;
	
	@Column( name = "FIRST_NAME", nullable = false, length = 50 )
	private String firstName;
	
	@Column( name = "PATRONYMIC", nullable = false, length = 50 )
	private String patronymic;
	
	@Column( name = "CUSTOMS_RECORD_ID", nullable = false, length = 36 )
	private String customsRecordId;
	
	@Column( name = "IP1", nullable = false, length = 15 )
	private String ip1;
	
	@Column( name = "IP2", nullable = true, length = 15 )
	private String ip2;
	
	@Column( name = "IP3", nullable = true, length = 15 )
	private String ip3;
	
	@Column( name = "MAC1", nullable = true, length = 17 )
	private String mac1;
	
	@Column( name = "MAC2", nullable = true, length = 17 )
	private String mac2;
	
	@Column( name = "MAC3", nullable = true, length = 17 )
	private String mac3;
	
	@Column( name = "DOMAIN_NAME", nullable = true, length = 100 )
	private String domainName;
	
	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamp" )
	@TypeConverter( name = "timestamp", dataType = TIMESTAMP.class )
	@Column( name = "CREATION_DATE", length = 6, nullable = false, columnDefinition = "TIMESTAMP(6) NOT NULL" )
	private Timestamp creationDate;
	
	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamp" )
	@TypeConverter( name = "timestamp", dataType = TIMESTAMP.class )
	@Column( name = "CHANGE_DATE", length = 6, nullable = false, columnDefinition = "TIMESTAMP(6) NOT NULL" )
	private Timestamp changeDate;
	
	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamp" )
	@TypeConverter( name = "timestamp", dataType = TIMESTAMP.class )
	@Column( name = "PASS_END_DATE", length = 6, nullable = false, columnDefinition = "TIMESTAMP(6) NOT NULL" )
	private Timestamp passEndDate;
	
	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamp" )
	@TypeConverter( name = "timestamp", dataType = TIMESTAMP.class )
	@Column( name = "END_DATE", length = 6, nullable = false, columnDefinition = "TIMESTAMP(6) NOT NULL" )
	private Timestamp endDate;
	
	@Column( name = "DELETED", nullable = false )
	private short deleted;
	
	@Column( name = "ROLE", nullable = false, length = 50 )
	private String role;
    */
	// @formatter:off
	public void setId( String id ) { this.id = id; }
	public String getId( ) { return id; }
	
	public void setDescription( String description ) { this.description = description; }
	public String getDescription( ) { return description; }
	
	public void setAppliedId( String appliedId ) { this.appliedId = appliedId; }
	public String getAppliedId( ) { return appliedId; }
	
	public void setClientType( String clientType ) { this.clientType = clientType; }
	public String getClientType( ) { return clientType; }
	
	public void setSendNotification( short sendNotification ) { this.sendNotification = sendNotification; }
	public short getSendNotification( ) { return sendNotification; }
	
	public void setAccessEnabled( short accessEnabled ) { this.accessEnabled = accessEnabled; }
	public short getAccessEnabled( ) { return accessEnabled; }
	
	public void setPermissions( List< ClientPermission > permissions ) { this.permissions = permissions; }
	public List< ClientPermission > getPermissions( ) { return permissions; }
	
	public void setDocuments( List< Document > documents ) { this.documents = documents; }
	public List< Document > getDocuments( ) { return documents; }
	
	public void setPackets( List< Packet > packets ) { this.packets = packets; }
	public List< Packet > getPackets( ) { return packets; }
	/*
	public String getLegalDocumentId( ) { return legalDocumentId; }
	public void setLegalDocumentId( String legalDocumentId ) { this.legalDocumentId = legalDocumentId; }
	
	public String getLastName( ) { return lastName; }
	public void setLastName( String lastName ) { this.lastName = lastName; }
	
	public String getFirstName( ) { return firstName; }
	public void setFirstName( String firstName ) { this.firstName = firstName; }
	
	public String getPatronymic( ) { return patronymic; }
	public void setPatronymic( String patronymic ) { this.patronymic = patronymic; }
	
	public String getCustomsRecordId( ) { return customsRecordId; }
	public void setCustomsRecordId( String customsRecordId ) { this.customsRecordId = customsRecordId; }
	
	public String getIp1( ) { return ip1; }
	public void setIp1( String ip1 ) { this.ip1 = ip1; }
	
	public String getIp2( ) { return ip2; }
	public void setIp2( String ip2 ) { this.ip2 = ip2; }
	
	public String getIp3( ) { return ip3; }
	public void setIp3( String ip3 ) { this.ip3 = ip3; }
	
	public String getMac1( ) { return mac1; }
	public void setMac1( String mac1 ) { this.mac1 = mac1; }
	
	public String getMac2( ) { return mac2; }
	public void setMac2( String mac2 ) { this.mac2 = mac2; }
	
	public String getMac3( ) { return mac3; }
	public void setMac3( String mac3 ) { this.mac3 = mac3; }
	
	public String getDomainName( ) { return domainName; }
	public void setDomainName( String domainName ) { this.domainName = domainName; }
	
	public Timestamp getCreationDate( ){ return creationDate; }
	public void setCreationDate( Timestamp creationDate ) { this.creationDate = creationDate; }
	
	public Timestamp getChangeDate( ) { return changeDate; }
	public void setChangeDate( Timestamp changeDate ) { this.changeDate = changeDate; }
	
	public Timestamp getPassEndDate( ) { return passEndDate; }
	public void setPassEndDate( Timestamp passEndDate ) { this.passEndDate = passEndDate; }
	
	public Timestamp getEndDate( ) { return endDate; }
	public void setEndDate( Timestamp endDate ) { this.endDate = endDate; }
	
	public short getDeleted( ) { return deleted; }
	public void setDeleted( short deleted ) { this.deleted = deleted; }
	
	public String getRole( ){ return role; }
	public void setRole( String role ){ this.role = role; }
	*/
	// @formatter:on
	
	public static boolean isOperator( Client client ) // NO_UCD (unused code)
	{
		return compareTypes( OPERATOR, client );
	}
	
	public static boolean isSystem( Client client )
	{
		return compareTypes( SYSTEM, client );
	}
	
	private static boolean compareTypes( String type, Client client )
	{
		if ( null == client )
			return false;
		
		return type.equals( client.getClientType( ) );
	}
	
}
