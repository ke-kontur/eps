package ru.acs.fts.aly.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "ALY_RZD_REPORTS" )
public class AlyRzdReports
{
	@Id
	@Column( name = "RR_DSTAMP", nullable = false )
	private Integer dstamp;
	
	@Column( name = "RR_T1_ED11002_SENT", nullable = false )
	private int t1Ed11002Sent = 0;
	
	@Column( name = "RR_T1_CMN12092_SUC", nullable = false )
	private int t1Cmn12092Success = 0;
	
	@Column( name = "RR_T1_CMN12092_FAIL", nullable = false )
	private int t1Cmn12092Fail = 0;
	
	@Column( name = "RR_T1_CMN12002_SUC", nullable = false )
	private int t1Cmn12002Success = 0;
	
	@Column( name = "RR_T1_CMN12002_SENT", nullable = false )
	private int t1Cmn12002Sent = 0;
	
	@Column( name = "RR_T1_CMN12002_FAIL", nullable = false )
	private int t1Cmn12002Fail = 0;
	
	@Column( name = "RR_T1_CMN12003_SUC", nullable = false )
	private int t1Cmn12003Success = 0;
	
	@Column( name = "RR_T1_CMN12003_SENT", nullable = false )
	private int t1Cmn12003Sent = 0;
	
	@Column( name = "RR_T1_CMN12003_FAIL", nullable = false )
	private int t1Cmn12003Fail = 0;
	
	@Column( name = "RR_T1_CMN12093_SUC", nullable = false )
	private int t1Cmn12093Success = 0;
	
	@Column( name = "RR_T1_CMN12093_SENT", nullable = false )
	private int t1Cmn12093Sent = 0;
	
	@Column( name = "RR_T1_CMN12093_FAIL", nullable = false )
	private int t1Cmn12093Fail = 0;
	
	@Column( name = "RR_T1_CMN12094_SUC", nullable = false )
	private int t1Cmn12094Success = 0;
	
	@Column( name = "RR_T1_CMN12094_FAIL", nullable = false )
	private int t1Cmn12094Fail = 0;
	
	@Column( name = "RR_T1_CMN12118_SUC", nullable = false )
	private int t1Cmn12118Success = 0;
	
	@Column( name = "RR_T1_CMN12118_SENT", nullable = false )
	private int t1Cmn12118Sent = 0;
	
	@Column( name = "RR_T1_CMN12118_FAIL", nullable = false )
	private int t1Cmn12118Fail = 0;
	
	@Column( name = "RR_T2_ED11002_SENT", nullable = false )
	private int t2Ed11002Sent = 0;
	
	@Column( name = "RR_T2_CMN12095_SUC", nullable = false )
	private int t2Cmn12095Success = 0;
	
	@Column( name = "RR_T2_CMN12095_FAIL", nullable = false )
	private int t2Cmn12095Fail = 0;
	
	@Column( name = "RR_T2_CMN12003_SUC", nullable = false )
	private int t2Cmn12003Success = 0;
	
	@Column( name = "RR_T2_CMN12003_SENT", nullable = false )
	private int t2Cmn12003Sent = 0;
	
	@Column( name = "RR_T2_CMN12003_FAIL", nullable = false )
	private int t2Cmn12003Fail = 0;
	
	@Column( name = "RR_T2_CMN12101_SUC", nullable = false )
	private int t2Cmn12101Success = 0;
	
	@Column( name = "RR_T2_CMN12101_FAIL", nullable = false )
	private int t2Cmn12101Fail = 0;
	
	@Column( name = "RR_T2_CMN12002_SUC", nullable = false )
	private int t2Cmn12002Success = 0;
	
	@Column( name = "RR_T2_CMN12002_SENT", nullable = false )
	private int t2Cmn12002Sent = 0;
	
	@Column( name = "RR_T2_CMN12002_FAIL", nullable = false )
	private int t2Cmn12002Fail = 0;
	
