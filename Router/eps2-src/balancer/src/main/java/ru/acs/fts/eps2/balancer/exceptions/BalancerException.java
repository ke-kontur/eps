package ru.acs.fts.eps2.balancer.exceptions;

public class BalancerException extends Exception
{
	private static final long serialVersionUID = 1L;
	
	private boolean _rollback = false;
	
	// @formatter:off
	public void setRollback( boolean rollback ) { _rollback = rollback; }
	public boolean getRollback( ) { return _rollback; }
	// @formatter:on

	public BalancerException( )
	{
		
	}
	
	public BalancerException( String message )
	{
		super( message );
	}
	
	public BalancerException( Throwable cause )
	{
		super( cause );
	}
	
	public BalancerException( String message, Throwable cause ) // NO_UCD (unused code)
	{
		super( message, cause );
	}
}
