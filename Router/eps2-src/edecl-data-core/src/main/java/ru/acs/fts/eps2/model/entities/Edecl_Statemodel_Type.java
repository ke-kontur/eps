package ru.acs.fts.eps2.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "EDECL_STATEMODEL_TYPE" )
public class Edecl_Statemodel_Type
{
	@Id
	@Column( name = "STMODTP_CODE", length = 15, nullable = false )
	private String code;
	@Column( name = "STMODTP_DESCRIPTION", length = 200 )
	private String description;

	public Edecl_Statemodel_Type( )
	{
	}

	public String getCode( )
	{
		return code;
	}

	public String getDescription( )
	{
		return description;
	}

	public void setCode( String code )
	{
		this.code = code;
	}

	public void setDescription( String description )
	{
		this.description = description;
	}
}
