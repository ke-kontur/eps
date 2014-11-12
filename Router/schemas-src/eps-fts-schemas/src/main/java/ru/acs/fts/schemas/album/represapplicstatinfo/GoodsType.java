
package ru.acs.fts.schemas.album.represapplicstatinfo;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;

/** 
 * Сведения о товарах
 */
public class GoodsType
{
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private String grossWeight;
    private String goodsCostEuro;
    private LocalDate goodsDate;

    /** 
     * Get the list of 'GoodsDescription' element items. Наименование товара
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescription' element items. Наименование товара
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<String> list) {
        goodsDescriptionList = list;
    }

    /** 
     * Get the 'GrossWeight' element value. Вес товара, брутто, кг
     * 
     * @return value
     */
    public String getGrossWeight() {
        return grossWeight;
    }

    /** 
     * Set the 'GrossWeight' element value. Вес товара, брутто, кг
     * 
     * @param grossWeight
     */
    public void setGrossWeight(String grossWeight) {
        this.grossWeight = grossWeight;
    }

    /** 
     * Get the 'GoodsCostEuro' element value. Стоимость товара в евро
     * 
     * @return value
     */
    public String getGoodsCostEuro() {
        return goodsCostEuro;
    }

    /** 
     * Set the 'GoodsCostEuro' element value. Стоимость товара в евро
     * 
     * @param goodsCostEuro
     */
    public void setGoodsCostEuro(String goodsCostEuro) {
        this.goodsCostEuro = goodsCostEuro;
    }

    /** 
     * Get the 'GoodsDate' element value. Дата поставки товара
     * 
     * @return value
     */
    public LocalDate getGoodsDate() {
        return goodsDate;
    }

    /** 
     * Set the 'GoodsDate' element value. Дата поставки товара
     * 
     * @param goodsDate
     */
    public void setGoodsDate(LocalDate goodsDate) {
        this.goodsDate = goodsDate;
    }
}
