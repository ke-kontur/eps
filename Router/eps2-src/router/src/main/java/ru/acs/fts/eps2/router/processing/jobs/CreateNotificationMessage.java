package ru.acs.fts.eps2.router.processing.jobs;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.data.kind.DocumentModeIDs;
import ru.acs.fts.eps2.engine.processing.*;
import ru.acs.fts.eps2.engine.processing.system.ErrorQueueTypes;
import ru.acs.fts.eps2.model.entities.Edecl_Result;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.AdminCommandsHelper;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.util.helpers.UUIDGen;
import ru.acs.fts.eps2.utils.StringUtil;
import ru.acs.fts.schemas.admin.int_dtrequest.INTDTRequestType;
import ru.acs.fts.schemas.admin.int_dtresponce.INTDTResponseType;
import ru.acs.fts.schemas.album.result.ResponseType;
import ru.acs.fts.schemas.album.result.ResultInformationType;
import ru.acs.fts.schemas.album.result.ResultType;
import ru.acs.fts.schemas.envelope.CustomsType;

/**
 * Задача создания сообщения уведомления (CMN.00002, CMN.00004, ...)
 * 
 * Параметры JobContext
 * <ul>
 * <li><strong>messageType</strong> - тип генерируемого сообщения</li>
 * <li><strong>clearProcessId</strong> - требование сбросить идентификатор процедуры (&lt;ProccessID&gt;)</li>
 * <li><strong>envelopeName</strong> - наименование конверта в батче пакета задач</li>
 * <li><strong>receivingSystem</strong> - идентификатор системы-получателя сообщения</li>
 * </ul>
 */
public class CreateNotificationMessage extends EDJob
{
	protected final Logger log = LoggerFactory.getLogger( CreateNotificationMessage.class );
	
	protected final String action = "Создание сообщения уведомления";	
	protected final String errorQueueToSend = ErrorQueueTypes.ERROR_FATAL;
	
