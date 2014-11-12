package ru.acs.fts.dto;


public class MarshallMessageException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public MarshallMessageException(Throwable cause) {
        super(cause);
    }

	public MarshallMessageException(String string, Exception e) {
		super(string,e);
	}

}
