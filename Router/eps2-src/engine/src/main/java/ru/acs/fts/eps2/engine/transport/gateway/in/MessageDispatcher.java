package ru.acs.fts.eps2.engine.transport.gateway.in;

import javax.jms.Message;

public interface MessageDispatcher // NO_UCD (use default)
{
	void dispatch( Message message ) throws Exception;
}
