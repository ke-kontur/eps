package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.configuration.RtuCodePatternsHolder;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.data.kind.DocumentStates;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.checks.ChecksSentence;
import ru.acs.fts.eps2.model.entities.Edecl_Messages;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.model.entities.Edecl_Substatus_State;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDDocument;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.utils.StringUtil;
import ru.acs.fts.schemas.album.addinfoforeigntradecontract.AddInfoForeignTradeContractType;
import ru.acs.fts.schemas.album.dtsout.DTSoutType;
import ru.acs.fts.schemas.album.dtsout_cu.DTSoutCUType;
import ru.acs.fts.schemas.album.esadout_cu.ESADoutCUType;
import ru.acs.fts.schemas.album.goodscomponentlist.GoodsComponentListType;
import ru.acs.fts.schemas.album.ktsout_cu.KTSoutCUType;
import ru.acs.fts.schemas.album.permitrecallgtd.PermitRecallGTDType;
import ru.acs.fts.schemas.envelope.CustomsType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Required;

/**
 * Бизнес процесс для обработки сообщения CMN.11012
 * ( Разрешение на отзыв таможенной декларации )
 * 
 * @author mrdekk
 * @since 5.0.11/3.0.8
 */
public class GtdRecallPermissionBusinessProcess extends BusinessProcess
{
	public static final String GTD_RECALLING = "GTD_RECALLING";
	
	public static final String TO_DECLARANT_NAME = "toDeclarant";
	public static final String CMN00004_TO_CUSTOMS_NAME = "toCustomsCMN00004";
	
	/**
	 * Статусы в которых при удаленной удаленке разрешено посылать MSG.11022
	 * Ключ = тип сообщения ( CMN.11012, CMN.11034 )
	 */
	private Map< String, ChecksSentence > _remoteAllowStatuses;
	
	@Required
	public void setRemoteAllowStatuses( Map< String, ChecksSentence > remoteAllowStatuses ) { _remoteAllowStatuses = remoteAllowStatuses; }
	public Map< String, ChecksSentence > getRemoteAllowStatuses( ) { return _remoteAllowStatuses; }
	
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		PermitRecallGTDType recallGtd = null;
		
		/**
		 * Проверяем статус вложенных документов ( должен быть CURRENT )
		 * и заодно вычленим PermitRecallGTD
		 */
		for ( String cDocId : recvEnv.getDocument( ).getContainerDocuments( ).keySet( ) )
		{
			EDDocument cdoc = recvEnv.getDocument( ).getDocumentInContainer( cDocId ); 
			
			if ( ( cdoc.isDocumentOfClass( ESADoutCUType.class ) ) ||
				 ( cdoc.isDocumentOfClass( DTSoutCUType.class ) ) ||
				 ( cdoc.isDocumentOfClass( DTSoutType.class ) ) ||
				 ( cdoc.isDocumentOfClass( KTSoutCUType.class ) ) ||
				 ( cdoc.isDocumentOfClass( AddInfoForeignTradeContractType.class ) ) ||
				 ( cdoc.isDocumentOfClass( GoodsComponentListType.class ) ) )
			{
				checkDocumentCurrent( cdoc.getDocumentID( ), jobBatchContext );
			}
			else if ( cdoc.isDocumentOfClass( PermitRecallGTDType.class ) )
			{
				recallGtd = cdoc.getDocumentAsClass( PermitRecallGTDType.class );
			}
		}

		String processId = recvEnv.getProcessID( );
		
		/**
		 * Проверяем правильность указания ссылочной связанности
		 */
		checkRefDocument( recallGtd, processId, jobBatchContext );		
		
		/**
		 * Найдем нужный нам субстатус процедуры
		 */
		List< Edecl_Substatus_State > substatuses = _serviceHolder.getProcedureService( ).getProcSubStatuses( processId );
		Edecl_Substatus_State recallSubstatus = null;

		for ( Edecl_Substatus_State substatus : substatuses )
		{
			if ( substatus.getStCode( ).equalsIgnoreCase( GTD_RECALLING ) &&
				 substatus.getDocumentId( ).equalsIgnoreCase( recallGtd.getRefDocumentID( ) ) )
			{
				recallSubstatus = substatus;
				break;
			}
		}
		
		/**
		 * И ругнемся если не нашли
		 */
		if ( null == recallSubstatus )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._03_00019_01, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
		
		/**
		 * Удалим его нафиг - он нам больше не нужен
		 */
		_serviceHolder.getProcedureService( ).remove( recallSubstatus );
		
		/**
		 * Ну и сформируем нужные сообщения в зависимости от удаленки 
		 */
		
		List< EDEnvelope > envelopes = new ArrayList< EDEnvelope >( );
		jobBatchContext.put( jobContext.getString( ContextConstants.ENVELOPE_NAME ), envelopes );
		
		String toDeclarantName = jobContext.getString( TO_DECLARANT_NAME );
		String toCustomsCMN00004 = jobContext.getString( CMN00004_TO_CUSTOMS_NAME );		
		
