package ru.acs.monitoring.services;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import ru.acs.fts.dto.adapters.DateUtilities;
import ru.acs.fts.dto.monitoring.HostMonitoringInfos;
import ru.acs.fts.dto.monitoring.MessagesProcessingInfo;
import ru.acs.fts.dto.monitoring.MonitoringAttribute;
import ru.acs.fts.dto.monitoring.MonitoringInfo;
import ru.acs.fts.dto.monitoring.Severity;
import ru.acs.monitoring.db.DBQuery;
import ru.acs.monitoring.settings.MessageProcessingSettings;

public class MessageProcessingMonitoringProcess implements MonitoringProcess {
	final static Logger log = LoggerFactory.getLogger(MessageProcessingMonitoringProcess.class);
	
	List<MessageProcessingSettings> settings;
	
	@Override
	public MonitoringAttribute getAddedOrDefaultAtribute(MonitoringInfo info) {
		if (info.getMessagesProcessingInfos().size() == 0)
			info.getMessagesProcessingInfos().add(new MessagesProcessingInfo());
		return info.getMessagesProcessingInfos().get(0);
	}
	
	public void fillMonitoringInfo(MonitoringInfo info) {
		log.info("Запущен: "+ getProcessName());
		if (settings==null || settings.size()==0){
			log.info("Не настроены параметры запросов");
			return;
		}
		List<MessagesProcessingInfo> infoList = new ArrayList<MessagesProcessingInfo>();
		for (MessageProcessingSettings setting : settings) {
			MessagesProcessingInfo messagesInfo = new MessagesProcessingInfo();
			messagesInfo.setUpdateTime(DateUtilities.xmlCalendar());
			messagesInfo.setName(setting.getName());
			try{
				DBQuery dbQuery = new DBQuery();
				dbQuery.setDataSource(setting.getDataSource());
				messagesInfo.getMessageProcessingInfos().addAll(dbQuery.getMessageProcessingInfo(setting.getSql()));
				messagesInfo.setSeverity(Severity.INFO);
			}catch(DataAccessException e){
				log.error(e.getLocalizedMessage(),e);
				messagesInfo.setSeverity(Severity.ERROR);
				messagesInfo.setAdditionalInfo(e.getLocalizedMessage());
			}
			infoList.add(messagesInfo);
		}
		info.getMessagesProcessingInfos().addAll(infoList);
	}

	public String getProcessName() {
		return "Сервис мониторинга статистики обработки сообщений";
	}

	public List<MessageProcessingSettings> getSettings() {
		return settings;
	}
	@Autowired(required=false)
	public void setSettings(List<MessageProcessingSettings> settings) {
		this.settings = settings;
	}

}
