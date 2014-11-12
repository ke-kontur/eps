package ru.acs.monitoring.app.client.pages;

import ru.acs.monitoring.app.monitoring.messproc.client.view.MessageProcessingStatView;

import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.layout.FillData;
import com.extjs.gxt.ui.client.widget.layout.FillLayout;
import com.google.gwt.user.client.Element;

/**
 *Страница показа стат. информации по обработке сообщений
 * @author fmv
 *
 */
public class MessageProcessingStatPage extends LayoutContainer {

	@Override
	protected void onRender(Element parent, int index) {
		super.onRender(parent, index);
		setLayout(new FillLayout());
		add(new MessageProcessingStatView(), new FillData(10));
	}

}
