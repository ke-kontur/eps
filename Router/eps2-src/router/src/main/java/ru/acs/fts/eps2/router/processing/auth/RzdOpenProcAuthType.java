package ru.acs.fts.eps2.router.processing.auth;

import java.util.Date;
import java.util.List;

import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.model.entities.Edecl_Softversion;
import ru.acs.fts.eps2.model.entities.Edecl_Udcustlist;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.errors.ResultTypeException;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.utils.StringUtil;

public class RzdOpenProcAuthType extends AbstractDeclToCustomsAuthType
{
	private String udPrefix = "UD:";
	
	@Override
	public void authorize( EDEnvelope env, EDJobBatchContext jobBatchContext ) 
		throws ResultTypeException, DatabaseException 
	{
		super.authorize( env, jobBatchContext );
		
		checkParticipantValidness( env );
		
		checkSoftVersionValidness( env, jobBatchContext );
		
		String customsCode = getCustomsCode( env.getApplicationInfo( ).getMessageKind( ) );
		
		if ( customsCode != "" )
		{
			String recvCode = env.getReceiverCustoms( ).getCustomsCode( );
			List< Edecl_Udcustlist > udCustList = 
				_serviceHolder.getUdCustListService( ).getUdCustLists( recvCode, customsCode ); 
			
			if ( null != udCustList && ! udCustList.isEmpty( ) )
			{
				boolean intCustExists = false;
				boolean extCustExists = false;
				boolean ok = false;
				for ( Edecl_Udcustlist udCust : udCustList )
				{
					if ( udCust.getIntCustCode( ).equals( recvCode ) )
					{
						intCustExists = true;
						if ( udCust.getExtCustCode( ).equals( customsCode ) )
						{
							ok = true;
							break;
						}
					}
					else
						if ( udCust.getExtCustCode( ).equals( customsCode ) )
							extCustExists = true;
				}
				
				if ( ! ok )
				{
					if ( ! intCustExists )
					{
						throwException( 
							"Код внутреннего ТО отсутствует в списке ТО, участвующих в применении технологии удаленного выпуска", 
							env.getDocument( ).getDocumentID( ), ResultCodes._01_00038_02 
						);
					}
					if ( ! extCustExists )
					{
						throwException( 
							"Код внешнего ТО отсутствует в списке ТО, участвующих в применении технологии удаленного выпуска", 
							env.getDocument( ).getDocumentID( ), ResultCodes._01_00038_03 
						);
					}
				}
			}
			else
			{
				throwException( 
					"Указанная комбинация внутренний ТО приграничный ТО отстутствует в списке ТО, участвующих в применении технологии удаленного выпуска.", 
					env.getDocument( ).getDocumentID( ), ResultCodes._01_00038_04 
				);
			}
		}
	}
	
	protected void receiverCustomsChecking( EDJobBatchContext jobBatchContext )
		throws ResultTypeException, DatabaseException
	{
	}

	protected void checkProcessEmpty( EDEnvelope env )
		throws ResultTypeException
	{
	}
	
	protected void checkSoftVersionValidness( EDEnvelope env, EDJobBatchContext jobBatchContext ) 
		throws ResultTypeException, DatabaseException
	{
		String currentVersion = jobBatchContext.getConfigurator( ).getSoftVersion( );
		String envSoftVersion = env.getSoftVersion( );
		if ( ! StringUtil.areEqual( envSoftVersion, currentVersion ) )
		{
			String message = String.format( 
				"SoftVersion сообщения %s, хотя ожидалась %s", 
				envSoftVersion, currentVersion 
			);
			throwException( message, env.getDocument( ).getDocumentID( ), ResultCodes._09_00011_01 );
		}
		
		Edecl_Softversion sv = _serviceHolder.getSoftVersionService( ).getSoftVersion( envSoftVersion );
		if ( null != sv.getEndDate( ) && sv.getEndDate( ).getTime( ) < ( new Date( ) ).getTime( ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._03_00102_01, 
				ProcessingConstants.ERROR_TYPE_CHECK 
			);
		}
	}
	
	private String getCustomsCode( String messageKind )
	{
		String code = "";
		if ( ! StringUtil.isNullOrEmpty( messageKind ) )
		{
			String formatedMsgKind = messageKind.toUpperCase( );
			if ( formatedMsgKind.startsWith( udPrefix ) )
				code = formatedMsgKind.substring( udPrefix.length( ) );
		}
		
		return code;
	}
}
