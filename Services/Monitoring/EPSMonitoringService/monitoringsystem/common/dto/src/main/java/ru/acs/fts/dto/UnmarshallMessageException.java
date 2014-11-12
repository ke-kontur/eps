package ru.acs.fts.dto;


public class UnmarshallMessageException extends RuntimeException {

	private static final long serialVersionUID = 1L;

    public UnmarshallMessageException(Throwable cause) {
        super(cause);
    }

	public UnmarshallMessageException(String string, Exception e) {
		super(string,e);
	}
}
