package ru.acs.fts.eps2.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass( ExtRtuRoutingIds.class )
@Table( name = "EDECL_EXTRTU_ROUTING" )
public class ExtRtuRouting
{
    @Id
    @Column( name = "EXTRTU_CODE", nullable = false )
    private String customCode;
    
    @Id
    @Column( name = "EXTRTU_EXCHTYPE" )
    private int exchType;
    
    @Column( name = "EXTRTU_DESCRIPTION", length = 20 )
    private String description;
    
    @Column( name = "EXTRTU_WMQADDRESS", nullable = false )
    private int wmqAddress;
    
    @Column( name = "EXTRTU_TRANSPORTADDRESS", length = 100 )
    private String transportAddress;
		
	public ExtRtuRouting( )
	{
		
	}
	
	public void setCustomCode( String customCode ) { this.customCode = customCode; }
	public String getCustomCode( ) { return customCode; }
	
	public void setExchType( int exchType ) { this.exchType = exchType; }
	public int getExchType( ) { return exchType; }
	
	public void setDescription( String description ) { this.description = description; }
	public String getDescription( ) { return description; }
	
	public void setWmqAddress( int wmqAddress ) { this.wmqAddress = wmqAddress; }
	public int getWmqAddress( ) { return wmqAddress; }
	
	public void setTransportAddress( String transportAddress ) { this.transportAddress = transportAddress; }
	public String getTransportAddress( ) { return transportAddress; }
}
