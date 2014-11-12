package ru.acs.fts.eps2.router.processing.auth;

import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.model.services.ProcedureService;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.utils.StringUtil;

public class DeclToCustomsCheckProcessAuthType extends AbstractDeclToCustomsAuthType
{
	@Override
	public void authorize( EDEnvelope env, EDJobBatchContext jobBatchContext ) 
		throws ResultTypeException, DatabaseException
	{
		super.authorize( env, jobBatchContext );
		
		String processId = env.getProcessID( );
		
		if ( ! StringUtil.isNullOrEmpty( processId ) )
		{
			Edecl_Proc_Information procInfo = findProcess( env );
		
			if ( null == procInfo )
			{	
				throwException(
					"Процедуры декларирования не существует в БД",
					env.getDocument( ).getDocumentID( ), ResultCodes._01_00041_01
				);
			}
		}
	}

	protected Edecl_Proc_Information findProcess( EDEnvelope env ) 
		throws DatabaseException
	{
		ProcedureService procedureService = _serviceHolder.getProcedureService( );
		
		String processId = env.getProcessID( );
		String participantId = env.getParticipantID( );
		String softVersion = env.getSoftVersion( );
		String recvCode = env.getReceiverCustoms( ).getCustomsCode( );
		
		return procedureService.getProcedureInfo( processId, recvCode, participantId, softVersion );
	}
	
	@Override
	protected void checkProcessEmpty( EDEnvelope env )
	{
		
	}
}
