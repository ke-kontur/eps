package ru.acs.fts.eps2.router.transport;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;

import ru.acs.fts.eps2.engine.configuration.RtuCodePatternsHolder;
import ru.acs.fts.eps2.engine.data.MessageType;
import ru.acs.fts.eps2.engine.objects.Envelope;
import ru.acs.fts.eps2.engine.persistence.entities.CustomsRouting;
import ru.acs.fts.eps2.engine.transport.AddressFactory;
import ru.acs.fts.eps2.engine.transport.routingInfo.ExternalRoutingInfo;
import ru.acs.fts.eps2.model.entities.Edecl_Wmqaddress;
import ru.acs.fts.eps2.model.entities.ExtRtuRouting;
import ru.acs.fts.eps2.router.defines.BusinessSystems;
import ru.acs.fts.eps2.router.objects.EDEnvelope;
import ru.acs.fts.eps2.router.persistence.operators.CustomsOperator;
import ru.acs.fts.eps2.router.processing.EDConfigurator;
import ru.acs.fts.eps2.util.exceptions.DatabaseException;
import ru.acs.fts.eps2.utils.StringUtil;
import ru.acs.fts.schemas.envelope.CustomsType;

public class EDAddressFactory extends AddressFactory
{
	private final Logger log = LoggerFactory.getLogger( EDAddressFactory.class );

	private static ExternalRoutingInfo _declarantReturnAddress = null;

	private CustomsOperator _customsOperator;

	// @formatter:off
	@Required
	public void setCustomsOperator( CustomsOperator operator ) { _customsOperator = operator; }
	public CustomsOperator getCustomsOperator( ) { return _customsOperator; }
	
	public void setConfigurator( EDConfigurator configurator ) { super.setConfigurator( configurator ); }
	// @formatter:off
	
	public EDAddressFactory( )
	{

	}

	@Override
	public ExternalRoutingInfo getRoutingAddress(
			Envelope receivedEnvelope, Envelope envelopeToSend,
			String senderSystem, String recipientSystem )
		throws Exception
	{
		if ( ! ( receivedEnvelope instanceof EDEnvelope ) )
		{
			// TODO: Подобрать правильный Exception
			throw new Exception( "Тип входящего конверта не верный!" );
		}
		
		if ( ! ( envelopeToSend instanceof EDEnvelope ) )
		{
			// TODO: Подобрать правильный Exception
			throw new Exception( "Тип отправляемого сообщения не верный!" );
		}
		
		return getEDRoutingAddress( 
			( EDEnvelope )receivedEnvelope, ( EDEnvelope )envelopeToSend,
			senderSystem, recipientSystem 
		);
	}
	
	@Override
	public EDConfigurator getConfigurator( )
	{
		return ( EDConfigurator ) super.getConfigurator( );
	}
	