	@Column( name = "RR_T2_CMN12096_SUC", nullable = false )
	private int t2Cmn12096Success = 0;
	
	@Column( name = "RR_T2_CMN12096_SENT", nullable = false )
	private int t2Cmn12096Sent = 0;
	
	@Column( name = "RR_T2_CMN12096_FAIL", nullable = false )
	private int t2Cmn12096Fail = 0;
	
	@Column( name = "RR_T2_CMN12097_SUC", nullable = false )
	private int t2Cmn12097Success = 0;
	
	@Column( name = "RR_T2_CMN12097_FAIL", nullable = false )
	private int t2Cmn12097Fail = 0;
	  
	@Column( name = "RR_T3_ED11002_SENT", nullable = false )
	private int t3Ed11002Sent = 0;
	
	@Column( name = "RR_T3_CMN12079_SUC", nullable = false )
	private int t3Cmn12079Success = 0;
	
	@Column( name = "RR_T3_CMN12079_FAIL", nullable = false )
	private int t3Cmn12079Fail = 0;
	
	@Column( name = "RR_T3_CMN12003_SUC", nullable = false )
	private int t3Cmn12003Success = 0;
	
	@Column( name = "RR_T3_CMN12003_SENT", nullable = false )
	private int t3Cmn12003Sent = 0;
	
	@Column( name = "RR_T3_CMN12003_FAIL", nullable = false )
	private int t3Cmn12003Fail = 0;
	
	@Column( name = "RR_T3_CMN12002_SUC", nullable = false )
	private int t3Cmn12002Success = 0;
	
	@Column( name = "RR_T3_CMN12002_SENT", nullable = false )
	private int t3Cmn12002Sent = 0;
	
	@Column( name = "RR_T3_CMN12002_FAIL", nullable = false )
	private int t3Cmn12002Fail = 0;
	
	@Column( name = "RR_T3_CMN12081_SUC", nullable = false )
	private int t3Cmn12081Success = 0;
	
	@Column( name = "RR_T3_CMN12081_SENT", nullable = false )
	private int t3Cmn12081Sent = 0;
	
	@Column( name = "RR_T3_CMN12081_FAIL", nullable = false )
	private int t3Cmn12081Fail = 0;
	
	@Column( name = "RR_T3_CMN12084_SUC", nullable = false )
	private int t3Cmn12084Success = 0;
	
	@Column( name = "RR_T3_CMN12084_SENT", nullable = false )
	private int t3Cmn12084Sent = 0;
	
	@Column( name = "RR_T3_CMN12084_FAIL", nullable = false )
	private int t3Cmn12084Fail = 0;
	
	@Column( name = "RR_T3_CMN12080_SUC", nullable = false )
	private int t3Cmn12080Success = 0;
	
	@Column( name = "RR_T3_CMN12080_FAIL", nullable = false )
	private int t3Cmn12080Fail = 0;
	
	@Column( name = "RR_T3_CMN12085_SUC", nullable = false )
	private int t3Cmn12085Success = 0;
	
	@Column( name = "RR_T3_CMN12085_SENT", nullable = false )
	private int t3Cmn12085Sent = 0;
	
	@Column( name = "RR_T3_CMN12085_FAIL", nullable = false )
	private int t3Cmn12085Fail = 0;
	
	@Column( name = "RR_T3_CMN12086_SENT", nullable = false )
	private int t3Cmn12086Sent = 0;

	// @formatter:off
	public void setDstamp( Integer dstamp ) { this.dstamp = dstamp; }
	public Integer getDstamp( ) { return dstamp; }

	public void setT1Ed11002Sent( int t1Ed11002Sent ) { this.t1Ed11002Sent = t1Ed11002Sent; }
	public int getT1Ed11002Sent( ) { return t1Ed11002Sent; }

	public void setT1Cmn12092Success( int t1Cmn12092Success ) { this.t1Cmn12092Success = t1Cmn12092Success; }
	public int getT1Cmn12092Success( ) { return t1Cmn12092Success; }

