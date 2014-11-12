package ru.acs.fts.aud.router.objects;

import java.util.List;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.engine.objects.Document;
import ru.acs.fts.eps2.engine.objects.Envelope;
import ru.acs.fts.eps2.engine.restWs.shared.serviceModel.DocumentToCheck;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.schemas.aud.audinf.AUDInfType;
import ru.acs.fts.schemas.envelope.ApplicationInfType;
import ru.acs.fts.schemas.envelope.EnvelopeType;

public class AudEnvelope extends Envelope
{
	/**
	 * Транспортные объекты
	 */
	
	/**
	 * Заголовок, содержащий информацию, специфичную для АЮДа
	 */
	private AUDInfType _audInfo;
	
	/**
	 * Сопроводительные свойства
	 * @throws DatabaseException 
	 * @throws ResultTypeException 
	 */
		
	public AudEnvelope( EnvelopeType envelope, String senderSystem ) 
			throws BaseProcessingException, DatabaseException
	{
		super( envelope, senderSystem );
	}
	
	// @formatter:off
	public AUDInfType getAudInfo( ) { return _audInfo; }
	// @formatter:on
	
	/**
	 * Общие операции
	 */
	
	public String getMessageKind( )
	{
		ApplicationInfType appInfo = getApplicationInfo( );
		return ( null != appInfo ) ? appInfo.getMessageKind( ) : null;
	}
	
	public AudDocument getDocument( ) 
	{ 
		return ( AudDocument )super.getDocument( ); 
	}	
	
	/**
	 * Внутренние операции
	 */
		
	@Override
	protected void processHeaderObject( Object obj )
	{
		if ( obj instanceof AUDInfType )
			_audInfo = ( AUDInfType )obj;
	}
	
	@Override
	public Document processDocumentObject( Object doc ) throws BaseProcessingException, DatabaseException
	{
		return new AudDocument( doc );
	}
	
	@Override
	public DocumentToCheck getDocumentToCheck( )
	{
		DocumentToCheck doc2check = new DocumentToCheck( );
		
		doc2check.setEnvelopeId( getEnvelopeID( ) );
		doc2check.setDocumentId( getDocument( ).getDocumentID( ) );
		doc2check.setProcessId( null );
		
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
