package ru.acs.monitoring.app.monitoring.messproc.client.panels;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ru.acs.monitoring.app.config.conn.client.ConnectionsService;
import ru.acs.monitoring.app.config.conn.client.ConnectionsServiceAsync;
import ru.acs.monitoring.app.config.conn.client.model.ConnectionModel;
import ru.acs.monitoring.app.monitoring.messproc.domain.MessageProcessingFilter;
import ru.acs.monitoring.app.monitoring.messproc.domain.NamedObject;
import ru.acs.monitoring.app.monitoring.messproc.server.MessageProccessingService;
import ru.acs.monitoring.app.monitoring.messproc.server.MessageProccessingServiceAsync;

import com.extjs.gxt.ui.client.binding.FormBinding;
import com.extjs.gxt.ui.client.data.BaseListLoader;
import com.extjs.gxt.ui.client.data.BeanModel;
import com.extjs.gxt.ui.client.data.BeanModelFactory;
import com.extjs.gxt.ui.client.data.BeanModelLookup;
import com.extjs.gxt.ui.client.data.BeanModelReader;
import com.extjs.gxt.ui.client.data.ListLoadResult;
import com.extjs.gxt.ui.client.data.ListLoader;
import com.extjs.gxt.ui.client.data.LoadEvent;
import com.extjs.gxt.ui.client.data.ModelData;
import com.extjs.gxt.ui.client.data.RpcProxy;
import com.extjs.gxt.ui.client.event.BaseEvent;
import com.extjs.gxt.ui.client.event.ButtonEvent;
import com.extjs.gxt.ui.client.event.EventType;
import com.extjs.gxt.ui.client.event.Events;
import com.extjs.gxt.ui.client.event.Listener;
import com.extjs.gxt.ui.client.event.LoadListener;
import com.extjs.gxt.ui.client.event.SelectionChangedEvent;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.store.ListStore;
import com.extjs.gxt.ui.client.widget.ContentPanel;
import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.Text;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.extjs.gxt.ui.client.widget.form.ComboBox;
import com.extjs.gxt.ui.client.widget.form.DateField;
import com.extjs.gxt.ui.client.widget.form.FieldSet;
import com.extjs.gxt.ui.client.widget.form.FormPanel;
import com.extjs.gxt.ui.client.widget.form.ComboBox.TriggerAction;
import com.extjs.gxt.ui.client.widget.layout.FlowData;
import com.extjs.gxt.ui.client.widget.layout.FlowLayout;
import com.extjs.gxt.ui.client.widget.layout.TableData;
import com.extjs.gxt.ui.client.widget.layout.TableLayout;
import com.extjs.gxt.ui.client.widget.layout.TableRowLayout;
import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Widget;

/**
 * Панель для выбора параметров филрации для статистики
 * 
 * @author fmv
 * 
 */
public class FilterPanel extends ContentPanel {
	public static final EventType SetFilterEvent = new EventType();

	private ConnectionsServiceAsync connService;
	private ListStore<BeanModel> connectionsStore;
	private ListStore<BeanModel> mpSystemStore;
	private ComboBox<BeanModel> connectionCb;
	private MessageProccessingServiceAsync mpSystemService;
	private ListLoader<ListLoadResult<ModelData>> mpSystemLoader;

	private ComboBox<BeanModel> mpSystemCb;
	private BeanModel filterModel;
	private FormBinding bindings;

	private ListLoader<ListLoadResult<ModelData>> connLoader;

	private Button submit;

	public FilterPanel() {
		super();
		setUpServices();
		createUI();
		setFilter();
		loadFilterData();
	}

	@SuppressWarnings("deprecation")
	private void setFilter() {
		MessageProcessingFilter filter = new MessageProcessingFilter();
		filter.setCreatedTo(new Date());
		Date from = new Date();
		from.setDate(from.getDate() - 7);
		filter.setCreatedFrom(from);
		setFilter(filter);
	}

