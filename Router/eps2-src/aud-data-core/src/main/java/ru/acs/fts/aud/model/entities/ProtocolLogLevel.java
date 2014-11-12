package ru.acs.fts.aud.model.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table( name = "PROTOCOL_LOG_LEVELS" )
public class ProtocolLogLevel
{
	@Id
	@Column( name = "LOG_LEVEL" )
	private double logLevel;
	
	@Column( name = "SHORT_DESCRIPTION", nullable = true, length = 12 )
	private String shortDescription;

	@Column( name = "DESCRIPTION", nullable = true, length = 80 )
	private String description;

	@OneToMany( mappedBy = "logLevel" )
	private List< ProtocolItem > protocolItems;
    
	// @formatter:off
	public void setLogLevel( double logLevel ) { this.logLevel = logLevel; }
	public double getLogLevel( ) { return logLevel; }
	
	public void setShortDescription( String shortDescription ) { this.shortDescription = shortDescription; }
	public String getShortDescription( ) { return shortDescription; }
	
	public void setDescription( String description ) { this.description = description; }
	public String getDescription( ) { return description; }
	
	public void setProtocolItems( List< ProtocolItem > protocolItems ) { this.protocolItems = protocolItems; }
	public List< ProtocolItem > getProtocolItems( ) { return protocolItems; }
	// @formatter:on
}
