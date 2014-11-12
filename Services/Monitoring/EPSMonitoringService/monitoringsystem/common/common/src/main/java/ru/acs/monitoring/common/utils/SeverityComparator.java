package ru.acs.monitoring.common.utils;

import java.util.Iterator;
import java.util.List;

import ru.acs.fts.dto.monitoring.MonitoringAttribute;
import ru.acs.fts.dto.monitoring.Severity;


public class SeverityComparator {
	public static Severity getMaxSeverity(Severity severity1, Severity severity2) {
		Severity maxSeverity =severity1;
		if (severity1 != Severity.ERROR && Severity.WARNING == severity2) {
			maxSeverity = Severity.WARNING;
		}
		if (Severity.ERROR == severity1 || Severity.ERROR == severity2) {
			maxSeverity = Severity.ERROR;			
		}
		if (severity1==null && severity2!=null){
			maxSeverity=severity2;
		}
		return maxSeverity;
	}
	
	@SuppressWarnings("unchecked")
	public static Severity getMaxSeverity(List attrList) {
		Severity maxSeverity = Severity.INFO;
		for (Iterator iterator = attrList.iterator(); iterator.hasNext();) {
			MonitoringAttribute attr = (MonitoringAttribute) iterator.next();
			maxSeverity =getMaxSeverity(maxSeverity,attr.getSeverity());
		}
		return maxSeverity;
	}
}
