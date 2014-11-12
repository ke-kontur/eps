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
@Table( name = "ML_ATTRIBUTE" )
public class Attribute
{
	@Id
	@Column( name = "ID" )
	@Converter( name = "uuidConverter", converterClass = UUIDConverter.class )
	@Convert( "uuidConverter" )
	private String id;
	
	@Column( name = "DESCRIPTION", nullable = true, length = 500 )
	private String description;
	
	@Column( name = "NAME", nullable = false, length = 255 )
	private String name;
	
	@Column( name = "TYPE", nullable = false, length = 255 )
	private String type;
	
	@ManyToOne
	@JoinColumn( name = "DOCUMENT_KIND_ID", nullable = false )
	private DocumentKind documentKind;
	
	@Column( name = "IS_FEDERAL", length = 1, nullable = false )
	private short isFederal;
	
	@ManyToMany( cascade = CascadeType.REFRESH )
	@JoinTable( name = "ML_BUISNESS_ATTRIBUTE_GROUP",
			joinColumns = @JoinColumn( name = "ATTRIBUTE_ID", referencedColumnName = "ID" ),
			inverseJoinColumns = @JoinColumn( name = "BUISNESS_ATTRIBUTE_ID", referencedColumnName = "ID" ) )
	private List< BusinessAttribute > businessAttributes;
	
	// @formatter:off
	public void setId( String id ) { this.id = id; }
	public String getId( ) { return id; }
	
	public void setDescription( String description ) { this.description = description; }
	public String getDescription( ) { return description; }
	
	public void setName( String name ) { this.name = name; }
	public String getName( ) { return name; }
	
	public void setType( String type ) { this.type = type; }
	public String getType( ) { return type; }
	
	public void setDocumentKind( DocumentKind documentKind ) { this.documentKind = documentKind; }
	public DocumentKind getDocumentKind( ) { return documentKind; }
	
	public void setIsFederal( short isFederal ) { this.isFederal = isFederal; }
	public short getIsFederal( ) { return isFederal; }
	
	public void setBusinessAttributes( List< BusinessAttribute > businessAttributes ) { this.businessAttributes = businessAttributes; }
	public List< BusinessAttribute > getBusinessAttributes( ) { return businessAttributes; }
	// @formatter:on
}
