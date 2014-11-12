package ru.acs.fts.eps2.router.processing;

import ru.acs.fts.eps2.engine.configuration.Configurator;
import ru.acs.fts.eps2.engine.configuration.RtuCodePatternsHolder;
import ru.acs.fts.eps2.model.entities.Edecl_Wmqaddress;

public class EDConfigurator extends Configurator
{
	/**
	 * Настройки соединения с точкой входа 
	 */
	private Edecl_Wmqaddress _extGateTransmitionAddress;
	private String _extGateSmtpAddress;
	private String _extGateWmqAddress;

	/**
	 * Адрес возврата ( ReceiverInformation ) для таможенных органов
	 */
	private String _kastoReceiveAddress;
	
	/**
	 * Адрес возврата ( ReceiverInformation ) для других электричек
	 */
	private String _epsReceiveAddress;
	
	private String _epsSenderAdminExchangeType;
	
	/**
	 * Код ТО электрички
	 */
	private String _epsCustomsCode;
	
	/**
	 * Настройки РЖД-Поллинга
	 */
	private String _rzdPollingTransportServer; 
	private String _rzdPollingSenderTransportAddress; 
	private String _rzdPollingReceiverTransportAddress; 
	private String _rzdPollingParticipantId; 
	private Edecl_Wmqaddress _rzdPollingAddress; 
	
	/**
	 * Балансер
	 */
	private String _balancerQueueManager; 
	private String _balancerHeartbeatQueue;
	private String _balancerEpsQueue;
	
	/**
	 * Настройки виртуального таможенного органа для ASKTT2
	 */
	private String _asktt2CustomsCode;
	private String _asktt2ExchType;
	
	/**
	 * Список масок таможенных органов, которые обслуживаются этой электричкой
	 */
	private RtuCodePatternsHolder _rtuPatternsHolder;
	
	/**
	 * Настройки виртуального таможенного органа для Малахита
	 */
	private String _malakhitCustomsCode;
	private String _malakhitExchType;
	
	/**
	 * Включен ли сервис событий
	 */
	private Boolean _useEventService;
	
	/**
	 * Настройки соединения с админом
	 */
	private String _epsReceiveAdminAddress;
    private String orderCustomsCode;
    private String orderExchType;
    private String payment1CustomsCode;
    private String payment1ExchType;
    private String payment2CustomsCode;
    private String payment2ExchType;

    // @formatter:off
	public Edecl_Wmqaddress getExtGateTransmitionAddress( ) { return _extGateTransmitionAddress; } 
	public void setExtGateTransmitionAddress( Edecl_Wmqaddress externalGateTransmitionAddress ) { _extGateTransmitionAddress = externalGateTransmitionAddress; }
	
	public String getExtGateSmtpAddress( ) { return _extGateSmtpAddress; } 
	public void setExtGateSmtpAddress( String externalGateSmtpAddress ) { _extGateSmtpAddress = externalGateSmtpAddress; }
	
	public String getExtGateWmqAddress( ) { return _extGateWmqAddress; } 
	public void setExtGateWmqAddress( String extGateWmqAddress ) { this._extGateWmqAddress = extGateWmqAddress; }

	public String getKastoReceiveAddress( ) { return _kastoReceiveAddress; } 
	public void setKastoReceiveAddress( String kastoReceiveAddress ) { _kastoReceiveAddress = kastoReceiveAddress; }

	public String getEpsReceiveAddress( ) { return _epsReceiveAddress; } 
	public void setEpsReceiveAddress( String epsReceiveAddress ) { _epsReceiveAddress = epsReceiveAddress; }
	
	public String getEpsSenderAdminExchangeType( ) { return _epsSenderAdminExchangeType; } 
	public void setEpsSenderAdminExchangeType( String epsSenderAdminExchangeType ) { _epsSenderAdminExchangeType = epsSenderAdminExchangeType; }
	
	public String getEpsCustomsCode( ) { return _epsCustomsCode; } 
	public void setEpsCustomsCode( String epsCustomsCode ) { _epsCustomsCode = epsCustomsCode; }
	
	public String getRzdPollingTransportServer( ) { return _rzdPollingTransportServer; } 
	public void setRzdPollingTransportServer( String rzdPollingTransportServer ) { _rzdPollingTransportServer = rzdPollingTransportServer; }
	
