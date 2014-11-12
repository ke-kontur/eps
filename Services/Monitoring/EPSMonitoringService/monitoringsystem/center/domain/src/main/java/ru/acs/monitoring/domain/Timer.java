package ru.acs.monitoring.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Таймер - используется для отслеживания запросов с таймаутом
 * @author fmv
 *
 */
@Entity
@Table(name = "Timer", uniqueConstraints = { @UniqueConstraint(columnNames = { "requestId" }) })
public class Timer extends BaseObject {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5929975051404713186L;
	
	
	@Column(nullable = false)
	String receiver;

	@Column(nullable = true)
	Long connectionId;
	
	@Column(nullable = false)	
	String requestId;
	
	@Column(nullable = true)
	String messageKind;
	
	@Column(nullable = false)
	protected Date statDate;
	
	@Column(nullable = false)
	protected Date endDate;

	
	public String getReceiver() {
		return receiver;
	}

	/**
	 * Получатель
	 * @param receiver
	 */
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	

	public Date getStatDate() {
		return statDate;
	}

	/**
	 * время запуска таймера
	 * @param statDate
	 */
	public void setStatDate(Date statDate) {
		this.statDate = statDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	/**
	 * время таймаута
	 * @param endDate
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getRequestId() {
		return requestId;
	}

	/**
	 * id отправленного запроса, например, из EnvelopeID
	 * @param requestId
	 */
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getConnectionId() {
		return connectionId;
	}

	/**
	 * id подключения, если испльзуется запрос к {@link Connection} 
	 * @param connectionId
	 */
	public void setConnectionId(Long connectionId) {
		this.connectionId = connectionId;
	}

	public String getMessageKind() {
		return messageKind;
	}

	/**
	 * Тип отправленного запроса
	 * @param messageKind
	 */
	public void setMessageKind(String messageKind) {
		this.messageKind = messageKind;
	}
}
