package ru.acs.fts.eps2.router.objects.defines;

public enum DocumentSaveTypes
{
	INSERT,						// Добавить новый документ
	INSERT_WITH_UPDATE_OLD,		// Добавить новый документ и обновить ссылочный
	UPDATE,						// Обновить уже имеющийся документ (merge)
	UPSERT						// Добавить новый если нет с таким ID, или обновить уже имеющийся
}
