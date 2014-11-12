package ru.acs.monitoring.notification;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.mail.MessagingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.InputStreamSource;
import org.springframework.mail.SimpleMailMessage;

import ru.acs.fts.dto.monitoring.MonitoringAttribute;
import ru.acs.fts.dto.monitoring.MonitoringInfo;
import ru.acs.fts.dto.monitoring.Severity;
import ru.acs.monitoring.MonitoringRuntimeException;
import ru.acs.monitoring.common.mail.AttachmentInfo;
import ru.acs.monitoring.common.mail.MailEngine;
import ru.acs.monitoring.common.mail.MailMonitoringInfo;
import ru.acs.monitoring.common.mail.MailMonitoringInfo.State;
import ru.acs.monitoring.common.utils.MonitoringInfoStringSerializer;
import ru.acs.monitoring.common.utils.SeverityComparator;
import ru.acs.monitoring.common.utils.SeverityUtils;
import ru.acs.monitoring.common.utils.XsltUtils;
import ru.acs.monitoring.domain.CommonSettings;
import ru.acs.monitoring.domain.MonitoringInfoWrapper;

/**
 * Уведомитель мониторинга через SMTP
 * 
 * @author fmv
 * 
 */
public class MailNotifier extends AbstractNotifier {
	final static Logger log = LoggerFactory.getLogger(MailNotifier.class);
	MailEngine mailEngine;
	Severity lastSendedSeverity = null;
	CommonSettings settings;
	MonitoringInfoStringSerializer infoSerializer;
	XsltUtils xsltUtil;

	/**
	 * Объект с параметрами кому и от кого
	 */
	protected SimpleMailMessage message = null;

	/**
	 * Имя шаблона письма
	 */
	protected String templateName = null;

