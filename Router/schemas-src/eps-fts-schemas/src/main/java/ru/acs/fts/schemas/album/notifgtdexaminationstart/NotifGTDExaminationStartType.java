
package ru.acs.fts.schemas.album.notifgtdexaminationstart;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * ����������� � ������ �������� ��.
 */
public class NotifGTDExaminationStartType extends BaseDocType
{
    private LocalDate controlStartDate;
    private String controlStartTime;
    private String comments;
    private CustomsPersonType customsPerson;
    private CustomsType customs;
    private GTDIDType GTDID;
    private String documentModeID;

    /** 
     * Get the 'ControlStartDate' element value. ���� ������ ��������
     * 
     * @return value
     */
    public LocalDate getControlStartDate() {
        return controlStartDate;
    }

    /** 
     * Set the 'ControlStartDate' element value. ���� ������ ��������
     * 
     * @param controlStartDate
     */
    public void setControlStartDate(LocalDate controlStartDate) {
        this.controlStartDate = controlStartDate;
    }

    /** 
     * Get the 'ControlStartTime' element value. ����� ������ ��������
     * 
     * @return value
     */
    public String getControlStartTime() {
        return controlStartTime;
    }

    /** 
     * Set the 'ControlStartTime' element value. ����� ������ ��������
     * 
     * @param controlStartTime
     */
    public void setControlStartTime(String controlStartTime) {
        this.controlStartTime = controlStartTime;
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
     * Get the 'GTDID' element value. ��������������� ����� ��.
     * 
     * @return value
     */
    public GTDIDType getGTDID() {
        return GTDID;
    }

    /** 
     * Set the 'GTDID' element value. ��������������� ����� ��.
     * 
     * @param GTDID
     */
    public void setGTDID(GTDIDType GTDID) {
        this.GTDID = GTDID;
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
