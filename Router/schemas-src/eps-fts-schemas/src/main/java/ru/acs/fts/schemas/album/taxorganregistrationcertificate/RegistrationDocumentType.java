
package ru.acs.fts.schemas.album.taxorganregistrationcertificate;

import org.joda.time.LocalDate;

/** 
 * �������� � ����������, �������������� �������� ������������ ���� � �� ��������� ������� �������� �������������
 */
public class RegistrationDocumentType
{
    private LocalDate issueDate;
    private String documentName;

    /** 
     * Get the 'IssueDate' element value. ���� ����������� ���������
     * 
     * @return value
     */
    public LocalDate getIssueDate() {
        return issueDate;
    }

    /** 
     * Set the 'IssueDate' element value. ���� ����������� ���������
     * 
     * @param issueDate
     */
    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    /** 
     * Get the 'DocumentName' element value. ������������ ���������.
     * 
     * @return value
     */
    public String getDocumentName() {
        return documentName;
    }

    /** 
     * Set the 'DocumentName' element value. ������������ ���������.
     * 
     * @param documentName
     */
    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }
}
