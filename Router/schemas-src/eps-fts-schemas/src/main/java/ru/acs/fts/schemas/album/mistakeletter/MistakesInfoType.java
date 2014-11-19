
package ru.acs.fts.schemas.album.mistakeletter;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;

/** 
 * —ведени€ о вы€вленных ошибках
 */
public class MistakesInfoType
{
    private LocalDate date;
    private String time;
    private List<String> reasonList = new ArrayList<String>();
    private MistakesDescriptionType mistakesDescription;

    /** 
     * Get the 'Date' element value. ƒата вы€влени€ ошибок
     * 
     * @return value
     */
    public LocalDate getDate() {
        return date;
    }

    /** 
     * Set the 'Date' element value. ƒата вы€влени€ ошибок
     * 
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /** 
     * Get the 'Time' element value. ¬рем€ вы€влени€ ошибок
     * 
     * @return value
     */
    public String getTime() {
        return time;
    }

    /** 
     * Set the 'Time' element value. ¬рем€ вы€влени€ ошибок
     * 
     * @param time
     */
    public void setTime(String time) {
        this.time = time;
    }

    /** 
     * Get the list of 'Reasons' element items. ќписание причин ошибок и обсто€тельств их вы€влени€
     * 
     * @return list
     */
    public List<String> getReasonList() {
        return reasonList;
    }

    /** 
     * Set the list of 'Reasons' element items. ќписание причин ошибок и обсто€тельств их вы€влени€
     * 
     * @param list
     */
    public void setReasonList(List<String> list) {
        reasonList = list;
    }

    /** 
     * Get the 'MistakesDescription' element value. ќписание вы€вленных ошибок
     * 
     * @return value
     */
    public MistakesDescriptionType getMistakesDescription() {
        return mistakesDescription;
    }

    /** 
     * Set the 'MistakesDescription' element value. ќписание вы€вленных ошибок
     * 
     * @param mistakesDescription
     */
    public void setMistakesDescription(
            MistakesDescriptionType mistakesDescription) {
        this.mistakesDescription = mistakesDescription;
    }
}
