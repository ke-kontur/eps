
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

import org.joda.time.LocalDate;

/** 
 * ��������� ��������� ���� �� /����������� ������������
 */
public class ConformanceCertificateType
{
    private String documentID;
    private LocalDate issueDate;
    private String organizationName;

    /** 
     * Get the 'DocumentID' element value. ������������� ���������
     * 
     * @return value
     */
    public String getDocumentID() {
        return documentID;
    }

    /** 
     * Set the 'DocumentID' element value. ������������� ���������
     * 
     * @param documentID
     */
    public void setDocumentID(String documentID) {
        this.documentID = documentID;
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

    /** 
     * Get the 'OrganizationName' element value. ������������ ������, ��������� ��������
     * 
     * @return value
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /** 
     * Set the 'OrganizationName' element value. ������������ ������, ��������� ��������
     * 
     * @param organizationName
     */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }
}
