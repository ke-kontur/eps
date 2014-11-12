package ru.acs.monitoring.common.utils;

import ru.acs.fts.dto.monitoring.*;

import java.util.Iterator;
import java.util.List;

/**
 * Класс для вычисления maxSeverity XXX переписать на общий случай с
 * использованием рефлекшен
 * 
 * @author fmv
 * 
 */
public class SeverityUtils {

	public static Severity getMaxSeverity(MonitoringInfo info) {
		Severity severity = info.getSeverity();
		if (info.getDatabaseInfos() != null) {
			severity = SeverityComparator.getMaxSeverity(severity,
					getMaxSeverity(info.getDatabaseInfos()));
		}
		if (info.getSystemInfo() != null) {
			severity = SeverityComparator.getMaxSeverity(severity,
					getMaxSeverity(info.getSystemInfo()));
		}
		if (info.getSytemServicesInfo() != null) {
			severity = SeverityComparator.getMaxSeverity(severity,
					getMaxSeverity(info.getSytemServicesInfo()));
		}
		if (info.getMqMonitoringInfo() != null) {
			severity = SeverityComparator.getMaxSeverity(severity,
					getMaxSeverity(info.getMqMonitoringInfo()));
		}
		if (info.getMessagesProcessingInfos() != null
				&& info.getMessagesProcessingInfos().size() > 0) {
			severity = SeverityComparator.getMaxSeverity(severity,
					getMaxSeverityMP(info.getMessagesProcessingInfos()));
		}
		if (info.getSignaturesInfo() != null) {
			severity = SeverityComparator.getMaxSeverity(severity,
					getMaxSeverity(info.getSignaturesInfo()));
		}
		return severity;
	}
	
	public static <T extends MonitoringAttribute> Severity getMaxSeverity(
			List<T> list) {
		Severity maxSeverity = Severity.INFO;
		for (T attribute: list) 			
			maxSeverity = SeverityComparator.getMaxSeverity(maxSeverity,
					attribute.getSeverity());		
		return maxSeverity;
	}

	private static Severity getMaxSeverityMP(
			List<MessagesProcessingInfo> messagesProcessingInfos) {
		Severity maxSeverity = Severity.INFO;
		for (MessagesProcessingInfo messagesProcessingInfo : messagesProcessingInfos) {
			maxSeverity = SeverityComparator.getMaxSeverity(maxSeverity,
					messagesProcessingInfo.getSeverity());
		}
		return maxSeverity;
	}

	public static Severity getMaxSeverity(MqMonitoringInfo mqMonitoringInfo) {
		return SeverityComparator.getMaxSeverity(
				mqMonitoringInfo.getSeverity(),
				getQMMaxSeverity(mqMonitoringInfo.getQueueManagerInfos()));
	}

	private static Severity getQMMaxSeverity(
			List<QueueManagerInfo> queueManagerInfos) {
		Severity maxSeverity = Severity.INFO;
		for (Iterator<QueueManagerInfo> iterator = queueManagerInfos.iterator(); iterator
				.hasNext();) {
			QueueManagerInfo info = iterator.next();
			maxSeverity = SeverityComparator.getMaxSeverity(maxSeverity, info
					.getSeverity());
		}
		return maxSeverity;
	}

	public static Severity getMaxSeverity(DbContentChecks checks) {
		Severity maxSeverity = Severity.INFO;
		if (checks.getDbContentChecks() == null)
			return maxSeverity;
		for (DbContentCheck check : checks.getDbContentChecks())
			maxSeverity = SeverityComparator.getMaxSeverity(maxSeverity, check.getSeverity());
		return maxSeverity;
	}

	public static Severity getMaxSeverity(ServicesInfo servicesInfo) {
		return SeverityComparator.getMaxSeverity(servicesInfo.getSeverity(),
				SeverityComparator.getMaxSeverity(servicesInfo.getServices()));
	}

