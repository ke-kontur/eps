package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.List;

import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edecl_Messages;
import ru.acs.fts.eps2.model.entities.Edecl_Reqdoc_Info;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDDocument;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.objects.defines.DocumentSaveTypes;
import ru.acs.fts.eps2.router.objects.defines.DocumentUniquenesses;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.util.helpers.UUIDGen;
import ru.acs.fts.eps2.utils.StringUtil;
import ru.acs.fts.schemas.album.eps_docresponse.EPSDocResponseType;
import ru.acs.fts.schemas.envelope.SignatureType;

public class MessageCMN10010BusinessProcess extends BusinessProcess
{	
	private static final String TRANSIT_MESSAGE_NAME = "transitMessage";
	
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		EPSDocResponseType doc = 
			recvEnv.getDocument( ).getDocumentAsClass( EPSDocResponseType.class );

		String refDocumentId = checkRefDocumentId( jobBatchContext );
		
		List< Edecl_Messages > msgs = _serviceHolder.getEnvelopeService( ).getEnvelopes_RefDocumentId( refDocumentId );
		if ( null == msgs || 0 == msgs.size( ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._03_00027_02, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);			
		}
		
		Edecl_Messages msg = null;
		for ( Edecl_Messages xmsg : msgs )
		{
			if ( null != xmsg.getIncomeEnvelopeId( ) )
			{
				msg = xmsg;
				break;
			}
		}
		
		if ( null == msg )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._03_00027_02, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);			
		}
		
		String initialEnvelopeId = msg.getEnvelopeId( );		
		String incomeEnvelopeId = _serviceHolder.getEnvelopeService( ).getIncomeEnvelopeIdByInitialEnvelopeId( initialEnvelopeId );
		
		String requestPositionId = doc.getDocResponse( ).getRequestPositionID( );
		
		Object rdoc = doc.getDocResponse( ).getDocResponseBody( ).getAny( );
		if ( rdoc instanceof SignatureType )
		{
			SignatureType sig = ( SignatureType )rdoc;
			rdoc = sig.getObject( ).getAny( );
		}
		
		Edecl_Reqdoc_Info rdocInfo = _serviceHolder.getEnvelopeService( ).getReqDocInfo( requestPositionId, incomeEnvelopeId );
		if ( null == rdocInfo )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._02_00001_01, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
				
		Edecl_Messages cmn10009 = _serviceHolder.getEnvelopeService( ).getEnvelope( initialEnvelopeId );
		if ( null == cmn10009 )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._02_00001_01, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
		
		doc.setDocumentID( UUIDGen.getUUID( ).toString( ) );
		doc.setRefDocumentID( cmn10009.getDocumentId( ) );
				
		EDEnvelope respEnvelope = EnvelopeCreator.createTranzitMessage( 
			null, recvEnv, 
			BusinessSystems.CUSTOMS, recvEnv.getReceiverCustoms( )
		);
		
		respEnvelope.setInnerDocument( doc );
		
		respEnvelope.getDocument( ).setSaveBody( true );
		respEnvelope.getDocument( ).setSaveType( DocumentSaveTypes.INSERT );
		respEnvelope.getDocument( ).setUniqueness( DocumentUniquenesses.UNIQ );
		for ( String cDocId : respEnvelope.getDocument( ).getContainerDocuments( ).keySet( ) )
		{
			EDDocument cdoc = respEnvelope.getDocument( ).getDocumentInContainer( cDocId );
			cdoc.setUniqueness( DocumentUniquenesses.NOT_UNIQ );
		}
		
		respEnvelope.setInitialEnvelopeID( incomeEnvelopeId );
		respEnvelope.setIncomeEnvelopeID( recvEnv.getEnvelopeID( ) );
		respEnvelope.getEDHeader( ).setSenderCustoms( null );
		respEnvelope.getEDHeader( ).setMessageType( MessageType.CMN_10010 );
								
		String transitMessageName = jobContext.getString( TRANSIT_MESSAGE_NAME );
		jobBatchContext.put( transitMessageName, respEnvelope );
	}
	
	private String checkRefDocumentId( EDJobBatchContext jobBatchContext )
		throws ResultTypeException, DatabaseException
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
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
