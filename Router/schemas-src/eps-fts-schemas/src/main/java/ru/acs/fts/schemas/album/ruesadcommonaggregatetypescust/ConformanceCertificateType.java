
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

import org.joda.time.LocalDate;

/** 
 * Реквизиты Одобрения типа ТС /Сертификата соответствия
 */
public class ConformanceCertificateType
{
    private String documentID;
    private LocalDate issueDate;
    private String organizationName;

    /** 
     * Get the 'DocumentID' element value. Идентификатор документа
     * 
     * @return value
     */
    public String getDocumentID() {
        return documentID;
    }

    /** 
     * Set the 'DocumentID' element value. Идентификатор документа
     * 
     * @param documentID
     */
    public void setDocumentID(String documentID) {
        this.documentID = documentID;
    }

    /** 
     * Get the 'IssueDate' element value. Дата выдачи документа
     * 
     * @return value
     */
    public LocalDate getIssueDate() {
        return issueDate;
    }

    /** 
     * Set the 'IssueDate' element value. Дата выдачи документа
     * 
     * @param issueDate
     */
    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    /** 
     * Get the 'OrganizationName' element value. Наименование органа, выдавшего документ
     * 
     * @return value
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /** 
     * Set the 'OrganizationName' element value. Наименование органа, выдавшего документ
     * 
     * @param organizationName
     */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }
}
