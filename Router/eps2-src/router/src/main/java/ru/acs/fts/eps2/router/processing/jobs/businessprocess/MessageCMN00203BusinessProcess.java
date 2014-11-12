package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.List;

import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.data.kind.DocumentModeIDs;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edarch_Archive;
import ru.acs.fts.eps2.model.services.EdarchService;
import ru.acs.fts.eps2.model.services.ead.ArchiveStageStatuses;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.util.helpers.UUIDGen;
import ru.acs.fts.schemas.album.archlist.ArchListType;
import ru.acs.fts.schemas.album.archlist.ArchiveListType;
import ru.acs.fts.schemas.album.archlistrequest.ArchListRequestType;

/**
 * Запрос на получение списка архивов
 * 
 * <h2>Параметры JobBatch</h2>
 * <ul>
 * <li><strong>envelopeName</strong> - имя конверта, который будет сгенерировать и размещён в JobBatchContext</li>
 * </ul>
 */
public class MessageCMN00203BusinessProcess extends EadBusinessProcess
{
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		ArchListRequestType archListReq = recvEnv.getDocument( ).getDocumentAsClass( ArchListRequestType.class );

		// 
		
		checkDeclarantArchiveRights( jobBatchContext, archListReq.getArchDeclID( ) );
		
		//
		
		ArchListType archList = getArchListType( archListReq );
		
		pack( MessageType.CMN_00204, archList, jobBatchContext, jobContext );
	}
	
	private ArchListType getArchListType( ArchListRequestType archListReq ) 
		throws DatabaseException
	{
		EdarchService edarchService = _serviceHolder.getEdarchService( );

		String archDeclId = archListReq.getArchDeclID( );		
		List< Edarch_Archive > archives = edarchService.getArchivesByDecl( archDeclId );
		
		ArchListType archList = new ArchListType( );
		archList.setDocumentID( UUIDGen.getUUID( ).toString( ) );
		archList.setRefDocumentID( archListReq.getDocumentID( ) );
		archList.setDocumentModeID( DocumentModeIDs.ARCH_LIST );
		
		if ( null != archives && 0 != archives.size( ) )
		{
			for ( Edarch_Archive archive : archives )
			{
				if ( archive.getStageStatus( ).equalsIgnoreCase( ArchiveStageStatuses.ARCH_STATUS_REMOVE ) )
					continue;
				
				ArchiveListType arch = new ArchiveListType( );
				arch.setArchID( archive.getIdInternal( ) );
				arch.setArchName( archive.getArchName( ) );
				
				archList.getArchiveList( ).add( arch );
			}
		}
		
		return archList;
	}
}
