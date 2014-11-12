package ru.acs.fts.aud.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "SERVER_STATISTICS" )
public class ServerStatistic
{
	@Id
	@Column( name = "SS_STATISTIC_NAME", length = 255 )
	private String name;

	@Column( name = "SS_VALUE", length = 255, nullable = true )
	private String value;
    
	// @formatter:off
	public void setName( String name ) { this.name = name; }
	public String getName( ) { return name; }
	
	public void setValue( String value ) { this.value = value; }
	public String getValue( ) { return value; }
	// @formatter:on

}
