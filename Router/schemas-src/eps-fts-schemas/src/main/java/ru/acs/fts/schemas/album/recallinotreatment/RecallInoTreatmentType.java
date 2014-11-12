
package ru.acs.fts.schemas.album.recallinotreatment;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;

/** 
 * ����� ���������� �� ����������� ������� ��� ���������� ����������
 */
public class RecallInoTreatmentType extends BaseDocType
{
    private String permitNumber;
    private LocalDate sendDate;
    private LocalDate recallBeginDate;
    private String comments;
    private List<GovermentActType> govermentActList = new ArrayList<GovermentActType>();
    private CustomsType customs;
    private CustomsPersonType customsPerson;
    private String documentModeID;

    /** 
     * Get the 'PermitNumber' element value. ����� ���������� �� ����������� ��� ���������� ����������
     * 
     * @return value
     */
    public String getPermitNumber() {
        return permitNumber;
    }

    /** 
     * Set the 'PermitNumber' element value. ����� ���������� �� ����������� ��� ���������� ����������
     * 
     * @param permitNumber
     */
    public void setPermitNumber(String permitNumber) {
        this.permitNumber = permitNumber;
    }

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
     * Get the 'RecallBeginDate' element value. ���� ���������� � ���� ������
     * 
     * @return value
     */
    public LocalDate getRecallBeginDate() {
        return recallBeginDate;
    }

    /** 
     * Set the 'RecallBeginDate' element value. ���� ���������� � ���� ������
     * 
     * @param recallBeginDate
     */
    public void setRecallBeginDate(LocalDate recallBeginDate) {
        this.recallBeginDate = recallBeginDate;
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
     * Get the list of 'GovermentAct' element items. ��� ������������� ���������� ���������, �� ��������� �������� ���������� ����������
     * 
     * @return list
     */
    public List<GovermentActType> getGovermentActList() {
        return govermentActList;
    }

    /** 
     * Set the list of 'GovermentAct' element items. ��� ������������� ���������� ���������, �� ��������� �������� ���������� ����������
     * 
     * @param list
     */
    public void setGovermentActList(List<GovermentActType> list) {
        govermentActList = list;
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