	public void setT1Cmn12092Fail( int t1Cmn12092Fail ) { this.t1Cmn12092Fail = t1Cmn12092Fail; }
	public int getT1Cmn12092Fail( ) { return t1Cmn12092Fail; }

	public void setT1Cmn12002Success( int t1Cmn12002Success ) { this.t1Cmn12002Success = t1Cmn12002Success; }
	public int getT1Cmn12002Success( ) { return t1Cmn12002Success; }

	public void setT1Cmn12002Sent( int t1Cmn12002Sent ) { this.t1Cmn12002Sent = t1Cmn12002Sent; }
	public int getT1Cmn12002Sent( ) { return t1Cmn12002Sent; }

	public void setT1Cmn12002Fail( int t1Cmn12002Fail ) { this.t1Cmn12002Fail = t1Cmn12002Fail; }
	public int getT1Cmn12002Fail( ) { return t1Cmn12002Fail; }

	public void setT1Cmn12003Success( int t1Cmn12003Success ) { this.t1Cmn12003Success = t1Cmn12003Success; }
	public int getT1Cmn12003Success( ) { return t1Cmn12003Success; }

	public void setT1Cmn12003Sent( int t1Cmn12003Sent ) { this.t1Cmn12003Sent = t1Cmn12003Sent; }
	public int getT1Cmn12003Sent( ) { return t1Cmn12003Sent; }

	public void setT1Cmn12003Fail( int t1Cmn12003Fail ) { this.t1Cmn12003Fail = t1Cmn12003Fail; }
	public int getT1Cmn12003Fail( ) { return t1Cmn12003Fail; }

	public void setT1Cmn12093Success( int t1Cmn12093Success ) { this.t1Cmn12093Success = t1Cmn12093Success; }
	public int getT1Cmn12093Success( ) { return t1Cmn12093Success; }

	public void setT1Cmn12093Sent( int t1Cmn12093Sent ) { this.t1Cmn12093Sent = t1Cmn12093Sent; }
	public int getT1Cmn12093Sent( ) { return t1Cmn12093Sent; }

	public void setT1Cmn12093Fail( int t1Cmn12093Fail ) { this.t1Cmn12093Fail = t1Cmn12093Fail; }
	public int getT1Cmn12093Fail( ) { return t1Cmn12093Fail; }

	public void setT1Cmn12094Success( int t1Cmn12094Success ) { this.t1Cmn12094Success = t1Cmn12094Success; }
	public int getT1Cmn12094Success( ) { return t1Cmn12094Success; }

	public void setT1Cmn12094Fail( int t1Cmn12094Fail ) { this.t1Cmn12094Fail = t1Cmn12094Fail; }
	public int getT1Cmn12094Fail( ) { return t1Cmn12094Fail; }

	public void setT1Cmn12118Success( int t1Cmn12118Success ) { this.t1Cmn12118Success = t1Cmn12118Success; }
	public int getT1Cmn12118Success( ) { return t1Cmn12118Success; }

	public void setT1Cmn12118Sent( int t1Cmn12118Sent ) { this.t1Cmn12118Sent = t1Cmn12118Sent; }
	public int getT1Cmn12118Sent( ) { return t1Cmn12118Sent; }

	public void setT1Cmn12118Fail( int t1Cmn12118Fail ) { this.t1Cmn12118Fail = t1Cmn12118Fail; }
	public int getT1Cmn12118Fail( ) { return t1Cmn12118Fail; }

	public void setT2Ed11002Sent( int t2Ed11002Sent ) { this.t2Ed11002Sent = t2Ed11002Sent; }
	public int getT2Ed11002Sent( ) { return t2Ed11002Sent; }

	public void setT2Cmn12095Success( int t2Cmn12095Success ) { this.t2Cmn12095Success = t2Cmn12095Success; }
	public int getT2Cmn12095Success( ) { return t2Cmn12095Success; }

