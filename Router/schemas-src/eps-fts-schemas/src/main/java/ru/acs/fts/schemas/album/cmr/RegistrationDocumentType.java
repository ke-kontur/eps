
package ru.acs.fts.schemas.album.cmr;

import org.joda.time.LocalDate;

/** 
 * Информация о регистрации CMR (гр.21)
 */
public class RegistrationDocumentType
{
    private LocalDate date;
    private String regID;
    private String place;

    /** 
     * Get the 'Date' element value. Дата cоставления накладной
     * 
     * @return value
     */
    public LocalDate getDate() {
        return date;
    }

    /** 
     * Set the 'Date' element value. Дата cоставления накладной
     * 
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /** 
     * Get the 'RegID' element value. Номер накладной
     * 
     * @return value
     */
    public String getRegID() {
        return regID;
    }

    /** 
     * Set the 'RegID' element value. Номер накладной
     * 
     * @param regID
     */
    public void setRegID(String regID) {
        this.regID = regID;
    }

    /** 
     * Get the 'Place' element value. Место составления накладной
     * 
     * @return value
     */
    public String getPlace() {
        return place;
    }

    /** 
     * Set the 'Place' element value. Место составления накладной
     * 
     * @param place
     */
    public void setPlace(String place) {
        this.place = place;
    }
}
