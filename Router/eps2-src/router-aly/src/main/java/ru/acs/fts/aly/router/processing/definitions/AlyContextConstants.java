package ru.acs.fts.aly.router.processing.definitions;

public class AlyContextConstants
{
	// @formatter:off
	private AlyContextConstants( ) { }
	// @formatter:on
	
	/**
	 * Имя ошибочного конверта по умолчанию
	 */
	public static final String ALY_ERROR_ENVELOPE = "alyErrorEnvelope";
	
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
	 * Имя ответа (ключ)
	 */
	public static final String RESPONSE_NAME = "responseName";
	
	/**
	 * Имя ответа по умолчанию
	 */
	public static final String RESPONSE_OBJECT = "responseObject";
}
