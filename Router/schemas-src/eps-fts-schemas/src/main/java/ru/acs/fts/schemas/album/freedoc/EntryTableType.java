
package ru.acs.fts.schemas.album.freedoc;

import java.util.ArrayList;
import java.util.List;

/** 
 * Вложенная таблица
 */
public class EntryTableType
{
    private List<EntryRowType> entryRowList = new ArrayList<EntryRowType>();
    private String cols;

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

    /** 
     * Get the 'cols' attribute value.
     * 
     * @return value
     */
    public String getCols() {
        return cols;
    }

    /** 
     * Set the 'cols' attribute value.
     * 
     * @param cols
     */
    public void setCols(String cols) {
        this.cols = cols;
    }
}
