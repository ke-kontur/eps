
package ru.acs.fts.schemas.album.taxorganregistrationcertificate;

import org.joda.time.LocalDate;

/** 
 * Сведения о документах, подтверждающих создание юридического лица и на основании которых выдается свидетельство
 */
public class RegistrationDocumentType
{
    private LocalDate issueDate;
    private String documentName;

    /** 
     * Get the 'IssueDate' element value. Дата регистрации документа
     * 
     * @return value
     */
    public LocalDate getIssueDate() {
        return issueDate;
    }

    /** 
     * Set the 'IssueDate' element value. Дата регистрации документа
     * 
     * @param issueDate
     */
    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    /** 
     * Get the 'DocumentName' element value. Наименование документа.
     * 
     * @return value
     */
    public String getDocumentName() {
        return documentName;
    }

    /** 
     * Set the 'DocumentName' element value. Наименование документа.
     * 
     * @param documentName
     */
    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }
}
