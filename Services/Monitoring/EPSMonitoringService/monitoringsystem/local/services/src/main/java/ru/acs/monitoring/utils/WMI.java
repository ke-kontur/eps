package ru.acs.monitoring.utils;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.acs.monitoring.MonitoringRuntimeException;
import ru.acs.monitoring.utils.exceptions.WMIException;

public class WMI {
	final static Logger log = LoggerFactory.getLogger(WMI.class);

	/** These are native methods which collect and return WMI information. */
	private native int ConnectServer(String serverAndNamespace,
			String userName, String password) throws WMIException;

	private native String[] GetRunningServicesNames(int nativeHandle)
			throws WMIException;

	private native int GetEventLogErrorsCount(int nativeHandle, String logName,
			String source, String beginDateTime, String endDateTime)
			throws WMIException;
	
	private native long GetTotalMemorySize(int nativeHandle)
			throws WMIException;
	
	private native long GetFreeMemorySize(int nativeHandle)
		throws WMIException;


	private native void CloseHandle(int nativeHandle) throws WMIException;

	/** Used to communicate with the native code */
	// private int nativeHandle;

	public WMI() {
		System.loadLibrary("monitoring_wmi");
	}

	public long getTotalMemorySize() {		
		long result = 0;
		int nativeHandle = 0;
		try {
			nativeHandle = ConnectServer("root\\cimv2", "", "");			
			result = GetTotalMemorySize(nativeHandle);
		} catch (Throwable th) {
			String message = "Сбой при определении общего объема памяти";
			log.error(message, th);
			throw new MonitoringRuntimeException(message, th);
		} finally {
			if (nativeHandle != 0)
				try {
					CloseHandle(nativeHandle);
				} catch (Exception exc) {
				}
		}		
		return result;
	}

	public long getWindowsFreeMemorySize() {		
		long result = 0;
		int nativeHandle = 0;
		try {
			nativeHandle = ConnectServer("root\\cimv2", "", "");			
			result = GetFreeMemorySize(nativeHandle);
		} catch (Throwable th) {
			String message = "Сбой при определении свободного объема памяти";
			log.error(message, th);
			throw new MonitoringRuntimeException(message, th);
		} finally {
			if (nativeHandle != 0)
				try {
					CloseHandle(nativeHandle);
				} catch (Exception exc) {
				}
		}		
		return result << 10;
	}
	
	private String format(Date date) {
		DateFormat format = new SimpleDateFormat("yyyyMMddHHmmss.000000");
		DateFormat tzFormat = new SimpleDateFormat("Z");
		String tz = tzFormat.format(date);
		tz = tz.substring(0, 1) + tz.substring(2, 5);
		return format.format(date) + tz;
	}

	public int getEventLogErrorsCount(String logName, String source,
			Date beginDateTime, Date endDateTime) {
		int result = 0;
		int nativeHandle = 0;
		try {
			nativeHandle = ConnectServer("root\\cimv2", "", "");			
			result = GetEventLogErrorsCount(nativeHandle, logName, source,
					format(beginDateTime), format(endDateTime));
		} catch (Throwable th) {
			String message = "Сбой при определении количества записей об ошибках в системном журнале";
			log.error(message, th);
			throw new MonitoringRuntimeException(message, th);
		} finally {
			if (nativeHandle != 0)
				try {
					CloseHandle(nativeHandle);
				} catch (Exception exc) {
				}
		}
		return result;
	}

	public List<String> getRunningServices() {
		List<String> result = new LinkedList<String>();
		int nativeHandle = 0;
		try {
			nativeHandle = ConnectServer("root\\cimv2", "", "");
			result.addAll(Arrays.asList(GetRunningServicesNames(nativeHandle)));
		} catch (Throwable th) {
			String message = "Сбой при определении запущенных сервисов";
			log.error(message, th);
			throw new MonitoringRuntimeException(message, th);
		} finally {
			if (nativeHandle != 0)
				try {
					CloseHandle(nativeHandle);
				} catch (Exception exc) {
				}
		}
		return result;
	}	

	public static boolean isLocalHost(String host) {
		try {
			// Try some well known names first
			if (host.equalsIgnoreCase("localhost") || host.equals("127.0.0.1"))
				return true;

			String remoteHost = InetAddress.getByName(host).getHostAddress();
			String localHost = InetAddress.getLocalHost().getHostAddress();
			if (localHost != null && localHost.equalsIgnoreCase(remoteHost))
				return true;
		} catch (UnknownHostException e) {
			// ignore
		}
		return false;
	}
}
