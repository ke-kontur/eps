
package ru.acs.fts.schemas.album.cardcommonaggregatetypes;

import org.joda.time.LocalDate;

/** 
 * Базовый класс для указания документов. Наименование, номер, дата.
 */
public class DocumentBaseType
{
    private String prDocumentNumber;
    private LocalDate prDocumentDate;

    /** 
     * Get the 'PrDocumentNumber' element value. Номер документа.
     * 
     * @return value
     */
    public String getPrDocumentNumber() {
        return prDocumentNumber;
    }

    /** 
     * Set the 'PrDocumentNumber' element value. Номер документа.
     * 
     * @param prDocumentNumber
     */
    public void setPrDocumentNumber(String prDocumentNumber) {
        this.prDocumentNumber = prDocumentNumber;
    }

    /** 
     * Get the 'PrDocumentDate' element value. Дата документа.
     * 
     * @return value
     */
    public LocalDate getPrDocumentDate() {
        return prDocumentDate;
    }

    /** 
     * Set the 'PrDocumentDate' element value. Дата документа.
     * 
     * @param prDocumentDate
     */
    public void setPrDocumentDate(LocalDate prDocumentDate) {
        this.prDocumentDate = prDocumentDate;
    }
}
