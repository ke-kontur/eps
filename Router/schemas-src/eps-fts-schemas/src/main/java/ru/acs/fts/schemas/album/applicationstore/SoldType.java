
package ru.acs.fts.schemas.album.applicationstore;

import java.util.ArrayList;
import java.util.List;

/** 
 * Продаваемые припасы
 */
public class SoldType
{
    private String totalCost;
    private String currency;
    private String customsTotalCostGoods;
    private List<StrListGoodsType> soldGoodsList = new ArrayList<StrListGoodsType>();

    /** 
     * Get the 'TotalCost' element value. Общая стоимость продаваемых припасов.
     * 
     * @return value
     */
    public String getTotalCost() {
        return totalCost;
    }

    /** 
     * Set the 'TotalCost' element value. Общая стоимость продаваемых припасов.
     * 
     * @param totalCost
     */
    public void setTotalCost(String totalCost) {
        this.totalCost = totalCost;
    }

    /** 
     * Get the 'Currency' element value. Валюта 
     * 
     * @return value
     */
    public String getCurrency() {
        return currency;
    }

    /** 
     * Set the 'Currency' element value. Валюта 
     * 
     * @param currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /** 
     * Get the 'CustomsTotalCostGoods' element value. Общая таможенная стоимость
     * 
     * @return value
     */
    public String getCustomsTotalCostGoods() {
        return customsTotalCostGoods;
    }

    /** 
     * Set the 'CustomsTotalCostGoods' element value. Общая таможенная стоимость
     * 
     * @param customsTotalCostGoods
     */
    public void setCustomsTotalCostGoods(String customsTotalCostGoods) {
        this.customsTotalCostGoods = customsTotalCostGoods;
    }

    /** 
     * Get the list of 'SoldGoodsList' element items. Список продаваемых припасов
     * 
     * @return list
     */
    public List<StrListGoodsType> getSoldGoodsList() {
        return soldGoodsList;
    }

    /** 
     * Set the list of 'SoldGoodsList' element items. Список продаваемых припасов
     * 
     * @param list
     */
    public void setSoldGoodsList(List<StrListGoodsType> list) {
        soldGoodsList = list;
    }
}
