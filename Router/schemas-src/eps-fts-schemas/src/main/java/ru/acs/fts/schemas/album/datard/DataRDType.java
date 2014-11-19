
package ru.acs.fts.schemas.album.datard;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * �������� �������������� ����������
 */
public class DataRDType extends BaseDocType
{
    private String BDRDID;
    private String documentCode;
    private String documentNumber;
    private LocalDate issueDate;
    private int choiceSelect = -1;
    private static final int QUOTA_CHOICE = 0;
    private static final int NOT_QUOTA_CHOICE = 1;
    private QuotaType quota;
    private NotQuotaType notQuota;
    private String documentModeID;

    /** 
     * Get the 'BDRDID' element value. ���������� ����� �� �� ��
     * 
     * @return value
     */
    public String getBDRDID() {
        return BDRDID;
    }

    /** 
     * Set the 'BDRDID' element value. ���������� ����� �� �� ��
     * 
     * @param BDRDID
     */
    public void setBDRDID(String BDRDID) {
        this.BDRDID = BDRDID;
    }

    /** 
     * Get the 'DocumentCode' element value. ��� ���� ���������
     * 
     * @return value
     */
    public String getDocumentCode() {
        return documentCode;
    }

    /** 
     * Set the 'DocumentCode' element value. ��� ���� ���������
     * 
     * @param documentCode
     */
    public void setDocumentCode(String documentCode) {
        this.documentCode = documentCode;
    }

    /** 
     * Get the 'DocumentNumber' element value. ����� ���������
     * 
     * @return value
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /** 
     * Set the 'DocumentNumber' element value. ����� ���������
     * 
     * @param documentNumber
     */
    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    /** 
     * Get the 'IssueDate' element value. ���� ������ ���������
     * 
     * @return value
     */
    public LocalDate getIssueDate() {
        return issueDate;
    }

    /** 
     * Set the 'IssueDate' element value. ���� ������ ���������
     * 
     * @param issueDate
     */
    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    private void setChoiceSelect(int choice) {
        if (choiceSelect == -1) {
            choiceSelect = choice;
        } else if (choiceSelect != choice) {
            throw new IllegalStateException(
                    "Need to call clearChoiceSelect() before changing existing choice");
        }
    }

    /** 
     * Clear the choice selection.
     */
    public void clearChoiceSelect() {
        choiceSelect = -1;
    }

    /** 
     * Check if Quota is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifQuota() {
        return choiceSelect == QUOTA_CHOICE;
    }

    /** 
     * Get the 'Quota' element value. ����������� ���������
     * 
     * @return value
     */
    public QuotaType getQuota() {
        return quota;
    }

    /** 
     * Set the 'Quota' element value. ����������� ���������
     * 
     * @param quota
     */
    public void setQuota(QuotaType quota) {
        setChoiceSelect(QUOTA_CHOICE);
        this.quota = quota;
    }

    /** 
     * Check if NotQuota is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifNotQuota() {
        return choiceSelect == NOT_QUOTA_CHOICE;
    }

    /** 
     * Get the 'NotQuota' element value. ������������� ���������
     * 
     * @return value
     */
    public NotQuotaType getNotQuota() {
        return notQuota;
    }

    /** 
     * Set the 'NotQuota' element value. ������������� ���������
     * 
     * @param notQuota
     */
    public void setNotQuota(NotQuotaType notQuota) {
        setChoiceSelect(NOT_QUOTA_CHOICE);
        this.notQuota = notQuota;
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
