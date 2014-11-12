package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.HashMap;
import java.util.Map;

import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.data.kind.ArchiveDocumentStatuses;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edarch_Archive_Docs;
import ru.acs.fts.eps2.model.entities.Edarch_Reqinfo;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.objects.defines.DocumentSaveTypes;
import ru.acs.fts.eps2.router.objects.defines.DocumentUniquenesses;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.eps2.router.processing.helpers.ResultEnvelopeHelper;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.schemas.admin.ead_docrequest.EADDocRequestType;
import ru.acs.fts.schemas.admin.ead_docrequest.RequestedDocType;
import ru.acs.fts.schemas.album.result.ResultType;

public class MessageADM00012BusinessProcess extends BusinessProcess
{
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		EADDocRequestType request = recvEnv.getDocument( ).getDocumentAsClass( EADDocRequestType.class );

		setRequiredStatuses( request, recvEnv );
		
		Map< String, String > messageTypeSubstituion = new HashMap< String, String >( );
		messageTypeSubstituion.put( MessageType.ADM_00012, MessageType.ADM_00004 );
		
		EDEnvelope adm00004 = EnvelopeCreator.createTranzitMessage( 
			messageTypeSubstituion, recvEnv, 
			BusinessSystems.EPS, recvEnv.getSenderCustoms( ) 
		);
		
		ResultType document = ResultEnvelopeHelper.getOkResultDocument( request.getDocumentID( ), "" );
		
		adm00004.setInnerDocument( document );
		adm00004.setSaveDocument( true );
		
		adm00004.getDocument( ).setSaveType( DocumentSaveTypes.INSERT );
		adm00004.getDocument( ).setUniqueness( DocumentUniquenesses.UNIQ );
		
		String envelopeName = jobContext.getString( ContextConstants.ENVELOPE_NAME );
		jobBatchContext.put( envelopeName, adm00004 );
	}
	
	private void setRequiredStatuses( EADDocRequestType doc, EDEnvelope recvEnv ) 
		throws DatabaseException
	{
		for ( RequestedDocType rdoc : doc.getRequestedDocList( ) )
		{
			Edarch_Archive_Docs docInformation = _serviceHolder.getEdarchService( )
				.getDocument( rdoc.getArchID( ), rdoc.getArchDocID( ) );

			docInformation.setArdocStageStatus( ArchiveDocumentStatuses.DOC_NEW_ACTUAL );
			_serviceHolder.getEdarchService( ).merge( docInformation );

			Edarch_Reqinfo reqinfo = new Edarch_Reqinfo( );
			reqinfo.setReqEnvId( recvEnv.getInitialEnvelopeID( ) );
			reqinfo.setReqDocId( doc.getDocumentID( ) );
			reqinfo.setIdInternal( docInformation.getArdocArchIdinternal( ) );
			reqinfo.setArdocIdInternal( docInformation.getArdocIdinternal( ) );
			_serviceHolder.getEdarchService( ).merge( reqinfo );
		}		
	}

}
