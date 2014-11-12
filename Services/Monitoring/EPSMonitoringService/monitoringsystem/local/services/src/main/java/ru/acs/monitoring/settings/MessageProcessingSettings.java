package ru.acs.monitoring.settings;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.dto.monitoring.Attribute;



public class MessageProcessingSettings extends Attribute{
	/**
	 * dataSource этой БД
	 */
	DataSource dataSource;
	
	String sql;

	public DataSource getDataSource() {
		return dataSource;
	}
	@Required
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	public String getSql() {
		return sql;
	}
	public void setSql(String sql) {
		this.sql = sql;
	}
}
