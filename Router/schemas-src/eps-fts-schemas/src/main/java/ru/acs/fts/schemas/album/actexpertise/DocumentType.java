
package ru.acs.fts.schemas.album.actexpertise;

import org.joda.time.LocalDate;

public class DocumentType
{
    private String documentNumber;
    private LocalDate documentDate;

    /** 
     * Get the 'DocumentNumber' element value. ����� �������������� ���������.
     * 
     * @return value
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /** 
     * Set the 'DocumentNumber' element value. ����� �������������� ���������.
     * 
     * @param documentNumber
     */
    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    /** 
     * Get the 'DocumentDate' element value. ���� �������������� ���������.
     * 
     * @return value
     */
    public LocalDate getDocumentDate() {
        return documentDate;
    }

    /** 
     * Set the 'DocumentDate' element value. ���� �������������� ���������.
     * 
     * @param documentDate
     */
    public void setDocumentDate(LocalDate documentDate) {
        this.documentDate = documentDate;
    }
}
