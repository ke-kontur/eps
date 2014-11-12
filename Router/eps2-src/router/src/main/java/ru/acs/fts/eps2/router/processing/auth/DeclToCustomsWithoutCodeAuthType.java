package ru.acs.fts.eps2.router.processing.auth;

import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.model.services.ProcedureService;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;

public class DeclToCustomsWithoutCodeAuthType extends
		AbstractDeclToCustomsInProcessAuthType
{
	@Override
	protected Edecl_Proc_Information findProcess( EDEnvelope env ) 
		throws DatabaseException
	{
		ProcedureService procedureService = _serviceHolder.getProcedureService( );
		
		String processId = env.getProcessID( );
		String participantId = env.getParticipantID( );
		String softVersion = env.getSoftVersion( );
		
		return procedureService.getProcedureInfo( processId, participantId, softVersion );
	}
}
