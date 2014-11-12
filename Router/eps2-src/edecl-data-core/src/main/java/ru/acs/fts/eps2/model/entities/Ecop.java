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
@Table( name = "EDECL_ECOP" )
public class Ecop
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

	@Column( name = "N_BLANK", length = 10 )
	private String nBlank;

	@Id
	@Column( name = "DBEGIN" )
	@Temporal( TemporalType.DATE )
	private Date dBegin;

	@Column( name = "DEND" )
	@Temporal( TemporalType.DATE )
	private Date dEnd;

	@Column( name = "IDEL" )
	private int idel;

	@Column( name = "OWNER", length = 255 )
	private String owner;

	@Column( name = "OPF_VL", length = 2 )
	private String opfVl;

	@Column( name = "SUBD", length = 50 )
	private String subD;

	@Column( name = "CITY", length = 35 )
	private String city;

	@Column( name = "POST", length = 9 )
	private String post;

	@Column( name = "STREET", length = 50 )
	private String street;

	@Column( name = "TELEPHON", length = 100 )
	private String telephon;

	@Column( name = "TELETYPE", length = 100 )
	private String teletype;

	@Column( name = "TELEFAX", length = 100 )
	private String telefax;

	@Column( name = "EMAIL", length = 100 )
	private String email;

	@Column( name = "WEBSITE", length = 100 )
	private String webSite;

	@Column( name = "OGRN", length = 15 )
	private String ogrn;

	@Column( name = "INN", length = 20 )
	private String inn;

	@Column( name = "KPP", length = 9 )
	private String kpp;

	@Column( name = "OKPO", length = 10 )
	private String okpo;

	@Column( name = "DATE_MOD" )
	@Temporal( TemporalType.DATE )
	private Date dateMod;

	@Column( name = "NUMBEGDOC", length = 20 )
	private String numBegDoc;

	@Column( name = "DATBEGDOC" )
	@Temporal( TemporalType.DATE )
	private Date datBegDoc;

	@Column( name = "NUMENDDOC", length = 20 )
	private String numEndDoc;

	@Column( name = "DATENDDOC" )
	@Temporal( TemporalType.DATE )
	private Date dateEndDoc;

	@Column( name = "NUMSUSDOC", length = 20 )
	private String numSusDoc;

	@Column( name = "DATSUSDOC" )
	@Temporal( TemporalType.DATE )
	private Date dateSusDoc;

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

	public String getnBlank( ) // NO_UCD (unused code)
	{
		return nBlank;
	}

	public void setnBlank( String nBlank ) // NO_UCD (unused code)
	{
		this.nBlank = nBlank;
	}

	public Date getDBegin( )
	{
		return dBegin;
	}

	public void setDBegin( Date dBegin )
	{
		this.dBegin = dBegin;
	}

	public Date getDEnd( )
	{
		return dEnd;
	}

	public void setDEnd( Date dEnd )
	{
		this.dEnd = dEnd;
	}

	public int getIdel( )
	{
		return idel;
	}

	public void setIdel( int idel )
	{
		this.idel = idel;
	}

	public String getOwner( )
	{
		return owner;
	}

	public void setOwner( String owner )
	{
		this.owner = owner;
	}

	public String getOpfVl( )
	{
		return opfVl;
	}

	public void setOpfVl( String opfVl )
	{
		this.opfVl = opfVl;
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

	public String getPost( )
	{
		return post;
	}

	public void setPost( String post )
	{
		this.post = post;
	}

	public String getStreet( )
	{
		return street;
	}

	public void setStreet( String street )
	{
		this.street = street;
	}

	public String getTelephon( )
	{
		return telephon;
	}

	public void setTelephon( String telephon )
	{
		this.telephon = telephon;
	}

	public String getTeletype( )
	{
		return teletype;
	}

	public void setTeletype( String teletype )
	{
		this.teletype = teletype;
	}

	public String getTelefax( )
	{
		return telefax;
	}

	public void setTelefax( String telefax )
	{
		this.telefax = telefax;
	}

	public String getEmail( )
	{
		return email;
	}

	public void setEmail( String email )
	{
		this.email = email;
	}

	public String getWebSite( )
	{
		return webSite;
	}

	public void setWebSite( String webSite )
	{
		this.webSite = webSite;
	}

	public String getOgrn( )
	{
		return ogrn;
	}

	public void setOgrn( String ogrn )
	{
		this.ogrn = ogrn;
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

	public String getOkpo( )
	{
		return okpo;
	}

	public void setOkpo( String okpo )
	{
		this.okpo = okpo;
	}

	public Date getDateMod( )
	{
		return dateMod;
	}

	public void setDateMod( Date dateMod )
	{
		this.dateMod = dateMod;
	}

	public String getNumBegDoc( )
	{
		return numBegDoc;
	}

	public void setNumBegDoc( String numBegDoc )
	{
		this.numBegDoc = numBegDoc;
	}

	public Date getDatBegDoc( )
	{
		return datBegDoc;
	}

	public void setDatBegDoc( Date datBegDoc )
	{
		this.datBegDoc = datBegDoc;
	}

	public String getNumEndDoc( )
	{
		return numEndDoc;
	}

	public void setNumEndDoc( String numEndDoc )
	{
		this.numEndDoc = numEndDoc;
	}

	public Date getDateEndDoc( )
	{
		return dateEndDoc;
	}

	public void setDateEndDoc( Date dateEndDoc )
	{
		this.dateEndDoc = dateEndDoc;
	}

	public String getNumSusDoc( )
	{
		return numSusDoc;
	}

	public void setNumSusDoc( String numSusDoc )
	{
		this.numSusDoc = numSusDoc;
	}

	public Date getDateSusDoc( )
	{
		return dateSusDoc;
	}

	public void setDateSusDoc( Date dateSusDoc )
	{
		this.dateSusDoc = dateSusDoc;
	}

}
