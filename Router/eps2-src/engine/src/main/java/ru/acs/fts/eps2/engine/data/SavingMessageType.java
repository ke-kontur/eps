package ru.acs.fts.eps2.engine.data;

/**
 * Тип сообщения, задающий способ его сохранения в базу данных.
 */
public enum SavingMessageType
{
	INITIAL_MESSAGE, /** Сообщение, инициированное в АПС ЭПС. */
	RESPONSE_MESSAGE, /** Сообщение - ответ. */
	TRANSIT_MESSAGE, /** Транзитное сообщение. */
	INCOME_MESSAGE; /** Входящее сообщение. */
}
