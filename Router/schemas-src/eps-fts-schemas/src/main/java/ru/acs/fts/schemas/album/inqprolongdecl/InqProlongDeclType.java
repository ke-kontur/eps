
package ru.acs.fts.schemas.album.inqprolongdecl;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;

/** 
 * ��������� �� ��������� ����� ������ ����������/������ � ����������� �������� ����� ���������� ��������
 */
public class InqProlongDeclType extends BaseDocType
{
    private LocalDate sendDate;
    private String sendTime;
    private LocalDate suggDate;
    private String docSign;
    private List<ReasonType> reasonList = new ArrayList<ReasonType>();
    private OrganizationType applicant;
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
     * Get the 'SuggDate' element value. ������������ ����
     * 
     * @return value
     */
    public LocalDate getSuggDate() {
        return suggDate;
    }

    /** 
     * Set the 'SuggDate' element value. ������������ ����
     * 
     * @param suggDate
     */
    public void setSuggDate(LocalDate suggDate) {
        this.suggDate = suggDate;
    }

    /** 
     * Get the 'DocSign' element value. ������� ���������: 0 - ��������� �� ��������� ����� ������ ����������; 1 - ������ � ����������� �������� ����� ���������� ��������
     * 
     * @return value
     */
    public String getDocSign() {
        return docSign;
    }

    /** 
     * Set the 'DocSign' element value. ������� ���������: 0 - ��������� �� ��������� ����� ������ ����������; 1 - ������ � ����������� �������� ����� ���������� ��������
     * 
     * @param docSign
     */
    public void setDocSign(String docSign) {
        this.docSign = docSign;
    }

    /** 
     * Get the list of 'Reason' element items. �������
     * 
     * @return list
     */
    public List<ReasonType> getReasonList() {
        return reasonList;
    }

    /** 
     * Set the list of 'Reason' element items. �������
     * 
     * @param list
     */
    public void setReasonList(List<ReasonType> list) {
        reasonList = list;
    }

    /** 
     * Get the 'Applicant' element value. �������� � ���������
     * 
     * @return value
     */
    public OrganizationType getApplicant() {
        return applicant;
    }

    /** 
     * Set the 'Applicant' element value. �������� � ���������
     * 
     * @param applicant
     */
    public void setApplicant(OrganizationType applicant) {
        this.applicant = applicant;
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
