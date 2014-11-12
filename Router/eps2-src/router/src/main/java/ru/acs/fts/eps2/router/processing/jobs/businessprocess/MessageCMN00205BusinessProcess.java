package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

import org.joda.time.DateTime;

import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.data.kind.ArchiveDocumentStatuses;
import ru.acs.fts.eps2.engine.data.kind.DocumentModeIDs;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edarch_Archive;
import ru.acs.fts.eps2.model.entities.Edarch_Archive_Docs;
import ru.acs.fts.eps2.model.services.EdarchService;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.persistence.operators.EdarchOperator;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.util.helpers.UUIDGen;
import ru.acs.fts.eps2.util.time.TimeUtil;
import ru.acs.fts.schemas.album.archdoclistrequest.ArchDocListRequestType;
import ru.acs.fts.schemas.album.archdocumentlist.ArchDocumentListType;
import ru.acs.fts.schemas.album.archdocumentlist.ArchDocumentType;

/**
 * Запрос на получение списка документов в архиве
 * 
 * <h2>Параметры JobBatch</h2>
 * <ul>
 * <li><strong>envelopeName</strong> - имя конверта, который будет сгенерировать и размещён в JobBatchContext</li>
 * </ul>
 */
public class MessageCMN00205BusinessProcess extends EadBusinessProcess
{
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );		
		ArchDocListRequestType archDocListReq = recvEnv.getDocument( ).getDocumentAsClass( ArchDocListRequestType.class );
		
		ArchDocumentListType response = getArchDocumentList( 
			recvEnv.getParticipantID( ), archDocListReq, 
			jobBatchContext
		);
		
		pack( MessageType.CMN_00206, response, jobBatchContext, jobContext );
	}
	
	private ArchDocumentListType getArchDocumentList( 
			String participantId, ArchDocListRequestType archDocListReq,
			EDJobBatchContext jobBatchContext ) 
		throws ResultTypeException, DatabaseException
	{
		EdarchService edarchService = _serviceHolder.getEdarchService( );
		
		ArchDocumentListType archDocList = new ArchDocumentListType( );
		archDocList.setDocumentID( UUIDGen.getUUID( ).toString( ) );
		archDocList.setRefDocumentID( archDocListReq.getDocumentID( ) );
		archDocList.setDocumentModeID( DocumentModeIDs.ARCH_DOCUMENT_LIST );

		archDocList.setArchDeclID( archDocListReq.getArchDeclID( ) );
		archDocList.setArchID( archDocListReq.getArchID( ) );
		
		String archId = archDocListReq.getArchID( );
		Edarch_Archive archive = edarchService.getArchive( archId );
		boolean ownArchive = archive.getDecl( ).equalsIgnoreCase( participantId );
		
		List< Edarch_Archive_Docs > archiveDocuments = getDocsFromArchive( archId );
		
		for ( Edarch_Archive_Docs archiveDoc : archiveDocuments )
		{
			if ( ! ownArchive && ! edarchService.isAbleToReadDocument( archiveDoc, participantId ) )
				continue;
			
			archDocList.getDocumentInfoList( ).add( getArchDocument( archiveDoc ) );
		}
		
		return archDocList;
	}
	
	private ArchDocumentType getArchDocument( Edarch_Archive_Docs archDoc ) 
		throws DatabaseException
	{
		ArchDocumentType archDocument = new ArchDocumentType( );
		
		archDocument.setArchDocDate( getArchiveCreateDate( archDoc ).toString( ) );
		archDocument.setArchDocID( archDoc.getArdocIdinternal( ) );
		archDocument.setArchDocStatus( archDoc.getArdocStageStatus( ) );
		archDocument.setArchDocumentID( archDoc.getArdocDocumentid( ) );
		archDocument.setPrDocumentName( archDoc.getArdocDocName( ) );
		
		archDocument.setDocBeginDate( TimeUtil.convertToLocalDate( archDoc.getArdocFromDate( ) ) );
		archDocument.setDocEndDate( TimeUtil.convertToLocalDate( archDoc.getArdocToDate( ) ) );
		archDocument.setPrDocumentDate( TimeUtil.convertToLocalDate( archDoc.getArdocDocumentDate( ) ) );
		
		archDocument.setPrDocumentNumber( archDoc.getArdocPrDocumentNumber( ) );
		archDocument.setDocumentCode( archDoc.getArdocDocType( ) ); // именно так, и не как иначе
		
		return archDocument;
	}
	
	private DateTime getArchiveCreateDate( Edarch_Archive_Docs archDoc ) 
		throws DatabaseException
	{
		EdarchService edarchService = _serviceHolder.getEdarchService( );
		
		Edarch_Archive archive = edarchService.getArchive( archDoc.getArdocArchIdinternal( ) );
		DateTime archiveCreateDate = null;
		if ( null != archive )
			archiveCreateDate = TimeUtil.convertToDateTime( archive.getCreateDate( ) );
		
		return archiveCreateDate;
	}
	
	private List< Edarch_Archive_Docs > getDocsFromArchive( String archId ) 
		throws ResultTypeException, DatabaseException
	{
		EdarchService edarchService = _serviceHolder.getEdarchService( );
		EdarchOperator edarchOperator = _serviceHolder.getEdarchOperator( );
		
		List< Edarch_Archive_Docs > documents = new ArrayList< Edarch_Archive_Docs >( );
		List< Edarch_Archive_Docs > initDocs = edarchService.getDocsWithoutRefByArchive( archId );
		
		for ( Edarch_Archive_Docs initDoc : initDocs )
		{
			Edarch_Archive_Docs currentDoc = edarchOperator.getActualDocumentByPrevious( initDoc, new HashMap< String, Object >( ) );
			
			performStatusManipulations( currentDoc );
			
			documents.add( prepareActualResult( initDoc, currentDoc ) );
		}
		
		return documents;
	}
	
	private void performStatusManipulations( Edarch_Archive_Docs archDoc )
	{
		EdarchOperator edarchOperator = _serviceHolder.getEdarchOperator( );
		
		String status = archDoc.getArdocStageStatus( );
		if ( ! edarchOperator.isStageStatusActual( status ) )
			return ;

		Calendar currentDate = Calendar.getInstance( );
		Calendar endDate = TimeUtil.convertDateToCalendar( archDoc.getArdocToDate( ) );
		if ( null == endDate )
			return ;
		
		endDate.add( Calendar.HOUR_OF_DAY, 24 );
		if ( ! currentDate.before( endDate ) )
		{
			if ( ArchiveDocumentStatuses.isNewActual( status ) )
				archDoc.setArdocStageStatus( ArchiveDocumentStatuses.DOC_NEW_EXPIRE );
			
			if ( ArchiveDocumentStatuses.isActiveActual( status ) )
				archDoc.setArdocStageStatus( ArchiveDocumentStatuses.DOC_ACTIVE_EXPIRE );
		}
	}
}
