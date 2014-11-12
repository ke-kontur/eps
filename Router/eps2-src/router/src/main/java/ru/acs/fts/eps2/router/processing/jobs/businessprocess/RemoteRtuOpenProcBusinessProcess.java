package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import ru.acs.fts.eps2.engine.data.kind.CompressType;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.defines.SpecialProcedureStates;
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.model.entities.MessageLineage;
import ru.acs.fts.eps2.model.services.ProcedureService;
import ru.acs.fts.eps2.router.defines.ProcedureUdFlags;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.schemas.envelope.CustomsType;

/**
 * Бизнес процесс открывающий процедуру на удаленном РТУ
 * Если требуется делать еще какие-то транзитные сообщения - можно делать это через батчи
 */
public class RemoteRtuOpenProcBusinessProcess extends BusinessProcess
{	
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		/**
		 * Создаем процедуру если того требуется
		 */
		if ( ! checkProcess( recvEnv ) )
		{
			Edecl_Proc_Information procInfo = createProcess( recvEnv );
			_serviceHolder.getProcedureService( ).persist( procInfo );
						
			MessageLineage ml = new MessageLineage( );
			ml.setEnvelopeId( procInfo.getProcessId( ) );
			ml.setLineageId( recvEnv.getLineageId( ) );
			jobBatchContext.getServiceHolder( ).getEnvelopeService( ).persist( ml );		
		}
	}
	
	private Edecl_Proc_Information createProcess( EDEnvelope recvEnv )
	{
		Edecl_Proc_Information process = new Edecl_Proc_Information( );
		process.setProcessId( recvEnv.getProcessID( ) );
		process.setSoftVersion( recvEnv.getSoftVersion( ) );
		process.setCurrentState( SpecialProcedureStates.getDefaultState( ) );
		
		CustomsType recvCustoms = recvEnv.getReceiverCustoms( );
		CustomsType senderCustoms = recvEnv.getSenderCustoms( );
		
		int exchType = Integer.valueOf( recvCustoms.getExchType( ) );
		process.setExchType( exchType );
		process.setParticipantId( recvEnv.getParticipantID( ) );
		process.setCustCode( senderCustoms.getCustomsCode( ) );
		process.setBorderCustCode( recvCustoms.getCustomsCode( ) );
		process.setUdFlag( ProcedureUdFlags.REMOTE_REMOTENESS );
		process.setCompressType( CompressType.XML.toString( ) );
		
		return process;
	}
	
	private Edecl_Proc_Information findProcess( String processId ) throws DatabaseException
	{
		ProcedureService procedureService = _serviceHolder.getProcedureService( );
		Edecl_Proc_Information process = procedureService.getProcInformation( processId );
		
		return process;
	}
	
	private boolean checkProcess( EDEnvelope recvEnv ) throws DatabaseException
	{
		String processId = recvEnv.getProcessID( );		
		return null != findProcess( processId );
	}	
}
