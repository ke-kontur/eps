
package ru.acs.fts.schemas.admin.orgdbload;

import java.math.BigDecimal;

/** 
 * Информация  о точках  подключения
 */
public class PtpcInfoType
{
    private String participantID;
    private Boolean EMailFlag;
    private String protocol;
    private String PTPCName;
    private String transferType;
    private String comments;
    private String brokerID;
    private String IPSID;
    private String address;
    private BigDecimal SVXSign;
    private String SVXID;
    private DocumentGroundConnectionType groundConnectionPtpc;

    /** 
     * Get the 'ParticipantID' element value. Идентификатор точки подключеня
     * 
     * @return value
     */
    public String getParticipantID() {
        return participantID;
    }

    /** 
     * Set the 'ParticipantID' element value. Идентификатор точки подключеня
     * 
     * @param participantID
     */
    public void setParticipantID(String participantID) {
        this.participantID = participantID;
    }

    /** 
     * Get the 'E_mailFlag' element value. Признак использования электронного ящика оператора(0- не использовать, 1- использовать элек ящик оператора)
     * 
     * @return value
     */
    public Boolean getEMailFlag() {
        return EMailFlag;
    }

    /** 
     * Set the 'E_mailFlag' element value. Признак использования электронного ящика оператора(0- не использовать, 1- использовать элек ящик оператора)
     * 
     * @param EMailFlag
     */
    public void setEMailFlag(Boolean EMailFlag) {
        this.EMailFlag = EMailFlag;
    }

    /** 
     * Get the 'Protocol' element value. Протокол передачи сообщений('smtp'- smtp, 'mq'- MQ)
     * 
     * @return value
     */
    public String getProtocol() {
        return protocol;
    }

    /** 
     * Set the 'Protocol' element value. Протокол передачи сообщений('smtp'- smtp, 'mq'- MQ)
     * 
     * @param protocol
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /** 
     * Get the 'PTPC_Name' element value. Наименование  точки  подключения
     * 
     * @return value
     */
    public String getPTPCName() {
        return PTPCName;
    }

    /** 
     * Set the 'PTPC_Name' element value. Наименование  точки  подключения
     * 
     * @param PTPCName
     */
    public void setPTPCName(String PTPCName) {
        this.PTPCName = PTPCName;
    }

    /** 
     * Get the 'TransferType' element value. Тип передачи  сообщений (XML/ZIP)
     * 
     * @return value
     */
    public String getTransferType() {
        return transferType;
    }

    /** 
     * Set the 'TransferType' element value. Тип передачи  сообщений (XML/ZIP)
     * 
     * @param transferType
     */
    public void setTransferType(String transferType) {
        this.transferType = transferType;
    }

    /** 
     * Get the 'Comments' element value. Комментарий
     * 
     * @return value
     */
    public String getComments() {
        return comments;
    }

    /** 
     * Set the 'Comments' element value. Комментарий
     * 
     * @param comments
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /** 
     * Get the 'BrokerID' element value. Идентификатор информационного брокера
     * 
     * @return value
     */
    public String getBrokerID() {
        return brokerID;
    }

    /** 
     * Set the 'BrokerID' element value. Идентификатор информационного брокера
     * 
     * @param brokerID
     */
    public void setBrokerID(String brokerID) {
        this.brokerID = brokerID;
    }

    /** 
     * Get the 'IPSID' element value. Идентификатор ИПС ВЭД
     * 
     * @return value
     */
    public String getIPSID() {
        return IPSID;
    }

    /** 
     * Set the 'IPSID' element value. Идентификатор ИПС ВЭД
     * 
     * @param IPSID
     */
    public void setIPSID(String IPSID) {
        this.IPSID = IPSID;
    }

    /** 
     * Get the 'Address' element value. Адрес точки подключения
     * 
     * @return value
     */
    public String getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. Адрес точки подключения
     * 
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /** 
     * Get the 'SVXSign' element value. Признак СВХ.
     * 
     * @return value
     */
    public BigDecimal getSVXSign() {
        return SVXSign;
    }

    /** 
     * Set the 'SVXSign' element value. Признак СВХ.
     * 
     * @param SVXSign
     */
    public void setSVXSign(BigDecimal SVXSign) {
        this.SVXSign = SVXSign;
    }

    /** 
     * Get the 'SVXID' element value. Идентификатор из справочника свидетельств о включении в реестр владельцев СВХ
     * 
     * @return value
     */
    public String getSVXID() {
        return SVXID;
    }

    /** 
     * Set the 'SVXID' element value. Идентификатор из справочника свидетельств о включении в реестр владельцев СВХ
     * 
     * @param SVXID
     */
    public void setSVXID(String SVXID) {
        this.SVXID = SVXID;
    }

    /** 
     * Get the 'GroundConnectionPtpc' element value. Основание для подключения точки 
     * 
     * @return value
     */
    public DocumentGroundConnectionType getGroundConnectionPtpc() {
        return groundConnectionPtpc;
    }

    /** 
     * Set the 'GroundConnectionPtpc' element value. Основание для подключения точки 
     * 
     * @param groundConnectionPtpc
     */
    public void setGroundConnectionPtpc(
            DocumentGroundConnectionType groundConnectionPtpc) {
        this.groundConnectionPtpc = groundConnectionPtpc;
    }
}
