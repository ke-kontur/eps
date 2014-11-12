
package ru.acs.fts.schemas.album.inventoryin;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * ������ � ������������� �������������� ���������� 
 */
public class RequestType
{
    private String requestNumber;
    private LocalDate requestDate;
    private String customsCode;
    private LocalDate submitDate;
    private LocalDate sendDate;
    private LocalDate receiveDate;
    private String personName;
    private CustomsPersonType customsPerson;
    private AddressType address;
    private List<RequestDocumentType> requestDocumentList = new ArrayList<RequestDocumentType>();
    private List<CommunicationType> communicationList = new ArrayList<CommunicationType>();
    private GTDIDType GTDNumber;

    /** 
     * Get the 'RequestNumber' element value. ���������� ����� ������� �� �� � �������������� �������������� ����������
     * 
     * @return value
     */
    public String getRequestNumber() {
        return requestNumber;
    }

    /** 
     * Set the 'RequestNumber' element value. ���������� ����� ������� �� �� � �������������� �������������� ����������
     * 
     * @param requestNumber
     */
    public void setRequestNumber(String requestNumber) {
        this.requestNumber = requestNumber;
    }

    /** 
     * Get the 'RequestDate' element value. ���� ������������ �������
     * 
     * @return value
     */
    public LocalDate getRequestDate() {
        return requestDate;
    }

    /** 
     * Set the 'RequestDate' element value. ���� ������������ �������
     * 
     * @param requestDate
     */
    public void setRequestDate(LocalDate requestDate) {
        this.requestDate = requestDate;
    }

    /** 
     * Get the 'CustomsCode' element value. ��� ����������� ������, �������������� ���������
     * 
     * @return value
     */
    public String getCustomsCode() {
        return customsCode;
    }

    /** 
     * Set the 'CustomsCode' element value. ��� ����������� ������, �������������� ���������
     * 
     * @param customsCode
     */
    public void setCustomsCode(String customsCode) {
        this.customsCode = customsCode;
    }

    /** 
     * Get the 'SubmitDate' element value. ���� ������������� ����������
     * 
     * @return value
     */
    public LocalDate getSubmitDate() {
        return submitDate;
    }

    /** 
     * Set the 'SubmitDate' element value. ���� ������������� ����������
     * 
     * @param submitDate
     */
    public void setSubmitDate(LocalDate submitDate) {
        this.submitDate = submitDate;
    }

    /** 
     * Get the 'SendDate' element value. ���� ����������� �������
     * 
     * @return value
     */
    public LocalDate getSendDate() {
        return sendDate;
    }

    /** 
     * Set the 'SendDate' element value. ���� ����������� �������
     * 
     * @param sendDate
     */
    public void setSendDate(LocalDate sendDate) {
        this.sendDate = sendDate;
    }

    /** 
     * Get the 'ReceiveDate' element value. ���� ��������� �������
     * 
     * @return value
     */
    public LocalDate getReceiveDate() {
        return receiveDate;
    }

    /** 
     * Set the 'ReceiveDate' element value. ���� ��������� �������
     * 
     * @param receiveDate
     */
    public void setReceiveDate(LocalDate receiveDate) {
        this.receiveDate = receiveDate;
    }

    /** 
     * Get the 'PersonName' element value. ��� ����, ����������� / ���������� ������
     * 
     * @return value
     */
    public String getPersonName() {
        return personName;
    }

    /** 
     * Set the 'PersonName' element value. ��� ����, ����������� / ���������� ������
     * 
     * @param personName
     */
    public void setPersonName(String personName) {
        this.personName = personName;
    }

    /** 
     * Get the 'CustomsPerson' element value. ����������� ����, ���������� ������.
     * 
     * @return value
     */
    public CustomsPersonType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. ����������� ����, ���������� ������.
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(CustomsPersonType customsPerson) {
        this.customsPerson = customsPerson;
    }

    /** 
     * Get the 'Address' element value. �����
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. �����
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
    }

    /** 
     * Get the list of 'RequestDocument' element items. ���������
     * 
     * @return list
     */
    public List<RequestDocumentType> getRequestDocumentList() {
        return requestDocumentList;
    }

    /** 
     * Set the list of 'RequestDocument' element items. ���������
     * 
     * @param list
     */
    public void setRequestDocumentList(List<RequestDocumentType> list) {
        requestDocumentList = list;
    }

    /** 
     * Get the list of 'Communication' element items. �������� �����
     * 
     * @return list
     */
    public List<CommunicationType> getCommunicationList() {
        return communicationList;
    }

    /** 
     * Set the list of 'Communication' element items. �������� �����
     * 
     * @param list
     */
    public void setCommunicationList(List<CommunicationType> list) {
        communicationList = list;
    }

    /** 
     * Get the 'GTDNumber' element value. ���������� ����� ��
     * 
     * @return value
     */
    public GTDIDType getGTDNumber() {
        return GTDNumber;
    }

    /** 
     * Set the 'GTDNumber' element value. ���������� ����� ��
     * 
     * @param GTDNumber
     */
    public void setGTDNumber(GTDIDType GTDNumber) {
        this.GTDNumber = GTDNumber;
    }
}
