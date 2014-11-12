package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.data.kind.DocumentModeIDs;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edarch_Archive;
import ru.acs.fts.eps2.model.entities.Edarch_Archive_Docs;
import ru.acs.fts.eps2.model.entities.Edarch_Read_Access;
import ru.acs.fts.eps2.model.services.EdarchService;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.util.helpers.UUIDGen;
import ru.acs.fts.schemas.album.archpermitparticipantsinfo.ArchDocumentType;
import ru.acs.fts.schemas.album.archpermitparticipantsinfo.ArchPermitParticipantsInfoType;
import ru.acs.fts.schemas.album.archpermitparticipantsinfo.ArchiveType;
import ru.acs.fts.schemas.album.archpermitparticipantsinfo.ParticipantType;
import ru.acs.fts.schemas.album.result.EADInfoType;
import ru.acs.fts.schemas.album.result.ResponseType;
import ru.acs.fts.schemas.album.result.ResultInformationType;
import ru.acs.fts.schemas.album.result.ResultType;

/**
 * Добавление доступа чтения архива декларанта
 * 
 * <h2>Параметры JobBatch</h2>
 * <ul>
 * <li><strong>envelopeName</strong> - имя конверта, который будет сгенерировать и размещён в JobBatchContext</li>
 * </ul>
 */
public class MessageCMN00214BusinessProcess extends BusinessProcess
{
	private static final Logger log = LoggerFactory.getLogger( MessageCMN00214BusinessProcess.class );

	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		ArchPermitParticipantsInfoType archPermit = recvEnv.getDocument( ).getDocumentAsClass( ArchPermitParticipantsInfoType.class );	

		//
		
		ResultType response = processGrantRequest( archPermit, jobBatchContext );

		EDEnvelope respEnvelope = EnvelopeCreator.createResponseMessage(
			MessageType.CMN_00003, recvEnv, response, 
			BusinessSystems.DECLARANT, null
		);
		
		//

		List< EDEnvelope > envelopesUnsigned = createAndPutEnvelopesUnsigned( jobBatchContext, jobContext );
		envelopesUnsigned.add( respEnvelope );
	}

	private ResultInformationType grantAccess( String envelopeId, String participantId, String archId, String archDocId ) 
		throws DatabaseException
	{
		Edarch_Read_Access readAccess = new Edarch_Read_Access( );
		readAccess.setParticipantId( participantId );
		readAccess.setIdInternal( archDocId );
		readAccess.setArchIdInternal( archId );

		_serviceHolder.getEdarchService( ).persist( readAccess );

		ResultInformationType resultInfo = new ResultInformationType( );

		EADInfoType eadInfo = new EADInfoType( );
		eadInfo.setArchID( archId );

		// String archDocId = archDocument.getArchDocID( );
		eadInfo.setArchDocID( archDocId );

		List< EADInfoType > list = new ArrayList< EADInfoType >( );
		list.add( eadInfo );
		resultInfo.setEADInfoList( list );

		resultInfo.setResultCode( "00.00000.00" );
		
		log.info( String.format( 
			"По сообщению %s декларанту %s был предоставлен доступ на чтение к документу %s в архиве %s",
			envelopeId, participantId, archDocId, archId
		) );

		return resultInfo;
	}
	
	private List< ResultInformationType > processDocuments( 
			String archId, String participantId, 
			List< ArchDocumentType > archDocs,
			EDJobBatchContext jobBatchContext ) 
		throws DatabaseException, BaseProcessingException
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		EdarchService edarchService = _serviceHolder.getEdarchService( );
		List< ResultInformationType > resInfos = new ArrayList< ResultInformationType >( );
		
		for ( ArchDocumentType archDocument : archDocs )
		{
			String archDocId = archDocument.getArchDocID( );

			Edarch_Archive_Docs archiveDoc = edarchService.getDocument( archId, archDocId );
			if ( null == archiveDoc )
			{
				throwException( jobBatchContext, ResultCodes._10_00004_02 );
			}

			ResultInformationType resultInfo = grantAccess(
				recvEnv.getEnvelopeID( ),
				participantId, archId, archDocId 
			);
			resInfos.add( resultInfo );
		}
		
		return resInfos;
	}
	
	private List< ResultInformationType > processArchives(
			String participantId,
			List< ArchiveType > archives,
			EDJobBatchContext jobBatchContext ) 
		throws BaseProcessingException, DatabaseException
	{
		EdarchService edarchService = _serviceHolder.getEdarchService( );
		List< ResultInformationType > results = new ArrayList< ResultInformationType >( );
		
		for ( ArchiveType archive : archives )
		{
			String archId = archive.getArchID( );
			
			Edarch_Archive edarchArchive = edarchService.getArchive( archId ); 
			if ( null == edarchArchive )
			{
				throwException( jobBatchContext, ResultCodes._10_00002_01 );
			}

			if ( ! edarchArchive.getDecl( ).equalsIgnoreCase( participantId ) || 
				 ! edarchArchive.getIdInternal( ).equalsIgnoreCase( archive.getArchID( ) ) )
			{
				throwException( jobBatchContext, ResultCodes._03_00106_04 );
			}

			List< ResultInformationType > resInfos = processDocuments( 
				archive.getArchID( ), participantId, 
				archive.getArchDocumentList( ), jobBatchContext 
			);
			
			results.addAll( resInfos );
		}		
		
		return results;
	}
	
	private ResultType processGrantRequest( 
			ArchPermitParticipantsInfoType archPermit,
			EDJobBatchContext jobBatchContext ) 
		throws BaseProcessingException, DatabaseException
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		ResultType res = new ResultType( );
		res.setDocumentID( UUIDGen.getUUID( ).toString( ) );
		res.setRefDocumentID( recvEnv.getDocument( ).getDocumentID( ) );
		res.setDocumentModeID( DocumentModeIDs.RESULT );
		
		List< ResponseType > responseList = new ArrayList< ResponseType >( );
		res.setResponseList( responseList );		

		ResponseType response = new ResponseType( );
		responseList.add( response );

		response.setRefDocumentID( recvEnv.getDocument( ).getDocumentID( ) );

		List< ResultInformationType > resultInformations = new ArrayList< ResultInformationType >( );
		response.setResultInformationList( resultInformations );

		List< ParticipantType > participants = archPermit.getParticipantList( );
		for ( ParticipantType participant : participants )
		{
			String participantId = participant.getParticipantID( );
			
			List< ResultInformationType > resInfos = processArchives( 
				participantId, participant.getArchiveList( ), 
				jobBatchContext 
			);
			resultInformations.addAll( resInfos );
		}
		
		return res;
	}
}
