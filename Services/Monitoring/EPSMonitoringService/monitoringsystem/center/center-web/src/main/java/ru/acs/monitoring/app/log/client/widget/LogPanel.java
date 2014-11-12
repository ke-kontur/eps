package ru.acs.monitoring.app.log.client.widget;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ru.acs.fts.webconsole.core.client.rpc.BaseAsyncCallback;
import ru.acs.fts.webconsole.core.client.ui.widget.MapComboBox;
import ru.acs.monitoring.app.client.view.MonitoringInfoHtmlView;
import ru.acs.monitoring.app.log.client.LogService;
import ru.acs.monitoring.app.log.client.LogServiceAsync;
import ru.acs.monitoring.app.log.client.model.LogFilter;
import ru.acs.monitoring.app.log.client.model.LogLevel;

import com.extjs.gxt.ui.client.Style.SortDir;
import com.extjs.gxt.ui.client.binding.FormBinding;
import com.extjs.gxt.ui.client.binding.SimpleComboBoxFieldBinding;
import com.extjs.gxt.ui.client.data.BasePagingLoader;
import com.extjs.gxt.ui.client.data.BeanModel;
import com.extjs.gxt.ui.client.data.BeanModelFactory;
import com.extjs.gxt.ui.client.data.BeanModelLookup;
import com.extjs.gxt.ui.client.data.Model;
import com.extjs.gxt.ui.client.data.ModelData;
import com.extjs.gxt.ui.client.data.PagingLoadConfig;
import com.extjs.gxt.ui.client.data.PagingLoadResult;
import com.extjs.gxt.ui.client.data.PagingLoader;
import com.extjs.gxt.ui.client.data.RpcProxy;
import com.extjs.gxt.ui.client.event.ButtonEvent;
import com.extjs.gxt.ui.client.event.Events;
import com.extjs.gxt.ui.client.event.GridEvent;
import com.extjs.gxt.ui.client.event.Listener;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.store.ListStore;
import com.extjs.gxt.ui.client.widget.ContentPanel;
import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.Text;
import com.extjs.gxt.ui.client.widget.WidgetComponent;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.extjs.gxt.ui.client.widget.form.DateField;
import com.extjs.gxt.ui.client.widget.form.FieldSet;
import com.extjs.gxt.ui.client.widget.form.FormPanel;
import com.extjs.gxt.ui.client.widget.grid.ColumnConfig;
import com.extjs.gxt.ui.client.widget.grid.ColumnData;
import com.extjs.gxt.ui.client.widget.grid.ColumnModel;
import com.extjs.gxt.ui.client.widget.grid.Grid;
import com.extjs.gxt.ui.client.widget.grid.GridCellRenderer;
import com.extjs.gxt.ui.client.widget.layout.FitLayout;
import com.extjs.gxt.ui.client.widget.layout.FlowData;
import com.extjs.gxt.ui.client.widget.layout.FlowLayout;
import com.extjs.gxt.ui.client.widget.layout.RowData;
import com.extjs.gxt.ui.client.widget.layout.RowLayout;
import com.extjs.gxt.ui.client.widget.layout.TableData;
import com.extjs.gxt.ui.client.widget.layout.TableLayout;
import com.extjs.gxt.ui.client.widget.layout.TableRowLayout;
import com.extjs.gxt.ui.client.widget.toolbar.PagingToolBar;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.AbstractImagePrototype;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.ImageBundle;
import com.google.gwt.user.client.ui.Widget;

public class LogPanel extends ContentPanel {

    /**
     * Элементов на страницу по умолчанию.
     */
    public static final int
    DEFAULT_ITEMS_PER_PAGE = 25;

    private static final LogLevelIcons
    LEVEL_ICONS = GWT.create(LogLevelIcons.class);

    private final int itemsPerPage;

    private PagingLoader loader;
    private LogServiceAsync service = null;
    private FormBinding bindings;
    private BeanModel filterModel;
    

    @SuppressWarnings("deprecation")
	public LogPanel(int itemsPerPage) {
        this.itemsPerPage = itemsPerPage;

        initLoader();
        initUI();
        
        LogFilter filter = new LogFilter();
        filter.setLevel(LogLevel.ALL);
        filter.setConnectionId(0L);
        Date toDate = new Date();
        toDate.setHours(0);
        toDate.setMinutes(0);
        toDate.setSeconds(0);
        toDate.setDate(toDate.getDate() + 1);
		filter.setUpdateDateTo(toDate);
		Date from = new Date();
		//from.setDate(from.getDate() - 1);
		from.setHours(0);
		from.setMinutes(0);
		from.setSeconds(0);
		filter.setUpdateDateFrom(from);
        setFilter(filter);
    }

    /**
     * Устанавливает фильтр записей протокола. Изменения отражаются в форме.
     * @param filter фильтр записей протокола.
     */
    public void setFilter(LogFilter filter) {
        BeanModelFactory
        factory = BeanModelLookup.get().getFactory(LogFilter.class);

        bindings.bind(filterModel = factory.createModel(filter));
    }

