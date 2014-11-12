package ru.acs.monitoring.app.monitoring.conn.client.widget;

import com.extjs.gxt.ui.client.binding.Converter;
import com.extjs.gxt.ui.client.binding.FormBinding;
import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.form.FormPanel;
import com.extjs.gxt.ui.client.widget.form.LabelField;
import com.extjs.gxt.ui.client.widget.layout.TableRowLayout;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.Timer;
import java.util.Date;
import ru.acs.monitoring.app.monitoring.conn.client.model.UpdateInfo;

/**
 *
 * @author Алексей Селиванов
 */
public class MonitoringPanel extends LayoutContainer {

    /**
     * Периодичность обновления по умолчанию в миллисекундах.
     */
    public static final long DEFAULT_UPDATE_PERIOD = 30000L;

    private MonitoringPortal portal;

    private final UpdateInfo updateInfo;
    private final long updatePeriod;
    private Timer timer;
    private Timer uiTimer;

    /**
     * Строит {@code MonitoringPanel} с заданным интервалом между обновлениями
     * в миллисекундах.
     *
     * @param updateInterval интервал между обновлениями в миллисекундах.
     */
    public MonitoringPanel(long updatePeriod) {
    this.updatePeriod = updatePeriod;
    this.updateInfo = new UpdateInfo();
    }

    /**
     * Строит {@code MonitoringPanel} с интервалом между обновлениями по
     * умолчанию.
     *
     * @see #DEFAULT_UPDATE_INTERVAL
     */
    public MonitoringPanel() { this(DEFAULT_UPDATE_PERIOD); }

    /** {@inheritDoc} */
    @Override protected void onRender(Element parent, int index) {
        initUI();
        super.onRender(parent, index);
    }

    /** {@inheritDoc} */
    @Override protected void onLoad() {
        initTimer();
        super.onLoad();
    }

    /** {@inheritDoc} */
    @Override protected void onUnload() {
        dropTimer();
        super.onUnload();
    }

    private void initTimer() {
		timer = new Timer() {
			@Override
			public void run() {
                portal.update();

                updateInfo.setLastUpdate(new Date());
                updateInfo.setTimeToUpdate(updatePeriod);
			}
		};

        timer.run(); // initially update panel
		timer.scheduleRepeating((int) updatePeriod);

		uiTimer = new Timer() {
			@Override
			public void run() {
                Date lastUpdate = updateInfo.getLastUpdate();
				if (lastUpdate == null) return;

                updateInfo.setTimeToUpdate(lastUpdate.getTime()
                        + updatePeriod
                        - new Date().getTime());
			}
		};
        uiTimer.scheduleRepeating(1000);
	}

    private void dropTimer() {
        if (timer != null) {
            timer.cancel();
            timer = null;
        }

        if (uiTimer != null) {
            uiTimer.cancel();
            uiTimer = null;
        }
    }

    private void initUI() {
    // Update panel
        FormPanel updatePanel = new FormPanel();
        {
        // Visual
            updatePanel.setHeaderVisible(false);
            updatePanel.setBodyBorder(false);
            updatePanel.setLayout(new TableRowLayout());

            LabelField updateInf = new LabelField("Обновлено: ");
        
            updatePanel.add(updateInf);

         
            LabelField lastUpdate = new LabelField(" ");
            {
                lastUpdate.setName("lastUpdate");
            }
            updatePanel.add(lastUpdate);

            LayoutContainer separator = new LayoutContainer();
            {
                separator.setWidth(50);
            }
            updatePanel.add(separator);

            updatePanel.add(new LabelField("Обновление начнется через: "));
            
            LabelField timeToUpdate = new LabelField(" ");
            {
                timeToUpdate.setName("timeToUpdate");
            }
            updatePanel.add(timeToUpdate);

        // Bind
            FormBinding binding = new FormBinding(updatePanel, true);
            
            binding.bind(updateInfo);

        // Converters
            binding.getBinding(lastUpdate).setConvertor(new Converter() {
                
                @Override public Object convertModelValue(Object value) {
                    if (!(value instanceof Date))
                        return super.convertModelValue(value);

                    DateTimeFormat
                    format = DateTimeFormat.getFormat("dd.MM.yyyy HH:mm");

                    return format.format((Date) value);
                }
            });

            binding.getBinding(timeToUpdate).setConvertor(new Converter() {
                
                @Override public Object convertModelValue(Object value) {
                    if (!(value instanceof Long))
                        return super.convertModelValue(value);

                    return ((Long) value) / 1000 + " сек";
                }
            });
        }
        add(updatePanel);

    // Monitoring portal
        add(portal = new MonitoringPortal(3));
    }
}
