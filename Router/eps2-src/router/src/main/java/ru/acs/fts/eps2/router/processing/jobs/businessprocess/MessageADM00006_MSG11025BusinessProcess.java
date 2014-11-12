package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.List;

import ru.acs.fts.custommarshaller.XStringMarshallableClass;
import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.configuration.Configurator;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edecl_Messages;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;

public class MessageADM00006_MSG11025BusinessProcess extends BusinessProcess
{
	private static final String TRANSIT_NAME = "transit";
	private static final String NOTIF_NAME = "notif";

	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		List< EDEnvelope > envelopes = createAndPutEnvelopes( jobBatchContext, jobContext );
		List< EDEnvelope > envelopesUnsigned = createAndPutEnvelopesUnsigned( jobBatchContext, jobContext );
		
		Edecl_Proc_Information procInfo = 
			_serviceHolder.getProcedureService( ).getProcInformation( recvEnv.getProcessID( ) );
		if ( null == procInfo )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._01_00049_01, 
				ProcessingConstants.ERROR_TYPE_CHECK 
			);
		}
		
		String receiverCustoms = recvEnv.getReceiverCustoms( ).getCustomsCode( );

		/**
		 * Декларанту отсылаем только в случае, если ADM.00006 пришло на внутренний пост, т.е.
		 * инициатор переход на общ. установленный порядок - внутренний пост
		 */
		if ( receiverCustoms.equalsIgnoreCase( procInfo.getCustCode( ) ) )
			envelopes.add( prepareTransit( jobBatchContext ) );
		
		envelopesUnsigned.add( prepareNotif( jobBatchContext ) );
		
	}

	private EDEnvelope prepareTransit( EDJobBatchContext jobBatchContext ) 
		throws BaseProcessingException, DatabaseException
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		EDEnvelope transit = ( EDEnvelope )jobBatchContext.get( TRANSIT_NAME );

		Edecl_Messages incomeMsg = jobBatchContext.getIncomeMessage( );
		Edecl_Msg_Doc incomeDoc = ( null != incomeMsg ) ? jobBatchContext.getIncomeMessageDocument( ) : null;
		if ( null == incomeMsg || null == incomeDoc )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._03_00028_01, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}

		XStringMarshallableClass xdoc = new XStringMarshallableClass( );
		xdoc.setEncoding( Configurator.WORKING_ENCODING );
		xdoc.setByteArray( incomeDoc.getBody( ) );
		
		transit.setInnerDocument( xdoc );
		transit.getDocument( ).setNotUniqRecursive( );
		
		transit.setSaveDocument( false );
		
		EnvelopeCreator.reRouteMessage( 
			transit, recvEnv.getReceiverCustoms( ), 
			BusinessSystems.DECLARANT, null, 
			null, 
			recvEnv.getEnvelopeID( ) 
		);

		return transit;
	}

	private EDEnvelope prepareNotif( EDJobBatchContext jobBatchContext ) 
		throws ResultTypeException, DatabaseException
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		EDEnvelope notif = ( EDEnvelope )jobBatchContext.get( NOTIF_NAME );
		
		Edecl_Messages incomeMsg = jobBatchContext.getIncomeMessage( );

		EnvelopeCreator.reRouteMessage( 
			notif, null, 
			BusinessSystems.CUSTOMS, recvEnv.getReceiverCustoms( ), 
			incomeMsg.getEnvelopeId( ), 
			recvEnv.getEnvelopeID( ) 
		);

		return notif;
	}
}
