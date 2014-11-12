package ru.acs.fts.aly.router.objects;

import java.util.List;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.engine.objects.Document;
import ru.acs.fts.eps2.engine.objects.Envelope;
import ru.acs.fts.eps2.engine.restWs.shared.serviceModel.DocumentToCheck;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.schemas.envelope.EDHeaderType;
import ru.acs.fts.schemas.envelope.EnvelopeType;

public class AlyEnvelope extends Envelope
{
	/**
	 * Заголовок, содержащий информацию, специфичную для АПС ЭПС
	 */
	private EDHeaderType _edHeader;

	// @formatter:off
	public EDHeaderType getEDHeader( ) { return _edHeader; }
	// @formatter:on

	public AlyEnvelope( EnvelopeType envelope, String senderSystem )
		throws BaseProcessingException, DatabaseException
	{
		super( envelope, senderSystem );
	}

	/**
	 * Общие операции
	 */
	
	public String getProcessID( )
	{
		return ( null != _edHeader ) ? _edHeader.getProccessID( ) : null;
	}
	
	public void setProcessID( String processId )
	{
		if ( null == _edHeader )
			throw new IllegalStateException( "Инициализация конверта еще не была произведена!" );
		
		_edHeader.setProccessID( processId );
	}

	@Override
	protected void processHeaderObject( Object obj )
	{
		if ( obj instanceof EDHeaderType )
			_edHeader = ( EDHeaderType )obj;
	}

	@Override
	public Document processDocumentObject( Object doc ) 
		throws BaseProcessingException, DatabaseException
	{
		return new AlyDocument( doc );
	}

	@Override
	public DocumentToCheck getDocumentToCheck( )
	{
		DocumentToCheck doc2check = new DocumentToCheck( );
		
		doc2check.setEnvelopeId( getEnvelopeID( ) );
		doc2check.setDocumentId( getDocument( ).getDocumentID( ) );
		doc2check.setProcessId( null != _edHeader ? _edHeader.getProccessID( ) : null );
		
		List< String > xPath = getDocument( ).getSubDocumentsXPathes( );
		doc2check.setIsContainer( xPath.size( ) > 0 );		
		doc2check.setXPath( xPath );
		
		return doc2check;
	}

	@Override
	public boolean isNeedReciept( )
	{
		return false;
	}

}
