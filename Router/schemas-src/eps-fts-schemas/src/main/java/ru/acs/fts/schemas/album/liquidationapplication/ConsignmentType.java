
package ru.acs.fts.schemas.album.liquidationapplication;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * �������� � ������ �������
 */
public class ConsignmentType
{
    private GTDIDType regNumberDT;
    private List<GoodsType> goodList = new ArrayList<GoodsType>();

    /** 
     * Get the 'RegNumberDT' element value. ��������������� ����� ��
     * 
     * @return value
     */
    public GTDIDType getRegNumberDT() {
        return regNumberDT;
    }

    /** 
     * Set the 'RegNumberDT' element value. ��������������� ����� ��
     * 
     * @param regNumberDT
     */
    public void setRegNumberDT(GTDIDType regNumberDT) {
        this.regNumberDT = regNumberDT;
    }

    /** 
     * Get the list of 'Goods' element items. �����, ���������� ��� ���������� ��������� ���
     * 
     * @return list
     */
    public List<GoodsType> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. �����, ���������� ��� ���������� ��������� ���
     * 
     * @param list
     */
    public void setGoodList(List<GoodsType> list) {
        goodList = list;
    }
}
