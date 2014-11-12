
package ru.acs.fts.schemas.envelope;

/** 
 * ��������� ��� ���
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
     * Get the 'MessageType' element value. ��� ���������. (ED.nnnnn, MSG.nnnnn, �.�.)
     * 
     * @return value
     */
    public String getMessageType() {
        return messageType;
    }

    /** 
     * Set the 'MessageType' element value. ��� ���������. (ED.nnnnn, MSG.nnnnn, �.�.)
     * 
     * @param messageType
     */
    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    /** 
     * Get the 'ProccessID' element value. ���������� ������������� ��������.
     * 
     * @return value
     */
    public String getProccessID() {
        return proccessID;
    }

    /** 
     * Set the 'ProccessID' element value. ���������� ������������� ��������.
     * 
     * @param proccessID
     */
    public void setProccessID(String proccessID) {
        this.proccessID = proccessID;
    }

    /** 
     * Get the 'ParticipantID' element value. ������������� �������� ��������� ������
     * 
     * @return value
     */
    public String getParticipantID() {
        return participantID;
    }

    /** 
     * Set the 'ParticipantID' element value. ������������� �������� ��������� ������
     * 
     * @param participantID
     */
    public void setParticipantID(String participantID) {
        this.participantID = participantID;
    }

    /** 
     * Get the 'SenderCustoms' element value. ���������� �����  - �����������  ���������
     * 
     * @return value
     */
    public CustomsType getSenderCustoms() {
        return senderCustoms;
    }

    /** 
     * Set the 'SenderCustoms' element value. ���������� �����  - �����������  ���������
     * 
     * @param senderCustoms
     */
    public void setSenderCustoms(CustomsType senderCustoms) {
        this.senderCustoms = senderCustoms;
    }

    /** 
     * Get the 'ReceiverCustoms' element value. ���������� ����� -  ���������� ���������
     * 
     * @return value
     */
    public CustomsType getReceiverCustoms() {
        return receiverCustoms;
    }

    /** 
     * Set the 'ReceiverCustoms' element value. ���������� ����� -  ���������� ���������
     * 
     * @param receiverCustoms
     */
    public void setReceiverCustoms(CustomsType receiverCustoms) {
        this.receiverCustoms = receiverCustoms;
    }
}
