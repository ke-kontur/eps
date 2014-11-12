package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.ArrayList;

import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edecl_Messages;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.objects.defines.DocumentSaveTypes;
import ru.acs.fts.eps2.router.objects.defines.DocumentUniquenesses;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.schemas.envelope.CustomsType;

public class MessageADM00006BusinessProcess extends BusinessProcess
{
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );

		String messageType = recvEnv.getMessageType( );

		String respMessageType = MessageType.CMN_00004;
		if ( messageType.equalsIgnoreCase( MessageType.ADM_00007 ) )
		{
			respMessageType = MessageType.CMN_00001;
		}
		
		EDEnvelope respEnvelope = EnvelopeCreator.createTranzitMessage( 
			null, recvEnv, 
			BusinessSystems.EPS, recvEnv.getReceiverCustoms( )
		);
		
		// В тело  исходящего  сообщения помещается  тело входящего  сообщения в
		// неизменном виде, обеспечивающем сохранение ЭП отправителя.
		
		// respEnvelope.setBody( envelope.getBody( ) );
		
		// Object xdoc = respEnvelope.getDocument( ).getNakedDocument( );
		respEnvelope.getDocument( ).setUniqueness( DocumentUniquenesses.NOT_UNIQ );
		respEnvelope.getDocument( ).setSaveType( DocumentSaveTypes.INSERT );
						
		respEnvelope.getEDHeader( ).setMessageType( respMessageType );
		
		// по initialEnvelopeId определяем отправителя
		Edecl_Messages incomeMsg = jobBatchContext.getIncomeMessage( );
		if ( null == incomeMsg )
		{
			String envelopeName = jobContext.getString( ContextConstants.ENVELOPE_NAME );
			jobBatchContext.put( envelopeName, new ArrayList< EDEnvelope >( ) );
			return ;
		}
		
		if ( null != incomeMsg.getSenderCustomCode( ) )
		{
			// отправляем в ТО
			CustomsType receiverCustoms = new CustomsType( );
			receiverCustoms.setCustomsCode( incomeMsg.getSenderCustomCode( ).toString( ) );
			receiverCustoms.setExchType( incomeMsg.getSenderExchangeType( ).toString( ) );

			EnvelopeCreator.reRouteMessage( 
				respEnvelope, respEnvelope.getSenderCustoms( ), 
				BusinessSystems.CUSTOMS, receiverCustoms, 
				respEnvelope.getInitialEnvelopeID( ), 
				respEnvelope.getIncomeEnvelopeID( )
			);			
		}
		else
		{
			// отправляем декларанту			
			EnvelopeCreator.reRouteMessage( 
				respEnvelope, respEnvelope.getSenderCustoms( ), 
				BusinessSystems.DECLARANT, null, 
				respEnvelope.getInitialEnvelopeID( ), 
				respEnvelope.getIncomeEnvelopeID( )
			);
		}

		String envelopeName = jobContext.getString( ContextConstants.ENVELOPE_NAME );
		jobBatchContext.put( envelopeName, respEnvelope );
	}	
}
