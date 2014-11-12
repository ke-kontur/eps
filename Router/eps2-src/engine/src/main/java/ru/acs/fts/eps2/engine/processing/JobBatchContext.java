package ru.acs.fts.eps2.engine.processing;

import java.util.ArrayList;
import java.util.List;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.configuration.Configurator;
import ru.acs.fts.eps2.engine.error.Errors;
import ru.acs.fts.eps2.engine.objects.Envelope;
import ru.acs.fts.eps2.engine.objects.GeneralPurposeContext;
import ru.acs.fts.eps2.engine.restWs.event.serviceModel.Event;
import ru.acs.fts.eps2.model.services.ServiceHolder;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;

public abstract class JobBatchContext extends GeneralPurposeContext
{
	public static final int STAGE_INITIAL = 1;
	public static final int STAGE_SUCCESS = 5000;
	public static final int STAGE_FAILED = 6000;
	
	/**
	 * Сохраняем входящее сообщение для случаев, если оно нам потребуется в виде потока байт.
	 * Вообще, оно не должно нам потребоваться, но вдруг
	 */
	private byte[ ] _message;
	
	/**
	 * Код шага обработки, больше нужен для логирования.
	 * Важно:
	 * 	5000 - сообщение успешно обработано
	 *  6000 - произошла ошибка при обработки сообщения
	 */
	private int _stage = STAGE_INITIAL;
	
	/**
	 * Результат обработки сообщения
	 */
	private ProcessingResult _processingResult; // NO_UCD (use private)

	/**
	 * Входящий конверт
	 */
	private Envelope _receivedEnvelope;

	/**
	 * Конфигуратор. Содержит различные настроечные параметры. Передается как референс
	 */
	private final Configurator _configurator;
	
	/**
	 * Хранитель сервисов для работы с БД
	 */
	private final ServiceHolder _serviceHolder;
	
	/**
	 * Генератор ошибок
	 */
	private final Errors _errors;
		
	/**
	 * Обрабатываемый ошибочный сценарий
	 */
	private String _failScenario;
	
	/**
	 * Код ошибки который вызвал переключения пакета задач на ошибочный
	 */
	private String _initialFailedResultCode = ResultCodes._00_00000_00;
	
	/**
	 * Очередь ошибочный сообщений, в которую следует отправить это сообщение
	 */
	private String _errorQueueToSend;
		
	/** 
	 * Искллючение для обработки ошибочных ситуаций.
	 */
	private BaseProcessingException _contextException;

	/**
	 * Текущий режим обработки ( normal, какая-то ошибка )
	 * см. RunningModes
	 */
	private String _runningMode = ProcessingConstants.ERROR_TYPE_NORMAL;
	
	/**
	 * Список с событиями, которые будут отправлены в сервис событий
	 */
	private List< Event > _stashedEvents = new ArrayList< Event >( );

	public JobBatchContext( Configurator configurator, ServiceHolder serviceHolder, Errors errors )
	{
		_processingResult = new ProcessingResult( );
		_configurator = configurator;
		_serviceHolder = serviceHolder;
		_errors = errors;
	}

	public int getNextStage( ) { return ++_stage; }

	public String getSoftVersion( )
	{
		if ( _configurator != null )
			return _configurator.getSoftVersion( );
		
		return "0.0.0/0.0.0";
	}

	// @formatter:off
	public void setMessage( byte[ ] message ) { _message = message; }
	public byte[ ] getMessage( ) { return _message; }

	public void setStage( int stage ) { _stage = stage; }
	public int getStage( ) { return _stage; }

	public void setProcessingResult( ProcessingResult processingResult ) { _processingResult = processingResult; }
	public ProcessingResult getProcessingResult( ) { return _processingResult; }

	public void setReceivedEnvelope( Envelope receivedEnvelope ) { _receivedEnvelope = receivedEnvelope; }
	public Envelope getReceivedEnvelope( ) { return _receivedEnvelope; }

	public Configurator getConfigurator( ) { return _configurator; }
	public ServiceHolder getServiceHolder( ) { return _serviceHolder; }
	public Errors getErrors( ) { return _errors; }

	public void setFailScenario( String failScenario ) { _failScenario = failScenario; }
	public String getFailScenario( ) { return _failScenario; }

	public void setInitialFailedResultCode( String initialFailedResultCode ) { _initialFailedResultCode = initialFailedResultCode; }
	public String getInitialFailedResultCode( ) { return _initialFailedResultCode; }

	public void setErrorQueueToSend( String errorQueueToSend ) { _errorQueueToSend = errorQueueToSend; }
	public String getErrorQueueToSend( ) { return _errorQueueToSend; }

	public void setContextException( BaseProcessingException contextException ) { _contextException = contextException; }
	public BaseProcessingException getContextException( ) { return _contextException; }

	public void setRunningMode( String runningMode ) { _runningMode = runningMode; }
	public String getRunningMode( ) { return _runningMode; }
	// @formatter:on
	
	public void stashEvent( Event event )
	{
		_stashedEvents.add( event );
	}
	
	public List< Event > getStashedEvents( )
	{
		return _stashedEvents;
	}
	
	public abstract Object getSpecialField( String fieldName ) throws DatabaseException;
}
