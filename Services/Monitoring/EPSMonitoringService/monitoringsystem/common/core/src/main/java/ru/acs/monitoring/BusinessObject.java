package ru.acs.monitoring;


/**
 * Объект с контекстом - для обработки в БЛ
 * @author fmv
 *
 */
public class BusinessObject {
	MessageContext context;
	BusinessObject initialBo;

	public MessageContext getContext() {
		if (context==null){
			context=new MessageContext();
		}
		return context;
	}

	public void setContext(MessageContext context) {
		this.context = context;
	}

	public BusinessObject getInitialBo() {
		return initialBo;
	}

	public void setInitialBo(BusinessObject initialBo) {
		this.initialBo = initialBo;
	}
	
}
