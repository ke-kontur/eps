package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.kind.ArchiveDocumentStatuses;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edarch_Archive_Docs;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.persistence.operators.EdarchOperator;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.ResultCreator;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.utils.StringUtil;
import ru.acs.fts.schemas.album.archdocdeleterequest.ArchDocDeleteRequestType;
import ru.acs.fts.schemas.album.result.ResultType;

/**
 * Запрос на удаление документа из архива
 * 
 * <h2>Параметры JobBatch</h2>
 * <ul>
 * <li><strong>envelopeName</strong> - имя конверта, который будет сгенерировать и размещён в JobBatchContext</li>
 * </ul>
 */
public class MessageCMN00208BusinessProcess extends EadBusinessProcess
{
	private static final Logger log = LoggerFactory.getLogger( MessageCMN00208BusinessProcess.class );
	
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext )
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );		
		ArchDocDeleteRequestType request = recvEnv.getDocument( ).getDocumentAsClass( ArchDocDeleteRequestType.class );
		
		//
		
		checkDeclarantArchiveRights( jobBatchContext, request.getArchDeclID( ) );
		
		//

		Edarch_Archive_Docs delDoc = removeArchDocument( request, jobBatchContext );
		
		log.info( String.format(
			"По сообщению %s был удален документ %s в архиве %s",
			recvEnv.getEnvelopeID( ), delDoc.getArdocIdinternal( ), delDoc.getArdocArchIdinternal( )
		) );
		
		//
		
		ResultCreator crt = new ResultCreator( );
		crt.setRefDocumentId( request.getDocumentID( ) );
		crt.setResultCode( ResultCodes._00_00000_00 );
		crt.setEadArchId( request.getArchID( ) );
		crt.setEadArchDocId( request.getArchDocID( ) );
		crt.setEadArchDeclId( request.getArchDeclID( ) );
		crt.setEadArchDocStatus( getStatus( delDoc ) );
		crt.setJobBatchContext( jobBatchContext );
		
		ResultType result = crt.generate( );
		
		packCMN_00003( result, jobBatchContext, jobContext );
	}
	
	private String getStatus( Edarch_Archive_Docs archDoc )
	{
		return null == archDoc ? null : archDoc.getArdocStageStatus( );
	}
	
	public Edarch_Archive_Docs removeArchDocument(
			ArchDocDeleteRequestType request,
			EDJobBatchContext jobBatchContext ) 
		throws BaseProcessingException, DatabaseException
	{
		EdarchOperator edarchOperator = _serviceHolder.getEdarchOperator( );
		
		// Проверки
		
		String archDocId = request.getArchDocID( );
		String archDocumentId = request.getArchDocumentID( );
		
		Map< String, Object > args = new HashMap< String, Object >( );

		Edarch_Archive_Docs initDoc = edarchOperator.getInitialDocument( archDocId, archDocumentId, args );
		if ( null == initDoc )
		{
			/** По указанным идентификаторам не найден исходный документ */
			throwException( jobBatchContext, ResultCodes._10_00001_01 );
		}
		
		Edarch_Archive_Docs archDoc = edarchOperator.getActualDocumentByPrevious( initDoc, args );
		if ( null == archDoc )
		{
			/** Не удалось получить последний документ в цепочке */
			throwException( jobBatchContext, ResultCodes._10_00004_02 );
		}
		
		if ( ! StringUtil.isNullOrEmpty( archDoc.getArdocRefNextDocumentid( ) ) ||
			 args.containsKey( "ACTIVE" ) )
		{
			/** Документ не является последним в цепочке */
			throwException( jobBatchContext, ResultCodes._10_00005_04 );
		}
		
		String status = archDoc.getArdocStageStatus( );
		if ( ! ArchiveDocumentStatuses.isNew( status ) )
		{
			/** Документ удален, заменен или устарел */
			throwException( jobBatchContext, ResultCodes._10_00005_01 );
		}
		
		//
		
		edarchOperator.recurseRemoveDocument( initDoc );
		
		return prepareActualResult( initDoc, archDoc );
	}
}
