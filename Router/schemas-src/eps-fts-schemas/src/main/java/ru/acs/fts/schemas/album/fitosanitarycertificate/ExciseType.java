
package ru.acs.fts.schemas.album.fitosanitarycertificate;

import java.util.ArrayList;
import java.util.List;

/** 
 * Отличительные знаки (маркировка)
 */
public class ExciseType
{
    private String exciseSerieses;
    private List<String> exciseDescriptionList = new ArrayList<String>();

    /** 
     * Get the 'ExciseSerieses' element value. Номер марки
     * 
     * @return value
     */
    public String getExciseSerieses() {
        return exciseSerieses;
    }

    /** 
     * Set the 'ExciseSerieses' element value. Номер марки
     * 
     * @param exciseSerieses
     */
    public void setExciseSerieses(String exciseSerieses) {
        this.exciseSerieses = exciseSerieses;
    }

    /** 
     * Get the list of 'ExciseDescription' element items. Описание отличительных знаков
     * 
     * @return list
     */
    public List<String> getExciseDescriptionList() {
        return exciseDescriptionList;
    }

    /** 
     * Set the list of 'ExciseDescription' element items. Описание отличительных знаков
     * 
     * @param list
     */
    public void setExciseDescriptionList(List<String> list) {
        exciseDescriptionList = list;
    }
}
