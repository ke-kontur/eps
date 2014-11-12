package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ru.acs.fts.custommarshaller.XStringMarshallableClass;
import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.configuration.Configurator;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edecl_Messages;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.objects.defines.DocumentUniquenesses;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.utils.StringUtil;

/**
 * 
 * @author mns
 */
public class MessageADM00006_CMN11006BusinessProcess extends BusinessProcess
{
	public static final String CMN00004_NAME = "cmn00004";
	
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		List< EDEnvelope > envelopes = createAndPutEnvelopes( jobBatchContext, jobContext );
		
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		Edecl_Messages incomeMsg = jobBatchContext.getIncomeMessage( );
		
		/**
		 * Сначала достанем из батча cmn00004 и настроим его как надо
		 */
		String cmn00004Name = jobContext.getString( CMN00004_NAME );
		EDEnvelope cmn00004 = ( EDEnvelope )jobBatchContext.get( cmn00004Name );
		envelopes.add( cmn00004 );
		
		EnvelopeCreator.reRouteMessage( 
			cmn00004, recvEnv.getReceiverCustoms( ), 
			BusinessSystems.DECLARANT, null, 
			incomeMsg.getEnvelopeId( ), 
			recvEnv.getEnvelopeID( )
		);
								
		/**
		 * А теперь делаем магию - достаем из базы исходный конверт и отправляем его в таможню
		 */
		Map< String, String > messageTypeSubstitution = new HashMap< String, String >( );
		messageTypeSubstitution.put( MessageType.ADM_00006, MessageType.CMN_11006 );
		
		EDEnvelope cmn11006 = EnvelopeCreator.createTranzitMessage( 
			messageTypeSubstitution, recvEnv, 
			BusinessSystems.CUSTOMS, recvEnv.getReceiverCustoms( ) 
		);
		
		Edecl_Msg_Doc initialBody = recoverInitialBody( recvEnv, jobBatchContext );
		
		XStringMarshallableClass xstr = new XStringMarshallableClass( );
		xstr.setByteArray( initialBody.getBody( ) );
		xstr.setEncoding( Configurator.WORKING_ENCODING );
		
		cmn11006.setInnerDocument( xstr );
		cmn11006.getDocument( ).setUniqueness( DocumentUniquenesses.NOT_UNIQ );
		cmn11006.setInitialEnvelopeID( null );
		cmn11006.setIncomeEnvelopeID( recvEnv.getEnvelopeID( ) );
		cmn11006.getEDHeader( ).setSenderCustoms( null );
		
		envelopes.add( cmn11006 );
	}
	
	private Edecl_Msg_Doc recoverInitialBody( 
			EDEnvelope recvEnv, EDJobBatchContext jobBatchContext ) 
		throws ResultTypeException, DatabaseException
	{
		String initialEnvelopeId = recvEnv.getInitialEnvelopeID( );
		if ( StringUtil.isNullOrEmpty( initialEnvelopeId ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._03_00028_01, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
		
		Edecl_Messages msg = _serviceHolder.getEnvelopeService( ).getEnvelope( initialEnvelopeId );
		if ( null == msg )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._03_00028_01, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
		
		Edecl_Msg_Doc doc = _serviceHolder.getEnvelopeService( ).getDocument( msg.getDocumentId( ) );
		if ( null == doc )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._03_00028_01, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}		
		
		return doc;
	}
}
