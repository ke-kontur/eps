package ru.acs.fts.aud.rest.service.model.objects;

import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

public class AudRegistryResult
{
	private String _archPacketId;
	private DateTime _packetPutDateTime;
	private String _packetType;
	private String _appPacketId;
	private String _appPacketDescription;
	
	private String _gtdidCustomsCode;
	private String _gtdidRegNumber;
	private LocalDate _gtdidRegDate;
	
	private List< AudRegistryDoc > _docs;
	
	// @formatter:off
	public void setArchPacketId( String archPacketId ) { _archPacketId = archPacketId; }
	public String getArchPacketId( ) { return _archPacketId; }
	
	public void setPacketPutDateTime( DateTime packetPutDateTime ) { _packetPutDateTime = packetPutDateTime; }
	public DateTime getPacketPutDateTime( ) { return _packetPutDateTime; }
	
	public void setPacketType( String packetType ) { _packetType = packetType; }
	public String getPacketType( ) { return _packetType; }
	
	public void setAppPacketId( String appPacketId ) { _appPacketId = appPacketId; }
	public String getAppPacketId( ) { return _appPacketId; }
	
	public void setAppPacketDescription( String appPacketDescription ) { _appPacketDescription = appPacketDescription; }
	public String getAppPacketDescription( ) { return _appPacketDescription; }
	
	public void setGtdIdCustomsCode( String gtdidCustomsCode ) { _gtdidCustomsCode = gtdidCustomsCode; }
	public String getGtdIdCustomsCode( ) { return _gtdidCustomsCode; }
	
	public void setGtdIdRegNumber( String gtdidRegNumber ) { _gtdidRegNumber = gtdidRegNumber; }
	public String getGtdIdRegNumber( ) { return _gtdidRegNumber; }
	
	public void setGtdIdRegDate( LocalDate gtdidRegDate ) { _gtdidRegDate = gtdidRegDate; }
	public LocalDate getGtdIdRegDate( ) { return _gtdidRegDate; }
	
	public void setDocs( List< AudRegistryDoc > docs ) { _docs = docs; }
	public List< AudRegistryDoc > getDocs( ) { return _docs; }
	// @formatter:on
}
