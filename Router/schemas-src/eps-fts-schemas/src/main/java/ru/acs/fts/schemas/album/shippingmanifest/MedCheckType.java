
package ru.acs.fts.schemas.album.shippingmanifest;

import org.joda.time.LocalDate;

/** 
 * Сведения о медицинском осмотре водителя
 */
public class MedCheckType
{
    private LocalDate date;
    private String time;

    /** 
     * Get the 'Date' element value. Дата
     * 
     * @return value
     */
    public LocalDate getDate() {
        return date;
    }

    /** 
     * Set the 'Date' element value. Дата
     * 
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /** 
     * Get the 'Time' element value. Время
     * 
     * @return value
     */
    public String getTime() {
        return time;
    }

    /** 
     * Set the 'Time' element value. Время
     * 
     * @param time
     */
    public void setTime(String time) {
        this.time = time;
    }
}
