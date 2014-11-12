package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edarch_Archive;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.persistence.operators.EdarchOperator;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.ResultCreator;
import ru.acs.fts.schemas.album.archcreaterequest.ArchCreateRequestType;
import ru.acs.fts.schemas.album.result.ResultType;

/**
 * Запрос на создание архива
 * 
 * <h2>Параметры JobBatch</h2>
 * <ul>
 * <li><strong>envelopeName</strong> - имя конверта, который будет сгенерировать и размещён в JobBatchContext</li>
 * </ul>
 */
public class MessageCMN00201BusinessProcess extends EadBusinessProcess
{
	private static final Logger log = LoggerFactory.getLogger( MessageCMN00201BusinessProcess.class );
	
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );

		ArchCreateRequestType archCreateReq = recvEnv.getDocument( ).getDocumentAsClass( ArchCreateRequestType.class ); 
			
		String declId = archCreateReq.getArchDeclID( );
		String archiveName = archCreateReq.getArchiveName( );

		EdarchOperator edarchOperator = _serviceHolder.getEdarchOperator( );

		Edarch_Archive archive = edarchOperator.createAndPersistArchive(
				declId, archiveName,
				recvEnv.getReceiverCustoms( ).getCustomsCode( )
		);

		log.info( String.format(
			"По сообщению %s был создан архив декларанта: %s",
			recvEnv.getEnvelopeID( ), archive.getIdInternal( )
		) );
		
		//
		
		ResultCreator crt = new ResultCreator( );
		crt.setRefDocumentId( archCreateReq.getDocumentID( ) );
		crt.setResultCode( ResultCodes._00_00000_00 );
		crt.setEadArchId( archive.getIdInternal( ) );
		crt.setEadArchDeclId( declId );
		crt.setJobBatchContext( jobBatchContext );
		
		ResultType result = crt.generate( );
		
		packCMN_00003( result, jobBatchContext, jobContext );
	}
}
