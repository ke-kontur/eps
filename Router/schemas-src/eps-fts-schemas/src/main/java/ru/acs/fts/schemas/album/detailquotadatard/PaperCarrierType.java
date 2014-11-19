
package ru.acs.fts.schemas.album.detailquotadatard;

import org.joda.time.LocalDate;

/** 
 * Сведения о бумажных носителях
 */
public class PaperCarrierType
{
    private String formNumber;
    private String formSeries;
    private LocalDate formPrintDate;

    /** 
     * Get the 'FormNumber' element value. Номер бланка
     * 
     * @return value
     */
    public String getFormNumber() {
        return formNumber;
    }

    /** 
     * Set the 'FormNumber' element value. Номер бланка
     * 
     * @param formNumber
     */
    public void setFormNumber(String formNumber) {
        this.formNumber = formNumber;
    }

    /** 
     * Get the 'FormSeries' element value. Серия бланка
     * 
     * @return value
     */
    public String getFormSeries() {
        return formSeries;
    }

    /** 
     * Set the 'FormSeries' element value. Серия бланка
     * 
     * @param formSeries
     */
    public void setFormSeries(String formSeries) {
        this.formSeries = formSeries;
    }

    /** 
     * Get the 'FormPrintDate' element value. Дата печати банка
     * 
     * @return value
     */
    public LocalDate getFormPrintDate() {
        return formPrintDate;
    }

    /** 
     * Set the 'FormPrintDate' element value. Дата печати банка
     * 
     * @param formPrintDate
     */
    public void setFormPrintDate(LocalDate formPrintDate) {
        this.formPrintDate = formPrintDate;
    }
}
