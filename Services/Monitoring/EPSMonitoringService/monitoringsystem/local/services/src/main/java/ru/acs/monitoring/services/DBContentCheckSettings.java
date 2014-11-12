package ru.acs.monitoring.services;

import ru.acs.fts.dto.monitoring.Attribute;

/**
 * Информация о БД информационной системы
 * 
 * @author bad
 * 
 */
public class DBContentCheckSettings extends Attribute {

	/**
	 * Запрос к БД, проверяющий корректность её содержимого
	 */
	private String checkingSql;

	public String getCheckingSql() {
		return checkingSql;
	}

	public void setCheckingSql(String checkingSql) {
		this.checkingSql = checkingSql;
	}

}
