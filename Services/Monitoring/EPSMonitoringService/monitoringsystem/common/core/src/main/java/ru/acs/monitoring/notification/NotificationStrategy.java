package ru.acs.monitoring.notification;

/**
 * Стратегии отправки сообщений
 * @author bad
 *
 */
public enum NotificationStrategy {

	//отправлять при каждом сканировании
	EveryTime,
	//отправлять при исзменении состояния
	CacheStateChange
}
