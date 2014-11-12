package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.data.kind.DocumentModeIDs;
import ru.acs.fts.eps2.engine.data.kind.DocumentStates;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.helpers.CryptoHelper;
import ru.acs.fts.eps2.model.entities.Edecl_Messages;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.model.services.EnvelopeService;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.persistence.EDServiceHolder;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.utils.StringUtil;
import ru.acs.fts.schemas.album.ed_container.EDContainerType;
import ru.acs.fts.schemas.envelope.CustomsType;

/**
 * Базовый класс для бизнес процессов
 * 
 * @author mrdekk
 * @since 5.0.11/3.0.8
 */
public abstract class BusinessProcess
{
	protected EDServiceHolder _serviceHolder;
	
	@Required
	public void setServiceHolder( EDServiceHolder serviceHolder ) { _serviceHolder = serviceHolder; }
	public EDServiceHolder getServiceHolder( ) { return _serviceHolder; }
	
	public abstract void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception;
	
	/**
	 * cape := Create And Put Envelopes
	 * 
	 * @param contextKey
	 * @param jobBatchContext
	 * @param jobContext
	 * @return
	 * @throws IllegalStateException 
	 * @throws ResultTypeException 
	 * @throws DatabaseException 
	 */
	private List< EDEnvelope > cape( String contextKey, EDJobBatchContext jobBatchContext, JobContext jobContext )
		throws ResultTypeException, IllegalStateException, DatabaseException
	{
		String envelopesName = jobContext.getString( contextKey );
		if ( StringUtil.isNullOrEmpty( envelopesName ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._09_96669_99, 
				ProcessingConstants.ERROR_TYPE_UNKNOWN 
			);
		}
		
		List< EDEnvelope > envelopes = new ArrayList< EDEnvelope >( );
		jobBatchContext.put( envelopesName, envelopes );
		
		return envelopes;
	}
	
