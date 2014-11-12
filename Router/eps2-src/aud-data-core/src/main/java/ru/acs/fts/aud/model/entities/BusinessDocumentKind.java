package ru.acs.fts.aud.model.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;

import ru.acs.fts.aud.model.converter.UUIDConverter;

@Entity
@Table( name = "ML_BUISNESS_DOCUMENT_KIND" ) // Таблица имеет именно такое имя
public class BusinessDocumentKind
{
	@Id
	@Column( name = "ID" )
	@Converter( name = "uuidConverter", converterClass = UUIDConverter.class )
	@Convert( "uuidConverter" )
	private String id; // GUID
	
	@Column( name = "DOCUMENT_MODE_ID", length = 255, nullable = false )
	private String documentModeId;
	
	@Column( name = "DESCRIPTION", length = 255, nullable = false )
	private String description;
	
	@Column( name = "IS_FEDERAL", length = 1, nullable = false )
	private short isFederal;
	
	@OneToMany( mappedBy = "businessDocumentKind", 
//				cascade = { CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.MERGE } )
				cascade = { CascadeType.REMOVE, CascadeType.PERSIST, CascadeType.MERGE } )
	private List< BusinessAttribute > businessAttributes;
	
	// @formatter:off
	public void setId( String id ) { this.id = id; }
	public String getId( ) { return id; }
	
	public void setDocumentModeId( String documentModeId ) { this.documentModeId = documentModeId; }
	public String getDocumentModeId( ) { return documentModeId; }
	
	public void setDescription( String description ) { this.description = description; }
	public String getDescription( ) { return description; }
	
	public void setIsFederal( short isFederal ) { this.isFederal = isFederal; }
	public short getIsFederal( ) { return isFederal; }
	
	public void setBusinessAttributes( List< BusinessAttribute > businessAttributes ) { this.businessAttributes = businessAttributes; }
	public List< BusinessAttribute > getBusinessAttributes( ) { return businessAttributes; }
	// @formatter:on
}
