
package ru.acs.fts.schemas.album.shippingmanifest;

import org.joda.time.LocalDate;

/** 
 * Лицензионная карточка водителя 
 */
public class DriverLicensingCardType
{
    private String type;
    private String number;
    private LocalDate date;

    /** 
     * Get the 'Type' element value. Вид лицензионной карточки 
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'Type' element value. Вид лицензионной карточки 
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /** 
     * Get the 'Number' element value. Номер лицензионной карточки 
     * 
     * @return value
     */
    public String getNumber() {
        return number;
    }

    /** 
     * Set the 'Number' element value. Номер лицензионной карточки 
     * 
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /** 
     * Get the 'Date' element value. Дата лицензионной карточки 
     * 
     * @return value
     */
    public LocalDate getDate() {
        return date;
    }

    /** 
     * Set the 'Date' element value. Дата лицензионной карточки 
     * 
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }
}
