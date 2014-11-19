
package ru.acs.fts.schemas.album.transportcommonaggregatetypescust;

import org.joda.time.LocalDate;

/** 
 * Информация о прибытии/отбытии в порт
 */
public class PortType
{
    private LocalDate date;
    private String name;

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
     * Get the 'Name' element value. Название порта
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'Name' element value. Название порта
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
}
