
package ru.acs.fts.schemas.album.oez_report;

import java.util.ArrayList;
import java.util.List;

/** 
 * ������� 3. ������ 2. ������������ ���������� ����������� � �������� 
 */
public class Table3Section2WasteProductsUsageType
{
    private String quantityTotal;
    private List<CustomsProcedurePlacedType> customsProcedurePlacedList = new ArrayList<CustomsProcedurePlacedType>();
    private List<GoodsUsageType> otherGoodsUsingList = new ArrayList<GoodsUsageType>();

    /** 
     * Get the 'QuantityTotal' element value. ����������� �� ���������� ��� (����������). ����� 
     * 
     * @return value
     */
    public String getQuantityTotal() {
        return quantityTotal;
    }

    /** 
     * Set the 'QuantityTotal' element value. ����������� �� ���������� ��� (����������). ����� 
     * 
     * @param quantityTotal
     */
    public void setQuantityTotal(String quantityTotal) {
        this.quantityTotal = quantityTotal;
    }

    /** 
     * Get the list of 'CustomsProcedurePlaced' element items. �������� � ������� ���������� ��� ���������� ���������
     * 
     * @return list
     */
    public List<CustomsProcedurePlacedType> getCustomsProcedurePlacedList() {
        return customsProcedurePlacedList;
    }

    /** 
     * Set the list of 'CustomsProcedurePlaced' element items. �������� � ������� ���������� ��� ���������� ���������
     * 
     * @param list
     */
    public void setCustomsProcedurePlacedList(
            List<CustomsProcedurePlacedType> list) {
        customsProcedurePlacedList = list;
    }

    /** 
     * Get the list of 'OtherGoodsUsing' element items. �������� � �������, ������������ � ���� �����
     * 
     * @return list
     */
    public List<GoodsUsageType> getOtherGoodsUsingList() {
        return otherGoodsUsingList;
    }

    /** 
     * Set the list of 'OtherGoodsUsing' element items. �������� � �������, ������������ � ���� �����
     * 
     * @param list
     */
    public void setOtherGoodsUsingList(List<GoodsUsageType> list) {
        otherGoodsUsingList = list;
    }
}
