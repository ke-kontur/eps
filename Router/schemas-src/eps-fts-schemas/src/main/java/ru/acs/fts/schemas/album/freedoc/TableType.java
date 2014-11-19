
package ru.acs.fts.schemas.album.freedoc;

import java.util.ArrayList;
import java.util.List;

/** 
 * Таблица
 */
public class TableType
{
    private String tableName;
    private List<String> columnSpecList = new ArrayList<String>();
    private TableBodyType tableBody;
    private TableHeadType tableHead;
    private TableFootType tableFoot;
    private String cols;

    /** 
     * Get the 'TableName' element value. Наименование таблицы
     * 
     * @return value
     */
    public String getTableName() {
        return tableName;
    }

    /** 
     * Set the 'TableName' element value. Наименование таблицы
     * 
     * @param tableName
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /** 
     * Get the list of 'ColumnSpec' element items.
     * 
     * @return list
     */
    public List<String> getColumnSpecList() {
        return columnSpecList;
    }

    /** 
     * Set the list of 'ColumnSpec' element items.
     * 
     * @param list
     */
    public void setColumnSpecList(List<String> list) {
        columnSpecList = list;
    }

    /** 
     * Get the 'TableBody' element value. Тело таблицы
     * 
     * @return value
     */
    public TableBodyType getTableBody() {
        return tableBody;
    }

    /** 
     * Set the 'TableBody' element value. Тело таблицы
     * 
     * @param tableBody
     */
    public void setTableBody(TableBodyType tableBody) {
        this.tableBody = tableBody;
    }

    /** 
     * Get the 'TableHead' element value. Заголовок таблицы
     * 
     * @return value
     */
    public TableHeadType getTableHead() {
        return tableHead;
    }

    /** 
     * Set the 'TableHead' element value. Заголовок таблицы
     * 
     * @param tableHead
     */
    public void setTableHead(TableHeadType tableHead) {
        this.tableHead = tableHead;
    }

    /** 
     * Get the 'TableFoot' element value. Подвал таблицы
     * 
     * @return value
     */
    public TableFootType getTableFoot() {
        return tableFoot;
    }

    /** 
     * Set the 'TableFoot' element value. Подвал таблицы
     * 
     * @param tableFoot
     */
    public void setTableFoot(TableFootType tableFoot) {
        this.tableFoot = tableFoot;
    }

    /** 
     * Get the 'cols' attribute value. Число колонок в таблице
     * 
     * @return value
     */
    public String getCols() {
        return cols;
    }

    /** 
     * Set the 'cols' attribute value. Число колонок в таблице
     * 
     * @param cols
     */
    public void setCols(String cols) {
        this.cols = cols;
    }
}
