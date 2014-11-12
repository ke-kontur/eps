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
@Table( name = "EDECL_ECOP2" )
public class Ecop2
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

	@Column( name = "KOD_TAM", length = 8 )
	private String kodTam;

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

	public String getKodTam( )
	{
		return kodTam;
	}

	public void setKodTam( String kodTam )
	{
		this.kodTam = kodTam;
	}

}