	protected List< EDEnvelope > createAndPutEnvelopes( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws ResultTypeException, IllegalStateException, DatabaseException
	{
		return cape( ContextConstants.ENVELOPES, jobBatchContext, jobContext );
	}
	
	protected List< EDEnvelope > createAndPutEnvelopesUnsigned( 
			EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws ResultTypeException, IllegalStateException, DatabaseException
	{
		return cape( ContextConstants.ENVELOPES_UNSIGNED, jobBatchContext, jobContext );
	}
	
	protected List< EDEnvelope > createAndPutEnvelopesVersions(
			EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws ResultTypeException, IllegalStateException, DatabaseException
	{
		return cape( ContextConstants.ENVELOPES_VERSIONS, jobBatchContext, jobContext );
	}
		
	// TODO: перенести в EDEnvelope
	protected EDContainerType extractContainer( EDEnvelope envelope ) 
		throws Exception
	{
		Object obj = envelope.getDocument( ).getNakedDocument( );

		if ( ! ( obj instanceof EDContainerType ) )
		{
			String errorMsg = String.format(
				"Для обработки ожидался другой класс, мы ждали EDContainerType, а получили %s",
				obj.getClass( ).getSimpleName( ) 
			);

			throw new Exception( errorMsg );
		}

		return ( EDContainerType )obj;
	}
	
	protected void setNewStatusesForProcessDocuments( 
			String processId, EDEnvelope recvEnv, 
			EDJobBatchContext jobBatchContext, 
			String messageType ) 
		throws ResultTypeException, DatabaseException
	{
		EnvelopeService eserv = _serviceHolder.getEnvelopeService( );

		List< Edecl_Messages > processMsgs = eserv.getEnvelopesByProcessId( processId );

		for ( Edecl_Messages msg : processMsgs )
		{
			if ( messageType != null && ! msg.getMessageType( ).equals( messageType ) )
			{
				continue;
			}
			
			Edecl_Msg_Doc doc = eserv.getDocument( msg.getDocumentId( ) );
			changeStatus( doc, eserv );

			if ( null != doc.getDocumentModeId( ) && 
				 doc.getDocumentModeId( ).equalsIgnoreCase( DocumentModeIDs.ED_CONTAINER ) )
			{
				List< Edecl_Msg_Doc > cntDocs = eserv.getContainerDocuments( doc.getDocumentID( ) );

				for ( Edecl_Msg_Doc cdoc : cntDocs )
				{
					changeStatus( cdoc, eserv );
				}
			}
		}
	}

	private void changeStatus( Edecl_Msg_Doc doc, EnvelopeService eserv ) 
		throws DatabaseException
	{
		if ( null == doc )
			return;

		if ( doc.getState( ).equalsIgnoreCase( DocumentStates.CURRENT ) )
		{
			doc.setState( DocumentStates.CHANGED );
			eserv.merge( doc );
		}
		else if ( doc.getState( ).equalsIgnoreCase( DocumentStates.WAITABLE ) )
		{
			doc.setState( DocumentStates.NOTCHANGEABLE );
			eserv.merge( doc );
		}
	}
	
	protected void setRefMainIdAndState( EDJobBatchContext jobBatchContext, String state ) 
		throws Exception 
	{
		EDEnvelope envelope = jobBatchContext.getReceivedEnvelope( );
		EDContainerType incomingContainer = extractContainer( envelope );

		List< Edecl_Msg_Doc > incomingContainerDocs = _serviceHolder.getEnvelopeService( )
			.getContainerDocuments( incomingContainer.getDocumentID( ) );

		Edecl_Msg_Doc containerDoc = _serviceHolder.getEnvelopeService( )
			.getDocument( incomingContainer.getDocumentID( ) );
		
		containerDoc.setState( state );
		_serviceHolder.getEnvelopeService( ).merge( containerDoc );

		for ( Edecl_Msg_Doc doc : incomingContainerDocs )
		{
			doc.setRefMainDoc( incomingContainer.getDocumentID( ) );
			doc.setState( state );
			_serviceHolder.getEnvelopeService( ).merge( doc );
		}
	}
	
	protected void checkInnerDocsAreCurrent( String containerId, EDJobBatchContext jobBatchContext )
		throws BaseProcessingException, DatabaseException
	{
		EnvelopeService envelopeService = getServiceHolder( ).getEnvelopeService( );
		for ( Edecl_Msg_Doc doc : envelopeService.getContainerDocuments( containerId ) )
			checkState( doc, jobBatchContext );
	}
	
	protected void checkState( Edecl_Msg_Doc doc, EDJobBatchContext jobBatchContext )
		throws BaseProcessingException, DatabaseException
	{
		if ( ! DocumentStates.CURRENT.equalsIgnoreCase( doc.getState( ) ) )
			ErrorHelper.throwException( jobBatchContext, 
					ResultCodes._03_00027_08, ProcessingConstants.ERROR_TYPE_BUSINESS );
	}
	
	protected void throwException( EDJobBatchContext jobBatchContext, String resultCode )
		throws BaseProcessingException, DatabaseException
	{
		ErrorHelper.throwException( 
			jobBatchContext, resultCode, 
			ProcessingConstants.ERROR_TYPE_BUSINESS 
		);
	}
	
	/**
	 * Простой транзит на внутренний ТО (без удаленки)
	 * @throws DatabaseException 
	 */
	protected EDEnvelope createTransitToInnerCustoms( 
			EDEnvelope recvEnv,
			EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws BaseProcessingException, IllegalStateException, DatabaseException
	{
		EDEnvelope transit = EnvelopeCreator.createTranzitMessage( 
			null, recvEnv, 
			BusinessSystems.CUSTOMS, recvEnv.getReceiverCustoms( ) 
		);
		
		transit.setSaveEnvelope( true );
		
		return transit;
	}
	
	/**
	 * Простой транзит во внешний ТО (локальный)
	 * @throws DatabaseException 
	 */
	protected EDEnvelope createTransitToOuterCustomsLocalEps(
			EDEnvelope recvEnv, 
			EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws BaseProcessingException, DatabaseException
	{
		Edecl_Proc_Information processInfo = _serviceHolder.getProcedureService( ).getProcedureInfo( 
			recvEnv.getProcessID( ), recvEnv.getParticipantID( ), recvEnv.getSoftVersion( ) 
		);
		
		return createTransitToOuterCustomsLocalEps( recvEnv, jobBatchContext, jobContext, processInfo );
	}
	
	/**
	 * Простой транзит во внешний ТО (локальный)
	 * @throws DatabaseException 
	 */
	protected EDEnvelope createTransitToOuterCustomsLocalEps(
			EDEnvelope recvEnv, 
			EDJobBatchContext jobBatchContext, JobContext jobContext,
			Edecl_Proc_Information processInfo ) 
		throws BaseProcessingException, DatabaseException
	{
		CustomsType recvCustoms = new CustomsType( );
		recvCustoms.setCustomsCode( processInfo.getBorderCustCode( ) );
		recvCustoms.setExchType( String.valueOf( processInfo.getExchType( ) ) );
		
		EDEnvelope transit = EnvelopeCreator.createTranzitMessage( 
			null, recvEnv, 
			BusinessSystems.CUSTOMS, recvCustoms 
		);
		
		return transit;
	}
	
	/**
	 * Простой транзит во внешний ТО через удаленное РТУ
	 * @throws DatabaseException 
	 */
	protected EDEnvelope createTransitToOuterCustomsRemoteEps(
			EDEnvelope recvEnv,
			EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws BaseProcessingException, DatabaseException
	{
		Edecl_Proc_Information processInfo = _serviceHolder.getProcedureService( ).getProcedureInfo( 
			recvEnv.getProcessID( ), recvEnv.getParticipantID( ), recvEnv.getSoftVersion( ) 
		);
		
		return createTransitToOuterCustomsRemoteEps( 
			recvEnv, jobBatchContext, jobContext, processInfo 
		);
	}
	
	/**
	 * Простой транзит во внешний ТО через удаленное РТУ
	 * @throws DatabaseException 
	 */
	protected EDEnvelope createTransitToOuterCustomsRemoteEps(
			EDEnvelope recvEnv,
			EDJobBatchContext jobBatchContext, JobContext jobContext,
			Edecl_Proc_Information processInfo ) 
		throws BaseProcessingException, DatabaseException
	{
		CustomsType recvCustoms = new CustomsType( );
		recvCustoms.setCustomsCode( processInfo.getBorderCustCode( ) );
		recvCustoms.setExchType( String.valueOf( processInfo.getExchType( ) ) );
		
		EDEnvelope transit = EnvelopeCreator.createTranzitMessage( 
			null, recvEnv, 
			BusinessSystems.EPS, recvCustoms 
		);
		
		return transit;
	}
	
	protected EDEnvelope createNotification(
			EDEnvelope recvEnv,
			EDJobBatchContext jobBatchContext, JobContext jobContext,
			String recipientSystem, String messageType,
			boolean sign ) 
		throws Exception
	{
		// TODO: бага в receiverCustoms
		EDEnvelope notif = EnvelopeCreator.createNotificationMessage( 
			messageType, recvEnv, ResultCodes._00_00000_00, 
			recipientSystem, recvEnv.getSenderCustoms( ) 
		);
		
		if ( sign )
			CryptoHelper.signEnvelope( notif, false );
		
		return notif;
	}
	
	/*
	protected EnvelopeType createCmn00004( 
			EnvelopeType recvEnvelope, EnvelopeContext recvContext,
			JobBatchContext jobBatchContext, JobContext jobContext,
			BusinessSystem recvSystem, boolean sign ) 
		throws Exception
	{
		return createNotification( recvEnvelope, recvContext, jobBatchContext, jobContext, recvSystem, MessageType.CMN_00004, sign );
	}
	*/
	
	protected EDEnvelope createAdm00006(
			EDEnvelope recvEnv,
			EDJobBatchContext jobBatchContext, JobContext jobContext,
			String recipientSystem, boolean sign ) 
		throws Exception
	{
		return createNotification( recvEnv, jobBatchContext, jobContext, recipientSystem, MessageType.ADM_00006, sign );
	}
}