    /**
     * Возвращает текущий фильтр записей протокола.
     * @return фильтр записей.
     */
    public LogFilter getFilter() {
        return filterModel.getBean();
    }

    /**
     * Осуществляет загрузку данных с установленными фильтрами.
     *
     * @see #setFilter(LogFilter)
     */
    public void load() {
    loader.load(0, itemsPerPage);
    }

    private void initLoader() {
        service = GWT.create(LogService.class);

        RpcProxy<PagingLoadResult<ModelData>> proxy =
                new RpcProxy<PagingLoadResult<ModelData>>() {

            @Override
            protected void load(Object loadConfig,
                    AsyncCallback<PagingLoadResult<ModelData>> callback)
            {
                LogFilter filter = filterModel.getBean();
                service.getData((PagingLoadConfig) loadConfig, filter, callback);
            }
        };

        loader = new BasePagingLoader(proxy);
        loader.setRemoteSort(true);
    }

    //-----------------------------------------------------------------------

    private void initUI() {
        setHeaderVisible(false);
        setBodyBorder(false);
        setBorders(false);

        LayoutContainer filterForm = buildFilterForm();
        Grid grid = buildGrid();

        final PagingToolBar toolbarTop = new PagingToolBar(DEFAULT_ITEMS_PER_PAGE);
            toolbarTop.bind(loader);

        final PagingToolBar toolbarBottom = new PagingToolBar(DEFAULT_ITEMS_PER_PAGE);
            toolbarBottom.bind(loader);

        ContentPanel center = new ContentPanel();
        {
            center.setLayout(new FitLayout());
            center.setHeaderVisible(false);
            center.setBodyBorder(false);
            center.add(grid);
            center.setTopComponent(toolbarTop);
            center.setBottomComponent(toolbarBottom);
        }

        setLayout(new RowLayout());
        add(filterForm, new RowData(1, -1));
        add(center, new RowData(1, 1));
    }

    private LayoutContainer buildFilterForm() {
    // first line
        final MapComboBox<Long> connection = new MapComboBox();
        {
            connection.setName("connectionId");
            connection.setEditable(false);
            connection.setSimpleValue(0L);
            connection.setWidth(125);

            service.getConnectionOptions(new BaseAsyncCallback<Map<Long, String>>() {

                public void onSuccess(Map<Long, String> result) {
                    result.put(0L, "Все");
                    connection.setMap(result);
                    connection.setSimpleValue(0L);
                }
            });
        }

        final Map<LogLevel, String>
        levelMap = new HashMap<LogLevel, String>();

        for (LogLevel level : LogLevel.values())
            levelMap.put(level, level.description());

        final MapComboBox<LogLevel>
        level = new MapComboBox<LogLevel>(levelMap);
        {
            level.setName("logLevel");
            level.setWidth(270);
            level.setEditable(false);
            level.setMinListWidth(290);
        }

        LayoutContainer line1 = new LayoutContainer(new TableRowLayout());
        {
            line1.add(wrap(label("Подключение"), 0, 10, 0, 0), new TableData("80", null));
            line1.add(connection);
            line1.add(wrap(label("Уровень протокола"), 0, 0, 0, 10),
                    new TableData("135", null));
            line1.add(level);
        }

    // second line
        DateTimeFormat
        dateFormat = DateTimeFormat.getFormat("d.MM.yyyy HH:mm:ss");

        final DateField createdFrom = new DateField();
        {
            createdFrom.setName("updateDateFrom");
            createdFrom.setLabelSeparator(null);
            createdFrom.getPropertyEditor().setFormat(dateFormat);
            createdFrom.setWidth(150);
            createdFrom.setAllowBlank(false);
        }

        final DateField createdTo = new DateField();
        {
            createdTo.setName("updateDateTo");
            createdTo.setLabelSeparator(null);
            createdTo.getPropertyEditor().setFormat(dateFormat);
            createdTo.setWidth(150);
            createdTo.setAllowBlank(false);
        }

        LayoutContainer line2 = new LayoutContainer(new TableRowLayout());
        {
            line2.add(label("Период с"), new TableData("65", null));
            line2.add(createdFrom);
            line2.add(wrap(label("по"), 0, 10, 0, 10),
                    new TableData("20", null));
            line2.add(createdTo);
        }

    // Buttons line
        Button submit = new Button("Обновить",
                new SelectionListener<ButtonEvent>() {

            @Override public void componentSelected(ButtonEvent ce) { 
                load();
            }
        });

        Button reset = new Button("Сбросить",
                new SelectionListener<ButtonEvent>() {

            @Override public void componentSelected(ButtonEvent ce) {
                createdFrom.setValue(null);
                createdTo.setValue(null);
                level.setSimpleValue(LogLevel.ALL);
                connection.setSimpleValue(0L);
            }
        });

        LayoutContainer line3 = new LayoutContainer();
        {
            line3.setLayout(new TableRowLayout());
            line3.add(submit);

            LayoutContainer separator = new LayoutContainer();
            separator.setWidth(20);
            line3.add(separator);
            line3.add(reset);
        }

    // FormPanel itself
        FieldSet set = new FieldSet();
        {
            set.setLayout(new TableLayout(1));
            set.setHeading("Фильтры");
            set.add(line1);
            set.add(wrap(line2, 10, 0, 0, 0));
            set.add(wrap(line3, 10, 0, 0, 0));
        }

        FormPanel form = new FormPanel();
        {
            form.setLayout(new FlowLayout());
            form.setBorders(false);
            form.setHeaderVisible(false);
            form.setBodyBorder(false);
            form.add(set, new FlowData(10));
        }

        bindings = new FormBinding(form, true);
        {
            bindings.addFieldBinding(
                    new SimpleComboBoxFieldBinding(level, "level"));
            bindings.addFieldBinding(
                    new SimpleComboBoxFieldBinding(connection, "connectionId"));
        }

        return form;
    }

