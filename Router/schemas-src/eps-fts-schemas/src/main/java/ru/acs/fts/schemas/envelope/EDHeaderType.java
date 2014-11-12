
package ru.acs.fts.schemas.envelope;

/** 
 * Заголовок для ЭПС
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:Envelope:EDHeader:2.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="EDHeaderType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="MessageType"/>
 *     &lt;xs:element type="xs:string" name="ProccessID" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="ParticipantID" minOccurs="0"/>
 *     &lt;xs:element type="ns:CustomsType" name="SenderCustoms" minOccurs="0"/>
 *     &lt;xs:element type="ns:CustomsType" name="ReceiverCustoms" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class EDHeaderType
{
    private String messageType;
    private String proccessID;
    private String participantID;
    private CustomsType senderCustoms;
    private CustomsType receiverCustoms;

    /** 
     * Get the 'MessageType' element value. Тип сообщения. (ED.nnnnn, MSG.nnnnn, т.д.)
     * 
     * @return value
     */
    public String getMessageType() {
        return messageType;
    }

    /** 
     * Set the 'MessageType' element value. Тип сообщения. (ED.nnnnn, MSG.nnnnn, т.д.)
     * 
     * @param messageType
     */
    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    /** 
     * Get the 'ProccessID' element value. Уникальный идентификатор процесса.
     * 
     * @return value
     */
    public String getProccessID() {
        return proccessID;
    }

    /** 
     * Set the 'ProccessID' element value. Уникальный идентификатор процесса.
     * 
     * @param proccessID
     */
    public void setProccessID(String proccessID) {
        this.proccessID = proccessID;
    }

    /** 
     * Get the 'ParticipantID' element value. Идентификатор внешнего участника обмена
     * 
     * @return value
     */
    public String getParticipantID() {
        return participantID;
    }

    /** 
     * Set the 'ParticipantID' element value. Идентификатор внешнего участника обмена
     * 
     * @param participantID
     */
    public void setParticipantID(String participantID) {
        this.participantID = participantID;
    }

    /** 
     * Get the 'SenderCustoms' element value. Таможенный орган  - отправитель  сообщения
     * 
     * @return value
     */
    public CustomsType getSenderCustoms() {
        return senderCustoms;
    }

    /** 
     * Set the 'SenderCustoms' element value. Таможенный орган  - отправитель  сообщения
     * 
     * @param senderCustoms
     */
    public void setSenderCustoms(CustomsType senderCustoms) {
        this.senderCustoms = senderCustoms;
    }

    /** 
     * Get the 'ReceiverCustoms' element value. Таможенный орган -  получатель сообщения
     * 
     * @return value
     */
    public CustomsType getReceiverCustoms() {
        return receiverCustoms;
    }

    /** 
     * Set the 'ReceiverCustoms' element value. Таможенный орган -  получатель сообщения
     * 
     * @param receiverCustoms
     */
    public void setReceiverCustoms(CustomsType receiverCustoms) {
        this.receiverCustoms = receiverCustoms;
    }
}