	public void setT2Cmn12095Fail( int t2Cmn12095Fail ) { this.t2Cmn12095Fail = t2Cmn12095Fail; }
	public int getT2Cmn12095Fail( ) { return t2Cmn12095Fail; }

	public void setT2Cmn12003Success( int t2Cmn12003Success ) { this.t2Cmn12003Success = t2Cmn12003Success; }
	public int getT2Cmn12003Success( ) { return t2Cmn12003Success; }

	public void setT2Cmn12003Sent( int t2Cmn12003Sent ) { this.t2Cmn12003Sent = t2Cmn12003Sent; }
	public int getT2Cmn12003Sent( ) { return t2Cmn12003Sent; }

	public void setT2Cmn12003Fail( int t2Cmn12003Fail ) { this.t2Cmn12003Fail = t2Cmn12003Fail; }
	public int getT2Cmn12003Fail( ) { return t2Cmn12003Fail; }

	public void setT2Cmn12101Success( int t2Cmn12101Success ) {  this.t2Cmn12101Success = t2Cmn12101Success; }
	public int getT2Cmn12101Success( ) { return t2Cmn12101Success; }

	public void setT2Cmn12101Fail( int t2Cmn12101Fail ) { this.t2Cmn12101Fail = t2Cmn12101Fail; }
	public int getT2Cmn12101Fail( ) { return t2Cmn12101Fail; }

	public void setT2Cmn12002Success( int t2Cmn12002Success ) { this.t2Cmn12002Success = t2Cmn12002Success; }
	public int getT2Cmn12002Success( ) { return t2Cmn12002Success; }

	public void setT2Cmn12002Sent( int t2Cmn12002Sent ) { this.t2Cmn12002Sent = t2Cmn12002Sent; }
	public int getT2Cmn12002Sent( ) { return t2Cmn12002Sent; }

	public void setT2Cmn12002Fail( int t2Cmn12002Fail ) { this.t2Cmn12002Fail = t2Cmn12002Fail; }
	public int getT2Cmn12002Fail( ) { return t2Cmn12002Fail; }

	public void setT2Cmn12096Success( int t2Cmn12096Success ) { this.t2Cmn12096Success = t2Cmn12096Success; }
	public int getT2Cmn12096Success( ) { return t2Cmn12096Success; }

	public void setT2Cmn12096Sent( int t2Cmn12096Sent ) { this.t2Cmn12096Sent = t2Cmn12096Sent; }
	public int getT2Cmn12096Sent( ) { return t2Cmn12096Sent; }

	public void setT2Cmn12096Fail( int t2Cmn12096Fail ) { this.t2Cmn12096Fail = t2Cmn12096Fail; }
	public int getT2Cmn12096Fail( ) { return t2Cmn12096Fail; }

	public void setT2Cmn12097Success( int t2Cmn12097Success ) { this.t2Cmn12097Success = t2Cmn12097Success; }
	public int getT2Cmn12097Success( ) { return t2Cmn12097Success; }

	public void setT2Cmn12097Fail( int t2Cmn12097Fail ) { this.t2Cmn12097Fail = t2Cmn12097Fail; }
	public int getT2Cmn12097Fail( ) { return t2Cmn12097Fail; }

	public void setT3Ed11002Sent( int t3Ed11002Sent ) { this.t3Ed11002Sent = t3Ed11002Sent; }
	public int getT3Ed11002Sent( ) { return t3Ed11002Sent; }

	public void setT3Cmn12079Success( int t3Cmn12079Success ) { this.t3Cmn12079Success = t3Cmn12079Success; }
	public int getT3Cmn12079Success( ) { return t3Cmn12079Success; }

	public void setT3Cmn12079Fail( int t3Cmn12079Fail ) { this.t3Cmn12079Fail = t3Cmn12079Fail; }
	public int getT3Cmn12079Fail( ) { return t3Cmn12079Fail; }

	public void setT3Cmn12003Success( int t3Cmn12003Success ) { this.t3Cmn12003Success = t3Cmn12003Success; }
	public int getT3Cmn12003Success( ) { return t3Cmn12003Success; }

