
package ru.acs.fts.schemas.album.inqprolonginotreatment;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;

/** 
 * ќписание предлагаемого срока продлени€
 */
public class ChangeDateType
{
    private LocalDate newDate;
    private List<String> motivationList = new ArrayList<String>();

    /** 
     * Get the 'NewDate' element value. Ќова€ дата окончани€ переработки
     * 
     * @return value
     */
    public LocalDate getNewDate() {
        return newDate;
    }

    /** 
     * Set the 'NewDate' element value. Ќова€ дата окончани€ переработки
     * 
     * @param newDate
     */
    public void setNewDate(LocalDate newDate) {
        this.newDate = newDate;
    }

    /** 
     * Get the list of 'Motivation' element items. ѕричины изменени€ сроков переработки
     * 
     * @return list
     */
    public List<String> getMotivationList() {
        return motivationList;
    }

    /** 
     * Set the list of 'Motivation' element items. ѕричины изменени€ сроков переработки
     * 
     * @param list
     */
    public void setMotivationList(List<String> list) {
        motivationList = list;
    }
}
