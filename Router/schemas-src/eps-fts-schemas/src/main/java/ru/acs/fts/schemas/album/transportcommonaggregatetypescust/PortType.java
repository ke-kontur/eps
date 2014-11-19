
package ru.acs.fts.schemas.album.transportcommonaggregatetypescust;

import org.joda.time.LocalDate;

/** 
 * ���������� � ��������/������� � ����
 */
public class PortType
{
    private LocalDate date;
    private String name;

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
     * Get the 'Name' element value. �������� �����
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'Name' element value. �������� �����
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
}
