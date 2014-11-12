package ru.acs.fts.eps2.router.processing.auth;

import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.util.RemotenessHelper;
import ru.acs.fts.eps2.model.entities.Edecl_Participant;
import ru.acs.fts.eps2.model.services.ParticipantService;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.utils.StringUtil;
import ru.acs.fts.schemas.envelope.CustomsType;

public class ToEadAuthType extends DeclToCustomsNotInProcessAuthType
{
	@Override
	public void authorize( EDEnvelope env, EDJobBatchContext jobBatchContext ) 
		throws ResultTypeException, DatabaseException
	{
		super.authorize( env, jobBatchContext );

		checkArchDecl( env );
	}
	
	protected void checkArchDecl( EDEnvelope env ) 
		throws ResultTypeException, DatabaseException
	{
		String archDeclId = env.getDocument( ).getArchDeclId( );
		
		if ( StringUtil.isNullOrEmpty( archDeclId ) )
			throwDeclNotFoundException( env );
		
		ParticipantService participantService = _serviceHolder.getParticipantService( );
		Edecl_Participant participant = participantService.getParticipant( archDeclId );
		
		if ( null == participant )
			throwDeclNotFoundException( env );
	}
	
	protected void throwDeclNotFoundException( EDEnvelope env )
		throws ResultTypeException, DatabaseException
	{
		throwException( 
			"Идентификатор участника ВЭД в ЭАД не заполнен.",
			env.getDocument( ).getDocumentID( ), ResultCodes._10_00002_02 
		);
	}

	protected void receiverCustomsChecking( EDJobBatchContext jobBatchContext )
		throws ResultTypeException, DatabaseException
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );

		CustomsType recvCustoms = recvEnv.getReceiverCustoms( );
		String receiverCustomsCode = recvCustoms.getCustomsCode( );
		
		if ( ! RemotenessHelper.isCustomsLocal( receiverCustomsCode ) )
		{
			throwException( 
				"Код КАСТО назначения не зарегистрирован в системе", 
				recvEnv.getDocument( ).getDocumentID( ), ResultCodes._01_00038_01
			);			
		}
	}
	
}
