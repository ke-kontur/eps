package ru.acs.fts.aud.router.processing.definitions;

public class AudContextConstants
{
	// @formatter:off
	private AudContextConstants( ) { }
	// @formatter:on
	
	/**
	 * Имя ошибочного конверта по умолчанию
	 */
	public static final String AUD_ERROR_ENVELOPE = "audErrorEnvelope";
	
	/**
	 * Флаг: отправка сообщения производится в транзакции
	 */
	public static final String IN_TRANSACTION = "inTransaction";
	
	/**
	 * Имя конверта в контексте
	 */
	public static final String ENVELOPE_NAME = "envelopeName";
	
	/**
	 * Имя конверта
	 */
	public static final String ENVELOPE = "envelope";
	
	/**
	 * Флаг: увеличить число успешных запросов на единицу
	 */
	public static final String INC_SUCCESSFUL_REQ = "increaseSuccessfulRequests";
	
	/**
	 * Имя коллекции извлеченных документов
	 */
	public static final String EXTRACTED_DOCUMENTS_COLLECTION_NAME = "extractedDocumentsCollectionName";
	
	/**
	 * Клиент архива
	 */
	public static final String ARCHIVE_CLIENT = "archiveClient";
	
	/**
	 * Имя коллекции значений
	 */
	public static final String VALUE_COLLECTION_NAME = "valueCollectionName";
	
	/**
	 * Кэш версий типов документов
	 */
	public static final String DOCUMENT_KIND_VERSION_CACHE_NAME = "documentKindVersionCacheName";
	
	/**
	 * Коллекция сохраненных документов
	 */
	public static final String SAVED_DOCUMENTS = "savedDocuments";
	
	/**
	 * Сохраненный пакет документов
	 */
	public static final String SAVED_PACKET = "savedPacket";
	
	/**
	 * Имя ответа (ключ)
	 */
	public static final String RESPONSE_NAME = "responseName";
	
	/**
	 * Имя ответа по умолчанию
	 */
	public static final String RESPONSE_OBJECT = "responseObject";
}
