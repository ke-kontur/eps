package ru.acs.fts.eps2.model.entities;

import javax.persistence.*;

import oracle.sql.TIMESTAMPTZ;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.TypeConverter;

import java.util.Calendar;

/**
 * User: CAA Date: 28.12.2012 Time: 12:00
 */

@Entity
@Table( name = "EDECL_PROCSTATE" )
public class Edecl_Procstate
{
	public Edecl_Procstate( )
	{

	}
	
	@Id
	@Column( name = "PRST_ID" ) // Используется всего лишь в одном 
	@GeneratedValue( generator = "PrstIdSeq" )
	@SequenceGenerator( name = "PrstIdSeq", sequenceName = "PRST_ID_SEQ", allocationSize = 1 )
	private Integer id;

	@Column( name = "PRST_ENVELOPEID", length = 36 )
	private String envelopeId;
	
	@Column( name = "PRST_ST_CODE", length = 30, nullable = false )
	private String code;
	
	@Column( name = "PRST_PROCESSID", length = 36, nullable = false )
	private String processId;
	
	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamptz" )
	@TypeConverter( name = "timestamptz", dataType = TIMESTAMPTZ.class )
	@Column( name = "PRST_SETSTATUSTIME", length = 9, nullable = false, columnDefinition = "TIMESTAMP(9) WITH TIME ZONE NOT NULL" )
	private Calendar setStatusTime;

	@Transient
	private Boolean needSave;
	
	public void setId( Integer id ) { this.id = id; }
	public Integer getId( ) { return id; }

	public String getEnvelopeId( )
	{
		return envelopeId;
	}

	public void setEnvelopeId( String envelopeId )
	{
		this.envelopeId = envelopeId;
	}

	public String getCode( )
	{
		return code;
	}

	public void setCode( String code )
	{
		this.code = code;
	}

	public String getProcessId( )
	{
		return processId;
	}

	public void setProcessId( String processId )
	{
		this.processId = processId;
	}

	public Calendar getSetStatusTime( )
	{
		return setStatusTime;
	}

	public void setSetStatusTime( Calendar setStatusTime )
	{
		this.setStatusTime = setStatusTime;
	}

	public Boolean isNeedSave( ) // NO_UCD (unused code)
	{
		return needSave;
	}

	public void setNeedSave( Boolean needSave )
	{
		this.needSave = needSave;
	}
}