
package ru.acs.fts.schemas.album.certificatdimmatriculation;

import org.joda.time.LocalDate;

/** 
 * Сведения о снятии с учета ТС
 */
public class UnRegistrationType
{
    private LocalDate date;
    private String GAIName;
    private String cause;

    /** 
     * Get the 'Date' element value. Дата снятия с учета
     * 
     * @return value
     */
    public LocalDate getDate() {
        return date;
    }

    /** 
     * Set the 'Date' element value. Дата снятия с учета
     * 
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /** 
     * Get the 'GAIName' element value. Наименование ГАИ
     * 
     * @return value
     */
    public String getGAIName() {
        return GAIName;
    }

    /** 
     * Set the 'GAIName' element value. Наименование ГАИ
     * 
     * @param GAIName
     */
    public void setGAIName(String GAIName) {
        this.GAIName = GAIName;
    }

    /** 
     * Get the 'Cause' element value. Текст причины снятия с учета ТС
     * 
     * @return value
     */
    public String getCause() {
        return cause;
    }

    /** 
     * Set the 'Cause' element value. Текст причины снятия с учета ТС
     * 
     * @param cause
     */
    public void setCause(String cause) {
        this.cause = cause;
    }
}
