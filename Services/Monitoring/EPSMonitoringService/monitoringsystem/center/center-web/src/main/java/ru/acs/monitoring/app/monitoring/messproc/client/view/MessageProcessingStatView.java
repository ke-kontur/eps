package ru.acs.monitoring.app.monitoring.messproc.client.view;

import ru.acs.monitoring.app.monitoring.messproc.client.panels.AreaChartPanel;
import ru.acs.monitoring.app.monitoring.messproc.client.panels.FilterPanel;

import com.extjs.gxt.ui.client.Style.LayoutRegion;
import com.extjs.gxt.ui.client.event.BaseEvent;
import com.extjs.gxt.ui.client.event.Listener;
import com.extjs.gxt.ui.client.util.Margins;
import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.layout.BorderLayout;
import com.extjs.gxt.ui.client.widget.layout.BorderLayoutData;
import com.google.gwt.user.client.Element;

/**
 * Представление для отображения статистики обработки сообщений
 * @author fmv
 *
 */
public class MessageProcessingStatView extends LayoutContainer {
	private FilterPanel filterPanel;
	private AreaChartPanel areaChart;
	@Override
	protected void onRender(Element parent, int index) {
		super.onRender(parent, index);
		createUI();
		initController();
	}
	private void createUI() {
		final BorderLayout layout = new BorderLayout();
		setLayout(layout);
		setBorders(false);
		BorderLayoutData northData = new BorderLayoutData(LayoutRegion.NORTH, 150);
		northData.setMargins(new Margins(0, 5, 0, 0));

		BorderLayoutData centerData = new BorderLayoutData(LayoutRegion.CENTER);
		centerData.setMargins(new Margins(0, 5, 0, 0));

		filterPanel = new FilterPanel();
		add(filterPanel, northData);
		areaChart = new AreaChartPanel();
		add(areaChart, centerData);
	}
	private void initController() {
		filterPanel.addListener(FilterPanel.SetFilterEvent, new Listener<BaseEvent>() {
			public void handleEvent(BaseEvent be) {
				onSetFilter();
			}
		});
	}
	protected void onSetFilter() {
		areaChart.refresh(filterPanel.getFilter());
	}
}
