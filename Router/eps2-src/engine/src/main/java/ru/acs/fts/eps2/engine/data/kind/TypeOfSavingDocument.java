package ru.acs.fts.eps2.engine.data.kind;

public enum TypeOfSavingDocument
{
	DELETE, /** Удаление. */ // NO_UCD (unused code)
	INSERT, /** Добавление. */
	INSERT_WITH_UPDATE_OLD, /** Добавление нового объекта с обновлением старого объекта. */
	UPDATE, /** Обновление. */
	UPSERT, /** Если нет такого - сохраняем, если есть - обновляем */

	NONE
}