	public MailNotifier() {
		super();
		setSendSeverity(Severity.WARNING);
		infoSerializer = new MonitoringInfoStringSerializer();
		xsltUtil = new XsltUtils();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ru.acs.monitoring.notification.Notifier#notify(ru.acs.fts.dto.monitoring
	 * .MonitoringInfo)
	 */
	public void notify(MonitoringInfoWrapper info) {
		List<MonitoringInfoWrapper> infos = new ArrayList<MonitoringInfoWrapper>();
		infos.add(info);
		notify(infos);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void notify(List<MonitoringInfoWrapper> infos) {
		log.info("Отправка уведомления по эл. почте на адрес(а) '" + arrayToStr(message.getTo()) + "'");
		List<AttachmentInfo> attachments = new ArrayList<AttachmentInfo>();
		List<MailMonitoringInfo> mailMiList = new ArrayList<MailMonitoringInfo>();
		int count = 1;
		Severity severity = Severity.INFO;
		for (MonitoringInfoWrapper data : infos) {
			severity = SeverityComparator.getMaxSeverity(severity, data.getInfo().getSeverity());
			MailMonitoringInfo mailMi = createMailMonInf(count, data);
			mailMiList.add(mailMi);
			attachments.add(createAttachment(mailMi.getZipName(), data.getInfo()));
			++count;
		}
		setSubject(severity);

		try {
			mailEngine.sendMessage(message.getTo(), message.getFrom(), templateName, createModel(mailMiList), message
					.getSubject(), attachments);
		} catch (MessagingException e) {
			log.error("Ошибка при отправке по SMTP: " + e.getMessage(), e);
		}

	}

	private AttachmentInfo createAttachment(String zipName, MonitoringInfo info) {
		String msg = infoSerializer.serialize(info);
		byte[] byteMess;
		try {
			byteMess = msg.getBytes("UTF-8");
		} catch (UnsupportedEncodingException e) {
			throw new MonitoringRuntimeException("Ошибка преобразования строк: кодировка UTF-8 не поддерживается.",
					e);
		}
		InputStreamSource is = new ByteArrayResource(xsltUtil.transformMonitoringInfo(byteMess));
		String attachmentName = "MonitoringInfo.html";
		AttachmentInfo attachment = new AttachmentInfo(attachmentName, is, "text/html; charset=UTF-8");
		List<AttachmentInfo> attachmentsHtml = new ArrayList<AttachmentInfo>();
		attachmentsHtml.add(attachment);

		InputStreamSource isZip = new ByteArrayResource(createZip(attachmentsHtml));
		return new AttachmentInfo(zipName, isZip, "application/zip");

	}

	protected Map createModel(List<MailMonitoringInfo> mailMiList) {
		Map model = new HashMap();
		model.put("miList", mailMiList);
		SimpleDateFormat df = new SimpleDateFormat();
		model.put("time", df.format(new Date()));
		return model;
	}

	private void setSubject(Severity severity) {
		String subject = "Мониторинг";
		if (settings != null && settings.getSystemName() != null)
			subject = subject + " '" + settings.getSystemName() + " (" + settings.getSystemId() + ")'";
		subject = subject + " - " + SeverityUtils.getLocalizedSeverityName(severity);
		message.setSubject(subject);
	}
	
	private String getStringSeverity(MonitoringAttribute attribute) {
		if (attribute == null)
			return MailMonitoringInfo.VALUE_NOT_SET;
		return severityToString(attribute.getSeverity());
	}
	
	private <T extends MonitoringAttribute> String getStringSeverity(List<T> attributes) {
		if (attributes == null)
			return MailMonitoringInfo.VALUE_NOT_SET;
		Severity severity =  SeverityUtils.getMaxSeverity(attributes);
		return severityToString(severity);		
	}
	
	private String severityToString(Severity severity) {
		if (severity == null || severity.equals(Severity.INFO))
			return MailMonitoringInfo.VALUE_NOT_SET;
		else
			return severity.toString();
	}

	protected MailMonitoringInfo createMailMonInf(int count, MonitoringInfoWrapper wrapper) {
		MonitoringInfo info = wrapper.getInfo();
		MonitoringInfo prev = wrapper.getPreviousInfo();
		MailMonitoringInfo mailMi = new MailMonitoringInfo(info.getSeverity().toString(), info.getSystemName(), info
				.getSystemId(), "" + count + ".zip");
				
		mailMi.setDbState(getState(info.getDatabaseInfos(), prev!=null?prev.getDatabaseInfos():null));
		mailMi.setMqState(getState(info.getMqMonitoringInfo(), prev!=null?prev.getMqMonitoringInfo():null));
		mailMi.setServicesState(getState(info.getSytemServicesInfo(), prev!=null?prev.getSytemServicesInfo():null));
		
		mailMi.setHostState(getState(info.getHostInfos(), prev!=null?prev.getHostInfos():null));
		mailMi.setSystemState(getState(info.getSystemInfo(), prev!=null?prev.getSystemInfo():null));
		mailMi.setEventLogState(getState(info.getEventLogInfos(), prev!=null?prev.getEventLogInfos():null));
		mailMi.setMpState(getState(info.getMessagesProcessingInfos(), prev!=null?prev.getMessagesProcessingInfos():null));
		
		if (info.getSignaturesInfo() != null) {
			String severity = severityToString(SeverityUtils.getMaxSeverity(info.getSignaturesInfo()));
			boolean equals = NotifierUtils.areAtributesEquals(info.getSignaturesInfo(), prev!=null?prev.getSignaturesInfo():null);
			mailMi.setSignState(new State(severity, !equals));
		}
		else
			mailMi.setSignState(new State(severityToString(Severity.INFO), false));
		return mailMi;
	}
	
	private State getState(MonitoringAttribute newOne, MonitoringAttribute oldOne) {
		return new State(getStringSeverity(newOne), !NotifierUtils.areAtributesEquals(newOne, oldOne));
	}
	
	private <T extends MonitoringAttribute> State getState(List<T> newOne, List<T> oldOne) {
		return new State(getStringSeverity(newOne), !NotifierUtils.areAtributesEquals(newOne, oldOne));
	}

	public byte[] createZip(List<AttachmentInfo> inputs) {
		// Create a buffer for reading the files
		byte[] buf = new byte[1024];
		ByteArrayOutputStream zip = new ByteArrayOutputStream();
		try {

			ZipOutputStream out = new ZipOutputStream(zip);

			// Compress the files
			for (AttachmentInfo attach : inputs) {
				InputStream in = attach.getInStreamSource().getInputStream();
				// Add ZIP entry to output stream.
				out.putNextEntry(new ZipEntry(attach.getAttachmentName()));

				// Transfer bytes from the file to the ZIP file
				int len;
				while ((len = in.read(buf)) > 0) {
					out.write(buf, 0, len);
				}

				// Complete the entry
				out.closeEntry();
				in.close();
			}

			// Complete the ZIP file
			out.close();
		} catch (IOException e) {
		}
		return zip.toByteArray();
	}

	private String arrayToStr(String[] to) {
		if (to == null) {
			return "";
		}
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < to.length; i++) {
			builder.append(to[i] + ";");
		}
		return builder.toString();
	}

	public MailEngine getMailEngine() {
		return mailEngine;
	}

	@Required
	public void setMailEngine(MailEngine mailEngine) {
		this.mailEngine = mailEngine;
	}

	public SimpleMailMessage getMessage() {
		return message;
	}

	@Required
	public void setMessage(SimpleMailMessage message) {
		this.message = message;
	}

	public String getTemplateName() {
		return templateName;
	}

	@Required
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	public String getNotifierName() {
		return "Уведомитель по эл. почте";
	}

	@Autowired
	public void setSettings(CommonSettings settings) {
		this.settings = settings;
	}
}
