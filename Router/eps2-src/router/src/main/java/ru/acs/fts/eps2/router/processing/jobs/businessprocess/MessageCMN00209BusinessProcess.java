package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edarch_Archive;
import ru.acs.fts.eps2.model.entities.Edarch_Archive_Docs;
import ru.acs.fts.eps2.model.services.EdarchService;
import ru.acs.fts.eps2.model.services.ead.ArchiveStageStatuses;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.ResultCreator;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.utils.CollectionHelper;
import ru.acs.fts.schemas.album.archdeleterequest.ArchDeleteRequestType;
import ru.acs.fts.schemas.album.result.ResultType;

/**
 * Запрос на удаление архива
 * 
 * <h2>Параметры JobBatch</h2>
 * <ul>
 * <li><strong>envelopeName</strong> - имя конверта, который будет сгенерировать и размещён в JobBatchContext</li>
 * </ul>
 */
public class MessageCMN00209BusinessProcess extends EadBusinessProcess
{
	private static final Logger log = LoggerFactory.getLogger( MessageCMN00209BusinessProcess.class );
	
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );		
		ArchDeleteRequestType archDeleteReq = recvEnv.getDocument( ).getDocumentAsClass( ArchDeleteRequestType.class );	

		//
		
		checkDeclarantArchiveRights( jobBatchContext, archDeleteReq.getArchDeclID( ) );
		
		//

		Edarch_Archive delArch = removeArchive( archDeleteReq.getArchID( ), jobBatchContext );
		
		log.info( String.format(
			"По сообщению %s был удален архив %s",
			recvEnv.getEnvelopeID( ), delArch.getIdInternal( )
		) );
		
		//
		
		ResultCreator crt = new ResultCreator( );
		crt.setRefDocumentId( archDeleteReq.getDocumentID( ) );
		crt.setResultCode( ResultCodes._00_00000_00 );
		crt.setEadArchId( archDeleteReq.getArchID( ) );
		crt.setEadArchDeclId( archDeleteReq.getArchDeclID( ) );
		crt.setJobBatchContext( jobBatchContext );
		
		ResultType result = crt.generate( );
		
		packCMN_00003( result, jobBatchContext, jobContext );
	}
	
	private Edarch_Archive removeArchive( String archiveId, EDJobBatchContext jobBatchContext ) 
		throws BaseProcessingException, DatabaseException
	{
		EdarchService edarchService = _serviceHolder.getEdarchService( );
		
		Edarch_Archive archive = edarchService.getArchive( archiveId );		
		if ( null == archive )
		{
			/** Нет такого архива */
			throwException( jobBatchContext, ResultCodes._10_00002_01 );
		}
		
		List< Edarch_Archive_Docs > archiveDocuments = edarchService.getDocuments( archiveId );
		
		boolean canRemove = CollectionHelper.isNullOrEmpty( archiveDocuments );
		
		if ( ! canRemove )
		{
			/** Архив не пуст, надо сначала удалить все его документы */
			throwException( jobBatchContext, ResultCodes._10_00003_01 );
		}
		
		archive.setStageStatus( ArchiveStageStatuses.ARCH_STATUS_REMOVE );
		edarchService.merge( archive );
		
		return archive;
	}
}
