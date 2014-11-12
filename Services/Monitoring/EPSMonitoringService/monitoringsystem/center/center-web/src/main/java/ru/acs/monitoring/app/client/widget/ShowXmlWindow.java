
package ru.acs.monitoring.app.client.widget;

import com.extjs.gxt.ui.client.Style.Scroll;
import com.extjs.gxt.ui.client.widget.HtmlContainer;
import com.extjs.gxt.ui.client.widget.Window;


public class ShowXmlWindow extends Window {

    private String xml;
    private String title="Информация";
    
    public ShowXmlWindow(String xml) {
        this.xml = xml;
        initUI();
    }
    public ShowXmlWindow(String title, String xml) {
        this.xml = xml;
        this.title = title;
        initUI();
    }
    private void initUI() {
        setSize(800, 600);
        setScrollMode(Scroll.AUTO);
        setPlain(true);
        setHeading(title);

        HtmlContainer html = new HtmlContainer(
        xml
        );

       // html.add(new Text(xml), "pre#xml");
        add(html);    
    }
}
