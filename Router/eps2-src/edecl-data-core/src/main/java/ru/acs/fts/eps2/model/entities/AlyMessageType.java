package ru.acs.fts.eps2.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "EDECL_ALY_MSGTYPES" )
public class AlyMessageType
{
	@Id
	@Column( name = "AMSG_MSGTYPE", length = 10 )
	private String messageType;

	@Column( name = "AMSG_DESCRIPTION", length = 100, nullable = false )
	private String description;

	// @formatter:off
	public void setMessageType( String messageType ) { this.messageType = messageType; }
	public String getMessageType( ) { return messageType; }
	
	public void setDescription( String description ) { this.description = description; }
	public String getDescription( ) { return description; }
	// @formatter:on
}
