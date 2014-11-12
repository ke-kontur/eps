package ru.acs.fts.aly.router.processing.jobs;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import ru.acs.fts.aly.model.entities.AlyMessage;
import ru.acs.fts.aly.model.entities.AlyXmlData;
import ru.acs.fts.aly.model.services.MessageService;
import ru.acs.fts.aly.router.objects.AlyEnvelope;
import ru.acs.fts.aly.router.processing.AlyJobBatchContext;
import ru.acs.fts.custommarshaller.XStringMarshallableClass;
import ru.acs.fts.eps2.engine.processing.JobContext;
import ru.acs.fts.eps2.util.helpers.UUIDGen;

public class SaveXmlJob extends AlyJob
{

	@Override
	public void alyExecute( AlyJobBatchContext jobBatchContext, JobContext jobContext ) 
		throws Exception
	{
		MessageService msgSrv = jobBatchContext.getServiceHolder( ).getMessageService( );
		
		AlyEnvelope env = jobBatchContext.getReceivedEnvelope( );
		
		// Раскладываем сообщение
		
		AlyMessage msg = new AlyMessage( );
		msg.setId( UUIDGen.getUUID( ).toString( ) );
		msg.setEnvelopeId( env.getEnvelopeID( ) );
		msg.setDocumentId( env.getDocument( ).getDocumentID( ) );
		msg.setProcessId( env.getProcessID( ) );
		msg.setSoftVersion( env.getSoftVersion( ) );
		msgSrv.persist( msg );
		
		// Раскладываем XML
		
		List< AlyXmlData > data = new ArrayList< AlyXmlData >( );
		
		XStringMarshallableClass xstr = env.getDocument( ).getDocumentAsClass( XStringMarshallableClass.class );
		
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance( );
		dbf.setNamespaceAware( true );
		
		DocumentBuilder db = dbf.newDocumentBuilder( );
		Document doc = db.parse( new ByteArrayInputStream( xstr.getByteArray( ) ) );
		
		processXml( doc.getDocumentElement( ), null, msg, null, data );
		
		msgSrv.persist( data );
	}

	@Override
	public String getAction( )
	{
		return "Задача разложения XML в реляционную таблицу";
	}

	private Integer processXml( Element el, Integer lastId, AlyMessage msg, AlyXmlData parent, List< AlyXmlData > data )
	{
		Integer thisId = null != lastId ? lastId + 1 : 0;
		
		AlyXmlData cur = new AlyXmlData( );
		cur.setId( thisId );
		cur.setMessageId( msg.getId( ) );
		cur.setTagName( el.getLocalName( ) );
		cur.setTagNamespace( el.getNamespaceURI( ) );
		
		cur.setTagParent( null != parent ? parent.getId( ) : null );
		
		data.add( cur );
		
		Integer cid = thisId;
		
		boolean hasChild = false;
		
		if ( el.hasChildNodes( ) )
		{
			for ( Node n = el.getFirstChild( ); n != null; n = n.getNextSibling( ) )
			{
				if ( ! ( n instanceof Element ) ) 
					continue;
				
				hasChild = true;
				
				cid = processXml( ( Element )n, cid, msg, cur, data );
			}
		}
		
		if ( ! hasChild )
			cur.setTagValue( el.getTextContent( ) );
		
		return cid;
	}
}
