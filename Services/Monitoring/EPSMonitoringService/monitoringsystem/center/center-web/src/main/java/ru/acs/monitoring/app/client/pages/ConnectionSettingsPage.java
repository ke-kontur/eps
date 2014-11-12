package ru.acs.monitoring.app.client.pages;

import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.layout.FitData;
import com.extjs.gxt.ui.client.widget.layout.FitLayout;
import ru.acs.monitoring.app.config.conn.client.widget.ConnectionsPanel;

public class ConnectionSettingsPage extends LayoutContainer {

    public ConnectionSettingsPage() {
        setLayout(new FitLayout());

        add(new ConnectionsPanel(), new FitData(10));
    }
}
