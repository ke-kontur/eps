package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

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
import ru.acs.fts.schemas.album.graphicdocrequest.DocumentType;
import ru.acs.fts.schemas.album.graphicdocrequest.GraphicDocRequestType;
import ru.acs.fts.schemas.album.permitdelaydocs.DelayedDocsType;
import ru.acs.fts.schemas.album.permitdelaydocs.PermitDelayDocsType;

public class MessageCMN11119BusinessProcess extends BusinessProcess
{
	// private static final Logger log = LoggerFactory.getLogger( MessageCMN11113BusinessProcess.class );

	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		EnvelopeService envSrv = _serviceHolder.getEnvelopeService( );
        String msg11003EnvId = envSrv.getIncomeEnvelopeIdByInitialEnvelopeId( recvEnv.getInitialEnvelopeID( ) );

        GraphicDocRequestType doc = recvEnv.getDocument( ).getDocumentAsClass( GraphicDocRequestType.class );
		for ( DocumentType ddoc : doc.getDocumentList() )
		{
			if ( StringUtil.isNullOrEmpty( ddoc.getRequestPositionID( ) ) )
				continue;
			
			Edecl_Reqdoc_Info rDocInfo = envSrv.getReqDocInfo( ddoc.getRequestPositionID( ) );
			if ( null == rDocInfo )
			{
				ErrorHelper.throwException( 
					jobBatchContext, 
					ResultCodes._03_00106_05,
					ProcessingConstants.ERROR_TYPE_BUSINESS 
				);				
			}
		}
	}

}
