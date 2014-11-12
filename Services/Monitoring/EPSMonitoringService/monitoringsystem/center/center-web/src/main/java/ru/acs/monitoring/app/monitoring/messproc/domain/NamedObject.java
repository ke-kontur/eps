package ru.acs.monitoring.app.monitoring.messproc.domain;

import java.io.Serializable;

import com.extjs.gxt.ui.client.data.BeanModelTag;

/**
 * Объект для вывода информации из БД на UI в разных контролах 
 * @author fmv
 *
 */
public class NamedObject implements BeanModelTag, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4726107571401857856L;
	Long id;
	String name;
	String description;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
}
