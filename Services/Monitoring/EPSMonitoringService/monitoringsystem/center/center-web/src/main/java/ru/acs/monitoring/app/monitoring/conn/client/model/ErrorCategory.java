package ru.acs.monitoring.app.monitoring.conn.client.model;

/**
 * Категории ошибок мониторинга.
 *
 * @author bad
 */
public enum ErrorCategory {
	/**
	 * Ошибки, связанные с БД
	 */
	DBError,
	/**
	 * Ошибки, связанные с MQ
	 */
	MQError,
	/**
	 * Ошибки, связанные с сервисами
	 */
	ServicesErrors,
	/**
	 * Ошибки, связанные с инфраструктурой ЭЦП
	 */
	SignatureErrors,
	/**
	 * Ошибки, связанные с обработкой сообщений
	 */
	MessageProcessingErrors	
}
