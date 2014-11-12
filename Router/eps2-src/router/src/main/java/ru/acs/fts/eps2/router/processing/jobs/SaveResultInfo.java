package ru.acs.fts.eps2.router.processing.jobs;

import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edecl_Result;
import ru.acs.fts.eps2.model.services.EnvelopeService;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;

/**
 * Сохраняем в базу результат обработки сообщения
 */
public class SaveResultInfo extends EDJob
{
	private static final String action = "Сохранение результата обработки сообщения (только если все ок)";
		
	@Override
	public void edExecute( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		/**
		 * Если мы находимся в обработке сценария ошибки обработки
		 * то мы ну никак не можем сохранять ResultInfo = 00.00000.00
		 * поэтому выходим отсюдова
		 */
		if ( jobBatchContext.getFailScenario( ) != null )
			return ;

		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		saveResult( recvEnv, jobBatchContext );
	}
	
	@Override
	public String getAction( )
	{
		return action;
	}
	
	private void saveResult( EDEnvelope recvEnv, EDJobBatchContext jobBatchContext ) 
		throws DatabaseException
	{
		Edecl_Result edRes = new Edecl_Result( );
		edRes.setDocumentId( recvEnv.getDocument( ).getDocumentID( ) ); 			
		edRes.setEnvelopeId( recvEnv.getEnvelopeID( ) );			
		edRes.setResultCode( ResultCodes._00_00000_00 );
		
		EnvelopeService envSrv = jobBatchContext.getServiceHolder( ).getEnvelopeService( );
		envSrv.persist( edRes );
	}
	
}
