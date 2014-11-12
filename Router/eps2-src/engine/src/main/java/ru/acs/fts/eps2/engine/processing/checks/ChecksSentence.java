package ru.acs.fts.eps2.engine.processing.checks;

import java.io.ByteArrayInputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;

import ru.acs.fts.custommarshaller.EnvelopeMarshaller;
import ru.acs.fts.eps2.engine.objects.Envelope;
import ru.acs.fts.eps2.engine.processing.ContextConstants;
import ru.acs.fts.eps2.engine.processing.JobBatchContext;
import ru.acs.fts.eps2.engine.processing.helpers.MarshallingHelper;

public class ChecksSentence extends ChecksBlock
{
	private DocumentBuilderFactory documentBuilderFactory = null;	
	
	@Override
	public boolean check( Envelope envelope, JobBatchContext jobBatchContext ) 
		throws Exception
	{
		/**
		 * В ходе проверки нам потребуется представление документа в виде
		 * DOM-дерева. Чтобы в каждой проверке этого не делать - сделаем это здесь
		 */
		
		EnvelopeMarshaller envMarshaller = new EnvelopeMarshaller( );
		/*
		byte[] data = envMarshaller.marshalBaseDocOrSignature( 
			envelope.getBody( ).getAnyList( ).get( 0 ), 
			MarshallingHelper.getSharedMarshaller( ) 
		).getByteArray( );
		*/
		byte[ ] data = envMarshaller.marshall( envelope.getEnvelope( ), MarshallingHelper.getSharedMarshaller( ), false );
		
		if ( documentBuilderFactory == null )
		{
			documentBuilderFactory = DocumentBuilderFactory.newInstance( );
			documentBuilderFactory.setNamespaceAware( true ); 
		}
		
		DocumentBuilder builder = documentBuilderFactory.newDocumentBuilder( );
		Document domDoc = builder.parse( new ByteArrayInputStream( data ) );
		
		jobBatchContext.put( ContextConstants.XML_DOM_DOCUMENT, domDoc );
		
		return super.check( envelope, jobBatchContext );
	}
}
