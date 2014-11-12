package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.data.kind.DocumentModeIDs;
import ru.acs.fts.eps2.engine.data.kind.DocumentStates;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.engine.processing.ProcedureChangeInformation;
import ru.acs.fts.eps2.engine.util.RemotenessHelper;
import ru.acs.fts.eps2.model.entities.Edecl_Customs;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.model.services.CustomsService;
import ru.acs.fts.eps2.model.services.EnvelopeService;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDDocument;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.persistence.operators.CustomsOperator;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.utils.StringUtil;
import ru.acs.fts.schemas.album.ed_container.EDContainerType;
import ru.acs.fts.schemas.album.esadout_cu.ESADoutCUType;
import ru.acs.fts.schemas.album.gtdoutcustomsmark.GTDOutCustomsMarkType;
import ru.acs.fts.schemas.envelope.CustomsType;

/**
 * @author SAA
 * Проверил и обновил: mrdekk
 * 
 * <p>Параметры контекста задачи (JobContext):</p>
 * 
 * <ul>
 * <li><b>envelopes</b> - имя списка конвертов, где будут храниться конверты для отправки</li>
 * </ul>
 */
public class ImportExportMessagesBusinessProcess extends BusinessProcess
{
	private static final Logger log = LoggerFactory.getLogger( ImportExportMessagesBusinessProcess.class );
	
	private final static String cmnTransitName = "cmnTransit";	
	private final static String cmn00004notifName = "cmn00004notif";	
	private final static String msgLocalTransitName = "msgLocalTransit";	
	private final static String msgRemoteTransitName = "msgRemoteTransit";
	
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		/**
		 * Требования к проверке комплектности смотри либо внутри функции checkCompleteness,
		 * либо в основном документе спецификации обмена
		 */
		boolean isNeedCheckSum = isNeedCheckSum( recvEnv.getMessageType( ) ); 
		checkCompleteness( jobBatchContext, isNeedCheckSum );
		
		checkStates( jobBatchContext );
		
		List< EDEnvelope > envelopes = createAndPutEnvelopes( jobBatchContext, jobContext );

		Edecl_Proc_Information process = getProcess( recvEnv );		
		
		if ( isRemoteImport( process ) )
		{
			String borderCustCode = process.getBorderCustCode( );
			String senderCustCode = recvEnv.getSenderCustoms( ).getCustomsCode( );

			if ( RemotenessHelper.areCustomsLocal( senderCustCode, borderCustCode ) )
			{
				envelopes.add( prepareCmnTransit( jobBatchContext ) );
				envelopes.add( prepareMsgLocalTransit( jobBatchContext, recvEnv, process ) );
				envelopes.add( prepareCmn00004Notif( jobBatchContext ) );
			}
			else
			{
				envelopes.add( prepareMsgRemoteTransit( jobBatchContext, recvEnv, process ) );
			}
		}
		else
		{
			envelopes.add( prepareCmnTransit( jobBatchContext ) );
			envelopes.add( prepareCmn00004Notif( jobBatchContext ) );
		}
		
		String messageType = recvEnv.getMessageType( );
		if ( messageType.equalsIgnoreCase( MessageType.CMN_11093 ) ||
			 messageType.equalsIgnoreCase( MessageType.CMN_11094 ) )
		{
			makeContainerCurrent( jobBatchContext, jobContext );
		}
		
