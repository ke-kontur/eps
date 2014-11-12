package ru.acs.fts.aud.model.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table( name = "SEC_PERMISSION" )
public class Permission
{
	@Id
	@Column( name = "CODE", nullable = false, length = 250 )
	private String code;
	
	@Column( name = "NAME", nullable = false, length = 100 )
	private String name;
	
	@Column( name = "DESCRIPTION", nullable = true, length = 250 )
	private String description;
	
	@ManyToMany( mappedBy = "permissions", cascade = CascadeType.REFRESH )
	@JoinTable( name = "SEC_ROLE_PERMISSION_RELATION",
			joinColumns = @JoinColumn( name = "PERMISSION_CODE", referencedColumnName = "CODE" ),
			inverseJoinColumns = @JoinColumn( name = "ROLE_CODE", referencedColumnName = "CODE" )
			)
	private List< Role > roles = new ArrayList< Role >( );
	
	// @formatter:off
	public void setCode( String code ) { this.code = code; }
	public String getCode( ) { return code; }
	
	public void setName( String name ) { this.name = name; }
	public String getName( ) { return name; }
	
	public void setDescription( String description ) { this.description = description; }
	public String getDescription( ) { return description; }
	
	public void setRoles( List< Role > roles ) { this.roles = roles; }
	public List< Role > getRoles( ) { return roles; }
	// @formatter:on
}
