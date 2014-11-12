package ru.acs.monitoring.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Мониторуемая информация
 * @author fmv
 *
 */
@Entity
@Table(name = "MonitoringInf")
public class MonitoringInf extends BaseObject {
	private static final long serialVersionUID = 4568078017962202117L;

	@Column(nullable = false, length = 255)
	String systemName;
	
	@Column(nullable = true, length = 255)
	String systemId;
	
	@Column(nullable = false, length = 50)
	String severity;
	
	@Column(nullable = false)
	Date updateDate;
		
	@OneToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
	MonitoringInfoData monitoringInfoData;	

	
	@Column(nullable = true, length = 2000)
	String error;

	@ManyToOne
	Connection connection;

	public String getSystemName() {
		return systemName;
	}

	public void setSystemName(String systemName) {
		this.systemName = systemName;
	}

	public String getSystemId() {
		return systemId;
	}

	public void setSystemId(String systemId) {
		this.systemId = systemId;
	}

	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
	public MonitoringInfoData getMonitoringInfoData() {
		return monitoringInfoData;
	}

	public void setMonitoringInfoData(MonitoringInfoData monitoringInfoData) {
		this.monitoringInfoData = monitoringInfoData;
	}

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
	
}