	@Override
	public void edExecute( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		/**
		 * Создание квитанций и сообщений-уведомлений
		 * ( сообщения CMM.00001, CMN.00002, CMN.00004 ) 
		 */

		ProcessingResult processingResult = jobBatchContext.getProcessingResult( );			
		
		try
		{
			EDEnvelope env = jobBatchContext.getReceivedEnvelope( );

			String messageType = jobContext.getString( ContextConstants.MESSAGE_TYPE );
			messageType = inferMessageType( env, messageType );
			log.debug( String.format( "Создаем сообщение типа %s", messageType ) );
			
			EDEnvelope envelope = null;
			
			if ( BusinessSystems.isSuchSystem( env.getSenderSystem( ), BusinessSystems.ADMIN ) &&
				 MessageType.ADM_00001.equals( messageType ) )
			{
				envelope = createAdminNotification( jobBatchContext, env, messageType );
			}
			else if ( MessageType.PVR_00001.equals( env.getMessageType( ) ) && MessageType.CMN_00001.equals( messageType ) )
			{
				messageType = MessageType.PVR_00002;
				envelope = createNotification( jobBatchContext, env, jobContext, messageType );
				envelope.setSoftVersion( env.getDocument( ).getDocumentAsClass( INTDTRequestType.class ).getSoftVersionID( ) );
			}
			else
			{
				envelope = createNotification( jobBatchContext, env, jobContext, messageType );
			}
			
			String resCode = getResultCode( jobBatchContext, messageType );
			if ( ! ResultCodes.areCodesEquals( ResultCodes._00_00000_00, resCode ) )
			{
				saveResultToBd( env, resCode, jobBatchContext );
			}
										
			if ( jobContext.getBoolean( ContextConstants.CLEAR_PROCESS_ID ) )
				envelope.getEDHeader( ).setProccessID( null );
			
			jobBatchContext.put( 
				jobContext.getString( ContextConstants.ENVELOPE_NAME ), 
				envelope 
			);

			processingResult.addOKProcessingInfo( action );
		}
		catch ( Exception e )
		{
			String errorMsg = String.format( 
				"Ошибка при при создании сообщения уведомления %s", 
				e.getMessage( ) 
			); 
			
			processingResult.setFailProcessingState( action, errorMsg );
			
			log.error( errorMsg, e );
			
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._09_00006_01, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
	}
	
	@Override
	public String getAction( )
	{
		return action;
	}
	
	private void saveResultToBd( EDEnvelope incomeEnvelope, String resultCode, EDJobBatchContext jobBatchContext )
	{
		try
		{
			Edecl_Result edRes = new Edecl_Result( );
			edRes.setDocumentId( incomeEnvelope.getDocument( ).getDocumentID( ) ); 			
			edRes.setEnvelopeId( incomeEnvelope.getEnvelopeID( ) );			
			edRes.setResultCode( resultCode );
			
			jobBatchContext.getServiceHolder( ).getEnvelopeService( ).persist( edRes );
		}
		catch ( Exception e )
		{
			log.error( String.format(
				"Ошибка сохранения результата обработки в БД. Откат транзакции не планируется. Ошибка: %s",
				e.getMessage( ) ), e 
			);
		}
	}
	
	private String getResultCode( EDJobBatchContext jobBatchContext, String messageType )
	{
		String resultCode = ResultCodes._00_00000_00;
		
		if ( ! MessageType.isOkNotification( messageType ) )
			resultCode = jobBatchContext.getInitialFailedResultCode( );
		
		return resultCode;
	}
	
	private EDEnvelope createNotification( 
			EDJobBatchContext jobBatchContext, EDEnvelope recvEnv,
			JobContext jobContext, String messageType ) 
		throws BaseProcessingException, DatabaseException
	{
		String recipientSystem = inferRecipientSystem( jobContext, recvEnv );		
		CustomsType recvCustoms = recvEnv.getSenderCustoms( );		
		String resultCode = getResultCode( jobBatchContext, messageType );
		
		EDEnvelope envelope = EnvelopeCreator.createNotificationMessage(
			messageType, jobBatchContext.getReceivedEnvelope( ), 
			resultCode, 
			recipientSystem, recvCustoms
		);
		
		// TODO: Сделать код по обработке BaseProcessingException
		BaseProcessingException cex = jobBatchContext.getContextException( );
		if ( ( messageType.equals( MessageType.CMN_00001 ) ||
			   messageType.equals( MessageType.CMN_09999 ) ||
			   messageType.equals( MessageType.ADM_00001 ) ||
			   messageType.equals( MessageType.ADM_00007 ) ||
			   messageType.equals( MessageType.PVR_00002 ) ) &&
			 null != cex && ( cex instanceof ResultTypeException ) )
		{
			ResultTypeException rtex = ( ResultTypeException ) cex ;
			ResultType resType = rtex.getResult( );
			
			if ( null != resType )
			{
				if ( messageType.equals( MessageType.PVR_00002 ) )
				{
					INTDTResponseType response = new INTDTResponseType( );
					
					response.setDocumentModeID( DocumentModeIDs.INT_DT_RESPONSE );
					response.setDocumentID( UUIDGen.getUUID( ).toString( ) );
					response.setRefDocumentID( recvEnv.getDocument( ).getDocumentID( ) );
					
					List< ResponseType > responses = resType.getResponseList( );
					if ( null != responses && ! responses.isEmpty( ) && null != responses.get( 0 ) )
					{
						ResponseType resp = responses.get( 0 );
						List< ResultInformationType > results = resp.getResultInformationList( );
						if ( null != results && ! results.isEmpty( ) && null != results.get( 0 ) )
						{
							ResultInformationType res = results.get( 0 );
							response.setResultCode( res.getResultCode( ) );
							
							List< String > descs = res.getResultDescriptionList( );
							if ( null != descs && ! descs.isEmpty( ) )
								response.setResultDescription( null != descs.get( 0 ) ? descs.get( 0 ) : "" );
						}
					}
				}
				else
				{
					envelope.setInnerDocument( resType );
				}
			}
		}
				
		return envelope;
	}
	
	private EDEnvelope createAdminNotification( 
			EDJobBatchContext jobBatchContext,
			EDEnvelope recvEnv, String messageType ) 
		throws BaseProcessingException, IllegalStateException, DatabaseException 
	{
		String resCode = ResultCodes._09_96669_99;
		String resDescription = "";
		
		if ( jobBatchContext.getInitialFailedResultCode( ) != null )
		{
			resCode = jobBatchContext.getInitialFailedResultCode( )	;			
			resDescription = getContextExceptionResultDescription( jobBatchContext );
		}
		else
		{
			BaseProcessingException contextException = jobBatchContext.getContextException( );
			
			if ( contextException != null && contextException.getResultCode( ) != null )
			{
				resCode = contextException.getResultCode( );					
				resDescription = getContextExceptionResultDescription( jobBatchContext );
			}
		}
		
		String documentId = recvEnv.getDocument( ).getDocumentID( ); 
		
		return AdminCommandsHelper.createUtilMessage( recvEnv, documentId, messageType, resCode, resDescription );
	}
	
	private String getContextExceptionResultDescription( EDJobBatchContext jobBatchContext )
	{
		try
		{
			return jobBatchContext.getServiceHolder( ).getErrListService( )
				.getErrList( jobBatchContext.getInitialFailedResultCode( ) )
				.getPublicDescription( );
		}
		catch ( Exception exception )
		{
			log.error( "Ошибка получения описания ошибки с кодом "
				+ jobBatchContext.getInitialFailedResultCode( )
					+ exception.getMessage( ),
				exception );
		}
		
		return "";
	}
	
	/**
	 * Иногда требуется подменить тип сообщения, делаем это тут
	 * 
	 * @param env Входящий конверт
	 * @param messageType Требуемый из контекста тип сообщения
	 * @return
	 */
	private String inferMessageType( EDEnvelope env, String messageType )
	{
		if ( BusinessSystems.isSuchSystem( env.getSenderSystem( ), BusinessSystems.EPS ) )
		{
			if ( messageType.equals( MessageType.CMN_00001 ) || 
				 messageType.equals( MessageType.ADM_00001 ) )
			{
				if ( ! StringUtil.isNullOrEmpty( env.getProcessID( ) ) &&
					 ! env.getMessageType( ).equals( MessageType.ADM_00007 ) &&
					 ! env.getMessageType( ).equals( MessageType.ADM_00001 ) )
					return MessageType.ADM_00007;
				else
					return MessageType.ADM_00001;
			}
		}		
		
		return messageType;
	}
	
	private String inferRecipientSystem( JobContext jobContext, EDEnvelope recvEnv )
	{
		String recipientSystem = jobContext.getString( ContextConstants.RECEIVING_SYSTEM );
		if ( ! StringUtil.isNullOrEmpty( recipientSystem ) )
			return recipientSystem;
		
		return recvEnv.getSenderSystem( );
	}
}
