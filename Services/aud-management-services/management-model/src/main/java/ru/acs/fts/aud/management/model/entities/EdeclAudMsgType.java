package ru.acs.fts.aud.management.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "EDECL_AUD_MSGTYPES" )
public class EdeclAudMsgType
{
	@Id
	@Column( name = "AMSG_MSGTYPE", length = 10, nullable = false )
	private String msgType;

	@Column( name = "AMSG_DESCRIPTION", length = 100, nullable = false )
	private String description;
	
	@Column( name = "AMSG_PROCESSTYPE", length = 30, nullable = false )
	private String processType;
	
	@Column( name = "AMSG_PROCSTATE", length = 100, nullable = true )
	private String procState;

	// @formatter:off
	public void setMsgType( String msgType ) { this.msgType = msgType; }
	public String getMsgType( ) { return msgType; }

	public void setDescription( String description ) { this.description = description; }
	public String getDescription( ) { return description; }

	public void setProcessType( String processType ) { this.processType = processType; }
	public String getProcessType( ) { return processType; }

	public void setProcState( String procState ) { this.procState = procState; }
	public String getProcState( ) { return procState; }
	// @formatter:on
}
