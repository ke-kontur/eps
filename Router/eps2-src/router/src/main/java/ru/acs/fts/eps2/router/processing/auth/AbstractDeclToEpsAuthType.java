package ru.acs.fts.eps2.router.processing.auth;

import ru.acs.fts.eps2.model.entities.Edecl_Participant;
import ru.acs.fts.eps2.model.services.ParticipantService;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;

public abstract class AbstractDeclToEpsAuthType extends AbstractAuthType // NO_UCD (use default)
{
	@Override
	public void authorize( EDEnvelope env, EDJobBatchContext jobBatchContext ) 
		throws ResultTypeException, DatabaseException
	{
		log( env );					
		
		checkParticipantEmpty( env );

		checkParticipantAddressNotReg( env );
		
		ParticipantService participantService = _serviceHolder.getParticipantService( );
		Edecl_Participant participant = participantService.getParticipant( env.getParticipantID( ) );
		
		checkParticipantNotReg( env );
		
		checkParticipantAddressSenderInformationCorrespondence( participant, env );
		
		checkParticipantAddressDenied( participant, env );		
		
		checkReceiverCustomsCode( env );
		
		checkReceiverCustomsExchType( env );
		
		checkSoftVersion( env );

		checkReceiverCustomsByExtRtuRouting( env );
		
		checkProcessEmpty( env );
	}
	
	protected void receiverCustomsChecking( EDJobBatchContext jobBatchContext ) // NO_UCD (unused code)
		throws ResultTypeException, DatabaseException
	{
		checkReceiverCustoms( jobBatchContext.getReceivedEnvelope( ) );
	}
}
