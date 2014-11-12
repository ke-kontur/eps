
package ru.acs.fts.schemas.album.airshoppingwaybill;

import java.util.ArrayList;
import java.util.List;

/** 
 * Продаваемые товары
 */
public class SoldGoodsType
{
    private String allUnitGoods;
    private String totalCostGoods;
    private String totalCostSoldGoods;
    private String currencyCode;
    private List<GoodsListType> goodsList = new ArrayList<GoodsListType>();

    /** 
     * Get the 'AllUnitGoods' element value. Всего единиц товара
     * 
     * @return value
     */
    public String getAllUnitGoods() {
        return allUnitGoods;
    }

    /** 
     * Set the 'AllUnitGoods' element value. Всего единиц товара
     * 
     * @param allUnitGoods
     */
    public void setAllUnitGoods(String allUnitGoods) {
        this.allUnitGoods = allUnitGoods;
    }

    /** 
     * Get the 'TotalCostGoods' element value. Общая стоимость продаваемых товаров
     * 
     * @return value
     */
    public String getTotalCostGoods() {
        return totalCostGoods;
    }

    /** 
     * Set the 'TotalCostGoods' element value. Общая стоимость продаваемых товаров
     * 
     * @param totalCostGoods
     */
    public void setTotalCostGoods(String totalCostGoods) {
        this.totalCostGoods = totalCostGoods;
    }

    /** 
     * Get the 'TotalCostSoldGoods' element value. Сумма проданного товара
     * 
     * @return value
     */
    public String getTotalCostSoldGoods() {
        return totalCostSoldGoods;
    }

    /** 
     * Set the 'TotalCostSoldGoods' element value. Сумма проданного товара
     * 
     * @param totalCostSoldGoods
     */
    public void setTotalCostSoldGoods(String totalCostSoldGoods) {
        this.totalCostSoldGoods = totalCostSoldGoods;
    }

    /** 
     * Get the 'CurrencyCode' element value. Код валюты
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. Код валюты
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the list of 'GoodsList' element items. Список товаров
     * 
     * @return list
     */
    public List<GoodsListType> getGoodsList() {
        return goodsList;
    }

    /** 
     * Set the list of 'GoodsList' element items. Список товаров
     * 
     * @param list
     */
    public void setGoodsList(List<GoodsListType> list) {
        goodsList = list;
    }
}