    private Grid buildGrid() {
    // Configuring columns
        List<ColumnConfig> columns = new ArrayList<ColumnConfig>();

        ColumnConfig level = new ColumnConfig("level", 30);
        {
            level.setSortable(true);
            level.setRenderer(new GridCellRenderer() {

                public Object render(ModelData model,
                        String property,
                        ColumnData config,
                        int rowIndex,
                        int colIndex,
                        ListStore store,
                        Grid grid)
                {
                    LogLevel level = model.get("level");

                    if (level == null) return "";

                    switch (level) {
                        case INFO: return LEVEL_ICONS.INFO().getHTML();
                        case WARNING: return LEVEL_ICONS.WARNING().getHTML();
                        case ERROR: return LEVEL_ICONS.ERROR().getHTML();
                    }
                    
                    return "";
                }
            });
        }
        columns.add(level);

        ColumnConfig connectionName = new ColumnConfig("connectionName", "Подключение", 120);
        {
            connectionName.setSortable(false);
        }
        columns.add(connectionName);

        ColumnConfig systemName = new ColumnConfig("systemName", "Название системы", 150);
        {
            systemName.setSortable(false);
        }
        columns.add(systemName);

        ColumnConfig systemId = new ColumnConfig("systemId", "Идентификатор", 100);
        {
            systemId.setSortable(false);
        }
        columns.add(systemId);

        ColumnConfig updateDate = new ColumnConfig("updateDate", "Дата", 120);
        {
            updateDate.setDateTimeFormat(
                DateTimeFormat.getFormat("dd.MM.yyyy HH:mm:ss"));
            updateDate.setSortable(false);
        }
        columns.add(updateDate);

        ColumnConfig error = new ColumnConfig("error", "Ошибка", 100);
        {
            error.setSortable(false);
            error.setMenuDisabled(true);
        }
        columns.add(error);

        ColumnConfig xml = new ColumnConfig(null, "Информация", 150);
        {
            xml.setRenderer(new GridCellRenderer() {

                public Object render(final ModelData model,
                        String property,
                        ColumnData config,
                        int rowIndex, int colIndex,
                        ListStore store,
                        Grid grid) {

                    Anchor anchor = new Anchor("Подробнее");
                    anchor.addClickHandler(new ClickHandler() {

                        public void onClick(ClickEvent event) {
                        	MonitoringInfoHtmlView dialog = new MonitoringInfoHtmlView();
                        	dialog.setMonInfoId(((Long) model.get("id")).toString());
                        	dialog.show();
                        }
                    });

                    return new WidgetComponent(anchor);
                }
            });
        }
        columns.add(xml);

        ListStore<Model> store = new ListStore<Model>(loader);
        Grid<Model> grid = new Grid<Model>(store, new ColumnModel(columns));

        grid.setBorders(false);
        grid.setLoadMask(true);
        grid.setAutoExpandColumn("error");
        grid.setAutoExpandMax(2000);
        grid.addListener(Events.Attach, new Listener<GridEvent<ModelData>>() {

            public void handleEvent(GridEvent<ModelData> be) {
                loader.setSortField("updateDate");
                loader.setSortDir(SortDir.DESC);
                load();
            }
        });

        return grid;
    }

    // hacks due to buggy GXT
    private Text label(String value) {
        Text text = new Text(value);
        text.setStyleAttribute("fontSize", "12px");
        return text;
    }
    private LayoutContainer wrap(Widget container,
            int top, int right, int bottom, int left)
    {
        LayoutContainer wrapper = new LayoutContainer();
        wrapper.add(container, new FlowData(top, right, bottom, left));
        return wrapper;
    }
}

interface LogLevelIcons extends ImageBundle {
    
    @Resource("level_info.png")
    AbstractImagePrototype INFO();

    @Resource("level_warning.png")
    AbstractImagePrototype WARNING();

    @Resource("level_error.png")
    AbstractImagePrototype ERROR();
}