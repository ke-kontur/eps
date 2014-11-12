package ru.acs.fts.aud.model.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import ru.acs.fts.aud.model.entities.Packet;

@Entity
@Table( name = "PACKET_GTD" )
public class PacketGTD
{
	@Id
	@Column( name = "CTD_CUSTCODE", length = 8 )
	private String custCode;
	
	@Id
	@Column( name = "GTD_DATE", length = 7 )
	private Date date;
	
	@Id
	@Column( name = "GTD_REGNUM", length = 7 )
	private String regnum;
	
	/*
	@Column( name = "GTD_ARCHPACKETID", nullable = false )
	@Converter( name = "uuidConverter", converterClass = UUIDConverter.class )
	@Convert( "uuidConverter" )
	private String archPacketId;
	*/
	
	@ManyToOne
	@JoinColumn( name = "GTD_ARCHPACKETID" )
	private Packet archPacket;
	
	@Column( name = "GTD_LIVETYPE", length = 2 )
	private String liveType;
	
	// @formatter:off
	public void setCustCode( String custCode ) { this.custCode = custCode; }
	public String getCustCode( ) { return custCode; }
	
	public void setDate( Date date ) { this.date = date; }
	public Date getDate( ) { return date; }
	
	public void setRegnum( String regnum ) { this.regnum = regnum; }
	public String getRegnum( ) { return regnum; }
	
	/*
	public void setArchPacketId( String archPacketId ) { this.archPacketId = archPacketId; }
	public String getArchPacketId( ) { return archPacketId; }
	*/
	
	public void setArchPacket( Packet archPacket ) { this.archPacket = archPacket; }
	public Packet getArchPacket( ) { return archPacket; }
	
	public void setLiveType( String liveType ) { this.liveType = liveType; }
	public String getLiveType( ) { return liveType; }
	// @formatter:on
}