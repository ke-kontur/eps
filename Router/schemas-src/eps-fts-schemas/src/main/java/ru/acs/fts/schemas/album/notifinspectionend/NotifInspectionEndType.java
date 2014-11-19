
package ru.acs.fts.schemas.album.notifinspectionend;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * ����������� � ���������� ������������ �������� �������
 */
public class NotifInspectionEndType extends BaseDocType
{
    private LocalDate inspectionEndDate;
    private String inspectionEndTime;
    private String MPONumber;
    private String comments;
    private PersonSignatureType customsPerson;
    private CustomsType customs;
    private String documentModeID;

    /** 
     * Get the 'InspectionEndDate' element value. ���� ���������� ������������ �������� 
     * 
     * @return value
     */
    public LocalDate getInspectionEndDate() {
        return inspectionEndDate;
    }

    /** 
     * Set the 'InspectionEndDate' element value. ���� ���������� ������������ �������� 
     * 
     * @param inspectionEndDate
     */
    public void setInspectionEndDate(LocalDate inspectionEndDate) {
        this.inspectionEndDate = inspectionEndDate;
    }

    /** 
     * Get the 'InspectionEndTime' element value. ����� ���������� ������������ �������� 
     * 
     * @return value
     */
    public String getInspectionEndTime() {
        return inspectionEndTime;
    }

    /** 
     * Set the 'InspectionEndTime' element value. ����� ���������� ������������ �������� 
     * 
     * @param inspectionEndTime
     */
    public void setInspectionEndTime(String inspectionEndTime) {
        this.inspectionEndTime = inspectionEndTime;
    }

    /** 
     * Get the 'MPO_Number' element value. ����� ���
     * 
     * @return value
     */
    public String getMPONumber() {
        return MPONumber;
    }

    /** 
     * Set the 'MPO_Number' element value. ����� ���
     * 
     * @param MPONumber
     */
    public void setMPONumber(String MPONumber) {
        this.MPONumber = MPONumber;
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
    public PersonSignatureType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. ����������� ���� ����������� ������
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(PersonSignatureType customsPerson) {
        this.customsPerson = customsPerson;
    }

    /** 
     * Get the 'Customs' element value. �������� � ���������� ������
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. �������� � ���������� ������
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
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
