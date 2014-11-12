package ru.acs.monitoring.services;

import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.dto.monitoring.Attribute;

/**
 * Проверка содержимого системных журналов
 * 
 * @author bad
 * 
 */
public class EventLogCheckSettings extends Attribute {

	private String logName;
	private String sourceName;
	private int interval;
	private int maxErrorCount;

	public String getLogName() {

		return logName;
	}

	@Required
	public void setLogName(String logName) {
		this.logName = logName;
	}

	public String getSourceName() {
		return sourceName;
	}

	@Required
	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}

	public int getInterval() {
		return interval;
	}

	@Required
	public void setInterval(int interval) {
		this.interval = interval;
	}

	public int getMaxErrorCount() {
		return maxErrorCount;
	}

	@Required
	public void setMaxErrorCount(int maxErrorCount) {
		this.maxErrorCount = maxErrorCount;
	}
}
