package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edecl_Reqdoc_Info;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.utils.StringUtil;
import ru.acs.fts.schemas.album.notifaddcontrol.CustomsCostInfType;
import ru.acs.fts.schemas.album.notifaddcontrol.NotifAddControlType;
import ru.acs.fts.schemas.album.notifaddcontrol.ReqDocumentType;

/**
 * Бизнес процесс обработки сообщений CMN.11065, CMN.11066, CMN.11067
 * Запрос документов по дополнительной проверке из таможенного органа
 */
public class AdditionalCheckDocumentsRequestBusinessProcess extends BusinessProcess
{
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );

		NotifAddControlType addControl = recvEnv.getDocument( )
			.getDocumentInContainer( NotifAddControlType.class )
			.getDocumentAsClass( NotifAddControlType.class );

		if ( null == addControl )
		{
			ErrorHelper.throwException( 
				jobBatchContext, ResultCodes._03_00014_01, 
				ProcessingConstants.ERROR_TYPE_CHECK 
			);
		}
		
		persistReqDocInfos( addControl, jobBatchContext, jobContext );
	}
	
	private void persistReqDocInfos( 
			NotifAddControlType document, 
			EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws DatabaseException
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		String envelopeId = recvEnv.getEnvelopeID( );
		
		if ( null == document.getCustomsCostInfList( ) || 0 == document.getCustomsCostInfList( ).size( ) )
			return ;
		
		for ( CustomsCostInfType ccit : document.getCustomsCostInfList( ) )
		{
			if ( null == ccit.getReqDocumentList( ) || 0 == ccit.getReqDocumentList( ).size( ) )
				continue;
			
			for ( ReqDocumentType rdt : ccit.getReqDocumentList( ) )
			{
				if ( StringUtil.isNullOrEmpty( rdt.getRequestPositionID( ) ) )
					continue;
				
				Edecl_Reqdoc_Info rdocInfo = new Edecl_Reqdoc_Info( );
				rdocInfo.setEnvelopeId( envelopeId );
				rdocInfo.setReqDocId( document.getDocumentID( ) );
				rdocInfo.setPositionId( rdt.getRequestPositionID( ) );
				rdocInfo.setDocCode( rdt.getDocCode( ) );
				rdocInfo.setDocName( rdt.getPrDocumentName( ) );
				
				_serviceHolder.getEnvelopeService( ).persist( rdocInfo );
			}
		}
	}
}
