package ru.acs.fts.eps2.engine.objects;

import java.util.ArrayList;
import java.util.List;

import ru.acs.fts.eps2.core.processing.BaseProcessingException;
import ru.acs.fts.eps2.engine.objects.defines.EnvelopeOrigins;
import ru.acs.fts.eps2.engine.restWs.shared.serviceModel.DocumentToCheck;
import ru.acs.fts.eps2.engine.transport.routingInfo.CoaCodHeaders;
import ru.acs.fts.eps2.engine.transport.routingInfo.ExternalRoutingInfo;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.schemas.envelope.ApplicationInfType;
import ru.acs.fts.schemas.envelope.BodyType;
import ru.acs.fts.schemas.envelope.EnvelopeType;
import ru.acs.fts.schemas.envelope.RoutingInfType;

public abstract class Envelope
{
	/**
	 * Контекст общего назначения
	 */
	private final GeneralPurposeContext _context = new GeneralPurposeContext( );
	
	/**
	 * Транспортные объекты
	 */
	
	/**
	 * Объект транспортного конверта. Получается от маршаллера или создается руками.
	 * Класс генерируется jibx поэтому правке не подлежит
	 */
	private final EnvelopeType _envelope;

	/**
	 * Прикладной документ, может быть с подписью
	 */
	private Document _document;
	
	/**
	 * Объект заголовка, содержащий транспортную информацию
	 */
	private RoutingInfType _routingInfo;
	
	/**
	 * Объект заголовка, содержащий информацию о приложении, которое
	 * отправило сообщение
	 */
	private ApplicationInfType _applicationInfo;
	
	/**
	 * Сопроводительные параметры
	 */
	
	/** 
	 * Требуется ли сохранять конверт. Только конверт (заголовок Header)
	 */
	private boolean _saveEnvelope = true; 
	
	/**
	 * Требуется ли сохранять прикладной документ, вложенный в этот конверт.
	 */
	private boolean _saveDocument = true;
	
	/**
	 * Был ли входящий прикладной документ подписан 
	 */
	private boolean _wasSigned = false;	
	
	/**
	 * Был ли входящий прикладной документ сжат.
	 * Можно специально установить этот параметр в true, чтобы 
	 * ЭПС автоматически сжало этот документ при отправке
	 */
	private boolean _wasCompressed = false;
	
	/**
	 * Тип появления сообщения. Используется для понимания создателя
	 */
	private EnvelopeOrigins _origin = EnvelopeOrigins.GENERATED;
	
	/**
	 * Бизнес-система, которая отправила сообщение
	 */
	private final String _senderSystem;	
	
	/**
	 * Бизнес-система, которая должна получить это сообщение
	 */
	private String _recipientSystem;
	
	/**
	 * Транспортная информация для пересылки данного конверта
	 * Имеет смысл только для исходящих документов
	 */
	private ExternalRoutingInfo _mqRoutingInfo;
	
	/**
	 * Байтовый массив конверта. Как правило необходим для отправки
	 */
	private byte[ ] _data;
	
	/**
	 * Заголовки указывающие на необходимость отправки сообщений-уведомлений
	 * о доставке целевого сообщения в целевую очередь и менеджер
	 */
	private CoaCodHeaders _coaCodHeaders;
	
	public Envelope( EnvelopeType envelope, String senderSystem ) 
		throws BaseProcessingException, DatabaseException
	{
		_envelope = envelope;
		_senderSystem = senderSystem;
		
		extractHeaders( );
		extractDocument( );
		
		_wasCompressed = false; /** Этот параметр устанавливается в соответствующей задаче анмаршаллинга */
		_wasSigned = ( null != _document && _document.hasSignature( ) );
	}
	
	// @formatter:off
	public GeneralPurposeContext getContext( ) { return _context; }
	
	public EnvelopeType getEnvelope( ) { return _envelope; }
	
	public Document getDocument( ) { return _document; }
	
	public RoutingInfType getRoutingInfo( ) { return _routingInfo; }
	public ApplicationInfType getApplicationInfo( ) { return _applicationInfo; }
	
	public void setSaveEnvelope( boolean saveEnvelope ) { _saveEnvelope = true; }
	public boolean getSaveEnvelope( ) { return _saveEnvelope; }
	
	public void setSaveDocument( boolean saveDocument ) { _saveDocument = true; }
	public boolean getSaveDocument( ) { return _saveDocument; }
	
	public void setWasSigned( boolean wasSigned ) { _wasSigned = wasSigned; }
	public boolean getWasSigned( ) { return _wasSigned; }
	
