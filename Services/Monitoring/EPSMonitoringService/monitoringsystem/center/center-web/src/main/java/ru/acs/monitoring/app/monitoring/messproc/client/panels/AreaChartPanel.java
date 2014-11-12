package ru.acs.monitoring.app.monitoring.messproc.client.panels;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import ru.acs.monitoring.app.monitoring.messproc.domain.MessageProcessingFilter;
import ru.acs.monitoring.app.monitoring.messproc.domain.MessageProcessingStatData;
import ru.acs.monitoring.app.monitoring.messproc.domain.NamedObject;
import ru.acs.monitoring.app.monitoring.messproc.server.MessageProccessingService;
import ru.acs.monitoring.app.monitoring.messproc.server.MessageProccessingServiceAsync;

import com.extjs.gxt.charts.client.Chart;
import com.extjs.gxt.charts.client.model.ChartModel;
import com.extjs.gxt.charts.client.model.Legend;
import com.extjs.gxt.charts.client.model.LineDataProvider;
import com.extjs.gxt.charts.client.model.ScaleProvider;
import com.extjs.gxt.charts.client.model.Legend.Position;
import com.extjs.gxt.charts.client.model.axis.XAxis;
import com.extjs.gxt.charts.client.model.axis.YAxis;
import com.extjs.gxt.charts.client.model.charts.LineChart;
import com.extjs.gxt.ui.client.data.BaseListLoader;
import com.extjs.gxt.ui.client.data.BeanModel;
import com.extjs.gxt.ui.client.data.BeanModelLookup;
import com.extjs.gxt.ui.client.data.BeanModelReader;
import com.extjs.gxt.ui.client.data.ListLoadResult;
import com.extjs.gxt.ui.client.data.MemoryProxy;
import com.extjs.gxt.ui.client.data.ModelData;
import com.extjs.gxt.ui.client.data.ModelStringProvider;
import com.extjs.gxt.ui.client.event.Events;
import com.extjs.gxt.ui.client.event.Listener;
import com.extjs.gxt.ui.client.event.MessageBoxEvent;
import com.extjs.gxt.ui.client.event.SelectionChangedEvent;
import com.extjs.gxt.ui.client.store.ListStore;
import com.extjs.gxt.ui.client.store.TreeStore;
import com.extjs.gxt.ui.client.util.Margins;
import com.extjs.gxt.ui.client.widget.ContentPanel;
import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.MessageBox;
import com.extjs.gxt.ui.client.widget.form.FieldSet;
import com.extjs.gxt.ui.client.widget.grid.ColumnConfig;
import com.extjs.gxt.ui.client.widget.grid.ColumnData;
import com.extjs.gxt.ui.client.widget.grid.ColumnModel;
import com.extjs.gxt.ui.client.widget.grid.Grid;
import com.extjs.gxt.ui.client.widget.grid.GridCellRenderer;
import com.extjs.gxt.ui.client.widget.layout.FillLayout;
import com.extjs.gxt.ui.client.widget.layout.FitData;
import com.extjs.gxt.ui.client.widget.layout.FitLayout;
import com.extjs.gxt.ui.client.widget.layout.RowData;
import com.extjs.gxt.ui.client.widget.layout.RowLayout;
import com.extjs.gxt.ui.client.widget.treegrid.TreeGrid;
import com.extjs.gxt.ui.client.widget.treegrid.TreeGridCellRenderer;
import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.user.client.Random;
import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * Панель с графиком и таблицей для статистики
 * 
 * @author fmv
 * 
 */
public class AreaChartPanel extends ContentPanel {
	private MessageProccessingServiceAsync mpService;
	String[] colors = new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F" };
	private AreaChartExample example = new AreaChartExample();
	Chart chart;
	ChartModel chartModel = null;
	Grid<ModelData> statGrid;
	TreeStore<BeanModel> treeStore;
	Map<NamedObject, List<MessageProcessingStatData>> statsData;

	public AreaChartPanel() {
		super();
		setUpServices();
		createUI();
	}

