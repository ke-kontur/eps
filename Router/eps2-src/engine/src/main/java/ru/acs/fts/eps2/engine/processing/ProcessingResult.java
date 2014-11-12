package ru.acs.fts.eps2.engine.processing;

import ru.acs.fts.eps2.core.processing.ResultCodes;

import java.util.LinkedList;
import java.util.List;

/**
 * User: KGN
 * Date: 18.10.11
 * Time: 16:06
 */
public class ProcessingResult
{
	private ProcessingState processingState = ProcessingState.RUNNING;
	private String lastErrorCode = ResultCodes._00_00000_00;
	private List< ProcessingInfo > processingInfos = new LinkedList< ProcessingInfo >( );

	// @formatter:off
	public void setProcessingState( ProcessingState processingState ) { this.processingState = processingState; }
	public String getLastErrorCode( ) { return lastErrorCode; }
	// @formatter:on

	/**
	 * Задать результат обработки как "ошибочный" и добавить "действие" в список
	 * действий.
	 * 
	 * @param action выполняемое действие
	 * @param description описание ошибки
	 */
	public void setFailProcessingState( String action, String description )
	{
		processingState = ProcessingState.FAILED;
		processingInfos.add( ProcessingInfo.fail( action, description ) );
	}

	public void addOKProcessingInfo( String action )
	{
		ProcessingInfo processingInfo = ProcessingInfo.success( action );
		processingInfos.add( processingInfo );
	}

	/**
	 * Процесс обработки сообщения до сих пор осуществляется без ошибок.
	 * 
	 * @return true, если процесс осуществляется без ошибок
	 */
	public Boolean processStateIsOk( ) // NO_UCD (use default)
	{
		return !( processingState.equals( ProcessingState.FAILED ) );
	}
}
