package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.data.kind.ArchiveDocumentStatuses;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edarch_Archive_Docs;
import ru.acs.fts.eps2.model.entities.Edarch_Archive_Docs_WithContent;
import ru.acs.fts.eps2.model.services.EdarchService;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.persistence.operators.EdarchOperator;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.util.time.TimeUtil;
import ru.acs.fts.eps2.utils.StringUtil;
import ru.acs.fts.schemas.album.archdocrequest.ArchDocRequestType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/**
 * Запрос документа из архива
 * 
 * <h2>Параметры JobBatch</h2>
 * <ul>
 * <li><strong>envelopeName</strong> - имя конверта, который будет сгенерировать и размещён в JobBatchContext</li>
 * </ul>
 */
public class MessageCMN00212BusinessProcess extends EadBusinessProcess
{
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		ArchDocRequestType archDocReq = recvEnv.getDocument( ).getDocumentAsClass( ArchDocRequestType.class );
		
		BaseDocType response = getDocument( jobBatchContext, archDocReq );
		
		pack( MessageType.CMN_00213, response, jobBatchContext, jobContext );
	}
	
	private BaseDocType getDocument( EDJobBatchContext jobBatchContext, ArchDocRequestType archDocReq ) 
		throws BaseProcessingException, DatabaseException
	{
		EdarchOperator edarchOperator = _serviceHolder.getEdarchOperator( );

		String archDocId = archDocReq.getArchDocID( );
		String archDocumentId = archDocReq.getArchDocumentID( );
		String archId = archDocReq.getArchID( );
		
		Map< String, Object > args = new HashMap< String, Object >( );
		
		if ( StringUtil.isNullOrEmpty( archDocId ) || StringUtil.isNullOrEmpty( archId ) )
		{
			/** Не заданы нужные идентификаторы */
			throwException( jobBatchContext, ResultCodes._10_00001_01 );
		}
		
		Edarch_Archive_Docs initDoc = edarchOperator.getInitialDocument( archDocId, archDocumentId, args );
		if ( null == initDoc )
		{
			/** Не найден исходный документ */
			throwException( jobBatchContext, ResultCodes._10_00004_02 );
		}
		
		Edarch_Archive_Docs archDoc = edarchOperator.getActualDocumentByPrevious( initDoc, args );
		if ( null == archDoc )
		{
			/** Не найден актуальный документ в цепочке */
			throwException( jobBatchContext, ResultCodes._10_00004_02 );
		}
		
		checkAbilityToReadDocument( jobBatchContext, archDoc, archId );
		
		performStateManipulations( archDoc );
		
		return createArchDocResponse( 
			prepareActualResult( initDoc, archDoc ), 
			getContent( archDoc ), archDocReq 
		);
	}
	
	private void checkAbilityToReadDocument( 
			EDJobBatchContext jobBatchContext,
			Edarch_Archive_Docs archDoc, String archId ) 
		throws BaseProcessingException, DatabaseException
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		EdarchOperator edarchOperator = _serviceHolder.getEdarchOperator( );
		
		String archDeclId = edarchOperator.getArchDeclIdFromArchive( archId );
		String envDeclId = recvEnv.getParticipantID( );
		
		if ( archDeclId.equalsIgnoreCase( envDeclId ) )
			return ; /** себе доступ разрешен */
		
		EdarchService edarchService = _serviceHolder.getEdarchService( );
		if ( ! edarchService.isAbleToReadDocument( archDoc, envDeclId ) )
		{
			throwException( jobBatchContext, ResultCodes._10_00011_01 );
		}
	}
	
	private void performStateManipulations( Edarch_Archive_Docs archDoc )
	{
		EdarchOperator edarchOperator = _serviceHolder.getEdarchOperator( );
		
		String status = archDoc.getArdocStageStatus( );
		if ( ! edarchOperator.isStageStatusActual( status ) )
			return ;
		
		Calendar currentDate = Calendar.getInstance( );
		Calendar endDate = TimeUtil.convertDateToCalendar( archDoc.getArdocToDate( ) );
		
		if ( null != endDate || currentDate.before( endDate ) )
		{
			archDoc.setArdocStageStatus( ArchiveDocumentStatuses.DOC_ACTIVE_ACTUAL );
		}
		else if ( currentDate.after( endDate ) )
		{
			if ( ArchiveDocumentStatuses.isNewActual( status ) )
				archDoc.setArdocStageStatus( ArchiveDocumentStatuses.DOC_NEW_EXPIRE );
			else 
				archDoc.setArdocStageStatus( ArchiveDocumentStatuses.DOC_ACTIVE_EXPIRE );
		}
		
		/** 
		 * SeySeich: Возможно, предполагается апдейт объекта archDoc в БД,
		 * т.к. менялся статус, но в оригинале апдейт не совершается 
		 */
	}
	
	private byte[ ] getContent( Edarch_Archive_Docs archDoc ) 
		throws DatabaseException
	{
		EdarchOperator edarchOperator = _serviceHolder.getEdarchOperator( );
		
		Edarch_Archive_Docs_WithContent docWithContent = 
			edarchOperator.getDocumentWithContent( archDoc );
		if ( null == docWithContent )
			return null;
		
		return docWithContent.getArdocDsDate( );
	}
}
