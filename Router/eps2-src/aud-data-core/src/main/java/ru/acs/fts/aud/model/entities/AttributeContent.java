package ru.acs.fts.aud.model.entities;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import oracle.sql.DATE;
import oracle.sql.TIMESTAMP;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.TypeConverter;

import ru.acs.fts.aud.model.converter.UUIDConverter;

@Entity
@Table( name = "ML_ATTRIBUTE_CONTENT" )
public class AttributeContent
{
	@Id
	@Column( name = "ID" )
	@Converter( name = "uuidConverter", converterClass = UUIDConverter.class )
	@Convert( "uuidConverter" )
	private String id; // GUID
	
	@ManyToOne
	@JoinColumn( name = "ATTRIBUTE_VERSION_ID" )
	private AttributeVersion attributeVersion;
	
	@ManyToOne
	@JoinColumn( name = "DOCUMENT_ID" )
	private Document document;
	
	@Column( name = "VALUE_DOUBLE", length = 19 )
	private double valueDouble;
	
	@Column( name = "VALUE_DATE", length = 7 )
	private Date valueDate;
	
	@Column( name = "VALUE_STRING", length = 2000 )
	private String valueString;
	
	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamp" )
	@TypeConverter( name = "timestamp", dataType = TIMESTAMP.class )
	@Column( name = "VALUE_TIME", length = 6, columnDefinition = "TIMESTAMP(6)" )
	private Timestamp valueTime;
	
	@Temporal( TemporalType.TIMESTAMP )
	@Convert( "timestamp" )
	@TypeConverter( name = "timestamp", dataType = TIMESTAMP.class )
	@Column( name = "VALUE_DATETIME", length = 6, columnDefinition = "TIMESTAMP(6)" )
	private Timestamp valueDateTime;
	
	@Column( name = "VALUE_INTEGER", length = 19 )
	private int valueInteger;
	
	@Column( name = "VALUE_BOOLEAN", length = 1 )
	private short valueBoolean;
	
	// @formatter:off
	public void setId( String id ) { this.id = id; }
	public String getId( ) { return id; }
	
	public void setAttributeVersion( AttributeVersion attributeVersion ) { this.attributeVersion = attributeVersion; }
	public AttributeVersion getAttributeVersion( ) { return attributeVersion; }
	
	public void setDocument( Document document ) { this.document = document; }
	public Document getDocument( ) { return document; }
	
	public void setValueDouble( double valueDouble ) { this.valueDouble = valueDouble; }
	public double getValueDouble( ) { return valueDouble; }
	
	public void setValueDate( Date valueDate ) { this.valueDate = valueDate; }
	public Date getValueDate( ) { return valueDate; }
	
	public void setValueString( String valueString ) { this.valueString = valueString; }
	public String getValueString( ) { return valueString; }
	
	public void setValueTime( Timestamp valueTime ) { this.valueTime = valueTime; }
	public Timestamp getValueTime( ) { return valueTime; }
	
	public void setValueDateTime( Timestamp valueDateTime ) { this.valueDateTime = valueDateTime; }
	public Timestamp getValueDateTime( ) { return valueDateTime; }
	
	public void setValueInteger( int valueInteger ) { this.valueInteger = valueInteger; }
	public int getValueInteger( ) { return valueInteger; }
	
	public void setValueBoolean( short valueBoolean ) { this.valueBoolean = valueBoolean; }
	public short getValueBoolean( ) { return valueBoolean; }
	// @formatter:on
}
