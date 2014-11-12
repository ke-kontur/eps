package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.List;

import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.kind.DocumentModeIDs;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
import ru.acs.fts.eps2.model.entities.Edecl_Substatus_State;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.utils.StringUtil;
import ru.acs.fts.schemas.album.transitinfo.TransitInfoType;

public class MessageCMN15020BusinessProcess extends BusinessProcess
{

	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );

		TransitInfoType transitInfo = recvEnv.getDocument( ).getDocumentAsClass( TransitInfoType.class );

		/** 
		 * Элемент RefDocumentID документа TransitInfo из сообщения CMN.15020
		 * должен указывать на документ InqRecallGTD ( поле EDECL_MSG_DOC.DOC_DOCUMENTMODEID = 1006013E), 
		 * переданный в сообщении CMN.15021 в рамках данной процедуры.
		 * В случае, если проверка не пройдена, выдается ошибка
		 * 03.00027.02 – Неверно заполнен ссылочный идентификатор документа
		 */
		
		String refDocumentId = transitInfo.getRefDocumentID( );
		if ( StringUtil.isNullOrEmpty( refDocumentId ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._03_00027_01, 
				ProcessingConstants.ERROR_TYPE_CHECK 
			);
		}

		Edecl_Msg_Doc inqRecallGTDDoc = _serviceHolder.getEnvelopeService( )
			.getDocument( refDocumentId );
		if ( null == inqRecallGTDDoc || 
			 ! inqRecallGTDDoc.getDocumentModeId( ).equalsIgnoreCase( DocumentModeIDs.INQ_RECALL_GTD ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._03_00027_02, 
				ProcessingConstants.ERROR_TYPE_CHECK 
			);
		}

		/** 
		 * Проверка наличия  необработанного  запроса на  отзыв:
		 * В таблице EDECL_SUBSTATUS_STATE должна  быть  запись о запросе  на 
		 * отзыв декларации,  удовлетворяющая следующим  условиям
		 * TransitInfo.RefDocumentID = EDECL_SUBSTATUS_STATE.SUBST_ST_DOCUMENTID
		 * ProcessID (идентификатор процедуры) = EDECL_SUBSTATUS_STATE.SUBST_ST_PROCESSID
		 * EDECL_SUBSTATUS_STATE.SUBST_ST_STCODE = «GTD_RECALLING»
		 */
		List< Edecl_Substatus_State > procSubStatuses = _serviceHolder.getProcedureService( )
			.getProcSubStatuses( recvEnv.getProcessID( ) );

		Edecl_Substatus_State substatusStateToDelete = null;
		boolean unprocessedReqExists = false;
		for ( Edecl_Substatus_State edeclSubstatusState : procSubStatuses )
		{
			if ( ( edeclSubstatusState.getDocumentId( ).equalsIgnoreCase( refDocumentId ) ) && 
				 ( edeclSubstatusState.getStCode( ).equalsIgnoreCase( "GTD_RECALLING" ) ) )
			{
				unprocessedReqExists = true;
				substatusStateToDelete = edeclSubstatusState;
			}
		}

		if ( ! unprocessedReqExists )
		{
			ErrorHelper.throwException(
				jobBatchContext, ResultCodes._03_00021_04, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}

		EDEnvelope respEnvelope = EnvelopeCreator.createTranzitMessage( 
			null, recvEnv, 
			BusinessSystems.DECLARANT, null
		);
		
		/** 
		 * &lt;InitialEnvelopeID&gt;  подставляется значение сообщения, отправленного 
		 * из  системы декларанта  (см обработку CMN.13010, 12002, 15005).
		 * (значение подставляется внутри createTranzitMessage(...)
		 */

		/**
		 * Из  таблицы EDECL_SUBSTATUS_STATE удаляется запись об обработанном 
		 * запросе  на  отзыв.
		 */
		_serviceHolder.getProcedureService( ).remove( substatusStateToDelete );

		String envelopeName = jobContext.getString( ContextConstants.ENVELOPE_NAME );
		jobBatchContext.put( envelopeName, respEnvelope );

	}
}
