package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edarch_Reqinfo;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.ead.EadRequest;
import ru.acs.fts.eps2.router.processing.ead.EadRequest2Reqinfo;
import ru.acs.fts.eps2.router.processing.ead.EadRequester;
import ru.acs.fts.schemas.admin.confirmwhdocregremote.ConfirmWHDocRegRemoteType;
import ru.acs.fts.schemas.admin.confirmwhdocregremote.EADInfoType;
import ru.acs.fts.schemas.admin.confirmwhdocregremote.GTDIDType;

public class MessageADM00015BusinessProcess extends BusinessProcess
{
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		ConfirmWHDocRegRemoteType doc = recvEnv.getDocument( ).getDocumentAsClass( ConfirmWHDocRegRemoteType.class );
		
		List< EadRequest > requests = convert( recvEnv.getInitialEnvelopeID( ), doc );
		
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
		
		GTDIDType gtd = doc.getGTDID( );
		
		for ( EadRequest request : mappings.keySet( ) )
		{
			Edarch_Reqinfo response = mappings.get( request );
		
			response.setSvhRegNumberCustCode( gtd.getCustomsCode( ) );
			response.setSvhRegNumberNumber( gtd.getGTDNumber( ) );
			if ( null != gtd.getRegistrationDate( ) )
				response.setSvhRegNumberDate( gtd.getRegistrationDate( ).toDate( ) );
			
			_serviceHolder.getEdarchService( ).merge( response );			
		}
	}
	
	private List< EadRequest > convert( String envelopeId, ConfirmWHDocRegRemoteType doc )
	{
		List< EadRequest > requests = new ArrayList< EadRequest >( );
		
		for ( EADInfoType eadInfo : doc.getEADInfoList( ) )
		{
			EadRequest request = new EadRequest( );
			request.setArchId( eadInfo.getArchID( ) );
			request.setArchDocId( eadInfo.getArchDocID( ) );
			request.setLineId( null );
			request.setDocCode( null );
			request.setReqEnvId( envelopeId );
			
			requests.add( request );
		}		
		
		return requests;
	}
}
