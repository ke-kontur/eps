package ru.acs.fts.aly.model.entities;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table( name = "ALY_USERS" )
public class AlyUser
{
	@Id
	@Column( name = "U_ID", length = 36, nullable = false )
	private String id;
	
	@Column( name = "U_EMAIL", length = 100, nullable = false )
	private String email;
	
	@Column( name = "U_PASSWORD", length = 100, nullable = false )
	private String password;
	
	@ManyToMany
	@JoinTable( name="ALY_USERS_ROLES", joinColumns = @JoinColumn( name = "UR_USER_ID" ), inverseJoinColumns = @JoinColumn( name = "UR_ROLE_ID" ) )
	private Collection< AlyRole > roles = new ArrayList< AlyRole >( );

	// @formatter:off
	public void setId( String id ) { this.id = id; }
	public String getId( ) { return id; }

	public void setEmail( String email ) { this.email = email; }
	public String getEmail( ) { return email; }

	public void setPassword( String password ) { this.password = password; }
	public String getPassword( ) { return password; }
	
	public void setRoles( Collection< AlyRole > roles ) { this.roles = roles; }
	public Collection< AlyRole > getRoles( ) { return roles; }
	// @formatter:on
	
	public boolean hasRole( String role )
	{
		for ( AlyRole xrole : roles )
		{
			if ( xrole.getName( ).equals( role ) )
				return true;
		}
		
		return false;
	}
	
	public boolean hasRoleId( String roleId )
	{
		for ( AlyRole xrole : roles )
		{
			if ( xrole.getId( ).equals( roleId ) )
				return true;
		}
		
		return false;
	}
	
	public void removeRole( String roleId )
	{
		for ( AlyRole role : roles )
		{
			if ( role.getId( ).equals( roleId ) )
			{
				roles.remove( role );
				break;
			}
		}
	}
	
	public void addRole( AlyRole role )
	{
		roles.add( role );
	}
	
}
