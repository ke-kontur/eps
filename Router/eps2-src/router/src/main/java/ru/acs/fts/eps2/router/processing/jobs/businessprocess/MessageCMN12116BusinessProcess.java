package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ru.acs.fts.eps2.engine.configuration.RtuCodePatternsHolder;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.data.kind.DocumentModeIDs;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.util.helpers.UUIDGen;
import ru.acs.fts.eps2.utils.StringUtil;
import ru.acs.fts.schemas.album.inspectordecision.DecisionDescriptionType;
import ru.acs.fts.schemas.album.inspectordecision.InspectorDecisionType;
import ru.acs.fts.schemas.envelope.CustomsType;

public class MessageCMN12116BusinessProcess extends BusinessProcess
{
	private static final int EXCH_TYPE = 19210;
	
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
				
		InspectorDecisionType doc = recvEnv.getDocument( ).getDocumentAsClass( InspectorDecisionType.class ); 
		
		Map< String, List< DecisionDescriptionType > > descriptions =
			new HashMap< String, List< DecisionDescriptionType > >( );
		
		for ( DecisionDescriptionType dd : doc.getDecisionDescriptionList( ) )
		{
			if ( null == dd.getGoodsCustoms( ) )
				continue;
			
			String customsCode = dd.getGoodsCustoms( ).getCode( );
			if ( StringUtil.isNullOrEmpty( customsCode ) )
				continue;
			
			List< DecisionDescriptionType > lst = descriptions.get( customsCode );
			if ( null == lst )
			{
				lst = new ArrayList< DecisionDescriptionType >( );
				descriptions.put( customsCode, lst );				
			}
			
			lst.add( dd );
		}
		
		List< EDEnvelope > envelopes = createAndPutEnvelopes( jobBatchContext, jobContext );
		List< EDEnvelope > envelopesUnsigned = createAndPutEnvelopesUnsigned( jobBatchContext, jobContext );
		
		Map< String, String > messageTypeSubstituion = new HashMap< String, String >( );
		messageTypeSubstituion.put( recvEnv.getMessageType( ), MessageType.MSG_13007 );
		
		for ( String customsCode : descriptions.keySet( ) )
		{
			List< DecisionDescriptionType > lst = descriptions.get( customsCode );
			
			InspectorDecisionType ndoc = new InspectorDecisionType( );
			ndoc.setDocumentID( UUIDGen.getUUID( ).toString( ) );
			ndoc.setRefDocumentID( doc.getDocumentID( ) );
			ndoc.setDocumentModeID( DocumentModeIDs.INSPECTOR_DECISION );

			ndoc.setDecisionDescriptionList( lst );
			
			CustomsType receivingCustoms = new CustomsType( );
			receivingCustoms.setCustomsCode( customsCode );
			receivingCustoms.setExchType( Integer.toString( EXCH_TYPE ) );
			
			RtuCodePatternsHolder rtus = jobBatchContext.getConfigurator( ).getRtuPatternsHolder( );
			String recipientSystem = rtus.match( customsCode ) 
				? BusinessSystems.CUSTOMS
				: BusinessSystems.EPS;
			
			EDEnvelope nEnv = EnvelopeCreator.createTranzitMessage( 
				messageTypeSubstituion, recvEnv, 
				recipientSystem, receivingCustoms 
			);
			
			nEnv.setInnerDocument( ndoc );
			nEnv.setInitialEnvelopeID( null );
			
			envelopesUnsigned.add( nEnv );
		}
		
		EDEnvelope respEnvelope = EnvelopeCreator.createTranzitMessage( 
			null, recvEnv, 
			BusinessSystems.DECLARANT, null 
		);
		
		envelopes.add( respEnvelope );
	}
}
