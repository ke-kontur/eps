
package ru.acs.fts.schemas.album.reqinotreatmentdocs;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;

/** 
 * ���������� �� �������������� ������������ ���������, ���������� � �����, ����������� � ��������� �� ����������� ������� ��� ���������� ����������
 */
public class ReqInoTreatmentDocsType extends BaseDocType
{
    private LocalDate sendDate;
    private LocalDate requestDate;
    private LocalDate dateLimit;
    private CustomsType customs;
    private CustomsPersonType customsPerson;
    private List<RequestedDocType> requestedDocList = new ArrayList<RequestedDocType>();
    private List<CommunicationType> communicationList = new ArrayList<CommunicationType>();
    private String documentModeID;

    /** 
     * Get the 'SendDate' element value. ���� �����������
     * 
     * @return value
     */
    public LocalDate getSendDate() {
        return sendDate;
    }

    /** 
     * Set the 'SendDate' element value. ���� �����������
     * 
     * @param sendDate
     */
    public void setSendDate(LocalDate sendDate) {
        this.sendDate = sendDate;
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
     * Get the 'DateLimit' element value. ���� �������������� ����������
     * 
     * @return value
     */
    public LocalDate getDateLimit() {
        return dateLimit;
    }

    /** 
     * Set the 'DateLimit' element value. ���� �������������� ����������
     * 
     * @param dateLimit
     */
    public void setDateLimit(LocalDate dateLimit) {
        this.dateLimit = dateLimit;
    }

    /** 
     * Get the 'Customs' element value. ���������� �����
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. ���������� �����
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'CustomsPerson' element value. ����������� ���� ����������� ������
     * 
     * @return value
     */
    public CustomsPersonType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. ����������� ���� ����������� ������
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(CustomsPersonType customsPerson) {
        this.customsPerson = customsPerson;
    }

    /** 
     * Get the list of 'RequestedDoc' element items. ������������� ��������
     * 
     * @return list
     */
    public List<RequestedDocType> getRequestedDocList() {
        return requestedDocList;
    }

    /** 
     * Set the list of 'RequestedDoc' element items. ������������� ��������
     * 
     * @param list
     */
    public void setRequestedDocList(List<RequestedDocType> list) {
        requestedDocList = list;
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
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
