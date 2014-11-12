package ru.acs.monitoring.app.client.pages;

import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.layout.FitLayout;
import com.google.gwt.user.client.Element;
import ru.acs.monitoring.app.log.client.widget.LogPanel;

/**
 *
 * @author Алексей Селиванов
 */
public class LogPage extends LayoutContainer {

    public LogPage() {
        super(new FitLayout());
    }

    @Override protected void onRender(Element parent, int index) {
        super.onRender(parent, index);
        add(new LogPanel(25));
    }
}
