package ru.acs.monitoring.common.mail;

import org.springframework.core.io.InputStreamSource;

public class AttachmentInfo {
	String attachmentName;
	InputStreamSource inStreamSource;
	String contentType;
	
	public AttachmentInfo(String attachmentName, InputStreamSource inStreamSource, String contentType) {
		super();
		this.attachmentName = attachmentName;
		this.inStreamSource = inStreamSource;
		this.contentType = contentType;
	}

	public String getAttachmentName() {
		return attachmentName;
	}
	public void setAttachmentName(String attachmentName) {
		this.attachmentName = attachmentName;
	}
	public InputStreamSource getInStreamSource() {
		return inStreamSource;
	}
	public void setInStreamSource(InputStreamSource inStreamSource) {
		this.inStreamSource = inStreamSource;
	}
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
}
