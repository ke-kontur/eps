package ru.acs.monitoring.services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;

import ru.acs.fts.dto.adapters.DateUtilities;
import ru.acs.fts.dto.monitoring.AvailableMonitoringAttribute;
import ru.acs.fts.dto.monitoring.DbAvailableSizeInfo;
import ru.acs.fts.dto.monitoring.DbContentCheck;
import ru.acs.fts.dto.monitoring.DbContentChecks;
import ru.acs.fts.dto.monitoring.DbMonitoringInfo;
import ru.acs.fts.dto.monitoring.DbMonitoringInfos;
import ru.acs.fts.dto.monitoring.MonitoringAttribute;
import ru.acs.fts.dto.monitoring.MonitoringInfo;
import ru.acs.fts.dto.monitoring.Severity;
import ru.acs.monitoring.common.utils.SeverityUtils;
import ru.acs.monitoring.db.DBQuery;
import ru.acs.monitoring.services.DBSettings.TableSpaceSettings;

public class DBMonitoringProcess implements MonitoringProcess {
	final static Logger log = LoggerFactory.getLogger(DBMonitoringProcess.class);

	/**
	 * Список описаний БД для мониторинга, тип должен быть DBSettings
	 */

	List<DBSettings> dbSettings;

	
	@Override
	public MonitoringAttribute getAddedOrDefaultAtribute(MonitoringInfo info) {
		if (info.getDatabaseInfos() == null)
			info.setDatabaseInfos(new DbMonitoringInfos());
		return info.getDatabaseInfos();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ru.acs.monitoring.services.MonitoringProcess#getMonitoringInfo(ru.acs
	 * .monitoring.types.MonitoringInfo)
	 */
	public void fillMonitoringInfo(MonitoringInfo info) {
		if (dbSettings != null && dbSettings.size() > 0) {
			DbMonitoringInfos dbMonInfo = new DbMonitoringInfos();
			dbMonInfo.setName("Мониторинг БД-х");
			dbMonInfo.setDescription("Информация мониторинга БД-х");
			for (Object odbRef : dbSettings) {
				DBSettings dbref = (DBSettings) odbRef;
				scanDB(dbMonInfo, dbref);
			}
			dbMonInfo.setSeverity(SeverityUtils.getMaxSeverity(dbMonInfo));
			dbMonInfo.setUpdateTime(DateUtilities.gregorianToXml(GregorianCalendar.getInstance()));
			info.setDatabaseInfos(dbMonInfo);
		}else{
			log.info(getProcessName()+ " не запущен, так как не настроен список БД для проверки!");
		}

	}

	private void scanDB(DbMonitoringInfos dbMonInfo, DBSettings dbref) {
		log.info("Запущен процесс проверки БД: " + dbref.getName());
		DbMonitoringInfo attr = new DbMonitoringInfo();
		attr.setName(dbref.getName());
		attr.setDescription(dbref.getDescription());
		attr.setUpdateTime(DateUtilities.xmlCalendar());
		dbMonInfo.getDbInfos().add(attr);

		DBQuery dbQuery = new DBQuery();
		dbQuery.setDataSource(dbref.getDataSource());

		boolean isAvail = checkAvailable(attr, dbQuery);
		if (isAvail) {
			checkDBFileSize(attr, dbQuery, dbref);
			checkContent(attr, dbref, dbQuery);			
		}
		
		
		attr.setSeverity(SeverityUtils.getMaxSeverity(attr));
	}

	/**
	 * Проверка содержимого БД
	 * 	 
	 * @param dbQuery
	 */
	private void checkContent(DbMonitoringInfo attr, DBSettings dbref, DBQuery dbQuery) {
		if (dbref.getDbContentChecks() == null)
			return;
		DbContentChecks checks = new DbContentChecks();
		attr.setDbContentChecks(checks);
		checks.setName("Мониторинг содержимого БД");
		checks.setDescription("Информация мониторинга содержимого БД");
		checks.setUpdateTime(DateUtilities.xmlCalendar());
		
		for (DBContentCheckSettings check: dbref.getDbContentChecks()) {
			DbContentCheck dtoCheck = new DbContentCheck();
			dtoCheck.setName(check.getName());
			dtoCheck.setDescription(check.getDescription());
			dtoCheck.setUpdateTime(DateUtilities.xmlCalendar());
			checkDBCorrectness(dtoCheck, dbQuery, check.getCheckingSql());	
			checks.getDbContentChecks().add(dtoCheck);
		}
		checks.setSeverity(SeverityUtils.getMaxSeverity(checks));
		
	}
	/**
	 * Извлечение данных о доступном месте в табличных пространствах
	 * 
	 * @param attr
	 * @param dbQuery
	 */
	@SuppressWarnings("unchecked")
	private void checkDBFileSize(DbMonitoringInfo attr, DBQuery dbQuery, DBSettings dbref) {
		Collection availableInfos = null;
		try {
			availableInfos = dbQuery.getAvailableInfo();
		} catch (DataAccessException e) {
			log
					.error("Ошибка получения информации о свободном месте БД '" + attr.getName() + "': "
							+ e.getMessage(), e);
			fillErrorInfo(attr, e);
			return;
		}
		
		Map<String, TableSpaceSettings> tsMap = new HashMap<String, TableSpaceSettings>();
		for (TableSpaceSettings tsSettings: dbref.getMonitoredTableSpaces())
			tsMap.put(tsSettings.getName(), tsSettings);
		
		for (Object object : availableInfos) {
			DbAvailableSizeInfo info = (DbAvailableSizeInfo) object;
			attr.setSeverity(Severity.INFO);
			
			TableSpaceSettings tsSettings = tsMap.get(info.getTablespace().toUpperCase());
			if (tsSettings != null) {				
				attr.getDbFileSizes().add(info);
				Double freeSpaceMB = info.getMaxSpace() - info.getUsedSpace();
				// кидаем error
				if (tsSettings.getErrorLevel() != null && tsSettings.getErrorLevel() >= freeSpaceMB)
					info.setSeverity(Severity.ERROR);
				
				else if (tsSettings.getPercentErrorLevel() != null && tsSettings.getPercentErrorLevel() >= info.getAvailablePercent())				
					info.setSeverity(Severity.ERROR);
				
				// кидаем варнинг
				else if (tsSettings.getWarningLevel() != null && tsSettings.getWarningLevel() >= freeSpaceMB)
					info.setSeverity(Severity.WARNING);
				
				else if (tsSettings.getPercentWarningLevel() != null && tsSettings.getPercentWarningLevel() >= info.getAvailablePercent())				
					info.setSeverity(Severity.WARNING);
				
				info.setUpdateTime(DateUtilities.gregorianToXml(GregorianCalendar.getInstance()));				
			}
		}
	}	
	