	private void loadFilterData() {
		connLoader.load();
	}

	private void setUpServices() {
		connService = GWT.create(ConnectionsService.class);
		mpSystemService = (MessageProccessingServiceAsync) GWT.create(MessageProccessingService.class);

		RpcProxy<List<ConnectionModel>> connProxy = new RpcProxy<List<ConnectionModel>>() {
			@Override
			protected void load(Object loadConfig, AsyncCallback<List<ConnectionModel>> callback) {
				connService.getConnections(callback);
			}
		};
		BeanModelReader reader = new BeanModelReader();
		connLoader = new BaseListLoader<ListLoadResult<ModelData>>(connProxy, reader);
		connectionsStore = new ListStore<BeanModel>(connLoader);
		connectionsStore.setMonitorChanges(true);

		RpcProxy<List<NamedObject>> mpSystemProxy = new RpcProxy<List<NamedObject>>() {
			@Override
			protected void load(Object loadConfig, AsyncCallback<List<NamedObject>> callback) {
				if (connectionCb.getSelection() != null && connectionCb.getSelection().size() > 0) {
					mpSystemService.getMPSystem((ConnectionModel) connectionCb.getSelection().get(0).getBean(),
							callback);
				}
			}
		};
		BeanModelReader mpSystemReader = new BeanModelReader();
		mpSystemLoader = new BaseListLoader<ListLoadResult<ModelData>>(mpSystemProxy, mpSystemReader);
		mpSystemLoader.addLoadListener(new LoadListener() {
			public void loaderBeforeLoad(LoadEvent le) {
				mpSystemCb.setSelection(new ArrayList<BeanModel>());
			}

			@Override
			public void loaderLoad(LoadEvent le) {
				super.loaderLoad(le);
				// mpSystemCb.setEnabled(true);

			}

		}

		);

		mpSystemStore = new ListStore<BeanModel>(mpSystemLoader);
	}

	public MessageProcessingFilter getFilter() {
		MessageProcessingFilter filter = filterModel.getBean();
		if (connectionCb.getSelection() != null && connectionCb.getSelection().size() > 0) {
			filter.setConnection((ConnectionModel) connectionCb.getSelection().get(0).getBean());
		}
		if (mpSystemCb.getSelection() != null && mpSystemCb.getSelection().size() > 0) {
			filter.setMpSystem((NamedObject) mpSystemCb.getSelection().get(0).getBean());
		}
		return filter;
	}

