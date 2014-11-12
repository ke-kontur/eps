/**
 * 
 */
package ru.acs.fts.eps2.model.entities;

import java.util.Date;

/**
 * @author mns
 * 
 * @since 5.0.12/3.0.9
 * @created 18.06.2013
 */
public class EcopIds extends AbstractIds // NO_UCD (use default)
{

	private static final long serialVersionUID = 4584435521578098787L;

	private String st;

	private String nlic;

	private String prPer;

	private Date dBegin;

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

	public Date getDBegin( )
	{
		return dBegin;
	}

	public void setDBegin( Date dBegin )
	{
		this.dBegin = dBegin;
	}

}
