package ru.acs.fts.eps2.model.entities;

import javax.persistence.*;

@Entity
@IdClass( Edarch_Read_Access_Ids.class )
@Table( name = "EDARCH_READ_ACCESS" )
public class Edarch_Read_Access
{
	public Edarch_Read_Access( )
	{

	}

	@Id
	@Column( name = "ARRA_PARTICIPANTID", nullable = false, length = 100 )
	private String participantId;
	
	@Id
	@Column( name = "ARRA_DOC_IDINTERNAL", length = 41, nullable = false )
	private String idInternal;
	
	@Id
	@Column( name = "ARRA_ARCH_IDINTERNAL", length = 41 )
	private String archIdInternal;

	public String getParticipantId( ) { return participantId; }
	public void setParticipantId( String participantId ) { this.participantId = participantId; }

	public String getIdInternal( ) { return idInternal; }
	public void setIdInternal( String idInternal ) { this.idInternal = idInternal; }

	public String getArchIdInternal( ) { return archIdInternal; }
	public void setArchIdInternal( String archIdInternal ) { this.archIdInternal = archIdInternal; }
}