	private void createUI() {
		setHeaderVisible(false);
		setBorders(false);
		DateTimeFormat dateFormat = DateTimeFormat.getFormat("d.MM.yyyy");
		Listener<BaseEvent> listener = new Listener<BaseEvent>() {
			public void handleEvent(BaseEvent be) {
				submit.setEnabled(checkFilter());
			};
		};
		final DateField createdFrom = new DateField();
		{
			createdFrom.setName("createdFrom");
			createdFrom.setLabelSeparator(null);
			createdFrom.getPropertyEditor().setFormat(dateFormat);
			createdFrom.setWidth(150);
			createdFrom.setAllowBlank(false);
			createdFrom.addListener(Events.OnKeyPress, listener);
			createdFrom.addListener(Events.OnClick, listener);
			createdFrom.addListener(Events.Valid, listener);
		}

		final DateField createdTo = new DateField();
		{
			createdTo.setName("createdTo");
			createdTo.setLabelSeparator(null);
			createdTo.getPropertyEditor().setFormat(dateFormat);
			createdTo.setWidth(150);
			createdTo.setAllowBlank(false);
			createdTo.addListener(Events.OnKeyPress, listener);
			createdTo.addListener(Events.OnClick, listener);
			createdTo.addListener(Events.Valid, listener);
		}

		LayoutContainer line1 = new LayoutContainer(new TableRowLayout());
		{
			line1.add(label("Период с"), new TableData("65", null));
			line1.add(createdFrom);
			line1.add(wrap(label("по"), 0, 10, 0, 20), new TableData("20", null));
			line1.add(createdTo);
		}

		connectionCb = new ComboBox<BeanModel>();
		{
			connectionCb.setName("connection");
			connectionCb.setFieldLabel("Подключение");
			connectionCb.setDisplayField("name");
			connectionCb.setTriggerAction(TriggerAction.ALL);
			connectionCb.setWidth(270);
			connectionCb.setEditable(false);
			connectionCb.setAllowBlank(false);
			connectionCb.setEditable(false);
			connectionCb.setMinListWidth(290);
			connectionCb.setStore(connectionsStore);
			connectionCb.setEmptyText("Не выбран");
			connectionCb.addListener(Events.SelectionChange, listener);
		}
		connectionCb.addListener(Events.SelectionChange, new Listener<SelectionChangedEvent<BeanModel>>() {
			public void handleEvent(SelectionChangedEvent<BeanModel> be) {
				reloadMPSystemData();
			}
		});

		mpSystemCb = new ComboBox<BeanModel>();
		{
			mpSystemCb.setName("mpSystem");
			mpSystemCb.setFieldLabel("Компонент");
			mpSystemCb.setDisplayField("name");
			mpSystemCb.setTriggerAction(TriggerAction.ALL);

			mpSystemCb.setWidth(270);
			mpSystemCb.setEditable(false);
			mpSystemCb.setAllowBlank(false);
			mpSystemCb.setEditable(false);
			mpSystemCb.setMinListWidth(290);
			mpSystemCb.setStore(mpSystemStore);
			mpSystemCb.setEmptyText("Не выбран");
			mpSystemCb.addListener(Events.SelectionChange, listener);
			// mpSystemCb.a
		}
		TableRowLayout layout = new TableRowLayout();
		LayoutContainer line2 = new LayoutContainer(layout);
		{
			line2.add(label("Объект мониторинга: "), new TableData("125", null));
			line2.add(connectionCb);
			line2.add(wrap(label("Компонент: "), 0, 10, 0, 20), new TableData("60", null));
			line2.add(mpSystemCb);
		}

		submit = new Button("Обновить", new SelectionListener<ButtonEvent>() {
			@Override
			public void componentSelected(ButtonEvent ce) {
				load();
			}
		});

		FieldSet set = new FieldSet();
		{
			set.setLayout(new TableLayout(1));
			set.setHeading("Настройки фильтров");
			set.add(line1);
			set.add(wrap(line2, 10, 0, 0, 0));
			set.add(submit);
		}

		FormPanel form = new FormPanel();
		{
			form.setLayout(new FlowLayout());
			form.setBodyBorder(false);
			form.setHeaderVisible(false);
			form.setBodyBorder(false);
			form.setBorders(false);
			form.add(set, new FlowData(10));
		}

		bindings = new FormBinding(form, true);
		add(form);

	}

	protected boolean checkFilter() {
		MessageProcessingFilter filter = getFilter();
		boolean result = true;
		if (filter.getCreatedFrom() == null || filter.getCreatedTo() == null || filter.getConnection() == null
				|| filter.getMpSystem() == null) {
			result = false;
		}
		return result;
	}

	public void setFilter(MessageProcessingFilter filter) {
		BeanModelFactory factory = BeanModelLookup.get().getFactory(MessageProcessingFilter.class);
		bindings.bind(filterModel = factory.createModel(filter));
	}

	protected void reloadMPSystemData() {
		mpSystemLoader.load();
	}

	protected void load() {
		fireEvent(SetFilterEvent, new BaseEvent(this));
	}

	// internal UI helpers
	private Text label(String value) {
		Text text = new Text(value);
		text.setStyleAttribute("fontSize", "12px");
		return text;
	}

	private LayoutContainer wrap(Widget container, int top, int right, int bottom, int left) {
		LayoutContainer wrapper = new LayoutContainer();
		wrapper.add(container, new FlowData(top, right, bottom, left));
		return wrapper;
	}
}