	private ExternalRoutingInfo getEDRoutingAddress(
			EDEnvelope receivedEnvelope, EDEnvelope envelopeToSend,
			String senderSystem, String recipientSystem )
		throws Exception
	{
		if ( BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.DECLARANT ) )
		{
			String participantId = envelopeToSend.getParticipantID( );
			if ( null == participantId )
				participantId = receivedEnvelope.getParticipantID( );
			
			return getDeclarantTransportAddress( participantId );
		}
		else if ( BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.CUSTOMS) ||
				BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.ADMIN ) )
		{
			return getCustomsTransportAddress( receivedEnvelope, envelopeToSend );
		}
		else if ( BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.EPS ) )
		{
			return getEpsTransportAddress( receivedEnvelope, envelopeToSend );
		}
		else if ( BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.RZD ) )
		{
			return getRzdTransportAddress( );
		}
		else if ( BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.ASKTT2 ) )
		{
			return getAsktt2TransportAddress( );
		}
		else if ( BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.MALAKHIT ) )
		{
			return getMalakhitTransportAddress( );
		}
        else if ( BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.ORDER ) )
        {
            return getOrderTransportAddress( );
        }
        else if ( BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.PAYMENT1 ) )
        {
            return getPayment1TransportAddress( );
        }
        else if ( BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.PAYMENT2 ) )
        {
            return getPayment2TransportAddress( );
        }
		else if ( BusinessSystems.isSuchSystem( recipientSystem, BusinessSystems.BALANCER ) )
		{
			String messageType = envelopeToSend.getMessageType( );
			
			return getBalancerTransportAddress( messageType );
		}
		
		// Мы не нашли совпадений, которые мы может отрабатывать, поэтому увы ...
		return null;
	}	

	private ExternalRoutingInfo getCustomsTransportAddress( 
			EDEnvelope receivedEnvelope, EDEnvelope envelopeToSend )
		throws Exception
	{		
		CustomsType receiverCustoms = envelopeToSend.getReceiverCustoms( );
		
		if ( null == receiverCustoms || null == receiverCustoms.getCustomsCode( ) || null == receiverCustoms.getExchType( ) )
			receiverCustoms = receivedEnvelope.getReceiverCustoms( );
		
		if ( null == receiverCustoms || null == receiverCustoms.getCustomsCode( ) || null == receiverCustoms.getExchType( ) )
		{
			String envelopeId = envelopeToSend.getEnvelopeID( );
			if ( StringUtil.isNullOrEmpty( envelopeId ) )
				envelopeId = receivedEnvelope.getEnvelopeID( );
			if ( StringUtil.isNullOrEmpty( envelopeId ) )
				envelopeId = "<unknown>";
			
			// TODO: Подобрать правильный Exception
			throw new Exception( String.format(
				"Не задан ReceiverCustoms в сообщении для таможни (EnvelopeID = %s)",
				envelopeId
			) );
		}
		
		return getCustomsTransportAddress( 
			receiverCustoms.getCustomsCode( ), 
			Integer.parseInt( receiverCustoms.getExchType( ) )
		);		
	}
		
	private ExternalRoutingInfo getCustomsTransportAddress( String customsCode, int exchType ) 
		throws DatabaseException
	{
		if ( null == customsCode )
			return null;
				
		CustomsRouting routing = _customsOperator.getCustomsRouting( customsCode, Integer.toString( exchType ) );
		if ( null == routing )
		{
			log.error( String.format(
				"Не удалось найти данные для поста %s %s", 
				customsCode, exchType
			) );
			
			return null;
		}
			
		return getTransportAddressFromCustomsRouting( routing );
	}
	
	private ExternalRoutingInfo getTransportAddressFromCustomsRouting( CustomsRouting routing )
	{
		return new ExternalRoutingInfo(
			routing.getTransportServer( ),
			routing.getLocalManager( ),
			routing.getLocalQueue( ),
			null, 0,
			routing.getRemoteManager( ),
			routing.getRemoteQueue( )
		);
	}

	private ExternalRoutingInfo getEpsTransportAddress( 
			EDEnvelope receivedEnvelope, EDEnvelope envelopeToSend )
		throws Exception
	{
		CustomsType receiverCustoms = envelopeToSend.getReceiverCustoms( );
		
		if ( null == receiverCustoms || null == receiverCustoms.getCustomsCode( ) || null == receiverCustoms.getExchType( ) )
			receiverCustoms = receivedEnvelope.getReceiverCustoms( );
		
		if ( null == receiverCustoms || null == receiverCustoms.getCustomsCode( ) || null == receiverCustoms.getExchType( ) )
		{
			String envelopeId = envelopeToSend.getEnvelopeID( );
			if ( StringUtil.isNullOrEmpty( envelopeId ) )
				envelopeId = receivedEnvelope.getEnvelopeID( );
			if ( StringUtil.isNullOrEmpty( envelopeId ) )
				envelopeId = "<unknown>";
			
			// TODO: Подобрать правильный Exception
			throw new Exception( String.format(
				"Не задан ReceiverCustoms в сообщении для АПС ЭПС другого управления (EnvelopeID = %s)",
				envelopeId
			) );
		}
		
		return getEpsTransportAddress( 
			receiverCustoms.getCustomsCode( ), 
			Integer.parseInt( receiverCustoms.getExchType( ) )
		);				
	}
	
	private ExternalRoutingInfo getEpsTransportAddress( String customsCode, int exchType )
	{
		if ( StringUtil.isNullOrEmpty( customsCode ) || exchType <= 0 )
			return null;
		
		/**
		 * Проверяем, не себе ли хотим отправлять?
		 * Если себе - то это глупо
		 */
		RtuCodePatternsHolder rtuCodes = getConfigurator( ).getRtuPatternsHolder( );
		if ( rtuCodes.match( customsCode ) )
			return null;
		
		ExtRtuRouting routing = null;
		try
		{
			routing = _customsOperator.getExternalRouting( customsCode, exchType );
			if ( null == routing )
				throw new NullPointerException( );
		}
		catch ( Exception exc )
		{
			log.error( String.format(
				"Не удалось найти данные для отправки в удаленное РТУ по коду ТО: %s и коду обмена %d\n%s",
				customsCode, exchType, exc.toString( )
			) );
			return null;
		}
		
		Edecl_Wmqaddress wmqAddress = null;
		try
		{
			wmqAddress = _customsOperator.getWmqAddressService( ).get( routing.getWmqAddress( ) );
			if ( null == wmqAddress )
				throw new NullPointerException( );
		}
		catch ( Exception exc )
		{
			log.error( String.format(
				"Не удалось найти транспортный адрес для отправки в удаленное РТУ, номер: %d",
				routing.getWmqAddress( )
			) );
			return null;
		}
		
		return new ExternalRoutingInfo(
			wmqAddress.getTransportServer( ),
			wmqAddress.getLocalManager( ),
			wmqAddress.getLocalQueue( ),
			null, 0,
			wmqAddress.getRemoteManager( ),
			wmqAddress.getRemoteQueue( )
		);
	}
	
	private ExternalRoutingInfo getDeclarantTransportAddress( String participantId )
	{
		if ( null == participantId )
			return null;		
		
		if ( null == _declarantReturnAddress )
		{
			Edecl_Wmqaddress extGateTransmitionAddress = getConfigurator( ).getExtGateTransmitionAddress( );
			
			_declarantReturnAddress = new ExternalRoutingInfo(
				extGateTransmitionAddress.getTransportServer( ),
				extGateTransmitionAddress.getLocalManager( ),
				extGateTransmitionAddress.getLocalQueue( ), 
				null, 0,
				extGateTransmitionAddress.getRemoteManager( ),
				extGateTransmitionAddress.getRemoteQueue( ) 
			);
		}
		
		return _declarantReturnAddress;		
	}
		
	private ExternalRoutingInfo getAsktt2TransportAddress( ) 
		throws NumberFormatException, DatabaseException
	{
		return getCustomsTransportAddress(
			getConfigurator( ).getAsktt2CustomsCode( ),
			Integer.parseInt( getConfigurator( ).getAsktt2ExchType( ) )
		);
	}
	
	private ExternalRoutingInfo getMalakhitTransportAddress( ) 
		throws NumberFormatException, DatabaseException
	{
		return getCustomsTransportAddress( 
			getConfigurator( ).getMalakhitCustomsCode( ), 
			Integer.parseInt( getConfigurator( ).getMalakhitExchType( ) ) 
		);
	}

    private ExternalRoutingInfo getOrderTransportAddress( )
            throws NumberFormatException, DatabaseException
    {
        return getCustomsTransportAddress(
                getConfigurator( ).getOrderCustomsCode( ),
                Integer.parseInt( getConfigurator( ).getOrderExchType( ) )
        );
    }

    private ExternalRoutingInfo getPayment1TransportAddress( )
            throws NumberFormatException, DatabaseException
    {
        return getCustomsTransportAddress(
                getConfigurator( ).getPayment1CustomsCode( ),
                Integer.parseInt( getConfigurator( ).getPayment1ExchType( ) )
        );
    }

    private ExternalRoutingInfo getPayment2TransportAddress( )
            throws NumberFormatException, DatabaseException
    {
        return getCustomsTransportAddress(
                getConfigurator( ).getPayment2CustomsCode( ),
                Integer.parseInt( getConfigurator( ).getPayment2ExchType( ) )
        );
    }
	
	private ExternalRoutingInfo getBalancerTransportAddress( String messageType )
	{
		/**
		 * mrdekk: Стоит отметить следующий факт, радиобмен в сторону балансера производится
		 * с частичным использованием настроек радиобмена с РЖД. Эти настройки на обмен с
		 * балансером никак не влиюят, но используются.
		 * Если когда-то придется их удалять, то надо заменить на аналогичные для балансера.
		 */

		Edecl_Wmqaddress rzdPollingAddress = getConfigurator( ).getRzdPollingAddress( );
		
		String balancerQueue = getConfigurator( ).getBalancerEpsQueue( );
		if ( messageType.equalsIgnoreCase( MessageType.PVR_00003 ) )
			balancerQueue = getConfigurator( ).getBalancerHeartbeatQueue( );
		
		return new ExternalRoutingInfo(
			getConfigurator( ).getRzdPollingTransportServer( ),
			rzdPollingAddress.getLocalManager( ),
			rzdPollingAddress.getLocalQueue( ), null, 0,
			getConfigurator( ).getBalancerQueueManager( ),
			balancerQueue
		);
	}
	
	private ExternalRoutingInfo getRzdTransportAddress( )
	{
		Edecl_Wmqaddress rzdPollingAddress = getConfigurator( ).getRzdPollingAddress( );
		
		return new ExternalRoutingInfo(
			getConfigurator( ).getRzdPollingTransportServer( ),
			rzdPollingAddress.getLocalManager( ),
			rzdPollingAddress.getLocalQueue( ), 
			null, 0,
			rzdPollingAddress.getRemoteManager( ),
			rzdPollingAddress.getRemoteQueue( )
		);
	}
}
