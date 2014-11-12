package ru.acs.fts.eps2.router.processing.ead.processing;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edecl_Messages;
import ru.acs.fts.eps2.model.entities.ExtEadManifest;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;

public class GenericManifestCompletedProcessor extends ManifestCompletedProcessor
{
	private Map< String, String > _messageTypeMappings;
	
	@Required
	public void setMessageTypeMappings( Map< String, String > messageTypeMappings ) { _messageTypeMappings = messageTypeMappings; }
	public Map< String, String > getMessageTypeMappings( ) { return _messageTypeMappings; }

	public void process( 
			List< ExtEadManifest > manifests, 
			EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws BaseProcessingException, IllegalStateException, DatabaseException
	{
		eadResponseLocalProcessing( manifests, jobBatchContext, jobContext );
	}

	public void eadResponseLocalProcessing( 
			List< ExtEadManifest > manifests, 
			EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws BaseProcessingException, IllegalStateException, DatabaseException 
	{
		List< EDEnvelope > envelopes = new ArrayList< EDEnvelope >( );		
		String envelopeName = jobContext.getString( ContextConstants.ENVELOPE_NAME );
		jobBatchContext.put( envelopeName, envelopes );
		
		if ( 0 == manifests.size( ) )
			return ;
		
		String requestEnvelopeId = manifests.get( 0 ).getRequestEnvelopeId( );
		
		Edecl_Messages reqEnv = jobBatchContext.getServiceHolder( )
			.getEnvelopeService( ).getEnvelope( requestEnvelopeId );		
		
		String recipientSystem = BusinessSystems.DECLARANT;
		if ( null != reqEnv.getSenderCustomCode( ) &&
			 null != reqEnv.getSenderExchangeType( ) )
		{
			recipientSystem = BusinessSystems.CUSTOMS;
		}
		
		for ( ExtEadManifest mf : manifests )
		{
			EDEnvelope respEnvelope = manifestToEnvelope( 
				mf, reqEnv, recipientSystem, 
				_messageTypeMappings, jobBatchContext 
			);
			
			if ( respEnvelope.getMessageType( ).equals( MessageType.MSG_15034 ) )
			{
				EnvelopeCreator.reRouteMessage( 
					respEnvelope, respEnvelope.getSenderCustoms( ), 
					BusinessSystems.ASKTT2, respEnvelope.getReceiverCustoms( ), 
					respEnvelope.getInitialEnvelopeID( ), 
					respEnvelope.getIncomeEnvelopeID( )
				);
			}
			
			if ( null != respEnvelope )
				envelopes.add( respEnvelope );
		}
		
		for ( ExtEadManifest mf : manifests )
		{
			jobBatchContext.getServiceHolder( ).getEdarchService( ).remove( mf );
		}
	}
}
