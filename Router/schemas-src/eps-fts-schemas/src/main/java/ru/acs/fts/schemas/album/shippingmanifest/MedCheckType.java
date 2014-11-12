
package ru.acs.fts.schemas.album.shippingmanifest;

import org.joda.time.LocalDate;

/** 
 * �������� � ����������� ������� ��������
 */
public class MedCheckType
{
    private LocalDate date;
    private String time;

    /** 
     * Get the 'Date' element value. ����
     * 
     * @return value
     */
    public LocalDate getDate() {
        return date;
    }

    /** 
     * Set the 'Date' element value. ����
     * 
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /** 
     * Get the 'Time' element value. �����
     * 
     * @return value
     */
    public String getTime() {
        return time;
    }

    /** 
     * Set the 'Time' element value. �����
     * 
     * @param time
     */
    public void setTime(String time) {
        this.time = time;
    }
}
