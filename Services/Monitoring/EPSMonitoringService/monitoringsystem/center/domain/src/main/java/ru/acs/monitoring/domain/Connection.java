package ru.acs.monitoring.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Подключение к объекту мониторинга.
 * 
 * @author fmv
 * @author Алексей Селиванов
 */
@Table(name = "Connections")
@Entity
public class Connection extends BaseObject {
	private static final long serialVersionUID = 664964940538387221L;

	@Column(nullable = false, length = 255)
	private String name;

	@Column(nullable = false)
	private boolean active;

	@Column(nullable = false)
	private Boolean display = Boolean.TRUE;
	
	@Column(nullable = false)	
	private Boolean useCache = Boolean.FALSE;

	@Column(nullable = true)
	private String wsUrl;

	@Column(nullable = true)
	private String routingAddr;

	@Column(nullable = false)
	private Byte requestType = 0;

	/**
	 * Возвращает название.
	 * 
	 * @return название.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Устанавливает название.
	 * 
	 * @param name
	 *            название.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Возвращает URL-адрес веб-сервиса.
	 * 
	 * @return URL-адрес веб-сервиса.
	 */
	public String getWsUrl() {
		return wsUrl;
	}

	/**
	 * Устанавливает URL-адрес веб-сервиса.
	 * 
	 * @param wsUrl
	 *            URL-адрес веб-сервиса.
	 */
	public void setWsUrl(String wsUrl) {
		this.wsUrl = wsUrl;
	}

	public String getRoutingAddr() {
		return routingAddr;
	}

	/**
	 * для обмена по MQ - адрес получателя
	 * 
	 * @param routingAddr
	 */
	public void setRoutingAddr(String routingAddr) {
		this.routingAddr = routingAddr;
	}

	public Byte getRequestType() {
		return requestType;
	}

	/**
	 * 
	 * @param requestType
	 *            0 - WS, 1 - MQ
	 */
	public void setRequestType(Byte requestType) {
		this.requestType = requestType;
	}

	/**
	 * Возвращает {@code true} тогда и только тогда, когда следует отображать
	 * информацию мониторинга.
	 * 
	 * @return {@code true} тогда и только тогда, когда следует отображать
	 *         информацию мониторинга.
	 */
	public boolean isDisplay() {
		if (display==null){
			display=Boolean.TRUE;
		}
		return display;
	}

	/**
	 * Указывает, следует ли отображать информацию мониторинга.
	 * 
	 * @param display
	 *            флаг отображения информации мониторинга.
	 */
	public void setDisplay(boolean display) {
		this.display = display;
	}

	/**
	 * Возвращает {@code true} тогда и только тогда, когда подключение активно и
	 * мониторинг
	 * 
	 * @return
	 */
	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	/**
	 * Возвращает {@code true} тогда и только тогда, когда следует запрашивать
	 * с клиента скэшированную информацию
	 * 
	 * @return {@code true} тогда и только тогда, когда следует запрашивать
	 * с клиента скэшированную информацию.
	 */
	public Boolean getUseCache() {
		return useCache;
	}

	/**
	 * Указывает, следует запрашивать с клиента скэшированную информацию
	 * 
	 * @param useCache
	 *            флаг запроса с клиента скэшированной информации
	 */
	public void setUseCache(Boolean useCache) {
		this.useCache = useCache;
	}
}
