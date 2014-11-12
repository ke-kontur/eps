package ru.acs.monitoring;

/**
 * Исключение генереируемое системой
 * @author fmv
 *
 */
@SuppressWarnings("serial")
public class MonitoringRuntimeException extends RuntimeException {

	public MonitoringRuntimeException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public MonitoringRuntimeException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
