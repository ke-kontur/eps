package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edecl_Messages;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.utils.StringUtil;

public class TranzitFromPIToDeclSignBusinessProcess extends BusinessProcess
{
	private static final Logger _logger = LoggerFactory.getLogger( TranzitFromPIToDeclSignBusinessProcess.class );
	
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );

		String processId = recvEnv.getProcessID( );
		String initialEnvelopeId = recvEnv.getInitialEnvelopeID( );

		Edecl_Messages initEnvelope = _serviceHolder.getEnvelopeService( ).getEnvelope( initialEnvelopeId );

		if ( null != initEnvelope )
		{
			if ( isEmpty( initEnvelope.getProcessId( ) ) )
			{
				if ( ! isEmpty( processId ) )
				{
					/** 
					 * У исходного сообщения нет процедуры, а у обрабатываемого есть - непорядок
					 */
					ErrorHelper.throwException( 
						jobBatchContext, ResultCodes._01_00049_02, 
						ProcessingConstants.ERROR_TYPE_BUSINESS 
					);
				}
				
				_logger.info( "Обрабатываем сообщение вне контекста процедуры." );
			}
			else
			{
				_logger.info( "Обрабатываем сообщение в контексте процедуры." );
				
				// Проверяем в контексте процедуры
				if ( isEmpty( processId ) )
				{
					// У исходного сообщения есть процедура, а у обрабатываемого нет - непорядок
					
					String errorMsg = String.format(
						"Не заполнено обязательное поле ProcessID (у исходного сообщения ProcessID = {%s}).",
						initEnvelope.getProcessId( )
					);
					
					_logger.error( errorMsg );
					ErrorHelper.throwException( 
						jobBatchContext, ResultCodes._01_00049_01, 
						ProcessingConstants.ERROR_TYPE_BUSINESS 
					);
				}
				else
				{
					if ( processId.equalsIgnoreCase( initEnvelope.getProcessId( ) ) )
					{
						// Шпарим бизнес-обработку...
						_serviceHolder.getProcedureOperator( ).setProcedureNewState( 
							jobBatchContext, 
							recvEnv.getEnvelopeID( ), 
							processId, 
							recvEnv.getMessageType( ) 
						);
					}
					else
					{
						// Идентификаторы процедуры у исходного и обрабатываемого
						// сообщений не совпадают!
						ErrorHelper.throwException( 
							jobBatchContext, ResultCodes._01_00049_03, 
							ProcessingConstants.ERROR_TYPE_BUSINESS 
						);
					}
				}
			}
		}
		else
		{
			if ( ! isEmpty( processId ) )
			{
				// Шпарим бизнес-обработку...
				_serviceHolder.getProcedureOperator( ).setProcedureNewState( 
					jobBatchContext, 
					recvEnv.getEnvelopeID( ), 
					processId, 
					recvEnv.getMessageType( ) 
				);				
			}
		}
		
		recoverRefDocumentID( jobBatchContext );
	}

	private boolean isEmpty( String string )
	{
		return StringUtil.isNullOrEmpty( string );
	}

	private void recoverRefDocumentID( EDJobBatchContext jobBatchContext ) 
		throws ResultTypeException, DatabaseException
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		String messageType = recvEnv.getMessageType( );
		if ( ! messageType.equals( MessageType.CMN_12002 ) &&
			 ! messageType.equals( MessageType.CMN_12003 ) )
			return ;
		
		String refDocumentId = recvEnv.getDocument( ).getRefDocumentID( );
		if ( StringUtil.isNullOrEmpty( refDocumentId ) )
			return ;
		
		Edecl_Msg_Doc refDoc = _serviceHolder.getEnvelopeService( ).getDocument( refDocumentId );
		if ( null == refDoc )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._02_00001_01, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
		
		String incomeDocId = refDoc.getIncomeDocId( );
		
		if ( ! StringUtil.isNullOrEmpty( incomeDocId ) )
		{
			jobBatchContext.put( ContextConstants.INCOME_DOCUMENT_ID, incomeDocId );
			jobBatchContext.put( ContextConstants.SET_REF_AS_INCOME_DOCUMENT_ID, "true" );
		}
	}
}
