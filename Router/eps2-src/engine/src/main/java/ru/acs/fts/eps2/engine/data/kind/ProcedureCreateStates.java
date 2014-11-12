package ru.acs.fts.eps2.engine.data.kind;

import ru.acs.fts.eps2.utils.StringUtil;

public class ProcedureCreateStates
{
	/**
	 * Обычный способ
	 */
	public static final String NORMAL = "NORMAL";
	
	/**
	 * Необходимо создать новую процедуру по существующему идентификатору
	 * процедуры.
	 */
	public static final String RE_CREATE_EXIST = "ReCreateExist";

	public static boolean isSame( String createState1, String createState2 )
	{
		return StringUtil.areEqual( createState1, createState2 );
	}
}