	public void setT3Cmn12003Sent( int t3Cmn12003Sent ) { this.t3Cmn12003Sent = t3Cmn12003Sent; }
	public int getT3Cmn12003Sent( ) { return t3Cmn12003Sent; }

	public void setT3Cmn12003Fail( int t3Cmn12003Fail ) { this.t3Cmn12003Fail = t3Cmn12003Fail; }
	public int getT3Cmn12003Fail( ) { return t3Cmn12003Fail; }

	public void setT3Cmn12002Success( int t3Cmn12002Success ) { this.t3Cmn12002Success = t3Cmn12002Success; }
	public int getT3Cmn12002Success( ) { return t3Cmn12002Success; }

	public void setT3Cmn12002Sent( int t3Cmn12002Sent ) { this.t3Cmn12002Sent = t3Cmn12002Sent; }
	public int getT3Cmn12002Sent( ) { return t3Cmn12002Sent; }

	public void setT3Cmn12002Fail( int t3Cmn12002Fail ) { this.t3Cmn12002Fail = t3Cmn12002Fail; }
	public int getT3Cmn12002Fail( ) { return t3Cmn12002Fail; }

	public void setT3Cmn12081Success( int t3Cmn12081Success ) { this.t3Cmn12081Success = t3Cmn12081Success; }
	public int getT3Cmn12081Success( ) { return t3Cmn12081Success; }

	public void setT3Cmn12081Sent( int t3Cmn12081Sent ) { this.t3Cmn12081Sent = t3Cmn12081Sent; }
	public int getT3Cmn12081Sent( ) { return t3Cmn12081Sent; }

	public void setT3Cmn12081Fail( int t3Cmn12081Fail ) { this.t3Cmn12081Fail = t3Cmn12081Fail; }
	public int getT3Cmn12081Fail( ) { return t3Cmn12081Fail; }

	public void setT3Cmn12084Success( int t3Cmn12084Success ) { this.t3Cmn12084Success = t3Cmn12084Success; }
	public int getT3Cmn12084Success( ) { return t3Cmn12084Success; }

	public void setT3Cmn12084Sent( int t3Cmn12084Sent ) { this.t3Cmn12084Sent = t3Cmn12084Sent; }
	public int getT3Cmn12084Sent( ) { return t3Cmn12084Sent; }

	public void setT3Cmn12084Fail( int t3Cmn12084Fail ) { this.t3Cmn12084Fail = t3Cmn12084Fail; }
	public int getT3Cmn12084Fail( ) { return t3Cmn12084Fail; }

	public void setT3Cmn12080Success( int t3Cmn12080Success ) { this.t3Cmn12080Success = t3Cmn12080Success; }
	public int getT3Cmn12080Success( ) { return t3Cmn12080Success; }

	public void setT3Cmn12080Fail( int t3Cmn12080Fail ) { this.t3Cmn12080Fail = t3Cmn12080Fail; }
	public int getT3Cmn12080Fail( ) { return t3Cmn12080Fail; }

	public void setT3Cmn12085Success( int t3Cmn12085Success ) { this.t3Cmn12085Success = t3Cmn12085Success; }
	public int getT3Cmn12085Success( ) { return t3Cmn12085Success; }

	public void setT3Cmn12085Sent( int t3Cmn12085Sent ) { this.t3Cmn12085Sent = t3Cmn12085Sent; } 
	public int getT3Cmn12085Sent( ) { return t3Cmn12085Sent; }

	public void setT3Cmn12085Fail( int t3Cmn12085Fail ) { this.t3Cmn12085Fail = t3Cmn12085Fail; }
	public int getT3Cmn12085Fail( ) { return t3Cmn12085Fail; }

	public int getT3Cmn12086Sent( ) { return t3Cmn12086Sent; }
	public void setT3Cmn12086Sent( int t3Cmn12086Sent ) { this.t3Cmn12086Sent = t3Cmn12086Sent; }
	// @formatter:on
	
}
