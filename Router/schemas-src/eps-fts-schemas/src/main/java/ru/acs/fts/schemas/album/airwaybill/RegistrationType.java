
package ru.acs.fts.schemas.album.airwaybill;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.AWBNumberType;

/** 
 * Сведения о составлении накладной 
 */
public class RegistrationType extends AWBNumberType
{
    private LocalDate date;
    private String place;

    /** 
     * Get the 'Date' element value. Дата составления документа
     * 
     * @return value
     */
    public LocalDate getDate() {
        return date;
    }

    /** 
     * Set the 'Date' element value. Дата составления документа
     * 
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /** 
     * Get the 'Place' element value. Место составления документа
     * 
     * @return value
     */
    public String getPlace() {
        return place;
    }

    /** 
     * Set the 'Place' element value. Место составления документа
     * 
     * @param place
     */
    public void setPlace(String place) {
        this.place = place;
    }
}