	private void createUI() {
		setHeaderVisible(false);
		// setBorders(false);
		FillLayout layout = new FillLayout();
		setLayout(layout);
		ArrayList<ColumnConfig> cols = new ArrayList<ColumnConfig>();

		ColumnConfig column = new ColumnConfig("name", "Название", 150);
		column.setRenderer(new TreeGridCellRenderer<BeanModel>());

		cols.add(column);

		ColumnConfig descrCol = new ColumnConfig("description", "Описание", 250);
		cols.add(descrCol);

		ColumnConfig dataCol = new ColumnConfig("statDate", "Дата", 50);
		DateTimeFormat dtf = DateTimeFormat.getFormat("dd.MM.yy");
		dataCol.setDateTimeFormat(dtf);
		cols.add(dataCol);
		ColumnConfig successCol = new ColumnConfig("success", "Обработано успешно", 150);
		GridCellRenderer<BeanModel> successRend = new GridCellRenderer<BeanModel>() {
			public String render(BeanModel model, String property, ColumnData config, int rowIndex, int colIndex,
					ListStore<BeanModel> store, Grid<BeanModel> grid) {
				Long val = null;
				if (model.getBean() instanceof MessageProcessingStatData) {
					val = (Long) model.get(property);

				} else if (model.getBean() instanceof NamedObject) {
					val = getSuccessSummary((NamedObject) model.getBean());
				}
				if (val != null) {
					return val.toString();
				}
				return "";
			}

		};
		successCol.setRenderer(successRend);

		cols.add(successCol);

		ColumnConfig errorCol = new ColumnConfig("error", "Ошибки обработки", 150);

		GridCellRenderer<BeanModel> errorRend = new GridCellRenderer<BeanModel>() {
			public String render(BeanModel model, String property, ColumnData config, int rowIndex, int colIndex,
					ListStore<BeanModel> store, Grid<BeanModel> grid) {
				Long val = null;
				if (model.getBean() instanceof MessageProcessingStatData) {
					val = (Long) model.get(property);

				} else if (model.getBean() instanceof NamedObject) {
					val = getErrorSummary((NamedObject) model.getBean());
				}
				if (val != null) {
					String style = val.longValue() > 0 ? "red" : "green";
					return "<span style='color:" + style + "'>" + val + "</span>";
				}
				return "";
			}

		};
		errorCol.setRenderer(errorRend);
		cols.add(errorCol);

		ColumnModel cm = new ColumnModel(cols);

		treeStore = new TreeStore<BeanModel>();

		TreeGrid<BeanModel> tree = new TreeGrid<BeanModel>(treeStore, cm);
		tree.setBorders(true);
		tree.setSize(400, 400);
		tree.setAutoExpandColumn("description");
		tree.setTrackMouseOver(false);
		tree.getSelectionModel().addListener(Events.SelectionChange, new Listener<SelectionChangedEvent<BeanModel>>() {
			public void handleEvent(SelectionChangedEvent<BeanModel> be) {
				if (be.getSelection().size() > 0) {
					if (be.getSelectedItem().getBean() instanceof NamedObject) {
						refreshChart((NamedObject) be.getSelectedItem().getBean());
					}
				}
			}
		});
		// setFrame(true);

		// add(getChart());

		LayoutContainer lc = new LayoutContainer();
		RowLayout rl = new RowLayout();
		lc.setLayout(rl);
		lc.setSize(800, 600);

		RowData data;
		data = new RowData(1, 200, new Margins(10));
		ContentPanel cp = new ContentPanel(new FitLayout());
		cp.setHeading("Данные");
		cp.add(tree);
		lc.add(cp, data);

		data = new RowData(1, 1, new Margins(10));
		cp = new ContentPanel(new FitLayout());
		cp.setHeading("");
		cp.add(getChart());
		lc.add(cp, data);
		add(lc);

	}

	protected Long getSuccessSummary(NamedObject bean) {
		List<MessageProcessingStatData> stat = statsData.get(bean);
		long successCount = 0;
		for (MessageProcessingStatData messageProcessingStatData : stat) {
			successCount += messageProcessingStatData.getSuccess();
		}
		return successCount;
	}

	protected Long getErrorSummary(NamedObject bean) {
		List<MessageProcessingStatData> stat = statsData.get(bean);
		long errorCount = 0;
		for (MessageProcessingStatData messageProcessingStatData : stat) {
			errorCount += messageProcessingStatData.getError();
		}
		return errorCount;
	}

	protected void refreshChart(NamedObject category) {
		ChartModel cm = createChartModel();

		ListStore<ModelData> store = createChartStore(category);

		ModelStringProvider<ModelData> lp = createLabelProvider();

		LineDataProvider dp = new LineDataProvider("success");
		dp.setLabelProvider(lp);
		dp.bind(store);

		LineDataProvider dpErr = new LineDataProvider("error");
		dpErr.setLabelProvider(lp);
		dpErr.bind(store);

		cm.addChartConfig(createArea(category, "успешно", dp, "00AE00"));
		cm.addChartConfig(createArea(category, "ошибки", dpErr, "FF0000"));

		chart.setChartModel(cm);

	}

	private ModelStringProvider<ModelData> createLabelProvider() {
		return new ModelStringProvider<ModelData>() {
			public String getStringValue(ModelData model, String property) {
				Object value = model.get("statDate");
				if (value instanceof Date) {
					DateTimeFormat dtf = DateTimeFormat.getFormat("dd.MM");
					return dtf.format((Date) value);
				}
				return value.toString();
			}
		};
	}

