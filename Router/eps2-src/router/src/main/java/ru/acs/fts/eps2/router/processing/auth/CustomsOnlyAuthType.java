package ru.acs.fts.eps2.router.processing.auth;

import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.model.services.ProcedureService;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;

public class CustomsOnlyAuthType extends AbstractAuthType
{
	@Override
	public void authorize( EDEnvelope env, EDJobBatchContext jobBatchContext )
		throws ResultTypeException, DatabaseException 		
	{
		log( env );
		
		checkSenderCustomsCode( env );
		
		checkSenderCustomsExchType( env );
		
		// checkReceiverCustomsCode( env );
		
		checkProcessCustoms( env );
		
		checkSenderCustomsExist( env );
		
		checkSenderCustomsEnvelopeDbCorrespondence( env );
		
		// checkReceiverCustomsExchType( env );
		
		checkSenderAddress( env );
		
		checkSoftVersion( env );
	}

	protected void checkProcessCustoms( EDEnvelope env ) 
		throws ResultTypeException, DatabaseException
	{
		String processId = env.getProcessID( );

		ProcedureService procedureService = _serviceHolder.getProcedureService( );
		Edecl_Proc_Information procInfo = procedureService.getProcedureInfo( 
			processId, env.getParticipantID( ), env.getSoftVersion( ) 
		);
		
		if ( null == procInfo ) 
		{
			throwException( 
				"Код участника ВЭД, указанный в заголовке конверта, не соответствует сведениям процедуры декларирования.", 
				env.getDocument( ).getDocumentID( ), ResultCodes._01_00090_01 
			);
		}
	}
}
