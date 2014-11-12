package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import ru.acs.fts.custommarshaller.EnvelopeUnmarshaller;
import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.helpers.MarshallingHelper;
import ru.acs.fts.eps2.model.entities.Edecl_Messages;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
import ru.acs.fts.eps2.model.services.EnvelopeService;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;

/**
 * 
 * @author SAA
 * <p>
 * JobContext:<p>
 * <b>envelopeName</b> - имя конверта транзитного сообщения, 
 * которое хранится в контексте сценария обработки
 */
public class MessageADM00006_CMN11062BusinessProcess extends BusinessProcess
{	
	private static final String CMN_00004_NOTIF = "cmn0004Notif";
	
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		String envelopeName = jobContext.getString( ContextConstants.ENVELOPE_NAME );
		EDEnvelope transit = ( EDEnvelope )jobBatchContext.get( envelopeName );

		EnvelopeService envelopeService = _serviceHolder.getEnvelopeService( );
		
		Edecl_Messages incomeMsg = jobBatchContext.getIncomeMessage( );
		Edecl_Msg_Doc incomeDoc = ( null != incomeMsg ) ? envelopeService.getDocument( incomeMsg.getDocumentId( ) ) : null;
		if ( null == incomeMsg || null == incomeDoc )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._03_00028_01, 
				ProcessingConstants.ERROR_TYPE_CHECK 
			);						
		}		
		
		EnvelopeCreator.reRouteMessage( 
			transit, recvEnv.getReceiverCustoms( ), 
			BusinessSystems.DECLARANT, null, 
			null, // InitialEnvelopeID 
			incomeMsg.getEnvelopeId( ) // IncomeEnvelopeID
		);		
		
		transit.getEDHeader( ).setMessageType( incomeMsg.getMessageType( ) );
		
		EnvelopeUnmarshaller envUnmarshaller = new EnvelopeUnmarshaller( );
		Object doc = envUnmarshaller.unmarshallBaseDocOrSignature( incomeDoc.getBody( ), MarshallingHelper.getSharedUnmarshaller( ) );
		
		transit.setInnerDocument( doc );
		transit.getDocument( ).setNotUniqRecursive( );
		
		// CMN.00004
				
		EDEnvelope cmn00004 = ( EDEnvelope )jobBatchContext.get( CMN_00004_NOTIF );
		
		EnvelopeCreator.reRouteMessage( 
			cmn00004, cmn00004.getReceiverCustoms( ), 
			BusinessSystems.CUSTOMS, cmn00004.getSenderCustoms( ), 
			incomeMsg.getEnvelopeId( ), 
			null /* IncomeEnvelopeID */ 
		);
	}

}
