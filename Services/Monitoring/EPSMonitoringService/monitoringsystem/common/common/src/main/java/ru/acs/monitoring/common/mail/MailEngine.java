package ru.acs.monitoring.common.mail;

import java.util.List;
import java.util.Map;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.exception.VelocityException;
import org.springframework.core.io.InputStreamSource;
import org.springframework.mail.MailException;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.ui.velocity.VelocityEngineUtils;

/**
 * Класс для отправки сообщений по почте
 * 
 * @author fmv
 * 
 */
public class MailEngine {
	protected static final Log log = LogFactory.getLog(MailEngine.class);

	private MailSender mailSender;

	private VelocityEngine velocityEngine;

	/**
	 * Send a simple message based on a Velocity template.
	 * 
	 * @param msg
	 * @param templateName
	 * @param model
	 */
	@SuppressWarnings("unchecked")
	public void sendMessage(SimpleMailMessage msg, String templateName, Map model) {
		String result = buldContent(templateName, model);

		msg.setText(result);
		send(msg);
	}

	private String buldContent(String templateName, Map model) {
		String result = null;

		try {
			result = VelocityEngineUtils.mergeTemplateIntoString(velocityEngine, templateName, model);
		} catch (VelocityException e) {
			log.error("Ошибка формирования текста email сообщения: " + e.getMessage(), e);
		}
		return result;
	}

	/**
	 * Send a simple message with pre-populated values.
	 * 
	 * @param msg
	 */
	public void send(SimpleMailMessage msg) {
		try {
			mailSender.send(msg);
		} catch (MailException ex) {
			// log it and go on
			log.error(ex.getMessage());
		}
	}

	/**
	 * Convenience method for sending messages with attachments.
	 * 
	 * @param emailAddresses
	 * @param resource
	 * @param bodyText
	 * @param subject
	 * @param attachmentName
	 * @throws MessagingException
	 * @author Ben Gill
	 */
	public void sendMessage(String[] emailAddresses, String bodyText, String subject, String attachmentName,
			InputStreamSource inStreamSource, String contentType) throws MessagingException {
		MimeMessage message = ((JavaMailSenderImpl) mailSender).createMimeMessage();

		// use the true flag to indicate you need a multipart message
		MimeMessageHelper helper = new MimeMessageHelper(message, true);

		helper.setTo(emailAddresses);
		helper.setText(bodyText);
		helper.setSubject(subject);

		helper.addAttachment(attachmentName, inStreamSource, contentType);

		((JavaMailSenderImpl) mailSender).send(message);
	}

	@SuppressWarnings("unchecked")
	public void sendMessage(String[] emailAddresses, String from,String templateName, Map model, String subject,
			List<AttachmentInfo> attachments) throws MessagingException {
		MimeMessage message = ((JavaMailSenderImpl) mailSender).createMimeMessage();

		// use the true flag to indicate you need a multipart message
		MimeMessageHelper helper = new MimeMessageHelper(message, true,"UTF-8");

		helper.setTo(emailAddresses);
		helper.setFrom(from);
		helper.setText(buldContent(templateName, model),true);
		helper.setSubject(subject);

		for (AttachmentInfo attachmentInfo : attachments) {
			helper.addAttachment(attachmentInfo.getAttachmentName(), attachmentInfo.getInStreamSource(), attachmentInfo
					.getContentType());
		}

		((JavaMailSenderImpl) mailSender).send(message);
	}

	public void setMailSender(MailSender mailSender) {
		this.mailSender = mailSender;
	}

	public void setVelocityEngine(VelocityEngine velocityEngine) {
		this.velocityEngine = velocityEngine;
	}

	public MailSender getMailSender() {
		return mailSender;
	}

}
