package ru.acs.monitoring.app.monitoring.conn.client.widget;

import ru.acs.fts.webconsole.monitoring.common.client.data.State;
import ru.acs.fts.webconsole.monitoring.common.client.widget.StateIcons;
import ru.acs.fts.webconsole.monitoring.common.client.widget.StateTable;
import ru.acs.monitoring.app.client.view.MonitoringInfoHtmlView;
import ru.acs.monitoring.app.monitoring.conn.client.model.CommonInfo;
import ru.acs.monitoring.app.monitoring.conn.client.model.StateInfo;

import com.extjs.gxt.ui.client.data.BaseModelData;
import com.extjs.gxt.ui.client.data.ModelData;
import com.extjs.gxt.ui.client.event.ButtonEvent;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.store.ListStore;
import com.extjs.gxt.ui.client.widget.Html;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.extjs.gxt.ui.client.widget.custom.Portlet;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.Widget;

/**
 * Портлет, отображающий общую информацию о состоянии ресурса.
 *
 * @author Алексей Селиванов
 */
public class CommonInfoPortlet extends Portlet {

    private static StateIcons ICONS = GWT.create(StateIcons.class);

    private CommonInfo info;

    public CommonInfoPortlet(CommonInfo info) {
        super(); // !!!
        
        setWidth(300);

        this.info = info;
        setCommonInfo(info);
    }

    private void addModel(ListStore<ModelData> properties, String name, StateInfo stateInfo) {
    	if (stateInfo == null || State.NORMAL.equals(stateInfo.getState()))
    		return;    	
    	addModelNoCheck(properties, name, stateInfo);
    }
    
    private void addModelNoCheck(ListStore<ModelData> properties, String name, StateInfo stateInfo) {    	
    	ModelData db = new BaseModelData();
		{
			db.set("name", name);
			db.set("state", stateInfo.getState());
		}
		add(getItemText(stateInfo, name));			
		properties.add(db);
    }
    
    public void setCommonInfo(final CommonInfo info) {
    // Clear from old data
        removeAll(true);

        setHeading("<big class=\""+info.getState().getState()+"_List"+"\">"+"&#9679;</big>"+info.getName());
     
        ListStore<ModelData> properties = new ListStore<ModelData>();

        addModel(properties, "Хосты", info.getHostsState());        
		addModel(properties, "База данных", info.getDbState());		
		addModel(properties, "Менеджер очередей", info.getMqState());		
		addModel(properties, "Сервисы", info.getServicesState());
		addModel(properties, "Системные журналы", info.getEventLogState());
		addModel(properties, "Обработка сообщений", info.getMessageProcessingState());
		addModel(properties, "Системные ресурсы", info.getSystemState());
		addModel(properties, "ЭЦП", info.getSignState());
		
		if (info.getState().getState().equals(State.NORMAL))
			addModelNoCheck(properties, "Предупреждений нет", new StateInfo(State.NORMAL));

		/*for (ShortErrorInfo err : info.getErrors())
			if (err.getCategory().equals(ErrorCategory.SignatureErrors)
					|| err.getCategory().equals(
							ErrorCategory.MessageProcessingErrors))
				add(getErrorText(err.getErrorName(), err.getErrorCount()));*/

        
       if (properties.getCount() > 0) {
            //CommonInfoStateTable table = new CommonInfoStateTable(properties);
            //add(table);
        }

        add(new Button("Информация", new SelectionListener<ButtonEvent>() {

            @Override
            public void componentSelected(ButtonEvent ce) {
            	MonitoringInfoHtmlView dialog = new MonitoringInfoHtmlView();
            	dialog.setMonInfoId(info.getMonitoringInfId().toString());
            	dialog.show();
            }
        }));
        
        layout();
    }

	private Widget getItemText(StateInfo stateInfo,String name) {
		Html text = new Html();
		if (stateInfo.isStateChanged())
			text.setHtml("<big class=\""+stateInfo.getState()+"_List"+"\" style=\"font-weight: bold\">&#35;</big>"+name);
		else
			text.setHtml("<big class=\""+stateInfo.getState()+"_List"+"\">"+"&#9679;</big>"+name);
		text.setStyleAttribute("font-size", "12px");
		return text;
	}
	
	private Widget getErrorText(String name, int count) {
		Html text = new Html();
		text.setHtml(name + " - " + count);
		text.setStyleAttribute("font-size", "12px");
		return text;
	}

    public CommonInfo getCommonInfo() {
        return info;
    }
}
class CommonInfoStateTable extends StateTable<ModelData> {

    public CommonInfoStateTable(ListStore<ModelData> store)  {
    super(store, new String[] {"name", "state"});
    setAutoExpandColumn("name");
    }
}
