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
@Table( name = "SEC_USER" )
public class User
{
	@Id
	@Column( name = "LOGIN", length = 100 )
	private String login;
	
	@Column( name = "PASSWORD", nullable = false, length = 100 )
	private String password;
	
	@Column( name = "FIRST_NAME", nullable = false, length = 100 )
	private String firstName;
	
	@Column( name = "LAST_NAME", nullable = false, length = 100 )
	private String lastName;
	
	@ManyToMany( cascade = CascadeType.REFRESH )
	@JoinTable( name = "SEC_USER_ROLE_RELATION",
			joinColumns = @JoinColumn( name = "USER_LOGIN", referencedColumnName = "LOGIN" ),
			inverseJoinColumns = @JoinColumn( name = "ROLE_CODE", referencedColumnName = "CODE" ) 
			)
	private List< Role > roles = new ArrayList< Role >( );
	
	// @formatter:off
	public void setLogin( String login ) { this.login = login; }
	public String getLogin( ) { return login; }
	
	public void setPassword( String password ) { this.password = password; }
	public String getPassword( ) { return password; }
	
	public void setFirstName( String firstName ) { this.firstName = firstName; }
	public String getFirstName( ) { return firstName; }
	
	public void setLastName( String lastName ) { this.lastName = lastName; }
	public String getLastName( ) { return lastName; } 
	
	public void setRoles( List< Role > roles ) { this.roles = roles; }
	public List< Role > getRoles( ) { return roles; }
	// @formatter:on
}
