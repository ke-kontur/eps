package ru.acs.fts.aud.management.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "EDECL_AUD_SETTINGS" )
public class EdeclAudSettings
{
	@Id
	@Column( name = "SET_ID", length = 36, nullable = false )
	private String id;
	
	@Column( name = "SET_NAME", length = 100, nullable = false )
	private String name;
	
	@Column( name = "SET_VALUE", length = 200, nullable = false )
	private String value;
	
	// @formatter:off
	public void setId( String id ) { this.id = id; }
	public String getId( ) { return id; }
	
	public void setName( String name ) { this.name = name; }
	public String getName( ) { return name; }
	
	public void setValue( String value ) { this.value = value; }
	public String getValue( ) { return value; }
	// @formatter:on
}
