package ru.acs.fts.eps2.model.services.ead;

public class ArchiveStageStatuses
{
	private ArchiveStageStatuses( ) { }
	
	public static final String ARCH_STATUS_CLOSE = "C"; // NO_UCD (use private)
	
	public static final String ARCH_STATUS_REMOVE = "D";
	
	public static final String ARCH_STATUS_NEW = "0";
	
	public static boolean isClosedOrRemoved( String status )
	{
		return ARCH_STATUS_CLOSE.equalsIgnoreCase( status ) 
			|| ARCH_STATUS_REMOVE.equalsIgnoreCase( status );
	}
}
