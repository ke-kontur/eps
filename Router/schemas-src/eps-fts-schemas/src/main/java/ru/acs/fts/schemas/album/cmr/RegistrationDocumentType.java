
package ru.acs.fts.schemas.album.cmr;

import org.joda.time.LocalDate;

/** 
 * ���������� � ����������� CMR (��.21)
 */
public class RegistrationDocumentType
{
    private LocalDate date;
    private String regID;
    private String place;

    /** 
     * Get the 'Date' element value. ���� c���������� ���������
     * 
     * @return value
     */
    public LocalDate getDate() {
        return date;
    }

    /** 
     * Set the 'Date' element value. ���� c���������� ���������
     * 
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /** 
     * Get the 'RegID' element value. ����� ���������
     * 
     * @return value
     */
    public String getRegID() {
        return regID;
    }

    /** 
     * Set the 'RegID' element value. ����� ���������
     * 
     * @param regID
     */
    public void setRegID(String regID) {
        this.regID = regID;
    }

    /** 
     * Get the 'Place' element value. ����� ����������� ���������
     * 
     * @return value
     */
    public String getPlace() {
        return place;
    }

    /** 
     * Set the 'Place' element value. ����� ����������� ���������
     * 
     * @param place
     */
    public void setPlace(String place) {
        this.place = place;
    }
}
