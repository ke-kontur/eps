package ru.acs.monitoring.app.monitoring.messproc.domain;

import java.io.Serializable;
import java.util.Date;

import ru.acs.monitoring.app.config.conn.client.model.ConnectionModel;

import com.extjs.gxt.ui.client.data.BeanModelTag;

/**
 * Объект описания фильтра для выборки данных статистики
 * @author fmv
 *
 */
public class MessageProcessingFilter implements BeanModelTag, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6291408784765404080L;
	private Date createdFrom;
	private Date createdTo;
	private ConnectionModel connection;
	private NamedObject mpSystem;
	private NamedObject messageKind;

	public Date getCreatedFrom() {
		return createdFrom;
	}

	public void setCreatedFrom(Date createdFrom) {
		this.createdFrom = createdFrom;
	}

	public Date getCreatedTo() {
		return createdTo;
	}

	public void setCreatedTo(Date createdTo) {
		this.createdTo = createdTo;
	}

	public ConnectionModel getConnection() {
		return connection;
	}

	public void setConnection(ConnectionModel connection) {
		this.connection = connection;
	}

	public NamedObject getMpSystem() {
		return mpSystem;
	}

	public void setMpSystem(NamedObject mpSystem) {
		this.mpSystem = mpSystem;
	}

	public NamedObject getMessageKind() {
		return messageKind;
	}

	public void setMessageKind(NamedObject messageKind) {
		this.messageKind = messageKind;
	}
}
