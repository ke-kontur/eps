package ru.acs.monitoring.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * XML-данные результата мониторинга
 * @author fmv
 *
 */
@Entity
@Table(name = "MonitoringInfoData")
public class MonitoringInfoData extends BaseObject {	
	private static final long serialVersionUID = -6887970836666086668L;
	
	@Lob
	@Column(nullable = true, length = 65535)
	String monitoringInfoXML;	

	public String getMonitoringInfoXML() {
		return monitoringInfoXML;
	}

	public void setMonitoringInfoXML(String monitoringInfoXML) {
		this.monitoringInfoXML = monitoringInfoXML;
	}
	
}
