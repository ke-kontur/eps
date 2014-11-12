package ru.acs.fts.aly.model.entities;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table( name = "ALY_ROLES" )
public class AlyRole
{
	@Id
	@Column( name = "R_ID", length = 36, nullable = false )
	private String id;
	
	@Column( name = "R_NAME", length = 100, nullable = false )
	private String name;
	
	@Column( name = "R_DESCRIPTION", length = 200, nullable = true )
	private String description;
	
	@ManyToMany( mappedBy = "roles" )
	private Collection< AlyUser > users;

	// @formatter:off
	public void setId( String id ) { this.id = id; }
	public String getId( ) { return id; }

	public void setName( String name ) { this.name = name; }
	public String getName( ) { return name; }

	public void setDescription( String description ) { this.description = description; }
	public String getDescription( ) { return description; }
	
	public void setUsers( Collection< AlyUser > users ) { this.users = users; }
	public Collection< AlyUser > getUsers( ) { return users; }
	// @formatter:on
	
}
