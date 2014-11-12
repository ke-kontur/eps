package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ru.acs.fts.custommarshaller.XStringMarshallableClass;
import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.configuration.Configurator;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.helpers.CryptoHelper;
import ru.acs.fts.eps2.model.entities.Edecl_Messages;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
import ru.acs.fts.eps2.model.entities.Edecl_Substatus_State;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.schemas.envelope.CustomsType;

/**
 * Обработка ADM.00006 в ответ на сообщение MSG.11022
 *  
 * @author mns
 * @since 5.0.11/3.0.8
 */
public class MessageADM00006_MSG11022BusinessProcess extends BusinessProcess
{
	public static final String GTD_RECALLING = "GTD_RECALLING";
	public static final String CMN00004_NAME = "cmn00004Name";
	
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		List< EDEnvelope > envelopes = new ArrayList< EDEnvelope >( );
		String envelopeName = jobContext.getString( ContextConstants.ENVELOPE_NAME );
		jobBatchContext.put( envelopeName, envelopes );
		
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		/**
		 * Формируем транзитный конверт с помощью того, который сохранен у нас в базе
		 */
		
		Edecl_Messages incomeMsg = jobBatchContext.getIncomeMessage( );
		
		Map< String, String > messageTypeSubstituion = new HashMap< String, String >( );
		messageTypeSubstituion.put( recvEnv.getMessageType( ), incomeMsg.getMessageType( ) );
		
		EDEnvelope respEnvelope = EnvelopeCreator.createTranzitMessage( 
			messageTypeSubstituion, recvEnv, 
			BusinessSystems.DECLARANT, null 
		);

		XStringMarshallableClass xdoc = getInitialDocument( jobBatchContext );
		respEnvelope.setInnerDocument( xdoc );
		respEnvelope.getDocument( ).setNotUniqRecursive( );
		
		respEnvelope.setSaveDocument( false );
		respEnvelope.getEDHeader( ).setSenderCustoms( recvEnv.getReceiverCustoms( ) );
		respEnvelope.setInitialEnvelopeID( null );
		
	
		envelopes.add( respEnvelope );
		
		/**
		 * Формируем сообщение уведомление CMN.00004
		 */
	
		CustomsType receiverCustoms = new CustomsType( );
		receiverCustoms.setCustomsCode( incomeMsg.getSenderCustomCode( ).toString( ) ); 
		receiverCustoms.setExchType( incomeMsg.getSenderExchangeType( ).toString( ) );

		EDEnvelope cmn00004 = EnvelopeCreator.createNotificationMessage( 
			MessageType.CMN_00004, recvEnv, 
			ResultCodes._00_00000_00, 
			BusinessSystems.CUSTOMS, receiverCustoms 
		);
		
		CryptoHelper.signEnvelope( cmn00004, false );
				
		cmn00004.setInitialEnvelopeID( incomeMsg.getEnvelopeId( ) );
		cmn00004.getEDHeader( ).setSenderCustoms( null );
				
		envelopes.add( cmn00004 );

		removeGTDRecallingStatus( recvEnv );
	}
	
	private void removeGTDRecallingStatus( EDEnvelope recvEnv ) 
		throws Exception
	{
		List< Edecl_Substatus_State > substatuses = _serviceHolder.getProcedureService( ).getProcSubStatuses( recvEnv.getProcessID( ) );

		for ( Edecl_Substatus_State substatus : substatuses )
		{
			if ( substatus.getStCode( ).equalsIgnoreCase( GTD_RECALLING ) )
			{				
				_serviceHolder.getProcedureService( ).remove( substatus );		
				break;
			}
		}
	}
	
	private XStringMarshallableClass getInitialDocument( EDJobBatchContext jobBatchContext ) 
		throws ResultTypeException, IllegalStateException, DatabaseException
	{		
		Edecl_Msg_Doc doc = jobBatchContext.getIncomeMessageDocument( ); 
		if ( null == doc )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._03_00028_01, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
		
		XStringMarshallableClass xdoc = new XStringMarshallableClass( );
		xdoc.setEncoding( Configurator.WORKING_ENCODING );
		xdoc.setByteArray( doc.getBody( ) );		
		
		return xdoc;
	}
}
