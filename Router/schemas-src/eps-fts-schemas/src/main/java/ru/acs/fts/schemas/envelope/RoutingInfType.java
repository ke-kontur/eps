
package ru.acs.fts.schemas.envelope;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/** 
 * ���������� ��� ������������� ���������
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:Envelope:RoutingInf:1.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RoutingInfType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="EnvelopeID"/>
 *     &lt;xs:element type="xs:string" name="InitialEnvelopeID" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="SenderInformation"/>
 *     &lt;xs:element type="xs:string" name="ReceiverInformation" maxOccurs="unbounded"/>
 *     &lt;xs:element type="xs:dateTime" name="PreparationDateTime"/>
 *     &lt;xs:element type="xs:integer" default="4" name="Priority" minOccurs="0"/>
 *     &lt;xs:element type="xs:int" name="Expiration" minOccurs="0"/>
 *     &lt;xs:element type="ns:ConfirmationRequestType" name="ConfirmationRequest" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class RoutingInfType
{
    private String envelopeID;
    private String initialEnvelopeID;
    private String senderInformation;
    private List<String> receiverInformationList = new ArrayList<String>();
    private DateTime preparationDateTime;
    private BigInteger priority;
    private Integer expiration;
    private ConfirmationRequestType confirmationRequest;

    /** 
     * Get the 'EnvelopeID' element value. ������������ ������������� ��������
     * 
     * @return value
     */
    public String getEnvelopeID() {
        return envelopeID;
    }

    /** 
     * Set the 'EnvelopeID' element value. ������������ ������������� ��������
     * 
     * @param envelopeID
     */
    public void setEnvelopeID(String envelopeID) {
        this.envelopeID = envelopeID;
    }

    /** 
     * Get the 'InitialEnvelopeID' element value. ������������ ������������� ��������� ��������
     * 
     * @return value
     */
    public String getInitialEnvelopeID() {
        return initialEnvelopeID;
    }

    /** 
     * Set the 'InitialEnvelopeID' element value. ������������ ������������� ��������� ��������
     * 
     * @param initialEnvelopeID
     */
    public void setInitialEnvelopeID(String initialEnvelopeID) {
        this.initialEnvelopeID = initialEnvelopeID;
    }

    /** 
     * Get the 'SenderInformation' element value. ���������� �� �����������.
     * 
     * @return value
     */
    public String getSenderInformation() {
        return senderInformation;
    }

    /** 
     * Set the 'SenderInformation' element value. ���������� �� �����������.
     * 
     * @param senderInformation
     */
    public void setSenderInformation(String senderInformation) {
        this.senderInformation = senderInformation;
    }

    /** 
     * Get the list of 'ReceiverInformation' element items. ���������� � ����������.
     * 
     * @return list
     */
    public List<String> getReceiverInformationList() {
        return receiverInformationList;
    }

    /** 
     * Set the list of 'ReceiverInformation' element items. ���������� � ����������.
     * 
     * @param list
     */
    public void setReceiverInformationList(List<String> list) {
        receiverInformationList = list;
    }

    /** 
     * Get the 'PreparationDateTime' element value. ���� � ����� �������� ������������ ���������. ����� ����������� �� ��������.
     * 
     * @return value
     */
    public DateTime getPreparationDateTime() {
        return preparationDateTime;
    }

    /** 
     * Set the 'PreparationDateTime' element value. ���� � ����� �������� ������������ ���������. ����� ����������� �� ��������.
     * 
     * @param preparationDateTime
     */
    public void setPreparationDateTime(DateTime preparationDateTime) {
        this.preparationDateTime = preparationDateTime;
    }

    /** 
     * Get the 'Priority' element value. ��������� ���������. (0 - ������ - 9 - �������). �������� �� ��������� - 4
     * 
     * @return value
     */
    public BigInteger getPriority() {
        return priority;
    }

    /** 
     * Set the 'Priority' element value. ��������� ���������. (0 - ������ - 9 - �������). �������� �� ��������� - 4
     * 
     * @param priority
     */
    public void setPriority(BigInteger priority) {
        this.priority = priority;
    }

    /** 
     * Get the 'Expiration' element value. ����� ����� ���������  � �������.
     * 
     * @return value
     */
    public Integer getExpiration() {
        return expiration;
    }

    /** 
     * Set the 'Expiration' element value. ����� ����� ���������  � �������.
     * 
     * @param expiration
     */
    public void setExpiration(Integer expiration) {
        this.expiration = expiration;
    }

    /** 
     * Get the 'ConfirmationRequest' element value. ������ �����������
     * 
     * @return value
     */
    public ConfirmationRequestType getConfirmationRequest() {
        return confirmationRequest;
    }

    /** 
     * Set the 'ConfirmationRequest' element value. ������ �����������
     * 
     * @param confirmationRequest
     */
    public void setConfirmationRequest(
            ConfirmationRequestType confirmationRequest) {
        this.confirmationRequest = confirmationRequest;
    }
}
