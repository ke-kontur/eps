package ru.acs.fts.eps2.router.processing.jobs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobBatchContext;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.system.ErrorQueueTypes;
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.objects.EDDocument;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.objects.defines.DocumentUniquenesses;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.util.helpers.UUIDGen;
import ru.acs.fts.eps2.utils.StringUtil;
import ru.acs.fts.schemas.envelope.CustomsType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Задача создания транзитных сообщений
 * 
 * Позволяет создавать транзитные сообщения. 
 * 
 * <h1>JobContext:</h1>
 * <p><strong>receivingSystem</strong> - получающая система. Лучше сий параметр задавать явно, т.к.
 * в противном случае задача будет пытаться догадываться сама. Догадываться она умеет только в том случае, если
 * обмен идет DECLARANT <-> CUSTOMS, и только в таком случае. Догадываться про EAD, EPS, ADMIN и другие системы
 * данная задача не умеет!</p>
 * <p><strong>documentName</strong> - ключ документа в JobBatchContext. Нужен если требуется вставить
 * в формируемый конверт какой-то другой документ, а не тот, что пришел в исходном сообщении.
 * Предполагается, что документ может содержать подпись, а может и не содержать - проверки на это
 * данная задача не производит!</p>
 * <p><strong>messageType</strong> - тип создаваемого транзитного сообщения. Нужно если требуется подменить его.</p> 
 * <p><strong>senderCustomsCodeFromProcInfo</strong> - подменить код таможни отправления.</p>
 * <p><strong>putIntoList</strong> - имя списка в который нужно добавить конверт. Если требуется конверт не записать в
 * отдельную переменную в контексте списка задач, а добавить в уже созданный список, то в этой переменной передается имя
 * этого самого списка.</p>
 * <p><strong>envelopeName</strong> - имя переменной в контексте в которую нужно записать полученный конверт</p>
 * 
 * @author mrdekk
 */
public class CreateTransitMessage extends EDJob
{
	protected final Logger log = LoggerFactory.getLogger( CreateTransitMessage.class );

	protected final String action = "Создание транзитного сообщения";
	protected final String errorQueueToSend = ErrorQueueTypes.ERROR_FATAL;

