package ru.acs.fts.eps2.engine.configuration;

/**
 * Конфигурация системы АПС ЭПС.
 */
public abstract class Configurator
{
	public static final String WORKING_ENCODING = "UTF-8";
	
	/**
	 * Версия текущей электрички
	 */
	private String _softVersion;

	/**
	 * Список масок для обработки неполных контейнеров
	 */
	private ProcessNotFullContainerListHolder _processNotFullContainerListHolder;
	
	// @formatter:off
	public String getSoftVersion( ) { return _softVersion; }
	public void setSoftVersion( String edeclRouterSoftVersion ) { _softVersion = edeclRouterSoftVersion; }

	public ProcessNotFullContainerListHolder getProcessNotFullContainerListHolder( ) { return _processNotFullContainerListHolder; } 
	public void setProcessNotFullContainerListHolder(ProcessNotFullContainerListHolder processNotFullContainerListHolder ) { _processNotFullContainerListHolder = processNotFullContainerListHolder; }
	// @formatter:on
}
