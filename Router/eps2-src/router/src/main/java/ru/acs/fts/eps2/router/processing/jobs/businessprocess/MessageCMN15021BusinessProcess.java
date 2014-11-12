package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.List;

import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edecl_Substatus_State;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.defines.SpecialProcedureSubStates;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.schemas.envelope.CustomsType;

public class MessageCMN15021BusinessProcess extends BusinessProcess
{

	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );

		/** 
		 * Проверка на наличие запроса на отзыв ДТ:
		 * Для данной процедуры проверяется отсутствие записей в таблице EDECL_SUBSTATUS_STATE
		 * Если присутствует запись со статусом «GTD_EDITING», то выдается ошибка:
		 * 03.00021.03 - По данной процедуре существует запрос на внесение
		 * изменений или отзыв ДТ, по которому не было принято решение в ТО.
		 */
		List< Edecl_Substatus_State > procSubStatuses = _serviceHolder.getProcedureService( )
			.getProcSubStatuses( recvEnv.getProcessID( ) );

		for ( Edecl_Substatus_State edeclSubstatusState : procSubStatuses )
		{
			if ( edeclSubstatusState.getStCode( ).equalsIgnoreCase( SpecialProcedureSubStates.GTD_EDITING ) )
			{
				ErrorHelper.throwException( 
					jobBatchContext, ResultCodes._03_00021_03, 
					ProcessingConstants.ERROR_TYPE_BUSINESS 
				);
			}
		}

		EDEnvelope respEnvelope = EnvelopeCreator.createTranzitMessage( 
			null, recvEnv, 
			BusinessSystems.ASKTT2, recvEnv.getReceiverCustoms( )
		);
		
		CustomsType receiverCustoms = respEnvelope.getReceiverCustoms( );
		
		CustomsType senderCustoms = new CustomsType( );
		senderCustoms.setCustomsCode( jobBatchContext.getConfigurator( ).getEpsCustomsCode( ) );
		senderCustoms.setExchType( receiverCustoms.getExchType( ) );
		
		respEnvelope.getEDHeader( ).setSenderCustoms( senderCustoms );

		/** 
		 * Для данной процедуры устанавливается субстатус в таблице EDECL_SUBSTATUS_STATE.
		 * Правила заполнения полей
		 * InqRecallGTD.DocumentID -> EDECL_SUBSTATUS_STATE.SUBST_ST_DOCUMENTID
		 * ProcessID (идентификатор процедуры) -> EDECL_SUBSTATUS_STATE.SUBST_ST_PROCESSID
		 * EDECL_SUBSTATUS_STATE.SUBST_ST_STCODE = «GTD_RECALLING»
		 */

		Edecl_Substatus_State substatusState = new Edecl_Substatus_State( );
		substatusState.setDocumentId( recvEnv.getDocument( ).getDocumentID( ) );
		substatusState.setProcessId( recvEnv.getProcessID( ) );
		substatusState.setStCode( SpecialProcedureSubStates.GTD_RECALLING );
		_serviceHolder.getProcedureService( ).persist( substatusState );

		String envelopeName = jobContext.getString( ContextConstants.ENVELOPE_NAME );
		jobBatchContext.put( envelopeName, respEnvelope );

	}
}
