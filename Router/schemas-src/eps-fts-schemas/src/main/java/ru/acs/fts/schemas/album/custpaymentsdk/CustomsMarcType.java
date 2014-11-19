
package ru.acs.fts.schemas.album.custpaymentsdk;

import org.joda.time.LocalDate;

/** 
 * Добавочные листы
 */
public class CustomsMarcType
{
    private String markDescription;
    private LocalDate dateInf;

    /** 
     * Get the 'MarkDescription' element value. Служебная запись / номер документа 
     * 
     * @return value
     */
    public String getMarkDescription() {
        return markDescription;
    }

    /** 
     * Set the 'MarkDescription' element value. Служебная запись / номер документа 
     * 
     * @param markDescription
     */
    public void setMarkDescription(String markDescription) {
        this.markDescription = markDescription;
    }

    /** 
     * Get the 'DateInf' element value. Дата проставления отметки/ Дата принятия решения о продлении срока проверки (ст. 359 ТК)
     * 
     * @return value
     */
    public LocalDate getDateInf() {
        return dateInf;
    }

    /** 
     * Set the 'DateInf' element value. Дата проставления отметки/ Дата принятия решения о продлении срока проверки (ст. 359 ТК)
     * 
     * @param dateInf
     */
    public void setDateInf(LocalDate dateInf) {
        this.dateInf = dateInf;
    }
}
