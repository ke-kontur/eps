package ru.acs.monitoring.services;

import java.util.Arrays;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.dto.monitoring.Attribute;

/**
 * Информация о БД
 * @author fmv
 *
 */
public class DBSettings extends Attribute{

		/**
		 * dataSource этой БД
		 */
		DataSource dataSource;
		//По умолчанию производится мониторинг состояния только 
		//табличного пространства Users
		List<TableSpaceSettings> monitoredTableSpaces = Arrays.asList(new TableSpaceSettings("USERS"));
				
		/**
		 * Описания запросов проверки корректности содержимого БД
		 */
		List<DBContentCheckSettings> dbContentChecks;

		public List<DBContentCheckSettings> getDbContentChecks() {
			return dbContentChecks;
		}
		public void setDbContentChecks(List<DBContentCheckSettings> dbContentChecks) {
			this.dbContentChecks = dbContentChecks;
		}
		public DataSource getDataSource() {
			return dataSource;
		}
		@Required
		public void setDataSource(DataSource dataSource) {
			this.dataSource = dataSource;
		}
		public List<TableSpaceSettings> getMonitoredTableSpaces() {
			return monitoredTableSpaces;
		}
		public void setMonitoredTableSpaces(List<TableSpaceSettings> monitoredTableSpaces) {
			this.monitoredTableSpaces = monitoredTableSpaces;
		}
		
		/**
		 * Класс описания табл спэйса
		 * @author bad
		 *
		 */
		public static class TableSpaceSettings {			
			
			private String name;
			private Integer warningLevel = null;
			private Integer errorLevel = null;
			
			private Integer percentWarningLevel = 10;
			private Integer percentErrorLevel = 3;
			
			public TableSpaceSettings() {}
			
			public TableSpaceSettings(String name) {				
				this.name = name;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Integer getWarningLevel() {
				return warningLevel;
			}

			public void setWarningLevel(Integer warningLevel) {
				percentWarningLevel = null;
				this.warningLevel = warningLevel;
			}

			public Integer getErrorLevel() {
				return errorLevel;
			}

			public void setErrorLevel(Integer errorLevel) {
				percentErrorLevel = null;
				this.errorLevel = errorLevel;
			}

			public Integer getPercentWarningLevel() {
				return percentWarningLevel;
			}

			public void setPercentWarningLevel(Integer percentWarningLevel) {
				warningLevel = null;
				this.percentWarningLevel = percentWarningLevel;
			}

			public Integer getPercentErrorLevel() {
				return percentErrorLevel;
			}

			public void setPercentErrorLevel(Integer percentErrorLevel) {
				errorLevel = null;
				this.percentErrorLevel = percentErrorLevel;
			}			
						
		}
}