	/**
	 * Проверка доступности БД
	 * 
	 * @param attr
	 * @param dbQuery
	 * @return доступность
	 */
	private boolean checkAvailable(DbMonitoringInfo attr, DBQuery dbQuery) {
		try {
			dbQuery.getCount();
			attr.setAvailable(new AvailableMonitoringAttribute());
			attr.getAvailable().setAvailable(Boolean.TRUE);
			attr.getAvailable().setSeverity(Severity.INFO);
			attr.getAvailable().setUpdateTime(DateUtilities.gregorianToXml(GregorianCalendar.getInstance()));
			return true;
		} catch (DataAccessException e) {
			log.error("Ошибка получения информации о доступности БД '" + attr.getName() + "': " + e.getMessage(), e);
			fillErrorInfo(attr, e);
			return false;
		}

	}

	private void fillErrorInfo(DbMonitoringInfo attr, DataAccessException e) {
		attr.setAvailable(new AvailableMonitoringAttribute());
		attr.getAvailable().setAvailable(Boolean.FALSE);
		attr.getAvailable().setSeverity(Severity.ERROR);
		attr.getAvailable().setAdditionalInfo(e.getMessage());
		attr.getAvailable().setUpdateTime(DateUtilities.gregorianToXml(GregorianCalendar.getInstance()));
	}
	
	private void fillErrorInfo(DbContentCheck attr, DataAccessException e) {		
		attr.setCorrect(false);
		attr.setSeverity(Severity.ERROR);
		attr.setIncorrectnessDescription(e.getMessage());
		attr.setUpdateTime(
				DateUtilities.gregorianToXml(GregorianCalendar.getInstance()));
	}

	/**
	 * Список описаний БД для мониторинга
	 * 
	 */
	@Autowired(required=false)
	public void setDbSettings(List<DBSettings> dbItems) {
		this.dbSettings = dbItems;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ru.acs.monitoring.services.MonitoringProcess#getProcessName()
	 */
	public String getProcessName() {
		return "Сервис мониторинга БД";
	}
	
	/**
	 * Проверка корректности хранимых данных
	 */
	//@SuppressWarnings("unchecked")
	private void checkDBCorrectness(DbContentCheck check, DBQuery dbQuery,
			String sql) {
		List<CheckResult> correctessChecking = null;
		try {
			correctessChecking = dbQuery.makeSearch(sql,
					new CheckResultMapper());
		} catch (DataAccessException e) {
			log.error(
					"Ошибка получения информации о корректности содержимого БД '"
							+ check.getName() + "': " + e.getMessage(), e);
			fillErrorInfo(check, e);
			return;
		}
		CheckResult correctness = correctessChecking.get(0);

		check.setCorrect(correctness.getSeverity()==Severity.INFO?true:false);
		check.setSeverity(correctness.getSeverity());
		check.setIncorrectnessDescription(correctness
				.getDescription());
		check.setUpdateTime(DateUtilities.gregorianToXml(GregorianCalendar
				.getInstance()));
	}
	
	public static class CheckResult {
		private Severity severity;
		private String description;

        public Severity getSeverity() {
            return severity;
        }

        public void setSeverity(Severity severity) {
            this.severity = severity;
        }

        public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}		
	}
	
	public static class CheckResultMapper implements
			ParameterizedRowMapper<CheckResult> {

		@Override
		public CheckResult mapRow(ResultSet rs, int rowNum) throws SQLException {
			CheckResult check = new CheckResult();
            if ("OK".equalsIgnoreCase(rs.getString(1))){
                check.setSeverity(Severity.INFO);
            }else if ("WARN".equalsIgnoreCase(rs.getString(1))){
                check.setSeverity(Severity.WARNING);
            }else{
                check.setSeverity(Severity.ERROR);
            }
            if (rs.getString(2)!=null){
			    check.setDescription(rs.getString(2));
            }
			return check;
		}
	}
}
