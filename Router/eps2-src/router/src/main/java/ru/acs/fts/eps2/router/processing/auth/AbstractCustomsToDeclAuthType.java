package ru.acs.fts.eps2.router.processing.auth;

import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;

public abstract class AbstractCustomsToDeclAuthType extends AbstractAuthType // NO_UCD (use default)
{
	@Override
	public void authorize( EDEnvelope env, EDJobBatchContext jobBatchContext ) 
		throws ResultTypeException, DatabaseException
	{		
		log( env );
		
		checkSenderCustomsCode( env );
		
		checkSenderCustomsExchType( env );
		
		checkSenderAddress( env );
		
		checkSenderCustomsExist( env );
		
		checkSenderCustomsEnvelopeDbCorrespondence( env );
		
		checkParticipantEmpty( env );
		
		checkSoftVersion( env );
		
		checkParticipantNotReg( env );
		
		processChecking( env );
	}
	
	protected void checkProcessExists( Edecl_Proc_Information procInfo, EDEnvelope env )
		throws ResultTypeException, DatabaseException
	{
		if ( null == procInfo )
		{
			throwException(
				"Процедуры декларирования не существует в БД",
				env.getDocument( ).getDocumentID( ), ResultCodes._01_00041_01
			);
		}
	}
	
	abstract protected void processChecking( EDEnvelope env ) 
		throws ResultTypeException, DatabaseException;
}
