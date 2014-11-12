package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.acs.fts.eps2.core.processing.ProcessingConstants;
import ru.acs.fts.eps2.core.processing.ResultCodes;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edecl_Messages;
import ru.acs.fts.eps2.model.entities.Edecl_Reqdoc_Info;
import ru.acs.fts.eps2.model.services.EnvelopeService;
import ru.acs.fts.eps2.router.errors.ErrorHelper;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.utils.StringUtil;
import ru.acs.fts.schemas.album.permitdelaydocs.DelayedDocsType;
import ru.acs.fts.schemas.album.permitdelaydocs.PermitDelayDocsType;

public class MessageCMN11113BusinessProcess extends BusinessProcess
{
	// private static final Logger log = LoggerFactory.getLogger( MessageCMN11113BusinessProcess.class );

	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		EnvelopeService envSrv = _serviceHolder.getEnvelopeService( );
		
		String cmn11112EnvId = envSrv.getIncomeEnvelopeIdByInitialEnvelopeId( recvEnv.getInitialEnvelopeID( ) );
		if ( StringUtil.isNullOrEmpty( cmn11112EnvId ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._02_00001_01, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}

		Edecl_Messages cmn11112 = envSrv.getEnvelope( cmn11112EnvId );
		if ( null == cmn11112 )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._02_00001_01, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
		
		String msg11003EnvId = envSrv.getIncomeEnvelopeIdByInitialEnvelopeId( cmn11112.getInitialEnvelopeId( ) );
		if ( StringUtil.isNullOrEmpty( msg11003EnvId ) )
		{
			ErrorHelper.throwException( 
				jobBatchContext, 
				ResultCodes._02_00001_01, 
				ProcessingConstants.ERROR_TYPE_BUSINESS 
			);
		}
		
		PermitDelayDocsType doc = recvEnv.getDocument( ).getDocumentAsClass( PermitDelayDocsType.class );
		for ( DelayedDocsType ddoc : doc.getDelayedDocList( ) )
		{
			if ( StringUtil.isNullOrEmpty( ddoc.getRequestPositionID( ) ) )
				continue;
			
			Edecl_Reqdoc_Info rDocInfo = envSrv.getReqDocInfo( ddoc.getRequestPositionID( ), msg11003EnvId );
			if ( null == rDocInfo )
			{
				ErrorHelper.throwException( 
					jobBatchContext, 
					ResultCodes._02_00001_01, 
					ProcessingConstants.ERROR_TYPE_BUSINESS 
				);				
			}
			
			rDocInfo.setFlags( rDocInfo.getFlags( ) | Edecl_Reqdoc_Info.FLAG_ALLOWED_AFTER_ISSUE );
			envSrv.merge( rDocInfo );
		}
	}

}
