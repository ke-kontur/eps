package ru.acs.fts.eps2.engine.processing.system;

public class TypeException extends Exception
{

	private static final long serialVersionUID = 1L;
	private Object invalidInstance;

	public TypeException( String message, Object invalidObj )
	{
		super( message );
		this.invalidInstance = invalidObj;
	}

	public Object getInvalidInstance( )
	{
		return invalidInstance;
	}

}
