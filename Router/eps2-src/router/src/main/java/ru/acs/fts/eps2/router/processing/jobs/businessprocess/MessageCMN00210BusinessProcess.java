package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.data.kind.ArchiveDocumentStatuses;
import ru.acs.fts.eps2.engine.data.kind.DocumentModeIDs;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edarch_Archive_Docs;
import ru.acs.fts.eps2.model.services.EdarchService;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.persistence.operators.EdarchOperator;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.util.helpers.UUIDGen;
import ru.acs.fts.eps2.util.time.TimeUtil;
import ru.acs.fts.eps2.utils.StringUtil;
import ru.acs.fts.schemas.album.archdocstatusrequest.ArchDocStatusRequestType;
import ru.acs.fts.schemas.album.archdocstatusresponse.ArchDocStatusResponseType;

/**
 * Запрос на получение статуса документа
 * 
 * <h2>Параметры JobBatch</h2>
 * <ul>
 * <li><strong>envelopeName</strong> - имя конверта, который будет сгенерировать и размещён в JobBatchContext</li>
 * </ul>
 */
public class MessageCMN00210BusinessProcess extends EadBusinessProcess
{
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		ArchDocStatusRequestType archDocStatusReq = recvEnv.getDocument( ).getDocumentAsClass( ArchDocStatusRequestType.class );

		ArchDocStatusResponseType response = getArchDocStatusResponse( archDocStatusReq, jobBatchContext );
		
		pack( MessageType.CMN_00211, response, jobBatchContext, jobContext );
	}
	
	private ArchDocStatusResponseType getArchDocStatusResponse( 
			ArchDocStatusRequestType archDocStatusReq, EDJobBatchContext jobBatchContext ) 
		throws BaseProcessingException, DatabaseException
	{
		ArchDocStatusResponseType response = new ArchDocStatusResponseType( );
		
		response.setDocumentID( UUIDGen.getUUID( ).toString( ) );
		response.setRefDocumentID( archDocStatusReq.getDocumentID( ) );
		response.setDocumentModeID( DocumentModeIDs.ARCH_DOC_STATUS_RESPONSE );

		Edarch_Archive_Docs archDoc = getStatusDocumentation( archDocStatusReq, jobBatchContext );
		
		response.setArchID( archDoc.getArdocArchIdinternal( ) );
		response.setArchDocID( archDoc.getArdocIdinternal( ) );
		response.setArchDeclID( archDocStatusReq.getArchDeclID( ) );		
		response.setArchDocStatus( archDoc.getArdocStageStatus( ) );
		response.setArchDocumentID( archDoc.getArdocDocumentid( ) );
			
		return response;
	}
	
	private Edarch_Archive_Docs getStatusDocumentation(
			ArchDocStatusRequestType archDocStatusReq,
			EDJobBatchContext jobBatchContext ) 
		throws BaseProcessingException, DatabaseException
	{
		EdarchOperator edarchOperator = _serviceHolder.getEdarchOperator( );

		//
		
		String archId = archDocStatusReq.getArchID( );
		if ( StringUtil.isNullOrEmpty( archId ) )
		{
			/** Не задан идентификатор архива */
			throwException( jobBatchContext, ResultCodes._10_00001_01 );
		}
		
		String archDocId = archDocStatusReq.getArchDocID( );
		String archDocumentId = archDocStatusReq.getArchDocumentID( );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		
		Edarch_Archive_Docs initDoc = edarchOperator.getInitialDocument( archDocId, archDocumentId, args );
		if ( null == initDoc )
		{
			/** Не найден исходный документ */
			throwException( jobBatchContext, ResultCodes._10_00001_01 );
		}

		Edarch_Archive_Docs archDoc = edarchOperator.getActualDocumentByPrevious( initDoc, args );
		if ( null == archDoc )
		{
			/** В цепочке не найден актуальный документ */
			throwException( jobBatchContext, ResultCodes._10_00004_02 );
		}
		
		//
		
		checkAbilityToReadDocument( jobBatchContext, archDoc, archId );		
		performStatusManipulations( archDoc );
		
		return prepareActualResult( initDoc, archDoc );
	}
	
	private void performStatusManipulations( Edarch_Archive_Docs archDoc )
	{
		String stageStatus = archDoc.getArdocStageStatus( );
		
		Calendar currentDate = Calendar.getInstance( );
		Calendar endDate = TimeUtil.convertDateToCalendar( archDoc.getArdocToDate( ) );
		if ( null != endDate )
			endDate.add( Calendar.HOUR_OF_DAY, 24 );
		
		if ( null == endDate || currentDate.before( endDate ) )
		{
			if ( ArchiveDocumentStatuses.isNew( stageStatus ) )
				archDoc.setArdocStageStatus( ArchiveDocumentStatuses.DOC_NEW_ACTUAL );
			else if ( ArchiveDocumentStatuses.isActive( stageStatus ) )
				archDoc.setArdocStageStatus( ArchiveDocumentStatuses.DOC_ACTIVE_ACTUAL );
		}
		else if ( currentDate.after( endDate ) )
		{
			if ( ArchiveDocumentStatuses.isNew( stageStatus ) )
				archDoc.setArdocStageStatus( ArchiveDocumentStatuses.DOC_NEW_EXPIRE );
			else if ( ArchiveDocumentStatuses.isActive( stageStatus ) )
				archDoc.setArdocStageStatus( ArchiveDocumentStatuses.DOC_ACTIVE_EXPIRE );
		}
	}
	
	private void checkAbilityToReadDocument( 
			EDJobBatchContext jobBatchContext,
			Edarch_Archive_Docs archDoc, String archId ) 
		throws BaseProcessingException, DatabaseException
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		EdarchService edarchService = _serviceHolder.getEdarchService( );
		EdarchOperator edarchOperator = _serviceHolder.getEdarchOperator( );
		
		String archDeclId = edarchOperator.getArchDeclIdFromArchive( archId );
		String envDeclId = recvEnv.getParticipantID( );
		
		if ( archDeclId.equalsIgnoreCase( envDeclId ) )
			return ; /** себе доступ разрешен */
		
		if ( ! edarchService.isAbleToReadDocument( archDoc, envDeclId ) )
		{
			throwException( jobBatchContext, ResultCodes._10_00011_01 );
		}
	}	
}
