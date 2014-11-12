package ru.acs.fts.aly.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "ALY_ESAD_REPL" )
public class AlyEsadRepl
{
	@Id
	@Column( name = "REPL_ESAD_ID", length = 36, nullable = false )
	private String esadId;
	
	@Column( name = "REPL_REF_ESAD_ID", length = 36, nullable = false )
	private String refEsadId;
	
	@Column( name = "REPL_GTDID", length = 100, nullable = true )
	private String gtdId;
	
	@Column( name = "REPL_SOFT_VERSION", length = 100, nullable = false )
	private String softVersion = "0.0.0/0.0.0";

	// @formatter:off
	public void setEsadId( String esadId ) { this.esadId = esadId; }
	public String getEsadId( ) { return esadId; }

	public void setRefEsadId( String refEsadId ) { this.refEsadId = refEsadId; }
	public String getRefEsadId( ) { return refEsadId; }

	public void setGtdId( String gtdId ) { this.gtdId = gtdId; }
	public String getGtdId( ) { return gtdId; }
	
	public void setSoftVersion( String softVersion ) { this.softVersion = softVersion; }
	public String getSoftVersion( ) { return softVersion; }
	// @formatter:on
	
}
