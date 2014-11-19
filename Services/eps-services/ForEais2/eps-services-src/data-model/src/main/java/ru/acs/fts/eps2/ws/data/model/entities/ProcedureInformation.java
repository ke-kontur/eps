package ru.acs.fts.eps2.ws.data.model.entities;

import java.sql.Date;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import oracle.sql.TIMESTAMPTZ;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.TypeConverter;

@Entity
@Table( name = "EDECL_PROC_INFORMATION" )
public class ProcedureInformation
{
	@Id
	@Column( name = "PROC_PROCESSID", length = 36, nullable = false )
	private String processId;
	
	@Column( name = "PROC_AJD_PACKAGE_STATE", length = 100, nullable = true )
	private String audPackageState;
	
	@Column( name = "PROC_AJD_PACKAGEID", length = 36, nullable = true )
	private String audPackageId;
	
	@Column( name = "PROC_BORDER_CUST_CODE", nullable = true )
	private Integer borderCustCode;
	
	@Column( name = "PROC_COMPRESSTYPE", length = 15, nullable = true )
	private String compressType;
	
	@Column( name = "PROC_CURRENT_STATE", length = 30, nullable = false )
	private String currentState;
	
	@Column( name = "PROC_CUST_CODE", nullable = false )
	private Integer custCode;
	
	@Column( name = "PROC_CUSTPROCEDURECODE", length = 2, nullable = true )
	private String custProcedureCode;
	
	@Column( name = "PROC_EXCHTYPE", nullable = false )
	private Integer exchType;
	
	@Column( name = "PROC_GTDID_CUSTCODE", length = 8, nullable = true )
	private String gtdIdCustCode;
	
	@Column( name = "PROC_GTDID_DATE", nullable = true )
	private Date gtdIdDate;
	
	@Column( name = "PROC_GTDID_REGNUM", length = 8, nullable = true )
	private String gtdIdRegNum;
	
	@Column( name = "PROC_IS_TEST", nullable = true )
	private Integer isTest;
	
	@Column( name = "PROC_LIVEMODE", nullable = false )
	private int liveMode;
	
	@Column( name = "PROC_PARTICIPANTID", length = 100, nullable = false )
	private String participantId;
	
	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamptz" )
	@TypeConverter( name = "timestamptz", dataType = TIMESTAMPTZ.class )
	@Column( name = "PROC_AJD_PUTDATETIME", length = 9, nullable = true, columnDefinition = "TIMESTAMP(9) WITH TIME ZONE NULL" )
	private Calendar audPutDateTime;
	
	@Column( name = "PROC_SOFTVERSION", length = 100, nullable = false )
	private String softVersion;
	
	@Column( name = "PROC_TEST_DESCR", length = 250, nullable = true )
	private String testDescription;
	
	@Column( name = "PROC_TRANSFERTYPE", length = 2, nullable = true )
	private String transferType;
	
	@Column( name = "PROC_TST_SCR_NUM", length = 10, nullable = true )
	private String tstSrcNum;
	
	@Column( name = "PROC_UD_FLAG", nullable = false )
	private int udFlag = 0;
	
	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamptz" )
	@TypeConverter( name = "timestamptz", dataType = TIMESTAMPTZ.class )
	@Column( name = "PROC_AEO_DEADLINE", length = 9, nullable = true, columnDefinition = "TIMESTAMP(9) WITH TIME ZONE NULL" )
	private Calendar aeoDeadLine;
	
	@Column( name = "PROC_ASKTT_RCV_CUST", nullable = true )
	private Integer askttRcvCust;

	// @formatter:off
	public void setProcessId( String processId ) { this.processId = processId; }
	public String getProcessId( ) { return processId; }

	public void setAudPackageState( String audPackageState ) { this.audPackageState = audPackageState; }
	public String getAudPackageState( ) { return audPackageState; }

	public void setAudPackageId( String audPackageId ) { this.audPackageId = audPackageId; }
	public String getAudPackageId( ) { return audPackageId; }

	public void setBorderCustCode( Integer borderCustCode ) { this.borderCustCode = borderCustCode; }
	public Integer getBorderCustCode( ) { return borderCustCode; }

	public void setCompressType( String compressType ) { this.compressType = compressType; }
	public String getCompressType( ) { return compressType; }

	public void setCurrentState( String currentState ) { this.currentState = currentState; }
	public String getCurrentState( ) { return currentState; }

	public void setCustCode( int custCode ) { this.custCode = custCode; }
	public int getCustCode( ) { return custCode; }

	public void setCustProcedureCode( String custProcedureCode ) { this.custProcedureCode = custProcedureCode; }
	public String getCustProcedureCode( ) { return custProcedureCode; }

	public void setExchType( int exchType ) { this.exchType = exchType; }
	public int getExchType( ) { return exchType; }

	public void setGtdIdCustCode( String gtdIdCustCode ) { this.gtdIdCustCode = gtdIdCustCode; }
	public String getGtdIdCustCode( ) { return gtdIdCustCode; }

	public void setGtdIdDate( Date gtdIdDate ) { this.gtdIdDate = gtdIdDate; }
	public Date getGtdIdDate( ) { return gtdIdDate; }

	public void setGtdIdRegNum( String gtdidRegNum ) { this.gtdIdRegNum = gtdidRegNum; }
	public String getGtdIdRegNum( ) { return gtdIdRegNum; }

	public void setIsTest( Integer isTest ) { this.isTest = isTest; }
	public Integer getIsTest( ) { return isTest; }

	public void setLiveMode( int liveMode ) { this.liveMode = liveMode; }
	public int getLiveMode( ) { return liveMode; }

	public void setParticipantId( String participantId ) { this.participantId = participantId; }
	public String getParticipantId( ) { return participantId; }

	public void setAudPutDateTime( Calendar audPutDateTime ) { this.audPutDateTime = audPutDateTime; }
	public Calendar getAudPutDateTime( ) { return audPutDateTime; }

	public void setSoftVersion( String softVersion ) { this.softVersion = softVersion; }
	public String getSoftVersion( ) { return softVersion; }

	public void setTestDescription( String testDescription ) { this.testDescription = testDescription; }
	public String getTestDescription( ) { return testDescription; }

	public void setTransferType( String transferType ) { this.transferType = transferType; }
	public String getTransferType( ) { return transferType; }

	public void setTstSrcNum( String tstSrcNum ) { this.tstSrcNum = tstSrcNum; }
	public String getTstSrcNum( ) { return tstSrcNum; }

	public void setUdFlag( int udFlag ) { this.udFlag = udFlag; }
	public int getUdFlag( ) { return udFlag; }

	public void setAeoDeadLine( Calendar aeoDeadLine ) { this.aeoDeadLine = aeoDeadLine; }
	public Calendar getAeoDeadLine( ) { return aeoDeadLine; }

	public void setAskttRcvCust( Integer askttRcvCust ) { this.askttRcvCust = askttRcvCust; }
	public Integer getAskttRcvCust( ) { return askttRcvCust; }
	// @formatter:off
}