	public static Severity getMaxSeverity(SystemInfo systemInfo) {
		Severity maxSeverity = SeverityComparator.getMaxSeverity(systemInfo
				.getSeverity(), getMaxSeverity(systemInfo.getDiskInfos()));
		if (systemInfo.getMemoryInfo() != null)
			maxSeverity = SeverityComparator.getMaxSeverity(systemInfo
					.getMemoryInfo().getSeverity(), maxSeverity);
		return maxSeverity;
	}
/*
	private static Severity getMaxSeverity(List<DiskSpaceInfo> diskInfo) {
		Severity maxSeverity = Severity.INFO;
		for (Iterator<DiskSpaceInfo> iterator = diskInfo.iterator(); iterator
				.hasNext();) {
			DiskSpaceInfo diskInf = iterator.next();
			maxSeverity = SeverityComparator.getMaxSeverity(maxSeverity,
					diskInf.getSeverity());
		}
		return maxSeverity;
	}*/

	public static Severity getMaxSeverity(DbMonitoringInfos databaseInfos) {
		Severity maxSeverity = databaseInfos.getSeverity();
		for (DbMonitoringInfo dbInfo : databaseInfos.getDbInfos()) {
			Severity severity = Severity.INFO;
			severity = getMaxSeverity(dbInfo);
			maxSeverity = SeverityComparator.getMaxSeverity(maxSeverity,
					severity);
			if (maxSeverity == Severity.ERROR) {
				break;
			}
		}
		return maxSeverity;
	}

	public static Severity getMaxSeverity(DbMonitoringInfo dbInfo) {
		Severity maxSeverity = dbInfo.getAvailable().getSeverity();
		if (dbInfo.getDbFileSizes() != null)
			for (DbAvailableSizeInfo sizeInfo : dbInfo.getDbFileSizes())
				maxSeverity = SeverityComparator.getMaxSeverity(maxSeverity,
						sizeInfo.getSeverity());

		if (dbInfo.getDbContentChecks() != null)
			maxSeverity = SeverityComparator.getMaxSeverity(maxSeverity, dbInfo
					.getDbContentChecks().getSeverity());
		return maxSeverity;
	}

	public static Severity getMaxSeverity(SignaturesInfo info) {
		Severity maxSeverity = info.getSeverity();
		for (SignatureInfo signInfo : info.getSignatureInfos()) {
			Severity severity = getMaxSeverity(signInfo);
			maxSeverity = SeverityComparator.getMaxSeverity(severity,
					maxSeverity);
		}
		return maxSeverity;
	}

	public static Severity getMaxSeverity(HostMonitoringInfos hostInfo) {
		Severity maxSeverity = Severity.INFO;
		for (HostMonitoringInfo info : hostInfo.getHostInfos())
			maxSeverity = SeverityComparator.getMaxSeverity(info.getSeverity(),
					maxSeverity);
		return maxSeverity;
	}

	public static Severity getMaxSeverity(EventLogMonitoringInfos eventLogInfo) {
		Severity maxSeverity = Severity.INFO;
		for (EventLogMonitoringInfo info : eventLogInfo.getEventLogChecks())
			maxSeverity = SeverityComparator.getMaxSeverity(info.getSeverity(),
					maxSeverity);
		return maxSeverity;
	}

	public static Severity getMaxSeverity(SignatureInfo signInfo) {
		Severity maxSeverity = signInfo.getSeverity();
		for (CertificateInfo certInfo : signInfo.getCertificateInfos()) {
			maxSeverity = SeverityComparator.getMaxSeverity(certInfo
					.getSeverity(), maxSeverity);
		}
		return maxSeverity;
	}
    
    public static Severity getMaxSeverity(POP3MonitoringInfo pop3MonitoringInfo) {
        Severity maxSeverity = pop3MonitoringInfo.getSeverity();
        for (MailboxInfo mailboxInfo : pop3MonitoringInfo.getMailboxInfos()) {
            maxSeverity = SeverityComparator.getMaxSeverity(mailboxInfo.getSeverity(), maxSeverity);
        }
        return maxSeverity;
    }

	public static String getLocalizedSeverityName(Severity severity) {
		if (Severity.INFO.equals(severity)) {
			return "OK";
		}
		if (Severity.ERROR.equals(severity)) {
			return "Ошибка";
		}
		if (Severity.WARNING.equals(severity)) {
			return "Предупреждение";
		}
		return severity.toString();
	}
}
