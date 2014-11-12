
package ru.acs.fts.schemas.album.prolongcancelnotif;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;

/** 
 * ��������� �� ��������� �����/�� �������������/������� � ��������� ����� ��������
 */
public class ProlongCancelNotifType extends BaseDocType
{
    private String prolongDate;
    private String docSign;
    private List<String> reasonList = new ArrayList<String>();
    private ApplicationRegNumberType applicationRegNumber;
    private ApplicantType applicant;
    private CustomsType customs;
    private CustomsPersonType customsPerson;
    private String documentModeID;

    /** 
     * Get the 'ProlongDate' element value. ����� ���� 
     * 
     * @return value
     */
    public String getProlongDate() {
        return prolongDate;
    }

    /** 
     * Set the 'ProlongDate' element value. ����� ���� 
     * 
     * @param prolongDate
     */
    public void setProlongDate(String prolongDate) {
        this.prolongDate = prolongDate;
    }

    /** 
     * Get the 'DocSign' element value. ������� ���������: 1 - ��������� � ��������� �����; 2 - ��������� �� ������������� ����������; 3 - ������� � ��������� ����� ��������
     * 
     * @return value
     */
    public String getDocSign() {
        return docSign;
    }

    /** 
     * Set the 'DocSign' element value. ������� ���������: 1 - ��������� � ��������� �����; 2 - ��������� �� ������������� ����������; 3 - ������� � ��������� ����� ��������
     * 
     * @param docSign
     */
    public void setDocSign(String docSign) {
        this.docSign = docSign;
    }

    /** 
     * Get the list of 'Reasons' element items. �������
     * 
     * @return list
     */
    public List<String> getReasonList() {
        return reasonList;
    }

    /** 
     * Set the list of 'Reasons' element items. �������
     * 
     * @param list
     */
    public void setReasonList(List<String> list) {
        reasonList = list;
    }

    /** 
     * Get the 'ApplicationRegNumber' element value. ��������������� ����� ��������� �� �����������/���������� �� ������
     * 
     * @return value
     */
    public ApplicationRegNumberType getApplicationRegNumber() {
        return applicationRegNumber;
    }

    /** 
     * Set the 'ApplicationRegNumber' element value. ��������������� ����� ��������� �� �����������/���������� �� ������
     * 
     * @param applicationRegNumber
     */
    public void setApplicationRegNumber(
            ApplicationRegNumberType applicationRegNumber) {
        this.applicationRegNumber = applicationRegNumber;
    }

    /** 
     * Get the 'Applicant' element value. ���������
     * 
     * @return value
     */
    public ApplicantType getApplicant() {
        return applicant;
    }

    /** 
     * Set the 'Applicant' element value. ���������
     * 
     * @param applicant
     */
    public void setApplicant(ApplicantType applicant) {
        this.applicant = applicant;
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
