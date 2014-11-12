package ru.acs.monitoring.app.config.conn.client.widget;

import com.extjs.gxt.ui.client.Style.HorizontalAlignment;
import com.extjs.gxt.ui.client.data.BeanModel;
import com.extjs.gxt.ui.client.data.BeanModelFactory;
import com.extjs.gxt.ui.client.data.BeanModelLookup;
import com.extjs.gxt.ui.client.event.ButtonEvent;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.store.ListStore;
import com.extjs.gxt.ui.client.widget.ContentPanel;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.extjs.gxt.ui.client.widget.form.CheckBox;
import com.extjs.gxt.ui.client.widget.form.SimpleComboBox;
import com.extjs.gxt.ui.client.widget.form.TextField;
import com.extjs.gxt.ui.client.widget.grid.CellEditor;
import com.extjs.gxt.ui.client.widget.grid.CheckColumnConfig;
import com.extjs.gxt.ui.client.widget.grid.ColumnConfig;
import com.extjs.gxt.ui.client.widget.grid.ColumnModel;
import com.extjs.gxt.ui.client.widget.grid.EditorGrid;
import com.extjs.gxt.ui.client.widget.layout.FitLayout;
import com.extjs.gxt.ui.client.widget.toolbar.ToolBar;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ru.acs.fts.webconsole.core.client.rpc.BaseAsyncCallback;
import ru.acs.fts.webconsole.core.client.ui.widget.MapComboBox;
import ru.acs.fts.webconsole.core.client.ui.widget.SimpleComboCellEditor;
import ru.acs.monitoring.app.config.conn.client.ConnectionsService;
import ru.acs.monitoring.app.config.conn.client.ConnectionsServiceAsync;
import ru.acs.monitoring.app.config.conn.client.model.ConnectionModel;
import ru.acs.monitoring.app.config.conn.client.model.RequestType;
import ru.acs.monitoring.domain.Connection;

/**
 * Панель настроек подключений к локальным агентам.
 *
 * @author Алексей Селиванов
 * @see Connection
 */
public class ConnectionsPanel extends ContentPanel {

    private List<BeanModel> rollbackData;
    
    private ConnectionsServiceAsync service;
    private ListStore<BeanModel> store;

    private static BeanModelFactory factory;

    private EditorGrid<BeanModel> grid;

    public ConnectionsPanel() {
        initServices();
        initUI();

        factory = BeanModelLookup.get().getFactory(ConnectionModel.class);
        service.getConnections(new BaseAsyncCallback<List<ConnectionModel>>() {

            public void onSuccess(List<ConnectionModel> result) {
                store.add(factory.createModel(result));
                rollbackData = store.getModels();
            }
        });
    }

    private void initServices() {
    service = GWT.create(ConnectionsService.class);
    store = new ListStore<BeanModel>();
    }

    private void initUI() {
        setHeaderVisible(false);
        setFrame(true);
        setLayout(new FitLayout());

        add(grid = buildGrid());


        ToolBar toolbar = new ToolBar();
        {
            Button bAdd = new Button("Добавить", new SelectionListener<ButtonEvent>() {

                @Override public void componentSelected(ButtonEvent ce) {
                    grid.stopEditing();

                    ConnectionModel model = new ConnectionModel();
                    {
                        model.setName("");
                        model.setRequestAddress("");
                        model.setActive(false);
                        model.setDisplay(false);
                        model.setUseCache(false);
                        model.setRequestType(RequestType.WEB_SERVICE);
                    }

                    store.insert(factory.createModel(model), 0);

                    grid.startEditing(0, 0);
                }
            });
            toolbar.add(bAdd);
        }
        setTopComponent(toolbar);

        Button bSave = new Button("Сохранить",
                new SelectionListener<ButtonEvent>() {

            @Override public void componentSelected(ButtonEvent ce) {
            onSave();
            }
        });

        Button bCancel = new Button("Отменить",
                new SelectionListener<ButtonEvent>() {

            @Override public void componentSelected(ButtonEvent ce) {
            onRollback();
            }
        });

        setButtonAlign(HorizontalAlignment.LEFT);
        addButton(bSave);
        addButton(bCancel);
    }
    private EditorGrid<BeanModel> buildGrid() {
        List<ColumnConfig> columns = new ArrayList<ColumnConfig>();

        ColumnConfig cName =
                new ColumnConfig("name", "Название", 150);
        {
            TextField<String> field = new TextField<String>();
            cName.setEditor(new CellEditor(field));
        }
        columns.add(cName);
        
        ColumnConfig cRequestType =
                new ColumnConfig("requestType", "Тип", 70);
        {
            Map<RequestType, String> map = new HashMap<RequestType, String>();

            for (RequestType type : RequestType.values())
                map.put(type, type.title());
            
            final SimpleComboBox<RequestType>
            comboBox = new MapComboBox<RequestType>(map);
            comboBox.setEditable(false);

            cRequestType.setEditor(new SimpleComboCellEditor(comboBox));
        }
        columns.add(cRequestType);

        ColumnConfig cRequestAddress =
                new ColumnConfig("requestAddress", "Адрес запроса", 300);
        {
            TextField<String> field = new TextField<String>();
            cRequestAddress.setEditor(new CellEditor(field));
        }
        columns.add(cRequestAddress);

        CheckColumnConfig cDisplay =
                new CheckColumnConfig("display", "Отображать?", 80);
        {
            cDisplay.setEditor(new CellEditor(new CheckBox()));
        }
        columns.add(cDisplay);

        CheckColumnConfig cActive =
                new CheckColumnConfig("active", "Активно?", 70);
        {
            cActive.setEditor(new CellEditor(new CheckBox()));
        }
        columns.add(cActive);
        
        CheckColumnConfig cUseCache =
            new CheckColumnConfig("useCache", "Использовать кэшированные данные?", 200);
	    {
	    	cUseCache.setEditor(new CellEditor(new CheckBox()));
	    }
	    columns.add(cUseCache);
        
        ColumnModel columnModel = new ColumnModel(columns);


        EditorGrid<BeanModel>
        grid = new EditorGrid<BeanModel>(store, columnModel);
        {
            grid.setBorders(true);

            grid.addPlugin(cDisplay);
            grid.addPlugin(cActive);
            grid.addPlugin(cUseCache);
        }
        return grid;
    }

// hooks

    private void onSave() {
        Collection<ConnectionModel> models = new ArrayList<ConnectionModel>();
        
        for (BeanModel beanModel : store.getModels()) {
            ConnectionModel model = beanModel.getBean();

            if (!model.isValid()) {
                Window.alert("Исправьте ошибки.");
                return;
            }
            
            models.add(model);
        }

        service.replaceConnections(models, new BaseAsyncCallback<Boolean>() {

            public void onSuccess(Boolean saved) {
                if (saved) {
                    Window.alert("Настройки успешно сохранены.");
                    rollbackData = store.getModels();
                    store.commitChanges();
                } else
                    Window.alert("Не удалось сохранить данные.");
            }
        });
    }

    private void onRollback() {
        grid.stopEditing();

        store.removeAll();
        store.add(rollbackData);
    }
}
