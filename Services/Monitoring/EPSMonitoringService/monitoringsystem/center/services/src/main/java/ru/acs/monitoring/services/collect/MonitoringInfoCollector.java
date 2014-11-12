package ru.acs.monitoring.services.collect;

import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import ru.acs.fts.dto.OXMConverter;
import ru.acs.fts.dto.monitoring.MonitoringInfo;
import ru.acs.fts.dto.monitoring.Severity;
import ru.acs.monitoring.dao.ConnectionDAO;
import ru.acs.monitoring.domain.CommonSettings;
import ru.acs.monitoring.domain.Connection;
import ru.acs.monitoring.domain.MonitoringInf;
import ru.acs.monitoring.domain.MonitoringInfoData;
import ru.acs.monitoring.services.MonitoringInfoProcessor;

/**
 * Сервис сбора информации от локальных агентов
 * 
 * @author fmv
 * 
 */
public class MonitoringInfoCollector {
	final static Logger log = LoggerFactory.getLogger(MonitoringInfoCollector.class);
	protected ConnectionDAO connectionDAO;
	protected MonitoringInfoProcessor miProcessor;
	protected List<Connection> customConnections;
	MIWsRequester wsRequester = new MIWsRequester();
	MIMessageRequester mqRequester;
	CommonSettings settings;
	private ExecutorService executorService = Executors.newFixedThreadPool(100);

	/**
	 * Запустить сбор информации
	 */
	public void collectInfo() {
		log.info("Запущен сервис сбора информации от локальных агентов");
		List<Connection> connections = getConnections();
		if (connections == null) {
			return;
		}
		//Многопоточный опрос агентов
		Set<Future<?>> taskFutures = new HashSet<Future<?>>();
		for (Connection connection : connections)
			taskFutures.add(executorService.submit(new ConnectionRequester(
					connection), null));
		for (Future<?> future : taskFutures)
			try {
				future.get();
			} catch (Exception exc) {
				log.error("Ошибка опроса агента", exc);
			}
		
		log.debug("Cервис сбора информации от локальных агентов завершен");
	}
	
	private class ConnectionRequester implements Runnable {
		private Connection connection;
		
		public ConnectionRequester(Connection connection) {			
			this.connection = connection;
		}

		public void run() {
			if (connection.isActive()) {
				MonitoringInfo monitoingInfo = null;
				try {
					monitoingInfo = getMonitoingInfo(connection);
				} catch (Exception e) {// TODO проработать список исключений,
					// так как мы не должны прерывать опрос
					// ловим все
					MonitoringInf inf = new MonitoringInf();
					inf.setSeverity(Severity.ERROR.toString());
					inf.setSystemName(connection.getName());
					inf.setUpdateDate(Calendar.getInstance().getTime());
					inf
							.setError("Ошибка получения данных от агента мониторинга, возможно агент не запущен. Ошибка при вызове веб-сервиса: "
									+ e.getMessage());
					inf.setConnection(connection);
					MonitoringInfoData monitoringInfoData = new MonitoringInfoData();
					OXMConverter converter = new OXMConverter();
					String xml = null;
					try {
						xml = new String(converter.marshall(new MonitoringInfo()), "UTF-8");
					}
					catch (UnsupportedEncodingException exc) {
						xml = new String(converter.marshall(new MonitoringInfo()));
					}
					monitoringInfoData.setMonitoringInfoXML(null);
					inf.setMonitoringInfoData(monitoringInfoData);
					miProcessor.processMonitoringInfo(inf);

				}
				if (monitoingInfo != null) {
					miProcessor.processMonitoringInfo(monitoingInfo, connection);
				}
			}
		}
	}

	private List<Connection> getConnections() {
		List<Connection> connections = connectionDAO.findAll();
		if (connections == null || connections.size() == 0) {
			if (customConnections == null || customConnections.size() == 0) {
				log.warn("Не найдены зарегистрированные агенты мониторинга");
				return null;
			}
			for (Connection connection : customConnections) {
				if (connection.getId() == null) {
					connectionDAO.save(connection);
				}
			}
			connections.addAll(customConnections);

		}
		return connections;
	}

	/**
	 * Запрос информации от локального агента через WS
	 * 
	 * @param connection
	 * @return
	 */
	private MonitoringInfo getMonitoingInfo(Connection connection) {
		log.info("Запрос информации от агента - " + connection.getName());
		if (connection.getRequestType() == 1) {
			if (mqRequester != null) {
				mqRequester.getMonitoringInfo(connection);
			} else {
				log.error("Запрос информации для " + connection.getName()
						+ " не произведен: не настроено соединение с MQ!");
			}
			return null;
		} else if (connection.getRequestType() == 0) {
			MonitoringInfo monitoringInfo = wsRequester.getMonitoringInfo(connection);
			if (monitoringInfo == null) {
				return null;
			}
			return monitoringInfo;
		}
		log.warn("Запрос информации для " + connection.getName() + " не произведен: неизвестный тип опроса агента.");
		return null;
	}

	@Autowired
	public void setConnectionDAO(ConnectionDAO connectionDAO) {
		this.connectionDAO = connectionDAO;
	}

	/**
	 * Установить список подключений не занесенных в БД
	 * 
	 * @param customConnections
	 */
	@Autowired(required = false)
	public void setCustomConnections(List<Connection> customConnections) {
		this.customConnections = customConnections;
	}

	@Autowired
	public void setMiProcessor(MonitoringInfoProcessor miProcessor) {
		this.miProcessor = miProcessor;
	}

	@Autowired(required = false)
	public void setMqRequester(MIMessageRequester mqRequester) {
		this.mqRequester = mqRequester;
	}

	@Autowired
	public void setSettings(CommonSettings settings) {
		this.settings = settings;
		wsRequester.setSettings(settings);
	}

}
