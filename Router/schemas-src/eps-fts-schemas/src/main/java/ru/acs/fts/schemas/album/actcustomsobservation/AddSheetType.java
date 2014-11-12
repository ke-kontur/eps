
package ru.acs.fts.schemas.album.actcustomsobservation;

import java.util.ArrayList;
import java.util.List;

/** 
 * Дополнительный лист к акту таможенного наблюдения
 */
public class AddSheetType
{
    private String numberSheet;
    private List<String> descriptionList = new ArrayList<String>();

    /** 
     * Get the 'NumberSheet' element value. Номер дополнительного листа
     * 
     * @return value
     */
    public String getNumberSheet() {
        return numberSheet;
    }

    /** 
     * Set the 'NumberSheet' element value. Номер дополнительного листа
     * 
     * @param numberSheet
     */
    public void setNumberSheet(String numberSheet) {
        this.numberSheet = numberSheet;
    }

    /** 
     * Get the list of 'Description' element items. Описание процесса таможенного наблюдения и его результаты
     * 
     * @return list
     */
    public List<String> getDescriptionList() {
        return descriptionList;
    }

    /** 
     * Set the list of 'Description' element items. Описание процесса таможенного наблюдения и его результаты
     * 
     * @param list
     */
    public void setDescriptionList(List<String> list) {
        descriptionList = list;
    }
}
