package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edarch_Reqinfo;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.ead.EadRequest;
import ru.acs.fts.eps2.router.processing.ead.EadRequest2Reqinfo;
import ru.acs.fts.eps2.router.processing.ead.EadRequester;
import ru.acs.fts.eps2.router.processing.ead.mappers.EadToTransportMapper;
import ru.acs.fts.schemas.admin.ead_docrequest.EADDocRequestType;
import ru.acs.fts.schemas.admin.ead_docrequest.RequestedDocType;

public class MessageADM00014BusinessProcess extends BusinessProcess
{
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		EADDocRequestType doc = recvEnv.getDocument( ).getDocumentAsClass( EADDocRequestType.class );
		String documentId = doc.getDocumentID( );
		
		List< EadRequest > requests = convert( recvEnv.getInitialEnvelopeID( ), doc.getRequestedDocList( ) );
		
		/**
		 * Вообще-то у нас не может быть двух одинаковых документов у разных декларантов
		 * однако, кто-то может попросить не свой документ, поэтому стоит проверять принадлежность
		 * архива указанному во входящем сообщении декларанту
		 * 
		 * TODO: проверить запрашиваемые архивы на принадлежность конкретному декларанту
		 */
				
		EadRequest2Reqinfo results = new EadRequest2Reqinfo( );
		EadRequester.checkReqInfo( requests, results, _serviceHolder );
		
		/**
		 * Хорошо, все требуемые документы мы из ЭАДа вытащили, теперь нам
		 * надо подготовить список ADM.00004'ов для отправки
		 */
		
		List< EDEnvelope > envelopes = new ArrayList< EDEnvelope >( );		
		String envelopeName = jobContext.getString( ContextConstants.ENVELOPE_NAME );
		jobBatchContext.put( envelopeName, envelopes );

		Map< EadRequest, Edarch_Reqinfo > mappings = results.getMappings( );
		
		for ( EadRequest request : mappings.keySet( ) )
		{
			Edarch_Reqinfo response = mappings.get( request );
			
			EDEnvelope respEnvelope = EadToTransportMapper.makeResultsEnvelope( 
				request, response, 
				MessageType.ADM_00004, MessageType.ADM_00001, 
				documentId, 
				BusinessSystems.EPS, 
				jobBatchContext 
			);
			
			envelopes.add( respEnvelope );
		}
	}
	
	private List< EadRequest > convert( String envelopeId, List< RequestedDocType > reqs )
	{
		List< EadRequest > requests = new ArrayList< EadRequest >( );
		
		for ( RequestedDocType reqDoc : reqs )
		{
			EadRequest request = new EadRequest( );
			request.setArchId( reqDoc.getArchID( ) );
			request.setArchDocId( reqDoc.getArchDocID( ) );
			request.setLineId( reqDoc.getRequestPositionID( ) );
			request.setDocCode( null );
			request.setReqEnvId( envelopeId );
			
			requests.add( request );
		}		
		
		return requests;
	}
}
