package ru.acs.fts.eps2.router.objects;

import java.util.List;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.data.kind.CompressType;
import ru.acs.fts.eps2.engine.data.kind.ProcedureCreateStates;
import ru.acs.fts.eps2.engine.objects.Document;
import ru.acs.fts.eps2.engine.objects.Envelope;
import ru.acs.fts.eps2.engine.restWs.shared.serviceModel.DocumentToCheck;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.util.helpers.UUIDGen;
import ru.acs.fts.schemas.envelope.CustomsType;
import ru.acs.fts.schemas.envelope.EDHeaderType;
import ru.acs.fts.schemas.envelope.EnvelopeType;

public class EDEnvelope extends Envelope
{
	/**
	 * Транспортные объекты
	 */
	
	/**
	 * Заголовок, содержащий информацию, специфичную для АПС ЭПС
	 */
	private EDHeaderType _edHeader;
	
	/**
	 * Сопроводительные свойства
	 */
	
	/**
	 * Тип метода создания процедуры. Задается при ее открытии или извлечении из БД.
	 */
	private String _procedureCreateState = ProcedureCreateStates.NORMAL;
	
	/**
	 * Идентификатор связанного сообщения. Т.е. это то сообщение которое прошло через
	 * нас транзитом.
	 */
	private String _incomeEnvelopeId = null;
	
	/**
	 * Тип сжатия для сохранения в процедуру
	 * TODO: Разобраться что это и зачем
	 */
	private CompressType _compressType = CompressType.NotCompressed;
	
	/**
	 * Родословная сообщений
	 */
	private String _lineageId = UUIDGen.getUUID( ).toString( );
	
	public EDEnvelope( EnvelopeType envelope, String senderSystem ) 
		throws BaseProcessingException, DatabaseException
	{
		super( envelope, senderSystem );
	}
	
	// @formatter:off
	public EDHeaderType getEDHeader( ) { return _edHeader; }
	
	public void setProcedureCreateState( String procedureCreateState ) { _procedureCreateState = procedureCreateState; }
	public String getProcedureCreateState( ) { return _procedureCreateState; }
	
	public void setIncomeEnvelopeID( String incomeEnvelopeId ) { _incomeEnvelopeId = incomeEnvelopeId; }
	public String getIncomeEnvelopeID( ) { return _incomeEnvelopeId; }
	
	public void setCompressType( CompressType compressType ) { _compressType = compressType; }
	public CompressType getCompressType( ) { return _compressType; }
	
	public void setLineageId( String lineageId ) { _lineageId = lineageId; }
	public String getLineageId( ) { return _lineageId; }
	// @formatter:on
	
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
	
	public CustomsType getSenderCustoms( )
	{
		return ( null != _edHeader ) ? _edHeader.getSenderCustoms( ) : null;
	}
	
	public CustomsType getReceiverCustoms( )
	{
		return ( null != _edHeader ) ? _edHeader.getReceiverCustoms( ) : null;
	}
	
	public String getParticipantID( )
	{
		return ( null != _edHeader ) ? _edHeader.getParticipantID( ) : null;
	}
	
	public String getMessageType( )
	{
		return ( null != _edHeader ) ? _edHeader.getMessageType( ) : null;
	}
	
	public EDDocument getDocument( ) 
	{ 
		return ( EDDocument )super.getDocument( ); 
	}
	
	/**
	 * Внутренние операции
	 */
		
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
		return new EDDocument( doc );
	}
	
	@Override
	public DocumentToCheck getDocumentToCheck( )
	{
		DocumentToCheck doc2check = new DocumentToCheck( );
		
		doc2check.setEnvelopeId( getEnvelopeID( ) );
		doc2check.setDocumentId( getDocument( ).getDocumentID( ) );
		doc2check.setProcessId( getProcessID( ) );
		
		List< String > xPath = getDocument( ).getSubDocumentsXPathes( );
		doc2check.setIsContainer( xPath.size( ) > 0 );		
		doc2check.setXPath( xPath );
		
		return doc2check;
	}
	
	@Override
	public boolean isNeedReciept( )
	{
		return ! MessageType.PVR_00003.equalsIgnoreCase( getMessageType( ) );
	}
}
