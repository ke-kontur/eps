package ru.acs.fts.eps2.model.entities;

import javax.persistence.*;

import oracle.sql.TIMESTAMPTZ;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.TypeConverter;

import java.util.Calendar;
import java.util.Date;

@Entity
@Table( name = "EDECL_PROC_INFORMATION" )
public class Edecl_Proc_Information
{
	public static final int FLAG_PROC_ISSUED = 0x00000001;
	
	public Edecl_Proc_Information( )
	{
	}

	@Id
	@Column( name = "PROC_PROCESSID", length = 36, nullable = false )
	private String processId;
	
	@Column( name = "PROC_TRANSFERTYPE", length = 2 )
	private String transferType = null;
	
	@Column( name = "PROC_CUSTPROCEDURECODE", length = 2 )
	private String custProcedureCode;
	
	@Column( name = "PROC_SOFTVERSION", length = 100, nullable = false )
	private String softVersion;
	
	@Column( name = "PROC_GTDID_CUSTCODE", length = 8 )
	private String gtdIdCustCode = null;
	
	@Temporal( TemporalType.DATE )
	@Column( name = "PROC_GTDID_DATE" )
	private Date gtdIdDate;
	
	@Column( name = "PROC_GTDID_REGNUM", length = 7 )
	private String gtdIdRegNum;
	
	@Column( name = "PROC_CURRENT_STATE", length = 30, nullable = false )
	private String currentState;
	
	@Column( name = "PROC_LIVEMODE", nullable = false )
	private int liveMode = 1;
	
	@Column( name = "PROC_IS_TEST", length = 1 )
	private String isTest;
	
	@Column( name = "PROC_TEST_DESCR", length = 250 )
	private String testDescr;
	
	@Column( name = "PROC_PARTICIPANTID", length = 100, nullable = false )
	private String participantId;
	
	@Column( name = "PROC_TST_SCR_NUM", length = 10 )
	private String tstScrNum;
	
	@Column( name = "PROC_AJD_PACKAGEID", length = 36 )
	private String ajdPacketId;
	
	@Column( name = "PROC_BORDER_CUST_CODE", length = 8 )
	private String borderCustCode;
	
	@Column( name = "PROC_UD_FLAG", length = 1, nullable = false )
	private int udFlag = 0; // Флаг удаленного выпуска.
	
	@Column( name = "PROC_AJD_PACKAGE_STATE", length = 100 )
	private String ajdPackageState;
	
	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamptz" )
	@TypeConverter( name = "timestamptz", dataType = TIMESTAMPTZ.class )
	@Column( name = "PROC_AJD_PUTDATETIME", length = 9, columnDefinition = "TIMESTAMP(9) WITH TIME ZONE" )
	private Date putDateTime;
	
	@Column( name = "PROC_CUST_CODE", length = 8, nullable = false )
	private String custCode;
	
	@Column( name = "PROC_EXCHTYPE", length = 8, nullable = false )
	private int exchType;
	
	@Column( name = "PROC_COMPRESSTYPE", length = 15 )
	private String compressType;
	
	@Column( name = "PROC_ASKTT_RCV_CUST", length = 8 )
	private Long askttRecvCust;
	
	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamptz" )
	@TypeConverter( name = "timestamptz", dataType = TIMESTAMPTZ.class )
	@Column( name = "PROC_AEO_DEADLINE", length = 9, columnDefinition = "TIMESTAMP(9) WITH TIME ZONE" )
	private Calendar deadline;
	
	@Column( name = "PROC_FLAGS", nullable = false )
	private int flags = 0;

	// @formatter:off
	public void setProcessId( String processId ) { this.processId = processId; }
	public String getProcessId( ) { return processId; }

	public void setSoftVersion( String softVersion ) { this.softVersion = softVersion; }
	public String getSoftVersion( ) { return softVersion; }

	public void setCurrentState( String currentState ) { this.currentState = currentState; }
	public String getCurrentState( ) { return currentState; }

	public void setUdFlag( int udFlag ) { this.udFlag = udFlag; }
	public int getUdFlag( ) { return udFlag; }

	public void setCompressType( String compressType ) { this.compressType = compressType; }
	public String getCompressType( ) { return compressType; }

	public void setTransferType( String transferType ) { this.transferType = transferType; }
	public String getTransferType( ) { return transferType; }

	public void setCustProcedureCode( String custProcedureCode ) { this.custProcedureCode = custProcedureCode; }
	public String getCustProcedureCode( ) { return custProcedureCode; }

	public void setGtdIdCustCode( String gtdIdCustCode ) { this.gtdIdCustCode = gtdIdCustCode; }
	public String getGtdIdCustCode( ) { return gtdIdCustCode; }

	public void setGtdIdDate( Date gtdIdDate ) { this.gtdIdDate = gtdIdDate; }
	public Date getGtdIdDate( ) { return gtdIdDate; }

	public void setGtdIdRegNum( String gtdIdRegNum ) { this.gtdIdRegNum = gtdIdRegNum; }
	public String getGtdIdRegNum( ) { return gtdIdRegNum; }

	public void setLiveMode( int liveMode ) { this.liveMode = liveMode; }
	public int getLiveMode( ) { return liveMode; }

	public void setIsTest( String test ) { isTest = test; }
	public String getTest( ) { return isTest; }

	public void setParticipantId( String participantId ) { this.participantId = participantId; }
	public String getParticipantId( ) { return participantId; }

	public void setTstScrNum( String tstScrNum ) { this.tstScrNum = tstScrNum; }
	public String getTstScrNum( ) { return tstScrNum; }

	public void setAjdPacketId( String ajdPacketId ) { this.ajdPacketId = ajdPacketId; }
	public String getAjdPacketId( ) { return ajdPacketId; }

	public void setBorderCustCode( String borderCustCode ) { this.borderCustCode = borderCustCode; }
	public String getBorderCustCode( ) { return borderCustCode; }

	public void setAjdPackageState( String ajdPackageState ) { this.ajdPackageState = ajdPackageState; }
	public String getAjdPackageState( ) { return ajdPackageState; }

	public void setPutDateTime( Date putDateTime ) { this.putDateTime = putDateTime; }
	public Date getPutDateTime( ) { return putDateTime; }

	public void setCustCode( String custCode ) { this.custCode = custCode; }
	public String getCustCode( ) { return custCode; }

	public void setExchType( int exchType ) { this.exchType = exchType; }
	public int getExchType( ) { return exchType; }

	public void setTestDescr( String testDescr ) { this.testDescr = testDescr; }
	public String getTestDescr( ) { return testDescr; }

	public void setAskttRecvCust( Long askttRcvCust ) { this.askttRecvCust = askttRcvCust; }
	public Long getAskttRecvCust( ) { return askttRecvCust; }

	public void setDeadline( Calendar deadline ) { this.deadline = deadline; }
	public Calendar getDeadline( ) { return deadline; }
	
	public void setFlags( int flags ) { this.flags = flags; }
	public int getFlags( ) { return flags; }
	// @formatter:on

}