	public void setWasCompressed( boolean wasCompressed ) { _wasCompressed = wasCompressed; }
	public boolean getWasCompressed( ) { return _wasCompressed; }
	
	public void setOrigin( EnvelopeOrigins origin ) { _origin = origin; }
	public EnvelopeOrigins getOrigin( ) { return _origin; }
	
	public String getSenderSystem( ) { return _senderSystem; }
	
	public void setRecipientSystem( String recipientSystem ) { _recipientSystem = recipientSystem; }
	public String getRecipientSystem( ) { return _recipientSystem; }
	
	public void setMqRoutingInfo( ExternalRoutingInfo mqRoutingInfo ) { _mqRoutingInfo = mqRoutingInfo; }
	public ExternalRoutingInfo getMqRoutingInfo( ) { return _mqRoutingInfo; }
	
	public void setData( byte[ ] data ) { _data = data; }
	public byte[ ] getData( ) { return _data; }
	
	public void setCoaCodHeaders( CoaCodHeaders coaCodHeaders ) { _coaCodHeaders = coaCodHeaders; }
	public CoaCodHeaders getCoaCodHeaders( ) { return _coaCodHeaders; }
	// @formatter:on
		
	/**
	 * Общие операции
	 */
	
	public String getEnvelopeID( )
	{
		return ( null != _routingInfo ) ? _routingInfo.getEnvelopeID( ) : null;
	}
	
	public void setEnvelopeID( String envelopeId )
	{
		if ( null == _routingInfo )
			throw new IllegalStateException( "Инициализация конверта еще не была произведена!" );
		
		_routingInfo.setEnvelopeID( envelopeId );
	}
	
	public String getInitialEnvelopeID( )
	{
		return ( null != _routingInfo ) ? _routingInfo.getInitialEnvelopeID( ) : null;
	}
	
	public void setInitialEnvelopeID( String initialEnvelopeId )
	{
		if ( null == _routingInfo )
			throw new IllegalStateException( "Инициализация конверта еще не была произведена!" );
		
		_routingInfo.setInitialEnvelopeID( initialEnvelopeId );
	}
	
	public String getSoftVersion( )
	{
		return ( null != _applicationInfo ) ? _applicationInfo.getSoftVersion( ) : null;
	}
	
	public void setSoftVersion( String softVersion )
	{
		if ( null == _applicationInfo )
			throw new IllegalStateException( "Инициализация еще не была произведена!" );
		
		_applicationInfo.setSoftVersion( softVersion );
	}
	
	public void setDocument( Document document ) 
	{ 
		_document = document;
		
		doNotUseThis_setInnerDocument_Raw( document.getRawDocument( ) );
	}
	
	public void doNotUseThis_setInnerDocument_Raw( Object document )
	{
		_envelope.getBody( ).getAnyList( ).clear( );
		_envelope.getBody( ).getAnyList( ).add( document );
	}
	
	public void setInnerDocument( Object document ) 
		throws BaseProcessingException, DatabaseException
	{
		BodyType body = new BodyType( );
		
		List< Object > bodyAnys = new ArrayList< Object >( );
		body.setAnyList( bodyAnys );
		
		bodyAnys.add( document );

		_envelope.setBody( body );
		
		extractDocument( );
		setSaveDocument( true );
	}	
	
	/**
	 * Внутренние операции
	 */
		
	private void extractHeaders( )
	{
		if ( null == _envelope.getHeader( ) || null == _envelope.getHeader( ).getAnyList( ) ||
			 0 == _envelope.getHeader( ).getAnyList( ).size( ) )
			return ;
		
		for ( Object obj : _envelope.getHeader( ).getAnyList( ) )
		{
			if ( obj instanceof RoutingInfType )
				_routingInfo = ( RoutingInfType )obj;
			else if ( obj instanceof ApplicationInfType )
				_applicationInfo = ( ApplicationInfType )obj;
			else
				processHeaderObject( obj );
		}
	}
	
	protected abstract void processHeaderObject( Object obj );
	
	private void extractDocument( ) 
		throws BaseProcessingException, DatabaseException
	{
		if ( null == _envelope.getBody( ) || null == _envelope.getBody( ).getAnyList( ) ||
			 0 == _envelope.getBody( ).getAnyList( ).size( ) )
			return ;
		
		_document = processDocumentObject( _envelope.getBody( ).getAnyList( ).get( 0 ) );
	}	
	
	public abstract Document processDocumentObject( Object doc ) throws BaseProcessingException, DatabaseException;
	
	public abstract DocumentToCheck getDocumentToCheck( );
	
	public abstract boolean isNeedReciept( );
}
