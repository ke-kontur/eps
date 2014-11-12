package ru.acs.fts.aly.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table( name = "ALY_ESAD_DIFF" )
public class AlyEsadDiff
{
	@Id
	@Column( name = "EDIF_ID", nullable = false )
	private Integer id;
	
	@Id
	@Column( name = "EDIF_MSG_ID", length = 36, nullable = false )
	private String messageId;
	
	@Column( name = "EDIF_PATH", length = 500, nullable = false )
	private String path;
	
	@Lob
	@Column( name = "EDIF_OLD", nullable = true )
	private String oldValue;
	
	@Lob
	@Column( name = "EDIF_NEW", nullable = true )
	private String newValue;
	
	@Column( name = "EDIF_OP", length = 10, nullable = false )
	private String op;
	
	@Column( name = "EDIF_GNUMERIC", length = 20, nullable = true )
	private String goodsNumeric;
	
	@Column( name = "EDIF_SOFT_VERSION", length = 100, nullable = false )
	private String softVersion;

	// @formatter:off
	public void setId( Integer id ) { this.id = id; }
	public Integer getId( ) { return id; }

	public void setMessageId( String messageId ) { this.messageId = messageId; }
	public String getMessageId( ) { return messageId; }

	public void setPath( String path ) { this.path = path; }
	public String getPath( ) { return path; }

	public void setOldValue( String oldValue ) { this.oldValue = oldValue; }
	public String getOldValue( ) { return oldValue; }

	public void setNewValue( String newValue ) { this.newValue = newValue; }
	public String getNewValue( ) { return newValue; }

	public void setOp( String op ) { this.op = op; }
	public String getOp( ) { return op; }
	
	public void setGoodsNumeric( String goodsNumeric ) { this.goodsNumeric = goodsNumeric; }
	public String getGoodsNumeric( ) { return goodsNumeric; }
	
	public void setSoftVersion( String softVersion ) { this.softVersion = softVersion; }
	public String getSoftVersion( ) { return softVersion; }
	// @formatter:on	
}
