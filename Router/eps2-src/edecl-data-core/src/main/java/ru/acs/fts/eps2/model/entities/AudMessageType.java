package ru.acs.fts.eps2.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "EDECL_AUD_MSGTYPES" )
public class AudMessageType
{
	@Id
	@Column( name = "AMSG_MSGTYPE", length = 10 )
	private String messageType;
	
	@Column( name = "AMSG_DESCRIPTION", length = 100, nullable = false )
	private String description;
	
	@Column( name = "AMSG_PROCESSTYPE", length = 30, nullable = false )
	private String processType;
	
	@Column( name = "AMSG_PROCSTATE", length = 100 )
	private String processState;
	
	// @formatter:off
	public void setMessageType( String messageType ) { this.messageType = messageType; }
	public String getMessageType( ) { return messageType; }
	
	public void setDescription( String description ) { this.description = description; }
	public String getDescription( ) { return description; }
	
	public void setProcessType( String processType ) { this.processType = processType; }
	public String getProcessType( ) { return processType; }
	
	public void setProcessState( String processState ) { this.processState = processState; }
	public String getProcessState( ) { return processState; }
	// @formatter:on
}