		Edecl_Proc_Information procInfo = _serviceHolder.getProcedureService( ).getProcInformation( processId );
		if ( StringUtil.isNullOrEmpty( procInfo.getBorderCustCode( ) ) )
		{
			/** Нет удаленки */			
			envelopes.add( ( EDEnvelope )jobBatchContext.get( toDeclarantName ) );
			envelopes.add( ( EDEnvelope )jobBatchContext.get( toCustomsCMN00004 ) );
		}
		else
		{
			String messageType = recvEnv.getMessageType( );
			
			/** Есть удаленка */
			RtuCodePatternsHolder rtuCodes = jobBatchContext.getConfigurator( ).getRtuPatternsHolder( );
			
			ChecksSentence remoteAllowStatuses = _remoteAllowStatuses.get( messageType );
			
			if ( rtuCodes.match( procInfo.getBorderCustCode( ) ) )
			{
				/** локальная удаленка */
				
				EDEnvelope msg11022Customs = buildLocalMSG11022( recvEnv, procInfo, jobBatchContext, jobContext );
				
				envelopes.add( ( EDEnvelope )jobBatchContext.get( toDeclarantName ) );
				envelopes.add( ( EDEnvelope )jobBatchContext.get( toCustomsCMN00004 ) );
				
				if ( remoteAllowStatuses.check( recvEnv, jobBatchContext ) ) 
					envelopes.add( msg11022Customs );
			}
			else 
			{
				/** удаленная удаленка */
				
				EDEnvelope msg11022Eps = buildRemoteMSG11022( recvEnv, procInfo, jobBatchContext, jobContext );
				
				if ( remoteAllowStatuses.check( recvEnv, jobBatchContext ) )
					envelopes.add( msg11022Eps );
				else
				{
					envelopes.add( ( EDEnvelope )jobBatchContext.get( toDeclarantName ) );
					envelopes.add( ( EDEnvelope )jobBatchContext.get( toCustomsCMN00004 ) );
				}
			}
		}
	}
	
	/**
	 * Проверим документ на статус текущий ( CURRENT )
	 * 
	 * @param documentId
	 * @throws ResultTypeException
	 * @throws DatabaseException 
	 */
	private void checkDocumentCurrent( String documentId, EDJobBatchContext jobBatchContext ) 
		throws ResultTypeException, DatabaseException
	{
		Edecl_Msg_Doc esadoutDoc = _serviceHolder.getEnvelopeService( ).getDocument( documentId );
		if ( ! esadoutDoc.getState( ).equalsIgnoreCase( DocumentStates.CURRENT ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._03_00030_01, 
				ProcessingConstants.ERROR_TYPE_CHECK 
			);
		}		
	}
	
	/**
	 * Проверим документ на который ссылается PermitRecallGTD, 
	 * что он есть и в той же процедуре
	 * 
	 * @param recallGtd
	 * @param processId
	 * @param jobBatchContext
	 * @throws ResultTypeException
	 * @throws DatabaseException 
	 */
	private void checkRefDocument( 
			PermitRecallGTDType recallGtd, String processId, 
			EDJobBatchContext jobBatchContext ) 
		throws ResultTypeException, DatabaseException
	{
		String refDocumentId = recallGtd.getRefDocumentID( );
		if ( StringUtil.isNullOrEmpty( refDocumentId ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._03_00027_01, 
				ProcessingConstants.ERROR_TYPE_CHECK 
			);
		}

		Edecl_Messages refDocMsg = _serviceHolder.getEnvelopeService( )
			.getEnvelope( processId, refDocumentId );
		
		if ( null == refDocMsg )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._03_00027_03, 
				ProcessingConstants.ERROR_TYPE_CHECK 
			);
		}
		
	}
	
	/**
	 * Создаем MSG.11022 для пересылки на локальный "удаленный" пост при локальной удаленке
	 * 
	 * @param receivedEnv
	 * @param procInfo
	 * @param jobBatchContext
	 * @param jobContext
	 * @return
	 * @throws DatabaseException 
	 * @throws ResultTypeException
	 */
	private EDEnvelope buildLocalMSG11022( 
			EDEnvelope recvEnv, 
			Edecl_Proc_Information procInfo, 
			EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws BaseProcessingException, DatabaseException 
	{
		Map< String, String > messageTypeSubstituion = new HashMap< String, String >( );
		messageTypeSubstituion.put( recvEnv.getMessageType( ), MessageType.MSG_11022 );
		
		CustomsType receiverCustoms = new CustomsType( );
		receiverCustoms.setCustomsCode( procInfo.getBorderCustCode( ) );
		receiverCustoms.setExchType( Integer.toString( procInfo.getExchType( ) ) );		
		
		EDEnvelope respEnvelope = EnvelopeCreator.createTranzitMessage( 
			messageTypeSubstituion, recvEnv, 
			BusinessSystems.CUSTOMS, receiverCustoms 
		);
		
		respEnvelope.setInitialEnvelopeID( null );
				
		return respEnvelope;
	}
	
	/**
	 * Создаем MSG.11022 для пересылки на удаленный "удаленный" пост при удаленной удаленке
	 * ( пардона за тафталогию, но оно действительно так )
	 * 
	 * @param receivedEnv
	 * @param procInfo
	 * @param jobBatchContext
	 * @param jobContext
	 * @return
	 * @throws DatabaseException 
	 * @throws ResultTypeException
	 */
	private EDEnvelope buildRemoteMSG11022( 
			EDEnvelope recvEnv,
			Edecl_Proc_Information procInfo,
			EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws BaseProcessingException, DatabaseException
	{
		CustomsType receiverCustoms = new CustomsType( );
		receiverCustoms.setCustomsCode( procInfo.getBorderCustCode( ) );
		receiverCustoms.setExchType( Integer.toString( procInfo.getExchType( ) ) );

		Map< String, String > messageTypeSubstituion = new HashMap< String, String >( );
		messageTypeSubstituion.put( recvEnv.getMessageType( ), MessageType.MSG_11022 );
		
		EDEnvelope respEnvelope = EnvelopeCreator.createTranzitMessage( 
			messageTypeSubstituion, recvEnv, 
			BusinessSystems.EPS, receiverCustoms 
		);
		
		respEnvelope.setInitialEnvelopeID( null );
									
		return respEnvelope;
	}
}
