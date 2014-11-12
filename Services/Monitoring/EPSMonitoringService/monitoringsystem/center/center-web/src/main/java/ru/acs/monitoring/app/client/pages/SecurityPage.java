package ru.acs.monitoring.app.client.pages;

import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.layout.FitLayout;
import com.google.gwt.user.client.Element;
import ru.acs.fts.webconsole.security.client.widget.SecurityPanel;

/**
 *
 * @author Алексей Селиванов
 */
public class SecurityPage extends LayoutContainer {

    public SecurityPage() {
        super(new FitLayout());
    }

    @Override protected void onRender(Element parent, int index) {
        super.onRender(parent, index);
        add(new SecurityPanel());
    }
}
