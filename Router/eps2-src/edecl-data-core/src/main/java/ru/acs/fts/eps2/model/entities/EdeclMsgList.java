package ru.acs.fts.eps2.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "EDECL_MSGLIST" )
public class EdeclMsgList
{
	@Id
	@Column( name = "MSGL_CODE", length = 9, nullable = false )
	private String messageType;
	
	@Column( name = "MSGL_DESCRIPTION", length = 250, nullable = true )
	private String description;
	
	// @formatter:off
	public void setMessageType( String messageType ) { this.messageType = messageType; }
	public String getMessageType( ) { return messageType; }
	
	public void setDescription( String description ) { this.description = description; }
	public String getDescription( ) { return description; }
	// @formatter:on
}
