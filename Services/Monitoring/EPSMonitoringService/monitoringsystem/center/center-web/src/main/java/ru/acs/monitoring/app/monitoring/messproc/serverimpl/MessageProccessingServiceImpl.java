package ru.acs.monitoring.app.monitoring.messproc.serverimpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import ru.acs.monitoring.app.config.conn.client.model.ConnectionModel;
import ru.acs.monitoring.app.monitoring.messproc.domain.MessageProcessingFilter;
import ru.acs.monitoring.app.monitoring.messproc.domain.MessageProcessingStatData;
import ru.acs.monitoring.app.monitoring.messproc.domain.NamedObject;
import ru.acs.monitoring.app.monitoring.messproc.server.MessageProccessingService;
import ru.acs.monitoring.domain.Connection;
import ru.acs.monitoring.domain.MessageKind;
import ru.acs.monitoring.domain.MessageProcessingStat;
import ru.acs.monitoring.domain.MessageProcessingSystem;
import ru.acs.monitoring.services.MonitoringInfoService;

/**
 * Сервис для получения статистики по орбаботанным сообщениям
 * 
 * @author fmv
 * 
 */
public class MessageProccessingServiceImpl implements MessageProccessingService {
	public final static Logger log = LoggerFactory.getLogger(MessageProccessingServiceImpl.class);
	private MonitoringInfoService monInfoService;
	/**
	 * 
	 */
	private static final long serialVersionUID = -1664848301781715352L;

	/**
	 * Получение списка всех подсистем для статистики
	 */
	public List<NamedObject> getMPSystem(ConnectionModel connection) {
		log.debug("Получение списка систем: сonnection=" + connection.getId());
		List<MessageProcessingSystem> mpSystems = monInfoService.getMPSystemsByConnectionId(connection.getId());
		List<NamedObject> result = new ArrayList<NamedObject>();
		for (MessageProcessingSystem mpSystem : mpSystems) {
			NamedObject obj = new NamedObject();
			obj.setId(mpSystem.getId());
			obj.setName(mpSystem.getName());
			result.add(obj);
		}
		return result;
	}

	@Autowired
	public void setMonInfoService(MonitoringInfoService monInfoService) {
		this.monInfoService = monInfoService;
	}

	/**
	 * Получение статистики по фильтру
	 */
	public List<MessageProcessingStatData> getMPStats(MessageProcessingFilter filter) {
		log.debug("Запрос статистики обработки сообщений");
		Long systemId = null;
		if (filter.getMpSystem() != null) {
			systemId = filter.getMpSystem().getId();
		}
		Long connectionId = null;
		if (filter.getConnection() != null) {
			connectionId = filter.getConnection().getId();
		}

		List<MessageProcessingStatData> result = new ArrayList<MessageProcessingStatData>();

		List<MessageProcessingStat> stats = monInfoService.getMessageProcessingStat(filter.getCreatedFrom(), filter
				.getCreatedTo(), connectionId, systemId);
		for (MessageProcessingStat stat : stats) {
			MessageProcessingStatData data = new MessageProcessingStatData();
			data.setSuccess(stat.getSuccess());
			data.setStatDate(stat.getStatDate());
			data.setFlkError(stat.getFlkError());
			data.setError(stat.getError());
			data.setConnection(getConnection(stat.getSystem().getConnection()));
			data.setSystem(getSystem(stat.getSystem()));
			data.setMessageKind(getMessageKind(stat.getMessageKind()));
			result.add(data);

		}
		log.debug("end getMPStats ");
		return result;
	}

	private NamedObject getMessageKind(MessageKind messageKind) {
		NamedObject result = new NamedObject();
		result.setId(messageKind.getId());
		result.setName(messageKind.getCode());
		result.setDescription(messageKind.getDescription());
		return result;
	}

	private NamedObject getSystem(MessageProcessingSystem system) {
		NamedObject result = new NamedObject();
		result.setId(system.getId());
		result.setName(system.getName());
		return result;
	}

	private NamedObject getConnection(Connection connection) {
		NamedObject result = new NamedObject();
		result.setId(connection.getId());
		result.setName(connection.getName());
		return result;
	}

	/**
	 * Получение статистики по фильтру с разбиением по типам сообщений
	 */
	public Map<NamedObject, List<MessageProcessingStatData>> getMPStatsForAreaChart(MessageProcessingFilter filter) {
		log.debug("start getMPStatsForAreaChart");
		Map<NamedObject, List<MessageProcessingStatData>> result = new HashMap<NamedObject, List<MessageProcessingStatData>>();
		try {
			List<MessageProcessingStatData> stats = getMPStats(filter);

			Map<String, NamedObject> categories = new HashMap<String, NamedObject>();
			for (MessageProcessingStatData stat : stats) {
				NamedObject category = new NamedObject();
				category.setName(stat.getMessageKind().getName());
				category.setDescription(stat.getMessageKind().getDescription());
				// TODO
				// category.setName(stat.getConnection().getName()+"-"+stat.getSystem().getName()+"-"+stat.getMessageKind().getName());
				categories.put(category.getName(), category);
			}
			for (NamedObject category : categories.values()) {
				List<MessageProcessingStatData> statData = new ArrayList<MessageProcessingStatData>();
				for (MessageProcessingStatData stat : stats) {
					// TODO имя может не совпадать с MessKind
					if (category.getName().equals(stat.getMessageKind().getName())) {
						statData.add(stat);
					}
				}
				result.put(category, statData);
			}
		} catch (RuntimeException e) {
			log.error(e.getMessage(), e);
			throw e;
		}
		log.debug("end getMPStatsForAreaChart");
		return result;
	}

}
