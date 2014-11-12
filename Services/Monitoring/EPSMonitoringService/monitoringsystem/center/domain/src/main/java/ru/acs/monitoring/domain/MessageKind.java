package ru.acs.monitoring.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * Типы сообщений
 * @author fmv
 *
 */
@Entity
public class MessageKind extends BaseObject {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4824543133939303175L;
	
	@Column(nullable = false, length = 255)
	String code;
	
	@Column(nullable = true, length = 255)
	String description;
		
	@ManyToOne
	MessageProcessingSystem system;
	


	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public MessageProcessingSystem getSystem() {
		return system;
	}

	public void setSystem(MessageProcessingSystem system) {
		this.system = system;
	}
}
