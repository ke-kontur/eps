package ru.acs.fts.eps2.engine.error;

public class JMSMessageConverterException extends Exception {
	private static final long serialVersionUID = 1L;

	public JMSMessageConverterException(String message, Throwable cause) {
		super(message, cause);
	}

	public JMSMessageConverterException(String message) {
		super(message);
	}
}