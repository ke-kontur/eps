
package ru.acs.fts.schemas.album.freedoc;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������
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
     * Get the 'TableName' element value. ������������ �������
     * 
     * @return value
     */
    public String getTableName() {
        return tableName;
    }

    /** 
     * Set the 'TableName' element value. ������������ �������
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
     * Get the 'TableBody' element value. ���� �������
     * 
     * @return value
     */
    public TableBodyType getTableBody() {
        return tableBody;
    }

    /** 
     * Set the 'TableBody' element value. ���� �������
     * 
     * @param tableBody
     */
    public void setTableBody(TableBodyType tableBody) {
        this.tableBody = tableBody;
    }

    /** 
     * Get the 'TableHead' element value. ��������� �������
     * 
     * @return value
     */
    public TableHeadType getTableHead() {
        return tableHead;
    }

    /** 
     * Set the 'TableHead' element value. ��������� �������
     * 
     * @param tableHead
     */
    public void setTableHead(TableHeadType tableHead) {
        this.tableHead = tableHead;
    }

    /** 
     * Get the 'TableFoot' element value. ������ �������
     * 
     * @return value
     */
    public TableFootType getTableFoot() {
        return tableFoot;
    }

    /** 
     * Set the 'TableFoot' element value. ������ �������
     * 
     * @param tableFoot
     */
    public void setTableFoot(TableFootType tableFoot) {
        this.tableFoot = tableFoot;
    }

    /** 
     * Get the 'cols' attribute value. ����� ������� � �������
     * 
     * @return value
     */
    public String getCols() {
        return cols;
    }

    /** 
     * Set the 'cols' attribute value. ����� ������� � �������
     * 
     * @param cols
     */
    public void setCols(String cols) {
        this.cols = cols;
    }
}
