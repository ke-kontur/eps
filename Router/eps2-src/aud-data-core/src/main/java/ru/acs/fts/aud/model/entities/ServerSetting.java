package ru.acs.fts.aud.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;

import ru.acs.fts.aud.model.converter.UUIDConverter;

@Entity
@Table( name = "SERVER_SETTING" )
public class ServerSetting
{
	@Id
	@Column( name = "ID" )
	@Converter( name = "uuidConverter", converterClass = UUIDConverter.class )
	@Convert( "uuidConverter" )
	private String id; // GUID
	
	@Column( name = "SETTINGNAME", nullable = true, length = 255 )
	private String name;
	
	@Lob
	@Column( name = "VALUE", nullable = true )
	private byte[ ] value;
    
	// @formatter:off
	public void setId( String id ) { this.id = id; }
	public String getId( ) { return id; }
	
	public void setName( String name ) { this.name = name; }
	public String getName( ) { return name; }
	
	public void setValue( byte[ ] value ) { this.value = value; }
	public byte[ ] getValue( ) { return value; }
	// @formatter:on
}
