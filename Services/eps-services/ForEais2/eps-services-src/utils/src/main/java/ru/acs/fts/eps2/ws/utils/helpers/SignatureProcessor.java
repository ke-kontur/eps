package ru.acs.fts.eps2.ws.utils.helpers;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class SignatureProcessor
{
	private static final String SIGNATURE = "Signature";
	private static final String OBJECT = "Object";
	
	public static Document getDocumentWithoutSignature( Element xmlSignDoc, Document tmpl )
	{
		if ( xmlSignDoc.getLocalName( ).equalsIgnoreCase( SIGNATURE ) )
		{
			NodeList possibleObjects = xmlSignDoc.getChildNodes( );
			for ( int i = 0; i < possibleObjects.getLength( ); ++i )
			{
				Node possibleObject = possibleObjects.item( i );
				if ( ! ( possibleObject instanceof Element ) )
					continue;
				
				Element object = ( Element )possibleObject;
				if ( ! object.getLocalName( ).equalsIgnoreCase( OBJECT ) )
					continue;
				
				NodeList possibleAnies = object.getChildNodes( );
				for ( int j = 0; j < possibleAnies.getLength( ); ++j )
				{
					Node possibleAny = possibleAnies.item( j );
					if ( ! ( possibleAny instanceof Element ) )
						continue;
					
					Element any = ( Element )possibleAny;
					
					tmpl.appendChild( tmpl.importNode( any, true ) );
					return tmpl;
				}
			}
		}

		/**
		 * Мы не нашли подпись в документе, соответственно - скорее всего
		 * он подписи и не содержал, поэтому возвращаем его как есть
		 */
		tmpl.appendChild( tmpl.importNode( xmlSignDoc, true ) );
		return tmpl;
	}
}
