
package ru.acs.fts.schemas.album.shippingmanifest;

import org.joda.time.LocalDate;

/** 
 * Показания одометра автомобиля и дата точки маршрута
 */
public class CheckPointType
{
    private String odometr;
    private LocalDate date;
    private String time;

    /** 
     * Get the 'Odometr' element value. Показания одометра (полные км пробега)
     * 
     * @return value
     */
    public String getOdometr() {
        return odometr;
    }

    /** 
     * Set the 'Odometr' element value. Показания одометра (полные км пробега)
     * 
     * @param odometr
     */
    public void setOdometr(String odometr) {
        this.odometr = odometr;
    }

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
