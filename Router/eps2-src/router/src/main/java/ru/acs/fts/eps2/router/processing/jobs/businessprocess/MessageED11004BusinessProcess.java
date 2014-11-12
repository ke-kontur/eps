package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edecl_G44_Docmodid;
import ru.acs.fts.eps2.model.entities.Edecl_Messages;
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.model.entities.Edecl_Reqdoc_Info;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDDocument;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.objects.defines.DocumentUniquenesses;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.util.helpers.UUIDGen;
import ru.acs.fts.eps2.utils.StringUtil;
import ru.acs.fts.schemas.album.eps_docresponse.EPSDocResponseType;

public class MessageED11004BusinessProcess extends BusinessProcess
{	
	private static final String TRANSIT_MESSAGE_NAME = "transitMessage";
	
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );

		EPSDocResponseType doc = recvEnv.getDocument( ).getDocumentAsClass( EPSDocResponseType.class );

		String initialEnvelopeId = checkInitialEnvelopeId( recvEnv, jobBatchContext );
		/* String refDocumentId = */ checkRefDocumentId( recvEnv, jobBatchContext );
		
		String requestPositionId = doc.getDocResponse( ).getRequestPositionID( );
		
		// EDDocument rdoc = ( EDDocument )recvEnv.getDocument( ).getContainerDocuments( ).get( 0 );
		EDDocument rdoc = null;
		for ( String cDocId : recvEnv.getDocument( ).getContainerDocuments( ).keySet( ) )
		{
			rdoc = recvEnv.getDocument( ).getDocumentInContainer( cDocId );
			break;
		}
		
		String documentModeId = rdoc.getDocumentModeID( );
		
		String incomeEnvelopeId = _serviceHolder.getEnvelopeService( ).getIncomeEnvelopeIdByInitialEnvelopeId( initialEnvelopeId );
		
		Edecl_Reqdoc_Info rdocInfo = _serviceHolder.getEnvelopeService( ).getReqDocInfo( requestPositionId, incomeEnvelopeId );
		if ( null == rdocInfo )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._02_00001_01, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
		
		String processId = recvEnv.getProcessID( );
		Edecl_Proc_Information procInfo = _serviceHolder.getProcedureService( ).getProcInformation( processId );
		if ( null != procInfo &&
			 ( procInfo.getFlags( ) & Edecl_Proc_Information.FLAG_PROC_ISSUED ) == Edecl_Proc_Information.FLAG_PROC_ISSUED )
		{
			if ( ( rdocInfo.getFlags( ) & Edecl_Reqdoc_Info.FLAG_ALLOWED_AFTER_ISSUE ) != Edecl_Reqdoc_Info.FLAG_ALLOWED_AFTER_ISSUE )
			{
				ErrorHelper.throwException(
					jobBatchContext,
					ResultCodes._03_00106_06, // TODO: Подобрать правильный код
					ProcessingConstants.ERROR_TYPE_BUSINESS
				);
			}
		}
		
		String docCode = rdocInfo.getDocCode( );
		
		Edecl_G44_Docmodid g44rel = _serviceHolder.getG44Service( ).getG44Relation( docCode, documentModeId );
        if ( null == g44rel &&
                ((( rdocInfo.getFlags( ) & Edecl_Reqdoc_Info.FLAG_ALLOWED_GRAPHIC ) != Edecl_Reqdoc_Info.FLAG_ALLOWED_GRAPHIC) ||
                (( rdocInfo.getFlags( ) & Edecl_Reqdoc_Info.FLAG_ALLOWED_GRAPHIC ) == Edecl_Reqdoc_Info.FLAG_ALLOWED_GRAPHIC &&
                        "09020 09021 09022 09023".contains(docCode))))
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._09_00000_32,
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
		
		Edecl_Messages msg11003 = _serviceHolder.getEnvelopeService( ).getEnvelope( incomeEnvelopeId );
		if ( null == msg11003 )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._02_00001_01, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
		
		doc.setDocumentID( UUIDGen.getUUID( ).toString( ) );
		doc.setRefDocumentID( msg11003.getDocumentId( ) );
		
		EDEnvelope respEnvelope = EnvelopeCreator.createTranzitMessage( 
			null, recvEnv, 
			BusinessSystems.CUSTOMS, recvEnv.getReceiverCustoms( )
		);
		
		respEnvelope.getEDHeader( ).setMessageType( MessageType.MSG_11004 );
		respEnvelope.setInnerDocument( doc );
		for ( String cDocId : respEnvelope.getDocument( ).getContainerDocuments( ).keySet( ) )
		{
			EDDocument cdoc = respEnvelope.getDocument( ).getDocumentInContainer( cDocId );
			cdoc.setUniqueness( DocumentUniquenesses.NOT_UNIQ );
		}
		
		respEnvelope.setInitialEnvelopeID( msg11003.getEnvelopeId( ) );
								
		String transitMessageName = jobContext.getString( TRANSIT_MESSAGE_NAME );
		jobBatchContext.put( transitMessageName, respEnvelope );
	}

	private String checkInitialEnvelopeId( EDEnvelope recvEnv, EDJobBatchContext jobBatchContext )
			throws ResultTypeException, DatabaseException
	{
		String initialEnvelopeId = recvEnv.getInitialEnvelopeID( );
		
		if ( StringUtil.isNullOrEmpty( initialEnvelopeId ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._03_00028_01, 
				ProcessingConstants.ERROR_TYPE_CHECK 
			);
		}
		
		return initialEnvelopeId;
	}
	
	private String checkRefDocumentId( EDEnvelope recvEnv, EDJobBatchContext jobBatchContext )
		throws ResultTypeException, DatabaseException
	{
		String refDocumentId = recvEnv.getDocument( ).getRefDocumentID( );
		
		if ( StringUtil.isNullOrEmpty( refDocumentId ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._03_00027_01, 
				ProcessingConstants.ERROR_TYPE_CHECK 
			);
		}
		
		return refDocumentId;
	}
}
