package ru.acs.fts.aly.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import ru.acs.fts.aly.model.pks.AlyXmlDataPK;

@Entity
@IdClass( AlyXmlDataPK.class )
@Table( name = "ALY_XML_DATA" )
public class AlyXmlData
{
	@Id
	@Column( name = "AXD_ID", nullable = false )
	private Integer id;
	
	@Id
	@Column( name = "AXD_MSG_ID", length = 36, nullable = false )
	private String messageId;
	
	@Column( name = "AXD_TAG_NAME", length = 100, nullable = false )
	private String tagName;
	
	@Column( name = "AXD_TAG_NS", length = 200, nullable = false )
	private String tagNamespace;
	
	@Column( name = "AXD_TAG_VALUE", length = 1000, nullable = true )
	private String tagValue;
	
	@Column( name = "AXD_TAG_PARENT", nullable = true )
	private Integer tagParent;
	
	// @formatter:off
	public void setId( Integer id ) { this.id = id; }
	public Integer getId( ) { return id; }
	
	public void setMessageId( String messageId ) { this.messageId = messageId; }
	public String getMessageId( ) { return messageId; }
	
	public void setTagName( String tagName ) { this.tagName = tagName; }
	public String getTagName( ) { return tagName; }
	
	public void setTagNamespace( String tagNamespace ) { this.tagNamespace = tagNamespace; }
	public String getTagNamespace( ) { return tagNamespace; }
	
	public void setTagValue( String tagValue ) { if ( tagValue.length( ) > 1000 ) tagValue = tagValue.substring( 0, 1000 ); this.tagValue = tagValue; }
	public String getTagValue( ) { return tagValue; }
	
	public void setTagParent( Integer tagParent ) { this.tagParent = tagParent; }
	public Integer getTagParent( ) { return tagParent; }
	// @formatter:on
}
