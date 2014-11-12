package ru.acs.fts.eps2.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "EDECL_ALBUM_DOCLIST")
public class EdeclAlbumDocList
{
	@Id
	@Column( name = "DOCUMENTMODEID", length = 30, nullable = false )
	private String documentModeId;
	
	@Column( name = "ALBUM_DOCDESCIPTION", length = 250, nullable = true )
	private String description;
	
	// @formatter:off
	public void setDocumentModeId( String documentModeId ) { this.documentModeId = documentModeId; }
	public String getDocumentModeId( ) { return documentModeId; }
	
	public void setDescription( String description ) { this.description = description; }
	public String getDescription( ) { return description; }
	// @formatter:on
}
