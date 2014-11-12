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
@Table( name = "SEC_ROLE" )
public class Role
{
	@Id
	@Column( name = "CODE", length = 100)
	private String code;
	
	@Column( name = "NAME", nullable = false, length = 100 )
	private String name;
	
	@Column( name = "DESCRIPTION", nullable = true, length = 250 )
	private String description;
	
	@ManyToMany( cascade = CascadeType.REFRESH )
	@JoinTable( name = "SEC_ROLE_PERMISSION_RELATION",
			joinColumns = @JoinColumn( name = "ROLE_CODE", referencedColumnName = "CODE" ),
			inverseJoinColumns = @JoinColumn( name = "PERMISSION_CODE", referencedColumnName = "CODE" )
			)
	private List< Permission > permissions = new ArrayList< Permission >( );
	
	@ManyToMany( mappedBy = "roles", cascade = CascadeType.REFRESH )
	@JoinTable( name = "SEC_USER_ROLE_RELATION",
			joinColumns = @JoinColumn( name = "ROLE_CODE", referencedColumnName = "CODE" ),
			inverseJoinColumns = @JoinColumn( name = "USER_LOGIN", referencedColumnName = "LOGIN" )
			)
	private List< User > users = new ArrayList< User >( );
	
	// @formatter:off
	public void setCode( String code ) { this.code = code; }
	public String getCode( ) { return code; }
	
	public void setName( String name ) { this.name = name; }
	public String getName( ) { return name; }
	
	public void setDescription( String description ) { this.description = description; }
	public String getDescription( ) { return description; }
	
	public void setPermissions( List< Permission > permissions ) { this.permissions = permissions; }
	public List< Permission > getPermissions( ) { return permissions; }
	
	public void setUsers( List< User > users ) { this.users = users; }
	public List< User > getUsers( ) { return users; }
	// @formatter:on
}
