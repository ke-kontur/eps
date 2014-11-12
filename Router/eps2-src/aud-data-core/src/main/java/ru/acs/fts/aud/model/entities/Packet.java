package ru.acs.fts.aud.model.entities;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table( name = "PACKET" )
public class Packet
{
	public static final short NO = ( short )0; // NO_UCD (use private)
	public static final short YES = ( short )1;

	public static final String PACKET_TYPE_GTD = "01";
    public static final String PACKET_TYPE_NONGTD = "99";
	
	@Id
	@Column( name = "ID" )
	@Converter( name = "uuidConverter", converterClass = UUIDConverter.class )
	@Convert( "uuidConverter" )
	private String id; // GUID

	@Column( name = "APPLIEDID", nullable = true, length = 64 )
	private String appliedId;

	@Column( name = "DESCRIPTION", nullable = true, length = 255 )
	private String description;

	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamp" )
	@TypeConverter( name = "timestamp", dataType = TIMESTAMP.class )
	@Column( name = "CREATIONDATE", length = 6, nullable = false, columnDefinition = "TIMESTAMP(6) NOT NULL" )
	private Timestamp creationDate;

	@Column( name = "DELETED", nullable = false )
	private short deleted;

	/*
	@Column( name = "CLIENT_ID", nullable = false )
	@Converter( name = "uuidConverter", converterClass = UUIDConverter.class )
	@Convert( "uuidConverter" )
	private String clientId; // GUID
	*/
	@ManyToOne
	@JoinColumn( name = "CLIENT_ID", nullable = false )
	private Client client;

	@Column( name = "PACKETTYPE", nullable = false, length = 2 )
	private String packetType;
	
	@OneToMany( mappedBy = "packet" )
	private List<Document> documentsInside = new ArrayList<Document>( );
	
	@OneToMany( mappedBy = "archPacket" )
	private List< PacketGTD > packetGtds;

	// @formatter:off
	public void setId( String id ) { this.id = id; }
	public String getId( ) { return id; }
	
	public void setAppliedId( String appliedId ) { this.appliedId = appliedId; }
	public String getAppliedId( ) { return appliedId; }
	
	public void setDescription( String description ) { this.description = description; }
	public String getDescription( ) { return description; }
	
	public void setCreationDate( Timestamp creationDate ) { this.creationDate = creationDate; }
	public Timestamp getCreationDate( ) { return creationDate; }
	
	public void setDeleted( short deleted ) { this.deleted = deleted; }
	public short getDeleted( ) { return deleted; }
	
	/*
	public void setClientId( String clientId ) { this.clientId = clientId; }
	public String getClientId( ) { return clientId; }
	*/
	public void setClient( Client client ) { this.client = client; }
	public Client getClient( ) { return client; }
	
	public void setPacketType( String packetType ) { this.packetType = packetType; }
	public String getPacketType( ) { return packetType; }
	
	public void setDocumentsInside( List<Document> documentsInside ) { this.documentsInside = documentsInside; }
	public List< Document > getDocumentsInside( ) { return documentsInside; }
	
	public void setPacketGtds( List< PacketGTD > packetGtds ) { this.packetGtds = packetGtds; }
	public List< PacketGTD > getPacketGtds( ) { return packetGtds; }
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
