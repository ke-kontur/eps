package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.eps2.engine.data.kind.DocumentStates;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.objects.EDDocument;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.objects.defines.DocumentSaveTypes;
import ru.acs.fts.eps2.router.objects.defines.DocumentUniquenesses;
import ru.acs.fts.eps2.router.processing.EDJobBatchContext;
import ru.acs.fts.eps2.router.processing.ead.EadRequest;
import ru.acs.fts.eps2.router.processing.ead.EadRequest2Results;
import ru.acs.fts.eps2.router.processing.ead.EadRequester;
import ru.acs.fts.eps2.router.processing.helpers.EnvelopeCreator;
import ru.acs.fts.schemas.album.ed_container.EDContainerType;
import ru.acs.fts.schemas.album.goodsoperationrequest.GoodsOperationRequestType;
import ru.acs.fts.schemas.album.inventory.InventDocumentType;
import ru.acs.fts.schemas.album.inventory.InventoryType;

/**
 * Бизнес процесс обработки сообщения CMN.12102
 * ( Предоставление описи электронных документов на прибывающее воздушное судно )
 */
public class MessageCMN12102BusinessProcess extends BusinessProcess
{
	private Map< String, String > _messageTypeMappings;
	
	// @formatter:off
	@Required
	public void setMessageTypeMappings( Map< String, String > messageTypeMappings ) { _messageTypeMappings = messageTypeMappings; }
	public Map< String, String > getMessageTypeMappings( ) { return _messageTypeMappings; }
	// @formatter:on
	
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );
		
		EDContainerType doc = recvEnv.getDocument( ).getDocumentAsClass( EDContainerType.class );
		
		InventoryType inventory = null;
		GoodsOperationRequestType goodsOpRequest = null;
		
		for ( String cDocId : recvEnv.getDocument( ).getContainerDocuments( ).keySet( ) )
		{
			EDDocument cdoc = recvEnv.getDocument( ).getDocumentInContainer( cDocId );
			
			if ( cdoc.isDocumentOfClass( InventoryType.class ) )
				inventory = cdoc.getDocumentAsClass( InventoryType.class );
			else if ( cdoc.isDocumentOfClass( GoodsOperationRequestType.class ) )
				goodsOpRequest = cdoc.getDocumentAsClass( GoodsOperationRequestType.class );
			else
				continue;
			
			Edecl_Msg_Doc bdoc = _serviceHolder.getEnvelopeService( ).getDocument( cdoc.getDocumentID( ) );
			if ( null != bdoc )
			{
				bdoc.setState( DocumentStates.NOTSET );
				_serviceHolder.getEnvelopeService( ).merge( bdoc );
			}
		}
		
		List< InventDocumentType > docs = 
			inventory.getInventoryInstance( ).getInventDocumentList( );		
				
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
		addDocs.add( inventory );
		addDocs.add( goodsOpRequest );
		
		EDContainerType resDocument = EadRequester.createContainer( 
			doc.getDocumentID( ), addDocs, results 
		);
		
		/**
		 * Ну и собственно формируем ответное сообщение
		 */
		String envelopeName = jobContext.getString( ContextConstants.ENVELOPE_NAME );
		
		EDEnvelope respEnvelope = EnvelopeCreator.createTranzitMessage( 
			_messageTypeMappings, recvEnv, 
			BusinessSystems.CUSTOMS, recvEnv.getReceiverCustoms( ) 
		);
		
		respEnvelope.setInnerDocument( resDocument );
		for ( String cDocId : respEnvelope.getDocument( ).getContainerDocuments( ).keySet( ) )
		{
			EDDocument cdoc = respEnvelope.getDocument( ).getDocumentInContainer( cDocId );
			cdoc.setUniqueness( DocumentUniquenesses.NOT_UNIQ );
		}

		respEnvelope.getDocument( ).setSaveBody( true );
		respEnvelope.getDocument( ).setSaveType( DocumentSaveTypes.INSERT );
		respEnvelope.getDocument( ).setUniqueness( DocumentUniquenesses.UNIQ );
						
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
