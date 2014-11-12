package ru.acs.fts.eps2.router.processing.helpers;

import java.util.Map;

import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.processing.checks.ChecksSentence;
import ru.acs.fts.eps2.model.services.DocModeMessageService;
import ru.acs.fts.eps2.model.services.EnvelopeService;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDDocument;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.utils.StringUtil;
import ru.acs.fts.schemas.album.ed_container.EDContainerType;

public class EnvelopeChecker
{
	private static Map< String, ChecksSentence > _completenessCheckSentences;
	private static Map< String, Boolean > _forbidRefDocumentIds;
	
	// @formatter:off
	public void setCompletenessCheckSentences( Map< String, ChecksSentence > completenessCheckSentences ) { _completenessCheckSentences = completenessCheckSentences; }
	public Map< String, ChecksSentence > getCompletenessCheckSentences( ) { return _completenessCheckSentences; }
	
	public void setForbidRefDocumentIds( Map< String, Boolean > forbidRefDocumentIds ) { _forbidRefDocumentIds = forbidRefDocumentIds; }
	public Map< String, Boolean > getForbidRefDocumentIds( ) { return _forbidRefDocumentIds; }
	// @formatter:on
	
	/**
	 * Функция проверяет наличие (если требуется) InitialEnvelopeID
	 * Если во входящем конверте такое поле присутствует, проверяется наличие соответствующего 
	 * конверта в базе данных
	 * 
	 * @param jobBatchContext
	 * @param requireInitialEnvelopeID
	 * @throws ResultTypeException
	 * @throws DatabaseException 
	 */
	public static void checkInitialEnvelopeID( 
			EDJobBatchContext jobBatchContext, boolean requireInitialEnvelopeID ) 
		throws ResultTypeException, DatabaseException
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		String initialEnvelopeId = recvEnv.getInitialEnvelopeID( );
		
		if ( StringUtil.isNullOrEmpty( initialEnvelopeId ) )
		{
			if ( requireInitialEnvelopeID )
			{
				ErrorHelper.throwException( 
					jobBatchContext, 
					ResultCodes._03_00028_01, 
					ProcessingConstants.ERROR_TYPE_CHECK
				);
			}
		}
		else
		{
			EnvelopeService srv = jobBatchContext.getServiceHolder( ).getEnvelopeService( );
			
			if ( ! srv.envelopeExists( initialEnvelopeId ) )
			{
				ErrorHelper.throwException( 
					jobBatchContext, 
					ResultCodes._03_00028_01, 
					ProcessingConstants.ERROR_TYPE_CHECK 
				);
			}			
		}
	}
	
	/**
	 * Функция проверяет наличие ссылочного документа в базе при наличии ссылки на него во 
	 * входящему документе( в том числе проверяется и контейнер )
	 * 
	 * @param jobBatchContext
	 * @throws ResultTypeException
	 * @throws DatabaseException 
	 */
	public static void checkRefDocumentID( EDJobBatchContext jobBatchContext ) 
		throws ResultTypeException, DatabaseException
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		String sender = jobBatchContext.getSenderSystem( );
		String refDocumentId = recvEnv.getDocument( ).getRefDocumentID( );
		
		if ( StringUtil.isNullOrEmpty( refDocumentId ) )
			return ;
		
		String messageType = recvEnv.getEDHeader( ).getMessageType( );
		if ( _forbidRefDocumentIds.containsKey( messageType ) &&
			 _forbidRefDocumentIds.get( messageType ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._03_00027_10, 
				ProcessingConstants.ERROR_TYPE_CHECK 
			);
		}
		
		EnvelopeService srv = jobBatchContext.getServiceHolder( ).getEnvelopeService( );
		if ( ! BusinessSystems.isSuchSystem( sender, BusinessSystems.EPS ) && 
			 ! srv.documentExists( refDocumentId ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._02_00001_01, 
				ProcessingConstants.ERROR_TYPE_CHECK 
			);
		}
		
		if ( recvEnv.getDocument( ).isContainer( ) )
		{
			for ( String cDocId : recvEnv.getDocument( ).getContainerDocuments( ).keySet( ) )
			{
				EDDocument cdoc = recvEnv.getDocument( ).getDocumentInContainer( cDocId );
				
				refDocumentId = cdoc.getRefDocumentID( );
				if ( StringUtil.isNullOrEmpty( refDocumentId ) )
					continue;
				
				if ( _forbidRefDocumentIds.containsKey( messageType ) &&
					 _forbidRefDocumentIds.get( messageType ) )
				{
					ErrorHelper.throwException( 
						jobBatchContext, 
						ResultCodes._03_00027_10, 
						ProcessingConstants.ERROR_TYPE_CHECK 
					);					
				}
				if ( ! BusinessSystems.isSuchSystem( sender, BusinessSystems.EPS ) && 
					 ! srv.documentExists( refDocumentId ) )
				{
					ErrorHelper.throwException( 
						jobBatchContext, 
						ResultCodes._02_00001_01, 
						ProcessingConstants.ERROR_TYPE_CHECK 
					);
				}
			}
		}
	}
		
	/**
	 * Функция проверяет соответствие вложенного в сообщение документа
	 * указанному в заголовке типу сообщения
	 * Используется входящее сообщение!
	 * 
	 * @param jobBatchContext
	 * @throws ResultTypeException
	 * @throws DatabaseException 
	 */
	public static void isDocumentAllowedForMessage( EDJobBatchContext jobBatchContext ) 
		throws ResultTypeException, DatabaseException
	{
		DocModeMessageService srv = jobBatchContext.getServiceHolder( ).getDocModeMessageService( );
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		String documentModeId = recvEnv.getDocument( ).getDocumentModeID( );
		String messageType = recvEnv.getEDHeader( ).getMessageType( );
		
		if ( ! srv.isDocModeMessageExists( documentModeId, messageType ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._01_00072_01, 
				ProcessingConstants.ERROR_TYPE_AUTH 
			);
		}
	}
	
	/**
	 * функция проверяет комплектность контейнера
	 * 
	 * @param jobBatchContext
	 * @throws Exception 
	 */
	public static void checkContainerCompleteness( EDJobBatchContext jobBatchContext )
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		Object doc = recvEnv.getDocument( ).getNakedDocument( );;
		if ( ! ( doc instanceof EDContainerType ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._03_00014_01, 
				ProcessingConstants.ERROR_TYPE_CHECK 
			);
		}
		
		ChecksSentence sentence = _completenessCheckSentences.get( recvEnv.getMessageType( ) );
		if ( null == sentence )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._09_96669_99, 
				ProcessingConstants.ERROR_TYPE_CHECK 
			);
		}
		
		if ( ! sentence.check( recvEnv, jobBatchContext ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._03_00014_01, 
				ProcessingConstants.ERROR_TYPE_CHECK 
			);			
		}
	}
	
	public static boolean isCompletenessChecked( String messageType )
	{
		return null != _completenessCheckSentences.get( messageType );
	}
}
