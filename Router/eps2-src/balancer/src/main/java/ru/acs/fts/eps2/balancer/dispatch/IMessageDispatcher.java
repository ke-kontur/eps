package ru.acs.fts.eps2.balancer.dispatch;

import javax.jms.Message;

import ru.acs.fts.eps2.balancer.exceptions.MessageDispatchException;

public interface IMessageDispatcher
{
	void dispatch( Message message ) throws MessageDispatchException;
	void discard( Message message ) throws MessageDispatchException;
}
