package ru.acs.fts.aud.management.model.entities;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import oracle.sql.TIMESTAMPTZ;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.TypeConverter;

@Entity
@Table( name = "EDECL_AJD_REGISTRY_RESULT" )
public class EdeclAudRegistryResult
{
	@Id
	@Column( name = "AJDRR_ARCHPACKETID", length = 36, nullable = false )
	private String archPacketId;
	
	/*
	@Column( name = "AJDRR_AJDRID", length = 36, nullable = true )
	private String audRegistryId;
	*/
	
	@ManyToOne
	@JoinColumn( name = "AJDRR_AJDRID", nullable = true )
	private EdeclAudRegistry audRegistry;
	
	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamptz" )
	@TypeConverter( name = "timestamptz", dataType = TIMESTAMPTZ.class )
	@Column( name = "AJDRR_PACK_PUTDATETIME", length = 9, nullable = false, columnDefinition = "TIMESTAMP(9) WITH TIME ZONE NOT NULL" )
	private Calendar packetPutDateTime;
	
	@Column( name = "AJDRR_PACKETTYPE", length = 2, nullable = false )
	private String packetType;
	
	@Column( name = "AJDRR_APP_PACKETID", length = 100, nullable = true )
	private String appPacketId;
	
	@Column( name = "AJDRR_APP_PACKDESCRIPTION", length = 500, nullable = true )
	private String appPacketDescription;
	
	// @formatter:off
	public void setArchPacketId( String archPacketId ) { this.archPacketId = archPacketId; }
	public String getArchPacketId( ) { return archPacketId; }
	
	/*
	public void setAudRegistryId( String audRegistryId ) { this.audRegistryId = audRegistryId; }
	public String getAudRegistryId( ) { return audRegistryId; }
	*/
	
	public void setAudRegistry( EdeclAudRegistry audRegistry ) { this.audRegistry = audRegistry; }
	public EdeclAudRegistry getAudRegistry( ) { return audRegistry; }
	
	public void setPacketPutDateTime( Calendar packetPutDateTime ) { this.packetPutDateTime = packetPutDateTime; }
	public Calendar getPacketPutDateTime( ) { return packetPutDateTime; }
	
	public void setPacketType( String packetType ) { this.packetType = packetType; }
	public String getPacketType( ) { return packetType; }
	
	public void setAppPacketId( String appPacketId ) { this.appPacketId = appPacketId; }
	public String getAppPacketId( ) { return appPacketId; }
	
	public void setAppPacketDescription( String appPacketDescription ) { this.appPacketDescription = appPacketDescription; }
	public String getAppPacketDescription( ) { return appPacketDescription; }
	// @formatter:on
}
