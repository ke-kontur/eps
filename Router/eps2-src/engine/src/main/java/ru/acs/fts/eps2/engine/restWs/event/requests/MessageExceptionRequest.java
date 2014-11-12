package ru.acs.fts.eps2.engine.restWs.event.requests;

import ru.acs.fts.eps2.engine.restWs.event.serviceModel.MessageExceptionRecord;

public class MessageExceptionRequest extends Request
{
	private MessageExceptionRecord messageExceptionRecord;

	// @formatter:off
	public void setMessageExceptionRecord( MessageExceptionRecord messageExceptionRecord ) { this.messageExceptionRecord = messageExceptionRecord; }
	public MessageExceptionRecord getMessageExceptionRecord( ) { return messageExceptionRecord; }
	// @formatter:on
}
