package ru.acs.monitoring;

import ru.acs.fts.dto.BaseDocType;
import ru.acs.fts.dto.soap.ApplicationInf;
import ru.acs.fts.dto.soap.RoutingInf;

/**
 * Контекст сообщения
 * @author fmv
 *
 */
public class MessageContext {
	ApplicationInf applicationInf;
	RoutingInf routingInf;
	BaseDocType doc;
		
	public ApplicationInf getApplicationInf() {
		return applicationInf;
	}
	public void setApplicationInf(ApplicationInf applicationInf) {
		this.applicationInf = applicationInf;
	}
	public RoutingInf getRoutingInf() {
		return routingInf;
	}
	public void setRoutingInf(RoutingInf routingInf) {
		this.routingInf = routingInf;
	}
	public BaseDocType getDoc() {
		return doc;
	}
	public void setDoc(BaseDocType doc) {
		this.doc = doc;
	}
}
