
package ru.acs.fts.schemas.album.contractdealpassport;

import org.joda.time.LocalDate;

/** 
 * Справочная информация
 */
public class SupplementalInformationType
{
    private String documentType;
    private LocalDate date;

    /** 
     * Get the 'DocumentType' element value. Вид документа (1 - бумажные носители, 2 - электронный носитель)
     * 
     * @return value
     */
    public String getDocumentType() {
        return documentType;
    }

    /** 
     * Set the 'DocumentType' element value. Вид документа (1 - бумажные носители, 2 - электронный носитель)
     * 
     * @param documentType
     */
    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    /** 
     * Get the 'Date' element value. Дата подачи документов
     * 
     * @return value
     */
    public LocalDate getDate() {
        return date;
    }

    /** 
     * Set the 'Date' element value. Дата подачи документов
     * 
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }
}
