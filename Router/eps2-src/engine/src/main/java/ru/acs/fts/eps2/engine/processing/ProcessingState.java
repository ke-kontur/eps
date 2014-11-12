package ru.acs.fts.eps2.engine.processing;

/**
 * Состояние обработки.
 */
public enum ProcessingState // NO_UCD (use default)
{
	RUNNING, /** В состоянии обработки. */
	FAILED, /** Обработка завершилась с ошибкой. */
	COMPLETED /** Обработка завершилась успешно. */ // NO_UCD (unused code)
}
