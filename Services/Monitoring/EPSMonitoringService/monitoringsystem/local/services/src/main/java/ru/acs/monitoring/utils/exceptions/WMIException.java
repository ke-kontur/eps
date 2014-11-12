package ru.acs.monitoring.utils.exceptions;

public class WMIException extends Exception {
	
	/**
     * Constructor
     * @param s
     * @param e
     */
    public WMIException(String s) {
        super(s);
    }

	/**
	 * Constructor
     * @param s
	 * @param e
	 */
	public WMIException(String s, Throwable e) {
        super(s, e);
    }

}
