
package ru.acs.fts.schemas.album.oez_report;

import java.util.ArrayList;
import java.util.List;

/** 
 * ������� 2. ����� � �������, ���������� ��� ���������� ����� ��������� ���������� ���� � �����
 */
public class Table2Type
{
    private List<Table2GoodsType> table2GoodList = new ArrayList<Table2GoodsType>();

    /** 
     * Get the list of 'Table2Goods' element items. ������� 2.�����, ���������� ��� ���������� ����� ��������� ���������� ����, ������� ��������� � ������������ ��������� (����������� ����������������� ��������) � ��������� ��� �������� ������������ � �������� �������������
     * 
     * @return list
     */
    public List<Table2GoodsType> getTable2GoodList() {
        return table2GoodList;
    }

    /** 
     * Set the list of 'Table2Goods' element items. ������� 2.�����, ���������� ��� ���������� ����� ��������� ���������� ����, ������� ��������� � ������������ ��������� (����������� ����������������� ��������) � ��������� ��� �������� ������������ � �������� �������������
     * 
     * @param list
     */
    public void setTable2GoodList(List<Table2GoodsType> list) {
        table2GoodList = list;
    }
}
