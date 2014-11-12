package ru.acs.fts.eps2.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 * User: CAA Date: 28.12.2012 Time: 12:00
 */

@Entity
@IdClass( Edecl_State_Transmissions_Ids.class )
@Table( name = "EDECL_STATE_TRANSMISSIONS" )
public class Edecl_State_Transmissions
{
	public Edecl_State_Transmissions( )
	{

	}

	@Id
	@Column( name = "STTR_STATECODE", length = 30, nullable = false )
	private String stateCode;
	@Id
	@Column( name = "STTR_SOFTVERSIONID", length = 100, nullable = false )
	private String softVersionId;
	@Id
	@Column( name = "STTR_RESULTSTATECODE", length = 30, nullable = false )
	private String resultStateCode;
	@Id
	@Column( name = "STTR_INCOMINGMSGCODE", length = 9, nullable = false )
	private String incomingMsgCode;
	@Id
	@Column( name = "STTR_EVENTNAME", length = 100, nullable = false )
	private String eventName;

	@Column( name = "STTR_STMODTYPECODE", length = 15, nullable = false )
	private String stmodeTypeCode;

	public String getStateCode( )
	{
		return stateCode;
	}

	public String getSoftVersionId( )
	{
		return softVersionId;
	}

	public String getResultStateCode( )
	{
		return resultStateCode;
	}

	public String getIncomingMsgCode( )
	{
		return incomingMsgCode;
	}

	public String getEventName( )
	{
		return eventName;
	}

	public String getStmodeTypeCode( )
	{
		return stmodeTypeCode;
	}

	public void setStateCode( String stateCode )
	{
		this.stateCode = stateCode;
	}

	public void setSoftVersionId( String softVersionId )
	{
		this.softVersionId = softVersionId;
	}

	public void setResultStateCode( String resultStateCode )
	{
		this.resultStateCode = resultStateCode;
	}

	public void setIncomingMsgCode( String incomingMsgCode )
	{
		this.incomingMsgCode = incomingMsgCode;
	}

	public void setEventName( String eventName )
	{
		this.eventName = eventName;
	}

	public void setStmodeTypeCode( String stmodeTypeCode )
	{
		this.stmodeTypeCode = stmodeTypeCode;
	}
}
