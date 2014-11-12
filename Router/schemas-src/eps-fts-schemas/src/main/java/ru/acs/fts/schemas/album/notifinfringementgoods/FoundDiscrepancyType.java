
package ru.acs.fts.schemas.album.notifinfringementgoods;

import java.util.ArrayList;
import java.util.List;

/** 
 * Выявленное несоответствие прибывших товаров заявленным сведениям
 */
public class FoundDiscrepancyType
{
    private String goodsNumeric;
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private String comment;

    /** 
     * Get the 'GoodsNumeric' element value. Номер товара по ДТ/списку
     * 
     * @return value
     */
    public String getGoodsNumeric() {
        return goodsNumeric;
    }

    /** 
     * Set the 'GoodsNumeric' element value. Номер товара по ДТ/списку
     * 
     * @param goodsNumeric
     */
    public void setGoodsNumeric(String goodsNumeric) {
        this.goodsNumeric = goodsNumeric;
    }

    /** 
     * Get the list of 'GoodsDescription' element items. Наименование и характеристика товара
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescription' element items. Наименование и характеристика товара
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<String> list) {
        goodsDescriptionList = list;
    }

    /** 
     * Get the 'Comment' element value. Описание расхождения
     * 
     * @return value
     */
    public String getComment() {
        return comment;
    }

    /** 
     * Set the 'Comment' element value. Описание расхождения
     * 
     * @param comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }
}
