
package ru.acs.fts.schemas.album.freedoc;

import java.util.ArrayList;
import java.util.List;

/** 
 * Строка вложенной таблицы
 */
public class EntryRowType
{
    private List<TableCellType> tableCellList = new ArrayList<TableCellType>();

    /** 
     * Get the list of 'TableCell' element items. Ячейка таблицы
     * 
     * @return list
     */
    public List<TableCellType> getTableCellList() {
        return tableCellList;
    }

    /** 
     * Set the list of 'TableCell' element items. Ячейка таблицы
     * 
     * @param list
     */
    public void setTableCellList(List<TableCellType> list) {
        tableCellList = list;
    }
}
