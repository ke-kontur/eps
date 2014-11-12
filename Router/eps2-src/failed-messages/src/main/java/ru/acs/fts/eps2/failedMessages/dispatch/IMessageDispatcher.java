package ru.acs.fts.eps2.failedMessages.dispatch;

import javax.jms.Message;

import ru.acs.fts.eps2.failedMessages.exceptions.MessageDispatchException;

public interface IMessageDispatcher
{
	void dispatch( Message message ) throws MessageDispatchException;
}
