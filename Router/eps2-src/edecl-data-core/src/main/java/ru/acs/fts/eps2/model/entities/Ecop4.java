/**
 * 
 */
package ru.acs.fts.eps2.model.entities;

import java.math.BigDecimal;
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
@Table( name = "EDECL_ECOP4" )
public class Ecop4
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

	@Column( name = "DEND" )
	@Temporal( TemporalType.DATE )
	private Date dEnd;

	@Column( name = "GUARKIND", length = 2 )
	private String guarkind;

	@Column( name = "NUMBDOCTP", length = 25 )
	private String numbdoctp;

	@Column( name = "DATBDOCTP" )
	@Temporal( TemporalType.DATE )
	private Date datbdoctp;

	@Column( name = "BEGDOCTP" )
	@Temporal( TemporalType.DATE )
	private Date begdoctp;

	@Column( name = "ENDDOCTP" )
	@Temporal( TemporalType.DATE )
	private Date enddoctp;

	@Column( name = "AMOUNT", precision = 20, scale = 2 )
	private BigDecimal amount;

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

	public Date getdEnd( ) // NO_UCD (unused code)
	{
		return dEnd;
	}

	public void setdEnd( Date dEnd ) // NO_UCD (unused code)
	{
		this.dEnd = dEnd;
	}

	public String getGuarkind( )
	{
		return guarkind;
	}

	public void setGuarkind( String guarkind )
	{
		this.guarkind = guarkind;
	}

	public String getNumbdoctp( )
	{
		return numbdoctp;
	}

	public void setNumbdoctp( String numbdoctp )
	{
		this.numbdoctp = numbdoctp;
	}

	public Date getDatbdoctp( )
	{
		return datbdoctp;
	}

	public void setDatbdoctp( Date datbdoctp )
	{
		this.datbdoctp = datbdoctp;
	}

	public Date getBegdoctp( )
	{
		return begdoctp;
	}

	public void setBegdoctp( Date begdoctp )
	{
		this.begdoctp = begdoctp;
	}

	public Date getEnddoctp( )
	{
		return enddoctp;
	}

	public void setEnddoctp( Date enddoctp )
	{
		this.enddoctp = enddoctp;
	}

	public BigDecimal getAmount( )
	{
		return amount;
	}

	public void setAmount( BigDecimal amount )
	{
		this.amount = amount;
	}

}
