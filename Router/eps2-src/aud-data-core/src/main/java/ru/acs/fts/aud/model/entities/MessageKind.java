package ru.acs.fts.aud.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name ="MESSAGE_KINDS" )
public class MessageKind
{
	@Id
	@Column( name = "CODE", length = 30 )
	private String code;
	
	@Column( name = "DESCRIPTION", length = 250, nullable = true )
	private String description;
	
	// @formatter:off
	public void setCode( String code ) { this.code = code; }
	public String getCode( ) { return code; }
	
	public void setDescription( String description ) { this.description = description; }
	public String getDescription( ) { return description; }
	// @formatter:on
}