	public void setRzdPollingSenderTransportAddress( String rzdPollingSenderTransportAddress ) { _rzdPollingSenderTransportAddress = rzdPollingSenderTransportAddress; }
	public String getRzdPollingSenderTransportAddress( ) { return _rzdPollingSenderTransportAddress; } 
	
	public void setRzdPollingReceiverTransportAddress( String rzdPollingReceiverTransportAddress ) { _rzdPollingReceiverTransportAddress = rzdPollingReceiverTransportAddress; }
	public String getRzdPollingReceiverTransportAddress( ) { return _rzdPollingReceiverTransportAddress; } 
	
	public void setRzdPollingParticipantId( String participantId ) { _rzdPollingParticipantId = participantId; }
	public String getRzdPollingParticipantId( ) { return _rzdPollingParticipantId; } 
	
	public void setRzdPollingAddress( Edecl_Wmqaddress rzdPollingAddress ) { _rzdPollingAddress = rzdPollingAddress; }
	public Edecl_Wmqaddress getRzdPollingAddress( ) { return _rzdPollingAddress; } 
	
	public void setBalancerQueueManager( String balancerQueueManager ) { _balancerQueueManager = balancerQueueManager; }
	public String getBalancerQueueManager( ) { return _balancerQueueManager; } 
	
	public void setBalancerHeartbeatQueue( String balancerHeartbeatQueue ) { _balancerHeartbeatQueue = balancerHeartbeatQueue; }
	public String getBalancerHeartbeatQueue( ) { return _balancerHeartbeatQueue; } 
	
	public void setBalancerEpsQueue( String balancerEpsQueue ) { _balancerEpsQueue = balancerEpsQueue; }
	public String getBalancerEpsQueue( ) { return _balancerEpsQueue; } 
	
	public String getAsktt2CustomsCode( ) { return _asktt2CustomsCode; }
	public void setAsktt2CustomsCode( String asktt2CustomsCode ) { _asktt2CustomsCode = asktt2CustomsCode; }
	
	public String getAsktt2ExchType( ) { return _asktt2ExchType; }
	public void setAsktt2ExchType( String asktt2ExchType ) { _asktt2ExchType = asktt2ExchType; }
	
	public RtuCodePatternsHolder getRtuPatternsHolder( ) { return _rtuPatternsHolder; }
	public void setRtuPatternsHolder( RtuCodePatternsHolder holder ) { _rtuPatternsHolder = holder; }
	
	public String getMalakhitCustomsCode( ) { return _malakhitCustomsCode; }
	public void setMalakhitCustomsCode( String malakhitCustomsCode ) { _malakhitCustomsCode = malakhitCustomsCode; }
	
	public String getMalakhitExchType( ) { return _malakhitExchType; }
	public void setMalakhitExchType( String malakhitExchType ) { _malakhitExchType = malakhitExchType; }
	
	public void setUseEventService( Boolean useEventService ) { _useEventService = useEventService; }
	public Boolean getUseEventService( ) { return _useEventService; }
	
	public String getEpsReceiveAdminAddress( ) { return _epsReceiveAdminAddress; }
	public void setEpsReceiveAdminAddress( String epsReceiveAdminAddress ) { _epsReceiveAdminAddress = epsReceiveAdminAddress; }

    public void setOrderCustomsCode(String orderCustomsCode) {
        this.orderCustomsCode = orderCustomsCode;
    }

    public String getOrderCustomsCode() {
        return orderCustomsCode;
    }

    public void setOrderExchType(String orderExchType) {
        this.orderExchType = orderExchType;
    }

    public String getOrderExchType() {
        return orderExchType;
    }

    public void setPayment1CustomsCode(String payment1CustomsCode) {
        this.payment1CustomsCode = payment1CustomsCode;
    }

    public String getPayment1CustomsCode() {
        return payment1CustomsCode;
    }

    public void setPayment1ExchType(String payment1ExchType) {
        this.payment1ExchType = payment1ExchType;
    }

    public String getPayment1ExchType() {
        return payment1ExchType;
    }

    public void setPayment2CustomsCode(String payment2CustomsCode) {
        this.payment2CustomsCode = payment2CustomsCode;
    }

    public String getPayment2CustomsCode() {
        return payment2CustomsCode;
    }

    public void setPayment2ExchType(String payment2ExchType) {
        this.payment2ExchType = payment2ExchType;
    }

    public String getPayment2ExchType() {
        return payment2ExchType;
    }
    // @formatter:on
}
