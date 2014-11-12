
package ru.acs.fts.schemas.album.responsemca;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������
 */
public class TableType
{
    private String cols;
    private String tableName;
    private String shortTableName;
    private List<String> columnSpecList = new ArrayList<String>();
    private List<TableRowType> tableBodyRowList = new ArrayList<TableRowType>();
    private List<TableRowType> tableHeadRowList = new ArrayList<TableRowType>();
    private List<TableRowType> tableFootRowList = new ArrayList<TableRowType>();

    /** 
     * Get the 'Cols' element value. ����� ������� � �������
     * 
     * @return value
     */
    public String getCols() {
        return cols;
    }

    /** 
     * Set the 'Cols' element value. ����� ������� � �������
     * 
     * @param cols
     */
    public void setCols(String cols) {
        this.cols = cols;
    }

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
     * Get the 'ShortTableName' element value. ������� ������������ �������
     * 
     * @return value
     */
    public String getShortTableName() {
        return shortTableName;
    }

    /** 
     * Set the 'ShortTableName' element value. ������� ������������ �������
     * 
     * @param shortTableName
     */
    public void setShortTableName(String shortTableName) {
        this.shortTableName = shortTableName;
    }

    /** 
     * Get the list of 'ColumnSpec' element items. �������� �������
     * 
     * @return list
     */
    public List<String> getColumnSpecList() {
        return columnSpecList;
    }

    /** 
     * Set the list of 'ColumnSpec' element items. �������� �������
     * 
     * @param list
     */
    public void setColumnSpecList(List<String> list) {
        columnSpecList = list;
    }

    /** 
     * Get the list of 'TableBodyRow' element items. ���� �������. ������
     * 
     * @return list
     */
    public List<TableRowType> getTableBodyRowList() {
        return tableBodyRowList;
    }

    /** 
     * Set the list of 'TableBodyRow' element items. ���� �������. ������
     * 
     * @param list
     */
    public void setTableBodyRowList(List<TableRowType> list) {
        tableBodyRowList = list;
    }

    /** 
     * Get the list of 'TableHeadRow' element items. ��������� �������. ������
     * 
     * @return list
     */
    public List<TableRowType> getTableHeadRowList() {
        return tableHeadRowList;
    }

    /** 
     * Set the list of 'TableHeadRow' element items. ��������� �������. ������
     * 
     * @param list
     */
    public void setTableHeadRowList(List<TableRowType> list) {
        tableHeadRowList = list;
    }

    /** 
     * Get the list of 'TableFootRow' element items. ������ �������. ������
     * 
     * @return list
     */
    public List<TableRowType> getTableFootRowList() {
        return tableFootRowList;
    }

    /** 
     * Set the list of 'TableFootRow' element items. ������ �������. ������
     * 
     * @param list
     */
    public void setTableFootRowList(List<TableRowType> list) {
        tableFootRowList = list;
    }
}
