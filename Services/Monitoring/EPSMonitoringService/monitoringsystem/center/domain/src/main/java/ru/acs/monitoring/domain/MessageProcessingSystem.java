package ru.acs.monitoring.domain;

import javax.persistence.Column;
import javax.persistence.ManyToOne;

public class MessageProcessingSystem extends BaseObject {
	/**
	 * 
	 */
	private static final long serialVersionUID = 93001372406236871L;

	@Column(nullable = false, length = 255)
	String name;
	
	@Column(nullable = true, length = 255)
	String description;
		
	@ManyToOne
	Connection connection;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}
	
}
