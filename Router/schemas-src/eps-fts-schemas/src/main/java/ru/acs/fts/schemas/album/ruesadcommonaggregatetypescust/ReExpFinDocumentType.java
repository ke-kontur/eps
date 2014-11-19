
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

import org.joda.time.LocalDate;

/** 
 * Сведения о паспорте сделки при ввозе товаров в режиме реэкспорта без предварительного помещения под другой таможенный режим
 */
public class ReExpFinDocumentType
{
    private String finDocumentCode;
    private String finDocumentNumber;
    private LocalDate presentingDate;

    /** 
     * Get the 'FinDocumentCode' element value. Вид представленного документа. 1- ПС; 2 - ПСб .
     * 
     * @return value
     */
    public String getFinDocumentCode() {
        return finDocumentCode;
    }

    /** 
     * Set the 'FinDocumentCode' element value. Вид представленного документа. 1- ПС; 2 - ПСб .
     * 
     * @param finDocumentCode
     */
    public void setFinDocumentCode(String finDocumentCode) {
        this.finDocumentCode = finDocumentCode;
    }

    /** 
     * Get the 'FinDocumentNumber' element value. Номер представленного ПС/ПСб.
     * 
     * @return value
     */
    public String getFinDocumentNumber() {
        return finDocumentNumber;
    }

    /** 
     * Set the 'FinDocumentNumber' element value. Номер представленного ПС/ПСб.
     * 
     * @param finDocumentNumber
     */
    public void setFinDocumentNumber(String finDocumentNumber) {
        this.finDocumentNumber = finDocumentNumber;
    }

    /** 
     * Get the 'PresentingDate' element value. Дата представления недостающего документа / сведений.
     * 
     * @return value
     */
    public LocalDate getPresentingDate() {
        return presentingDate;
    }

    /** 
     * Set the 'PresentingDate' element value. Дата представления недостающего документа / сведений.
     * 
     * @param presentingDate
     */
    public void setPresentingDate(LocalDate presentingDate) {
        this.presentingDate = presentingDate;
    }
}
