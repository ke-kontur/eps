package ru.acs.fts.eps2.model.entities;

import javax.persistence.*;

@Entity
@IdClass( Edarch_Archive_Docs_Ids.class )
@Table( name = "EDARCH_ARCHIVE_DOCS" )
public class Edarch_Archive_Docs_WithContent
{
	public Edarch_Archive_Docs_WithContent( )
	{

	}

	@Id
	@Column( name = "ARDOC_IDINTERNAL", length = 41, nullable = false )
	private String ardocIdinternal;
	@Id
	@Column( name = "ARDOC_ARCH_IDINTERNAL", length = 41, nullable = false )
	private String ardocArchIdinternal;

	@Lob
	@Column( name = "ARDOC_DOCUMENT" )
	private String ardocDocument;
	
	@Lob
	@Column( name = "ARDOC_DSDATA" )
	private byte[ ] ardocDsDate; // ох...
	
	public String getArdocArchIdinternal( ) { return ardocArchIdinternal; }
	public void setArdocArchIdinternal( String ardocArchIdinternal ) { this.ardocArchIdinternal = ardocArchIdinternal; }

	public String getArdocIdinternal( ) { return ardocIdinternal; }
	public void setArdocIdinternal( String ardocIdinternal ) { this.ardocIdinternal = ardocIdinternal; }

	public String getArdocDocument( ) { return ardocDocument; }
	public void setArdocDocument( String ardocDocument ) { this.ardocDocument = ardocDocument; }

	public byte[ ] getArdocDsDate( ) { return ardocDsDate; }
	public void setArdocDsDate( byte[ ] ardocDsDate ) { this.ardocDsDate = ardocDsDate; }
}
