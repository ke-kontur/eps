
package ru.acs.fts.schemas.album.dealpassport;

import org.joda.time.LocalDate;

/** 
 * Информация о переоформлении ПС
 */
public class DPReMadeType
{
    private String documentNumber;
    private LocalDate date;

    /** 
     * Get the 'DocumentNumber' element value. Номер переоформления ПС
     * 
     * @return value
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /** 
     * Set the 'DocumentNumber' element value. Номер переоформления ПС
     * 
     * @param documentNumber
     */
    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    /** 
     * Get the 'Date' element value. Дата переоформления ПС
     * 
     * @return value
     */
    public LocalDate getDate() {
        return date;
    }

    /** 
     * Set the 'Date' element value. Дата переоформления ПС
     * 
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }
}
