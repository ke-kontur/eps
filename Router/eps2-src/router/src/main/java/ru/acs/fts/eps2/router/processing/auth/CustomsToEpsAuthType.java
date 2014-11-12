package ru.acs.fts.eps2.router.processing.auth;

import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.persistence.operators.CustomsOperator;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.schemas.envelope.CustomsType;

public class CustomsToEpsAuthType extends CustomsToCustomsAuthType
{
	@Override
	protected void checkReceiverCustoms( EDEnvelope env )
		throws ResultTypeException, DatabaseException
	{
		CustomsOperator customsOperator = _serviceHolder.getCustomsOperator( );

		CustomsType recvCustoms = env.getReceiverCustoms( );
		String receiverCustomsCode = recvCustoms.getCustomsCode( );
		int receiverCustomsExchType = Integer.valueOf( recvCustoms.getExchType( ) );
		
		if ( null == customsOperator.getExternalRouting( receiverCustomsCode, receiverCustomsExchType ) )
		{
			throwException( 
				"Код удаленного КАСТО назначения не зарегистрирован в системе", 
				env.getDocument( ).getDocumentID( ), ResultCodes._01_00038_01 
			);
		}
	}
}
