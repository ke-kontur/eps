package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.Date;

import org.joda.time.LocalDate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edarch_Archive;
import ru.acs.fts.eps2.model.entities.Edarch_Archive_Docs;
import ru.acs.fts.eps2.model.services.EdarchService;
import ru.acs.fts.eps2.router.objects.EDDocument;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.persistence.operators.EdarchOperator;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.ResultCreator;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.schemas.album.archadddocrequest.ArchAddDocRequestType;
import ru.acs.fts.schemas.album.archadddocrequest.ArchDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.result.ResultType;

/**
 * Запрос на помещение документа в архив
 * 
 * <h2>Параметры JobBatch</h2>
 * <ul>
 * <li><strong>envelopeName</strong> - имя конверта, который будет сгенерировать и размещён в JobBatchContext</li>
 * </ul>
 */
public class MessageCMN00202BusinessProcess extends EadBusinessProcess
{
	private static final Logger log = LoggerFactory.getLogger( MessageCMN00202BusinessProcess.class );
	
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		ArchAddDocRequestType archAddDocReq = recvEnv.getDocument( ).getDocumentAsClass( ArchAddDocRequestType.class );

		//
		
		checkDeclarantArchiveRights( jobBatchContext, archAddDocReq.getArchDeclID( ) );
		
		//
				
		Edarch_Archive_Docs doc = addDocument( recvEnv, archAddDocReq, jobBatchContext );
		
		log.info( String.format(
			"По сообщению %s создали документ %s в архиве %s",
			recvEnv.getEnvelopeID( ), doc.getArdocArchIdinternal( ), doc.getArdocIdinternal( )
		) );
		
		//
		
		ResultCreator crt = new ResultCreator( );
		
		crt.setRefDocumentId( archAddDocReq.getDocumentID( ) );
		crt.setResultCode( ResultCodes._00_00000_00 );
		crt.setEadArchId( archAddDocReq.getArchID( ) );
		crt.setEadArchDocId( doc.getArdocIdinternal( ) );
		crt.setEadArchDeclId( archAddDocReq.getArchDeclID( ) );
		crt.setEadArchDocStatus( doc.getArdocStageStatus( ) );
		crt.setJobBatchContext( jobBatchContext );
		
		ResultType result = crt.generate( );
		
		packCMN_00003( result, jobBatchContext, jobContext );
	}
	
	private Edarch_Archive_Docs addDocument( 
			EDEnvelope recvEnv, ArchAddDocRequestType archAddDocReq,
			EDJobBatchContext jobBatchContext )
		throws BaseProcessingException, DatabaseException
	{
		EdarchOperator edarchOperator = _serviceHolder.getEdarchOperator( );
		EdarchService edarchService = _serviceHolder.getEdarchService( );

		String archiveId = archAddDocReq.getArchID( );
		String docCode = archAddDocReq.getDocCode( );

		ArchDocType archDoc = archAddDocReq.getArchDoc( );
		
		// Проверки
		
		Edarch_Archive archive = edarchService.getArchive( archiveId );
		
		if ( null == archive || edarchOperator.isClosedOrRemoved( archive ) )
		{
			throwException( jobBatchContext, ResultCodes._10_00002_01 );
		}

		EDDocument tmp = new EDDocument( archDoc.getAny( ) );		
		String documentModeId = tmp.getDocumentModeID( );
		
		if ( ! edarchOperator.isDocCodeCorrespondsDocModeId( docCode, documentModeId ) )
		{
			throwException( jobBatchContext, ResultCodes._10_00008_01 );
		}
		
		// Формируем документ
		
		String customsCode = recvEnv.getReceiverCustoms( ).getCustomsCode( );		

		LocalDate endDate = archAddDocReq.getDocumentEndDate( );
		LocalDate beginDate = archAddDocReq.getDocumentBeginDate( );
		
		Edarch_Archive_Docs doc = edarchOperator.createDocument( customsCode, endDate );
		
		doc.setArdocArchIdinternal( archiveId );
		doc.setArdocFromDate( convertToDate( beginDate ) );
		doc.setArdocToDate( convertToDate( endDate ) );
		doc.setArdocCreateDate( new Date( ) );

		DocumentBaseType docBaseInfo = archAddDocReq.getDocBaseInfo( );
		if ( null != docBaseInfo )
		{
			doc.setArdocDocName( docBaseInfo.getPrDocumentName( ) );
			doc.setArdocDocumentDate( convertToDate( docBaseInfo.getPrDocumentDate( ) ) );
			doc.setArdocPrDocumentNumber( docBaseInfo.getPrDocumentNumber( ) );
		}
		
		doc.setArdocRefdocumentid( null );
		doc.setArdocRefNextDocumentid( null );
		
		doc.setArdocDocCode( docCode );		
		doc.setArdocDocType( documentModeId );
		doc.setArdocDocumentid( tmp.getDocumentID( ) );
		
		String softVersion = recvEnv.getSoftVersion( );
		if ( null != softVersion&& softVersion.length( ) > 6 )
		{
			String[ ] parts = softVersion.split( "/" );
			if ( null != parts && parts.length > 0 )
				softVersion = parts[ 0 ];
		}
		doc.setArdocAlbumVersion( softVersion );		
		
		edarchService.persist( doc );		
		edarchOperator.fillDataFromAny( doc, archDoc.getAny( ) );
		
		return doc;
	}
	
	private Date convertToDate( LocalDate date )
	{
		return null == date ? null : date.toDate( );
	}
	
}
