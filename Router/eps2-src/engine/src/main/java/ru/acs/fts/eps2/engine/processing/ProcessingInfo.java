package ru.acs.fts.eps2.engine.processing;

public class ProcessingInfo // NO_UCD (use default)
{
	private String action; /** Выполняемое действие */
	private boolean success; /** Признак успешности выполненного действия */
	private String description; /** Описание действия */
	private Object[ ] args; /** Вспомогательные объекты, используемые в паре с description */

	// @formatter:off
	public String getAction( ) { return action; }
	public boolean isSuccess( ) { return success; }
	public String getDescription( ) { return description; }
	public Object[ ] getArgs( ) { return args; }	
	// @formatter:on

	private ProcessingInfo( String action, boolean success, String description, Object[ ] args )
	{
		this.action = action;
		this.args = args;
		this.description = description;
		this.success = success;
	}
	
	/**
	 * Фабричные функции 
	 */
	
	public static ProcessingInfo success( String action ) // NO_UCD (use default)
	{
		return new ProcessingInfo( action, true, null, null );
	}

	@Deprecated
	public static ProcessingInfo success( String action, String description ) // NO_UCD (unused code)
	{
		return new ProcessingInfo( action, true, description, null );
	}

	@Deprecated
	public static ProcessingInfo success( String action, String description, Object[ ] args ) // NO_UCD (unused code)
	{
		return new ProcessingInfo( action, true, description, args );
	}

	public static ProcessingInfo fail( String action, String description )
	{
		return new ProcessingInfo( action, false, description, null );
	}

	@Deprecated
	public static ProcessingInfo fail( String action, String description, Object[ ] args ) // NO_UCD (unused code)
	{
		return new ProcessingInfo( action, false, description, args );
	}
}
