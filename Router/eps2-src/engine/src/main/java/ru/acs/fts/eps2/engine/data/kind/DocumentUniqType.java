package ru.acs.fts.eps2.engine.data.kind;

public enum DocumentUniqType
{
	/**
	 * Документ не уникальный, может быть записан только в таблицу неуникальных
	 * документов.
	 */
	NOTUNIQ_DOC,
	
	/**
	 * Документ уникальный, может быть записан только в таблицу уникальных
	 * документов.
	 */
	UNIQ_DOC,
	
	/**
	 * Уникальность документа определяется в момент записи в БД. Может быть
	 * записан как в таблицу уникальных документов, так и в таблицу
	 * неуникальных.
	 */
	NOTDIF_DOC
}