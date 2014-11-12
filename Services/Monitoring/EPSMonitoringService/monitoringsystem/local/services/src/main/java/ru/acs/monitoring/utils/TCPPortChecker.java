package ru.acs.monitoring.utils;

import java.net.InetSocketAddress;
import java.net.Socket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TCPPortChecker {

	final static Logger log = LoggerFactory.getLogger(TCPPortChecker.class);
	
	public boolean checkPortOpen(String host, int port, int timeout) {
		Socket socket = null;
		try {
			socket = new Socket();
			socket.connect(new InetSocketAddress(host, port), timeout);			
			return true;
		} catch (Exception exc) {
			log.error("Ошибка при проверке открытости порта", exc);
			return false;
		}
		finally {
			if (socket != null)
				try {
					socket.close();
				} catch (Exception exc) {
					log.error("Ошибка закрытия сокета", exc);					
				};
		}
		
	}	
}
