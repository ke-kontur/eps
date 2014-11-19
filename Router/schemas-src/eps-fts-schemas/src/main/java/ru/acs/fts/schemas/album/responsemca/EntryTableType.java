
package ru.acs.fts.schemas.album.responsemca;

import java.util.ArrayList;
import java.util.List;

/** 
 * Вложенная таблица
 */
public class EntryTableType extends CellType
{
    private String cols;
    private List<EntryRowType> entryRowList = new ArrayList<EntryRowType>();

    /** 
     * Get the 'Cols' element value. Число колонок в таблице
     * 
     * @return value
     */
    public String getCols() {
        return cols;
    }

    /** 
     * Set the 'Cols' element value. Число колонок в таблице
     * 
     * @param cols
     */
    public void setCols(String cols) {
        this.cols = cols;
    }

    /** 
     * Get the list of 'EntryRow' element items. Строка таблицы
     * 
     * @return list
     */
    public List<EntryRowType> getEntryRowList() {
        return entryRowList;
    }

    /** 
     * Set the list of 'EntryRow' element items. Строка таблицы
     * 
     * @param list
     */
    public void setEntryRowList(List<EntryRowType> list) {
        entryRowList = list;
    }
}
