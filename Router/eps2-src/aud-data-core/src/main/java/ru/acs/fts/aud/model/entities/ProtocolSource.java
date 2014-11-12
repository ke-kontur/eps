package ru.acs.fts.aud.model.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table( name = "PROTOCOL_SOURCES" )
public class ProtocolSource
{
	@Id
	@Column( name = "CODE_TYPE" )
	private double codeType;

	@Column( name = "SHORT", nullable = false, length = 10 )
	private String shortDescription;

	@Column( name = "DESCRIPTION", nullable = true, length = 110 )
	private String description;

	@OneToMany( mappedBy = "codeType" )
	private List< ProtocolItem > protocolItems;
    
	// @formatter:off
	public void setCodeType( double codeType ) { this.codeType = codeType; }
	public double getCodeType( ) { return codeType; }
	
	public void setShortDescription( String shortDescription ) { this.shortDescription = shortDescription; }
	public String getShortDescription( ) { return shortDescription; }
	
	public void setDescription( String desription ) { this.description = desription; }
	public String getDescription( ) { return description; }
	
	public void setProtocolItems( List< ProtocolItem > protocolItems ) { this.protocolItems = protocolItems; }
	public List< ProtocolItem > getProtocolItems( ) { return protocolItems; }
	// @formatter:on
}
