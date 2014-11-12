package ru.acs.fts.eps2.engine.data.kind;

public class DocumentStates
{
	/**
	 * Измененный документ.
	 */
	public static final String CHANGED = "CHANGED";
	
	/**
	 * Текущий документ.
	 */
	public static final String CURRENT = "CURRENT";
	
	/**
	 * Удаленный документ.
	 */
	public static final String DELETED = "DELETED";
	
	/**
	 * Документ, изменения которого запрещены.
	 */
	public static final String NOTCHANGEABLE = "NOTCHANGEABLE";
	
	/**
	 * Состояние документа не установлено.
	 */
	public static final String NOTSET = "NOTSET";
	
	/**
	 * Ожидающий подтверждения.
	 */
	public static final String WAITABLE = "WAITABLE";
	
	public static boolean isSameState( String state1, String state2 ) // NO_UCD (unused code)
	{
		if ( null == state1 || null == state2 )
			return false;
		
		return state1.equalsIgnoreCase( state2 );
	}
}
