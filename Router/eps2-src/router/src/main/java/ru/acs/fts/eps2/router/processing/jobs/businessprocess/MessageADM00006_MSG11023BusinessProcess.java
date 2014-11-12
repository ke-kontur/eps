package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.ArrayList;
import java.util.List;

import ru.acs.fts.custommarshaller.XStringMarshallableClass;
import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.configuration.Configurator;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edecl_Messages;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.schemas.envelope.CustomsType;

/**
 * @author SAA
 * <p>
 * JobBatchContext:<p>
 * <b>transit</b> - по этому ключу хранится сообщение CMN.11010 (отправляется декларанту)
 * <p>
 * <b>notif</b> - по этому ключу хранится сообщение CMN.00004 (отправляется на удаленное РТУ)
 * <p>
 * JobContext:<p>
 * <b>envelopes</b> - имя списка конвертов, который потом подпишется, сохранится в БД и отправится
 */
public class MessageADM00006_MSG11023BusinessProcess extends BusinessProcess
{
	private static final String TRANSIT_NAME = "transit";	
	private static final String NOTIF_NAME = "notif";
	
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		List< EDEnvelope > envelopes = new ArrayList< EDEnvelope >( );
		envelopes.add( prepareTransit( jobBatchContext ) );
		envelopes.add( prepareNotif( jobBatchContext ) );
		
		String envelopesName = jobContext.getString( ContextConstants.ENVELOPES );
		jobBatchContext.put( envelopesName, envelopes );
	}
	
	private EDEnvelope prepareTransit( EDJobBatchContext jobBatchContext ) 
		throws BaseProcessingException, DatabaseException
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		EDEnvelope transit = ( EDEnvelope ) jobBatchContext.get( TRANSIT_NAME );

		Edecl_Messages incomeMsg = jobBatchContext.getIncomeMessage( );
		Edecl_Msg_Doc incomeDoc = ( null != incomeMsg ) ? jobBatchContext.getIncomeMessageDocument( ) : null;
		if ( null == incomeMsg || null == incomeDoc )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._09_96669_99, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);			
		}
		
		CustomsType senderCustoms = new CustomsType( );
		senderCustoms.setCustomsCode( incomeMsg.getSenderCustomCode( ).toString( ) );
		senderCustoms.setExchType( recvEnv.getSenderCustoms( ).getExchType( ) );
				
		EnvelopeCreator.reRouteMessage( 
			transit, recvEnv.getReceiverCustoms( ), 
			BusinessSystems.DECLARANT, null, 
			null, /* InitialEnvelopeID */ 
			transit.getIncomeEnvelopeID( ) 
		);
		
		transit.getEDHeader( ).setMessageType( incomeMsg.getMessageType( ) );

		XStringMarshallableClass xdoc = new XStringMarshallableClass( );
		xdoc.setEncoding( Configurator.WORKING_ENCODING );
		xdoc.setByteArray( incomeDoc.getBody( ) );

		transit.setInnerDocument( xdoc );
		transit.getDocument( ).setNotUniqRecursive( );
		
		transit.setSaveDocument( false );
		
		return transit;
	}
	
	private EDEnvelope prepareNotif( EDJobBatchContext jobBatchContext ) 
		throws ResultTypeException, DatabaseException
	{
		EDEnvelope notif = ( EDEnvelope )jobBatchContext.get( NOTIF_NAME );

		Edecl_Messages incomeMsg = jobBatchContext.getIncomeMessage( );
		if ( null == incomeMsg )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._03_00028_01, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);		
		}
				
		CustomsType initSenderCustoms = null;
		
		if ( incomeMsg.getSenderCustomCode( ) != null &&
			 incomeMsg.getSenderExchangeType( ) != null )
		{
			initSenderCustoms = new CustomsType( );
			initSenderCustoms.setCustomsCode( incomeMsg.getSenderCustomCode( ).toString( ) );
			initSenderCustoms.setExchType( incomeMsg.getSenderExchangeType( ).toString( ) );
		}
		
		CustomsType initReceiverCustoms = null;
		
		if ( incomeMsg.getRcvCustomCode( ) != null &&
			 incomeMsg.getRcvExchangeType( ) != null )
		{
			initReceiverCustoms = new CustomsType( );
			initReceiverCustoms.setCustomsCode( incomeMsg.getRcvCustomCode( ).toString( ) );
			initReceiverCustoms.setExchType( incomeMsg.getRcvExchangeType( ).toString( ) );
		}
		
		if ( initSenderCustoms == null )
		{
			/** От декларанта */
			EnvelopeCreator.reRouteMessage( 
				notif, initReceiverCustoms, 
				BusinessSystems.DECLARANT, null, 
				incomeMsg.getEnvelopeId( ), /* InitialEnvelopeID */ 
				notif.getIncomeEnvelopeID( ) 
			);
		}
		else
		{
			/** От таможни */
			EnvelopeCreator.reRouteMessage( 
				notif, initReceiverCustoms, 
				BusinessSystems.CUSTOMS, initSenderCustoms, 
				incomeMsg.getEnvelopeId( ), /* InitialEnvelopeID */ 
				notif.getIncomeEnvelopeID( ) 
			);
		}
		
		return notif;
	}	
}
