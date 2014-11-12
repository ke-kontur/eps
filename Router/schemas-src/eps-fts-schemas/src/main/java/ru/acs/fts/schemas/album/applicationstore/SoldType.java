
package ru.acs.fts.schemas.album.applicationstore;

import java.util.ArrayList;
import java.util.List;

/** 
 * ����������� �������
 */
public class SoldType
{
    private String totalCost;
    private String currency;
    private String customsTotalCostGoods;
    private List<StrListGoodsType> soldGoodsList = new ArrayList<StrListGoodsType>();

    /** 
     * Get the 'TotalCost' element value. ����� ��������� ����������� ��������.
     * 
     * @return value
     */
    public String getTotalCost() {
        return totalCost;
    }

    /** 
     * Set the 'TotalCost' element value. ����� ��������� ����������� ��������.
     * 
     * @param totalCost
     */
    public void setTotalCost(String totalCost) {
        this.totalCost = totalCost;
    }

    /** 
     * Get the 'Currency' element value. ������ 
     * 
     * @return value
     */
    public String getCurrency() {
        return currency;
    }

    /** 
     * Set the 'Currency' element value. ������ 
     * 
     * @param currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /** 
     * Get the 'CustomsTotalCostGoods' element value. ����� ���������� ���������
     * 
     * @return value
     */
    public String getCustomsTotalCostGoods() {
        return customsTotalCostGoods;
    }

    /** 
     * Set the 'CustomsTotalCostGoods' element value. ����� ���������� ���������
     * 
     * @param customsTotalCostGoods
     */
    public void setCustomsTotalCostGoods(String customsTotalCostGoods) {
        this.customsTotalCostGoods = customsTotalCostGoods;
    }

    /** 
     * Get the list of 'SoldGoodsList' element items. ������ ����������� ��������
     * 
     * @return list
     */
    public List<StrListGoodsType> getSoldGoodsList() {
        return soldGoodsList;
    }

    /** 
     * Set the list of 'SoldGoodsList' element items. ������ ����������� ��������
     * 
     * @param list
     */
    public void setSoldGoodsList(List<StrListGoodsType> list) {
        soldGoodsList = list;
    }
}
