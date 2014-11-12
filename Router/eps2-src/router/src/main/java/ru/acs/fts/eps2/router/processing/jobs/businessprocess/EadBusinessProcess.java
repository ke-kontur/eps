package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import ru.acs.fts.custommarshaller.XStringMarshallableClass;
import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.configuration.Configurator;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.data.kind.DocumentModeIDs;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edarch_Archive_Docs;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.objects.defines.DocumentSaveTypes;
import ru.acs.fts.eps2.router.objects.defines.DocumentUniquenesses;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.util.helpers.UUIDGen;
import ru.acs.fts.schemas.album.archdocrequest.ArchDocRequestType;
import ru.acs.fts.schemas.album.archdocresponse.ArchDocResponseType;
import ru.acs.fts.schemas.album.archdocresponse.ArchDocumentType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.result.ResultType;

public abstract class EadBusinessProcess extends BusinessProcess
{
	protected BaseDocType createArchDocResponse( 
			Edarch_Archive_Docs archDoc, 
			byte[ ] data, ArchDocRequestType request )
	{
		ArchDocResponseType archDocResponse = new ArchDocResponseType( );
		
		archDocResponse.setDocumentID( UUIDGen.getUUID( ).toString( ) );
		archDocResponse.setRefDocumentID( request.getDocumentID( ) );
		archDocResponse.setDocumentModeID( DocumentModeIDs.ARCH_DOC_RESPONSE ); // 1005007E

		archDocResponse.setArchID( request.getArchID( ) );
		archDocResponse.setArchDocID( archDoc.getArdocIdinternal( ) );
		archDocResponse.setArchDeclID( request.getArchDeclID( ) );
		archDocResponse.setArchDocStatus( archDoc.getArdocStageStatus( ) );
		
		ArchDocumentType archDocument = new ArchDocumentType( );
		
		XStringMarshallableClass xstr = new XStringMarshallableClass( );
		xstr.setEncoding( Configurator.WORKING_ENCODING );
		xstr.setByteArray( data );
		
		archDocument.setAny( xstr );
		archDocResponse.setArchDocument( archDocument );
		
		return archDocResponse;
	}
	
	protected Edarch_Archive_Docs prepareActualResult( Edarch_Archive_Docs initDoc, Edarch_Archive_Docs actualDoc )
	{
		Edarch_Archive_Docs resultDoc = new Edarch_Archive_Docs( );
		resultDoc.setArdocIdinternal( initDoc.getArdocIdinternal( ) );
		resultDoc.setArdocDocumentid( initDoc.getArdocDocumentid( ) );
		
		resultDoc.setArdocAlbumVersion( actualDoc.getArdocAlbumVersion( ) );
		resultDoc.setArdocArchIdinternal( actualDoc.getArdocArchIdinternal( ) );
		resultDoc.setArdocCreateDate( actualDoc.getArdocCreateDate( ) );
		resultDoc.setArdocDocumentDate( actualDoc.getArdocDocumentDate( ) );
		resultDoc.setArdocDocCode( actualDoc.getArdocDocCode( ) );
		resultDoc.setArdocDocName( actualDoc.getArdocDocName( ) );
		resultDoc.setArdocDocType( actualDoc.getArdocDocType( ) );
		resultDoc.setArdocFromDate( actualDoc.getArdocFromDate( ) );
		resultDoc.setArdocPrDocumentNumber( actualDoc.getArdocPrDocumentNumber( ) );
		resultDoc.setArdocRefdocumentid( actualDoc.getArdocRefdocumentid( ) );
		resultDoc.setArdocStageStatus( actualDoc.getArdocStageStatus( ) );
		resultDoc.setArdocToDate( actualDoc.getArdocToDate( ) );
		resultDoc.setArdocRefNextDocumentid( actualDoc.getArdocRefNextDocumentid( ) );
		
		return resultDoc;
	}
	
	/**
	 * Функция проверяет, может ли декларант, отправиший сообщение
	 * работать с этим архивом. В данном случае архив должен быть исключительно его.
	 */
	protected void checkDeclarantArchiveRights( EDJobBatchContext jobBatchContext, String archDeclId ) 
		throws ResultTypeException, DatabaseException
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );		
		String participantId = recvEnv.getParticipantID( );
		
		if( ! participantId.equalsIgnoreCase( archDeclId ) )
		{			
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._10_00011_01, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}		
	}
	
	protected void packCMN_00003(
			ResultType result,
			EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws BaseProcessingException, DatabaseException
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		EDEnvelope cmn00003 = EnvelopeCreator.createResponseMessage(
			MessageType.CMN_00003, recvEnv, result, 
			BusinessSystems.DECLARANT, null 
		);
			
		cmn00003.getDocument( ).setSaveBody( true );
		cmn00003.getDocument( ).setSaveType( DocumentSaveTypes.INSERT );
		cmn00003.getDocument( ).setUniqueness( DocumentUniquenesses.UNIQ );
					
		jobBatchContext.put( 
			jobContext.getString( ContextConstants.ENVELOPE_NAME ), 
			cmn00003 
		);
	}
	
	protected void pack(
			String messageType, Object document,
			EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws BaseProcessingException, DatabaseException
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		EDEnvelope response = EnvelopeCreator.createResponseMessage(
			messageType, recvEnv, document, 
			BusinessSystems.DECLARANT, null 
		);
			
		response.getDocument( ).setSaveBody( true );
		response.getDocument( ).setSaveType( DocumentSaveTypes.INSERT );
		response.getDocument( ).setUniqueness( DocumentUniquenesses.UNIQ );
					
		jobBatchContext.put( 
			jobContext.getString( ContextConstants.ENVELOPE_NAME ), 
			response 
		);		
	}
}
