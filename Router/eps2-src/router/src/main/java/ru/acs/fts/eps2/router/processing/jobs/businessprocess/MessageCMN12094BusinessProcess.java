package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.objects.EDDocument;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.objects.defines.DocumentUniquenesses;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.ead.EadRequest;
import ru.acs.fts.eps2.router.processing.ead.EadRequest2Results;
import ru.acs.fts.eps2.router.processing.ead.EadRequester;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.schemas.album.ed_container.EDContainerType;
import ru.acs.fts.schemas.album.inventory.InventDocumentType;
import ru.acs.fts.schemas.album.inventory.InventoryType;
import ru.acs.fts.schemas.album.notiffactarrival.NotifFactArrivalType;

public class MessageCMN12094BusinessProcess extends BusinessProcess
{
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );

		EDContainerType container = recvEnv.getDocument( ).getDocumentAsClass( EDContainerType.class );
		
		EDDocument inventory = recvEnv.getDocument( ).getDocumentInContainer( InventoryType.class );
		EDDocument arrivalf = recvEnv.getDocument( ).getDocumentInContainer( NotifFactArrivalType.class );
		
		InventoryType inv = inventory.getDocumentAsClass( InventoryType.class ); 
		NotifFactArrivalType arrivalFact = arrivalf.getDocumentAsClass( NotifFactArrivalType.class );
				
		List< InventDocumentType > docs = inv.getInventoryInstance( ).getInventDocumentList( );
		
		// TODO: проверить запрашиваемые архивы на принадлежность конкретному декларанту
		/**
		 * Вообще-то у нас не может быть двух одинаковых документов у разных декларантов
		 * однако, кто-то может попросить не свой документ, поэтому стоит проверять принадлежность
		 * архива указанному во входящем сообщении декларанту
		 */
		
		// TODO: поиск в нескольких РТУ
		
		EadRequest2Results results = new EadRequest2Results( );
		EadRequester.checkAndFetchEadDocuments( 
			convert( docs ), results, 
			true, _serviceHolder 
		);		
		
		/**
		 * Хорошо, все требуемые документы мы из ЭАДа вытащили, теперь нам надо бы 
		 * их упаковать в контейнер и отправить по адресу
		 */
		
		List< Object > addDocs = new ArrayList< Object >( );
		addDocs.add( inv );
		addDocs.add( arrivalFact );
		
		EDContainerType resDocument = EadRequester.createContainer( 
			container.getDocumentID( ), addDocs, results 
		);
		
		/**
		 * Ну и собственно формируем ответное сообщение
		 */
		String envelopeName = jobContext.getString( ContextConstants.ENVELOPE_NAME );
		
		Map< String, String > messageTypeSubstituion = new HashMap< String, String >( );
        if(recvEnv.getMessageType( ).equals(MessageType.CMN_12124)){
            messageTypeSubstituion.put(recvEnv.getMessageType(), MessageType.MSG_12015);
        }
        else {
            messageTypeSubstituion.put(recvEnv.getMessageType(), MessageType.MSG_12004);
        }
		
		EDEnvelope respEnvelope = EnvelopeCreator.createTranzitMessage( 
			messageTypeSubstituion, recvEnv, 
			BusinessSystems.CUSTOMS, recvEnv.getReceiverCustoms( ) 
		);
				
		respEnvelope.setInnerDocument( resDocument );
		for ( String cDocId : respEnvelope.getDocument( ).getContainerDocuments( ).keySet( ) )
		{
			EDDocument cdoc = respEnvelope.getDocument( ).getDocumentInContainer( cDocId );
			cdoc.setUniqueness( DocumentUniquenesses.NOT_UNIQ );
		}
		
		jobBatchContext.put( envelopeName, respEnvelope );
	}
	
	private List< EadRequest > convert( List< InventDocumentType > reqs )
	{
		List< EadRequest > requests = new ArrayList< EadRequest >( );
		
		for ( InventDocumentType reqDoc : reqs )
		{
			EadRequest req = new EadRequest( );
			req.setArchId( reqDoc.getArchID( ) ); 
			req.setArchDocId( reqDoc.getArchDocID( ) );
			req.setLineId( reqDoc.getInventLineID( ) );
			req.setDocCode( reqDoc.getInvDocCode( ) );
			
			requests.add( req );
		}		
		
		return requests;
	}

}
