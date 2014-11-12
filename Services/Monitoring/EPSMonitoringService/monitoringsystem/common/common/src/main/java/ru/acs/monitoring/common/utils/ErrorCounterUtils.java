package ru.acs.monitoring.common.utils;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.acs.fts.dto.monitoring.Attribute;
import ru.acs.fts.dto.monitoring.MonitoringAttribute;
import ru.acs.fts.dto.monitoring.MonitoringInfo;
import ru.acs.fts.dto.monitoring.Severity;

/**
 * Утилитный класс для подсчета ошибок в резултате мониторинга. Пока не используется.
 * @author bad
 *
 */
public class ErrorCounterUtils {
	
	final static Logger log = LoggerFactory.getLogger(ErrorCounterUtils.class);

	public static int getErrorsCount(MonitoringInfo info) {		
		return getErrorsCount(info, 2, 3);		
	}
	
	public static int getHostsErrorsCount(MonitoringInfo info) {		
		return getErrorsCount(info.getHostInfos(), 1);		
	}
	
	public static int getDbErrorsCount(MonitoringInfo info) {		
		return getErrorsCount(info.getDatabaseInfos(), 1);		
	}
	
	public static int getSystemServiceErrorsCount(MonitoringInfo info) {		
		return getErrorsCount(info.getSytemServicesInfo(), 1);		
	}
	
	public static int getSignaturesErrorsCount(MonitoringInfo info) {		
		return getErrorsCount(info.getSignaturesInfo(), 1);		
	}
	
	public static int getWarningsErrorsCount(MonitoringInfo info) {		
		return getWarningsCount(info.getHostInfos(), 1);		
	}
	
	public static int getDbWarningsCount(MonitoringInfo info) {		
		return getWarningsCount(info.getDatabaseInfos(), 1);		
	}
	
	public static int getSystemServiceWarningsCount(MonitoringInfo info) {		
		return getWarningsCount(info.getSytemServicesInfo(), 1);		
	}
	
	public static int getSignaturesWarningsCount(MonitoringInfo info) {		
		return getWarningsCount(info.getSignaturesInfo(), 1);		
	}
	
		
	public static int getErrorsCount(Object obj, Integer ... depths) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		getCount(Severity.ERROR, obj, 0, map);
		int result = 0;
		for (Integer depth: depths)
			if (map.containsKey(depth))
				result += map.get(depth); 
		return result;
	}
	
	public static int getWarningsCount(Object obj, Integer ... depths) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		getCount(Severity.WARNING, obj, 0, map);
		int result = 0;
		for (Integer depth: depths)
			if (map.containsKey(depth))
				result += map.get(depth); 
		return result;
	}
	
	private static void getCount(Severity severity, Object obj, int depth, Map<Integer, Integer> map) {
		if (obj == null)
			return;

		if (map.get(depth) == null)
			map.put(depth, 0);
		
		if (obj instanceof Iterable<?>) {
			for (Object subObj: (Iterable<?>)obj)
				getCount(severity, subObj, depth, map);
			return;			
		}		
		
		if (!(obj instanceof Attribute) && !(obj instanceof MonitoringInfo))
			return;
		
		if (obj instanceof MonitoringAttribute && severity.equals(((MonitoringAttribute)obj).getSeverity()))
			map.put(depth, map.get(depth) + 1);
		
			
		
		for (Method method : obj.getClass().getMethods())
			if (method.getName().startsWith("get"))
				try {
					getCount(severity, method.invoke(obj), depth + 1, map);
				} catch (Exception exc) {
					log.error("Сбой при подсчете ошибок, выявленных при мониторинге", exc);
				}		
	}
}
