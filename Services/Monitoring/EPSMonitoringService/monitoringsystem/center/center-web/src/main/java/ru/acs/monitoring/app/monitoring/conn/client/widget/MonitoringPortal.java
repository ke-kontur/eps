package ru.acs.monitoring.app.monitoring.conn.client.widget;

import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;

import ru.acs.fts.webconsole.core.client.rpc.BaseAsyncCallback;
import ru.acs.monitoring.app.monitoring.conn.client.MonitoringService;
import ru.acs.monitoring.app.monitoring.conn.client.MonitoringServiceAsync;
import ru.acs.monitoring.app.monitoring.conn.client.model.CommonInfo;

import com.extjs.gxt.ui.client.widget.ContentPanel;
import com.extjs.gxt.ui.client.widget.custom.Portal;
import com.extjs.gxt.ui.client.widget.custom.Portlet;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Element;

public class MonitoringPortal extends Portal {

    private MonitoringServiceAsync service;
    private int columns;

    private Map<Long, CommonInfoPortlet>
    portlets = new HashMap<Long, CommonInfoPortlet>();
    
    public MonitoringPortal(int columns) {
        super(columns);
        this.columns = columns;

        initService();
        initUI();
    }

    private void initService() {
    service = GWT.create(MonitoringService.class);
    }

    @Override
    protected void onRender(Element target, int index) {
        super.onRender(target, index);
        update();
    }


    public void update() {
        service.getActualInfo(new BaseAsyncCallback<List<CommonInfo>>() {

            public void onSuccess(List<CommonInfo> result) {


            // Отбрасываем те, у которых id == null
                ListIterator<CommonInfo> it = result.listIterator();
                while (it.hasNext())
                    if (it.next().getConnectionId() == null) it.remove();

            // Проходим по всем отображаемым портлетам
                for (Entry<Long, CommonInfoPortlet>
                        entry : portlets.entrySet()) {
                            
                    CommonInfo found = null;
                    
                    for (CommonInfo info : result) {
                        if (info.getConnectionId().equals(entry.getKey())) {
                            found = info;
                            break;
                        }
                    }

                    CommonInfoPortlet portlet = entry.getValue();

                    // Если не содержится в результате
                    if (found == null) {
                        portlets.remove(entry.getKey());
                        remove(portlet, getPortletColumn(portlet));
                    }
                    // Если содержится
                    else {
                        portlet.setCommonInfo(found);
                        result.remove(found); // Удаляем из результата
                    }
                }
                
            // Добавляем те, которые не отображаются
                int[] portletsInColumn = new int[columns];
                for (Portlet portlet : portlets.values())
                    portletsInColumn[getPortletColumn(portlet)]++;

                for (CommonInfo info : result) {
                    if (portlets.size() >= result.size()) break;

                    CommonInfoPortlet portlet = new CommonInfoPortlet(info);
                    configPanel(portlet);
                    portlets.put(info.getConnectionId(), portlet);


                    int minColumn = 0;
                    int min = portletsInColumn[minColumn];

                    for (int j = 0; j < columns; j++)
                        if (portletsInColumn[j] < min) {
                            min = portletsInColumn[j];
                            minColumn = j;
                        }
                    
                    add(portlet, minColumn);
                    portletsInColumn[minColumn]++;
                }
            }
        });
    }

    private void initUI() {
        setColumnWidth(0, 0.33);
        setColumnWidth(1, 0.33);
        setColumnWidth(2, 0.33);
    }
    
       private void configPanel(final ContentPanel panel) {  
    	      panel.setCollapsible(true);  
    	      panel.setAnimCollapse(false);  
    	      /*panel.getHeader().addTool(new ToolButton("x-tool-gear"));  
    	      panel.getHeader().addTool(  
    	          new ToolButton("x-tool-close", new SelectionListener<IconButtonEvent>() {  
    	    
    	            @Override  
    	            public void componentSelected(IconButtonEvent ce) {  
    	              panel.removeFromParent();  
    	            }  
    	    
    	          }));  */
    	    }  
}
