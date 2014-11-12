package ru.acs.fts.eps2.router.processing.ead.processing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edecl_Messages;
import ru.acs.fts.eps2.model.entities.ExtEadManifest;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.Cmn10009Helper;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;

public class CMN10009ManifestCompleteProcessor extends ManifestCompletedProcessor
{
	public void process( 
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

		List< String > failedLineIds = new ArrayList< String >( );
		
		Map< String, String > messageTypeMappings = new HashMap< String, String >( );
		messageTypeMappings.put( MessageType.CMN_10009, MessageType.CMN_10010 );

		for ( ExtEadManifest mf : manifests )
		{
			if ( mf.getResultCode( ).equalsIgnoreCase( ResultCodes._00_00000_00 ) )
			{
				EDEnvelope respEnvelope = manifestToEnvelope( 
					mf, reqEnv, recipientSystem, 
					messageTypeMappings, jobBatchContext 
				);
				
				/**
				 * Сбрасываем Income, т.к. не должно его быть - мы документ нашли в ЭАДе 
				 * и декларанта не спрашивали
				 */
				respEnvelope.setIncomeEnvelopeID( null );

				if ( null != respEnvelope )
					envelopes.add( respEnvelope );
			}
			else
			{
				failedLineIds.add( mf.getRequestLineId( ) );
			}
		}
		
		if ( failedLineIds.size( ) > 0 )
		{
			EDEnvelope msg2Decl = Cmn10009Helper.makeCmn10009( reqEnv, failedLineIds, jobBatchContext );
			if ( null != msg2Decl )
				envelopes.add( msg2Decl );
		}				
	}

}
