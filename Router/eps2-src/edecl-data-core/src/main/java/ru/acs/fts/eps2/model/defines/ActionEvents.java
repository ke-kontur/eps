package ru.acs.fts.eps2.model.defines;

public class ActionEvents 
{
	/**
	 * Событие по умолчанию. Используется тогда, когда нет дополнительных условий
	 */
	public static final String NO_EVENT = "NO_EVENT";

	/**
	 * Ошибка Функционально-Логического контроля (ФЛК)
	 * На данный момент не используется
	 */
	public static final String FLC_ERROR_EVENT = "FLC_ERROR_EVENT";

	/**
	 * Событие которое используется при обмене между разными РТУ
	 */
	public static final String DIFF_RTU_EVENT = "DIFF_RTU_EVENT";
}
