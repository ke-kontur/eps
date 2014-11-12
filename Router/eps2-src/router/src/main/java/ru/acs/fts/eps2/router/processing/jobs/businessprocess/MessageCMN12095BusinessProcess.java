package ru.acs.fts.eps2.router.processing.jobs.businessprocess;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.data.kind.DocumentStates;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.model.entities.Edecl_Msg_Doc;
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
import ru.acs.fts.schemas.album.transportdeclaration.TransportDeclarationType;

public class MessageCMN12095BusinessProcess extends BusinessProcess
{
	@Override
	public void executeProcess( EDJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		EDEnvelope recvEnv = jobBatchContext.getReceivedEnvelope( );

		EDContainerType container = recvEnv.getDocument( ).getDocumentAsClass( EDContainerType.class );
		
		EDDocument inventory = recvEnv.getDocument( ).getDocumentInContainer( InventoryType.class );
		EDDocument trpdecl = recvEnv.getDocument( ).getDocumentInContainer( TransportDeclarationType.class );
		
		InventoryType inv = inventory.getDocumentAsClass( InventoryType.class );
		TransportDeclarationType transportDeclaration = trpdecl.getDocumentAsClass( TransportDeclarationType.class );
		
		/**
		 * Обработка для сохранения в базу
		 */
		recvEnv.getDocument( ).setCurrentState( DocumentStates.CURRENT );
		
		Edecl_Msg_Doc dbdoc = _serviceHolder.getEnvelopeService( ).getDocument( container.getDocumentID( ) );
		if ( null != dbdoc )
		{
			dbdoc.setState( DocumentStates.CURRENT );
			_serviceHolder.getEnvelopeService( ).merge( dbdoc );
		}

		inventory.setCurrentState( DocumentStates.CURRENT );
		
		dbdoc = _serviceHolder.getEnvelopeService( ).getDocument( inv.getDocumentID( ) );
		if ( null != dbdoc )
		{
			dbdoc.setState( DocumentStates.CURRENT );
			_serviceHolder.getEnvelopeService( ).merge( dbdoc );
		}
		
		trpdecl.setCurrentState( DocumentStates.CURRENT );
		
		dbdoc = _serviceHolder.getEnvelopeService( ).getDocument( transportDeclaration.getDocumentID( ) );
		if ( null != dbdoc )
		{
			dbdoc.setState( DocumentStates.CURRENT );
			_serviceHolder.getEnvelopeService( ).merge( dbdoc );
		}
		
		List< InventDocumentType > docs = inv.getInventoryInstance( ).getInventDocumentList( ); 
		// String documentId = container.getDocumentID( );
				
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
		addDocs.add( transportDeclaration );
		
		EDContainerType resDocument = EadRequester.createContainer( 
			container.getDocumentID( ), addDocs, results 
		);
		
		/**
		 * Ну и собственно формируем ответное сообщение
		 */

		String envelopeName = jobContext.getString( ContextConstants.ENVELOPE_NAME );

		Map< String, String > messageTypeSubstituion = new HashMap< String, String >( );
		messageTypeSubstituion.put( MessageType.CMN_12095, MessageType.MSG_12005 );
		messageTypeSubstituion.put( MessageType.CMN_12101, MessageType.MSG_12006 );
		
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
