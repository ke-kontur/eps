
package ru.acs.fts.schemas.album.freedoc;

import java.util.ArrayList;
import java.util.List;

/** 
 * ���� �������
 */
public class TableBodyType
{
    private List<TableRowType> tableRowList = new ArrayList<TableRowType>();

    /** 
     * Get the list of 'TableRow' element items. ������ �������
     * 
     * @return list
     */
    public List<TableRowType> getTableRowList() {
        return tableRowList;
    }

    /** 
     * Set the list of 'TableRow' element items. ������ �������
     * 
     * @param list
     */
    public void setTableRowList(List<TableRowType> list) {
        tableRowList = list;
    }
}
