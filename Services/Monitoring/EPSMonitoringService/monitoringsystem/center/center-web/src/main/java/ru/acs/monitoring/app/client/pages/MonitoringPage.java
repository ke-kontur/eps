package ru.acs.monitoring.app.client.pages;

import com.extjs.gxt.ui.client.Style.Scroll;
import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.layout.BorderLayout;
import ru.acs.monitoring.app.monitoring.conn.client.widget.MonitoringPanel;

public class MonitoringPage extends LayoutContainer {

    public MonitoringPage() {
        setLayout(new BorderLayout());
        setScrollMode(Scroll.AUTO);
        add(new MonitoringPanel(30000L));
    }
}