	@Override
	public void edExecute( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		Map< String, String > messageTypeSubstituion = null;
		if ( jobContext.contains( ContextConstants.MESSAGE_TYPE ) )
		{
			String transitMessageType = jobContext.getString( ContextConstants.MESSAGE_TYPE );
			if ( ! StringUtil.isNullOrEmpty( transitMessageType ) )
			{
				messageTypeSubstituion = new HashMap< String, String >( );
				messageTypeSubstituion.put( recvEnv.getMessageType( ), transitMessageType );
			}
		}
		
		if ( jobContext.contains( ContextConstants.MESSAGE_TYPES ) )
		{
			@SuppressWarnings( "unchecked" ) 
			Map< String, String > transitMessageTypes = 
				( Map< String, String > )jobContext.get( ContextConstants.MESSAGE_TYPES );
			String incomeMessageType = recvEnv.getMessageType( );
			
			if ( null != transitMessageTypes && 
				 transitMessageTypes.containsKey( incomeMessageType ) )
			{
				messageTypeSubstituion = transitMessageTypes;
			}
		}
		
		InferredResults res = inferBusinessSystem( recvEnv );
		String recipientSystem = res.getBusinessSystem( );
		CustomsType receivingCustoms = res.getCustoms( );
		
		if ( jobContext.contains( ContextConstants.RECEIVING_SYSTEM ) )
		{
			String bs = jobContext.getString( ContextConstants.RECEIVING_SYSTEM );
			if ( ! StringUtil.isNullOrEmpty( bs ) )
			{
				recipientSystem = bs;
				if ( BusinessSystems.isSuchSystem( bs, BusinessSystems.CUSTOMS ) ||
					 BusinessSystems.isSuchSystem( bs, BusinessSystems.EPS ) ||					 
					 /*BusinessSystems.isSuchSystem( bs, BusinessSystems.MALAKHIT ) ||*/
                        BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.ORDER ) ||
                        BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.PAYMENT1 ) ||
                        BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.PAYMENT2 ))
				{
					receivingCustoms = recvEnv.getReceiverCustoms( );
				}
				else if(BusinessSystems.isSuchSystem( bs, BusinessSystems.MALAKHIT )){
					String exchType = ( null != recvEnv.getSenderCustoms( ) )
							? recvEnv.getSenderCustoms( ).getExchType( )
							: recvEnv.getReceiverCustoms( ).getExchType( );

					receivingCustoms = new CustomsType( );
					receivingCustoms.setCustomsCode( jobBatchContext.getConfigurator( ).getMalakhitCustomsCode( ) );
					receivingCustoms.setExchType( exchType );
				}
				else if ( BusinessSystems.isSuchSystem( bs, BusinessSystems.ASKTT2 ) )
				{
					String exchType = ( null != recvEnv.getSenderCustoms( ) ) 
						? recvEnv.getSenderCustoms( ).getExchType( )
						: recvEnv.getReceiverCustoms( ).getExchType( );
					
					receivingCustoms = new CustomsType( );
					receivingCustoms.setCustomsCode( jobBatchContext.getConfigurator( ).getAsktt2CustomsCode( ) );
					receivingCustoms.setExchType( exchType );
				}
			}
		}
		
		EDEnvelope transit = EnvelopeCreator.createTranzitMessage( 
			messageTypeSubstituion, recvEnv, 
			recipientSystem, receivingCustoms 
		);

		if ( jobContext.contains( ContextConstants.DOCUMENT_NAME ) )
		{
			EDDocument document = ( EDDocument )jobBatchContext.get(
				jobContext.getString( ContextConstants.DOCUMENT_NAME )
			);
			
			transit.setDocument( document );
		}
		
		/**
		 * Иногда требуется сделать следующий финт ушами
		 * EDHeader.SenderCustoms.CustomsCode = PROC_INFO.PROC_CUST_CODE
		 */
		if ( jobContext.getBoolean( ContextConstants.SENDER_CUSTOMS_CODE_FROM_PROC_INFO ) )
		{
			String processId = recvEnv.getProcessID( );
			if ( ! StringUtil.isNullOrEmpty( processId ) )
			{
				Edecl_Proc_Information procInfo = jobBatchContext.getServiceHolder( )
					.getProcedureService( ).getProcInformation( processId );
				
				CustomsType senderCustoms = transit.getSenderCustoms( );
				if ( null != senderCustoms )
				{
					CustomsType newSenderCustoms = new CustomsType( );
					newSenderCustoms.setCustomsCode( procInfo.getCustCode( ) );
					newSenderCustoms.setExchType( senderCustoms.getExchType( ) );
					transit.getEDHeader( ).setSenderCustoms( newSenderCustoms );
				}
			}
		}

		/**
		 * Иногда требуется сделать следующий финт ушами
		 * EDHeader.ReceiverCustoms.CustomsCode = PROC_INFO.PROC_CUST_CODE
		 */
		if ( jobContext.getBoolean( ContextConstants.RECEIVER_CUSTOMS_CODE_FROM_PROC_INFO ) )
		{
			String processId = recvEnv.getProcessID( );
			if ( ! StringUtil.isNullOrEmpty( processId ) )
			{
				Edecl_Proc_Information procInfo = jobBatchContext.getServiceHolder( )
					.getProcedureService( ).getProcInformation( processId );
				
				CustomsType receiverCustoms = transit.getReceiverCustoms( );
				if ( null != receiverCustoms )
				{
					CustomsType newReceiverCustoms = new CustomsType( );
					newReceiverCustoms.setCustomsCode( procInfo.getCustCode( ) );
					newReceiverCustoms.setExchType( receiverCustoms.getExchType( ) );
					transit.getEDHeader( ).setReceiverCustoms( newReceiverCustoms );
				}
			}
		}
		
		/**
		 * Иногда требуется сделать следующий финт ушами
		 * EDHeader.ReceiverCustoms.ExchType = PROC_INFO.PROC_EXCH_TYPE
		 */
		if ( jobContext.getBoolean( ContextConstants.RECEIVER_EXCH_TYPE_FROM_PROC_INFO ) )
		{
			String processId = recvEnv.getProcessID( );
			if ( ! StringUtil.isNullOrEmpty( processId ) ) 
			{
				Edecl_Proc_Information procInfo = jobBatchContext.getServiceHolder( )
					.getProcedureService( ).getProcedureInformation( processId );
				
				CustomsType receiverCustoms = transit.getReceiverCustoms( );
				if ( null != receiverCustoms )
				{
					receiverCustoms.setExchType( Integer.toString( procInfo.getExchType( ) ) );
				}
			}
		}
		
		/**
		 * Установить в качестве SenderCustoms код ТО электрички
		 */
		if ( jobContext.getBoolean( ContextConstants.SENDER_CUSTOMS_AS_EPS ) )
		{
			CustomsType cc = recvEnv.getReceiverCustoms( );
			if ( null == cc )
				cc = recvEnv.getSenderCustoms( );
			
			CustomsType senderCustoms = new CustomsType( );
			senderCustoms.setCustomsCode( jobBatchContext.getConfigurator( ).getEpsCustomsCode( ) );
			senderCustoms.setExchType( cc.getExchType( ) );
			
			transit.getEDHeader( ).setSenderCustoms( senderCustoms );
		}
		
		/**
		 * Иногда требуется подменить RefDocumentID через Income
		 */
		if ( jobBatchContext.getBoolean( ContextConstants.SET_REF_AS_INCOME_DOCUMENT_ID ) &&
			 ! transit.getDocument( ).hasSignature( ) )
		{
			String incomeDocId = jobBatchContext.getString( ContextConstants.INCOME_DOCUMENT_ID );
			String documentId = UUIDGen.getUUID( ).toString( );
			
			transit.getDocument( ).setIncomeDocumentID( transit.getDocument( ).getDocumentID( ) );
			transit.getDocument( ).setDocumentID( documentId );
			transit.getDocument( ).setRefDocumentID( incomeDocId );
			transit.getDocument( ).setUniqueness( DocumentUniquenesses.UNIQ );
		}
		
		/**
		 * Сохранение сгенерированного документа в контексте:
		 */
		updateJobBatchContext( jobBatchContext, jobContext, transit );
					
		jobBatchContext.getProcessingResult( ).addOKProcessingInfo( action );			
	}
	
	@Override
	public String getAction( )
	{
		return action;
	}	
	
	private InferredResults inferBusinessSystem( EDEnvelope recvEnv )
	{
		String senderSystem = recvEnv.getSenderSystem( );
		
		if ( BusinessSystems.isSuchSystem( senderSystem, BusinessSystems.DECLARANT ) )
		{
			return new InferredResults( BusinessSystems.CUSTOMS, recvEnv.getReceiverCustoms( ) );
		}
		else if ( BusinessSystems.isSuchSystem( senderSystem, BusinessSystems.CUSTOMS ) )
		{
			return new InferredResults( BusinessSystems.DECLARANT );
		}
		else if ( BusinessSystems.isSuchSystem( senderSystem, BusinessSystems.ADMIN ) )
		{
			return new InferredResults( BusinessSystems.CUSTOMS, recvEnv.getReceiverCustoms( ) );
		}
		else if ( BusinessSystems.isSuchSystem( senderSystem, BusinessSystems.EPS ) )
		{
			return new InferredResults( BusinessSystems.CUSTOMS, recvEnv.getReceiverCustoms( ) );
		}
		else if ( BusinessSystems.isSuchSystem( senderSystem, BusinessSystems.MALAKHIT ) ||
                BusinessSystems.isSuchSystem( senderSystem, BusinessSystems.ORDER ) ||
                BusinessSystems.isSuchSystem( senderSystem, BusinessSystems.PAYMENT1 ) ||
                BusinessSystems.isSuchSystem( senderSystem, BusinessSystems.PAYMENT2 ))
		{
			return new InferredResults( BusinessSystems.DECLARANT );
		}
		else if ( BusinessSystems.isSuchSystem( senderSystem, BusinessSystems.ASKTT2 ) )
		{
			return new InferredResults( BusinessSystems.CUSTOMS, recvEnv.getReceiverCustoms( ) );
		}
		
		return null;
	}
	
	private void updateJobBatchContext( 
			JobBatchContext jobBatchContext, JobContext jobContext, 
			EDEnvelope transit )
	{			
		if ( jobContext.getBoolean( ContextConstants.PUT_INTO_LIST ) )
		{
			@SuppressWarnings( "unchecked" )
			List< EDEnvelope > envelopes = ( List< EDEnvelope > ) jobBatchContext.get( 
				jobContext.getString( ContextConstants.ENVELOPE_NAME ) 
			);
			
			envelopes.add( transit );
		}
		else
		{
			jobBatchContext.put( 
				jobContext.getString( ContextConstants.ENVELOPE_NAME ), 
				transit 
			);
		}
	}	
	
	private static class InferredResults
	{
		private final String _businessSystem;
		private final CustomsType _customs;
		
		public InferredResults( String businessSystem )
		{
			_businessSystem = businessSystem;
			_customs = null;
		}
		
		public InferredResults( String businessSystem, CustomsType customs )
		{
			_businessSystem = businessSystem;
			_customs = customs;
		}
		
		// @formatter:off
		public String getBusinessSystem( ) { return _businessSystem; }
		public CustomsType getCustoms( ) { return _customs; }
		// @formatter:on
	}
}
