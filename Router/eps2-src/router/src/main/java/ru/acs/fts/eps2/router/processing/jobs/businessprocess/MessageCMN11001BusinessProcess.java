package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.ArrayList;
import java.util.List;

import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.data.kind.DocumentStates;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.model.entities.Edecl_Substatus_State;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.schemas.album.notifgtdregistration.NotifGTDRegistrationType;
import ru.acs.fts.schemas.envelope.CustomsType;

/**
 * Бизнес процесс для обработки сообщения CMN.11001
 * ( Регистрационный номер электронной декларации ) 
 */
public class MessageCMN11001BusinessProcess extends BusinessProcess
{
	private static final String MESSAGE_TO_ASKTT2_NAME = "message2asktt2";
	private static final String TRANSIT_MESSAGE_NAME = "transitMessage";
	private static final String ENVELOPES_NAME = "envelopes";
	
	private static final String GTD_EDITING = "GTD_EDITING";
	
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		NotifGTDRegistrationType doc = 
			recvEnv.getDocument( ).getDocumentAsClass( NotifGTDRegistrationType.class );
		
		Edecl_Msg_Doc refDoc = checkRefDocument( doc.getRefDocumentID( ), recvEnv, jobBatchContext );
		if ( ! recvEnv.getMessageType( ).equals( MessageType.CMN_11097 ) )
			checkRequiredDocStatus( refDoc, jobBatchContext );
		
		setNewStatusesForProcessDocuments( recvEnv.getProcessID( ), recvEnv, jobBatchContext, null );
		setNewStatusesForReferencedDocuments( doc.getRefDocumentID( ), recvEnv, jobBatchContext );
		
		checkProcessSubstatuses( doc, recvEnv, jobBatchContext );
		saveInformationToProcess( doc, recvEnv, jobBatchContext );
		
		putEnvelopes( recvEnv, jobBatchContext, jobContext );
	}

	private Edecl_Msg_Doc checkRefDocument( 
			String refDocumentId, 
			EDEnvelope recvEnv, 
			EDJobBatchContext jobBatchContext )
		throws ResultTypeException, DatabaseException
	{
		Edecl_Msg_Doc refDoc = _serviceHolder.getEnvelopeService( ).getDocument( refDocumentId );
		
		if ( null == refDoc )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._03_00027_01, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
		
		return refDoc;
	}
	
	private void checkRequiredDocStatus( Edecl_Msg_Doc refDoc, EDJobBatchContext jobBatchContext )
		throws ResultTypeException, DatabaseException
	{
		if ( ! refDoc.getState( ).equalsIgnoreCase( DocumentStates.WAITABLE ) &&
			 ! refDoc.getState( ).equalsIgnoreCase( DocumentStates.CURRENT ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._03_00027_06, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
	}
	
	private void setNewStatusesForReferencedDocuments( 
			String refDocumentId, EDEnvelope recvEnv, 
			EDJobBatchContext jobBatchContext )
		throws ResultTypeException, DatabaseException
	{
		Edecl_Msg_Doc doc = checkRefDocument( refDocumentId, recvEnv, jobBatchContext );
		doc.setState( DocumentStates.CURRENT );
		_serviceHolder.getEnvelopeService( ).merge( doc );

		List< Edecl_Msg_Doc > refMainDocs = _serviceHolder.getEnvelopeService( ).getContainerDocuments( refDocumentId );
		if ( null != refMainDocs )
		{
			for ( Edecl_Msg_Doc cdoc : refMainDocs )
			{
				cdoc.setState( DocumentStates.CURRENT );
				_serviceHolder.getEnvelopeService( ).merge( cdoc );
			}
		}
	}
	
	private void checkProcessSubstatuses( 
			NotifGTDRegistrationType doc, 
			EDEnvelope recvEnv, 
			EDJobBatchContext jobBatchContext )
		throws ResultTypeException, DatabaseException
	{
		List< Edecl_Substatus_State > substatuses =
			_serviceHolder.getProcedureService( ).getProcSubStatuses( recvEnv.getProcessID( ) );
		
		if ( substatuses.size( ) > 1 )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._03_00042_01, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
		else if ( 1 == substatuses.size( ) )
		{
			Edecl_Substatus_State substatus = substatuses.get( 0 );
			if ( substatus.getStCode( ).equalsIgnoreCase( GTD_EDITING ) )
			{
				_serviceHolder.getProcedureService( ).remove( substatus );
			}
		}
	}
	
	private void saveInformationToProcess( 
			NotifGTDRegistrationType doc, 
			EDEnvelope recvEnv, 
			EDJobBatchContext jobBatchContext ) 
		throws DatabaseException
	{
		Edecl_Proc_Information procInfo = 
			_serviceHolder.getProcedureService( ).getProcInformation( recvEnv.getProcessID( ) );
		
		procInfo.setGtdIdCustCode( doc.getGTDID( ).getCustomsCode( ) );
		procInfo.setGtdIdDate( doc.getGTDID( ).getRegistrationDate( ).toDate( ) );
		
		if ( null != doc.getDocSign( ) && doc.getDocSign( ).equals( "1" ) )
		{
			procInfo.setGtdIdRegNum( String.format( "ОБ%s", doc.getGTDID( ).getGTDNumber( ) ) );
		}
		else
		{
			procInfo.setGtdIdRegNum( doc.getGTDID( ).getGTDNumber( ) );
		}
		
		_serviceHolder.getProcedureService( ).merge( procInfo );
	}
	
	private void putEnvelopes( 
			EDEnvelope recvEnv, 
			EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws ResultTypeException, DatabaseException
	{
		List< EDEnvelope > envelopes = new ArrayList< EDEnvelope >( );
		String envelopesName = jobContext.getString( ENVELOPES_NAME );
		jobBatchContext.put( envelopesName, envelopes );
		
		String transitMessageName = jobContext.getString( TRANSIT_MESSAGE_NAME );
		EDEnvelope transitMessage = ( EDEnvelope )jobBatchContext.get( transitMessageName );
		envelopes.add( transitMessage );
		
		if ( recvEnv.getMessageType( ).equals( MessageType.CMN_11077 ) )
		{
			String message2asktt2Name = jobContext.getString( MESSAGE_TO_ASKTT2_NAME );
			EDEnvelope message2asktt2 = ( EDEnvelope )jobBatchContext.get( message2asktt2Name );
			envelopes.add( message2asktt2 );
			
			CustomsType receiverCustoms = new CustomsType( );
			receiverCustoms.setCustomsCode( jobBatchContext.getConfigurator( ).getAsktt2CustomsCode( ) );
			receiverCustoms.setExchType( recvEnv.getSenderCustoms( ).getExchType( ) );
			
			EnvelopeCreator.reRouteMessage( 
				message2asktt2, message2asktt2.getSenderCustoms( ), 
				BusinessSystems.ASKTT2, receiverCustoms, 
				null /* InitialEnvelopeID */, 
				message2asktt2.getIncomeEnvelopeID( ) 
			);
		}
	}
}
