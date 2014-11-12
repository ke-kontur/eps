package ru.acs.monitoring.app.client.view;

import com.extjs.gxt.ui.client.util.Format;
import com.extjs.gxt.ui.client.widget.Dialog;
import com.extjs.gxt.ui.client.widget.Window;
import com.extjs.gxt.ui.client.widget.layout.FitLayout;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.Frame;


public class MonitoringInfoHtmlView extends Window {

    public static final String DOCUMENT_ID_ATTR = "id";

    protected void createUI() {
        dialog = createDialog();
    }

    public MonitoringInfoHtmlView() {
		super();
		createUI();
	}

	protected Frame frame;

    private Dialog createDialog() {
        Dialog d = new Dialog();
        d.setWidth(850);
        d.setHeight(600);
        d.setLayout(new FitLayout());
        d.setButtons(Dialog.OK);
        d.setHideOnButtonClick(true);  
        frame = createFrame();        
        d.add(frame);
        d.setHeading("Просмотр информации");
        return d;
    }

    private Frame createFrame() {
        Frame fr = new Frame();
		return fr;
    }

    private Dialog dialog;

    public void show() {
    	dialog.show();
    	frame.setUrl(getUrl());
    }

    private String monInfoId;
    
    public void setMonInfoId(String monInfoId) {
        this.monInfoId = monInfoId;
        frame.setUrl(getUrl());
    }

    private static final String SERVICE_URL_PATTERN = "../moninfo.do";

    // сформировать строчку запроса для сервлета, который предоставит готовый документ
    public String getUrl() {
    	String param = DOCUMENT_ID_ATTR+"="+monInfoId;
        String url = Format.substitute("{0}?{1}",
                GWT.getModuleBaseURL() + SERVICE_URL_PATTERN, param);
        return url;
    }
}