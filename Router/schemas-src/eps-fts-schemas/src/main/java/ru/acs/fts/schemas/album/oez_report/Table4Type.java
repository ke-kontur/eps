
package ru.acs.fts.schemas.album.oez_report;

import java.util.ArrayList;
import java.util.List;

/** 
 * ������� 4. ����� � �������, ������������� (����������) �� �������, ���������� ��� ���������� ��������� ��������� ���������� ����
 */
public class Table4Type
{
    private List<Table4GoodsType> table4GoodList = new ArrayList<Table4GoodsType>();

    /** 
     * Get the list of 'Table4Goods' element items. �����, ������������� (����������) �� �������, ���������� ��� ���������� ��������� ��������� ���������� ����
     * 
     * @return list
     */
    public List<Table4GoodsType> getTable4GoodList() {
        return table4GoodList;
    }

    /** 
     * Set the list of 'Table4Goods' element items. �����, ������������� (����������) �� �������, ���������� ��� ���������� ��������� ��������� ���������� ����
     * 
     * @param list
     */
    public void setTable4GoodList(List<Table4GoodsType> list) {
        table4GoodList = list;
    }
}
