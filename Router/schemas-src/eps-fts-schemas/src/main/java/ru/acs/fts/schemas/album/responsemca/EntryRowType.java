
package ru.acs.fts.schemas.album.responsemca;

import java.util.ArrayList;
import java.util.List;

/** 
 * Строка таблицы
 */
public class EntryRowType
{
    private List<CellType> tableCellList = new ArrayList<CellType>();

    /** 
     * Get the list of 'TableCell' element items. Ячейка таблицы
     * 
     * @return list
     */
    public List<CellType> getTableCellList() {
        return tableCellList;
    }

    /** 
     * Set the list of 'TableCell' element items. Ячейка таблицы
     * 
     * @param list
     */
    public void setTableCellList(List<CellType> list) {
        tableCellList = list;
    }
}
