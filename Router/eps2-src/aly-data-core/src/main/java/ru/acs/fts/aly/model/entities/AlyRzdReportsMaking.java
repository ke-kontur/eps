package ru.acs.fts.aly.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table( name = "ALY_RZD_REPORTS_MAKING" )
public class AlyRzdReportsMaking
{
	@Id
	@Column( name = "RRM_DSTAMP", nullable = false )
	private Integer dstamp;
	
	@Column( name = "RRM_MADE", nullable = false )
	private short isMade;
	
	@Column( name = "RRM_IS_BEING_MADE", nullable = false )
	private short isBeingMade;

	// @formatter:off
	public void setDstamp( Integer dstamp ) { this.dstamp = dstamp; }
	public Integer getDstamp( ) { return dstamp; }

	public void setIsMade( short isMade ) { this.isMade = isMade; }
	public short getIsMade( ) { return isMade; }

	public short getIsBeingMade( ) { return isBeingMade; }
	public void setIsBeingMade( short isBeingMade ) { this.isBeingMade = isBeingMade; }
	// @formatter:on
	
	@Transient
	public boolean isMade( )
	{
		return ( isMade > 0 );
	}
	
	@Transient
	public boolean isBeingMade( )
	{
		return ( isBeingMade > 0 );
	}
}
