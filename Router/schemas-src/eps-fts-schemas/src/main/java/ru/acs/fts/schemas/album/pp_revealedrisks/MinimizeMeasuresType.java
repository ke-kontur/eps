
package ru.acs.fts.schemas.album.pp_revealedrisks;

import java.util.ArrayList;
import java.util.List;

/** 
 * Меры по минимизации риска
 */
public class MinimizeMeasuresType
{
    private String minimizeMeasuresNote;
    private List<MinimizeMeasuresInfoType> minimizeMeasuresInfoList = new ArrayList<MinimizeMeasuresInfoType>();

    /** 
     * Get the 'MinimizeMeasuresNote' element value. Примечание к мерам
     * 
     * @return value
     */
    public String getMinimizeMeasuresNote() {
        return minimizeMeasuresNote;
    }

    /** 
     * Set the 'MinimizeMeasuresNote' element value. Примечание к мерам
     * 
     * @param minimizeMeasuresNote
     */
    public void setMinimizeMeasuresNote(String minimizeMeasuresNote) {
        this.minimizeMeasuresNote = minimizeMeasuresNote;
    }

    /** 
     * Get the list of 'MinimizeMeasuresInfo' element items. Набор информации о каждой мере по минимизации рисков
     * 
     * @return list
     */
    public List<MinimizeMeasuresInfoType> getMinimizeMeasuresInfoList() {
        return minimizeMeasuresInfoList;
    }

    /** 
     * Set the list of 'MinimizeMeasuresInfo' element items. Набор информации о каждой мере по минимизации рисков
     * 
     * @param list
     */
    public void setMinimizeMeasuresInfoList(List<MinimizeMeasuresInfoType> list) {
        minimizeMeasuresInfoList = list;
    }
}
