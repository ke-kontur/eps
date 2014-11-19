
package ru.acs.fts.schemas.album.airwaybill;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.AWBNumberType;

/** 
 * �������� � ����������� ��������� 
 */
public class RegistrationType extends AWBNumberType
{
    private LocalDate date;
    private String place;

    /** 
     * Get the 'Date' element value. ���� ����������� ���������
     * 
     * @return value
     */
    public LocalDate getDate() {
        return date;
    }

    /** 
     * Set the 'Date' element value. ���� ����������� ���������
     * 
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
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
