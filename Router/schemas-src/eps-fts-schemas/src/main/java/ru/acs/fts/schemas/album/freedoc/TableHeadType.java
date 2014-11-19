
package ru.acs.fts.schemas.album.freedoc;

import java.util.ArrayList;
import java.util.List;

/** 
 * Заголовок таблицы
 */
public class TableHeadType
{
    private List<TableRowType> tableRowList = new ArrayList<TableRowType>();

    /** 
     * Get the list of 'TableRow' element items. Строка заголовка
     * 
     * @return list
     */
    public List<TableRowType> getTableRowList() {
        return tableRowList;
    }

    /** 
     * Set the list of 'TableRow' element items. Строка заголовка
     * 
     * @param list
     */
    public void setTableRowList(List<TableRowType> list) {
        tableRowList = list;
    }
}
