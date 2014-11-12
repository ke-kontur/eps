package ru.acs.fts.eps2.router.processing.auth;


import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.util.RemotenessHelper;
import ru.acs.fts.eps2.model.entities.Edecl_Proc_Information;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.utils.StringUtil;

public abstract class AbstractDeclToCustomsInProcessAuthType extends AbstractDeclToCustomsAuthType // NO_UCD (use default)
{
	@Override
	public void authorize( EDEnvelope env, EDJobBatchContext jobBatchContext ) 
		throws ResultTypeException, DatabaseException
	{
		super.authorize( env, jobBatchContext );
		
		Edecl_Proc_Information procInfo = findProcess( env );
		
		if ( null == procInfo )
		{
			throwException(
				"Процедуры декларирования не существует в БД",
				env.getDocument( ).getDocumentID( ), ResultCodes._01_00041_01
			);
		}
		
		String messageKind = env.getApplicationInfo( ).getMessageKind( );
		/*
		проверка удаленки игнорится для 11127
		 */
		if(env.getMessageType().equals(MessageType.CMN_11127)){
			return;
		}
		int udFlag = procInfo.getUdFlag( );
		if ( ! StringUtil.isNullOrEmpty( messageKind ) && messageKind.matches( "UD:\\d{8}" ) )
		{
			String mkCustomsCode = messageKind.split( ":" )[ 1 ];
			if ( ! mkCustomsCode.equals( procInfo.getBorderCustCode( ) ) )
			{
				throwException( 
						"Процедура декларирования не соответствует заданному формату!",
						env.getDocument( ).getDocumentID( ), ResultCodes._01_00049_03 );
			}
			else
			{
				int expectedUdFlag;
				if ( RemotenessHelper.isCustomsLocal( mkCustomsCode ) )
					expectedUdFlag = 1;
				else
					expectedUdFlag = 2;
				
				if ( udFlag != expectedUdFlag )
				{
					throwException( 
							"Процедура декларирования не соответствует заданному формату!",
							env.getDocument( ).getDocumentID( ), ResultCodes._01_00049_03 );
				}
			}
		}
		else if ( udFlag == 1 || udFlag == 2 )
		{
			throwException( 
					"Процедура декларирования не соответствует заданному формату!",
					env.getDocument( ).getDocumentID( ), ResultCodes._01_00049_03 );
		}
	}
	
	abstract protected Edecl_Proc_Information findProcess( EDEnvelope env ) throws DatabaseException;
}
