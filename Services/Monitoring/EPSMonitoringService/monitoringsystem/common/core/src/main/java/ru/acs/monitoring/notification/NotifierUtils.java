package ru.acs.monitoring.notification;

import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;

import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.acs.fts.dto.adapters.XmlDateTimeAdapter;
import ru.acs.fts.dto.monitoring.Attribute;
import ru.acs.fts.dto.monitoring.MonitoringAttribute;
import ru.acs.fts.dto.monitoring.MonitoringInfo;
import ru.acs.fts.dto.monitoring.QueueStatus;
import ru.acs.fts.dto.monitoring.Severity;

public class NotifierUtils {
	final static Logger log = LoggerFactory.getLogger(NotifierUtils.class);

	public static int getMonitoringInfoErrorsCount(MonitoringInfo info) {
		return getErrorsCount(info);
	}

	private static int getErrorsCount(Object obj) {
		if (obj == null)
			return 0;

		int result = 0;
		if (obj instanceof Iterable<?>) {
			for (Object subObj : (Iterable<?>) obj)
				result += getErrorsCount(subObj);
			return result;
		}

		if (!(obj instanceof Attribute) && !(obj instanceof MonitoringInfo))
			return 0;

		if (obj instanceof MonitoringAttribute
				&& Severity.ERROR.equals(((MonitoringAttribute) obj)
						.getSeverity()))
			result++;

		for (Method method : obj.getClass().getMethods())
			if (method.getName().startsWith("get"))
				try {
					result += getErrorsCount(method.invoke(obj));
				} catch (Exception exc) {
					log
							.error(
									"Сбой при подсчете ошибок, выявленных при мониторинге",
									exc);
				}
		return result;
	}

	public static boolean areAtributesEquals(MonitoringAttribute newOne, MonitoringAttribute oldOne) {
		if (newOne == null && oldOne == null)
			return true;
		//Считаем, что если нет старой информации, то нет отличий
		if (oldOne == null)
			return true;
		return equals(newOne, oldOne);
	}
	
	public static boolean areAtributesEquals(List<? extends MonitoringAttribute> newOne, List<? extends MonitoringAttribute> oldOne) {
		if (newOne == null && oldOne == null)
			return true;
		//Считаем, что если нет старой информации, то нет отличий
		if (oldOne == null)
			return true;
		if (newOne.size() != oldOne.size())
			return false;
		for (int i = 0; i < newOne.size(); i++) {
			MonitoringAttribute newAttribute = newOne.get(i);
			MonitoringAttribute oldAttribute = oldOne.get(i);
			if (newAttribute == null || oldAttribute == null)
				return false;
			if (!equals(newAttribute, oldAttribute))
				return false;
		}		
		return true;
	}
	
	private static boolean equals(MonitoringAttribute newOne, MonitoringAttribute oldOne) {
		return new CustomEqualsStrategy().equals(null, null, newOne, oldOne);
	}
	
	private static class CustomEqualsStrategy extends JAXBEqualsStrategy{

		@Override
		public boolean equals(ObjectLocator leftLocator,
				ObjectLocator rightLocator, Object lhs, Object rhs) {
			if (lhs instanceof MonitoringAttribute && rhs instanceof MonitoringAttribute) {
				MonitoringAttribute left = (MonitoringAttribute)lhs;
				MonitoringAttribute right = (MonitoringAttribute)rhs;
				XmlDateTimeAdapter lValue = left.getUpdateTime();
				XmlDateTimeAdapter rValue = right.getUpdateTime();
				left.setUpdateTime(null);
				right.setUpdateTime(null);
				boolean result = false;
				if (left instanceof QueueStatus && right instanceof QueueStatus) 
					result = queueStatusEquals(leftLocator, rightLocator, (QueueStatus)left, (QueueStatus)right);
				else
					result  = super.equals(leftLocator, rightLocator, left, right);
				left.setUpdateTime(lValue);
				right.setUpdateTime(rValue);
				return result;
			}
			return super.equals(leftLocator, rightLocator, lhs, rhs);
		}
		
		private boolean queueStatusEquals(ObjectLocator leftLocator,
				ObjectLocator rightLocator, QueueStatus left, QueueStatus right) {
			long leftValue = left.getInterval();
			long rightValue = right.getInterval();
			left.setInterval(0);
			right.setInterval(0);
			boolean result  = super.equals(leftLocator, rightLocator, left, right);
			left.setInterval(leftValue);
			right.setInterval(rightValue);
			return result;			
		}
	}
	/*
	// подсчет хэша атрибута
	public static int getAttributesHash(
			Iterable<? extends MonitoringAttribute> attributes) {
		int hash = 0;
		for (MonitoringAttribute iterAttribute : attributes)
			hash = hash + getAttributeHash(iterAttribute);
		return hash;
	}

	// подсчет хэша атрибута
	public static int getAttributeHash(MonitoringAttribute attribute) {
		deleteUpdateTime(attribute);
		
		if (attribute instanceof MqMonitoringInfo)
			for (QueueManagerInfo qmInfo: ((MqMonitoringInfo)attribute).getQueueManagerInfos())
				for (QueueStatus status: qmInfo.getQueueStatuses())
					status.setInterval(0);
		return attribute.hashCode();
	}

	// рекурсивное удаление во вложенных атрибутах значений времени обновления
	public static void deleteUpdateTime(Object obj) {
		if (obj == null)
			return;

		if (obj instanceof Iterable<?>) {
			for (Object subObj : (Iterable<?>) obj)
				deleteUpdateTime(subObj);
			return;
		}

		if (!(obj instanceof MonitoringAttribute))
			return;

		((MonitoringAttribute) obj).setUpdateTime(null);

		for (Method method : obj.getClass().getMethods())
			if (method.getName().startsWith("get"))
				try {
					deleteUpdateTime(method.invoke(obj));
				} catch (Exception exc) {
					log.error("Сбой очистки атрибутов от дат", exc);
				}
	}	*/
}
