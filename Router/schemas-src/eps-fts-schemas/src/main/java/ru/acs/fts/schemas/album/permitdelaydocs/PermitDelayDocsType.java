
package ru.acs.fts.schemas.album.permitdelaydocs;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * ���������� ������������� ���������� � ������������� ����
 */
public class PermitDelayDocsType extends BaseDocType
{
    private LocalDate sendDate;
    private String sendTime;
    private String comments;
    private List<DelayedDocsType> delayedDocList = new ArrayList<DelayedDocsType>();
    private CustomsType customs;
    private CustomsPersonType customsPerson;
    private GTDIDType GTDNumber;
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
     * Get the 'SendTime' element value. ����� �����������
     * 
     * @return value
     */
    public String getSendTime() {
        return sendTime;
    }

    /** 
     * Set the 'SendTime' element value. ����� �����������
     * 
     * @param sendTime
     */
    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
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
     * Get the list of 'DelayedDocs' element items. ������� �� ����������
     * 
     * @return list
     */
    public List<DelayedDocsType> getDelayedDocList() {
        return delayedDocList;
    }

    /** 
     * Set the list of 'DelayedDocs' element items. ������� �� ����������
     * 
     * @param list
     */
    public void setDelayedDocList(List<DelayedDocsType> list) {
        delayedDocList = list;
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
