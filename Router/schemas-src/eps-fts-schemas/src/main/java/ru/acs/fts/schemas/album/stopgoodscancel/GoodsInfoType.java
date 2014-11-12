
package ru.acs.fts.schemas.album.stopgoodscancel;

import java.util.ArrayList;
import java.util.List;

/** 
 * Сведения о товаре
 */
public class GoodsInfoType
{
    private String goodsNumeric;
    private List<String> goodsDescriptionList = new ArrayList<String>();

    /** 
     * Get the 'GoodsNumeric' element value. Номер товара по ДТ
     * 
     * @return value
     */
    public String getGoodsNumeric() {
        return goodsNumeric;
    }

    /** 
     * Set the 'GoodsNumeric' element value. Номер товара по ДТ
     * 
     * @param goodsNumeric
     */
    public void setGoodsNumeric(String goodsNumeric) {
        this.goodsNumeric = goodsNumeric;
    }

    /** 
     * Get the list of 'GoodsDescriptions' element items. Описание товара
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescriptions' element items. Описание товара
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<String> list) {
        goodsDescriptionList = list;
    }
}
