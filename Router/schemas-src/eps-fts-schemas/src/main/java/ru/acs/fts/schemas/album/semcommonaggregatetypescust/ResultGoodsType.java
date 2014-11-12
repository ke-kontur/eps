
package ru.acs.fts.schemas.album.semcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * Информация о товарах
 */
public class ResultGoodsType
{
    private String goodsDescription;
    private String goodsNumeric;
    private List<MarkUpType> goodsDescriptionMarkupList = new ArrayList<MarkUpType>();

    /** 
     * Get the 'GoodsDescription' element value. Текстовое описание товара
     * 
     * @return value
     */
    public String getGoodsDescription() {
        return goodsDescription;
    }

    /** 
     * Set the 'GoodsDescription' element value. Текстовое описание товара
     * 
     * @param goodsDescription
     */
    public void setGoodsDescription(String goodsDescription) {
        this.goodsDescription = goodsDescription;
    }

    /** 
     * Get the 'GoodsNumeric' element value. Порядковый номер декларируемого товара
     * 
     * @return value
     */
    public String getGoodsNumeric() {
        return goodsNumeric;
    }

    /** 
     * Set the 'GoodsNumeric' element value. Порядковый номер декларируемого товара
     * 
     * @param goodsNumeric
     */
    public void setGoodsNumeric(String goodsNumeric) {
        this.goodsNumeric = goodsNumeric;
    }

    /** 
     * Get the list of 'GoodsDescriptionMarkup' element items. Размеченное текстовое описание товара
     * 
     * @return list
     */
    public List<MarkUpType> getGoodsDescriptionMarkupList() {
        return goodsDescriptionMarkupList;
    }

    /** 
     * Set the list of 'GoodsDescriptionMarkup' element items. Размеченное текстовое описание товара
     * 
     * @param list
     */
    public void setGoodsDescriptionMarkupList(List<MarkUpType> list) {
        goodsDescriptionMarkupList = list;
    }
}
