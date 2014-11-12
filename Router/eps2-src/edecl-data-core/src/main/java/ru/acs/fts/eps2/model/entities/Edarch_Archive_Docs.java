package ru.acs.fts.eps2.model.entities;

import javax.persistence.*;

import java.util.Date;

@Entity
@IdClass( Edarch_Archive_Docs_Ids.class )
@Table( name = "EDARCH_ARCHIVE_DOCS" )
public class Edarch_Archive_Docs
{
	public Edarch_Archive_Docs( )
	{

	}

	@Id
	@Column( name = "ARDOC_IDINTERNAL", length = 41, nullable = false )
	private String ardocIdinternal;
	
	@Id
	@Column( name = "ARDOC_ARCH_IDINTERNAL", length = 41, nullable = false )
	private String ardocArchIdinternal;

	@Column( name = "ARDOC_DOCNAME", length = 255 )
	private String ardocDocName;
	
	@Column( name = "ARDOC_STAGESTATUS", length = 255 )
	private String ardocStageStatus;
	
	@Temporal( TemporalType.DATE )
	@Column( name = "ARDOC_TODATE" )
	private Date ardocToDate;
	
	@Column( name = "ARDOC_DOCTYPE", length = 255 )
	private String ardocDocType;
	
	@Temporal( TemporalType.DATE )
	@Column( name = "ARDOC_CREATEDATE", nullable = false )
	private Date ardocCreateDate;
	
	@Temporal( TemporalType.DATE )
	@Column( name = "ARDOC_FROMDATE" )
	private Date ardocFromDate;
	
	@Column( name = "ARDOC_REFDOCUMENTID", length = 36 )
	private String ardocRefdocumentid;
	
	@Column( name = "ARDOC_DOCUMENTID", length = 36 )
	private String ardocDocumentid;
	
	@Column( name = "ARDOC_PRDOCUMENTNUMBER", length = 4000 )
	private String ardocPrDocumentNumber;
	
	@Column( name = "ARDOC_ALBUMVERSION", length = 5 )
	private String ardocAlbumVersion;
	
	@Column( name = "ARDOC_REFNEXTDOCUMENTID", length = 36 )
	private String ardocRefNextDocumentid;
	
	@Column( name = "ARDOC_DOCCODE", length = 5 )
	private String ardocDocCode;
	
	@Temporal( TemporalType.DATE )
	@Column( name = "ARDOC_DOCUMENT_DATE" )
	private Date ardocDocumentDate;
	
	public String getArdocArchIdinternal( ) { return ardocArchIdinternal; }
	public void setArdocArchIdinternal( String ardocArchIdinternal ) { this.ardocArchIdinternal = ardocArchIdinternal; }

	public String getArdocIdinternal( ) { return ardocIdinternal; }
	public void setArdocIdinternal( String ardocIdinternal ) { this.ardocIdinternal = ardocIdinternal; }

	public String getArdocDocName( ) { return ardocDocName; }
	public void setArdocDocName( String ardocDocName ) { this.ardocDocName = ardocDocName; }

	public String getArdocStageStatus( ) { return ardocStageStatus; }
	public void setArdocStageStatus( String ardocStageStatus ) { this.ardocStageStatus = ardocStageStatus; }

	public Date getArdocToDate( ) { return ardocToDate; }
	public void setArdocToDate( Date ardocToDate ) { this.ardocToDate = ardocToDate; }

	public String getArdocDocType( ) { return ardocDocType; }
	public void setArdocDocType( String ardocDocType ) { this.ardocDocType = ardocDocType; }

	public Date getArdocCreateDate( ) { return ardocCreateDate; }
	public void setArdocCreateDate( Date ardocCreateDate ) { this.ardocCreateDate = ardocCreateDate; }

	public Date getArdocFromDate( ) { return ardocFromDate; }
	public void setArdocFromDate( Date ardocFromDate ) { this.ardocFromDate = ardocFromDate; }

	public String getArdocRefdocumentid( ) { return ardocRefdocumentid; }
	public void setArdocRefdocumentid( String ardocRefdocumentid ) { this.ardocRefdocumentid = ardocRefdocumentid; }

	public String getArdocDocumentid( ) { return ardocDocumentid; }
	public void setArdocDocumentid( String ardocDocumentid ) { this.ardocDocumentid = ardocDocumentid; }

	public String getArdocPrDocumentNumber( ) { return ardocPrDocumentNumber; }
	public void setArdocPrDocumentNumber( String ardocPrDocumentNumber ) { this.ardocPrDocumentNumber = ardocPrDocumentNumber; }

	public String getArdocAlbumVersion( ) { return ardocAlbumVersion; }
	public void setArdocAlbumVersion( String ardocAlbumVersion ) { this.ardocAlbumVersion = ardocAlbumVersion; }

	public String getArdocRefNextDocumentid( ) { return ardocRefNextDocumentid; }
	public void setArdocRefNextDocumentid( String ardocRefNextDocumentid ) { this.ardocRefNextDocumentid = ardocRefNextDocumentid; }

	public String getArdocDocCode( ) { return ardocDocCode; }
	public void setArdocDocCode( String ardocDocCode ) { this.ardocDocCode = ardocDocCode; }
	
	public Date getArdocDocumentDate( ) { return ardocDocumentDate; }
	public void setArdocDocumentDate( Date date ) { ardocDocumentDate = date; }
}
