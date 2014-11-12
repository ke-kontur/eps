package ru.acs.monitoring.common.utils;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Сетевые функции
 * @author fmv
 *
 */
public class NetUtils {
	final static Logger log = LoggerFactory.getLogger(NetUtils.class);
	public static String getLocalHostName() {
		try {
			InetAddress addr = InetAddress.getLocalHost();
			String hostname = addr.getCanonicalHostName();
			return hostname;
		} catch (UnknownHostException e) {
			log.error("Невозможно получить имя локального хоста: " + e.getMessage(), e);
		}
		return "localhost";
	}

}