	private ListStore<ModelData> createChartStore(NamedObject category) {
		final List<MessageProcessingStatData> stat = statsData.get(category);

		final MemoryProxy<List<MessageProcessingStatData>> memoryProxy = new MemoryProxy<List<MessageProcessingStatData>>(
				stat);
		BaseListLoader<ListLoadResult<BeanModel>> loader = new BaseListLoader<ListLoadResult<BeanModel>>(memoryProxy,
				new BeanModelReader());
		ListStore<ModelData> store = new ListStore<ModelData>(loader);
		store.setMonitorChanges(true);
		loader.load();
		return store;
	}

	private ChartModel createChartModel() {
		ChartModel cm = new ChartModel("Статистика по дням", "font-size: 14px; font-family: Verdana;");
		cm.setBackgroundColour("ffffff");
		cm.setScaleProvider(ScaleProvider.ROUNDED_NEAREST_SCALE_PROVIDER);
		XAxis xa = new XAxis();
		cm.setXAxis(xa);
		YAxis yAxis = new YAxis();
		yAxis.setSteps(10);
		cm.setYAxis(yAxis);
		Legend legend = new Legend(Position.TOP, true);
		cm.setLegend(legend);
		return cm;
	}

	private LineChart createArea(NamedObject category, String type, LineDataProvider dp, String color) {
		LineChart area1 = new LineChart();
		// area1.setAnimateOnShow(true);
		area1.setText(category.getName() + " (" + type + ")");
		area1.setTooltip(category.getName() + " " + category.getDescription());
		area1.setColour(color);
		area1.setDataProvider(dp);
		return area1;
	}

	private void setUpServices() {
		mpService = (MessageProccessingServiceAsync) GWT.create(MessageProccessingService.class);
	}

	private LayoutContainer getChart() {
		FieldSet fs = new FieldSet();
		fs.setHeading("");
		fs.setLayout(new FitLayout());

		String url = "";
		url += "app/gxt/chart/open-flash-chart.swf";

		chart = new Chart(url);
		chart.setBorders(true);
		fs.add(chart, new FitData(0, 0, 20, 0));
		chart.setChartModel(example.getChartModel());
		return fs;
	}

	public void refresh(final MessageProcessingFilter filter) {
		final MessageBox box = MessageBox.wait("", "Загрузка данных, пожалуйста подождите...", "Загрузка...");
		mpService.getMPStatsForAreaChart(filter,
				new AsyncCallback<Map<NamedObject, List<MessageProcessingStatData>>>() {

					public void onSuccess(Map<NamedObject, List<MessageProcessingStatData>> stats) {
						statsData = stats;
						buildChart(stats, filter);
						box.close();
					}

					public void onFailure(Throwable arg0) {
						box.close();
						MessageBox.alert("Ошибка", arg0.getLocalizedMessage(), new Listener<MessageBoxEvent>() {

							public void handleEvent(MessageBoxEvent be) {
								// TODO Auto-generated method stub

							}
						});
					}
				});

	}

	protected void buildChart(Map<NamedObject, List<MessageProcessingStatData>> stats, MessageProcessingFilter filter) {
		refreshTreeStore(stats);
		ChartModel cm = createChartModel();
		for (NamedObject category : stats.keySet()) {
			ListStore<ModelData> store = createChartStore(category);

			ModelStringProvider<ModelData> lp = createLabelProvider();

			LineDataProvider dp = new LineDataProvider("success");
			dp.setLabelProvider(lp);
			dp.bind(store);
			cm.addChartConfig(createArea(category, "успешно", dp, colors[Random.nextInt(14)]
					+ colors[Random.nextInt(14)] + colors[Random.nextInt(14)]));
		}
		chart.setChartModel(cm);
	}

	private void refreshTreeStore(Map<NamedObject, List<MessageProcessingStatData>> stats) {
		treeStore.removeAll();
		for (NamedObject category : stats.keySet()) {
			final List<MessageProcessingStatData> statData = stats.get(category);
			List<BeanModel> statModel = BeanModelLookup.get().getFactory(MessageProcessingStatData.class).createModel(
					statData);
			BeanModel bm = BeanModelLookup.get().getFactory(NamedObject.class).createModel(category);
			treeStore.add(bm, true);
			treeStore.add(bm, statModel, true);
		}
		treeStore.commitChanges();
	}

	class AreaChartExample {
		public ChartModel getChartModel() {
			ChartModel cm = new ChartModel("Статистика", "font-size: 14px; font-family: Verdana;");
			cm.setBackgroundColour("ffffff");
			XAxis xa = new XAxis();
			xa.setMax(2);
			cm.setXAxis(xa);
			YAxis yAxis = new YAxis();
			cm.setYAxis(yAxis);
			Legend legend = new Legend(Position.TOP, true);
			cm.setLegend(legend);
			return cm;
		}
	}

}
