package ru.acs.monitoring.app.monitoring.messproc.domain;

import java.io.Serializable;
import java.util.Date;

import com.extjs.gxt.ui.client.data.BeanModelTag;

/**
 * Статистика обработки для GUI
 * @author fmv
 *
 */
public class MessageProcessingStatData implements BeanModelTag, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2831316243710353266L;
	protected Long success=0l;
	protected Long flkError=0l;
	protected Long error = 0l;
	protected Date statDate;
	NamedObject system;
	NamedObject connection;
	NamedObject messageKind;
	protected String name;
	
	public Long getSuccess() {
		return success;
	}
	public void setSuccess(Long success) {
		this.success = success;
	}
	public Long getFlkError() {
		return flkError;
	}
	public void setFlkError(Long flkError) {
		this.flkError = flkError;
	}
	public Long getError() {
		return error;
	}
	public void setError(Long error) {
		this.error = error;
	}
	public Date getStatDate() {
		return statDate;
	}
	public void setStatDate(Date statDate) {
		this.statDate = statDate;
	}
	public NamedObject getSystem() {
		return system;
	}
	public void setSystem(NamedObject system) {
		this.system = system;
	}
	public NamedObject getConnection() {
		return connection;
	}
	public void setConnection(NamedObject connection) {
		this.connection = connection;
	}
	public NamedObject getMessageKind() {
		return messageKind;
	}
	public void setMessageKind(NamedObject messageKind) {
		this.messageKind = messageKind;
	}
	public String getName() {
		return getMessageKind().getName();
	}
	public void setName(String name) {
		this.name = name;
	}
}
