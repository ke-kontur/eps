package ru.acs.fts.eps2.router.processing.ead.processing;

import java.util.List;
import java.util.Map;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edecl_Messages;
import ru.acs.fts.eps2.model.entities.ExtEadManifest;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.objects.EDDocument;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.ead.mappers.EadToTransportMapper;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.schemas.envelope.CustomsType;

public abstract class ManifestCompletedProcessor
{
	public abstract void process( List< ExtEadManifest > manifests, EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws DatabaseException, BaseProcessingException;
	
	public EDEnvelope manifestToEnvelope(  // NO_UCD (use default)
			ExtEadManifest mf,
			Edecl_Messages reqEnv,
			String recipientSystem,
			Map< String, String > messageTypeMappings,
			EDJobBatchContext jobBatchContext ) 
		throws BaseProcessingException, DatabaseException 
	{
		String messageType = MessageType.CMN_00001;
		EDDocument resDocument = null;
		
		if ( mf.getStatus( ) != null && mf.getStatus( ).intValue( ) == ExtEadManifest.STATUS_RECEIVED )
		{
			messageType = messageTypeMappings.get( reqEnv.getMessageType( ) );
			resDocument = EadToTransportMapper.createDocument( mf );
		}
		else
		{
			resDocument = EadToTransportMapper.createErrorDocument( mf, jobBatchContext.getServiceHolder( ) );
		}

		EDEnvelope respEnvelope = EadToTransportMapper.makeEnvelope( 
			messageType, resDocument, 
			recipientSystem, jobBatchContext 
		);
		
		respEnvelope.setIncomeEnvelopeID( reqEnv.getEnvelopeId( ) );
		respEnvelope.setInitialEnvelopeID( mf.getRequestEnvelopeId( ) );

		if ( BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.DECLARANT ) )
		{
			CustomsType senderCustoms = new CustomsType( );
			senderCustoms.setCustomsCode( reqEnv.getRcvCustomCode( ).toString( ) );
			senderCustoms.setExchType( reqEnv.getRcvExchangeType( ).toString( ) );
			
			EnvelopeCreator.reRouteMessage( 
				respEnvelope, senderCustoms, 
				BusinessSystems.DECLARANT, null, 
				respEnvelope.getInitialEnvelopeID( ), 
				respEnvelope.getIncomeEnvelopeID( ) 
			);
		}
		else if ( BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.CUSTOMS ) )
		{
			CustomsType receiverCustoms = new CustomsType( );
			receiverCustoms.setCustomsCode( reqEnv.getSenderCustomCode( ).toString( ) );
			receiverCustoms.setExchType( reqEnv.getSenderExchangeType( ).toString( ) );
			
			EnvelopeCreator.reRouteMessage( 
				respEnvelope, respEnvelope.getSenderCustoms( ), 
				BusinessSystems.CUSTOMS, receiverCustoms, 
				respEnvelope.getInitialEnvelopeID( ), 
				respEnvelope.getIncomeEnvelopeID( ) 
			);
		}
		
		return respEnvelope;
	}
}
