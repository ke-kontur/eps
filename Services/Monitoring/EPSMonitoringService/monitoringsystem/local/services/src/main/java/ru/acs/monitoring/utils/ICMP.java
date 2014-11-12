package ru.acs.monitoring.utils;

@Deprecated
public class ICMP {
	
	/**
	 * Pings <em>host</em> with a number of <em>bytes</em>, a number of
	 * <em>times</em> waiting for a maximum of <em>timeout</em> seconds
	 * each time. Returns the response time in milliseconds.
	 */
	public native int ping(String host, int bytes, int timeout)
			throws java.net.SocketTimeoutException, java.net.SocketException,
			java.net.UnknownHostException;


	public ICMP() {
		System.loadLibrary("monitoring_icmp");
	}

}
