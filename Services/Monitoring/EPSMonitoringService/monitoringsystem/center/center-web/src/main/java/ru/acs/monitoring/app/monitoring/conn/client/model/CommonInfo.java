package ru.acs.monitoring.app.monitoring.conn.client.model;

import java.io.Serializable;

import com.extjs.gxt.ui.client.data.BeanModelTag;

/**
 * Общая информация об агенте. Представляет срез данных, предоставляемых
 * {@code MonitoringInf}.
 *
 * @author Алексей Селиванов
 */
public class CommonInfo implements Serializable, BeanModelTag {

    private Long connectionId;

    private Long monitoringInfId;
    private String name;
    private StateInfo state;
    private StateInfo dbState;
    private StateInfo mqState;
    private StateInfo servicesState;
    private StateInfo hostsState;
    private StateInfo eventLogState;
    private StateInfo messageProcessingState;
    private StateInfo systemState;
    private StateInfo signState;
 

    /**
     * Возвращает идентификатор связанной {@code MonitoringInf}.
     * @return идентификатор связанной {@code MonitoringInf}.
     */
    public Long getMonitoringInfId() {
        return monitoringInfId;
    }

    /**
     * Устанавливает идентификатор связанной {@code MonitoringInf}.
     * @param monitoringInfId идентификатор связанной {@code MonitoringInf}.
     */
    public void setMonitoringInfId(Long monitoringInfId) {
        this.monitoringInfId = monitoringInfId;
    }

    /**
     * Возвращает идентификатор подключения к ресурсу.
     * @return идентификатор подключения к ресурсу.
     */
    public Long getConnectionId() { return connectionId; }

    /**
     * Устанавливает идентификатор подключения к ресурсу.
     * @param id идентификатор подключения к ресурсу.
     */
    public void setConnectionId(Long id) { this.connectionId = id; }

    /**
     * Возвращает состояние локального агента ресурса мониторинга.
     * @return состояние локального агента ресурса мониторинга.
     */
    public StateInfo getState() { return state; }

    /**
     * Устанавливает состояние локального агента ресурса мониторинга.
     * @param state состояние локального агента ресурса мониторинга.
     */
    public void setState(StateInfo state) { this.state = state; }

    /**
     * Возвращает название ресурса мониторинга.
     * @return название ресурса мониторинга.
     */
    public String getName() { return name; }

    /**
     * Устанавливает название ресурса пониторинга.
     * @param name название ресурса пониторинга.
     */
    public void setName(String name) { this.name = name; }

    /**
     * Возвращает состояние базы данных.
     * @return состояние базы данных.
     */
    public StateInfo getDbState() { return dbState; }

    /**
     * Устаналвивает состояние базы данных.
     * @param dbState состояние базы данных.
     */
    public void setDbState(StateInfo dbState) { this.dbState = dbState; }

    /**
     * Возвращает состояние менеджера очередей.
     * @return состояние менеджера очередей.
     */
    public StateInfo getMqState() { return mqState; }

    /**
     * Устанавливает состояние менеджера очередей.
     * @param mqState состояние менеджера очередей.
     */
    public void setMqState(StateInfo mqState) { this.mqState = mqState; }

    /**
     * Возвращает состояние сервисов.
     * @return состояние сервисов.
     */
    public StateInfo getServicesState() { return servicesState; }

    /**
     * Устанавливает состояние сервисов.
     * @param servicesState состояние сервисов.
     */
    public void setServicesState(StateInfo servicesState) 
    { this.servicesState = servicesState; }
    

	public StateInfo getHostsState() {
		return hostsState;
	}

	public void setHostsState(StateInfo hostsState) {
		this.hostsState = hostsState;
	}

	public StateInfo getEventLogState() {
		return eventLogState;
	}

	public void setEventLogState(StateInfo eventLogState) {
		this.eventLogState = eventLogState;
	}

	public StateInfo getMessageProcessingState() {
		return messageProcessingState;
	}

	public void setMessageProcessingState(StateInfo messageProcessingState) {
		this.messageProcessingState = messageProcessingState;
	}

	public StateInfo getSystemState() {
		return systemState;
	}

	public void setSystemState(StateInfo systemState) {
		this.systemState = systemState;
	} 		
	   
    public StateInfo getSignState() {
		return signState;
	}

	public void setSignState(StateInfo signState) {
		this.signState = signState;
	}
}
