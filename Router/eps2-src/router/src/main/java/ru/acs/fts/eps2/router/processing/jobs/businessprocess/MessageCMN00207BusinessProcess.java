package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.Date;
import java.util.HashMap;

import org.joda.time.LocalDate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.kind.ArchiveDocumentStatuses;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edarch_Archive_Docs;
import ru.acs.fts.eps2.model.services.EdarchService;
import ru.acs.fts.eps2.router.objects.EDDocument;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.persistence.operators.EdarchOperator;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.ResultCreator;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.schemas.album.archdocupdate.ArcDocType;
import ru.acs.fts.schemas.album.archdocupdate.ArchDocUpdateType;
import ru.acs.fts.schemas.album.result.ResultType;

/**
 * Запрос на замену (исправление) документа в архиве
 * 
 * <h2>Параметры JobBatch</h2>
 * <ul>
 * <li><strong>envelopeName</strong> - имя конверта, который будет сгенерировать и размещён в JobBatchContext</li>
 * </ul>
 */
public class MessageCMN00207BusinessProcess extends EadBusinessProcess
{
	private static final Logger log = LoggerFactory.getLogger( MessageCMN00207BusinessProcess.class );
	
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );		
		ArchDocUpdateType archDocUpdate = recvEnv.getDocument( ).getDocumentAsClass( ArchDocUpdateType.class );

		// 
		
		checkDeclarantArchiveRights( jobBatchContext, archDocUpdate.getArchDeclID( ) );
		 
		//
		
		Edarch_Archive_Docs replaceDoc = replaceDocument( archDocUpdate, jobBatchContext );
		
		//
		
		ResultCreator crt = new ResultCreator( );
		crt.setRefDocumentId( archDocUpdate.getDocumentID( ) );
		crt.setResultCode( ResultCodes._00_00000_00 );
		crt.setEadArchId( replaceDoc.getArdocArchIdinternal( ) );
		crt.setEadArchDocId( replaceDoc.getArdocIdinternal( ) );
		crt.setEadArchDeclId( archDocUpdate.getArchDeclID( ) );
		crt.setEadArchDocStatus( getStatus( replaceDoc ) );
		crt.setJobBatchContext( jobBatchContext );
		
		ResultType result = crt.generate( );
		
		packCMN_00003( result, jobBatchContext, jobContext );
	}
	
	private String getStatus( Edarch_Archive_Docs archDoc )
	{
		return null == archDoc ? null : archDoc.getArdocStageStatus( );
	}
	
	private Edarch_Archive_Docs replaceDocument( 
			ArchDocUpdateType archDocUpdateReq,
			EDJobBatchContext jobBatchContext ) 
		throws BaseProcessingException, DatabaseException
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		EdarchService edarchService = _serviceHolder.getEdarchService( );
		EdarchOperator edarchOperator = _serviceHolder.getEdarchOperator( );
		
		// Проверка
		
		String archId = archDocUpdateReq.getArchID( );
		String archDocId = archDocUpdateReq.getArchDocID( );
		
		/**
		 * Проверка на существование исходного документа с заданными параметрами
		 */
		Edarch_Archive_Docs initDoc = edarchService.getArchDocument( archDocId, archId );
		if ( null == initDoc )
			throwException( jobBatchContext, ResultCodes._10_00004_02 );
		
		/**
		 * Ищем последний документ в цепочке, если не находим - то плохо, где то ошибка
		 * в связях в базе		
		 */
		Edarch_Archive_Docs archDoc = edarchOperator.getActualDocumentByPrevious( initDoc, new HashMap< String, Object >( ) );
		if ( null == archDoc )
			throwException( jobBatchContext, ResultCodes._10_00004_02 );
		
		//
		
		String customsCode = recvEnv.getReceiverCustoms( ).getCustomsCode( );
		LocalDate endDate = archDocUpdateReq.getDocumentEndDate( );
		
		Edarch_Archive_Docs newDoc = edarchOperator.createDocument( customsCode, endDate );
		
		ArcDocType replaceDoc = archDocUpdateReq.getArchDoc( );
		
		EDDocument tmp = new EDDocument( replaceDoc.getAny( ) );		
		String newDocumentModeId = tmp.getDocumentModeID( );
		String oldDocumentModeId = archDoc.getArdocDocType( );
		
		/**
		 * Старый и новый документы отличаются по типу прикладного документа - так нельзя.
		 */
		if ( null == newDocumentModeId || null == oldDocumentModeId ||
			 ! oldDocumentModeId.equalsIgnoreCase( newDocumentModeId ) )
		{
			throwException( jobBatchContext, ResultCodes._10_00005_06 );
		}
		
		boolean docCorrect = true;
		if ( null != archDoc.getArdocDocCode( ) )
		{
			docCorrect = edarchOperator.isDocCodeCorrespondsDocModeId( 
				archDoc.getArdocDocCode( ), archDoc.getArdocDocType( ) 
			);
		}
		
		if ( ! docCorrect )
		{
			/** Код документа в базе по графе 44 не совпадает с кодом нового документа */
			throwException( jobBatchContext, ResultCodes._10_00005_05 );
		}
		
		if ( ArchiveDocumentStatuses.isActive( archDoc.getArdocStageStatus( ) ) )
		{
			/** Документ заменен или удален, или истек срок действия */
			throwException( jobBatchContext, ResultCodes._10_00005_02 );
		}
		
		if ( null != archDoc.getArdocRefNextDocumentid( ) )
		{
			/** Не последний документ в цепочке */
			throwException( jobBatchContext, ResultCodes._10_00005_03 );
		}
				
		newDoc.setArdocRefNextDocumentid( null );
		newDoc.setArdocArchIdinternal( archDoc.getArdocArchIdinternal( ) );
		newDoc.setArdocDocName( archDoc.getArdocDocName( ) );
		newDoc.setArdocFromDate( archDoc.getArdocFromDate( ) );
		newDoc.setArdocToDate( archDoc.getArdocToDate( ) );
		newDoc.setArdocDocumentDate( archDoc.getArdocDocumentDate( ) );
		newDoc.setArdocCreateDate( new Date( ) );
		newDoc.setArdocDocumentid( tmp.getDocumentID( ) );
		
		newDoc.setArdocRefdocumentid( archDoc.getArdocDocumentid( ) );
		archDoc.setArdocRefNextDocumentid( newDoc.getArdocDocumentid( ) );
		
		newDoc.setArdocDocCode( archDoc.getArdocDocCode( ) );		
		newDoc.setArdocDocType( tmp.getDocumentModeID( ) );
		newDoc.setArdocPrDocumentNumber( archDoc.getArdocPrDocumentNumber( ) );
		
		edarchService.merge( archDoc );
		
		edarchService.persist( newDoc );
		edarchOperator.fillDataFromAny( newDoc, replaceDoc.getAny( ) );
		
		log.info( String.format(
			"По сообщению %s была произведена замена документа %s на документ %s в архиве %s",
			recvEnv.getEnvelopeID( ), 
			archDoc.getArdocIdinternal( ), newDoc.getArdocIdinternal( ),
			archId
		) );
		
		Edarch_Archive_Docs res = prepareActualResult( initDoc, archDoc );
		res.setArdocArchIdinternal( newDoc.getArdocArchIdinternal( ) );
		res.setArdocIdinternal( newDoc.getArdocIdinternal( ) );
		return res;
	}
}
