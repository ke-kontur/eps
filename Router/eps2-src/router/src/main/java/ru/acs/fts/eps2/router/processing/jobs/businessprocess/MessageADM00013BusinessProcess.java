package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.HashMap;
import java.util.Map;

import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edarch_Read_Access;
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

public class MessageADM00013BusinessProcess extends BusinessProcess
{
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		EADDocRequestType request = recvEnv.getDocument( ).getDocumentAsClass( EADDocRequestType.class );

		setRequiredStatuses( request, recvEnv );
		
		Map< String, String > messageTypeSubstituion = new HashMap< String, String >( );
		messageTypeSubstituion.put( MessageType.ADM_00013, MessageType.ADM_00004 );
		
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
			Edarch_Read_Access readAccess = _serviceHolder.getEdarchService( ).getReadAccess(
				rdoc.getArchID( ),
				rdoc.getArchDocID( ),
				recvEnv.getParticipantID( )
			);
			
			if ( null == readAccess )
			{
				readAccess = new Edarch_Read_Access( );
				readAccess.setParticipantId( recvEnv.getParticipantID( ) );
				readAccess.setIdInternal( rdoc.getArchDocID( ) );
				readAccess.setArchIdInternal( rdoc.getArchID( ) );
				
				_serviceHolder.getEdarchService( ).persist( readAccess );
			}
		}
	}	
}
