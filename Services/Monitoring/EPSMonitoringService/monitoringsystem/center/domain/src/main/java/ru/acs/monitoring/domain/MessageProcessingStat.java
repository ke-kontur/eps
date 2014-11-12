package ru.acs.monitoring.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * Статистическая информация по обработке сообщений
 * 
 * @author fmv
 * 
 */
@Entity
public class MessageProcessingStat extends BaseObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3914642612547318537L;

	@Column(nullable = false)
	protected Long success=0l;

	@Column(nullable = false)
	protected Long flkError=0l;

	@Column(nullable = false)
	protected Long error = 0l;

	@Column(nullable = false)
	protected Date statDate;

	@ManyToOne
	MessageProcessingSystem system;

	@ManyToOne
	MessageKind messageKind;
	

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


	public MessageKind getMessageKind() {
		return messageKind;
	}

	public void setMessageKind(MessageKind messageKind) {
		this.messageKind = messageKind;
	}

	public MessageProcessingSystem getSystem() {
		return system;
	}

	public void setSystem(MessageProcessingSystem system) {
		this.system = system;
	}

	public Date getStatDate() {
		return statDate;
	}

	public void setStatDate(Date statDate) {
		this.statDate = statDate;
	}

}
