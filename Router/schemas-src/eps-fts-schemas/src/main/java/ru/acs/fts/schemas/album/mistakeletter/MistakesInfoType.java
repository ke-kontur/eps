
package ru.acs.fts.schemas.album.mistakeletter;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;

/** 
 * Сведения о выявленных ошибках
 */
public class MistakesInfoType
{
    private LocalDate date;
    private String time;
    private List<String> reasonList = new ArrayList<String>();
    private MistakesDescriptionType mistakesDescription;

    /** 
     * Get the 'Date' element value. Дата выявления ошибок
     * 
     * @return value
     */
    public LocalDate getDate() {
        return date;
    }

    /** 
     * Set the 'Date' element value. Дата выявления ошибок
     * 
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /** 
     * Get the 'Time' element value. Время выявления ошибок
     * 
     * @return value
     */
    public String getTime() {
        return time;
    }

    /** 
     * Set the 'Time' element value. Время выявления ошибок
     * 
     * @param time
     */
    public void setTime(String time) {
        this.time = time;
    }

    /** 
     * Get the list of 'Reasons' element items. Описание причин ошибок и обстоятельств их выявления
     * 
     * @return list
     */
    public List<String> getReasonList() {
        return reasonList;
    }

    /** 
     * Set the list of 'Reasons' element items. Описание причин ошибок и обстоятельств их выявления
     * 
     * @param list
     */
    public void setReasonList(List<String> list) {
        reasonList = list;
    }

    /** 
     * Get the 'MistakesDescription' element value. Описание выявленных ошибок
     * 
     * @return value
     */
    public MistakesDescriptionType getMistakesDescription() {
        return mistakesDescription;
    }

    /** 
     * Set the 'MistakesDescription' element value. Описание выявленных ошибок
     * 
     * @param mistakesDescription
     */
    public void setMistakesDescription(
            MistakesDescriptionType mistakesDescription) {
        this.mistakesDescription = mistakesDescription;
    }
}
