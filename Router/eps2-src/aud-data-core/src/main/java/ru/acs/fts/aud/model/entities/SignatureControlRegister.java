package ru.acs.fts.aud.model.entities;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import oracle.sql.TIMESTAMP;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.TypeConverter;

import ru.acs.fts.aud.model.converter.UUIDConverter;

@Entity
@Table( name = "SIGNATURE_CONTROL_REGISTER" )
public class SignatureControlRegister
{
	@Id
	@Column( name = "ID" )
	@Converter( name = "uuidConverter", converterClass = UUIDConverter.class )
	@Convert( "uuidConverter" )
	private String id; // GUID

	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamp" )
	@TypeConverter( name = "timestamp", dataType = TIMESTAMP.class )
	@Column( name = "STARTDATE", length = 6, nullable = true, columnDefinition = "TIMESTAMP(6) NULL" )
	private Timestamp startDate;

	@Column( name = "STATE", nullable = false, length = 255 )
	private String state;

	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamp" )
	@TypeConverter( name = "timestamp", dataType = TIMESTAMP.class )
	@Column( name = "ENDDATE", length = 6, nullable = true, columnDefinition = "TIMESTAMP(6) NULL" )
	private Timestamp endDate;

	@OneToOne( cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH } )
	@JoinColumn( name = "SERVICEDOCUMENT_ID" )
	private ServiceDocument serviceDocument;	
	
	@OneToMany( mappedBy = "register" )
	private List< SignatureControlResult > results = new ArrayList< SignatureControlResult >( ); 	
	
	// @formatter:off
	public void setId( String id ) { this.id = id; }
	public String getId( ) { return id; }
	
	public void setStartDate( Timestamp startDate ) { this.startDate = startDate; }
	public Timestamp getStartDate( ) { return startDate; }
	
	public void setState( String state ) { this.state = state; }
	public String getState( ) { return state; }
	
	public void setEndDate( Timestamp endDate ) { this.endDate = endDate; }
	public Timestamp getEndDate( ) { return endDate; }
	
	public void setServiceDocument( ServiceDocument serviceDocument ) { this.serviceDocument = serviceDocument; }
	public ServiceDocument getServiceDocument( ) { return serviceDocument; }
	
	public void setResults( List< SignatureControlResult > results ) { this.results = results; }
	public List< SignatureControlResult > getResults( ) { return results; }
	// @formatter:on
}
