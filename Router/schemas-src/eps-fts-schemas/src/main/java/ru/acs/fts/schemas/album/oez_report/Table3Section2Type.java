
package ru.acs.fts.schemas.album.oez_report;

import java.util.ArrayList;
import java.util.List;

/** 
 * ������� 3. ������ 2. ������, ���������� � ���������� ����������� �������, ���������� ��� ���������� ����� ��������� ���������� ����, � ������������ ������ ��������
 */
public class Table3Section2Type
{
    private List<Table3Section2GoodsType> table3Section2GoodList = new ArrayList<Table3Section2GoodsType>();

    /** 
     * Get the list of 'Table3Section2Goods' element items. ������� 3. ������ 2. �����, ���������� � ���������� ����������� �������, ���������� ��� ���������� ����� ��������� ���������� ����, � ������������ ������ ��������
     * 
     * @return list
     */
    public List<Table3Section2GoodsType> getTable3Section2GoodList() {
        return table3Section2GoodList;
    }

    /** 
     * Set the list of 'Table3Section2Goods' element items. ������� 3. ������ 2. �����, ���������� � ���������� ����������� �������, ���������� ��� ���������� ����� ��������� ���������� ����, � ������������ ������ ��������
     * 
     * @param list
     */
    public void setTable3Section2GoodList(List<Table3Section2GoodsType> list) {
        table3Section2GoodList = list;
    }
}