		if ( messageType.equalsIgnoreCase( MessageType.CMN_11010 ) ||
			 messageType.equalsIgnoreCase( MessageType.CMN_11033 ) )
		{
			ProcedureChangeInformation procChInfo = jobBatchContext.getProcedureChangeInformation( );
			if ( null != procChInfo )
			{
				procChInfo.setNewFlags( procChInfo.getNewFlags( ) | Edecl_Proc_Information.FLAG_PROC_ISSUED );
			}
		}
	}
	
	/**
	 * Документы из контейнера должны иметь состояние "CURRENT"
	 * @throws DatabaseException 
	 */
	private void checkDocumentState( Edecl_Msg_Doc document, EDJobBatchContext jobBatchContext )
		throws ResultTypeException, DatabaseException
	{
		if ( null == document || ! document.getState( ).equalsIgnoreCase( DocumentStates.CURRENT ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._03_00030_01, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
	}
	
	private void checkStates( EDJobBatchContext jobBatchContext )
		throws Exception
	{
		EnvelopeService envelopeService = _serviceHolder.getEnvelopeService( );

		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		Set< String > allowedDocModeIds = new HashSet< String >( );
		allowedDocModeIds.add( DocumentModeIDs.ESAD_OUT_CU );
		allowedDocModeIds.add( DocumentModeIDs.DTS_OUT_CU );
		allowedDocModeIds.add( DocumentModeIDs.DTS_OUT );
		allowedDocModeIds.add( DocumentModeIDs.KTS_OUT_CU );
		allowedDocModeIds.add( DocumentModeIDs.ADD_INFO_FOREIGN_TRADE_CONTRACT );
		allowedDocModeIds.add( DocumentModeIDs.GOODS_COMPONENTS_LIST );
		
		Set< String > notStrictMessageTypes = new HashSet< String >( );
		notStrictMessageTypes.add( MessageType.CMN_11093 );
		notStrictMessageTypes.add( MessageType.CMN_11094 );
		
		for ( String cDocId : recvEnv.getDocument( ).getContainerDocuments( ).keySet( ) )
		{
			EDDocument cdoc = recvEnv.getDocument( ).getDocumentInContainer( cDocId );
			
			String documentModeId = cdoc.getDocumentModeID( );
			if ( ! allowedDocModeIds.contains( documentModeId ) )
				continue;
			
			String documentId = cdoc.getDocumentID( );
			
			Edecl_Msg_Doc dbdoc = envelopeService.getDocument( documentId );
			if ( null == dbdoc && notStrictMessageTypes.contains( recvEnv.getMessageType( ) ) )
				continue;
			
			if ( dbdoc.getState( ).equalsIgnoreCase( DocumentStates.NOTSET ) &&
				 notStrictMessageTypes.contains( recvEnv.getMessageType( ) ) )
				continue;
			
			checkDocumentState( dbdoc, jobBatchContext );
		}
	}
		
	private EDEnvelope prepareCmnTransit( EDJobBatchContext jobBatchContext )
	{
		EDEnvelope transit = ( EDEnvelope ) jobBatchContext.get( cmnTransitName );
		
		transit.setSaveEnvelope( true );
		
		return transit;
	}
	
	private EDEnvelope prepareCmn00004Notif( EDJobBatchContext jobBatchContext )
	{
		EDEnvelope notif = ( EDEnvelope ) jobBatchContext.get( cmn00004notifName );
		
		return notif;
	}
	
	private EDEnvelope prepareMsgLocalTransit( 
			EDJobBatchContext jobBatchContext, 
			EDEnvelope recvEnv, Edecl_Proc_Information process ) 
		throws ResultTypeException, DatabaseException
	{
		CustomsService customsService = _serviceHolder.getCustomsService( );
		CustomsOperator customsOperator = _serviceHolder.getCustomsOperator( );
		
		EDEnvelope transit = ( EDEnvelope ) jobBatchContext.get( msgLocalTransitName );
		
		String code = process.getBorderCustCode( );
		String exchType = String.valueOf( process.getExchType( ) );
		
		Edecl_Customs customs = customsService.getCustoms( code, exchType );
		CustomsType senderCustoms = recvEnv.getSenderCustoms( );
		CustomsType receiverCustoms = customsOperator.mapCustomsToCustomsType( customs );
		
		EnvelopeCreator.reRouteMessage( 
			transit, senderCustoms, 
			BusinessSystems.CUSTOMS, receiverCustoms, 
			null, transit.getIncomeEnvelopeID( ) 
		);
						
		transit.setSaveEnvelope( true );
				
		return transit;
	}
	
	private EDEnvelope prepareMsgRemoteTransit( 
			EDJobBatchContext jobBatchContext, 
			EDEnvelope recvEnv,
			Edecl_Proc_Information process ) 
		throws ResultTypeException, DatabaseException
	{
		EDEnvelope transit = ( EDEnvelope ) jobBatchContext.get( msgRemoteTransitName );
		
		CustomsType senderCustoms = recvEnv.getSenderCustoms( );
		
		CustomsType receiverCustoms = new CustomsType( );
		receiverCustoms.setCustomsCode( process.getBorderCustCode( ) );
		receiverCustoms.setExchType( Integer.toString( process.getExchType( ) ) );

		EnvelopeCreator.reRouteMessage( 
			transit, senderCustoms, 
			BusinessSystems.EPS, receiverCustoms, 
			null, transit.getIncomeEnvelopeID( ) 
		);
		
		transit.setSaveEnvelope( true );
				
		return transit;
	}
	
	private boolean isRemoteImport( Edecl_Proc_Information process )
	{
		return null != process && ! StringUtil.isNullOrEmpty( process.getBorderCustCode( ) );
	}
		
	private Edecl_Proc_Information getProcess( EDEnvelope recvEnv ) 
		throws DatabaseException
	{
		String processId = recvEnv.getProcessID( );
		
		return _serviceHolder.getProcedureService( ).getProcInformation( processId );
	}
		
	/**
	 * 
	 * Правильная проверка состава контейнера.
	 * 
	 * Проверяется комплектность, количество передаваемых в сообщении документов, 
	 * а также актуальность комплекта документов:
	 * 
	 * Контейнер должен содержать следующие обязательные документы: 
	 * ESADOut_CU, GTDOutCustomsMark, 
	 * 
	 * а также следующие необязательные документы в случае, если они присутствуют в 
	 * контейнере, который является текущим: 
	 * DTSout_CU, DTSOut, KTSout_CU, AddInfoForeignTradeContract, GoodsComponentsList.
	 * 
	 * Дополнительно в контейнере должны присутствовать документы:
	 * DTSOutCustomsMark, если в контейнере присутствует DTSout_CU или DTSOut,
	 * KTSoutCustomsMark, если в контейнере присутствует KTSout_CU,
	 * при этом количество DTSOutCustomsMark должно быть 
	 * равно сумме DTSout_CU и DTSOut 
	 * количество KTSoutCustomsMark равно количеству KTSout_CU
	 * 
	 * Иначе выдается сообщение об ошибке: 
	 * 
	 * Ошибка: 03.00014.01 
	 * Описание: Контейнер не содержит необходимого числа документов.
	 */
	private void checkCompleteness( EDJobBatchContext jobBatchContext, boolean isNeedCheckSum ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );

		Map< String, Integer > docsCount = new HashMap< String, Integer >( );
		docsCount.put( DocumentModeIDs.ESAD_OUT_CU, 0 ); // 1006107E
		docsCount.put( DocumentModeIDs.GTD_OUT_CUSTOMS_MARK, 0 ); // 1006078E

		docsCount.put( DocumentModeIDs.DTS_OUT_CU, 0 ); // 1006112E
		docsCount.put( DocumentModeIDs.DTS_OUT, 0 ); // 1006044E
		docsCount.put( DocumentModeIDs.DTS_OUT_CUSTOMS_MARK, 0 ); // 1006079E

		docsCount.put( DocumentModeIDs.ADD_INFO_FOREIGN_TRADE_CONTRACT, 0 ); // 1006123E
		docsCount.put( DocumentModeIDs.GOODS_COMPONENTS_LIST, 0 ); // 1006089E
		
		docsCount.put( DocumentModeIDs.KDT_OUT_CU, 0 ); // 1006111E

		ESADoutCUType esaDoutCU = null;
		GTDOutCustomsMarkType gtdOutCustomsMark = null;

		for ( String cDocId : recvEnv.getDocument( ).getContainerDocuments( ).keySet( ) )
		{
			EDDocument cdoc = recvEnv.getDocument( ).getDocumentInContainer( cDocId );

			String documentModeId = cdoc.getDocumentModeID( );
			if ( docsCount.containsKey( documentModeId ) )
			{
				docsCount.put( documentModeId, docsCount.get( documentModeId ) + 1 );
			}

			if ( cdoc.isDocumentOfClass( ESADoutCUType.class ) )
			{
				esaDoutCU = cdoc.getDocumentAsClass( ESADoutCUType.class );
			}
			else if ( cdoc.isDocumentOfClass( GTDOutCustomsMarkType.class ) )
			{
				gtdOutCustomsMark = cdoc.getDocumentAsClass( GTDOutCustomsMarkType.class );
			}
		}
		
		// .../GTDOutCustomsMark/GTDOutResolution/catESAD_cu:DecisionCode/90
		if ( null != gtdOutCustomsMark )
		{
			if ( gtdOutCustomsMark.getGTDOutResolution( ).getDecisionCode( ).equalsIgnoreCase( "90" ) )
				isNeedCheckSum = false;
		}
		
		boolean complete = true;		

		/**
		 * Контейнер должен содержать следующие обязательные документы:
		 * ESADout_CU (1006107E), GTDOutCustomsMark (1006078E)
		 */
		if ( 0 == docsCount.get( DocumentModeIDs.ESAD_OUT_CU ) || 
			 0 == docsCount.get( DocumentModeIDs.GTD_OUT_CUSTOMS_MARK ) )
		{
			log.info( String.format(
				"Контейнер (EnvelopeID=%s) не содержит либо ESADout_CU, либо GTDOutCustomsMark. Count(ESADout_CU)=%d, Count(GTDOutCustomsMark)=%d",
				recvEnv.getEnvelopeID( ),
				docsCount.get( DocumentModeIDs.ESAD_OUT_CU ),
				docsCount.get( DocumentModeIDs.GTD_OUT_CUSTOMS_MARK )
			) );
			
			complete = false;
		}
		
		/** 
		 * а также следующие необязательные документы в случае,
		 * если они присутствуют в контейнере, который является текущим:
		 * DTSout_CU (1006112E), DTSOut (1006044E), KTSout_CU (1006113E), 
		 * AddInfoForeignTradeContract (1006123E), GoodsComponentsList (1006089E).
		 */
		if ( complete )
		{
			EnvelopeService envelopeService = _serviceHolder.getEnvelopeService( );
			String currentContainerId = envelopeService.getDocument( 
				esaDoutCU.getDocumentID( ) 
			).getRefMainDoc( );

			List< Edecl_Msg_Doc > currentContainerDocs = _serviceHolder
				.getEnvelopeService( )
				.getContainerDocuments( currentContainerId );

			for ( Edecl_Msg_Doc doc : currentContainerDocs )
			{
				String modeId = doc.getDocumentModeId( );

				if ( modeId.equalsIgnoreCase( DocumentModeIDs.DTS_OUT_CU ) ||
					 modeId.equalsIgnoreCase( DocumentModeIDs.DTS_OUT ) ||
					 modeId.equalsIgnoreCase( DocumentModeIDs.ADD_INFO_FOREIGN_TRADE_CONTRACT )||
					 modeId.equalsIgnoreCase( DocumentModeIDs.GOODS_COMPONENTS_LIST ) )
				{
					if ( 0 == docsCount.get( modeId ) ) 
					{
						log.info( String.format(
							"Текущий контейнер (EnvelopeID=%s, CntID=%s) не содержит либо документа с DocumentModeID=%s, Count(%s)=%d",
							recvEnv.getEnvelopeID( ), currentContainerId,
							modeId, modeId, docsCount.get( modeId )
						) );
						
						complete = false;
						break;
					}
				}
			}
		}

		/**
		 * Должен быть DTSOutCustomsMark (1006079E), если в контейнере 
		 * присутствует DTSout_CU (1006112E) или DTSOut (1006044E),
		 * при этом количество DTSOutCustomsMark должно быть 
		 * равно сумме DTSout_CU и DTSout.
		 */
		if ( complete )
		{
			if ( docsCount.get( DocumentModeIDs.DTS_OUT_CU ) > 0 || 
				 docsCount.get( DocumentModeIDs.DTS_OUT ) > 0 )
			{
				int op1 = docsCount.get( DocumentModeIDs.DTS_OUT_CUSTOMS_MARK );
				int op2 = docsCount.get( DocumentModeIDs.DTS_OUT_CU ) + docsCount.get( DocumentModeIDs.DTS_OUT );
				
				if ( isNeedCheckSum && 
					 op1 != op2 )
				{
					log.info( String.format(
						"Контейнер (EnvelopeID=%s) содержит не совпадающее количество SUM(DTSout)+SUM(DTSout_CU) и SUM(DTS_OUT_CUSTOMS_MARK). " +
						"Count(DTSout)=%d, Count(DTSout_CU)=%d, Count(DTSOutCustomsMark)=%d",
						recvEnv.getEnvelopeID( ),
						docsCount.get( DocumentModeIDs.DTS_OUT ),
						docsCount.get( DocumentModeIDs.DTS_OUT_CU ),
						docsCount.get( DocumentModeIDs.DTS_OUT_CUSTOMS_MARK )
					) );
					
					complete = false;
				}
			}
		}
		
		/**
		 * Для сообщений CMN.11093 и CMN.11094 должен быть хотя бы
		 * один документ KDTout_CU (1006111E)
		 */
		if ( complete )
		{
			if ( recvEnv.getMessageType( ).equals( MessageType.CMN_11093 ) ||
				 recvEnv.getMessageType( ).equals( MessageType.CMN_11094 ) )
			{
				if ( docsCount.get( DocumentModeIDs.KDT_OUT_CU ) == 0 )
				{
					log.info( String.format(
						"Контейнер (EnvelopeID=%s) не содержит необходимого числа документов KDTout_CU" +
						"Count(KDTout_CU)=%d",
						recvEnv.getEnvelopeID( ), docsCount.get( DocumentModeIDs.KDT_OUT_CU )
					) );
					
					complete = false;
				}
			}
		}

		if ( ! complete )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._03_00014_01, 
				ProcessingConstants.ERROR_TYPE_CHECK 
			);
		}

	}
	
	private boolean isNeedCheckSum( String messageType )
	{
		return MessageType.CMN_11010.equalsIgnoreCase( messageType ) ||
			   MessageType.CMN_11033.equalsIgnoreCase( messageType ) ||
			   MessageType.CMN_11093.equalsIgnoreCase( messageType );
	}
	
	private void makeContainerCurrent( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EnvelopeService eserv = _serviceHolder.getEnvelopeService( );
		
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		EDContainerType currentCnt = extractContainer( jobBatchContext.getReceivedEnvelope( ) );
		
		Edecl_Msg_Doc dbcnt = eserv.getDocument( currentCnt.getDocumentID( ) );
		if ( null == dbcnt )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._02_00001_01, 
				ProcessingConstants.ERROR_TYPE_CHECK 
			);			
		}
		
		dbcnt.setState( DocumentStates.CURRENT );
		eserv.merge( dbcnt );
		
		String refCnt = currentCnt.getRefDocumentID( );
		if ( ! StringUtil.isNullOrEmpty( refCnt ) )
		{
			dbcnt = eserv.getDocument( refCnt );
			if ( null == dbcnt )
			{
				ErrorHelper.throwException( 
					jobBatchContext, ResultCodes._02_00001_01, 
					ProcessingConstants.ERROR_TYPE_CHECK 
				);			
			}
			
			dbcnt.setState( DocumentStates.NOTCHANGEABLE );
			eserv.merge( dbcnt );
		}
		
		for ( String cDocId : recvEnv.getDocument( ).getContainerDocuments( ).keySet( ) )
		{
			EDDocument cdoc = recvEnv.getDocument( ).getDocumentInContainer( cDocId );
			
			String documentId = cdoc.getDocumentID( );
			Edecl_Msg_Doc dbdoc = eserv.getDocument( documentId );
			if ( null == dbdoc )
			{
				ErrorHelper.throwException( 
					jobBatchContext, ResultCodes._02_00001_01, 
					ProcessingConstants.ERROR_TYPE_CHECK 
				);
			}
			
			dbdoc.setState( DocumentStates.CURRENT );
			eserv.merge( dbdoc );
			
			String refDocumentId = cdoc.getRefDocumentID( );
			if ( StringUtil.isNullOrEmpty( refDocumentId ) )
				continue;
			
			dbdoc = eserv.getDocument( refDocumentId );
			if ( null == dbdoc )
			{
				ErrorHelper.throwException( 
					jobBatchContext, ResultCodes._02_00001_01, 
					ProcessingConstants.ERROR_TYPE_CHECK 
				);
			}
			
			dbdoc.setState( DocumentStates.NOTCHANGEABLE );
			eserv.merge( dbdoc );
			
			if ( ! StringUtil.isNullOrEmpty( dbdoc.getRefMainDoc( ) ) )
			{
				Edecl_Msg_Doc cnt = eserv.getDocument( dbdoc.getRefMainDoc( ) );
				if ( null == cnt )
				{
					ErrorHelper.throwException( 
						jobBatchContext, ResultCodes._02_00001_01, 
						ProcessingConstants.ERROR_TYPE_CHECK 
					);
				}
				
				cnt.setState( DocumentStates.NOTCHANGEABLE );
				eserv.merge( dbdoc );
			}			
		}
	}
}
