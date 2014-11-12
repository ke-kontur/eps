package ru.acs.fts.eps2.util.wmq.interfaces;

public interface IWmqQueueConnection
{
	public boolean shutdown( );
	
	public boolean putMessage( byte[ ] message ); // NO_UCD (for reference)
	public byte[ ] getMessage( ); 
	
	public int getDepth( );
}
