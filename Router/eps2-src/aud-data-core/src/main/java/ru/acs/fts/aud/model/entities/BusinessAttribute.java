package ru.acs.fts.aud.model.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;

import ru.acs.fts.aud.model.converter.UUIDConverter;

@Entity
@Table( name = "ML_BUISNESS_ATTRIBUTE" ) // именно так называется эта таблица
public class BusinessAttribute
{
	@Id
	@Column( name = "ID" )
	@Converter( name = "uuidConverter", converterClass = UUIDConverter.class )
	@Convert( "uuidConverter" )
	private String id; // GUID
	
	@Column( name = "DESCRIPTION", length = 255, nullable = true )
	private String description;
	
	@Column( name ="NAME", length = 255, nullable = false )
	private String name;
	
	@Column( name = "TYPE", length = 255, nullable = false )
	private String type;
	
	@ManyToOne
	@JoinColumn( name = "BUISNESS_DOCUMENT_KIND_ID", nullable = false )
	private BusinessDocumentKind businessDocumentKind;
	
	@Column( name = "IS_FEDERAL", length = 1, nullable = false )
	private short isFederal;
	
	@ManyToMany( cascade = CascadeType.REFRESH )
	@JoinTable( name = "ML_BUISNESS_ATTRIBUTE_GROUP",
			joinColumns = @JoinColumn( name = "BUISNESS_ATTRIBUTE_ID", referencedColumnName = "ID" ),
			inverseJoinColumns = @JoinColumn( name = "ATTRIBUTE_ID", referencedColumnName = "ID" ) )
	private List< Attribute > attributes;
	
	// @formatter:off
	public void setId( String id ) { this.id = id; }
	public String getId( ) { return id; }
	
	public void setDescription( String description ) { this.description = description; }
	public String getDescription( ) { return description; }
	
	public void setName( String name ) { this.name = name; }
	public String getName( ) { return name; }
	
	public void setType( String type ) { this.type = type; }
	public String getType( ) { return type; }
	
	public void setBusinessDocumentKind( BusinessDocumentKind businessDocumentKind ) { this.businessDocumentKind = businessDocumentKind; }
	public BusinessDocumentKind getBusinessDocumentKind( ) { return businessDocumentKind; }
	
	public void setIsFederal( short isFederal ) { this.isFederal = isFederal; }
	public short getIsFederal( ) { return isFederal; }
	
	public void setAttributes( List< Attribute > attributes ) { this.attributes = attributes; }
	public List< Attribute > getAttributes( ) { return attributes; }
	// @formatter:on
}
