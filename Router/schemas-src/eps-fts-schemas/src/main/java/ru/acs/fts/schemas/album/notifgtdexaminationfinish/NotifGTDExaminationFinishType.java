
package ru.acs.fts.schemas.album.notifgtdexaminationfinish;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * ����������� �� ��������� �������� ��
 */
public class NotifGTDExaminationFinishType extends BaseDocType
{
    private LocalDate examFinishDate;
    private String examFinishTime;
    private String comments;
    private CustomsPersonType customsPerson;
    private CustomsType customs;
    private GTDIDType GTDID;
    private String documentModeID;

    /** 
     * Get the 'ExamFinishDate' element value. ���� ��������� ��������
     * 
     * @return value
     */
    public LocalDate getExamFinishDate() {
        return examFinishDate;
    }

    /** 
     * Set the 'ExamFinishDate' element value. ���� ��������� ��������
     * 
     * @param examFinishDate
     */
    public void setExamFinishDate(LocalDate examFinishDate) {
        this.examFinishDate = examFinishDate;
    }

    /** 
     * Get the 'ExamFinishTime' element value. ����� ��������� ��������
     * 
     * @return value
     */
    public String getExamFinishTime() {
        return examFinishTime;
    }

    /** 
     * Set the 'ExamFinishTime' element value. ����� ��������� ��������
     * 
     * @param examFinishTime
     */
    public void setExamFinishTime(String examFinishTime) {
        this.examFinishTime = examFinishTime;
    }

    /** 
     * Get the 'Comments' element value. �����������.
     * 
     * @return value
     */
    public String getComments() {
        return comments;
    }

    /** 
     * Set the 'Comments' element value. �����������.
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
