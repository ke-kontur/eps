
package ru.acs.fts.schemas.album.notifdiscrepancy;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * ���������� � �������������� ��������, ���������� � ���������� ����������, ���������, ���������� � ���������� ���������� �������������� ���� ����������� �������� (�������, ������)
 */
public class NotifDiscrepancyType extends BaseDocType
{
    private String sendDate;
    private String comments;
    private List<SourceOfInformationType> sourceOfInformationList = new ArrayList<SourceOfInformationType>();
    private CustomsPersonType customsPerson;
    private CustomsType customs;
    private GTDIDType GTDNumber;
    private String documentModeID;

    /** 
     * Get the 'SendDate' element value. ����/����� �������� �����������
     * 
     * @return value
     */
    public String getSendDate() {
        return sendDate;
    }

    /** 
     * Set the 'SendDate' element value. ����/����� �������� �����������
     * 
     * @param sendDate
     */
    public void setSendDate(String sendDate) {
        this.sendDate = sendDate;
    }

    /** 
     * Get the 'Comments' element value. �����������
     * 
     * @return value
     */
    public String getComments() {
        return comments;
    }

    /** 
     * Set the 'Comments' element value. �����������
     * 
     * @param comments
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /** 
     * Get the list of 'SourceOfInformation' element items. ���������� � �������������� �������� (������, ���� ����� �������, ��������)
     * 
     * @return list
     */
    public List<SourceOfInformationType> getSourceOfInformationList() {
        return sourceOfInformationList;
    }

    /** 
     * Set the list of 'SourceOfInformation' element items. ���������� � �������������� �������� (������, ���� ����� �������, ��������)
     * 
     * @param list
     */
    public void setSourceOfInformationList(List<SourceOfInformationType> list) {
        sourceOfInformationList = list;
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
     * Get the 'Customs' element value. ���������� �����.
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. ���������� �����.
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'GTDNumber' element value. ���������� ����� ��.
     * 
     * @return value
     */
    public GTDIDType getGTDNumber() {
        return GTDNumber;
    }

    /** 
     * Set the 'GTDNumber' element value. ���������� ����� ��.
     * 
     * @param GTDNumber
     */
    public void setGTDNumber(GTDIDType GTDNumber) {
        this.GTDNumber = GTDNumber;
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
