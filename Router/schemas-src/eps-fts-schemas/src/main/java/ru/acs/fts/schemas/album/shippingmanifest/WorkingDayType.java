
package ru.acs.fts.schemas.album.shippingmanifest;

/** 
 * Режим работы
 */
public class WorkingDayType
{
    private String from;
    private String to;

    /** 
     * Get the 'From' element value. Время начала рабочего дня
     * 
     * @return value
     */
    public String getFrom() {
        return from;
    }

    /** 
     * Set the 'From' element value. Время начала рабочего дня
     * 
     * @param from
     */
    public void setFrom(String from) {
        this.from = from;
    }

    /** 
     * Get the 'To' element value. Время окончания рабочего дня
     * 
     * @return value
     */
    public String getTo() {
        return to;
    }

    /** 
     * Set the 'To' element value. Время окончания рабочего дня
     * 
     * @param to
     */
    public void setTo(String to) {
        this.to = to;
    }
}
