package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.GregorianCalendar;
import java.util.List;

import ru.acs.fts.custommarshaller.XStringMarshallableClass;
import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.configuration.Configurator;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.helpers.CryptoHelper;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
import ru.acs.fts.eps2.model.entities.Edecl_Participant;
import ru.acs.fts.eps2.model.entities.ProcParticipantAccess;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.objects.defines.DocumentUniquenesses;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.utils.StringUtil;
import ru.acs.fts.schemas.album.inspectordecision.DecisionDescriptionType;
import ru.acs.fts.schemas.album.inspectordecision.DocumentInfoType;
import ru.acs.fts.schemas.album.inspectordecision.InspectorDecisionType;

public class MessageMSG11060BusinessProcess extends BusinessProcess
{
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );		
		List< EDEnvelope > envelopes = createAndPutEnvelopes( jobBatchContext, jobContext );
		
		InspectorDecisionType doc = recvEnv.getDocument( ).getDocumentAsClass( InspectorDecisionType.class );

		Edecl_Msg_Doc bodydoc = getRefDocument( doc, jobBatchContext );

		try
		{
			Edecl_Participant svhParticipant = getSvhParticipant( doc, jobBatchContext );
			
			EDEnvelope ed13004 = createEd13004( recvEnv, jobBatchContext, svhParticipant, bodydoc );
			envelopes.add( ed13004 );
			
			grantAccessToSvhParticipant( recvEnv, svhParticipant );
		}
		catch ( ResultTypeException rte )
		{
			EDEnvelope msg11061 = createMsg11061( recvEnv, rte, jobBatchContext );
			envelopes.add( msg11061 );
		}
		
		EDEnvelope cmn00004 = createCmn00004( recvEnv, jobBatchContext );
		envelopes.add( cmn00004 );		
	}
	
	private Edecl_Participant getSvhParticipant( 
			InspectorDecisionType doc,
			EDJobBatchContext jobBatchContext ) 
		throws ResultTypeException, DatabaseException
	{
		List< DecisionDescriptionType > decisionDescs = doc.getDecisionDescriptionList( );
		if ( null == decisionDescs || 0 == decisionDescs.size( ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._01_00025_01, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
		
		DecisionDescriptionType decisionDesc = decisionDescs.get( 0 );
		DocumentInfoType docInfo = decisionDesc.getDocumentInfo( );
		if ( null == docInfo )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._01_00025_01, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
		
		if ( StringUtil.isNullOrEmpty( docInfo.getPrDocumentNumber( ) ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._01_00025_01, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);			
		}
		
		Edecl_Participant participant = _serviceHolder.getParticipantService( )
			.getParticipantBySvhLicNum( docInfo.getPrDocumentNumber( ) );
		if ( null == participant )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._01_00025_01, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);			
		}
		
		return participant;
	}
	
	private Edecl_Msg_Doc getRefDocument( 
			InspectorDecisionType doc, EDJobBatchContext jobBatchContext ) 
		throws ResultTypeException, DatabaseException
	{
		if ( StringUtil.isNullOrEmpty( doc.getRefDocumentID( ) ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._03_00027_02, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
		
		Edecl_Msg_Doc refdoc = _serviceHolder.getEnvelopeService( )
			.getDocument( doc.getRefDocumentID( ) );
		if ( null == refdoc )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._03_00027_02, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
		
		return refdoc;
	}
	
	private EDEnvelope createEd13004( 
			EDEnvelope recvEnv, EDJobBatchContext jobBatchContext,
			Edecl_Participant svhParticipant, Edecl_Msg_Doc bodyDoc ) 
		throws BaseProcessingException, IllegalStateException, DatabaseException
	{
		XStringMarshallableClass xstr = new XStringMarshallableClass( );
		xstr.setByteArray( bodyDoc.getBody( ) );
		xstr.setEncoding( Configurator.WORKING_ENCODING );
		
		EDEnvelope ed13004 = EnvelopeCreator.createFluentMessage( 
			MessageType.ED_13004, recvEnv.getProcessID( ), 
			svhParticipant.getParticipantId( ), 
			recvEnv.getApplicationInfo( ).getMessageKind( ), 
			recvEnv.getApplicationInfo( ).getSoftKind( ), 
			recvEnv.getApplicationInfo( ).getSoftVersion( ), 
			BusinessSystems.CUSTOMS, recvEnv.getSenderCustoms( ), 
			BusinessSystems.DECLARANT, null, xstr 
		);		
		
		ed13004.setIncomeEnvelopeID( recvEnv.getEnvelopeID( ) );
		ed13004.getDocument( ).setUniqueness( DocumentUniquenesses.NOT_UNIQ );
		
		return ed13004;
	}
	
	private EDEnvelope createMsg11061(
			EDEnvelope recvEnv,
			ResultTypeException rte, EDJobBatchContext jobBatchContext ) 
		throws Exception
	{
		EDEnvelope msg11061 = EnvelopeCreator.createResponseMessage( 
			MessageType.MSG_11061, recvEnv, rte.getResult( ), 
			recvEnv.getSenderSystem( ), recvEnv.getSenderCustoms( ) 
		);
		
		CryptoHelper.signEnvelope( msg11061, false );
		
		return msg11061;
	}
	
	private EDEnvelope createCmn00004( EDEnvelope recvEnv, EDJobBatchContext jobBatchContext ) 
		throws Exception
	{
		EDEnvelope cmn00004 = EnvelopeCreator.createNotificationMessage( 
			MessageType.CMN_00004, recvEnv, ResultCodes._00_00000_00, 
			BusinessSystems.CUSTOMS, recvEnv.getSenderCustoms( ) 
		);
		
		CryptoHelper.signEnvelope( cmn00004, false );
		
		return cmn00004;
	}
	
	private void grantAccessToSvhParticipant( EDEnvelope recvEnv, Edecl_Participant svhParticipant ) 
		throws DatabaseException
	{
		ProcParticipantAccess ppAccess = new ProcParticipantAccess( );
		ppAccess.setProcessId( recvEnv.getProcessID( ) );
		ppAccess.setParticipantId( svhParticipant.getParticipantId( ) );
		ppAccess.setSoftVersion( recvEnv.getSoftVersion( ) );
		ppAccess.setGranted( new GregorianCalendar( ) );
		ppAccess.setIssuer( recvEnv.getParticipantID( ) );
		
		_serviceHolder.getProcedureService( ).persist( ppAccess );
	}
}
