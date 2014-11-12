/**
 * 
 */
package ru.acs.fts.eps2.model.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author mns
 * 
 * @since 5.0.12/3.0.9
 * @created 18.06.2013
 */
@Entity
@IdClass( EcopIds.class )
@Table( name = "EDECL_ECOP1" )
public class Ecop1
{

	@Id
	@Column( name = "ST", length = 2 )
	private String st;

	@Id
	@Column( name = "NLIC", length = 25 )
	private String nlic;

	@Id
	@Column( name = "PR_PER", length = 1 )
	private String prPer;

	@Id
	@Column( name = "DBEGIN" )
	@Temporal( TemporalType.DATE )
	private Date dBegin;

	@Column( name = "OWNER", length = 255 )
	private String owner;

	@Column( name = "INN", length = 20 )
	private String inn;

	@Column( name = "KPP", length = 9 )
	private String kpp;

	@Column( name = "POST", length = 9 )
	private String post;

	@Column( name = "SUBD", length = 50 )
	private String subD;

	@Column( name = "CITY", length = 35 )
	private String city;

	@Column( name = "STREET", length = 50 )
	private String street;

	public String getSt( )
	{
		return st;
	}

	public void setSt( String st )
	{
		this.st = st;
	}

	public String getNlic( )
	{
		return nlic;
	}

	public void setNlic( String nlic )
	{
		this.nlic = nlic;
	}

	public String getPrPer( )
	{
		return prPer;
	}

	public void setPrPer( String prPer )
	{
		this.prPer = prPer;
	}

	public Date getdBegin( ) // NO_UCD (unused code)
	{
		return dBegin;
	}

	public void setdBegin( Date dBegin ) // NO_UCD (unused code)
	{
		this.dBegin = dBegin;
	}

	public String getOwner( )
	{
		return owner;
	}

	public void setOwner( String owner )
	{
		this.owner = owner;
	}

	public String getInn( )
	{
		return inn;
	}

	public void setInn( String inn )
	{
		this.inn = inn;
	}

	public String getKpp( )
	{
		return kpp;
	}

	public void setKpp( String kpp )
	{
		this.kpp = kpp;
	}

	public String getPost( )
	{
		return post;
	}

	public void setPost( String post )
	{
		this.post = post;
	}

	public String getSubD( )
	{
		return subD;
	}

	public void setSubD( String subD )
	{
		this.subD = subD;
	}

	public String getCity( )
	{
		return city;
	}

	public void setCity( String city )
	{
		this.city = city;
	}

	public String getStreet( )
	{
		return street;
	}

	public void setStreet( String street )
	{
		this.street = street;
	}
}
