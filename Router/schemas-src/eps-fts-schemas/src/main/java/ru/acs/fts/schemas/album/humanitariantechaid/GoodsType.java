
package ru.acs.fts.schemas.album.humanitariantechaid;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * Сведения о товарах/работах/услугах
 */
public class GoodsType
{
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private String cost;
    private String currency;
    private SupplementaryQuantityType goodsQuantity;
    private SupplementaryQuantityType weightQuantity;
    private SupplementaryQuantityType weightSupQuantity;

    /** 
     * Get the list of 'GoodsDescription' element items. Наименование товара/работы/услуги
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescription' element items. Наименование товара/работы/услуги
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<String> list) {
        goodsDescriptionList = list;
    }

    /** 
     * Get the 'Cost' element value. Стоимость
     * 
     * @return value
     */
    public String getCost() {
        return cost;
    }

    /** 
     * Set the 'Cost' element value. Стоимость
     * 
     * @param cost
     */
    public void setCost(String cost) {
        this.cost = cost;
    }

    /** 
     * Get the 'Currency' element value. Валюта стоимости
     * 
     * @return value
     */
    public String getCurrency() {
        return currency;
    }

    /** 
     * Set the 'Currency' element value. Валюта стоимости
     * 
     * @param currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /** 
     * Get the 'GoodsQuantity' element value. Количество
     * 
     * @return value
     */
    public SupplementaryQuantityType getGoodsQuantity() {
        return goodsQuantity;
    }

    /** 
     * Set the 'GoodsQuantity' element value. Количество
     * 
     * @param goodsQuantity
     */
    public void setGoodsQuantity(SupplementaryQuantityType goodsQuantity) {
        this.goodsQuantity = goodsQuantity;
    }

    /** 
     * Get the 'WeightQuantity' element value. Вес в основных единицах измерения
     * 
     * @return value
     */
    public SupplementaryQuantityType getWeightQuantity() {
        return weightQuantity;
    }

    /** 
     * Set the 'WeightQuantity' element value. Вес в основных единицах измерения
     * 
     * @param weightQuantity
     */
    public void setWeightQuantity(SupplementaryQuantityType weightQuantity) {
        this.weightQuantity = weightQuantity;
    }

    /** 
     * Get the 'WeightSupQuantity' element value. Вес в дополнительных единицах измерения
     * 
     * @return value
     */
    public SupplementaryQuantityType getWeightSupQuantity() {
        return weightSupQuantity;
    }

    /** 
     * Set the 'WeightSupQuantity' element value. Вес в дополнительных единицах измерения
     * 
     * @param weightSupQuantity
     */
    public void setWeightSupQuantity(SupplementaryQuantityType weightSupQuantity) {
        this.weightSupQuantity = weightSupQuantity;
    }
}
