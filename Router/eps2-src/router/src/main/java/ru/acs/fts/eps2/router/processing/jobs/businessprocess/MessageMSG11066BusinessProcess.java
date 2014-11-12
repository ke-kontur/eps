package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.configuration.RtuCodePatternsHolder;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.helpers.CryptoHelper;
import ru.acs.fts.eps2.model.entities.Edecl_Messages;
import ru.acs.fts.eps2.model.services.EnvelopeService;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.utils.StringUtil;

public class MessageMSG11066BusinessProcess extends BusinessProcess
{
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		List< EDEnvelope > envelopes = createAndPutEnvelopes( jobBatchContext, jobContext );
		
		String senderSystem = recvEnv.getSenderSystem( );
		Map< String, String > messageTypeSubstituion = new HashMap< String, String >( );
		messageTypeSubstituion.put( MessageType.MSG_11066, MessageType.CMN_11122 );
		
		
		if ( BusinessSystems.isSuchSystem( senderSystem, BusinessSystems.CUSTOMS ) )
		{
			RtuCodePatternsHolder matcher = jobBatchContext.getConfigurator( ).getRtuPatternsHolder( );
			String receiverCustoms = recvEnv.getReceiverCustoms( ).getCustomsCode( );
			
			if ( matcher.match( receiverCustoms ) )
			{
				// локальная удаленка
				
				EDEnvelope transit2to = EnvelopeCreator.createTranzitMessage( 
					null, recvEnv, 
					BusinessSystems.CUSTOMS, recvEnv.getReceiverCustoms( )
				);
				
				transit2to.setInitialEnvelopeID( recoverLocalInitial( recvEnv, jobBatchContext ) );
				
				envelopes.add( transit2to );
				
				EDEnvelope transit2decl = EnvelopeCreator.createTranzitMessage( 
					messageTypeSubstituion, recvEnv, 
					BusinessSystems.DECLARANT, null 
				);
				
				transit2decl.getEDHeader( ).setSenderCustoms( recvEnv.getReceiverCustoms( ) );
				
				envelopes.add( transit2decl );
				
				EDEnvelope cmn00004 = EnvelopeCreator.createNotificationMessage( 
					MessageType.CMN_00004, recvEnv, ResultCodes._00_00000_00, 
					BusinessSystems.CUSTOMS, recvEnv.getSenderCustoms( ) 
				);
				
				CryptoHelper.signEnvelope( cmn00004, false );
				
				envelopes.add( cmn00004 );
			}
			else
			{
				// удаленная удаленка - на внешнем ТО
				
				EDEnvelope transit2eps = EnvelopeCreator.createTranzitMessage( 
					null, recvEnv, 
					BusinessSystems.EPS, recvEnv.getReceiverCustoms( ) 
				);
				
				envelopes.add( transit2eps );
			}
		}
		else if ( BusinessSystems.isSuchSystem( senderSystem, BusinessSystems.EPS ) )
		{
			// удаленная удаленка - на внутреннем ТО
			
			EDEnvelope transit2to = EnvelopeCreator.createTranzitMessage( 
				null, recvEnv, 
				BusinessSystems.CUSTOMS, recvEnv.getReceiverCustoms( )
			);
			
			transit2to.setInitialEnvelopeID( recoverLocalInitial( recvEnv, jobBatchContext ) );
			
			envelopes.add( transit2to );
			
			EDEnvelope transit2decl = EnvelopeCreator.createTranzitMessage( 
				messageTypeSubstituion, recvEnv, 
				BusinessSystems.DECLARANT, null
			);
			
			transit2decl.getEDHeader( ).setSenderCustoms( recvEnv.getReceiverCustoms( ) );
			
			envelopes.add( transit2decl );

			EDEnvelope adm00006 = EnvelopeCreator.createNotificationMessage( 
				MessageType.ADM_00006, recvEnv, ResultCodes._00_00000_00, 
				BusinessSystems.EPS, recvEnv.getSenderCustoms( ) 
			);
			
			CryptoHelper.signEnvelope( adm00006, false );
			
			envelopes.add( adm00006 );
		}
		else
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._09_96669_99, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
	}
	
	private String recoverLocalInitial( EDEnvelope recvEnv, EDJobBatchContext jobBatchContext ) 
		throws ResultTypeException, DatabaseException
	{
		String initialEnvId = recvEnv.getInitialEnvelopeID( );
		if ( StringUtil.isNullOrEmpty( initialEnvId ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._03_00028_01, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
		
		EnvelopeService envSrv = jobBatchContext.getServiceHolder( ).getEnvelopeService( );
		
		String incomeEnvId = envSrv.getIncomeEnvelopeIdByInitialEnvelopeId( initialEnvId );
		if ( StringUtil.isNullOrEmpty( incomeEnvId ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._03_00028_01, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);			
		}
		
		List< Edecl_Messages > forwarded = envSrv.getForwardedMessages( incomeEnvId, recvEnv.getProcessID( ) );
		for ( Edecl_Messages msg : forwarded )
		{
			if ( msg.getMessageType( ).equals( MessageType.CMN_11121 ) &&
				 ! msg.getEnvelopeId( ).equals( initialEnvId ) )
			{
				return msg.getEnvelopeId( );
			}
		}
		
		ErrorHelper.throwException( 
			jobBatchContext, ResultCodes._03_00028_01, 
			ProcessingConstants.ERROR_TYPE_BUSINESS 
		);	
		
		return null;
	}
} 
